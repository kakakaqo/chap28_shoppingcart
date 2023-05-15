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
public class Category {

	// 필드
	private String categoryId;
	private String categoryName;
	private String categoryDesc;
	private String createDeate;
	
//	// 기본 생성자
//	public Category() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	// 오버로딩 생성자
//	public Category(String categoryId, String categoryName, String categoryDesc, String createDeate) {
//		super();
//		this.categoryId = categoryId;
//		this.categoryName = categoryName;
//		this.categoryDesc = categoryDesc;
//		this.createDeate = createDeate;
//	}
//	
//	// 게터/세터
//	public String getCategoryId() {
//		return categoryId;
//	}
//	public void setCategoryId(String categoryId) {
//		this.categoryId = categoryId;
//	}
//	public String getCategoryName() {
//		return categoryName;
//	}
//	public void setCategoryName(String categoryName) {
//		this.categoryName = categoryName;
//	}
//	public String getCategoryDesc() {
//		return categoryDesc;
//	}
//	public void setCategoryDesc(String categoryDesc) {
//		this.categoryDesc = categoryDesc;
//	}
//	public String getCreateDeate() {
//		return createDeate;
//	}
//	public void setCreateDeate(String createDeate) {
//		this.createDeate = createDeate;
//	}
//	
//	// 디버깅용 to String()
//	@Override
//	public String toString() {
//		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDesc="
//				+ categoryDesc + ", createDeate=" + createDeate + "]";
//	}
}
