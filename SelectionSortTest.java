package selectionsort;


public class SelectionSort {
	 private int temp;
	/** Creates a new instance of SelectionSort */
	    public SelectionSort() {
	    }

	    public int[] basicSelectionSort(int[] x) {
	        for (int i = 0; i < x.length; i++) {
	           int index = i;
	            for (int j= i+1; j < x.length; j++) {
	                if (x[j] < x[index]) {
	                   index = j;
	                }
	            } // end of inner for loop
	            temp = x[index];
                x[index] = x[i];
                x[i] = temp;
	        } // end of outer for loop
	        return x;
	    }
	    }

      public testSelectionSort() {
   }

   public void testPositive(){
     SelectionSort temporary = new SelectionSort();
       int[] arr = new int[5];
       arr[0] = 8;
       arr[1] = 9;
       arr[2] = 7;
       arr[3] = 10;
       arr[4] = 2;

       int[] Sortedarr = new int[5];
       Sortedarr[0] = 2;
       Sortedarr[1] = 7;
       Sortedarr[2] = 8;
       Sortedarr[3] = 9;
       Sortedarr[4] = 10;
       arr = temporary.basicSelectionSort(arr);

       /** add tests to check for this unit test **/
   }

   public void testNegative(){
     SelectionSort temporary = new SelectionSort();
      int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        arr = temporary.basicSelectionSort(arr);
   }

   public void testMixed(){
   SelectionSort temporary = new SelectionSort();
    int[] arr = new int[5];
      arr[0] = 8;
      arr[1] = 9;
      arr[2] = -7;
      arr[3] = 10;
      arr[4] = -2;

      int[] Sortedarr = new int[5];
      Sortedarr[0] = -7;
      Sortedarr[1] = -2;
      Sortedarr[2] = 8;
      Sortedarr[3] = 9;
      Sortedarr[4] = 10;
      arr = temporary.basicSelectionSort(arr);
 }

 public void testDuplicates(){
   SelectionSort temporary = new SelectionSort();
    int[] arr = new int[5];
      arr[0] = 8;
      arr[1] = 8;
      arr[2] = 7;
      arr[3] = 10;
      arr[4] = 2;

      int[] Sortedarr = new int[5];
      Sortedarr[0] = 2;
      Sortedarr[1] = 7;
      Sortedarr[2] = 8;
      Sortedarr[3] = 8;
      Sortedarr[4] = 10;
      arr = temporary.basicSelectionSort(arr);
 }
}
