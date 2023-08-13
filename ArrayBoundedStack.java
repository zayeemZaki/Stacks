/*Zayeem_Zaki HW 2 EECS 2500
 * In this homework we have two projects first one takes input 
 * from users and executes different commands like push, pop etc
 * and the second project takes string input from user and makes different 
 * changes to the string depending on the input from the user
 * I have created a package named Problem1 and in it different classes including 
 * two main methods for each project*/


import java.util.Arrays;

//----------------------------------------------------------------
//ArrayBoundedStack.java
//
//Implements StackInterface using an array to hold the 
//stack elements.
//
//Two constructors are provided: one that creates an array of a 
//default size and one that allows the calling program to 
//specify the size.
//----------------------------------------------------------------

public class ArrayBoundedStack<T> implements StackInterface<T> {
	protected final int DEFCAP = 100; // default capacity
	protected T[] elements;           // holds stack elements
	protected int topIndex = -1;      // index of top element in stack
	
	public ArrayBoundedStack() 
	{
		elements = (T[]) new Object[DEFCAP];
	}
	
	public ArrayBoundedStack(int maxSize) 
	{
		elements = (T[]) new Object[maxSize];
	}
	
	public void push(T element)
	// Throws StackOverflowException if this stack is full,
	// otherwise places element at the top of this stack.
	{      
		if (isFull())
			throw new StackOverflowException("Push attempted on a full stack.");
		else
		{
			topIndex++;
			elements[topIndex] = element;
		}
	}
	
	public void pop()
	// Throws StackUnderflowException if this stack is empty,
	// otherwise removes top element from this stack.
	{                  
		if (isEmpty())
			throw new StackUnderflowExcecption("Pop attempted on an empty stack.");
		else
		{
			elements[topIndex] = null;
			topIndex--;
		}
	}
	
	public T top()
	// Throws StackUnderflowException if this stack is empty,
	// otherwise returns top element of this stack.
	{                 
		T topOfStack = null;
		if (isEmpty())
			throw new StackUnderflowExcecption("Top attempted on an empty stack.");
		else
			topOfStack = elements[topIndex];
		return topOfStack;
	}
	
	public boolean isEmpty()
	// Returns true if this stack is empty, otherwise returns false.
	{              
		return (topIndex == -1); 
	}
	
	public boolean isFull()
	// Returns true if this stack is full, otherwise returns false.
	{              
		return (topIndex == (elements.length - 1));
	}
	
	//returns number of elements in a stack
	public int size() {
		int count=0,i=0;
		while (elements[i] != null) {
			count++;
			i++;
		}
		return count;
	}
	
	//pops some elements from the stack
	public void popSome(int count) {
		while(count!=0) {
			if(topIndex == -1) 
				throw new StackUnderflowExcecption("Pop attempted on an empty stack.");
			else{
				elements[topIndex] = null;
				topIndex--;
			}
			count--;
		}
	}
	
	//exchanges two top elements of the stack
	public boolean swapStart() {
		
		if(size() >= 2) {
			T last = top();
			T secondLast = elements[topIndex-1];
			elements[topIndex] = secondLast;
			elements[topIndex-1] = last;
		}
		return size()<2;
			
	}
	
	// remains last element and prints it out
	public T poptop() {
		T last_elem = null;
		if (isEmpty())
			throw new StackUnderflowExcecption("Top attempted on an empty stack.");
		else
			last_elem = elements[topIndex];
		pop();
		return last_elem;
	}
	
	// method to print out all the elements
	public String list() {
		String a ="";
		String b ="";
		int i=0;
		while(elements[i]!=null) {
			i++;
			a += (String)elements[i-1]+ "\n" ;
		}
		String[] elem = a.split("\n");
		for (int j=0; j< elem.length; j++) {
			b += "     " + elem[elem.length-1-j] + "\n";
		}
		return b;
	}
	
	//toString() method which formats the output in a nice way
	@Override
	public String toString() {
		return "There are " + size() + " elements in the stack:\n" + list();
	}
	
	
}
