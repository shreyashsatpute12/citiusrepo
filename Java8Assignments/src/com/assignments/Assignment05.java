package com.assignments;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

public class Assignment05 {

	public static void main(String[] args) {

		
		String colur[] = { "Black", "Blue", "Green", " ", "d", null, " ", "e" };
		
		Predicate<String> predicate = str -> str.startsWith("B");
		
		int count = -1;
		String[] newarr = new String[colur.length];
		
		for (String str : colur) {
			if (!Objects.isNull(str) && predicate.test(str))
				newarr[++count] = str;
		}
		
		colur = Arrays.copyOf(newarr, count + 1);
		Arrays.stream(colur).forEach(s -> System.out.println(s));
	}

}
