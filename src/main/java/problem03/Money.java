package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		return new Money(amount + money.getAmount());
	}

	public Money minus(Money money) {
		return new Money(amount - money.getAmount());
	}

	public Money multiply(Money money) {
		return new Money(amount * money.getAmount());
	}

	public Money devide(Money money) {
		return new Money(amount / money.getAmount());
	}

	public boolean equals(Money money) {
		if(amount == money.getAmount()) {
			return true;
		}
		else {
			return false;
		}
	}
}