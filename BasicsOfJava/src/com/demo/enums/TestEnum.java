package com.demo.enums;

import java.util.function.Predicate;
import java.util.regex.Pattern;

enum RegEx implements Predicate<String> {
	UPPER("[A-Z]+"), LOWER("[a-z]+"), NUMERIC("[+-]?[0-9]+");
	private final Pattern pattern;
	private RegEx(final String pattern) {
		this.pattern = Pattern.compile(pattern);
	}
	@Override
	public boolean test(final String input) {
		return this.pattern.matcher(input).matches();
	}

}


public class TestEnum {

	public static void main(String[] args) {

		for (Season s : Season.values()) {
			System.out.println(s.name());
		}


		System.out.println(Season.FALL == Season.WINTER); // false
		System.out.println(Season.SPRING == Season.SPRING); // true

		System.out.println(RegEx.UPPER.test("ABC"));
		 System.out.println(RegEx.LOWER.test("abc"));
		 System.out.println(RegEx.NUMERIC.test("+111"));

		int p = Coin.NICKEL.getValue(); // the int value will be 5
		System.out.println(p);
	}

}
