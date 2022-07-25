package com.gl.lab3.ques1;

public class Driver {

	public static void main(String[] args) {
		
		String bracketExpression = "(([[{{}}]]))";
		boolean isBalanced = BalancingBrackets.checkBalancingBrackets(bracketExpression);
		if(isBalanced) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
	
}
		
	
	
	

