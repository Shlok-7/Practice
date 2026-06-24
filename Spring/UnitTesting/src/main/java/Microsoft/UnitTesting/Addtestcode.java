package Microsoft.UnitTesting;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Addtestcode {
	// normal java class , this is not a test , the actual business logic 
	// function that adds two nos
	public int add(int a ,int b) {
		return a+b;
	}
	
	// function that muls two nos
	public int mul(int a,int b) {
		return a*b;
	}
	
	// This method beforeAll and afterAll must be static:
	// In order for JUNIT to create an object and start its life cycle,
	// the static method must be declared.
	
	//Run this method ONCE, before ANY test starts.
    //JUnit has NOT created any object of Addtestcode
   //Static methods belong to the class, not object
	@BeforeAll 
	public static void beforeAll() {
		System.out.println("This is beforeAll method..........");
	}
	
	
	// test for addition function
	@Test   // this is a test method not normal java code , without this Junit will ignore this 
	public void testadd() {
		Addtestcode aobj=new Addtestcode();
		int res=aobj.add(10, 20);
		assertEquals(30, res); // 30 should be equal to res which gives the addition of 10 and 20
		
	}
	
	@Test
	public void testMul() {
		Addtestcode mobj=new Addtestcode();
		int res=mobj.mul(9, 11);
		int expectedRes=99;
		assertEquals(expectedRes, res);
	}

	// The before all and after all runs for each parameter also 
	//A parameterized test runs the SAME test logic multiple times with different inputs.
	
	// It tells Junit Don’t run this method once. Run it multiple times, once per input value.
    @ParameterizedTest 
    
    @ValueSource(strings= {
    		"abc@gmail.com",
    		"test@test.com",
    		"test123@gmail.com"
    })
    public void testEmail(String email) {
    	assertTrue(email.contains("@"), email+"is a valid email");
    }
    
    //Run this method BEFORE EVERY SINGLE TEST METHOD
    @BeforeEach
    public void beforeEach() {
    	System.out.println("\nThis is Before Each");
    }
    
    //Run this method AFTER EVERY SINGLE TEST METHOD
    @AfterEach
    public void afterEach() {
    	System.out.println("This is After Each");
    }
    
    //Run this method ONCE, after ALL tests are finished
    @AfterAll
    public static void afteraAll() {
    	System.out.println("\nThis is After All Method..........");
    }

}

