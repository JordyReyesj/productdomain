package com.nttdata.bootcamp.productdomain.model;

import lombok.Data;

@Data
public class CustomerEnterprise {

	private String id;
	private String ruc;
	private String reasonSocial;
	private String owner;
	private String address;
}
