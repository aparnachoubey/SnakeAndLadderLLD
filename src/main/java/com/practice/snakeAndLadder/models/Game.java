package com.practice.snakeAndLadder.models;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Game {

	private Dice dice;
	private Board board;
	ArrayDeque<Player> playerQueue;
	ArrayList<Snake> snakeList;
	ArrayList<Ladder> ladderList;
	
	static Game instance = null;
	private int winpOSITION=0;
	
	public Game() {
//		super();
		this.dice = new Dice();
		snakeList = new ArrayList<>();
        ladderList = new ArrayList<>();
        playerQueue = new ArrayDeque<>();
	}

	public void addPlayer(Player player) {
		playerQueue.add(player);
	}
	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public void setSnakeList(Snake snake) {
		snakeList.add(snake);
	}
	public void setLadderList(Ladder ladder) {
		ladderList.add(ladder);
	}
	
	
public ArrayDeque<Player> getPlayerQueue() {
		return playerQueue;
	}

	public void setPlayerQueue(ArrayDeque<Player> playerQueue) {
		this.playerQueue = playerQueue;
	}

	public ArrayList<Snake> getSnakeList() {
		return snakeList;
	}

	public void setSnakeList(ArrayList<Snake> snakeList) {
		this.snakeList = snakeList;
	}

	public ArrayList<Ladder> getLadderList() {
		return ladderList;
	}

	public void setLadderList(ArrayList<Ladder> ladderList) {
		this.ladderList = ladderList;
	}

	//	public void initializeGame() {
//		//set the board
//		
//	}
	public void playGame() {
		while(true) {
		Player player = playerQueue.poll(); //we 1st removed the 1st element from queue
		int diceValue=dice.rollDice();
		int nextPos=diceValue+player.getCurrentPosition();
		int playerlastPos=player.getCurrentPosition();
		if(nextPos>board.getEndPosition()) {
			player.setCurrentPosition(player.getCurrentPosition());
			playerQueue.offer(player);
		}
		else {
			player.setCurrentPosition(getNewPosition(nextPos));
			if(nextPos==board.getEndPosition()) {
				winpOSITION++;
				System.out.println("Player "+player.getPlayername()+" won at "+winpOSITION+"position");
			}
			else {
//			System.out.println("Setting " + player.getPlayername() + "'s new position to " + player.getCurrentPosition());
			System.out.println(player.getPlayername() + " rolled a " + diceValue + " and moved from "+ playerlastPos+" to "+nextPos);
			System.out.println(playerQueue.size()+1);
			playerQueue.offer(player);
		}
		}
		if (playerQueue.size() < 2) {
            break;
        }
		}
	}
	
	private int getNewPosition(int nextPos) {

	for(Snake i:snakeList) {
		if(i.getHead()==nextPos)
		{
			System.out.println("Snake bite!!");
			return i.getTail();
		}
	}
	for(Ladder i:ladderList) {
		if(i.getHead()==nextPos) {
			System.out.println("Ladder climbed!!");
			return i.getTail();
		}
	}
	return nextPos;
}
//	private void initilizePlayersStartValue(){
//        for(int i=0;i<playerQueue.size();i++){
//            playerLatestPosition.put(entities.getPlayers().get(i),0);
//        }
//    }

	public static Game getInstance(){
        if( instance == null){
           instance = new Game();
        }
        return instance;
    }

}
