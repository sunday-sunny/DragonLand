package com.project.data;

public class DailySales {
	//날짜(YYYYMMDD)■성인매수■청소년매수■어린이매수■성인금액■청소년금액■어린이금액■일별 총 인원■일별 총 금액

	private String Date;
	private String adultCount;
	private String youthCount;
	private String kidCount;
	private String adultPrice;
	private String youthPrice;
	private String kidPrice;
	private String totalCount;
	private String totalPrice;
	
	
	
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getAdultCount() {
		return adultCount;
	}
	public void setAdultCount(String adultCount) {
		this.adultCount = adultCount;
	}
	public String getYouthCount() {
		return youthCount;
	}
	public void setYouthCount(String youthCount) {
		this.youthCount = youthCount;
	}
	public String getKidCount() {
		return kidCount;
	}
	public void setKidCount(String kidCount) {
		this.kidCount = kidCount;
	}
	public String getAdultPrice() {
		return adultPrice;
	}
	public void setAdultPrice(String adultPrice) {
		this.adultPrice = adultPrice;
	}
	public String getYouthPrice() {
		return youthPrice;
	}
	public void setYouthPrice(String youthPrice) {
		this.youthPrice = youthPrice;
	}
	public String getKidPrice() {
		return kidPrice;
	}
	public void setKidPrice(String kidPrice) {
		this.kidPrice = kidPrice;
	}
	public String getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
