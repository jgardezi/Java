import java.math.*;

public class MinMax {

	public static void main(String[] args) {
		
		final int NUM_OF_ELE = 10;
		
		//Finding the largest element in the array
		double[] mylist = new double[NUM_OF_ELE];
		mylist[0] = 1;
		mylist[1] = 3;
		mylist[2] = 6;
		mylist[3] = 78;
		mylist[4] = 45;
		mylist[5] = 23;
		mylist[6] = 41;
		mylist[7] = 63;
		mylist[8] = 78;
		mylist[9] = 14;
		
		/*for(int i=0 ; i<NUM_OF_ELE ; i++){
			mylist[i] = Math.random() * 100;
		}*/
		
		for(int i=0 ; i<mylist.length ; i++) {
			System.out.print( Math.round(mylist[i]) + " ");
		}
		
		//Finding the largest element in the above array
		double max = mylist[0];
		int indexOfMax = 0;
		for(int i=0 ; i<mylist.length ; i++) {
			if( mylist[i] > max ) {
				max = mylist[i];
				indexOfMax = i;
			}
		}
		//System.out.println("\nLargest element in the array: " + max + "\n\tIndex of the element: " + indexOfMax);
		
		//finding the min element in the above array
		double min = mylist[0];
		for(int i=0 ; i<mylist.length ; i++){
			if ( mylist[i] < min)
				min = mylist[i];
		}
		//System.out.println("Smallest element in the array: " + min);
		
		//Random shuffling
		/*for(int i=0 ; i<mylist.length ; i++){
			int index = (int)(Math.random() * mylist.length);
			
			double temp = mylist[i];
			//Why this step? think...
			mylist[i] = mylist[index]; 
			mylist[index] = temp;
		}
		
		System.out.println("\nSuffled array: ");
		for(int i=0 ; i<mylist.length ; i++) {
			System.out.print( Math.round(mylist[i]) + " ");
		}*/
		
		//Shifting elements to left
		double temp = mylist[0];
		for(int i=1 ; i<mylist.length ; i++){
			mylist[i-1] = mylist[i];
		}
		mylist[mylist.length-1] = temp;
		
		System.out.println("\nShifting elements: ");
		for(int i=0 ; i<mylist.length ; i++) {
			System.out.print( Math.round(mylist[i]) + " ");
		}
		System.out.println("\nBasic foreach in Java!");
		for(double u: mylist) {
			System.out.print(u + " ");
		}
		
	}
}
