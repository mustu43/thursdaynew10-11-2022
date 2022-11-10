package javaexamples;

public class carprogram {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				enum car{audi(2016),tesla(2018),lambo(2010);
				private int value;  
				private car(int value){  
				this.value=value;  
				}  
				}
				System.out.println("    Car Name\tModel Year");
				for(car c : car.values())
					System.out.println("    "+c+"\t"+c.value);
			}

		}