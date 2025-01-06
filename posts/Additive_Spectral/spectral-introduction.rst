.. title: Additive & Spectral: Introduction
.. slug: spectral-intr
.. date: 2020-05-02 09:39:13 UTC
.. tags:
.. category: _sound_synthesis:spectral
.. link:
.. description:
.. type: text
.. has_math: true
.. priority: 0


The sine wave can be considered the atomic unit of timbre and thus of musical sounds.
Additive synthesis and related approaches build musical sounds from scratch, using these integral components. When a sound is composed of several sinusoids, they are referred to as *partials*, regardless of their properties. Partials which are integer multiples of a fundamental frequency are called *harmonics* or *overtones*, when related to the first harmonic.


==============
Fourier Series
==============

According to the Fourier theorem, any periodic signal can be represented by an infinite sum of sinusoids with individual

-  amplitude :math:`a_i`
-  frequency :math:`f_i`
-  phase :math:`\varphi_i`

.. math::

	\displaystyle y = \sum\limits_{i=1}^{\infty} a_i \ sin(2 \pi f_i \ t +\varphi_i )


When applying this principle to musical sounds,
a simplified model can be used to generate basic timbres.
All sinusoidal components become integer multiples of
a fundamental frequency :math:`f_0`, so called harmonics,
with a maximum number of partials :math:`N_{part}`.
In an even further reduced model, the phases of the partials
can be ignored:

.. math::

	\displaystyle y (t) = \sum\limits_{n=1}^{N_{part}} a_n(t) \ sin(2 \ \pi \ n \ f_0 (t)  \ t)



-----

As following sections on spectral modeling show, a more advanced model is needed
to synthesize musical sounds which are indistinguishable from the original.
This includes the partials' phase, inharmonicities as deviations from
exact integer multiples, noise components and transients.
However, depending of the number of partials and the
driving function for their parameters, this limited
formula can generate convincing  harmonic sounds.

-----

References
----------


.. publication_list:: bibtex/spectral_intro.bib
	   :style: unsrt
