package com.company;
/**
 * 
 * @author Regina Wong
 *
 * This class that represents food that have a boolean if it is healthy or not, and message(fun fact about the food)
 */
public class Food {
	private boolean isHealthy = false;
	private String name = "";
	private String wrongMessage = "";
	private String correctMessage = "";
	
	/**
	 * A constructor that makes a new food objects 
	 * @param isHealthy
	 * 	true if the food is healthy, and false otherwise
	 * @param name
	 * 	the name of the food
	 * @param wrongMessage
	 * 	a nutrition fact about the food
	 * @param correctMessage
	 * 	a fun fact about the food
	 */
	public Food(boolean isHealthy, String name, String wrongMessage, String correctMessage) {
		super();
		this.isHealthy = isHealthy;
		this.name = name;
		this.wrongMessage = wrongMessage;
		this.correctMessage = correctMessage;
	}
	
	/**
	 * Returns if the food is healthy
	 * @return
	 * 	true if the food is healthy, and false otherwise
	 */
	public boolean isHealthy() {
		return isHealthy;
	}
	
	/**
	 * Sets if the food is healthy
	 * @param isHealthy
	 * 	true if the food is healthy, and false otherwise
	 */
	public void setHealthy(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}
	
	/**
	 * Returns the name of the food
	 * @return
	 * 	the name of the food
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets a new name for the food
	 * @param name
	 * 	the new name for the food
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * returns a nutrition fact about the food
	 * @return
	 * 	a nutrition fact about the food
	 */
	public String getWrongMessage() {
		return wrongMessage;
	}

	/**
	 * set nutrition fact about the food
	 * @param wrongMessage
	 * 	a nutrition fact about the food
	 */
	public void setWrongMessage(String wrongMessage) {
		this.wrongMessage = wrongMessage;
	}

	/**
	 * return a fun fact about the food
	 * @return
	 * 	a fun fact about the food
	 */
	public String getCorrectMessage() {
		return correctMessage;
	}

	/**
	 * set a fun fact for the food
	 * @param correctMessage
	 * 	a fun fact about the food
	 */
	public void setCorrectMessage(String correctMessage) {
		this.correctMessage = correctMessage;
	}

	
}
