/*
  Federico Rubino
  frubino
  Assignment #4
  RadixBucketSort
  RadixBucket.java
  tested/ working
*/

import java.util.ArrayList;
import java.lang.Math;

//class that implements the hybrid of Radix and Bucket Sort
public class RadixBucket{

    //constructor
    public RadixBucket(){
        A = new ArrayList<Integer>();
	Bucket = new ArrayList<ArrayList<Integer>>();
	//construct the bucket!
	for(int i = 0; i < 10 ; i++){
	    ArrayList<Integer> temp = new ArrayList<Integer>();
	    Bucket.add(temp);
	}
    }

    //fills array
    public void insert(int data){
        A.add(data);
    }

    //sorts the array and returns it
    public ArrayList<Integer> getSorted(){
	RadixBucketSort();
	return A;
    }

    //The RadixBucketSort function
    private void RadixBucketSort(){
	int r;
	for(int i = 0; i < 9; i++){
	    for(int j = 0 ;j < A.size(); j++){
		r = A.get(j) / ((int) Math.pow(10,i)) % 10;
		Bucket.get(r).add(A.get(j));
	    }// end of filling the buckets
	    A.clear(); 
	    for(int j = 0; j < 10; j++){
		ArrayList<Integer> temp = Bucket.get(j);
		for(int k = 0; k < temp.size();k++){
		A.add(temp.get(k));
		}//this gives us the individual valus in the bucket
	    } //filled the array
	    for(int k = 0; k < 10; k++){
		Bucket.get(k).clear();
	    } //end of clearing the buckets
	}// for
    }

    //Private member variables
    private ArrayList <Integer> A;
    private ArrayList <ArrayList<Integer>> Bucket;
}// class
