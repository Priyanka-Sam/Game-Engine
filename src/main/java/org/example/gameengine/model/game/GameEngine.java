package org.example.gameengine.model.game;

import org.example.gameengine.model.boards.TicTacToeBoard;

public class GameEngine {

  public Board start(String type) {
//    if(type.equals())
    return new Board();
  }

  public void move(Board board, Player player, Move move) {
    if (board instanceof TicTacToeBoard) {

    } else {
      throw new IllegalArgumentException();
    }
  }
}
