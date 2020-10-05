class casting {
public static void main(String[] args) {
	byte b =121;
	int i = b;//upcasting
	System.out.println(i);
	int j = 111;
	byte b1 = (byte) j;//downcasting-explicit
	System.out.println(b1);
}

}
