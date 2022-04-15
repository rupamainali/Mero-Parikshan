package Programming;

public class String_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Jack";  //immutable and it does not supports the multiple threading, synchronized.
		name.concat(" Sparrow");
		System.out.println(name);
		
		String concatStr = name.concat(" Sparrow");
		System.out.println("String:"+concatStr);
		
		StringBuilder builder = new StringBuilder("Jack"); //mutable (Easy to Modify)and does not support multiple threads and synchronized.
		builder.append(" Sparrow");
		System.out.println("StringBuilder:"+builder);
		
		StringBuffer buffer = new StringBuffer("Jack"); // mutable and supports multiple threading.
		buffer.append("Sparrow");
		System.out.println("StringBuffer:"+buffer);
				
		

	}

}
