package utils;

import java.lang.Math;

public class Random {

	public static boolean chance(double probability) {
		return probability > Math.random();
	}

	public static int number(int max) {
		return (int) (Math.random() * max);
	}
}