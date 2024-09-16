package com.test1;

public class ManagedDataQuality {
	private String numberOfDimensions;
	private String completeness;
	private String uniqueness;
	private String validity;
	private String timeliness;
	private String accuracy;
	private String consistency;
	private String fitnessForPurpose;
	private String betterBusinessDecisions;
	private String otherOptions;

	public ManagedDataQuality() {

	}

	public ManagedDataQuality(String numberOfDimensions, String completeness, String uniqueness, String validity,
			String timeliness, String accuracy, String consistency, String fitnessForPurpose,
			String betterBusinessDecisions, String otherOptions) {
		super();
		this.numberOfDimensions = numberOfDimensions;
		this.completeness = completeness;
		this.uniqueness = uniqueness;
		this.validity = validity;
		this.timeliness = timeliness;
		this.accuracy = accuracy;
		this.consistency = consistency;
		this.fitnessForPurpose = fitnessForPurpose;
		this.betterBusinessDecisions = betterBusinessDecisions;
		this.otherOptions = otherOptions;
	}

	public String getNumberOfDimensions() {
		return numberOfDimensions;
	}

	public void setNumberOfDimensions(String numberOfDimensions) {
		this.numberOfDimensions = numberOfDimensions;
	}

	public String getCompleteness() {
		return completeness;
	}

	public void setCompleteness(String completeness) {
		this.completeness = completeness;
	}

	public String getUniqueness() {
		return uniqueness;
	}

	public void setUniqueness(String uniqueness) {
		this.uniqueness = uniqueness;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public String getTimeliness() {
		return timeliness;
	}

	public void setTimeliness(String timeliness) {
		this.timeliness = timeliness;
	}

	public String getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

	public String getConsistency() {
		return consistency;
	}

	public void setConsistency(String consistency) {
		this.consistency = consistency;
	}

	public String getFitnessForPurpose() {
		return fitnessForPurpose;
	}

	public void setFitnessForPurpose(String fitnessForPurpose) {
		this.fitnessForPurpose = fitnessForPurpose;
	}

	public String getBetterBusinessDecisions() {
		return betterBusinessDecisions;
	}

	public void setBetterBusinessDecisions(String betterBusinessDecisions) {
		this.betterBusinessDecisions = betterBusinessDecisions;
	}

	public String getOtherOptions() {
		return otherOptions;
	}

	public void setOtherOptions(String otherOptions) {
		this.otherOptions = otherOptions;
	}

}
