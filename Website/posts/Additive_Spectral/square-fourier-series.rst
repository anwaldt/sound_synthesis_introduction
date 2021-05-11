.. title: Fourier Series: Square Wave
.. slug: fourier-series-square
.. date: 2020-05-02 10:20:31 UTC
.. tags:
.. category: _sound_synthesis:spectral
.. link:
.. description:
.. type: text
.. has_math: true


Formula
-------

The square wave has a slightly faster decay towards higher partials. It can be found in spectra of wind instruments.

-  only odd harmonics
-  constant sign

:math:`X(t) = \frac{4}{\pi} \sum\limits_{i=0}^{N} \frac{\sin(2 \pi (2i+1)ft)}{(2i + 1)}`

----

Interactive Example
-------------------

.. raw:: html
  :file: /media/anwaldt/ANWALDT_2TB/WORK/TEACHING/Sound_Synthesis_Introduction/webaudio/additive_square.html


Like the sawtooth, the square wave shows the occurrence of ripples at the steep edges of the waveform. The higher the number of partials, the denser the ripples. This is referred to as the Gibbs phenomenon.
