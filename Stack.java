public class Stack{
    static final int StackLength = 100; // length of the stack
    int StackValue[] = new int[StackLength]; // stack operation perform on this array
    int top=-1; // stack Top pointer

    public int push(int val)
    {
        if(top==StackLength)
        {
            return -1;
        }
        else
        {
            StackValue[top+1]=val;
            top++;
            return 1;
        }
    }

    public int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return StackValue[top];
        }
    }
    public void pop(){ 
        if(isEmpty()) // check if stack is empty then it's underflow
        {
            System.out.println("Stack is underflow");
        }
        else{// else stack has elements 
            System.out.println(StackValue[top]+" is pop out from the stack");
            top = top - 1;
        }
    }
    public boolean isEmpty(){
        if(top < 0){ // check if top is less then 0 then stack is empty
            System.out.println("Stack is Empty");
            return true;
        }
        else{
            System.out.println("Stack contains Values");
            return false;
        }
    }

}
