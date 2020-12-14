.. title: Concatenative: Crowd Noise Synthesis
.. slug: concatenative-crowd-noise-synthesis
.. date: 2020-06-03 10:36:05 UTC
.. tags: 
.. category: _sound_synthesis:concatenative
.. link: 
.. description: 
.. type: text


Two master's thesis in collaboration between Audiocommunication Group and IRCAM
aimed at a parametric synthesis of crowd noises, more precisely
of many people speaking simultaneously (Grimaldi, 2016; Knörzer, 2017).
Using a concatenative approach, the resulting synthesis system
can be used to dynamically change the affective state of the
virtual crowd. The resulting algorithm was applied in
user studies in virtual acoustic environments.


Recordings
==========

The corpus of speech was gathered in two group sessions,
each with five persons, in the anechoic chamber at TU Berlin.
For each speaker, the recording was annotated into
regions of different valence and arousal and then
segmented into syllables, automatically.

Features
========


.. figure:: /images/Sound_Synthesis/concatenative/valence_arousal_1.png
 :width: 500	    



Synthesis
=========

The following example synthesizes a crowd
with a valence of -90 and an arousal of 80,
which can be categorized as frustrated, annoyed
or upset.
No virtual acoustic environment is used,
and the result is rather direct:

|example|


-----

References
==========

.. publication_list:: bibtex/concatenative.bib
	   :style: unsrt

		   
.. |example| raw:: html
			   
  <audio controls preload="none">
    <source src="/audio/SP_V_-90_A_80.wav" type="audio/wav">
  </audio>
  
