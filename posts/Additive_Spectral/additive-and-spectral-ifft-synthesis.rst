.. title: Additive & Spectral: IFFT Synthesis
.. slug: additive-and-spectral-ifft-synthesis
.. date: 2020-05-06 06:59 UTC
.. tags:
.. category: _sound_synthesis:spectral
.. link:
.. description:
.. type: text
.. priority: 8


The calculation of single sinusoidal components
in the time domain can be very inefficient
for a large number of partials.
IFFT synthesis can be used to compose spectra
in the frequency domain.


.. figure:: /images/Sound_Synthesis/ifft/ifft-0.png
	   :width: 400

*Main lobe kernel for* :math:`\varphi = 0`


.. figure:: /images/Sound_Synthesis/ifft/ifft-1.png
	   :width: 400

*Main lobe kernel for* :math:`\varphi = \pi/2`


.. figure:: /images/Sound_Synthesis/ifft/ifft-2.png
	   :width: 400

*Main lobe kernel for* :math:`\varphi = \pi/4`


.. figure:: /images/Sound_Synthesis/ifft/ifft-3.png
	   :width: 400

*Main lobe kernel for* :math:`\varphi =c3 \pi/4`
