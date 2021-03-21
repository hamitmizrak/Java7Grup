package com.ecodation.collectionmap;

import java.util.HashMap;
import java.util.Map;

public class MapTutorials {

	public static void main(String[] args) {
		Map<String, Object> mapList = new HashMap<String, Object>();
		mapList.put("0", "Hamit");
		mapList.put("1", "Alper");
		mapList.put("2", "Ege");
		mapList.put("3", "pelinsu");

		// lambda
		mapList.entrySet().forEach(System.out::println);

		// me.g.les
		for (Map.Entry<String, Object> tempList : mapList.entrySet()) {
			System.out.println(tempList);
		}

		// sadece key
		for (String keyList : mapList.keySet()) {
			System.out.print(keyList + " ");
		}
		System.out.println("\n-------------");
		for (Object valueList : mapList.values()) {
			System.out.print(valueList + " ");
		}

	}

}
