package com.springcore.lcycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Desk implements InitializingBean,DisposableBean{
	private String tableName;
	private double tablePrice;
	private String tableType;
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public double getTablePrice() {
		return tablePrice;
	}
	public void setTablePrice(double tablePrice) {
		this.tablePrice = tablePrice;
	}
	public String getTableType() {
		return tableType;
	}
	public void setTableType(String tableType) {
		this.tableType = tableType;
	}
	public Desk() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Desk [tableName=" + tableName + ", tablePrice=" + tablePrice + ", tableType=" + tableType + "]";
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Desk Details");
	}
	public void destroy() throws Exception {
		System.out.println("Desk Released");
	}
	
}
