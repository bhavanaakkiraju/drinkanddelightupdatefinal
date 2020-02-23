package com.capg.ui;

//public class UpdateUi {

//}
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import com.capg.service.UpdateServiceImpl;

public class UpdateUI {
	public static void main(String[] args) throws UpdateOrderException, ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		HashMap<Integer,String> p=new HashMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		
		String id=sc.nextLine();
		//Date date1 = new Date();
	
		//Date date1 = new Date();
			Date date1 = new Date();
	      Date date2 = sdf.parse("2020-02-23");
		UpdateServiceImpl t=new UpdateServiceImpl();
		t.Service(date1,date2,id);
		
}
}
