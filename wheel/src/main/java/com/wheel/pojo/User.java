package com.wheel.pojo;

import java.util.Date;

public class User {
	private Integer codeNo;

	private String codeValue;

	private String codeName;

	private String codeContent;

	private Date executionDate;

	public Integer getCodeNo() {
		return codeNo;
	}

	public void setCodeNo(Integer codeNo) {
		this.codeNo = codeNo;
	}

	public String getCodeValue() {
		return codeValue;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue == null ? null : codeValue.trim();
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName == null ? null : codeName.trim();
	}

	public String getCodeContent() {
		return codeContent;
	}

	public void setCodeContent(String codeContent) {
		this.codeContent = codeContent == null ? null : codeContent.trim();
	}

	public Date getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}
}