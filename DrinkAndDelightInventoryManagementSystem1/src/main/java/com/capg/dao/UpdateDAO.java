package com.capg.dao;

//public class UpdateDAO {

//}
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.capg.dto.UpdateDto;
import com.capg.ui.UpdateOrderException;

public class UpdateDAO {
	public void Update(Date date1,Date date2,String id) throws UpdateOrderException {
		/*if(date1.equals(date2))
		{
			System.out.println("Order will be placed by the end of the day");
		}*/
		UpdateDto u=new UpdateDto();
		Map<String,UpdateDto> raws =new HashMap<String, UpdateDto>();//7

		UpdateDto order=new UpdateDto("53553");
		UpdateDto order1=new UpdateDto("56243");
		UpdateDto order11=new UpdateDto("56245");
		

		raws.put(order.getOrderId(), order);
		raws.put(order1.getOrderId(), order1);
		raws.put(order11.getOrderId(), order11);
		
		/*
		 * if(raws.containsKey(id)) { u.setDateOfDelivery(date1); //
		 * System.out.println(u.getDateOfDelivery()); } else { throw new
		 * UpdateOrderException("id not found"); }
		 */
		if(raws.containsKey(id))
		{
		if(date1.compareTo(date2) > 0) {
	        System.out.println("Order is delivered");
	     } else if(date1.compareTo(date2) < 0) {
	        System.out.println("Order will be delivered soon");
	     } else if(date1.compareTo(date2) == 0) {
	        System.out.println("Order will be delivered by the end of the day");
	     }
		}
		else {
			throw new UpdateOrderException("ID not found");
		}
	}
}

