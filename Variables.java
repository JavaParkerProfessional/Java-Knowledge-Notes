public class Variables {
	
	public static void main(String[] args) {
	//Variables are saved data that we can reference to use this manually assigned value
		//These values are stored as PRIMITIVE VALUES as data
		//All the test items below are Variables
		//Variables require a type to be assigned for it function otherwise the system will produce an error.
		//To use a variable in a line you just use the normal print() or println() command
	int VariableExample = 1;
		System.out.println(VariableExample) ;
		System.out.print(VariableExample) ;
	// Java uses a couple variable types
		//int are integers and these are simple numbers such as 1 or 2, without any decimals. so whole numbers
	int testInteger = 1;
		//floats are values that contain a decimal, so 1.2, 1.6, 2.0, 2.6
			//floats are not the default for Java
			//so adding a f at the end of the value translates it from a double value into a float value
	float testFloat = 2.22f;
		//double is a value that contains numbers with decimals, so 1.2,  1.6, 2.0, 2.6 
			//[doubles store twice as much as float values and allow higher detail] and are used by default in Java
	double testDouble = 2.0;
		//char contains a single character value, so it can be 1, 2, #, !, ), ?, just one character value
			//USES '' NOT ""
	char charTest = 't';
		//String is a value that contains words or "strings" of letters
			//Uses "" not '' 
			// "" for strings '' for characters
	String stringExample = "String";
		//Boolean are true or false values but they use 0 or 1 for the value, 1 is active or true, 0 is inactive or false
		//Uses true or false
	boolean booleanExample = false;
		
	}
}
