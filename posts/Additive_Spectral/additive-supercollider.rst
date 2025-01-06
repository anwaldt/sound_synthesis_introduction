.. title: Additive Synthesis in SuperCollider
.. slug: additive-synthesis-in-supercollider
.. date: 2021-05-02 10:40:00 UTC
.. tags:
.. category: _sound_synthesis:spectral
.. priority: 10
.. link:
.. description:
.. type: text
.. priority: 11





Multichannel Expansion
======================

The following example implements simple additive synthesis in SuperCollider,
suited as a starting point for more elaborate designs.
Arrays can be helpful for using single UGens multiple times,
which is the very idea of additive synthesis.
The multichannel expansion allows the use of arrays as arguments for UGens,
resulting in an array of objects with the initialization parameters given in the arrays.
The following example will create five oscillators, sending their outputs to the buses 0...4:

.. code-block:: supercollider

		(
		{
			|pitch=100|
			SinOsc.ar(freq:pitch*[1,2,3,4,5],mul:1/[1,2,3,4,5]);
		}.play;
		)

		s.scope(6,0);


-----

Mixing
======

The single partials can be easily summed by wrapping them
inside a ``Mix.ar()`` UGen. They are now all sent to the first
output bus:

.. code-block:: supercollider


    (
    {
    	|pitch=100|
    	Mix.ar(SinOsc.ar(freq:pitch*[1,2,3,4,5],mul:1/[1,2,3,4,5]));
    }.play;
    )

    s.scope(6,0);


-----

Dynamic Allocation
==================


For more partials and dynamic sizes, it makes sense to use the ``fill()``
method of the array class:

.. code-block:: supercollider

    (

    ~n_part    = 30;
    ~add_synth = {

    	|pitch=100|

    	Mix.ar(
    		SinOsc.ar(
    			freq:pitch*Array.fill(~n_part,{arg i; (i+1)}),
    			mul: Array.fill(~n_part,{arg i; 1/(((i)+1))})
    		)
    	);

    }.play;
    )



-----

Exercises
=========

.. admonition:: Exercise I

    Adjust the partial weight formula to generate basic waveforms (square, sawtooth, triangle). Monitor the signal in the scope to verify. Try different numbers of partials and compare the results.


.. admonition:: Exercise II

    Combine the example with a mouse control, allowing to change two parameters of the timbre or
    partial frequencies.
