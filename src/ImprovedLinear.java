import java.util.Arrays;

public class ImprovedLinear {
	private InteractiveCLI cli;
	
	public ImprovedLinear() {
		cli = new InteractiveCLI();
	}
	
	public int linearSearch(int[] array, int key,int j){

		int i=++j;
		if(i == array.length) {
			return -1;
		}else if(array[i]==key) {
			return i;
		}else {
			return linearSearch(array,key,i);
		}
	}
	public void run() {
		cli.prompt("Enter the number of elements in the array: ");
		int[] array = new int[cli.getKeyboardInteger()];
		cli.prompt("Enter the elements in the array: "+"\n");
		for(int i=0;i<array.length;i++) {
			array[i]=cli.getKeyboardInteger();
		}
		cli.prompt("Enter the search key: ");
		int key = cli.getKeyboardInteger();
		long startTime = System.nanoTime();
		int result = linearSearch(array, key,-1);
		long endTime = System.nanoTime();
		if(result ==-1) {
			cli.display("Search key NOT FOUND");
		}
		else {
			cli.display("Search key FOUND at index: "+ result);
		}
		cli.display("Upgraded Linear took "+(endTime - startTime) + " ns");
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	ImprovedLinear app=new ImprovedLinear();
	app.run();
}
		
}
