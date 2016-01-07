package com.ep.lib;

public class ExpenseDetails {

	public ExpenseDetails() {
		super();
	}

	public ExpenseDetails(String name, Double amount, String method,
			String description, String rawInput) {
		super();
		this.name = name;
		this.amount = amount;
		this.method = method;
		this.description = description;
		this.rawInput = rawInput;
	}

	private String name;
	private Double amount;
	private String method;
	private String description;
	private String rawInput;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}
	/**
	 * @param method the method to set
	 */
	public void setMethod(String method) {
		this.method = method;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the rawInput
	 */
	public String getRawInput() {
		return rawInput;
	}
	/**
	 * @param rawInput the rawInput to set
	 */
	public void setRawInput(String rawInput) {
		this.rawInput = rawInput;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExpenseDetails [name=" + name + ", amount=" + amount
				+ ", method=" + method + ", description=" + description
				+ ", rawInput=" + rawInput + "]";
	}
	
}
