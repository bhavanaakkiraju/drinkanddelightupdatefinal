package com.capg.service;

//public class UpdateService {
//
//}
import java.util.Date;

import com.capg.dao.UpdateDAO;
import com.capg.ui.UpdateOrderException;


public class UpdateServiceImpl {
public void Service(Date date1,Date date2,String id) throws UpdateOrderException {
	UpdateDAO oo=new UpdateDAO();
	oo.Update(date1,date2,id);
}
}