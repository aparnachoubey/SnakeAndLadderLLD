package com.practice.snakeAndLadder.models;

//import java.util.HashMap;

import lombok.Data;
//import lombok.Getter;

@Data
public class Board {
 private int boardsize=100;
 private int startPosition=1;
 private int endPosition;
// private Cell[][] cells; can make board as a matrix of cell*cell

 public Board(int boardsize, int startPosition) {
	 this.boardsize=boardsize;
	 this.endPosition=startPosition+boardsize-1;
 }

public int getBoardsize() {
	return boardsize;
}

public void setBoardsize(int boardsize) {
	this.boardsize = boardsize;
}

public int getStartPosition() {
	return startPosition;
}

public void setStartPosition(int startPosition) {
	this.startPosition = startPosition;
}

public int getEndPosition() {
	return endPosition;
}

public void setEndPosition(int endPosition) {
	this.endPosition = endPosition;
}
 
 
 
// public void addSnake(int head, int tail) {
//	 if(snakeList.get(head)!=null)
//	 snakeList.put(head, tail);
//	 else
//		 System.out.println("invalid input, same cell cannot of 2 snakes!!");
// }
// 
// public void addLadder(int head, int tail) {
//	 if(ladderList.get(head)!=null)
//	 ladderList.put(head, tail);
//	 else
//		 System.out.println("invalid input, same cell cannot of 2 ladders!!");
// }
// 
// public void makeNextMove() {
//	 
// }
 
}
