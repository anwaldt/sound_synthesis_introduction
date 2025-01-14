.. title: Additive & Spectral: Partial Tracking
.. slug: additive-spectral-partial-tracking
.. date: 2020-05-05 18:31:44 UTC
.. tags:
.. category: _sound_synthesis:spectral
.. link:
.. description:
.. type: text
.. priority: 6


Partial tracking is the process of detecting single sinusoidal components in a signal and obtaining
their individual amplitude, frequency and phase trajectories.



Monophonic Partial Tracking
---------------------------

- STFT
    - A short term Fourier transform segments a signal into frames of equal length.


- Fundamental Frequency Estimation
    - YIN (de Cheveigné et al, 2002)
    - Swipe (Camacho, 2007)


- Peak Detection
    - For every STFT frame, local maxima are calculated in the range of integer multiples of the fundamental frequency.


.. figure:: /images/Sound_Synthesis/spectral_analysis/amplitudes.png
  :width: 60%
  :figwidth: 100%
  :align: center

  *Trajectories of partial amplitudes for a violin sound.*


.. figure:: /images/Sound_Synthesis/spectral_analysis/frequencies.png
  :width: 60%
  :figwidth: 100%
  :align: center

  *Trajectories of partial frequencies for a violin sound.*



.. figure:: /images/Sound_Synthesis/spectral_analysis/phases.png
  :width: 60%
  :figwidth: 100%
  :align: center

  *Trajectories of unwrapped partial phases for a violin sound.*
