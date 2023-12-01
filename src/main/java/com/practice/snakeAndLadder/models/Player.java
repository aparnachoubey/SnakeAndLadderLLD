package com.practice.snakeAndLadder.models;

import lombok.AllArgsConstructor;
//import lombok.Data;

//@Data
@AllArgsConstructor
public class Player {
// private int id;
 private String playername;
 private int currentPosition;

public Player(String playername, int currentPosition) {
//	super();
	this.playername = playername;
	this.currentPosition = currentPosition;
}
public int getCurrentPosition() {
	return currentPosition;
}
public void setCurrentPosition(int currentPosition) {
	this.currentPosition = currentPosition;
}
public String getPlayername() {
	return playername;
}
public void setPlayername(String playername) {
	this.playername = playername;
}
//public int getId() {
//	return id;
//}
//public void setId(int id) {
//	this.id = id;
//}
@Override
public String toString() {
	return "Player [playername=" + playername + ", currentPosition=" + currentPosition + "]";
}

}
