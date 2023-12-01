package com.practice.snakeAndLadder.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class Snake {
 private int head;
 private int tail;
public Snake(int head, int tail) {
	super();
	this.head = head;
	this.tail = tail;
}
public int getHead() {
	return head;
}
public void setHead(int head) {
	this.head = head;
}
public int getTail() {
	return tail;
}
public void setTail(int tail) {
	this.tail = tail;
}
}
