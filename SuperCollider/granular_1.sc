


s.boot;

~buffer = Buffer.readChannel(s,"/media/anwaldt/ANWALDT_2TB/SOUND/SAMPLES/voices/ACID-POPS.wav",channels:0);

~buffer.duration;

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



~grains.set(\center,0.2);
~grains.set(\density,100);
~grains.set(\dur,0.1);
~grains.set(\pitch,0.8);

// Exercise I

~mouse_BUS = Bus.control(s,2);

~mouse   = {
  Out.kr(~mouse_BUS.index,   MouseX.kr(0,2));
  Out.kr(~mouse_BUS.index+1, MouseY.kr(0,100));
}.play;

~mouse.free;

~grains.map(\pitch,~mouse_BUS.index)

~grains.map(\density,~mouse_BUS.index+1)


// Exercise II

~bus_A = Bus.control(s,1);
~grains.map(\center,~bus_A.index);


~env = Env([1.5,1], [1],\lin);
~env.plot;

{Out.kr(~bus_A.index,EnvGen.kr(~env, doneAction: Done.freeSelf))}.play
 