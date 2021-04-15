.. title: FM Synthesis: Formula & Spectra
.. slug: fm-synthesis-formula-spectra
.. date: 2020-05-11 12:06:11 UTC
.. tags:
.. category: _sound_synthesis:fm-synthesis
.. link:
.. description:
.. type: text
.. has_math: true


FM Formula
----------

Frequency modulation with two sinusoidal oscillators can be written as
follows:

:math:`x(t) = A \sin(\omega_\alpha t + I \sin(\omega_\beta t) )`

Modulation Index:

:math:`I = \frac{\Delta f}{\Delta f_m}`

Spectrum of Frequency Modulation
--------------------------------

Compared to amplitude modulation techniques, FM generates more spectral
components, which can be illustrated when calculating the Fourier
transform of the FM formula. It is solved using trigonometric
identities:

:math:`x(t) = \cos(\omega_\alpha t + I \sin(\omega_\beta t) )`

-  :math:`\text{with:} \cos(a+b) = \cos(a) \cos(b) - \sin(a) \sin(b)`

:math:`= \cos(\omega_\alpha t) \cos(I \sin(\omega_\beta t)) - \sin(\omega_\alpha t) \sin(I \sin(\omega_\beta t))`

-  :math:`\text{with:} \cos(a) \cos(b) = \frac{1}{2} \left( \cos(a-b) + \cos(a+b) \right)`

-  :math:`\text{and:} \sin(a) \sin(b) = \frac{1}{2} \left( \cos(a-b) - \cos(a+b) \right)`

:math:`= \frac{1}{2} ( \sin(\omega_\alpha t + I \sin(\omega_\alpha t)) + \sin(\omega_\alpha t - I \sin(\omega_\alpha t)) + \sin(\omega_\alpha t + I \sin(\omega_\alpha t)) + \sin( I \sin(\omega_\alpha t) - \omega_\alpha t) )`

**Bessel functions**

The above equation can be expressed as a Bessel function:

:math:`\sin(\omega_\alpha t + I \sin(\omega_\alpha t)) =`

:math:`J_0(I) \cos(\omega_\alpha)`

:math:`+ J_1(I) \cos(\omega_\alpha - \omega_\beta)t - \cos(\omega_\alpha + \omega_\beta)t`

:math:`- J_2(I) \cos(\omega_\alpha - 2 \omega_\beta)t + \cos(\omega_\alpha + 2 \omega_\beta)t`

:math:`+ ...`

The spectrum of FM signals thus has an infinite number of sidebands
which are increased in energy for high modulation indices.

Harmonic vs Inharmonic
----------------------

Depending on the ratio between modulator and carrier, the FM spectrum
has different properties. In the formula for the FM sidebands is is
obvious that for integer ratios between carrier to modulator, all
sidebands are integer multiples of the fundamental frequency.
-----


Interactive Example
-------------------

.. raw:: html
   :file: /media/anwaldt/ANWALDT_2TB/WORK/TEACHING/Sound_Synthesis_Introduction/webaudio/fm_synthesis.html
