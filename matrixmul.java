package javaexamples;

public class matrixmul {

	public static void main(String[] args) { 
//creating two matrices    
int m1[][]={{1,2},{4,5}};    
int m2[][]={{7,8},{10,11}};    
int m3[][]=new int[2][2];    
//creating another matrix to store the multiplication of two matrices    
  //2 rows and 2 columns  
    
    
for(int i=0;i<2;i++)
{    
for(int j=0;j<2;j++)
{    
m3[i][j]=0;      
for(int k=0;k<2;k++)       
{      
m3[i][j]+=m1[i][k]*m2[k][j];      
}//end of k loop  
System.out.print(m3[i][j]+" ");  //printing matrix element  
}								//end of j loop  
System.out.println();			//new line    
}    
}
	}  