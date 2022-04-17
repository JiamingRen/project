package project;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bill {
	private List <String> billList;
	
	private Logger logger = Logger.getLogger(Bill.class.getName());
	
	public void printBill() {
		BundleListExploer bundles = new BundleListExploer();
		OrderListExplorer orders = new OrderListExplorer();
		BundleCalculator cal = new BundleCalculator(orders,bundles);
		billList = cal.FindBundles();
		logger.log(Level.INFO, Arrays.toString(billList.toArray()));
	}
}
