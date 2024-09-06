package com.tka.utility;

public class ValidationUtility {

	public static boolean checkAnyTextBlankOrNull(String textToCheck)
	{
		if(textToCheck==null)
		{
			return true;
		}
		
		if(textToCheck!=null && textToCheck.trim()=="")
		{
			return true;
		}
		return false;

	}
	
	public static boolean isNumberZero(int checkNumber)
	{
		if(checkNumber<=0)
		{
			return true;
		}
		return false;
	}
	
}
