package ru.kfu.n2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("!!");
			BufferedReader bf = new BufferedReader(new FileReader(
					new File("n2")));
			BufferedReader bfc = new BufferedReader(new InputStreamReader(
					System.in));

			String must = bfc.readLine();
			bfc.close();
			int i = 0;
			// String str = bf.readLine();
			// System.out.println(str);

			// System.out.println("!");
			String[] str;
			str = bf.readLine().split("\"");
			
			for (int j = 1; j < str.length; j+=2) {
				//System.out.println("!!!");
				
				if(str[j].equals(must)){
					System.out.println(j/2);
				}
				
			}
			
			

			bf.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
