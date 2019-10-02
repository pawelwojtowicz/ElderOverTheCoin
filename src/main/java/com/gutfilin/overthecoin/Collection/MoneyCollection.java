package com.gutfilin.overthecoin.Collection;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gutfilin.overthecoin.Class.SchoolClass;

@Entity
public class MoneyCollection {
	
	@Id
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
