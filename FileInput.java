/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs232lab2;

/**
 *
 * @author jlaw
 */
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileInput {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * 
     */
    public static void main(String[] args) throws IOException {
        String line;
        int range1 = 0;
        int range2 = 0; 
        int range3 = 0; 
        int range4 = 0; 
        int range5 = 0; 
        int range6 = 0; 
        int range7 = 0;
        int range8 = 0;
        Scanner in = new Scanner (Paths.get("lab2_input-1.txt"));
        int grade = in.nextInt();
        while (in.hasNext()) {
            grade = in.nextInt();
             
        if ((grade >= 0) && (grade <= 24)) {
            range1++;
        }
        else if ((grade >= 25) && (grade <= 49)){
            range2++;
            
        }
        else if ((grade >= 50) && (grade <= 74)) {
            range3++;
        }
        else if ((grade >= 75) && (grade <= 99)){
            range4++;
        }
        else if ((grade >= 100) && (grade <= 124)){
            range5++;
        }
        else if ((grade >= 125) && (grade <= 149)){
            range6++;
        }
        else if ((grade >= 150) && (grade <= 174)){
            range7++;
        }
        else {
            range8++;
        }
       }
        
        System.out.println("[0-24]: " + range1);
        System.out.println("[25-49]: " + range2);
        System.out.println("[50-74]: " + range3);
        System.out.println("[75-99]: " + range4);
        System.out.println("[100-124]: " + range5);
        System.out.println("[125-149]: " + range6);
        System.out.println("[150-174]: " + range7);
        System.out.println("[175-200]: " + range8);
      }
        // TODO code application logic here

    
    }
   
 