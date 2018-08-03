//Test class
public class Test {

	public static void main(String[] args) {

		Shape circle = (arg0, arg01) -> {

			System.out.println("Drawing " + arg0+ " and " + arg01);
		};

		// Draw function is called...its defined by this lambda function
		circle.draw("Circle", "Rectangle");

		Add newAdd = (a, b, c) -> {
			System.out.println("The sum is " + (a + b + c)); //this portion defines the abstract method of the interface
		};
		newAdd.display(10, 20, 30);

	}

}
