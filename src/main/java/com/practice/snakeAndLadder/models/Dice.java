package com.practice.snakeAndLadder.models;

import java.util.concurrent.ThreadLocalRandom;

import lombok.AllArgsConstructor;
import lombok.Getter;

//use to generate roll dice results
@AllArgsConstructor
@Getter
public class Dice {
 private int maxSide=6;
 private int minSide=1;
 
 public int rollDice(){
	 return ThreadLocalRandom.current().nextInt(minSide, maxSide+1);
 }
}
