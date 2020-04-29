/**
 * CS 105 Theory & Practice
 * CRN: 62498
 * Assignment: Streams
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author romina sobhani, rsobhani@pipeline.sbcc.edu
 */
package edu.sbcc.cs105;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * This code is a solution for the Streams assignment.
 *
 */
public class Streams  {
	public static int intData = 0;
	public static String stringData = "";
	public static double doubleData = 0.0;

	public static void main(String args[])  {
		try {


			// You can put your code here to do read data from the files
			if (args.length==0){ System.out.println("unable to found command line arguments");}
			else{String fileName = args[0];
			File inputFile = new File(fileName);

			Scanner in = new Scanner(inputFile);


			try {

				if (in.hasNextInt()) {
					intData = in.nextInt();
				}
			} catch (NoSuchElementException exception) {
				intData = 0;
			}
			try {

				if (in.hasNext()) {
					stringData = in.next();
				}
			} catch (NoSuchElementException exception) {
				stringData = "";
			}
			try {
				if (in.hasNextDouble()) {
					doubleData = in.nextDouble();
				}
			} catch (NoSuchElementException exception) {
				doubleData = 0.0;
			}


			// This code prints out what was read from the files
			System.out.println("intData: " + intData);
			System.out.println("stringData: " + stringData);
			System.out.println("doubleData: " + doubleData);
			
			in.close();}
		}
		catch(FileNotFoundException exceptions){System.out.println("unable to find input file"); }
		}}






