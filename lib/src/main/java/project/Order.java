package project;

public class Order {
	private String formatCode;
	private int amount;
	
	public Order(String formatCode, int amount){
		this.formatCode = formatCode;
		this.amount = amount;
	}

	public String getFormatCode(){
		return formatCode;
	}



	public int getAmount() {
		return amount;
	}


	
	public void printInfo() {
		System.out.println(formatCode);
		System.out.println(amount);
	}
}
