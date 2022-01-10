import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Call static methods to pass the values
        StackDS obj = new StackDS();
        Scanner sc= new Scanner(System.in);
        int value=0;

        //menu
        System.out.println("****************************************************");
        System.out.println("Enter 1 for Push");
        System.out.println("Enter 2 for Pop");
        System.out.println("Enter 3 for Peek");
        System.out.println("Enter 4 for  Is Empty");
        System.out.println("****************************************************");
        System.out.println("Please enter the operation you want to perform");
        int operation= sc.nextInt();

        switch(operation)
        {
            case 1: //for push
                System.out.println("Please enter number:");
                value = sc.nextInt();
                int ans = obj.push(value);
                if(ans == -1)
                {
                    System.out.println("Stack overflowed");
                }
                else
                {
                    System.out.println(value+" added to stack");
                }
                break;
            case 2: //for pop
                System.out.println(obj.pop());
                break;
            case 3: //for peek
                int ans = obj.peek();
                if(ans == -1)
                {
                    System.out.println("Stack empty!! Please enter value");
                }
                else
                {
                    System.out.println(ans+" is at top");
                }
            case 4: //for is empty
                System.out.println(obj.isEmpty());
                break;

            default:
                break;
        }
    }
}