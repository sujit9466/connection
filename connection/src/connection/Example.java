package connection;
import java.io.*;
import java.util.*;


public class Example {
	Node head;

	
    class Node{
    	String data;
    	Node next;
    	 Node(String data){
    		 this.data = data;
   		 this.next= null;
    		 
    	 }
    }
    public void addFrist(String data) {
    	Node newNode= new Node(data);
    	if(head== null) {
    		head= newNode;
    		return;
    	}
    	else {
    		newNode.next =  head;
    		head=newNode;
    		
    	}
    }
    
    public  static void main(String args[])
    {
    	Example list=new Example();
    	list.addFrist("a");
    	list.addFrist("is");
	}
		
	}


 