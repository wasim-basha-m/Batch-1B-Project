package com.project.bankingapplication.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ForeignKey;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BillerProvider")
public class BillerProvider {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id" , nullable = true)
	private long id;

	@Column(name = "ConsumerNumberFk")
	private long consumerNumberFk;
	
	@Column(name = "Acc_Number")
	private long accNumber;

	@Column(name= "Amount")
	private int amount;
	
	@Column(name = "Trans_Id")
	private long tansId;
	
	static LocalDate localDate;
	public static LocalDate getTimeStamp() {
		localDate = localDate.now();
		return localDate;
	}
	
	@Column(name = "TimeStamp")
	private LocalDate timeStamp;
	
	
	
}
