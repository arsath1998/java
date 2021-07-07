package hit.day28;

import java.util.Stack;

public class CollectionDemo5 {

	public static void main(String[] args) {
		 Stack<String> stack=new Stack<String>();
		 
		 stack.push("A");//To add the values
		 
		 stack.push("B");
		 
		 stack.push("c");
		 
		 stack.push("d");
		 
		 System.out.println(stack);
		 
		 stack.pop();//To remove the value
		 
		 System.out.println(stack);
		 
		
		 
		 System.out.println(stack.peek());//To return Top of the stack
		 
		 
		 
		 System.out.println(stack.empty());//to check the stack is empty or Not
		 
		 System.out.println(stack.search("c"));
		 
		 System.out.println(stack.search("A"));
		 

	}

}
