package com.rajbhar.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SplittableRandom;

public class GenerateOTPUsing8 {

	public static void main(String[] args) {

     SplittableRandom random  = new SplittableRandom();
     
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter length of otp :");
     int otpLength = scanner.nextInt();
     StringBuilder  builder = new StringBuilder();
     
     for (int i=0;i<otpLength;i++) {
		builder.append(random.nextInt(0, 9));
	}
   System.out.println("Generated OTP : "+builder.toString());
   //add in set
   Set addOtp = new HashSet<Integer>();
   addOtp.add(Integer.parseInt(builder.toString()));
   System.out.println("Verify generated otp \n\n Enter generated OTP:");
   int enteredOtp = scanner.nextInt();
   //verify code for generated OTP
   System.out.println("entered otp :"+enteredOtp);
   if(addOtp.contains(enteredOtp))
   {
	   System.out.println("Tranaction has done successfully");
	   addOtp.remove(enteredOtp);
   }
   else
   {
	   System.out.println("Entered otp is wrong "+enteredOtp);
   }
   System.out.println("after operation saved data : "+addOtp);
	}

}
