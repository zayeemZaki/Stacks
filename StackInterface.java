
//----------------------------------------------------------------------------
//StackInterface.java           
//
//Interface for a class that implements a stack of <T>.
//A stack is a last-in, first-out structure.
//----------------------------------------------------------------------------
public interface StackInterface<T>
{
	void push(T element) throws StackOverflowException;
	// Throws StackOverflowException if this stack is full,
	// otherwise places element at the top of this stack.
	
	void pop() throws StackUnderflowExcecption;
	// Throws StackUnderflowException if this stack is empty,
	// otherwise removes top element from this stack.
	
	T top() throws StackUnderflowExcecption;
	// Throws StackUnderflowException if this stack is empty,
	// otherwise returns top element of this stack.
	
	boolean isEmpty();
	// Returns true if this stack is empty, otherwise returns false.
	
	boolean isFull();
	// Returns true if this stack is full, otherwise returns false.
}
