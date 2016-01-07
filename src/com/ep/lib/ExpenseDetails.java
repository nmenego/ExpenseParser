package com.ep.lib;

public class ExpenseDetails {

	public ExpenseDetails() {
		super();
	}

	public ExpenseDetails(String description, Double amount) {
		super();
		this.description = description;
		this.amount = amount;
	}

	private String description;
	private Double amount;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExpenseDetails [description=" + description + ", amount="
				+ amount + "]";
	}


}
