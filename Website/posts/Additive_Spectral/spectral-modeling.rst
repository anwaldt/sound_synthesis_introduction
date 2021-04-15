.. title: Additive & Spectral: Spectral Modeling
.. slug: spectral-modeling
.. date: 2020-05-04 12:47:28 UTC
.. tags: 
.. category: _sound_synthesis:spectral
.. link: 
.. description: 
.. type: text
.. has_math: true

McAulay/Quatieri
================

Sinusoidal modeling can be conisdered a higher level algorithm
for the additive synthesis of harmonic sounds.
It has first been used in speech processing by
McAulay, R. and Quatieri (1986).
For low framerates they proposed
a time-domain method for partial synthesis with
original phases of the partials.

.. figure:: /images/Sound_Synthesis/spectral_modeling/quatieri_system.jpg
	   :width: 600
		   
*R. McAulay and T. Quatieri (1986)*

-----

SMS
===

The above presented sinusoidal modeling approach
captures only the harmonic portion of  a sound.
With the *Sinusoids plus Noise* model (SMS),
Serra and Smith (1990) introduced the *Deterministic + Stochastic*
model for spectral modeling, in order to model
components in the signal which are not captured
by partial tracking.
A sound is therefor modeled as a combination
of a dererministic component - the sinusoids -
and a stochasctic component:

:math:`x = x_{DET} + x_{STO}`

.. figure:: /images/Sound_Synthesis/spectral_modeling/quatieri_system.jpg
	   :width: 600
		   
*Deterministic + Stochastic model (Serra and Smith, 1990)*




Sines + Transients + Noise
==========================

Even the harmonic and noise model
can not capture all components of musical sounds.
The third - and in this line last - signal component
to be included are the transients.



.. figure:: /images/Sound_Synthesis/spectral_modeling/sin-trans-noise.png
	   :width: 600
		   
*Sines + Transients + Noise (Levine and Smith, 1998)*


-----

.. publication_list:: bibtex/synthesis_spectral.bib
	   :style: unsrt


		   
