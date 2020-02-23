package com.capg.ui;

import org.junit.Test;

import com.capg.dto.UpdateDto;
import com.capg.service.UpdateServiceImpl;

import junit.framework.TestCase;

public class UpdateUITest2 extends TestCase {
	UpdateServiceImpl service=new UpdateServiceImpl();
	UpdateDto dto=new UpdateDto("56245");
	@Test
	public void test() {
		String expectedid="56245";
		assertEquals(expectedid,dto.getOrderId());
		
		
		
	//	fail("Not yet implemented");
	}

}
