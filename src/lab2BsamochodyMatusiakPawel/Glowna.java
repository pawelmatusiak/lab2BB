package lab2BsamochodyMatusiakPawel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Glowna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samochod vwPolo = new Samochod(55, 20000, "czerwony");
		Samochod fiatPunto = new Samochod(75,10000,"niebieski");
		Samochod opelAstra = new Samochod(110,30000,"srebrny");
		
		System.out.println("Nazwa auta: VW Polo");
		System.out.println("Koszt auta "+vwPolo.cena +"zl");
		System.out.println("Moc auta: " +vwPolo.moc+"km");
		System.out.println("Kolor auta: "+vwPolo.kolor);
		System.out.println("Koszt utrzymania: "+vwPolo.kosztUtrzymania(300)+"zl");
		System.out.println("Zuzycie paliwa: "+vwPolo.zuzyciePaliwa(8)+" l/100km"+ "\n");
		
		System.out.println("Nazwa auta: Fiat Punto");
		System.out.println("Koszt auta "+fiatPunto.cena +"zl");
		System.out.println("Moc auta: " +fiatPunto.moc+"km");
		System.out.println("Kolor auta: "+fiatPunto.kolor);
		System.out.println("Koszt utrzymania: "+fiatPunto.kosztUtrzymania(300)+"zl");
		System.out.println("Zuzycie paliwa: "+fiatPunto.zuzyciePaliwa(8)+" l/100km"+ "\n");
		
		System.out.println("Nazwa auta: Opel Astra");
		System.out.println("Koszt auta "+opelAstra.cena +"zl");
		System.out.println("Moc auta: " +opelAstra.moc+"km");
		System.out.println("Kolor auta: "+opelAstra.kolor);
		System.out.println("Koszt utrzymania: "+opelAstra.kosztUtrzymania(300)+"zl");
		System.out.println("Zuzycie paliwa: "+opelAstra.zuzyciePaliwa(8)+" l/100km"+ "\n");
	}

}