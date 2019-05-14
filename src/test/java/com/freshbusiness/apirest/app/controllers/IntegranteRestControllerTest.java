package com.freshbusiness.apirest.app.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.freshbusiness.apirest.app.AbstractTest;
import com.freshbusiness.apirest.app.models.entity.Integrante;

public class IntegranteRestControllerTest  extends AbstractTest{
	
	@Before
	public void setUp() {
		super.setUp();
	}
	
	@Test
	public void getIntegrantes() throws Exception
	{
		String url = "/api/integrantes";
		
		MvcResult mvcResult = mvc.perform( MockMvcRequestBuilders.get(url)
				.accept(MediaType.APPLICATION_JSON_VALUE) ).andReturn();
		
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		
		String content = mvcResult.getResponse().getContentAsString();
		Integrante[] integrantesList = super.mapFromJson(content, Integrante[].class);
		assertTrue( integrantesList.length > 0 );
	}
}
