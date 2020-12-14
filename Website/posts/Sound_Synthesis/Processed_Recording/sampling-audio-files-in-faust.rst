.. title: Sampling: Using Audio Files in Faust
.. slug: sampling-audio-files-in-faust
.. date: 2020-05-28 06:25:49 UTC
.. tags: 
.. category: _sound_synthesis:sampling
.. link: 
.. description: 
.. type: text


Using 'soundfile'
-----------------

Under the hood, using sound files in Faust is based on `libsndfile <http://www.mega-nerd.com/libsndfile/>`_.
This part of Faust is less documented and lacks full integration.
The ``soundfile`` primitive, which is the basis for reading and playing audio files,
is not yet managed in the Faust Web IDE
and can not be used with all targets.



When using wav files in Faust, their content is combined
with the generated binary when compiling. Files can thus not be
read dynamically.
Compiling with support for managing audio files is
enabled with the ``-soundfile`` flag:

.. code::

   $ faust2jaqt -soundfile sample_trigger.dsp

-----

Samples With a Trigger
----------------------


The ``soundfiles.lib`` library includes convinient
functions for handling sound files and playing them:

https://github.com/grame-cncm/faustlibraries/blob/master/soundfiles.lib

Using the provided methods, basic use of audio files
is granted with little code.
The example ``sample_trigger.dsp`` makes use of the
play method for soundfiles. A set of audio files is read
and selected files can be triggered with buttons.


.. code:: cpp

	  // sample_trigger.dsp
	  //
	  // Read files and make them playable with a trigger.
	  //
	  // - makes use of the 
	  //
	  // Henrik von Coler
	  // 2020-05-28

	  import("stdfaust.lib");

	  // read a set of wav files
	  s = soundfile("label[url:{'../WAV/kick.wav'; '../WAV/cowbell.wav'; '../WAV/my_model.wav'}]", 1);

	  // a slider for controlling the level of all samples:
	  level = hslider("level",1,0,2,0.01);
	  
	  // sample objects
	  kick = so.sound(s, 0);
	  bell = so.sound(s, 1);

	  process = kick.play( level, button("kick") ),  bell.play( level, button("bell")) :>  _   <: _,_ ;

-----
	  
Looping a Sample
----------------

``sample_looper.dsp`` defines a looping function which
can play a chosen sample with fracional playrates,
allowing reverse looping.


.. code:: cpp

	  // sample_looper.dsp
	  //
	  // Read a set of samples from wav files
	  //
	  // - loop sample with slider for speed
	  // - select active sample
	  //
	  // Henrik von Coler
	  // 2020-05-28

	  import("stdfaust.lib");

	  // read a set of wav files
	  s = soundfile("label[url:{'../WAV/kick.wav'; '../WAV/cowbell.wav'; '../WAV/my_model.wav'}]", 1);

	  // a slider for selecting a sound file:
	  file_idx = hslider("file_idx",0,0,2,1);

	  // a slider for controlling the playback speed:
	  speed = hslider("speed",1,-100,100,0.01);
	  
	  // a logic for reverse loops (wrap to positive indices)
	  wrap(l,x) = select2((x>=0),l-abs(x),x);


	  // the loop function
	  loop(s, idx) = (idx, reader(s)) : outs(s)
	  with {

	  // get recent file's properties
          length(s) = idx,0 : s : _,si.block(outputs(s)-1);
          srate(s)  = idx,0 : s : !,_,si.block(outputs(s)-2);
	  
	  // the playback position (a recursive counter)
	  reader(s) = (speed * float(srate(s)))/ma.SR : (+,length(s):fmod)~  _ : wrap(length(s)) : int;

          // read from sample
          outs(s)   = s : si.block(2), si.bus(outputs(s)-2);

	  };

	  process = loop(s,file_idx) <: _,_ ;	  
