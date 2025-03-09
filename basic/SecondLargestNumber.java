class SecondLargestNumber{

  public static void main(String[]args){
		
	int []arr = {1,2,3,4};
	int m1 = arr[0];
	int m2 = arr[0];
	
        for(int i =0; i<arr.length; i++){
		if(arr[i]>m1){
			m2 = m1;
			m1 = arr[i] ;
		}
		else if(arr[i]>m2){
			m2 = arr[i];
		}
	}
    System.out.print("==>"+m1 +" "+m2);		 

  }

}
