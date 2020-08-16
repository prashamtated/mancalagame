/**
 * 
 */
package com.prasham.mancala.domain;

import java.util.Stack;

/**
 * @author PRASHAMT
 *
 *
 */
public class Pile {
	/**
	 * Description of instance variables <p>
	 * stones: a stack of stones <p>
	 * stoneCount: an int that keeps track of the number of stones in the stack <p>
	 * isMancala: boolean that denotes whether the pile is a "mancala".
	 */
	private Stack<Stone> stones;
	private int stoneCount;
	public boolean isMancala; 

	/**
	 * Constructs a Pile, given a Stack of Stones and an int, the number of
	 * stones.
	 *
	 * @param numPiles the num piles
	 */
	public Pile(Integer numPiles) {
		stoneCount = numPiles;
		stones = new Stack<Stone>();
		if (numPiles > 0) {
			stones.push(new Stone());
			stones.peek().toggleLastTrue();
			numPiles--;
			while (numPiles > 0) {
				stones.push(new Stone());
				numPiles--;
			}
			isMancala = false;
		}
	}

	/**
	 * Changes pile to mancala.
	 */
	public void toggleMancala() {
		isMancala = true;
	}

	/**
	 * Returns the number of stones in a given pile
	 * 
	 * @return An int representing the number of stones in a pile
	 */
	public int getNumStones() {
		return stoneCount;
	}

	/**
	 * Clears the pile -tentative method. When someone chooses a pile, this
	 * could clear it before resetting the number of stones in the other piles,
	 * but because we are using stacks I think it may make more sense to pop and
	 * push the stones onto the stacks as needed.
	 */
	public void clearPile() {
		stones.clear();
		stoneCount = 0;
	}

	/**
	 * Adds the stone.
	 */
	public void addStone() {
		Stone p1 = new Stone();
		stones.push(p1);
		stoneCount++;
	}

	/**
	 * Removes the stone.
	 */
	public void removeStone() {
		stones.pop();
		stoneCount--;
	}

	/**
	 * Peek.
	 *
	 * @return the stone
	 */
	public Stone peek() {
		return stones.peek();
	}

	/**
	 * Check if last stone.
	 *
	 * @return true, if successful
	 */
	public boolean checkIfLastStone() {
		return stones.peek().isLast();

	}

	/**
	 * Set the number of stones in a given pile.
	 *
	 * @param numStones the new num stones
	 */
	public void setNumStones(int numStones) {
		stoneCount = numStones;
		Stone peb = new Stone();
		stones.push(peb);
		numStones--;
		while (numStones > 0) {
			stones.push(new Stone());
			numStones--;
		}
	}

	/**
	 * Checks to see if a pile is empty-Will be used in the check to see if the
	 * pile across the board is empty.
	 */
	public boolean isEmpty() {
		return stones.empty();
	}

}
