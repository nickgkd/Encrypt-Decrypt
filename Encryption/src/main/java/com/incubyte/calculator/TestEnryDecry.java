package com.incubyte.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestEnryDecry {

	public String encrypt(String str) {
		String alpa = "abcdefghijklmnopqrstuvwxyz";
		String key = "!)\"(£*%&><@abcdefghijklmno";

		char[] alpaArr = alpa.toCharArray();
		char[] keyArr = key.toCharArray();

		Map<Character, Character> hs = new HashMap<>();
		for (int i = 0; i < alpaArr.length; i++) {
			hs.put(alpaArr[i], keyArr[i]);
		}

		StringBuffer sb = new StringBuffer();
		char[] strArr = str.toCharArray();
		for (int i = 0; i < strArr.length; i++) {
			if (hs.containsKey(strArr[i])) {
				Character value = hs.get(strArr[i]);
				sb.append(value);
			}
		}

		String str1 = sb.toString();
		System.out.println("val->" + str1);
		return str1;
	}

	public String decrypt(String str) {
		String alpa = "abcdefghijklmnopqrstuvwxyz";
		String key = "!)\"(£*%&><@abcdefghijklmno";

		char[] alpaArr = alpa.toCharArray();
		char[] keyArr = key.toCharArray();

		Map<Character, Character> hs = new HashMap<>();
		for (int i = 0; i < alpaArr.length; i++) {
			hs.put(alpaArr[i], keyArr[i]);
		}

		StringBuffer sb = new StringBuffer();
		char[] strArr = str.toCharArray();
		for (int i = 0; i < strArr.length; i++) {
			for (Entry<Character, Character> entry : hs.entrySet()) {
				if (entry.getValue().equals(strArr[i])) {
					Character value = entry.getKey();
					sb.append(value);
				}
			}

		}

		String str1 = sb.toString();
		System.out.println("val->" + str1);
		return str1;

	}
}