package com.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


	interface Demo{
		public String[] findColorStartWithB(String arr[]) ;
	}
	public class Assignment01SumLambda {

		public static void main(String[] args) {
			
			String  colur[]={"Black","Blue","Green"," ","d",null," ","e"};
			
			Demo obj = (a) -> {
				String[] sortedColor = new String[colur.length];
				int i = 0;
				for(String str : a) {
					if(str != null && str.startsWith("B") && str != "") {
						sortedColor[i] = str;
						i++;
					}
				}
				return sortedColor;
			};
			String[] result = obj.findColorStartWithB(colur);
			System.out.println("Color started with B, Null & blank removed as bellow");
			for(String ae : result) {
				if(ae != null)
				System.out.print(ae+"\t");
			}
		}
	}