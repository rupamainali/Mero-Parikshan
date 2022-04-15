package Programming;

public class Multi_Dimensional_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] values = {3,5,2323};
		System.out.println(values[2]);
		
		
		int [][] view = {
				{3,4,2324},
				{2,5},
				{1,2,3,4,6}
		};
		System.out.println(view[0][0]);
		System.out.println(view[2][3]);
		String [][] texts = new String [2][3];
		
		texts [0][1] = "Hello There";
		System.out.println(texts[0][1]);
		
		for (int row = 0; row < view.length; row++) {
			for (int col = 0;col < view[row].length; col++) {
				System.out.println(view[row][col]); //(view[row][col] + "\t");
			}
			System.out.println();
		}
		String [][] words = new String [2][];
		System.out.println(words[0]);
		words [0] = new String[3];
		words [0][1]= "Hi There";
		System.out.println(words[0][1]);
		

	}

}
