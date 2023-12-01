package com.practice.snakeAndLadder;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.snakeAndLadder.models.Board;
import com.practice.snakeAndLadder.models.Game;
import com.practice.snakeAndLadder.models.Ladder;
import com.practice.snakeAndLadder.models.Player;
import com.practice.snakeAndLadder.models.Snake;

//Requirements:
//- Multi Player game. Played on a grid of size 100. Each cell will have a number.
//2 -Some off the cell will have ladder which will jump to higher number.
//3 -Some cell will have a snake which will take you down to tail number.
//4- Player will in turn roll a die(1-6). Based on the value user will advance.
//User Action -> Dice Roll


//@SpringBootApplication
public class SnakeAndLadderApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//        System.out.println("Enter board Size");
        int boardSize=100;
//        System.out.println("Enter start postion in board");
        int startPosition=1;
//        System.out.println("Enter number of players");
//        int numberOfPlayers = sc.nextInt();
        
        Board board=new Board(boardSize, startPosition);
        System.out.println(board.toString());
        Game game = Game.getInstance();
        
        game.setBoard(board);
        
//        for(int i=0;i<numberOfPlayers;i++) {
//        	System.out.println("Enter player name");
//            String pName = sc.next();
//            Player player=new Player(pName,0);
//            game.addPlayer(player);
//        }
        
        int noOfSnakes = sc.nextInt();
        while(noOfSnakes>0){
            int sPosition = sc.nextInt();
            int ePosition = sc.nextInt();
            Snake snake=new Snake(sPosition, ePosition);
            game.setSnakeList(snake);
            noOfSnakes--;
        }
        System.out.println(game.getSnakeList());
        int noOfLadders = sc.nextInt();
        while(noOfLadders>0){
            int sPosition = sc.nextInt();
            int ePosition = sc.nextInt();
            Ladder lad=new Ladder(sPosition, ePosition);
            game.setLadderList(lad); //adds ladder value to list
            noOfLadders--;
        }
        System.out.println(game.getLadderList());
        int noOfPlayers = sc.nextInt();
        while(noOfPlayers>0){
            String pName = sc.next();
            Player player=new Player(pName,0);
            System.out.println(player.toString());
            game.addPlayer(player);
            noOfPlayers--;
        }
        System.out.println(game.getPlayerQueue());
        game.playGame();
//		SpringApplication.run(SnakeAndLadderApplication.class, args);
	}

}
