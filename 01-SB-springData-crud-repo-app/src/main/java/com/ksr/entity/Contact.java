package com.ksr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "contact_dtls")
@Data
public class Contact {

	@Id
	@Column(name = "C_ID")
	private String contactId;

	@Column(name = "C_NAME")
	private String contactName;

	@Column(name = "C_NUMBER")
	private Integer contactNumber;
}
