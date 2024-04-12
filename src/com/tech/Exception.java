package com.tech;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exception {

	public static void main(String[] args) {

		String str = "pournima mane shubham thonge pournima pournima shubham swapnil vaishanvi narlawar vaishanvi kadam kadam vaishanvi ";

		Map<String, Integer> hm = new HashMap<>();

		String arr[] = str.split(" ");

		for (String in : arr) {

			if (hm.containsKey(in)) {
				hm.put(in, hm.get(in) + 1);
			} else {
				hm.put(in, 1);
			}

		}

		for (Entry<String, Integer> e : hm.entrySet()) {

			if (e.getValue() >= 2) {
				System.out.println(e);

			}

		}

		System.out.println(" --- --- --- ");
		Map<String, Long> s = Arrays.stream(arr).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(s);

		
		
//		System.out.println(hm);
	}

}
