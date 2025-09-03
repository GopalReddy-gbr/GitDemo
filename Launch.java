class Demo{
	public static void main(String[] args){
		System.out.println("Hello world!");
		System.out.println("Changes are made");
		add();
	}


	public static void add() {
		int a = 10;
		int b = 20;

		int sum = a + b;
		System.out.println(sum);
	}
}