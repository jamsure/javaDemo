package com.java.demo.entity;

import java.io.Serializable;

/**
 * @author fankai
 */
public class BaseEntity implements Serializable{
	private int pageSize=10;
	private int pageNo=0;
	private long totalNum;
	private String totalMappedStatementId;
	
	
	private long shardValue = 0L;

	public BaseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaseEntity(int pageSize, int pageNo, int totalNum) {
		super();
		this.pageSize = pageSize;
		this.pageNo = pageNo;
		this.totalNum = totalNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public long getShardValue() {
		return shardValue;
	}

	public void setShardValue(long shardValue) {
		this.shardValue = shardValue;
	}

	public String getTotalMappedStatementId() {
		return totalMappedStatementId;
	}

	public void setTotalMappedStatementId(String totalMappedStatementId) {
		this.totalMappedStatementId = totalMappedStatementId;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public long getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(long totalNum) {
		this.totalNum = totalNum;
	}

}