class P38 {  
	public static void main(String args[]) {  
		StringBuilder sb=new StringBuilder("Hello");  
		sb.reverse();  //reverse
		System.out.println(sb);
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.replace(1,3,"Java"); //replace  
		System.out.println(sb1);
		StringBuilder sb2 = new StringBuilder("Hello");
		sb2.append("World"); //append
		System.out.println(sb2);
		StringBuilder sb3 = new StringBuilder("This is a string");
		System.out.println(sb3);
		sb3.delete(1, 3); //delete
		System.out.println(sb3);
		StringBuilder sb4 = new StringBuilder("This is a string"); 
		System.out.println(sb4.capacity()); //capacity
		sb4.append(". New String added!");
		System.out.println(sb4.capacity());
	}  
}  