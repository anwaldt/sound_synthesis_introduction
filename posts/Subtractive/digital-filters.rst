.. title: Digital Filters
.. slug: digital-filters
.. date: 2020-05-17 09:39:35 UTC
.. tags:
.. category: _sound_synthesis:subtractive
.. link:
.. description:
.. type: text
.. priority: 10


Digital filters are delay-based processing units. In short: they affect a signal by overlapping it with delayed versions of the same signal.
There are two basic categories of digital filters:

FIR filters
===========

Finite Impulse Response (FIR) filters can be considered simple convolution processors. They are implemented without recursion, respectively feedback.
IIR filters are robust and easy to design, yet they are more CPU expensive.

IIR Filters
===========

Infinite Impulse Response (IIR) filters are recursive computational structures. They are used for many time-critical operations, since they are less CPU hungry. In contrast to FIR filters, they can become unstable and may affect the signal in unwanted ways.

-----

Both categories will be introduced in the following sections.
In a detailed comparison, they show a couple of differences, both having advantages and disadvantages. 
