 /*  
 * @author Tej
 *
 */

public class questionOne {
	
		private InteractiveCLI cli;
		
		public questionOne() {
			cli = new InteractiveCLI();
		}
		
		public int linearSearch(int[] array, int key){
			for(int i = 0; i < array.length; i ++) {
				if(array[i]==key) {return i;}
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
			int result = linearSearch(array, key);
			long endTime = System.nanoTime();
			cli.display("Using Linear Searh:");
			if(result ==-1) {
				cli.display("Search key NOT FOUND");
			}
			else {
				cli.display("Search key FOUND at index: "+ result);
			}
			cli.display("Linear took "+(endTime - startTime) + " ns");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		questionOne app=new questionOne();
		app.run();
	}

}
