.. title: Physical Modeling: Introduction
.. slug: physical-modeling-introduction
.. date: 2020-06-05 08:37:44 UTC
.. tags:
.. category: _sound_synthesis:physical
.. link:
.. description:
.. type: text
.. has_math: true
.. priority: 1

Physical modeling emulates actual physical processes with digital means.
Oscillators, resonators and acoustic impedance are modeled with buffers and filters, respectively
LTI systems.
Although first realized when computers had sufficient power, the foundations are much older.
Hiller et al. (1971) were the first to transport the 1774 wave equation by d'Alambert to the digital
domain for synthesizing sounds of plucked strings.


-----

Early Hardware
--------------

Although physical modeling algorithms sound great, offer good means for control and enable the design
of interesting instruments, they had less impact on the evolution of  music genres
and digital instruments.
Hardware synths for physical modeling from the 1990s, like the *Korg Prophecy* or the
*Yamaha VL1* did not become a success, in the first place.
With prices of about 10.000 $, they were way too expensive.
There are many more practical reasons for the lack of success (Bilbao et al, 2019).
But the technique also had a bad timing, trying to establish in the 1990s.
Cheaper and larger memory made sampling instruments more powerful and virtual analog synthesizers
sounded more attractive, followed by the second wave of analog synths.

-----

Yamaha VL1 (1994)
=================

.. youtube:: OYWxCrz3vmQ


-----

Software Instruments
--------------------

Today, some physical modeling software emerged for high quality piano and organ synthesis
(`Amazona article <https://www.amazona.de/die-besten-physical-modeling-synthesizer-und-plugins/>`_).
Other implementations aim at strings:

- Pianoteq Pro 6
- Organteq Alpha
- Strum GS 2
- AAS Chromophone 2


-----

Modular
=======

Since simple physical models are nowadays easily implemented on small embedded systems, various modules exist on the market.
It a modular setup, this is especially interesting, since arbitrary excitation signals can be generated and patched. These are just two examples:


.. figure:: /images/Sound_Synthesis/physical_modeling/mysteron.jpg
 :width: 400

.. figure:: /images/Sound_Synthesis/physical_modeling/rings.jpg
 :width: 400


-----

Physical Models in Experimental Music
-------------------------------------

Eikasia
=======

Unlike FM synthesis, subtractive synthesis or sampling, physical modeling
does not come with genre-defining examples from popular music.
However, the technique has been used a lot in the context of experimental music (Chafe, 2004).
`Eikasia <https://tutschku.com/eikasia-post/>`_ (1999) by Hans Tutschku was realized using the IRCAM software *Modalys*:


.. youtube:: Rz_gKP6h61I

-----

S-Morphe-S
==========

In his 2002 work `S-Morphe-S  <https://ccrma.stanford.edu/~mburtner/listening.html#MetaColo>`_,
Matthew Burtner used physical models of singing bowls, excited by a saxophone:


.. youtube:: 3MptMGqGCJo

----


References
----------

.. publication_list:: bibtex/physical_modeling.bib
	   :style: unsrt
