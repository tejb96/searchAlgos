import java.util.Arrays;

public class InterpolationSearch {

	private InteractiveCLI cli;
	
	public InterpolationSearch() {
		cli = new InteractiveCLI();
	}
	
	public int interpolationSearch(int[] array, int key){
		Arrays.sort(array);
		int low =0, high = array.length-1;
		while(low<=high) {
			int pos=(key-array[low])/(array[high]-array[low]);
			int mid = low + ((high-low)*pos);
			if(key<array[mid]) {high=mid-1;}
			else if(array[mid]<key) {low=mid+1;}
			else {return mid;}
		}
		return -1;
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
		int result = interpolationSearch(array, key);
		long endTime = System.nanoTime();
		cli.display("Using Linear Searh:");
		if(result ==-1) {
			cli.display("Search key NOT FOUND");
		}
		else {
			cli.display("Search key FOUND at index: "+ result);
		}
		cli.display("Interpolation took "+(endTime - startTime) + " ns");
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	InterpolationSearch app=new InterpolationSearch();
	app.run();
}

}
