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

		UpdateDto order=new UpdateDto("53553","sugar","602532",102.4,"123",new Date(), new Date(2020, 0, 15),121.0,146.0,"434");//8
		UpdateDto order1=new UpdateDto("56243","salt","602424",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"464");//9
		UpdateDto order11=new UpdateDto("56245","Tea powder","602424",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"434");//10
		UpdateDto order12=new UpdateDto("56243","coffee powder","602424",101.4,"128",new Date(), new Date(2020, 11, 20),120.0,140.0,"414");//11
		UpdateDto order13=new UpdateDto("56243","milk","602424",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"404");//12

		raws.put(order.getOrderId(), order);//12
		raws.put(order1.getOrderId(), order1);//13
		raws.put(order11.getOrderId(), order11);//14
		raws.put(order12.getOrderId(), order12);//15
		raws.put(order13.getOrderId(), order13);//16
		if(raws.containsKey(id)) {
			u.setDateOfDelivery(date1);
				//	System.out.println(u.getDateOfDelivery());
			}
		else {
			throw new UpdateOrderException("id not found");
		}
		if(date1.compareTo(date2) > 0) {
	        System.out.println("Order is delivered");
	     } else if(date1.compareTo(date2) < 0) {
	        System.out.println("Order will be delivered soon");
	     } else if(date1.compareTo(date2) == 0) {
	        System.out.println("Order will be delivered by the end of the day");
	     }
		
		

	}
	}

