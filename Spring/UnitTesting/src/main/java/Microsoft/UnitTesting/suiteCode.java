package Microsoft.UnitTesting;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;
@Suite
@SelectClasses({
	loginTest.class,
	Addtestcode.class
})
public class suiteCode {
	
}

//We do NOT write all tests inside the suite.
// We write tests next to what they are testing
//The suite only collects and runs them together