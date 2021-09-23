package model;


/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
public class NumberGuess {
	private int correctNumber;
	private int userNumber;
	private final int MAX_RANDOM = 6;
	private final int MIN_RANDOM = 1;
	
	public NumberGuess(int guess) {
		this.userNumber = guess;
		resetCorrectNumber();
	}

	public int getCorrectNumber() {
		return correctNumber;
	}

	public void resetCorrectNumber() {
		int newNumber = (int)(Math.random() * MAX_RANDOM) + MIN_RANDOM;
		this.correctNumber = newNumber;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	
	public String checkGuess() {
		String message = "";
		if (userNumber == correctNumber) {
			message = "Congratulations, you are correct!";
		}
		else {
			message = "I'm sorry, you were incorrect! The correct number was " + correctNumber;
		}
		resetCorrectNumber();		
		return message;
	}

	@Override
	public String toString() {
		return "NumberGuess [correctNumber=" + correctNumber + ", userNumber=" + userNumber + ", MAX_RANDOM="
				+ MAX_RANDOM + ", MIN_RANDOM=" + MIN_RANDOM + "]";
	}
	
	
	

}
