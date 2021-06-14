.. title: Filters in PD
.. slug: filters-in-puredata
.. date: 2020-06-14 09:00:00 UTC
.. tags:
.. category: _sound_synthesis:subtractive-practical
.. link:
.. description:
.. type: text
.. has_math: true
.. priority: 1


When starting with subtractive synthesis, filters are the first thing to look for.
PD offers a couple of builtin filters but additional externals come with nice sounding
implementations.

-----


"User-Friendly" Filters
=======================

``lop~``, ``hip~`` and ``bp~`` are the basic non-resonant filters in PD.
The `PD Floss Manuals on filters <http://write.flossmanuals.net/pure-data/filters/>`_ give a nice introduction to
these builtin one-pole filters. The PD help files also come with examples.
Due to the lacking resonance, these filters are not the most interesting ones, musically.
They are also called "user-friendly", since they can not become unstable.


With the example `one-pole-filters.pd <https://github.com/anwaldt/sound_synthesis_introduction/blob/main/PD/one-pole-filters.pd>`_
from the repository, different characteristics of the one-pole filters can be compared, using a band-limited sawtooth as input signal.
Filter cutoff and quality are controlled with control rate signals:

.. figure:: /images/Sound_Synthesis/subtractive/pd-one-pole-filters.png
    :width: 600

-----

Resonant Lowpass Filters
========================

Additional filters can be installed with Deken.
Filters and the relevant extensions can be found in the `list of external filters <http://write.flossmanuals.net/pure-data/audio-filters/>`_ .
The ``iemlib``, for example,  features many useful resonant filters.
The ``moog~`` filter object from the ``flatspace ggee`` library is another good sounding implementation,
trying to emulate the Moog Ladder sound.


.. figure:: /images/Sound_Synthesis/subtractive/resonant-filters.png
    :width: 600
