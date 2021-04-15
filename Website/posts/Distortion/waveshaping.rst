.. title: Waveshaping
.. slug: waveshaping
.. date: 2020-12-01 13:29:54 UTC
.. tags:
.. category: _sound_synthesis:distortion
.. link:
.. description:
.. type: text
.. has_math: true
.. hidetitle: true

Waveshaping
===========

Waveshaping
===========

In contrast to subtractive synthesis, where timbre is controlled by removing selected content from rich spectra, distortion methods shape the sound by adding overtones with different principles. Quasi parallel to Bob Moog, Don Buchla invented his own system of analog sound synthesis in the 1960s, based on distortion, modulation and additive principles.

----

Transfer Function
-----------------

Waveshaping is one of the basic ways of distortion synthesis. In its simplest form it works like any overdrive effect by limiting a signal with a non-linear transfer function. Depending on the implementation, these transfer
functions can have any shape. The following example shows a simple tangential shaping function: :math:`y=tanh(g*x)` For high pre-gain values, the function converges towards a step function.

.. raw:: html
   :file: /media/anwaldt/ANWALDT_2TB/WORK/TEACHING/Sound_Synthesis_Introduction/Jupyter/waveshaper-function.html

-----

Interactive Example
-------------------

The following interactive example offers control over the pre-gain to add overtones to the sinusoidal source signal:

.. raw:: html
   :file: /media/anwaldt/ANWALDT_2TB/WORK/TEACHING/Sound_Synthesis_Introduction/webaudio/waveshaper.html
