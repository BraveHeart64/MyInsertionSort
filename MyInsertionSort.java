




class MyInsertionSort{


public void PrintArray(int arr[]){
	
	for(int i=0; i<arr.length; ++i){
		System.out.print("\t " +arr[i]);
	}
	
}

public void SortArray(int arr[]){
	int insertion = 0;
		for(int i=0; i<arr.length-1; ++i){
		
             if(arr[i] > arr[i+1]){
               insertion = i+1;
			   
			 }
			
			 
			 while(insertion >0){
				 int temp = arr[insertion];
				 arr[insertion] = arr[i];
				 arr[i] = temp;
		        --insertion;
                 		i=0;	
						if(arr[i] > arr[i+1]){
							temp = arr[i];
							arr[i] = arr[i+1];
							arr[i+1] = temp;
						}
			 }
		
	}
	
}


  public static void main(String[] args){
    System.out.println("My Insertion Sort!");  
     int[] array= {14,33,27,10,35,19,44,5,3};
  
  MyInsertionSort  obj = new MyInsertionSort();
  System.out.println("Unsorted array");
  obj.PrintArray(array);
  System.out.println();
  obj.SortArray(array);
  
  System.out.println("Sorted Array");
    obj.PrintArray(array);
  }



}