package com.sunbeam;

import java.util.Comparator;

public class Compare implements Comparator<Double>{

	@Override
	public int compare(Double d1, Double d2) {
		int diff = Double.compare(d1.doubleValue(), d2.doubleValue());
		return diff;
	}
	
}
