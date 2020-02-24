package com.capg.dao;

//public class UpdateDAO {

//}
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.capg.dto.UpdateDto;
import com.capg.ui.UpdateOrderException;

public class UpdateDAO {
	public String Update(Date date1,Date date2,String id) throws UpdateOrderException {
		/*if(date1.equals(date2))
		{
			System.out.println("Order will be placed by the end of the day");
		}*/
		UpdateDto updateDto=new UpdateDto();
		String str="order is not placed";
		Map<String,UpdateDto> map =new HashMap<String, UpdateDto>();//7

		UpdateDto updateDto2=new UpdateDto("53553");
		UpdateDto updateDto3=new UpdateDto("56243");
		UpdateDto updateDto4=new UpdateDto("56245");
		

		map.put(updateDto2.getOrderId(), updateDto2);
		map.put(updateDto3.getOrderId(), updateDto3);
		map.put(updateDto4.getOrderId(),updateDto4);
		
		/*
		 * if(raws.containsKey(id)) { u.setDateOfDelivery(date1); //
		 * System.out.println(u.getDateOfDelivery()); } else { throw new
		 * UpdateOrderException("id not found"); }
		 */
		if(map.containsKey(id))
		{
		if(date1.compareTo(date2) > 0) {
	        str="Order is delivered";
	     } else if(date1.compareTo(date2) < 0) {
	        str= "Order will be delivered soon";
	     } else if(date1.compareTo(date2) == 0) {
	        str="Order will be delivered by the end of the day";
	     }
		}
		else {
			throw new UpdateOrderException("ID not found");
		}
		return str;
	}
}

