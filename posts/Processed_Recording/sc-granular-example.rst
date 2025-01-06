.. title: SuperCollider Granular Example
.. slug: supercollider-granular-example
.. date: 2021-05-02 10:40:00 UTC
.. tags:
.. category: _sound_synthesis:sampling-practical
.. priority: 2
.. link:
.. description:
.. type: text


The ``TGrains`` UGen is an easy to use granular synth. It uses a Hanning window
for each grain and offers control over position, pitch and length of the grains.
The help files offer multiple examples for using this unit generator.
The following example uses a simple pulse train for triggering grains.

-----

Reading Channels
================

A single channel is loaded to a buffer from a sample for this granular example.
The duration in seconds can be queried from the buffer object, once loaded.


.. code-block:: supercollider

    ~buffer = Buffer.readChannel(s,"/some/wavefile.wav",channels:0);

    ~buffer.duration;

-----

The Granular Node
=================


The granular node uses an ``Impulse`` UGen to create a trigger signal for the ``TGrains`` UGen.
This node has several arguments to control the granular process:

- The **density** defines how often a grain is triggered per second.
- Every grain can be **pitch** shifted by a value (1 = default rate).
- The grain **duration** is specified in seconds.
- The grain **center** is defined in seconds.
- A *gain* parameter can be used for amplification.
- *buffer* specifies the index of the buffer to be used.

Once the node has been created with a ``nil`` buffer, the buffer index of the
previously loaded sample can be passed. Depending on the nature of the sample,
this can already result in something audible:

.. code-block:: supercollider


    ~grains =
    {
    	|
    	density = 1,
    	pitch   = 1,
    	dur     = 0.1,
    	center  = 0,
    	gain    = 1,
    	buffer  = nil
    	|

    	var trigger = Impulse.kr(density);

    	Out.ar(0,   gain * TGrains.ar(1, trigger, buffer, pitch, center, dur));

    }.play();


    ~grains.set(\buffer,~buffer.bufnum);


-----

Manual Parameter Setting
========================

As with any node, the arguments of the granular process can be set, manually.
Since the center is specified in seconds, the buffer duration is useful at this point.

.. code-block:: supercollider

  ~grains.set(\center,0.2);
  ~grains.set(\density,100);
  ~grains.set(\dur,0.2);
  ~grains.set(\pitch,0.8);



-----



Exercise
========

.. admonition:: Exercise I

  Use the mouse with buses for a fluid control of granular parameters.

.. admonition:: Exercise II

  Use envelopes for an automatic control of the granular parameters.
