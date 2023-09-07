package com.foly.db;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * 
 * 	MemberDTO : DB에 저장되는 테이블의 데이터를 저장하는 클래스 [박스]
 *	(Data Transfer Object)
 *
 *	MemberBean(자바빈) -> memberDTO
 *
 */


public class DTO {
	
	private int user_num;
	private int bo_value;
	private int bo_num;
	private Timestamp bo_date;
	private int bo_per;
	private int pk_num;
	private int bo_state;
	private int bo_count;
	private int bo_price;
	private int pay_num;
	public int getUser_num() {
		return user_num;
	}
	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}
	public int getBo_value() {
		return bo_value;
	}
	public void setBo_value(int bo_value) {
		this.bo_value = bo_value;
	}
	public int getBo_num() {
		return bo_num;
	}
	public void setBo_num(int bo_num) {
		this.bo_num = bo_num;
	}
	public Timestamp getBo_date() {
		return bo_date;
	}
	public void setBo_date(Timestamp bo_date) {
		this.bo_date = bo_date;
	}
	public int getBo_per() {
		return bo_per;
	}
	public void setBo_per(int bo_per) {
		this.bo_per = bo_per;
	}
	public int getPk_num() {
		return pk_num;
	}
	public void setPk_num(int pk_num) {
		this.pk_num = pk_num;
	}
	public int getBo_state() {
		return bo_state;
	}
	public void setBo_state(int bo_state) {
		this.bo_state = bo_state;
	}
	public int getBo_count() {
		return bo_count;
	}
	public void setBo_count(int bo_count) {
		this.bo_count = bo_count;
	}
	public int getBo_price() {
		return bo_price;
	}
	public void setBo_price(int bo_price) {
		this.bo_price = bo_price;
	}
	public int getPay_num() {
		return pay_num;
	}
	public void setPay_num(int pay_num) {
		this.pay_num = pay_num;
	}
	
	@Override
	public String toString() {
		return "DTO [user_num=" + user_num + ", bo_value=" + bo_value + ", bo_num=" + bo_num + ", bo_date=" + bo_date
				+ ", bo_per=" + bo_per + ", pk_num=" + pk_num + ", bo_state=" + bo_state + ", bo_count=" + bo_count
				+ ", bo_price=" + bo_price + ", pay_num=" + pay_num + "]";
	}
	
	
	
	
	// alt shift s + r
	
	
	
	
	
	
	
	
	
}
