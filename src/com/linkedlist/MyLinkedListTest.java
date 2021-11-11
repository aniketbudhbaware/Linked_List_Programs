package com.linkedlist;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class MyLinkedListTest {
	 @Test
	   public void given3NumbersWhenLinkedShouldBeAtAParticularPosition() {
	        int position = 2;
	        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
	        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
	        MyNode<Integer> mySecondNode = new MyNode<Integer>(70);
	        MyNode<Integer> myThirdNode = new MyNode<Integer>(30);

	       
	        myLinkedList.append(myFirstNode);
	        myLinkedList.append(mySecondNode);
	        myLinkedList.addingAtPosition(myThirdNode, position);

	        myLinkedList.printMyNodes();

	        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(myThirdNode)
	                && myLinkedList.head.getNext().getNext().equals(mySecondNode);
	        assertTrue(result);
	    }

	    @Test
	   public void given3NumbersWhenLinkedShouldBeAppendAtEnd() {
	    	MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
	        MyNode<Integer> myFirstNode = new MyNode<>(56);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(70);

	       
	        myLinkedList.append(myFirstNode);
	        myLinkedList.append(mySecondNode);
	        myLinkedList.append(myThirdNode);

	        myLinkedList.printMyNodes();

	        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
	                && myLinkedList.head.getNext().getNext().equals(myThirdNode);
	        assertTrue(result);
	    }

	        @Test
	       public void given3NumbersWhenLinkedShouldBeAddedAtBeginning() {
	            MyNode<Integer> myFirstNode = new MyNode<>(70);
	            MyNode<Integer> mySecondNode = new MyNode<>(30);
	            MyNode<Integer> myThirdNode = new MyNode<>(56);

	            MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
	            myLinkedList.add(myFirstNode);
	            myLinkedList.add(mySecondNode);
	            myLinkedList.add(myThirdNode);

	            myLinkedList.printMyNodes();

	            boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
	                    && myLinkedList.head.getNext().getNext().equals(myFirstNode);
	            assertTrue(result);
	        }

	    @Test
	   public void given3NumbersWhenPopShouldDeleteTheFirstNode() {
	        MyNode<Integer> myFirstNode = new MyNode<>(56);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(70);

	        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
	        myLinkedList.append(myFirstNode);
	        myLinkedList.append(mySecondNode);
	        myLinkedList.append(myThirdNode);

	        myLinkedList.printMyNodes();

	        myLinkedList.pop();     //deleting the first node
	        System.out.println("After pop: ");
	        myLinkedList.printMyNodes();

	        boolean result = myLinkedList.head.equals(mySecondNode) && myLinkedList.head.getNext().equals(myThirdNode)
	                && myLinkedList.head.getNext().getNext() == null;
	        assertTrue(result);
	    }

}
