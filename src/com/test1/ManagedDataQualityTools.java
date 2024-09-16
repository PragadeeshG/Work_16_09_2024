package com.test1;

public class ManagedDataQualityTools {
	private Integer toolCode;
	private String causeAndEffect;
	private String fishboneDiagram;
	private Integer ishikawaCode;
	private Integer scatterPoints;
	private String histograms;
	private Integer controlCharts;
	private Integer paretoCode;
	private String checkSheet;
	private Integer addOnSheet;
	private Integer stratification;
	private String qualityManagementResult;
	private String remarks;

	public ManagedDataQualityTools() {

	}

	public ManagedDataQualityTools(Integer toolCode, String causeAndEffect, String fishboneDiagram,
			Integer ishikawaCode, Integer scatterPoints, String histograms, Integer controlCharts, Integer paretoCode,
			String checkSheet, Integer addOnSheet, Integer stratification, String qualityManagementResult,
			String remarks) {
		super();
		this.toolCode = toolCode;
		this.causeAndEffect = causeAndEffect;
		this.fishboneDiagram = fishboneDiagram;
		this.ishikawaCode = ishikawaCode;
		this.scatterPoints = scatterPoints;
		this.histograms = histograms;
		this.controlCharts = controlCharts;
		this.paretoCode = paretoCode;
		this.checkSheet = checkSheet;
		this.addOnSheet = addOnSheet;
		this.stratification = stratification;
		this.qualityManagementResult = qualityManagementResult;
		this.remarks = remarks;
	}

	public Integer getToolCode() {
		return toolCode;
	}

	public void setToolCode(Integer toolCode) {
		this.toolCode = toolCode;
	}

	public String getCauseAndEffect() {
		return causeAndEffect;
	}

	public void setCauseAndEffect(String causeAndEffect) {
		this.causeAndEffect = causeAndEffect;
	}

	public String getFishboneDiagram() {
		return fishboneDiagram;
	}

	public void setFishboneDiagram(String fishboneDiagram) {
		this.fishboneDiagram = fishboneDiagram;
	}

	public Integer getIshikawaCode() {
		return ishikawaCode;
	}

	public void setIshikawaCode(Integer ishikawaCode) {
		this.ishikawaCode = ishikawaCode;
	}

	public Integer getScatterPoints() {
		return scatterPoints;
	}

	public void setScatterPoints(Integer scatterPoints) {
		this.scatterPoints = scatterPoints;
	}

	public String getHistograms() {
		return histograms;
	}

	public void setHistograms(String histograms) {
		this.histograms = histograms;
	}

	public Integer getControlCharts() {
		return controlCharts;
	}

	public void setControlCharts(Integer controlCharts) {
		this.controlCharts = controlCharts;
	}

	public Integer getParetoCode() {
		return paretoCode;
	}

	public void setParetoCode(Integer paretoCode) {
		this.paretoCode = paretoCode;
	}

	public String getCheckSheet() {
		return checkSheet;
	}

	public void setCheckSheet(String checkSheet) {
		this.checkSheet = checkSheet;
	}

	public Integer getAddOnSheet() {
		return addOnSheet;
	}

	public void setAddOnSheet(Integer addOnSheet) {
		this.addOnSheet = addOnSheet;
	}

	public Integer getStratification() {
		return stratification;
	}

	public void setStratification(Integer stratification) {
		this.stratification = stratification;
	}

	public String getQualityManagementResult() {
		return qualityManagementResult;
	}

	public void setQualityManagementResult(String qualityManagementResult) {
		this.qualityManagementResult = qualityManagementResult;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
