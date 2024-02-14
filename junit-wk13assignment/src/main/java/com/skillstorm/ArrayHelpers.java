package com.skillstorm;

public class ArrayHelpers {

		static int findMax(int[] array) {

			if (array == null || array.length == 0) {
				
				return (0);
				// Placed 0 as a return value for null or empty arrays

			} else {
				int i;

				int max = array[0];

				for (i = 1; i < array.length; i++) {

					if (array[i] > max) {
						max = array[i];
					}
				}

				return max;
			}
		}

		public static void main(String[] args) {
			int nullArray[] = null;
			int emptyArray[] = {};
			int singleArray[] = { 12 };
			int array[] = { 19, 65, 1, 9, 17 };

			System.out.println(findMax(nullArray));
			System.out.println(findMax(emptyArray));
			System.out.println(findMax(singleArray));
			System.out.println(findMax(array));
		}
	}

