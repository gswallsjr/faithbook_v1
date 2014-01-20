package com.faithbook.v1.model;

public class UserAccount extends AbstractSecureObject {
	
	String username;
	String password;
	
	String first_name;
	String last_name;
	
	String email_address;
	
	String access_level;
	
	public void view()
	{
		
	}
	
	public void modify()
	{
		
	}
	
	public Boolean delete()
	{
		return true;
	}
}
