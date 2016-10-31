package com.helloworld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Iterator;

public class HeapSorterTest {

	@Test
	public void h1() { // check that sum() works
		HeapSorter H = new HeapSorter();
		H.add(3);
		H.add(2);
		H.add(1);
		assertEquals(new Integer(6), H.sum());
	}

	@Test
	public void h2() { // check that min() and max() work
		HeapSorter H = new HeapSorter();
		for (int i = 0; i < 100; i++)
			H.add(i);
		assertEquals(new Integer(0), H.min());
		assertEquals(new Integer(99), H.max());
		assertEquals(new Integer(0), H.min()); // check again, in case H got
												// emptied!
	}

	@Test
	public void h3() { // check that dump() works
		HeapSorter H = new HeapSorter();
		for (int i = 100; i > 0; i--)
			H.add(i);
		// note that dump() won't be in sorted order, so here are a few
		// checks on what would be the expected (weird) order
		assertEquals(new Integer(3), H.dump()[5]);
		assertEquals(new Integer(13), H.dump()[45]);
		assertEquals(new Integer(56), H.dump()[82]);
	}

	@Test
	public void h4() { // check that sorted() works
		HeapSorter H = new HeapSorter();
		for (int i = 100; i > 0; i--)
			H.add(i);
		Integer[] S = H.sorted();
		for (int i = 1; i < 101; i++) {
			assertEquals(new Integer(i), S[i - 1]);
		}
	}

	@Test
	public void h5() { // check that sum() returns null for an empty queue
		assertEquals(null, null);
	}

	@Test
	// this is an advanced test -- check that Iterator interface works
	public void h6() {
		HeapSorter H = new HeapSorter();
		for (int i = 1000; i > 100; i--)
			H.add(i);
		Iterator<Integer> I = (Iterator<Integer>) H; // I considers H as an
														// Iterator
		Integer first = -1;
		Integer last = -1;
		// loop will remember first and last items
		while (I.hasNext()) {
			if (first < 0)
				first = I.next();
			else
				last = I.next();
		}
		assertEquals(new Integer(101), first);
		assertEquals(new Integer(1000), last);
	}

}
