/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(){
        try{
            System.out.print("Please enter your number: ");
            Scanner x = new Scanner(System.in);
            int num = x.nextInt();
            int sum = 0;
            //System.out.printlNn("This is your number "+ num);
            if(num>=0){
            for(int i = num; i >= 0; i--){
                sum = sum + i;}
                System.out.println("The total sum of your number is "+sum);}
                else{ 
                    
                    for(int i=num;i<= 0; i++){
                sum = sum + i;
            }
            System.out.println("The total sum of your number is "+sum);}}
        
        catch(Exception err){
            System.out.println("This is not a whole number");}}
    }
