package com.car.app.carscraporder.app.bean;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class CarScrapOrderBaseVO {
	
	private String id;
	
    @ApiModelProperty(value = "报案号")
	private String reportNo;

	@ApiModelProperty(value = "车牌号")
    private String carNumber;

	@ApiModelProperty(value = "车架号")
    private String carFrameNumber;
	
	@ApiModelProperty(value = "车辆型号(数据来源车型号数据字典)")
    private String carModelNumber;
	
	@ApiModelProperty(value = "无法接收原因")
	private Integer unableReceiveReason;

	@ApiModelProperty(value = "二次报价金额")
	private BigDecimal sinceQuote;

	@ApiModelProperty(value = "业务员现场调整价格原因")
	private String adjustWhy;
	
	
	

	public Integer getUnableReceiveReason() {
		return unableReceiveReason;
	}

	public void setUnableReceiveReason(Integer unableReceiveReason) {
		this.unableReceiveReason = unableReceiveReason;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReportNo() {
		return reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarFrameNumber() {
		return carFrameNumber;
	}

	public void setCarFrameNumber(String carFrameNumber) {
		this.carFrameNumber = carFrameNumber;
	}

	public String getCarModelNumber() {
		return carModelNumber;
	}

	public void setCarModelNumber(String carModelNumber) {
		this.carModelNumber = carModelNumber;
	}

	public BigDecimal getSinceQuote() {
		return sinceQuote;
	}

	public void setSinceQuote(BigDecimal sinceQuote) {
		this.sinceQuote = sinceQuote;
	}

	public String getAdjustWhy() {
		return adjustWhy;
	}

	public void setAdjustWhy(String adjustWhy) {
		this.adjustWhy = adjustWhy;
	}
}
