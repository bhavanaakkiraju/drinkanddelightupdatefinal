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
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the id");
		
		String id=scanner.nextLine();
		//Date date1 = new Date();
	
		//Date date1 = new Date();
			Date date1 = new Date();
	      Date date2 = sdf.parse("2020-02-28");
		UpdateServiceImpl serviceImpl=new UpdateServiceImpl();
		serviceImpl.Service(date1,date2,id);
		System.out.println(serviceImpl.Service(date1,date2,id));
		
}
}
