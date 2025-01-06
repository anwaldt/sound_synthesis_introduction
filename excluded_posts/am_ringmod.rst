.. title: AM and Ringmod
.. slug: am_and_ringmod
.. date: 2020-03-23 22:40:22 UTC
.. tags: 
.. category: sound_synthesis:modulation
.. link: 
.. description: 
.. type: text
.. has_math: true
.. nocomments: True

Amplitude Modulation
====================

:math:`y[n] = x[n] \cdot m[n]`

:math:`y[n] = \sin\left(2 \pi f_1 \frac{n}{f_s}\right) \cdot \left( 1+ \sin\left[2 \pi f_m \frac{n}{f_s}\right]\right)`

.. code:: ipython3

    # import all relevant packages
    
    %matplotlib inline
    import mpld3
    mpld3.enable_notebook()
    
    from scipy import signal
    import numpy as np
    
    
    import control
    
    import matplotlib
    import matplotlib.pyplot as plt
    plt.rcParams['figure.dpi']= 200
    
    from matplotlib import animation, rc
    from IPython.display import HTML
    
    from IPython.display import (
        Audio, display, clear_output)
    
    from IPython.display import Image
    from IPython.core.display import HTML 
    
    from ipywidgets import widgets, HBox, VBox
    from functools import partial
    
    from ipywidgets import IntSlider, Button, Layout


.. code:: ipython3

    fs = 48000
    N  = 48000
    
    t  = np.linspace(0,1,N)
    
    f1 = 500
    fm = 10
    
    x = np.sin(2*np.pi*f1*t)
    m = 1 + np.sin(2*np.pi*fm*t)
    
    y = x*m
    
    
    s1 = widgets.FloatSlider(
        value = 100,
        min   = 10,
        max   = 10000.0,
        step        = 0.1,
        description ='$f_1$:',
        disabled=False,
        continuous_update=False,
        orientation='horizontal',
        readout=True,
        readout_format='.1f')
        
    s1.set    
    s2 = widgets.FloatSlider(
        value = 100,
        min   = 10,
        max   = 10000.0,
        step        = 0.1,
        description ='$f_2$:',
        disabled=False,
        continuous_update=False,
        orientation='horizontal',
        readout=True,
        readout_format='.1f')
    
    
    b = Button(description='(50% width, 80px height) button',
               layout=Layout(width='50%', height='80px'));
    
    Button(description='Another button with the same layout', layout=b.layout)
    
    
    left_box = VBox([ 
        s1,
        s2 
    ])
    
    HBox([left_box])


::


    ---------------------------------------------------------------------------

    AttributeError                            Traceback (most recent call last)

    <ipython-input-7-cdc91f5ac7b3> in <module>
         25     readout_format='.1f')
         26 
    ---> 27 s1.set
         28 s2 = widgets.FloatSlider(
         29     value = 100,


    AttributeError: 'FloatSlider' object has no attribute 'set'


Listen to the Result
====================


.. code:: ipython3

    fig, ax = plt.subplots()
    line,   = ax.plot([], [], lw=2)
    #line.set_data([], [])
    ax.set_xlim(0,0.02)
    
    def animate(i):
        line.set_data(t[0:1000], x[i:i+1000]);
        return (line,)
     
    
    anim = animation.FuncAnimation(fig, animate,
                                   frames=100, interval=10, 
                                   blit=True, repeat=False);
    
    display(Audio(y, rate=fs, autoplay=False))
    
    HTML(anim.to_html5_video())
    
    


Spectrum
--------

:math:`Y = DFT(y)`

.. raw:: latex

   \begin{align}
   Y[k] = & \sum_{n=0}^{N-1} y[n] \cdot e^{-j 2 \pi k \frac{n}{N}} \\
        %
        = & \sum_{n=0}^{N-1} y[n] \cdot e^{-j 2 \pi k \frac{n}{N}} \\
        %
        = & \sum_{n=0}^{N-1} \sin\left(2 \pi f_1 \frac{n}{f_s}\right) \cdot \left( 1+ \sin\left[2 \pi f_m \frac{n}{f_s}\right]\right)   \cdot e^{-j 2 \pi k \frac{n}{N}} \\
        %
   = & \sum_{n=0}^{N-1} \left( \sin\left(2 \pi f_1 \frac{n}{f_s}\right) + 0.5 \left( \cos\left(2 \pi (f_1 - f_m)\frac{n}{f_s}\right)  - \cos\left(2 \pi (f_1 + f_m)\frac{n}{f_s}\right)  \right) \right)  \cdot e^{-j 2 \pi k \frac{n}{N}} \\
   %
   = & \delta[f_1] + 0.5 \delta[f_1 - f_m] + 0.5 \ \delta[f_1 + f_m] \\
   \end{align}

.. code:: ipython3

    Y = abs(np.fft.fft(y))
    Y = np.fft.fftshift(Y)
    
    f = np.linspace(-fs/2,fs/2,len(Y))
    
    plt.plot(f,Y);
    plt.xlabel('f / Hz')
    plt.ylabel('|Y|')

Ring Modulation
===============

The formula for AM and ringmodluation are identical:

:math:`y[n] = x[n] \cdot m[n]`

However, the modulation signal is zero-mean, respectively symmetric in
ring modulation:

:math:`y[n] = \sin\left(2 \pi f_1 \frac{n}{f_s}\right) \cdot \sin\left(2 \pi f_m \frac{n}{f_s}\right)`

.. code:: ipython3

    m = np.sin(2*np.pi*fm*t)
    
    y = x*m
