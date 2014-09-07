package ru.kfu.n3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static int[] arrayOfCoin = {1, 5, 10, 25};
	
	
	public static int sc(int num, int now, int must, int n2){
		if(now == must){
			num++;
		}else{
			if(now < must){
				for(int i = n2; i<arrayOfCoin.length; i++){
					num = sc(num, now + arrayOfCoin[i], must, i);
				}
				
			}
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			System.out.println(sc(0, 0, n, 0));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
