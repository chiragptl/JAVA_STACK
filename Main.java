import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Call static methods to pass the values
        Stack stack = new Stack();
        Scanner takeinput= new Scanner(System.in);
        int value=0;
        int ans=0;
        int operation=0;

        do{
        //menu
        System.out.println("****************************************************");
        System.out.println("Enter 1 for Push");
        System.out.println("Enter 2 for Pop");
        System.out.println("Enter 3 for Peek");
        System.out.println("Enter 4 for  Is Empty");
        System.out.println("Enter 5 for Exit");
        System.out.println("****************************************************");
        System.out.println("Please enter the operation you want to perform");
        operation= takeinput.nextInt();

        switch(operation)
        {
            case 1: //for push
                System.out.println("Please enter number:");
                value = takeinput.nextInt();
                ans = stack.push(value);
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
                stack.pop();
                break;
            case 3: //for peek
                ans = stack.peek();
                if(ans == -1)
                {
                    System.out.println("Stack empty!! Please enter value");
                }
                else
                {
                    System.out.println(ans+" is at top");
                }
                break;
            case 4: //for is empty
                stack.isEmpty();
                break;
            case 5:
                System.out.println("Thank you for using Stack program.");
                break;
            default:
                break;
        }
    }while(operation!=5);
    }
}