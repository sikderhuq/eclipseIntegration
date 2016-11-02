package com.helloworld;

import java.util.PriorityQueue;
import java.util.Iterator;

/**
 * This is an example for Junit testing. The HeapSorter class uses a Java
 * PriorityQueue (just a binary heap from data structures course). Look it up
 * here: https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html
 * 
 * Recall the famous Heap-Sort algorithm. First, put items into a heap. A heap
 * has the property that the smallest item is always at the top of the heap.
 * Removing from the heap takes the top away, then reorganizes the heap so that
 * again, the smallest remaining item is at the top of the heap. Thus to get a
 * sorted order of some items, just put them into the heap, then take the top
 * repeatedly until the heap is empty (use a list or array to store the sorted
 * result).
 * 
 * This HeapSorter class also has methods for add(), dump(), min(), max(), and
 * sum().
 * 
 * Two of the methods are correct: dump() is correctly coded, and so is add().
 * Other methods are incomplete or perhaps have bugs. You will need to fix them.
 * 
 * Also, HeapSorter implements the Iterator interface, documented here:
 * https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
 * 
 * The Iterator for HeapSorter should extract the items from the PriorityQueue
 * in sorted order, smallest to largest. To do that, the hasNext() and next()
 * methods will need to be written.
 * 
 */
public class HeapSorter implements Iterator<Integer> {
	PriorityQueue<Integer> Q;
	

	public HeapSorter() {
		this.Q = new PriorityQueue<Integer>();
	}

	public void add(Integer item) {
		Q.add(item);
	}

	/**
	 * The dump() method returns an array of Integer objects that is currently
	 * in the priority queue (it just copies from the Q.toArray() which is an
	 * array of objects).
	 */
	public Integer[] dump() {
		// lookup PriorityQueue.toArray(), and there is a trick to making it
		// return
		// an array of the right type, by giving it an array of that type
		if (Q.size() < 1)
			return null;
		Integer[] R = Q.toArray(new Integer[0]);
		return R;
	}

	/**
	 * The sorted() method returns an array of Integer objects equal to the Q
	 * items, but in sorted order. Also, it makes the Q empty (because all items
	 * have been removed).
	 */
	public Integer[] sorted() {
		return dump();
	}

	/**
	 * The max() method returns the largest Integer in the queue
	 */
	public Integer max() {
		return new Integer(0);
	}

	/**
	 * The min() method returns the smallest Integer in the queue
	 */
	public Integer min() {
		return new Integer(0);
	}

	/**
	 * The sum() method returns the sum of all items in the queue
	 */
	public Integer sum() {
		return new Integer(0);
	}

	// Incomplete and Incorrect Iterator Methods
	public boolean hasNext() {
		// return false if Q has no items, otherwise return true
		return false;
	}

	public Integer next() {
		return null;
	}
}
