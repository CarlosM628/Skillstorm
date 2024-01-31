package com.skillstorm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FileIOPractice {
	
	public static final String path = "../Week11Monday/";
	
	public static void main(String[] args) {
		
		System.out.println(longestWordFinder("words_alpha.txt"));
		
		longWordWriter("words_alpha.txt", "long_word.txt");
		
	}
	
	public static String longestWordFinder(String file) {
		String longestWord = "";
		String currentWord;
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path + file))) {
			while ((currentWord = bufferedReader.readLine()) != null) {
				if (!currentWord.isEmpty() && longestWord.length() <= currentWord.trim().length()) {
					longestWord = currentWord;
				}
			}
		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("File is not found!");
        } catch (IOException ioException) {
            System.out.println("Input and/or output error.");
        } 
        return String.format("The longest word is: %s with %d letters.", 
            longestWord, longestWord.length());        
    }

    
    public static void longWordWriter(String iFile, String oFile) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path + iFile));
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(path + oFile)))
        ) {
            List<String> longWords = new ArrayList<>();
            String currentWord;

            while ((currentWord = bufferedReader.readLine()) != null) {
                if (currentWord.length() > 25) {
                    longWords.add(currentWord);
                } 
            }

            Collections.sort(longWords, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s2.length() - s1.length();
                }
            });

            for (int i = 0; i < longWords.size(); i++) {
                printWriter.printf("Number %d is: %s with %d letters.%n",
                    i + 1, longWords.get(i), longWords.get(i).length());
            }
            
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File is not found!");
        } catch (IOException ioException) {
            System.out.println("Input and/or output error.");
        }
        System.out.println("The new file was created successfully!");
    }
}