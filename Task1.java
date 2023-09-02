package CodSoft;
import java.io.*;
import java.util.*;
class Task1{
    static boolean check_guess(int n){
        Random r=new Random();
        int a=r.nextInt(100);
        System.out.println("The actual number was-: "+a);
        if(a==n)
        return true;
        else
        return false;
    }
    public static void main(String []args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int c=3,score=0;
        while(c!=0){
        System.out.println("Enter your guess between 1 and 100.");
        System.out.println(c+" attempts left.");
        int guess=sc.nextInt();
        if(check_guess(guess)){
        System.out.println("Congratulations! You Did A Correct Guess.");
        score++;
        }
        else
        System.out.println("Oops! Wrong Guess.");
        c--;
        }
        System.out.println("Your Score: "+score+"/3");
        sc.close();
    }
}