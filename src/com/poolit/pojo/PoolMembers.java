package com.poolit.pojo;

public class PoolMembers {

	/*`POOL_MEMBER_RECORD_ID` INT NOT NULL AUTO_INCREMENT,
	  `POOL_MEMBER_USER_ID` INT NOT NULL,
	  `POOL_ID` INT NOT NULL,
	  `CONTRIBUTED_AMT` INT ZEROFILL NULL,
	  `COMMENT` VARCHAR(45) NULL,
	  */
	private String POOL_MEMBER_RECORD_ID;
	private String POOL_MEMBER_USER_ID;
	private String POOL_ID;
	private String CONTRIBUTED_AMT;
	private String COMMENT;
	public String getPOOL_MEMBER_RECORD_ID() {
		return POOL_MEMBER_RECORD_ID;
	}
	public void setPOOL_MEMBER_RECORD_ID(String pOOL_MEMBER_RECORD_ID) {
		POOL_MEMBER_RECORD_ID = pOOL_MEMBER_RECORD_ID;
	}
	public String getPOOL_MEMBER_USER_ID() {
		return POOL_MEMBER_USER_ID;
	}
	public void setPOOL_MEMBER_USER_ID(String pOOL_MEMBER_USER_ID) {
		POOL_MEMBER_USER_ID = pOOL_MEMBER_USER_ID;
	}
	public String getPOOL_ID() {
		return POOL_ID;
	}
	public void setPOOL_ID(String pOOL_ID) {
		POOL_ID = pOOL_ID;
	}
	public String getCONTRIBUTED_AMT() {
		return CONTRIBUTED_AMT;
	}
	public void setCONTRIBUTED_AMT(String cONTRIBUTED_AMT) {
		CONTRIBUTED_AMT = cONTRIBUTED_AMT;
	}
	public String getCOMMENT() {
		return COMMENT;
	}
	public void setCOMMENT(String cOMMENT) {
		COMMENT = cOMMENT;
	}
	
}
