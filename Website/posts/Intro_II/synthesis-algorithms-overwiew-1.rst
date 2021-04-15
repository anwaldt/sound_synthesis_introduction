.. title: Digital Synthesis: History & Taxonomy
.. slug: synthesis-algorithms-overwiew-1
.. date: 2020-04-27 15:00:32 UTC
.. tags: 
.. category: _sound_synthesis:introduction_2
.. link: 
.. description: 
.. type: text




Family Tree
-----------

The synthesis experiments at Bell Labs are the
origin of most methods for digital sound synthesis.
[Fig.1]_ illustrates the relations for a subset of
synthesis approaches, starting with Mathews.
The foundation for many further developments was
laid when John Chowning brought the software MUSIC VI
to Stanford from a visit at Bell Labs (Chowning, 2011).
After migrating it to a *PDP-6* computer,
Chowning worked on his groundbreaking digital compositions,
using the FM method and spatial techniques.

 
.. figure:: /images/Sound_Synthesis/bilbao_history.png
	   :width: 600
.. [Fig.1] *Evolution and family tree (Bilbao, 2009).*


------
	   
Taxonomy
--------

Digital methods for sound synthesis can be grouped
according to their underlying principle of operation.
In 1991, Smith proposed four basic categories,
shown in [Fig.2]_.


.. figure:: /images/Sound_Synthesis/synthesis_taxonomy_SMITH.png
	   :width: 600
		   
.. [Fig.2]	   *Taxonomy of synthesis algorithms (Smith, 1991).*



Processed Recording
===================

    Already a technique in the analog domain,
    more precisely in *Musique Concrète*,
    this family of synthesis approaches makes
    direct use of previously recorded sound for synthesis.
    This can be the playback of complete sounds or the
    extraction of short segments, such as grains or
    a single period of a sound.


Spectral Models
===============

    Spectral models use mathmatical means for expressing
    the spectra of sounds and their devopment over time.
    They are usually receiver-based, since they model
    the sound as it is heard, not as it is produced.
    This paradigm already existed in the mechanical
    world, as used by Hermann von Helmholtz in the
    19th century and is based on even older signal models.

Physical Models
===============

    Physical Models are based on virtual acoustical
    and mechanical units, realized through buffers
    and LTI systems. Oscillators, resonating bodies
    and acoustic conductors are thus combined as in
    the mechanical domain.
    Physical modeling is regarded a source-based
    approach, since it deals with the actual
    sound production.

Abstract Algorithm
==================

    If it is not processed sound, a spectral model
    or a physical model, it is an abstract algorithm.
    Algorithms from this category transfer methods
    from other domains, like message transmission,
    to the musical domain. 


Missing Recent Approaches
=========================
    
Although a few categorisations could be debated, 
the above introduced taxonomy is still valid
but misses some recent developments.
Methods based on neural networks and deep
learning for sound generation may be
considered a fifth taxon.


-----

.. publication_list:: bibtex/synthesis_overview.bib
	   :style: unsrt

