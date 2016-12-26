package com.stock.tp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="brand_entries")
public class BrandDetails implements Serializable{

	private static final long serialVersionUID = -723583058586873479L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "stock_id")
	private Integer stockId;
	
	@Column(name = "brand_name")
	private String brandName;
	
	@Column(name="brand_article_no")
	private String brandArticleNo;
	
	@Column(name="brand_item_no")
	private Integer brandItemNo;
	
	@Column(name="brand_size")
	private Integer brandSize;
	
	@Column(name="brand_cost")
	private Integer brandCost;
	
	@Column(name="brand_company_name")
	private String brandCompanyName;
	
	@Column(name="available_sizes")
	private String availableSizes;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="complaints")
	private String complaints;
	
	
	
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandArticleNo() {
		return brandArticleNo;
	}
	public void setBrandArticleNo(String brandArticleNo) {
		this.brandArticleNo = brandArticleNo;
	}
	public Integer getBrandItemNo() {
		return brandItemNo;
	}
	public void setBrandItemNo(Integer brandItemNo) {
		this.brandItemNo = brandItemNo;
	}
	public Integer getBrandSize() {
		return brandSize;
	}
	public void setBrandSize(Integer brandSize) {
		this.brandSize = brandSize;
	}
	public Integer getBrandCost() {
		return brandCost;
	}
	public void setBrandCost(Integer brandCost) {
		this.brandCost = brandCost;
	}
	public String getBrandCompanyName() {
		return brandCompanyName;
	}
	public void setBrandCompanyName(String brandCompanyName) {
		this.brandCompanyName = brandCompanyName;
	}
	public String getAvailableSizes() {
		return availableSizes;
	}
	public void setAvailableSizes(String availableSizes) {
		this.availableSizes = availableSizes;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getComplaints() {
		return complaints;
	}
	public void setComplaints(String complaints) {
		this.complaints = complaints;
	}
	
	}
