/**
 * 
 */
package com.prasham.mancala.domain;

/**
 * @author PRASHAMT
 *
 *
 */
public class Stone {
	/**
	 * Description of instance variables <p> 
	 * last: boolean used to mark the last stone in the stack <p> 
	 * This will help to determine when a turn ends.
	 * 
	 */
	private boolean last;

	/**
	 * Stone Constructor.
	 */
	public Stone() {
		last = false;
	}

	/**
	 * Checks the status of last boolean, and switches it to true if false and
	 * false if true.
	 */
	public void toggleLastTrue() {
		last = true;
	}

	/**
	 * Toggle last false.
	 */
	public void toggleLastFalse() {
		last = false;
	}

	/**
	 * Checks whether the last stone landed in a mancala.
	 *
	 * @return true, if is landed mancala
	 */
	public boolean isLandedMancala() {
		return false;
	}

	/**
	 * Checks if is last.
	 *
	 * @return true, if is last
	 */
	public boolean isLast() {
		return last;
	}

}
