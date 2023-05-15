package com.javalab.shopping.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cart extends Product {

	// 필드
	private String userId;
	private String porductId;
	private int quantity;
	private int unitPrice;
	private Date createDate;

	// 사용 편의를 위한 변수(DB에는 없지만 조회할 때 필요)
	private String createDateFrom;
	private String createDateTo;

	// 기본 생성자
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// 오버로딩 생성자
	public Cart(String userId, String porductId, int quantity, int unitPrice) {
		super();
		this.userId = userId;
		this.porductId = porductId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	// 오버로딩 생성자
	public Cart(String userId, String porductId, String productName, int quantity, int unitPrice) {
		super();
		this.userId = userId;
		this.porductId = porductId;
		super.setProductName(productName);
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		
	}

//	// 게터/세터
//	public String getUserId() {
//		return userId;
//	}
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//	public String getPorductId() {
//		return porductId;
//	}
//	public void setPorductId(String porductId) {
//		this.porductId = porductId;
//	}
//	public int getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	public int getUnitPrice() {
//		return unitPrice;
//	}
//	public void setUnitPrice(int unitPrice) {
//		this.unitPrice = unitPrice;
//	}
//	public Date getCreateDate() {
//		return createDate;
//	}
//	public void setCreateDate(Date createDate) {
//		this.createDate = createDate;
//	}
//	public String getCreateDateFrom() {
//		return createDateFrom;
//	}
//	public void setCreateDateFrom(String createDateFrom) {
//		this.createDateFrom = createDateFrom;
//	}
//	public String getCreateDateTo() {
//		return createDateTo;
//	}
//	public void setCreateDateTo(String createDateTo) {
//		this.createDateTo = createDateTo;
//	}
//	
//	// 디버깅용 to String()
//	@Override
//	public String toString() {
//		return "Cart [userId=" + userId + ", porductId=" + porductId + ", quantity=" + quantity + ", unitPrice="
//				+ unitPrice + ", createDate=" + createDate + ", createDateFrom=" + createDateFrom + ", createDateTo="
//				+ createDateTo + "]";
//	}
}
