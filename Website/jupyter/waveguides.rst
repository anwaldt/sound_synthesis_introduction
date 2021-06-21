.. code:: ipython3

    import numpy as np
    from   numpy import linspace, sin, zeros
    from   math import pi
    %matplotlib notebook
    import matplotlib.pyplot as plt
    from   tikzplotlib import save as tikz_save
    
    from   IPython.display import display, Markdown, clear_output
    import IPython.display as ipd
    import ipywidgets as widgets
    from   ipywidgets import *
    
    
    
    fs          = 48000
    
    ###################################################################
    # function for plucking the string
    
    def pluck(L,P):
        
        x_L = np.zeros(L);
        x_R = np.zeros(L);
        
        x_L[1:P] = np.linspace(0,1,P-1)
        x_R[1:P] = np.linspace(0,1,P-1)
        
        x_L[P:L-1] = np.linspace(1,0,L-P-1)
        x_R[P:L-1] = np.linspace(1,0,L-P-1)
        
        return x_L, x_R
    
    ###################################################################
    # function: - get the next output sample
    #           - shift all buffers
    
    def next_step(x_L, x_R, filt, g, pick):
        
        # delay line outputs
        l_out = x_L[0]
        r_out = x_R[len(x_R)-1]    
        
        # filter output
        f_out = sum(filt)/len(filt)
        
        # shift all arrays
        x_L   = np.roll(x_L,-1)
        x_R   = np.roll(x_R,1)    
        filt  = np.roll(filt,1)    
        
        # insert output values
        x_L[len(x_L)-1] = -f_out
        x_R[0]          = -l_out * g
        filt[0]         = r_out
        
        out =  x_L[pick] + x_L[pick]
        
        return x_L, x_R, filt, out
    
    
    ###################################################################
    
    # length of the delay line:
    L = 300
    # feedback gain:
    g = 0.95
    # pluck position:
    pluck_pos = 3
    # pickup position:
    pick = 5
    # filter length:
    N = 20
    
        
    ###################################################################
    # the update function offers control over all parameters
    # - wait for the process to be finished
    # - it can take a couple of seconds until the new sound is ready
        
    def update(L     = widgets.IntSlider(min = 100, max= 500, step=1, value=300, continuous_update=False),
               g     = widgets.FloatSlider(min = 0.5, max= 1, step=0.01, value=0.95, continuous_update=False),
               pluck_pos = widgets.IntSlider(min = 0, max= 99, step=1, value=3, continuous_update=False),
               pick_pos  = widgets.IntSlider(min = 0, max= 99, step=1, value=5, continuous_update=False),
               N     = widgets.IntSlider(min = 1, max= 50, step=1, value=20, continuous_update=False)):          
        
        x_L, x_R = pluck(L,pluck_pos)
    
        y = np.array([])
    
        # the filter is a simple moving average
        filt = np.zeros(N)
    
        for idx in range(2*fs):
    
            x_L, x_R, filt, out = next_step(x_L, x_R, filt, g, pick_pos)
            y = np.append(y,out)
     
        ipd.display(ipd.Audio(y, rate=fs))
    
    interact(update); 




.. parsed-literal::

    interactive(children=(IntSlider(value=300, continuous_update=False, description='L', max=500, min=100), FloatS…


