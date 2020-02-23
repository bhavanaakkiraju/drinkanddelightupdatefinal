package com.capg.dto;

import java.util.Date;

public class UpdateDto {

String orderId;

public UpdateDto(String orderId){
	this.orderId=orderId;
}

public UpdateDto() {
	// TODO Auto-generated constructor stub
}

public String getOrderId() {
	return orderId;
}

public void setOrderId(String orderId) {
	this.orderId = orderId;
}
}