package exercise;

/**
 * 
 *
 * Implement a stack that has the following methods:
• push ( v a 1 ) : push v a 1 onto the stack
• pop: pop off and return the topmost element of the stack. If there are no elements in the stack, throw an error.
• max: return the maximum value in the stack currently. If there are no elements in the stack, throw an error.

Each method should run in constant time.
 */
public class TestStack {
   private int maxSize;
   private String[] stackArray;
   private int top;
   
   public TestStack(int s) {
      maxSize = s;
      stackArray = new String[maxSize];
      top = -1;
   }
   public void push(String elem) {
      stackArray[++top] = elem;
   }
   public String pop() {
	  String popped = "";
	  try {
		  if(stackArray != null) {
			  popped = stackArray[top--];
		  }
	  }
	  catch(Exception e) {
		  System.out.println("\nThere are no more elements to pop.");
	  }
	  return popped;
      
   }
   public String max() {
	   String max = "";
	   try {
		   if(stackArray != null) {
			   for(String x: stackArray) {
				   if(x.length() > max.length()){
					   max = x;
				   }
			   }
			   return max;
		   }
		   throw new NullPointerException();
	   }
	   catch(Exception e) {
		   System.out.println("Stack is empty!");
	   }   
	   return max;
   }

   public static void main(String[] args) {
	   TestStack stack = new TestStack(5);
		 
	   stack.push("v");
	   stack.push("a");
	   stack.push("1");
	   
	   System.out.println(stack.pop());
	   System.out.println(stack.pop());
	   System.out.println(stack.max());
	   System.out.println(stack.pop());
	   
	   System.out.println();
	   System.out.println(stack.pop());
	   System.out.println(stack.max());
	   
	}

}
