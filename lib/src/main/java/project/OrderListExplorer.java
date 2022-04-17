package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderListExplorer {
	private List<Order> orders;

	private Logger logger = Logger.getLogger(OrderListExplorer.class.getName());

	public OrderListExplorer() {
		this.orders = setOrders();
	}
	
	public List<Order> setOrders(){
		Order OImg = new Order("IMG", 10);
		Order OFlac = new Order("FLAC", 15);
		Order OVid = new Order("VID", 13);

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(OImg);
		orderList.add(OFlac);
		orderList.add(OVid);


		return orderList;
	}
	
	public void printOrderListInfo() {
		for (int i = 0; i < this.orders.size(); i++) {
			orders.get(i).printInfo();
		}
	}
	
	public Map<String,Integer> getCodeAndAmount(){
		Map<String,Integer> s = new HashMap<String,Integer>();
		for (int i = 0; i < this.orders.size(); i++) {
			s.put(orders.get(i).getFormatCode(),orders.get(i).getAmount());
		}
		System.out.println(s);
		return s;
	}
	
	public List<Integer> getAllOrderAmount(){
		List<Integer> s = new ArrayList<Integer>();
		for (int i = 0; i < this.orders.size(); i++) {
			s.add(orders.get(i).getAmount());
		}
		return s;
	}

	public Order getOrdersByIndex(int i) {
		// check if index exist
		try {
			orders.get(i);
		}

		catch (Exception e) {
			logger.log(Level.WARNING, "OrderList Index Error: " + e.getMessage());
		}
		return orders.get(i);
	}

	public Order getOrdersByFormatCode(String s) {
		Order temp = null;
		for (int i = 0; i < this.orders.size(); i++) {
			if (orders.get(i).getFormatCode().toLowerCase().contains(s.toLowerCase())) {
				temp = orders.get(i);
			}
		}
		if (temp == null) {
			logger.log(Level.INFO, "No matched formatCode");
		}
		return temp;
	}

}
