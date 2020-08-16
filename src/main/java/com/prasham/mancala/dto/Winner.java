/**
 * 
 */
package com.prasham.mancala.dto;

/**
 * @author PRASHAMT
 *
 *
 */
public enum Winner {

	P1("Player 1 won!"), 
	P2("Player 2 won!"), 
	TIE("It is a tie!");

	private final String winner;

	private Winner(String winner) {
		this.winner = winner;
	}

	public String getWinner() {
		return winner;
	}

}