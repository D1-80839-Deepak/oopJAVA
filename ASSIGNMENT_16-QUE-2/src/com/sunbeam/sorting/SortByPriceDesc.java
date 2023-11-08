package com.sunbeam.sorting;

import java.util.Comparator;

import com.sunbeam.library.Book;

public class SortByPriceDesc implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		int diff = Double.compare(b1.getPrice(), b2.getPrice());
		return -diff;
	}
}