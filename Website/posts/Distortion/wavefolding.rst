.. title: Wavefolding
.. slug: wavefolding
.. date: 2020-12-01 13:49:54 UTC
.. tags:
.. category: _sound_synthesis:distortion
.. link:
.. description:
.. type: text
.. has_math: true


Wavefolding is a special case of waveshaping, working with periodic transfer functions. Depending on the pre-gain, the source signal gets *folded* back, one a maximum of the transfer function is reached. Compared to the previously introduced soft clipping or other methods of waveshaping, this adds many strong harmonics.

----

Transfer Function
-----------------

.. raw:: html
   :file: /media/anwaldt/ANWALDT_2TB/WORK/TEACHING/Sound_Synthesis_Introduction/Jupyter/wavefolder.html


-----

Interactive Example
-------------------

The following example calculates the spectrum of a sinusoidal function, folded with a sinusoidal transfer function:


.. raw:: html
   :file: /media/anwaldt/ANWALDT_2TB/WORK/TEACHING/Sound_Synthesis_Introduction/webaudio/wavefolder.html
