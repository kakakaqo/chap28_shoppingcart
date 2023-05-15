package com.javalab.shopping.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class User {

	// 필드
	private String userId; // 유저아이디
	private String userEmail; // 유저이메일
	private String userName; // 유저이름
	private String userPwd; // 유저비밀번호
	private String userHp; //
	private String createDate; // 생성날짜

//	// 기본 생성자
//	public User() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public User(String userId, String userEmail, String userName, String userPwd, String userHp, String createDate) {
//		super();
//		this.userId = userId;
//		this.userEmail = userEmail;
//		this.userName = userName;
//		this.userPwd = userPwd;
//		this.userHp = userHp;
//		this.createDate = createDate;
//	}
//
//	// 오버로딩 생성자
//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//
//	public String getUserEmail() {
//		return userEmail;
//	}
//
//	public void setUserEmail(String userEmail) {
//		this.userEmail = userEmail;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public String getUserPwd() {
//		return userPwd;
//	}
//
//	public void setUserPwd(String userPwd) {
//		this.userPwd = userPwd;
//	}
//
//	public String getUserHp() {
//		return userHp;
//	}
//
//	public void setUserHp(String userHp) {
//		this.userHp = userHp;
//	}
//
//	public String getCreateDate() {
//		return createDate;
//	}
//
//	public void setCreateDate(String createDate) {
//		this.createDate = createDate;
//	}
//
//	// 디버깅용 toString()
//	@Override
//	public String toString() {
//		return "User [userId=" + userId + ", userEmail=" + userEmail + ", userName=" + userName + ", userPwd=" + userPwd
//				+ ", userHp=" + userHp + ", createDate=" + createDate + "]";
//	}

}
