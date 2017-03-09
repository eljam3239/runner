/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package runner;
import java.util.Scanner;
/**
 *
 * @author eljam3239
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int distance;
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        name = input.nextLine();
        System.out.println("How far did you run(in integers)" );
        distance = input.nextInt();
        System.out.println("Your name is " + name + " and your ran " + distance + " km");
        
        
        
    }
    
}
