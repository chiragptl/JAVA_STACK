public class StackDS{
    static final int max = 100; // length of the stack
    int arr[] = new int[max]; // stack operation perform on this array
    int top=-1; // stack Top pointer

<<<<<<< HEAD
    public int push(int val)
    {
        if(arr.length()==max)
        {
            return -1;
        }
        else
        {
            arr[top+1]=val;
            top++;
            return 1;
        }
    }

    public int peek()
    {
        if(top == -1)
        {
            return -1;
        }
        else
        {
            return arr[top];
        }
    }

=======
    public void pop(){ 
        if(!isEmpty()) // check if stack is empty then it's underflow
        {
            System.out.println("Stack is underflow");
        }
        else{// else stack has elements 
            System.out.println(arr[top]+" is pop out from the stack");
            top = top - 1;
        }
    }
    public boolean isEmpty(){
        if(top < 0){ // check if top is less then 0 then stack is empty
            return false;
        }
        else{
            return true;
        }
    }
>>>>>>> c3f0a9c76bcefc564496c313c73429dd8d7cf2a5

}
