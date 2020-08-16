/**
 * 
 */
package com.prasham.mancala.service;

import com.prasham.mancala.dto.GameBoard;

/**
 * @author PRASHAMT
 *
 *
 */
public interface IBoardGame {

	public void determineWinner();

	public void startNewGame();

	public boolean isGameOver();

	public GameBoard getCurrentGameBoard();

	public void makeSingleMove(Integer currentPile);

}
