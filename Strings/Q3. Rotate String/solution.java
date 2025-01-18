import java.util.Scanner;

public class solution{

    public static boolean RotateString(String str, String goal){
        return ((str.length() == goal.length()) && ((str + str).contains(goal)));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = scn.next();

        System.out.print("Enter goal string: ");
        String goal = scn.next();

        scn.close();

        System.out.println("Is String 'goal' the rotation of string 'str'? " + RotateString(str, goal));
    }
}