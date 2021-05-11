.. title: FM Synthesis: DX7
.. slug: fm-synthesis-dx7
.. date: 2020-05-11 16:23:32 UTC
.. tags:
.. category: _sound_synthesis:fm-synthesis
.. link:
.. description:
.. type: text
.. priority: 7

FM synthesis was not only an outstanding method
for experimental music but landed a major commercial success.
Although there are many more popular and valuable synthesizers
from the 80s, no other device shaped the sound of pop music
in that era like the DX7 did.
It was not the first ever, but the first affordable
FM-capable synth and can generate a wide variety of
sounds -- bass, leads, pads, strings, ... --
with extensive (but complicated) editing opportunities.
It was also the breakthrough of digital sound synthesis,
using the full potential with MIDI.



.. figure:: /images/Sound_Synthesis/modulation/yamaha_dx7_angle2.jpg
	    :width: 400
.. [Fig.1] *Yamaha DX7.*


Specs
-----

- released in 1983
- 16 Voices Polyphony
- 6 sine wave 'operators' per voice
- velocity sensitive
- aftertouch
- LFO
- MIDI


The DX7 in 80s Pop
------------------


**Tina Turner - What's Love Got To Do With It**

    - 1984
    - blues harp preset
    - starting 2:00

    https://youtu.be/oGpFcHTxjZs

**Laura Branigan - Self Control**

    - 1984
    - the bells

    https://youtu.be/WqiCQA8ROXU


**Harold Faltenmeyer - Axel F**

    - 1986
    - marimbas
    - starting 1:40

    https://youtu.be/V4kWpi2HnPU



**Kenny Loggins - Danger Zone**

    - 1986
    - FM bass

    https://youtu.be/siwpn14IE7E



**A Comprehensive List**

    Find a comprenesive list of famous examples, here:

    http://bobbyblues.recup.ch/yamaha_dx7/dx7_examples.html


Programming the DX7
-------------------

The DX7 can be fully programmed using membrane buttons.
Alternatively, Sysex messages can be used to work
with external programmers, like a laptop, over MIDI.
For users new to FM synthesis, it may be confusing
not to find any filters.
Timbre is solely controlled using the FM parameters,
such as operator freuqncy ratios and modulation indices.


Algorithms
==========

The configuration of the six operators,
respectively how they are connected,
is called *algorithm* in the Yamaha terminology.
In contrast do some of its successors, the DX7 does not allow
the free editing of the operator connections but provides a set of 32
pre-defined algorithms, shown in [Fig.2]_.

.. figure:: /images/Sound_Synthesis/modulation/dx7-1.jpg
	    :width: 400
.. [Fig.2] *Yamaha DX7 manual: algorithm selection.*


Envelopes
=========

For generating sounds with evolving timbres,
each operator's amplitude can be modulated with
an individual ADHSR envelope, shown in [Fig.3]_.
Depending on the algorithm, this directly
influences the modulation index and thus the
overtone structure.

.. figure:: /images/Sound_Synthesis/modulation/dx7-2.jpg
	    :width: 400
.. [Fig.3] *Yamaha DX7 manual: envelope editing.*



Velocity
========

The level of each operator, and therefor modulation
indices, can be programmed to depend on velocity.
This allows the timbre to depend on the velocity,
as in most physical instruments, which is crucial
for expressive performances.
