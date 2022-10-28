import java.util.Stack;  
public class StackEmptyMethod
{  
public static void main(String[] args)   
{  

//creating an instance of Stack class  
Stack<Integer> stk= new Stack<>();  

// checking stack is empty or not  
boolean result = stk.empty();  

System.out.println("Is the stack empty? " + result); 

// pushing elements into stack  
stk.push(79);  
stk.push(114);  
stk.push(91);  
stk.push(121);  

//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
}  
} 
