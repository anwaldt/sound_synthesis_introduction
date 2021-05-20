.. title: Additive & Spectral: Introduction
.. slug: spectral-history
.. date: 2020-05-02 09:39:13 UTC
.. tags:
.. category: _sound_synthesis:spectral
.. link:
.. description:
.. type: text
.. has_math: true
.. priority: 1



The sine wave can be considered the atomic unit of timbre and thus of musical sounds.
Additive synthesis and related approaches build musical sounds from scratch, using these integral components. When a sound is composed of several sinusoids, they are referred to as *partials*, regardless of their properties. Partials which are integer multiples of a fundamental frequency are called *harmonics* or *overtones*, when related to the first harmonic.


==============
Fourier Series
==============

According to the Fourier theorem, any periodic signal can be represented by an infinite sum of sinusoids with individual

-  amplitude :math:`a_i`
-  frequency :math:`f_i`
-  phase :math:`\varphi_i`

:math:`\displaystyle y = \sum\limits_{i=1}^{\infty} a_i \ sin(2 \pi f_i \ t +\varphi_i )`


When applying this principle to musical sounds,
a simplified model can be used to generate basic timbres.
All sinusoidal components become integer multiples of
a fundamental freuquency :math:`f_0`, so called harmonics,
with a maximum number of partials :math:`N_{part}`.
In an even further reduced model, the phases of the partials
can be ignored:

:math:`\displaystyle y (t) = \sum\limits_{n=1}^{N_{part}} a_n(t) \ sin(2 \ \pi \ n \ f_0 (t)  \ t)`



---

As following sections on spectral modeling show, a more advanced model is needed
to synthesize musical sounds which are indistinguishable from the original.
This includes the partials' phase, inharmonicities as deviations from
exact integer multiples, noise components and transients.
However, depending of the number of partials and the
driving function for their parameters, this limited
formula can generate convincing  harmonic sounds.

-----

===============
A Brief History
===============

Early Mechanical
================


Early use of the Fourier representation, respectively additive
synthesis, for modeling musical
sounds has been made by Hermann von Helmholtz.
He built mechanical devices, based on tuning forks,
resonant tubes and electromagnetic excitation
for additive synthesis.
Von Helmholtz used these devices for investigating various
aspects of harmonic sounds, including spectral distribution and
relative phases.

.. figure:: /images/Sound_Synthesis/helmholtz_fork.jpg
	       :width: 600

	       *Tuning forks with resonant tubes (von Helmholtz, 1870, p.183).*


-----



Early Analog
============


The history of *Elektronische Musik* started with
additive synthesis. In his composition *Studie II*,
Karlheinz Stockhausen composed timbres by superimposing
sinusoidal components.
In that era this was realized through single sine wave
oscillators, tuned to the desired frequency and recorded on tape.

*Studie II* is the attempt to fully compose
music on a timbral level  in a rigid score.
Stockhausen therefor generated tables with frequencies
and mixed tones for creating source material.
[Fig.1]_ shows an excerpt from the timeline,
which was used to arrange the material.
The timbres are recognizable through their
vertical position in the upper system, whereas
the lower system represents articulation,
respectively fades and amplitudes.



.. figure:: /images/Sound_Synthesis/studie4.jpg
	    :width: 600
.. [Fig.1] *From the score of Studie II.*


.. youtube:: Yc_FfWnttGw
	     :width: 600


-----




Early Digital
=============

**Max Mathews**

As mentioned in
`Introduction II </Sound_Synthesis/Intro_II/synthesis-algorithms-overwiew-1>`_,
Max Mathews used additive synthesis to generate the first
digitally synthesized pieces of music in the 1950s.
In the early 1960s, Mathews had advanced the method to synthesize
dynamic timbres, as in *Bycicle Built for Two*:


.. youtube:: 41U78QP8nBk
	     :width: 600


-----

**Iannis Xenakis**

In his Electroacoustic compositions, Iannis Xenakis made use of the UPIC system
for additive synthesis (Di Scipio, 1998), as for example is Mycenae-Alpha (1977):

.. youtube:: yztoaNakKok
	     :width: 600



-----

References
----------


.. publication_list:: bibtex/spectral_intro.bib
	   :style: unsrt
