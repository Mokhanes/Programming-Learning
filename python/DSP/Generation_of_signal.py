import numpy as np
import matplotlib.pyplot as plt

def generate_unit_step(duration):
   signal = np.array([0]*int((duration/2))+[1]*int((duration/2)))
   return signal

def generate_impulse(duration, position):
   signal = np.zeros(duration)
   signal[position] = 1
   return signal

def generate_ramp(duration):
   signal = np.arange(0, duration)
   return signal

def generate_sinusoidal(duration, frequency, amplitude, phase):
   t = np.arange(0, duration)
   signal = amplitude * np.sin(2 * np.pi * frequency * t + phase)
   return signal

# Example usage
duration = 80
position = 40
frequency = 0.02
amplitude = 5.6
phase = 0

unit_step_signal = generate_unit_step(duration)
impulse_signal = generate_impulse(duration, position)
ramp_signal = generate_ramp(duration)
sinusoidal_signal = generate_sinusoidal(duration, frequency, amplitude, phase)

# Plotting the generated signals
plt.subplot(2, 2, 1)
plt.stem(unit_step_signal)
plt.title("Unit Step Signal")

plt.subplot(2, 2, 2)
plt.stem(impulse_signal)
plt.title("Impulse Signal")

plt.subplot(2, 2, 3)
plt.stem(ramp_signal)
plt.title("Ramp Signal")

plt.subplot(2, 2, 4)
plt.stem(sinusoidal_signal)
plt.title("Sinusoidal Signal")

plt.tight_layout()
plt.show()
