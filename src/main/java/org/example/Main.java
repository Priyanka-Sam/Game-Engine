package org.example;

import org.example.gameengine.model.game.Board;
import org.example.gameengine.model.game.GameEngine;
import org.example.gameengine.model.game.GameResult;
import org.example.gameengine.model.game.Move;
import org.example.gameengine.model.game.Player;

public class Main {

  public static void main(String[] args) {
    GameEngine gameEngine = new GameEngine();
    Board board = gameEngine.start("TicTacToe");

//    while(!gameEngine.is)
//    gameEngine.move(board, opponent, oppMove);

  }

  public void start() {
//    return new Board();
  }

  public void move(Board board, Player player, Move move) {

  }

  public GameResult isComplete(Board board) {
    return new GameResult();
  }

}