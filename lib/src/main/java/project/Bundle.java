package project;


import java.util.List;

// Get bundle size, formatCode, price
public class Bundle {
	private List<Integer> size;
	private String formatCode;
	private List<Double> price;

	
	public Bundle(String formatCode, List<Integer> size,  List<Double> price) {
		this.size = size;
		this.formatCode = formatCode;
		this.price = price;
	}
	
	
	public void printInfo() {
		System.out.println(formatCode);
		System.out.println(size);
		System.out.println(price);
	}
	
	
	public List<Integer> getSize(){
		return size;
	}
	
	public String getFormatCode(){
		return formatCode;
	}
	public List<Double> getPrice(){
		return price;
	}

}
