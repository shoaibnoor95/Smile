/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputfromuser;

/**
 *
 * @author Shoaib
 */
import java.util.Scanner;
public class InputFromUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int a,b;
    Scanner input = new Scanner(System.in);
    a=input.nextInt();
    b=input.nextInt();
    System.out.println("A="+a+" B="+b);
    }
    
}
