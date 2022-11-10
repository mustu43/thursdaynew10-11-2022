package javaexamples;

import java.util.Scanner; 

public class stumarks {

	public static void main(String[] args) {
	   
	    Scanner m = new Scanner(System.in);  // taking input from user                                                                                                                                                                 
	    int[] marks = new int[10];     // marks taken in integer form
	    String[] names = new String[10];	// names of the students in string form
	    int max;                                                                                                                                                                                             
	    int i;                                                                                                                                                                                                     

	    for(i=0; i<3; i++) {  
	         System.out.println("Enter name of student: ");   // first user has input name                                                                                                                                                                
	        names[i] = (m.nextLine()); 
	        System.out.println("Enter marks: ");               // then user has input marks                                                                                                                                                    
	        marks[i] = m.nextInt(); 
	        m.nextLine();
	    }                         
	    int position = 0;
	    max = marks[i];                                                                                                                                                                                            
	    for(i = 0; i < 3; i++) {                                                                                                                                                                                  
	        if(max < marks[i]) {                                                                                                                                                                                   
	            max = marks[i]; 
	            position = i;
	        }                                                                                                                                                                                                      
	    }                                                                                                                                                                                                          
	    System.out.println(" student name " + names[position]);
	    System.out.println(" Highest marks: "+ marks[position]);
	}
}                                                                                                                                                                             
                                                                                                                                                                                        
                                                                                                                                                                      

       