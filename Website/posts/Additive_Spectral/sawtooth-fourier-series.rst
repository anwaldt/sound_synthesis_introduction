.. title: Fourier Series: Sawtooth
.. slug: sawtooth-fourier-series
.. date: 2020-05-02 10:20:31 UTC
.. tags:
.. category: _sound_synthesis:spectral
.. link:
.. description:
.. type: text
.. has_math: true
.. priority: 2

Formula
-------

The sawtooth is an asymmetric waveform with a sharp timbre. The related Fourier series is described by the following characteristics:

- odd and even harmonics
- alternating sign
- slow decrease towards higher partials

:math:`X(t) = \frac{2}{\pi} \sum\limits_{k=1}^{N} (-1)^i \frac{\sin(2 \pi i f\ t)}{i}`

----

Interactive Example
-------------------

.. raw:: html
  :file: /media/anwaldt/ANWALDT_2TB/WORK/TEACHING/Sound_Synthesis_Introduction/webaudio/additive_sawtooth.html

In contrast to the triangular wave, the interactive example shows the occurrence of ripples at the steep edges of the waveform. The higher the number of partials, the denser the ripples. This is referred to as the Gibbs phenomenon.
