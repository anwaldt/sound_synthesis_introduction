.. title: Additive & Spectral: Spectral Modeling
.. slug: spectral-modeling
.. date: 2020-05-04 12:47:28 UTC
.. tags:
.. category: _sound_synthesis:spectral
.. link:
.. description:
.. type: text
.. has_math: true
.. priority: 5

McAulay/Quatieri
================

Sinusoidal modeling can be considered a higher level algorithm for the additive synthesis of harmonic sounds.
It has first been used in speech processing by McAulay, R. and Quatieri (1986).
For low framerates they proposed
a time-domain method for partial synthesis with
original phases of the partials.

.. figure:: /images/Sound_Synthesis/spectral_modeling/quatieri_system.jpg
	:width: 600px
	:figwidth: 100%
	:align: center

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

.. math::

	x = x_{DET} + x_{STO}


.. figure:: /images/Sound_Synthesis/spectral_modeling/sines_plus_noise_block.jpg
	:width: 600px
	:figwidth: 100%
	:align: center

	*Deterministic + Stochastic model (Serra and Smith, 1990)*



Violin Example
--------------


The following example shows the sines + noise decomposition for a single violin sound.
The original recording was made in an anechoic chamber:

.. raw:: html

	<center>
	<audio controls preload="none">
		<source src="/audio/sound-synthesis/spectral/SampLib_BuK_04.mp3" type="audio/wav">
	</audio>
	</center>

After partial tracking, the deterministic component can be re-synthesized using an oscillator bank.
It features the strings oscillation, in this case with original phases.
For a bowed string instrument like the violin, the deterministic model alone can
deliver plausible results:

.. raw:: html

	<center>
	<audio controls preload="none">
		<source src="/audio/sound-synthesis/spectral/TONAL_BuK_04.mp3" type="audio/wav">
	</audio>
	</center>

The residual signal still carries some parts of the deterministic part, when
calculated with simple subtraction. Most of the residual's energy is caused by
the bow friction:

.. raw:: html

	<center>
	<audio controls preload="none">
		<source src="/audio/sound-synthesis/spectral/NOISE_BuK_04.mp3" type="audio/wav">
	</audio>
	</center>


-----

Sines + Transients + Noise
==========================

Even the harmonic and noise model
can not capture all components of musical sounds.
The third - and in this line last - signal component
to be included are the transients.



.. figure:: /images/Sound_Synthesis/spectral_modeling/sin-trans-noise.png
	:width: 600px
	:figwidth: 100%
	:align: center

	*Sines + Transients + Noise (Levine and Smith, 1998)*


-----

References
==========

.. publication_list:: bibtex/synthesis_spectral.bib
	   :style: unsrt
