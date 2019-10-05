package com.gutfilin.overthecoin.Collection;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gutfilin.overthecoin.Class.SchoolClass;

@Entity
public class MoneyCollection {
	
	public long getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(long collectionId) {
		this.collectionId = collectionId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public SchoolClass getOwnClass() {
		return ownClass;
	}

	public void setOwnClass(SchoolClass ownClass) {
		this.ownClass = ownClass;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long collectionId;
	private String description;
	private String longDescription;
	private BigDecimal amount;
	private String dueDate;
	
    @ManyToOne()
    @JoinColumn(name = "classId", insertable = false, updatable = false)
    @JsonIgnoreProperties(value="collections")
	SchoolClass ownClass;


}
