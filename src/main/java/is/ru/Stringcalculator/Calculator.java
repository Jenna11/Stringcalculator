package	is.ru.Stringcalculator;

public class Calculator {
	
public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",")){
			return sum(splitNumbers(text));
		}
		else
			return 1;
	} 
public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber(){
		assertEquals(1, Calculator.add("1"));
	}
	@Test
	public void testTwoNumbers(){
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testMultipleNumbers(){
		assertEquals(6, Calculator.add("1,2,3"));
	}
}
	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
		return numbers.split(",");
	}
     
    private static int sum(String[] numbers){
    	int total = 0;
		for(String number : numbers){
			total += toInt(number);
		}
		return total;
    }
}
