public class Math {
	public static final PI = 3.2;
	private String unit;
	private int num1;
	private int num2;
            public Math() {
		num1 = 0;
		num2 = 0;
}
public Math(int num1, int num2) {
	this.num1 = num1;
	this.num2 = num2;
} 
public int  getNum1(){
	return num1;
}
public int getNum2(){
	return num2;
}
public setNum1(int num1) {
	this.num1 = num1;
}
public setNum2(int n2) {
	num2 = n2;
}
public void display(){
	System.out.println(“Num 1: ” + num1);
	System.out.printf(“Num 2: %d”, num2);
}

}
