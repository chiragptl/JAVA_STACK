public class StackDS{
    static final int max = 100; // length of the stack
    int arr[] = new int[max]; // stack operation perform on this array
    int top=-1; // stack Top pointer

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


}
