.. title: Subtractive: Introduction
.. slug: subtractive-introduction
.. date: 2020-05-17 08:39:35 UTC
.. tags:
.. category: _sound_synthesis:subtractive
.. link:
.. description:
.. type: text

Subtractive synthesis is probably the most famous
and most popular method of  sound synthesis.
The basic idea is to generate spectra with rich spectral content which are then shaped afterwards by filters.
Although the possibilities of subtractive synthesis are quasi-unlimited,
especially when combined with other methods, the
principle can be exlpained with three groups of functional units:

**Generators**

- Oscillators
- Noise Generators
- ...

**Modulators**

- LFO (Low Frequency Oscillators)
- Envelopes (ADSR)
- ...

**Manipulators**

- Filters (VFC)
- Attenuators (VCA)
- ...


[Fig.1]_ gives an overview how these functional units
are arranged in a subtractive synthesizer.
Modulators and generators overlap, since they are interchangeable
in many aspects.


-----

.. figure:: /images/Sound_Synthesis/subtractive/subtractive-figure0.png
    :width: 400

.. [Fig.1] Functional units in subtractive synthesis.


-----

The following interactive example implements a simple chain of VCO->VCF->VCA:

.. raw:: html
   :file: /media/anwaldt/ANWALDT_2TB/WORK/TEACHING/Sound_Synthesis_Introduction/webaudio/subtractive.html


-----

Like with all methods for sound synthesis,
the dynamic change of timbre is an essential target
for generating the desired sounds.
[Fig.2]_ shows a more specific signal flow which is a typical
subtractive synth patch for generating lead or bass sounds.

- A VCO is manipulated by a VCF and then attenuated by a VCA.
- The VCO has a sawtooth waveform.
- The cutoff frequency of the VCF and the amplitude of the VCA
  are controlled with individual envelopes.
- If ENV2 has a faster decay than ENV1, the resulting sound is the typical *thump*.


-----

.. figure:: /images/Sound_Synthesis/subtractive/subtractive-figure1.png
    :width: 400

.. [Fig.2] Subtractive patch for bass and lead synths, as used in the Faust example.
