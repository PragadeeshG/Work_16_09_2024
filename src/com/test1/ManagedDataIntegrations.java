package com.test1;

public class ManagedDataIntegrations {
	private Integer sourceSystem;
	private String dataCatalogue;
	private String dataCleansing;
	private String connectors;
	private String dataIngestion;
	private String governance;
	private String migration;
	private String extaction;
	private String transformation;
	private String load;
	private String masterDataManagement;
	private String referenceDataManagement;
	private String middlewareData;
	private String commonDataStorage;

	public ManagedDataIntegrations() {

	}

	public ManagedDataIntegrations(Integer sourceSystem, String dataCatalogue, String dataCleansing, String connectors,
			String dataIngestion, String governance, String migration, String extaction, String transformation,
			String load, String masterDataManagement, String referenceDataManagement, String middlewareData,
			String commonDataStorage) {
		super();
		this.sourceSystem = sourceSystem;
		this.dataCatalogue = dataCatalogue;
		this.dataCleansing = dataCleansing;
		this.connectors = connectors;
		this.dataIngestion = dataIngestion;
		this.governance = governance;
		this.migration = migration;
		this.extaction = extaction;
		this.transformation = transformation;
		this.load = load;
		this.masterDataManagement = masterDataManagement;
		this.referenceDataManagement = referenceDataManagement;
		this.middlewareData = middlewareData;
		this.commonDataStorage = commonDataStorage;
	}

	public Integer getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(Integer sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getDataCatalogue() {
		return dataCatalogue;
	}

	public void setDataCatalogue(String dataCatalogue) {
		this.dataCatalogue = dataCatalogue;
	}

	public String getDataCleansing() {
		return dataCleansing;
	}

	public void setDataCleansing(String dataCleansing) {
		this.dataCleansing = dataCleansing;
	}

	public String getConnectors() {
		return connectors;
	}

	public void setConnectors(String connectors) {
		this.connectors = connectors;
	}

	public String getDataIngestion() {
		return dataIngestion;
	}

	public void setDataIngestion(String dataIngestion) {
		this.dataIngestion = dataIngestion;
	}

	public String getGovernance() {
		return governance;
	}

	public void setGovernance(String governance) {
		this.governance = governance;
	}

	public String getMigration() {
		return migration;
	}

	public void setMigration(String migration) {
		this.migration = migration;
	}

	public String getExtaction() {
		return extaction;
	}

	public void setExtaction(String extaction) {
		this.extaction = extaction;
	}

	public String getTransformation() {
		return transformation;
	}

	public void setTransformation(String transformation) {
		this.transformation = transformation;
	}

	public String getLoad() {
		return load;
	}

	public void setLoad(String load) {
		this.load = load;
	}

	public String getMasterDataManagement() {
		return masterDataManagement;
	}

	public void setMasterDataManagement(String masterDataManagement) {
		this.masterDataManagement = masterDataManagement;
	}

	public String getReferenceDataManagement() {
		return referenceDataManagement;
	}

	public void setReferenceDataManagement(String referenceDataManagement) {
		this.referenceDataManagement = referenceDataManagement;
	}

	public String getMiddlewareData() {
		return middlewareData;
	}

	public void setMiddlewareData(String middlewareData) {
		this.middlewareData = middlewareData;
	}

	public String getCommonDataStorage() {
		return commonDataStorage;
	}

	public void setCommonDataStorage(String commonDataStorage) {
		this.commonDataStorage = commonDataStorage;
	}

}
