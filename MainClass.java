/* JavaTutorial (default and private keywords)
 * Here in this tutorial, Encapsulation techniques are used to demonstrate the difference 
 * between default and private keywords
 * 
 * */

//Here I have my main class which is used to access the all other classes.
public class MainClass {
	
	public static void main(String[] args) {
		DefaultTestClass defaultT = new DefaultTestClass();//create an object of the DefaultTestClass
		defaultT.testDefaultVal = 10; //set the testDefaultVal
		defaultT.testDefaultStr = "Hello Default ...!";//set the testDefaultStr
		System.out.println("Default Test outputs are: " + defaultT.testDefaultVal +
				" & " + defaultT.testDefaultStr);
		/*------------------------------------------------------------------------------------*/
		
/*		PrivateTestClass privateT = new PrivateTestClass();
		privateT.testPrivateVal = 100; //set the testDefaultVal
		privateT.testPrivateStr = "Hello Private ...!";//set the testDefaultStr
		System.out.println("Private Test outputs are: " + privateT.testPrivateVal +
				" & " + privateT.testPrivateStr);*/
		
		/* Comment out the above codes and try what happens with private keyword.
		 * you will see that there are a lot of errors regarding the code.
		 * This is happening with private key word because private variables cannot be accessed outside
		 * the class which belongs to.
		 * The variables are only accessed by the member classes or methods inside that class.
		 * This is also known as ENCAPSULATION in JAVA. 
		 */
		/*-------------------------------------------------------------------------------------*/
		
		PrivateTestClass privateT = new PrivateTestClass();
		privateT.setVariables(100, "Hello Private ...!"); 
		System.out.println("Default Test outputs are: " + privateT.getIntVal() +
				" & " + privateT.getString());
		/*
		 * In this part of the code you will see privateT object returns everything perfectly 
		 * without no errors.
		 * But notice that here to set values of integer and String variables a function called
		 * setVariables() has used.
		 * And also to SET and GET variables, two other methods are used.
		 * This is because private variables are impossible to access directly.
		 * But methods inside the particular class can access them without a problem.
		 */
	}

}
/*
 * The next class is the default test class.
 * let's name it as DefaultTestClass.
 * Whenever we are defining or creating a class or variables without a modifier, JAVA will
 * automatically declare them as "default" so you don't have to put them manually.
*/
class DefaultTestClass {
	int testDefaultVal;
	String testDefaultStr = new String();// When declaring Strings you have declare them as objects.
}

/* Here we define the private test class.
 * let's name it as PrivateTestClass.
 * Functions or the method inside the class are declared as public to access outside from the class.
 * But it is not necessary. Even without the public modifier the methods will work perfectly.
 * That is because JAVA automatically declare them with default modifier.
 * Try it when you write your code.
 */
class PrivateTestClass {
	//Declare variables with private keyward.
	private int testPrivateVal; 
	private String testPrivateStr = new String();
	
	//Declare a method to set variables.
	public void setVariables(int number, String greating) {
		testPrivateVal = number;
		testPrivateStr = greating;
	}
	//Get int variables with this function.
	public int getIntVal() {
		return testPrivateVal;
	}
	//Get string variables with this function.
	public String getString() {
		return testPrivateStr;
	}
}