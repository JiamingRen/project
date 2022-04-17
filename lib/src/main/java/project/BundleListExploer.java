package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BundleListExploer {
	private List<Bundle> bundles;

	private Logger logger = Logger.getLogger(BundleListExploer.class.getName());

	public BundleListExploer() {
		this.bundles = setBundles();
	}

	public List<Bundle> setBundles() {
		// initialize bundle
		Bundle BVid = new Bundle("vid", Arrays.asList(3, 5, 9), Arrays.asList(570.0, 900.0, 1530.0));
		Bundle BImg = new Bundle("img", Arrays.asList(5, 10), Arrays.asList(450.0, 800.0));
		Bundle BFlac = new Bundle("flac", Arrays.asList(3, 6, 9), Arrays.asList(427.5, 810.0, 1147.5));

		List<Bundle> bundleList = new ArrayList<Bundle>();
		bundleList.add(BVid);
		bundleList.add(BImg);
		bundleList.add(BFlac);
		
		return bundleList;
	}

	public void printBundleListInfo() {
		for (int i = 0; i < this.bundles.size(); i++) {
			bundles.get(i).printInfo();
		}
	}
	
	public Map<String,Map<List<Integer>,List<Double>>> getCodeAndAmount(){
		 Map<String,Map<List<Integer>,List<Double>>> s = new HashMap<String,Map<List<Integer>,List<Double>>>();
		for (int i = 0; i < this.bundles.size(); i++) {
			Map<List<Integer>,List<Double>> temp = new HashMap<List<Integer>,List<Double>>();
			temp.put(bundles.get(i).getSize(), bundles.get(i).getPrice());
			s.put(bundles.get(i).getFormatCode(),temp);
		}
		return s;
	}

	public Bundle getBundleByIndex(int i) {
		// check if index exist
		try {
			bundles.get(i);
		}

		catch (Exception e) {
			logger.log(Level.WARNING, "BundleList Index Error: " + e.getMessage());
		}
		return bundles.get(i);
	}

	public Bundle getBundleByFormatCode(String s) {
		Bundle temp = null;
		for (int i = 0; i < this.bundles.size(); i++) {
			if (bundles.get(i).getFormatCode().toLowerCase().contains(s.toLowerCase())) {
				temp = bundles.get(i);
			}
		}
		if (temp == null) {
			logger.log(Level.INFO, "No matched formatCode");
		}
		return temp;
	}
}