class Searchthevalueof {
	 public static boolean Search(int[] arr, int valuetosearch) {
		boolean t = false;
		for(int i: arr) {
			if (i==valuetosearch) {
				t = true;
				break;
			}
		}
		return t;
	 
	 }
	 
	 
	 
}

public class Searchthevalue {
	
	public static void main(String[] args) {
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int valuesearch = 19;
		System.out.println(Searchthevalueof.Search(arr,valuesearch));
		
	}

}






	