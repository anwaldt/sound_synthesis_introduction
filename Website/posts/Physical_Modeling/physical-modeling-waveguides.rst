.. title: Physical Modeling: Waveguides
.. slug: physical-modeling-waveguides
.. date: 2020-06-06 07:55:50 UTC
.. tags: 
.. category: _sound_synthesis:physical
.. link: 
.. description: 
.. type: text
.. has_math: true



Wave Equation for Virtual Strings
---------------------------------

The wave-equation for the one dimensional ideal string:


:math:`\frac{\partial^2 y}{\partial t^2} = c^2  \frac{\partial^2 y}{\partial x^2}`


Solution without losses (d'Alembert):

:math:`y(x,t) = y^+ (x-ct) + y^- (x+ct)$`

- :math:`y^+` = left traveling wave
- :math:`y^-` = right traveling wave


Tuning the String
-----------------

The velocity :math:`c` depends on
tension :math:`K` and mass-density :math:`\epsilon`
of the string:

:math:`c^2 = \sqrt{\frac{K}{\epsilon}} = \sqrt{\frac{K}{\rho S}}`

With tension :math:`K`, cross sectional area :math:`S` and density :math:`\rho` in :math:`{\frac{g}{cm^3}}`.

Frequency :math:`f` of the vibrating string depends on the velocity and the string length:

:math:`f = \frac{c}{2 L}`

Make it Discrete
----------------

:math:`y(m,n) = y^+ (m,n) + y^- (m,n)`

:math:`t =  \ nT`

:math:`x =  \ mX`

Spatial sample distance :math:`X` depends on sampling-rate :math:`f_s = \frac{1}{T}`
and velocity :math:`c`:

:math:`X = cT`

-----
      
An ideal, lossless string is represented by
two delay lines with direct coupling.


.. figure:: /images/Sound_Synthesis/physical_modeling/schematic_3.png
 :width: 300

-----


Losses
======

Losses can be implemented by inserting filters
between the delay lines.

.. figure:: /images/Sound_Synthesis/physical_modeling/schematic_1.png
 :width: 400   

-----


References
==========

.. publication_list:: bibtex/physical_modeling.bib
	   :style: unsrt
   
