import java.util.*;


public class K{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = sc.nextLine();
        System.out.println("Original name "+ ":"+ name);
        System.out.println("length"+":"+ name.length()); 
        System.out.println("uppercase"+":"+ name.toUpperCase());
        System.out.println("lowecase "+":"+ name.toLowerCase());
        
        sc.close();

    }
}