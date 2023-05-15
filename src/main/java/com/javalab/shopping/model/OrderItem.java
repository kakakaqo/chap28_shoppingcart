package com.javalab.shopping.model;

import java.sql.Date;

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
public class OrderItem extends Product {

	// 필드
	private int orderItemId;
	private int orderId;
	private String productId;
	private int quantity;
	private int unitPrice;
	private int amt;
	private Date createDate;

//	// 기본 생성자
//	public OrderItem() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public OrderItem(String productId, String productName, String categoryId, int unitPrice, String image,
//			java.sql.Date createDate, String categoryName, String createDateForm, String createDateTo) {
//		super(productId, productName, categoryId, unitPrice, image, createDate, categoryName, createDateForm, createDateTo);
//		// TODO Auto-generated constructor stub
//	}
//
//	// 오버로딩 생성자
//	public OrderItem(int orderItemId, int orderId, String productId, int quantity, int unitPrice, int amt,
//			Date createDate) {
//		super();
//		this.orderItemId = orderItemId;
//		this.orderId = orderId;
//		this.productId = productId;
//		this.quantity = quantity;
//		this.unitPrice = unitPrice;
//		this.amt = amt;
//		this.createDate = createDate;
//	}
//
//	// 게터/세터
//	public int getOrderItemId() {
//		return orderItemId;
//	}
//
//	public void setOrderItemId(int orderItemId) {
//		this.orderItemId = orderItemId;
//	}
//
//	public int getOrderId() {
//		return orderId;
//	}
//
//	public void setOrderId(int orderId) {
//		this.orderId = orderId;
//	}
//
//	public String getProductId() {
//		return productId;
//	}
//
//	public void setProductId(String productId) {
//		this.productId = productId;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//	public int getUnitPrice() {
//		return unitPrice;
//	}
//
//	public void setUnitPrice(int unitPrice) {
//		this.unitPrice = unitPrice;
//	}
//
//	public int getAmt() {
//		return amt;
//	}
//
//	public void setAmt(int amt) {
//		this.amt = amt;
//	}
//
//	public Date getCreateDate() {
//		return createDate;
//	}
//
//	public void setCreateDate(Date createDate) {
//		this.createDate = createDate;
//	}
//
//	// 디버깅용 to String()
//	@Override
//	public String toString() {
//		return "OrderItem [orderItemId=" + orderItemId + ", orderId=" + orderId + ", productId=" + productId
//				+ ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", amt=" + amt + ", createDate=" + createDate
//				+ "]";
//	}

}
