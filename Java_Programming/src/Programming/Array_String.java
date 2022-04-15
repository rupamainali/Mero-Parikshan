package Programming;

public class Array_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	String [] nameArray = {"Mark","John","Steve","Rob"};
	//	System.out.println(nameArray[2]);
		
	//	int lengthArray = nameArray.length;
	//	System.out.println("Length of the Array:"+lengthArray);
		
	//	for (int i = 0; i < lengthArray; i++) {
	//		System.out.println(nameArray[i]);
	//	}
       String text = "Welcome-To-Java-Programming";
        String [] inputArray = text.split("-");
       
     int lengthOfTextArray = inputArray.length;
  //     System.out.println(lengthOfTextArray);
       
    for (int i = 0; i < lengthOfTextArray;i++){
     	System.out.println(inputArray[i]);
       }
	}

}
