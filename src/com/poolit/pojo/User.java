package com.poolit.pojo;

public class User {
	
	/*  `USER_ID` INT NOT NULL AUTO_INCREMENT,
	  `EMAIL` VARCHAR(45) NOT NULL,
	  `MOBILE_NO` INT NOT NULL,
	  `PASSWORD` VARCHAR(45) NOT NULL,
	  `DOB` DATE NOT NULL,
	  `GENDER` VARCHAR(45) NOT NULL,
	  `BANK_NAME` VARCHAR(45) NULL,
	  `IFSC_CODE` VARCHAR(45) NULL,
	  `ACCOUNT_NUMBER` INT NULL,
	  `BRANCH_NAME` VARCHAR(45) NULL,
	  `ID_PROOF` VARCHAR(45) NULL,
	  `PAN_CARD` VARCHAR(45) NULL,
	  `PHOTO` VARCHAR(300) NULL,
	  `IS_POOLIT_USER` TINYINT(1) NOT NULL,
	  `ADDRESS` VARCHAR(500) NULL,
	  `CREATED_TIME` DATETIME NOT NULL,
	  `END_TIME` DATETIME NULL,*/
	private String USER_ID;
	private String EMAIL;
	private String MOBILE_NO;
	private String PASSWORD;
	private String DOB;
	private String GENDER;
	private String BANK_NAME;
	private String IFSC_CODE;
	private String ACCOUNT_NUMBER;
	private String BRANCH_NAME;
	private String ID_PROOF;
	private String PAN_CARD;
	private String PHOTO;
	private String IS_POOLIT_USER;
	private String ADDRESS;
	private String CREATED_TIME;
	private String END_TIME;
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getMOBILE_NO() {
		return MOBILE_NO;
	}
	public void setMOBILE_NO(String mOBILE_NO) {
		MOBILE_NO = mOBILE_NO;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public String getBANK_NAME() {
		return BANK_NAME;
	}
	public void setBANK_NAME(String bANK_NAME) {
		BANK_NAME = bANK_NAME;
	}
	public String getIFSC_CODE() {
		return IFSC_CODE;
	}
	public void setIFSC_CODE(String iFSC_CODE) {
		IFSC_CODE = iFSC_CODE;
	}
	public String getACCOUNT_NUMBER() {
		return ACCOUNT_NUMBER;
	}
	public void setACCOUNT_NUMBER(String aCCOUNT_NUMBER) {
		ACCOUNT_NUMBER = aCCOUNT_NUMBER;
	}
	public String getBRANCH_NAME() {
		return BRANCH_NAME;
	}
	public void setBRANCH_NAME(String bRANCH_NAME) {
		BRANCH_NAME = bRANCH_NAME;
	}
	public String getID_PROOF() {
		return ID_PROOF;
	}
	public void setID_PROOF(String iD_PROOF) {
		ID_PROOF = iD_PROOF;
	}
	public String getPAN_CARD() {
		return PAN_CARD;
	}
	public void setPAN_CARD(String pAN_CARD) {
		PAN_CARD = pAN_CARD;
	}
	public String getPHOTO() {
		return PHOTO;
	}
	public void setPHOTO(String pHOTO) {
		PHOTO = pHOTO;
	}
	public String getIS_POOLIT_USER() {
		return IS_POOLIT_USER;
	}
	public void setIS_POOLIT_USER(String iS_POOLIT_USER) {
		IS_POOLIT_USER = iS_POOLIT_USER;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getCREATED_TIME() {
		return CREATED_TIME;
	}
	public void setCREATED_TIME(String cREATED_TIME) {
		CREATED_TIME = cREATED_TIME;
	}
	public String getEND_TIME() {
		return END_TIME;
	}
	public void setEND_TIME(String eND_TIME) {
		END_TIME = eND_TIME;
	}
	

}
