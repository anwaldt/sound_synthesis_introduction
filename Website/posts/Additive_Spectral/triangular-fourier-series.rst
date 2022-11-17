.. title: Fourier Series: Triangular
.. slug: triangular-fourier-series
.. date: 2020-05-02 10:20:31 UTC
.. tags:
.. category: _sound_synthesis:spectral
.. link:
.. description:
.. type: text
.. has_math: true
.. priority: 3

Formula
-------

The triangular wave is a symmetric waveform with a stronger decrease towards higher partials than square wave or sawtooth. Its Fourier series has the following characteristics:

- only odd harmonics
- altering sign
-  (squared)

.. math::

  \displaystyle X(t) = \frac{8}{\pi^2} \sum\limits_{i=0}^{N} (-1)^{(i)} \frac{\sin(2 \pi (2i +1) f\ t)}{(2i +1)^2}

-----

Interactive Example
-------------------

.. raw:: html
  :file: ../Sound_Synthesis_Introduction/webaudio/additive_triangular.html
