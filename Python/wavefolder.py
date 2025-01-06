#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Feb 11 19:11:24 2020

@author: anwaldt
"""

# https://ccrma.stanford.edu/~jatin/ComplexNonlinearities/Wavefolder.html
 
import numpy as np
import matplotlib.pyplot as plt
import audio_dspy as adsp


def tri_wave(x, freq, fs):
    p = float((1/freq) * fs)
    x = x + p/4
    return 4 * np.abs((x / p) - np.floor((x / p) + 0.5)) - 1

def sine_wave(x, freq, fs):
    return np.sin(2 * np.pi * x * freq / fs)


plt.close("all")

fs = 48000

N  = fs / 100
n  = np.arange(N)

f1 = 200
f2 = 1000

x  = np.sin(2 * np.pi * n * f1 / fs)

y  = tri_wave(20*x,  f2, fs)
y2 = tri_wave(x, f2, fs)



plt.plot(x)
plt.plot(y)
#plt.plot(y2)
#plt.legend(['Dry', 'Sine Folder', 'Tri Folder'])
#plt.title('Folded Sine Wave')




plt.figure()
plt.plot(x)
plt.title('Sine Wavefolder Static Curve')


X = abs(np.fft.fft(y))
f = np.linspace(0,fs,len(X))

plt.figure()
plt.plot(f,X)
plt.title('Sine Wavefolder Harmonic Response')