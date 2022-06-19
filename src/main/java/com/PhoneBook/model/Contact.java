package com.PhoneBook.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "CONTACT_DETAILS")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "CONTACT_ID")
	private int conatctId;
	@Column(name = "CONTACT_NAME")
	private String contactName;
	@Column(name = "CONTACT_NUMBER")
	private Long contactNumber;
	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;
	@Column(name = "ACTIVE_SW")
	private Character activeSw; 
	
	@Column(name = "CREATED_DATE",updatable=false)
	@CreationTimestamp
	private LocalDate CreatedDate;
	
	@Column(name = "UPDATED_DATE",insertable=false)
	@CreationTimestamp
	private LocalDate UpdatedDate;

	public int getConatctId() {
		return conatctId;
	}

	public void setConatctId(int conatctId) {
		this.conatctId = conatctId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Character getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(Character activeSw) {
		this.activeSw = activeSw;
	}

	public LocalDate getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		CreatedDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		UpdatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Contact [conatctId=" + conatctId + ", contactName=" + contactName + ", contactNumber=" + contactNumber
				+ ", contactEmail=" + contactEmail + ", activeSw=" + activeSw + ", CreatedDate=" + CreatedDate
				+ ", UpdatedDate=" + UpdatedDate + "]";
	}
	
	
	
}
