package Microsoft.UnitTesting;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class loginTest {
	// logineFunction which takes user id and password and verifies
	//whether the given inputs are valid or not .
	public boolean loginFunction(String strUID, String strPwd) {
		if(strUID.equals("Shlok") && strPwd.equals("Admin"))
			return true;
		else
			return false;
	}
	
	
	
	// JUNIT
	@Test
	public void testlogin() {
		loginTest loginobj=new loginTest();
		String strUID="Shlok";
		String strPwd="Admin";
		boolean bResult=loginobj.loginFunction(strUID, strPwd);
		assertTrue(bResult);
	}

}
