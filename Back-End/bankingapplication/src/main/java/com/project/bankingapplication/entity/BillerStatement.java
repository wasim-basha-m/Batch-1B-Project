package com.project.bankingapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BillerStatement")
public class BillerStatement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = true)
	public long id;

	@Column(name = "Acc_Number")
	public long accNumber;

	@Column(name = "Type")
	public String type;

	@Column(name = "Amount_Fk")
	public int amount;

	@Column(name = "Trans_Id_Fk")
	public long transIdFk;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name ="Trans_Id_Fk",nullable = false)
//	private BillerStatment billerStatement;

	@Column(name = "TimeStamp")
	public long timeStamp;

	public BillerStatement(long accNumber, String type, int amount, long transIdFk, long timeStamp) {
		super();
		this.accNumber = accNumber;
		this.type = type;
		this.amount = amount;
		this.transIdFk = transIdFk;
		this.timeStamp = timeStamp;
	}

//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinColumn(name ="Amount_Fk",nullable = false)
//	private BillerPayment billerPayments;

}
