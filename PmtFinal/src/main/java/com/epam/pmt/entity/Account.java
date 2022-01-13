package com.epam.pmt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.epam.pmt.encryptdecryptpassword.EncryptDecryptPassword;

@Entity
@Table(name = "Account_Table")
public class Account {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountId;
	@Column(name="domainUrl")
	private String url;
	@Column(name="domainusername")
	private String username;
	@Column(name="domainpassword")
	private String password;
	@Column(name="groupname")
	private String group;
	@ManyToOne(targetEntity = MasterUser.class)
	private MasterUser masterUser;
	
	public Account(String url, String username, String password, String group) {
		super();
		this.url = url;
		this.username = username;
		EncryptDecryptPassword obj = new EncryptDecryptPassword();
		this.password = obj.Encrypt(password);
		this.group = group;
	}

	@Override
	public String toString() {
		return "Account [url=" + url + ", userName=" + username + ", password=" + password + ", group=" + group + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}




	public MasterUser getMasterUser() {
		return masterUser;
	}

	public void setMasterUser(MasterUser masterUser) {
		this.masterUser = masterUser;
	}

	public Account() {
	super();
	}

	
	public int getAccountId() {
	return accountId;
	}



	public void setAccountId(int accountId) {
	this.accountId = accountId;
	}


	public String getGroup() {
	return group;
	}



	public void setGroup(String group) {
	this.group = group;
	}


	public String getDecryptedPassword() {
		EncryptDecryptPassword obj = new EncryptDecryptPassword();
		return obj.Decrypt(this.password);
	}
	
	
	
	

//	@Id
////	@GeneratedValue(strategy = GenerationType.IDENTITY)
////	@Column(name = "ID")
//	@TableGenerator(name="TABLE_GEN",table="T_GENERATOR",pkColumnName="GEN_KEY",pkColumnValue="TEST",valueColumnName="GEN_VALUE",initialValue=1,allocationSize=1)
//	@GeneratedValue(strategy=GenerationType.TABLE, generator="TABLE_GEN")
//	private int id;
//	@ManyToOne(targetEntity = MasterUser.class)
//	private MasterUser masterUser; 
//
//
//	@Column(name = "URL_Address", length = 64)
//	private String url;
//	
//
//	@Column(name = "User_Name", length = 64)
//	private String username;
//	@Column(name = "Password", length = 64)
//	private String password;
//
//	@Column(name = "Group")
//	private String group;
//	public MasterUser getMasterUser() {
//		return masterUser;
//	}
//	public Account() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	public void setMasterUser(MasterUser masterUser) {
//		this.masterUser = masterUser;
//	}
//	@Override
//	public String toString() {
//		return "Account [id=" + id + ", masterUser=" + masterUser + ", url=" + url + ", username=" + username
//				+ ", password=" + password + ", group=" + group + "]";
//	}
//
//	public Account(String url, String username, String password, String group) {
//		this.url = url;
//		this.username = username;
////		EncryptDecryptPassword obj = new EncryptDecryptPassword();
//		this.password = password;
////				obj.Encrypt(password);
//		this.group = group;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getUrl() {
//		return url;
//	}
//
//	public void setUrl(String url) {
//		this.url = url;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		EncryptDecryptPassword obj = new EncryptDecryptPassword();
//
//		this.password = obj.Encrypt(password);
//	}
//
//	public String getGroup() {
//		return group;
//	}
//
//	public void setGroup(String group) {
//		this.group = group;
//	}
//
//	public String getDecryptedPassword() {
//		EncryptDecryptPassword obj = new EncryptDecryptPassword();
//		return obj.Decrypt(this.password);
//	}

}
