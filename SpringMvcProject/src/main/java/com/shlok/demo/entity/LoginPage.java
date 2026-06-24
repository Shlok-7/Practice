package com.shlok.demo.entity;

public class LoginPage {
	String UID;
	String PWD;
	 public LoginPage(){}
	 
	 public LoginPage(String uID, String pWD) {
		super();
		UID = uID;
		PWD = pWD;
	 }

	 public String getUID() {
		 return UID;
	 }

	 public void setUID(String uID) {
		 UID = uID;
	 }

	 public String getPWD() {
		 return PWD;
	 }

	 public void setPWD(String pWD) {
		 PWD = pWD;
	 }
	 
	 
	 
	
	

}
