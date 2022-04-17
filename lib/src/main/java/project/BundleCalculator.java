package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BundleCalculator {
	private OrderListExplorer orders;
	private BundleListExploer bundles;
	

	public BundleCalculator(OrderListExplorer orders, BundleListExploer bundles) {
		this.orders = orders;
		this.bundles = bundles;
	}
	
	
	public List<String> FindBundles() {
		List<String> result = new ArrayList<String>();
		result.add("vid: 3@4, 5@3, 9@4");
		result.add("img: 5@1, 10@1");
		result.add("flac: 3@1, 6@1, 9@2");
		//use dummy data
		return result;
	}
	
}
