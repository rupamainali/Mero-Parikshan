package Programming;

public class Multi_Dimensonal_Array_String_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] inputArray = {
				{12,45,78},
				{98,56,34},
				{23,74,24}
		};
		System.out.println(inputArray[1][2]);
		
		for (int i = 0;i < 3;i++){
			for (int j = 0; j < 3; j++) {
				System.out.print(inputArray[i][j]+" ");
			}
			System.out.println();
		}

	}

}
