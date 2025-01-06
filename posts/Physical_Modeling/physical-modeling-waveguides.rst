.. title: Digital Waveguides: Discrete Wave Equation
.. slug: physical-modeling-discrete
.. date: 2020-06-06 07:55:50 UTC
.. tags:
.. category: _sound_synthesis:physical
.. link:
.. description:
.. type: text
.. has_math: true
.. priority: 4


Wave Equation for Ideal Strings
-------------------------------

The ideal string results in an oscillation without losses.
The differential wave-equation for this process is defined as follows.
The velocity :math:`c` determines the propagation speed of the wave and
this the frequency of the oscillation.

.. math::
  \frac{\partial^2 y}{\partial t^2} = c^2  \frac{\partial^2 y}{\partial x^2}

A solution for the different equation without losses is given by d'Alembert (1746).
The oscillation is composed of two waves - one left-traveling and one right traveling
component.

.. math::
  y(x,t) = y^+ (x-ct) + y^- (x+ct)$

- :math:`y^+` = left traveling wave
- :math:`y^-` = right traveling wave

-----


Tuning the String
-----------------

The velocity :math:`c` depends on
tension :math:`K` and mass-density :math:`\epsilon`
of the string:

.. math::
  c^2 = \sqrt{\frac{K}{\epsilon}} = \sqrt{\frac{K}{\rho S}}

With tension :math:`K`, cross sectional area :math:`S` and density :math:`\rho` in :math:`{\frac{g}{cm^3}}`.

Frequency :math:`f` of the vibrating string depends on the velocity and the string length:

.. math::
  f = \frac{c}{2 L}

-----

Make it Discrete
----------------

For an implementation in digital systems, both time and space have to be
discretized. This is the discrete version of the above introduced solution:

.. math::
  y(m,n) = y^+ (m,n) + y^- (m,n)



For the time, this discretization is bound to the sampling frequency :math:`f_s`.
Spatial sample distance :math:`X` depends on sampling-rate :math:`f_s = \frac{1}{T}`
and velocity :math:`c`.

- :math:`t =  \ nT`
- :math:`x =  \ mX`
- :math:`X = cT`

-----


References
==========

.. publication_list:: bibtex/physical_modeling.bib
	   :style: unsrt
