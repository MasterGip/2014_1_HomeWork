package ru.kfu.itis;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static String findMostPopularBegin(Aeroflot[] aero) {
		String returning = "";
		if (aero.length != 0) {
			String[] str = new String[aero.length];
			ArrayList<PopularBegin> begins = new ArrayList<>();

			for (int i = 0; i < aero.length; i++) {
				String begin = aero[i].getBegin();
				boolean b = false;
				int j = 0;
				for (; j < begins.size() && !b; j++) {
					if (begin.equals(begins.get(j))) {
						b = true;
					}
				}
				if (b) {
					j--;
					begins.get(j).top++;
				} else {
					begins.add(new PopularBegin(begin));
				}
			}
			int max = begins.get(0).top;
			for(int i = 1; i<begins.size(); i++){
				if(begins.get(max).top < begins.get(i).top){
					max = i;
				}
			}
			returning = begins.get(max).name;
			
		}
		return returning;
			

	}

	public static void showInfoAboutPopular(Aeroflot[] aero) {
		String popular = findMostPopularBegin(aero);
		for(int i = 0; i < aero.length; i++){
			if(popular.equals(aero[i].getBegin())){
				aero[i].show();
				
			}
		}
	}

	public static void print(Aeroflot[] aero, String end) {
		for (int i = 0; i < aero.length; i++) {
			if (aero[i].getEnd().equals(end)) {
				System.out.println(aero[i].getNumber());
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome!");
		BufferedReader bfr = new BufferedReader(
				new InputStreamReader(System.in));
		Aeroflot[] aero = new Aeroflot[5];
		for (int i = 0; i < aero.length; i++) {
			try {
				aero[i] = new Aeroflot(bfr.readLine(), bfr.readLine(),
						Integer.parseInt(bfr.readLine()), bfr.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("Введите пункт назначения");
		String p = bfr.readLine();
		for(int i = 0; i<aero.length ; i++){
			if(p.equals(aero[i].getBegin())){
				System.out.println("2:");
				aero[i].show();
			}
		}
		System.out.println("!!");
		
		showInfoAboutPopular(aero);

	}

}
