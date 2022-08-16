package com.assignments;

import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier {

	public static void main(String[] args) {
		
		Supplier<String> genrateOTP2=
			 () -> {
				StringBuilder otp = new StringBuilder();
				Random random = new Random();

				for (int i = 0; i < 6; i++) {

					// returns pseudo-random value between 0 and 9
					int randomNumber = random.nextInt(9);
					otp.append(randomNumber);
				}
				return otp.toString();
			};
		}
			
	}


