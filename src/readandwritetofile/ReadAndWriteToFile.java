/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readandwritetofile;

import java.io.*;
import java.util.*;
public class ReadAndWriteToFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String token1 = "";

    

    // create Scanner inFile1
    Scanner scan = new Scanner(new File("Readfile.txt")).useDelimiter(",\\s*");
// this is the closest i could come to gettting it into an array
//this basically just hard codes it into the array. 
//im not quite sure what else to do with this. 
//   int columns = 80;
//    int rows = 9;
//
//    String[][] newArray = new String[columns][rows];
//    newArray[0][0] = "Call of Duty";
//    newArray[0][1] = "Action";
//    newArray[0][2] = "Xbox";
//    newArray[0][3] = "combat";
//    newArray[0][4] = "multiplayer";
//    newArray[0][5] = "hard";
//    newArray[0][6] = "battlefield";
//    newArray[0][7] = "yes";
//    newArray[0][8] = "yes";
//
//    
//
//
//    for(int i = 0; i < rows; i++){
//        for(int j = 0; j < columns; j++){
//            System.out.println(newArray[i][j]);
//        }
//    }
   

        System.out.println("These are some games that we recommend for you:");
File file =new File("readfile.txt");
        Scanner in = null;
        try {
            in = new Scanner(file);
            while(in.hasNext())
            {
                String line=in.nextLine();
               if(line.contains(""))
                    System.out.println(line);
            }
                    
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
        }
    }



    
    

