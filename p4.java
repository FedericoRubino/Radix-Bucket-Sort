/*
  Federico Rubino
  Assignment #3
  Quicksort
  main.java
  tested/working
*/

import java.util.ArrayList;
import java.util.Scanner;


//main that uses class RadixBucket to sort any amount of input
public class p4{

    public static void main(String args[]){
        RadixBucket toBeSorted = new RadixBucket();
        Scanner input = new Scanner(System.in);
        int tempInt;
        ArrayList<Integer> list;
        while(input.hasNextInt()){
            tempInt = input.nextInt();
            toBeSorted.insert(tempInt);
        }
        input.close();
        list = toBeSorted.getSorted();
        for(int i = 0; i < list.size(); i++){
            System.out.printf("%09d%n", list.get(i));
        }
    }//end of main
}//end of class p4
