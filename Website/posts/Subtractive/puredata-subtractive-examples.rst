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


"User-Friendly" Filters
=======================

``lop~``, ``hip~`` and ``bp~`` are the basic non-resonant filters in PD.
The `PD Floss Manuals on filters <http://write.flossmanuals.net/pure-data/filters/>`_ give a nice introduction to
these builtin one-pole filters. The PD help files also come with examples.
Due to the lacking resonance, these filters are not the most interesting ones, musically.
