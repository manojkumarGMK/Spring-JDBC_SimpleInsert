package com.wb.entity;

import java.math.BigDecimal;

public class LoancheckDB {

	private Integer ColumnID;
	private BigDecimal AccountNumber;
	private boolean loanStatus;
	
	public LoancheckDB() {
		System.out.println("LoanChck_DatabASE.....");
	}
	
	public Integer getColumnID() {
		return ColumnID;
	}
	public void setColumnID(Integer columnID) {
		ColumnID = columnID;
	}
	public BigDecimal getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(BigDecimal accountNumber) {
		AccountNumber = accountNumber;
	}
	public boolean isLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(boolean loanStatus) {
		this.loanStatus = loanStatus;
	}
	
	
	
}
