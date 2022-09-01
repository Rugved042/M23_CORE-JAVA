package com.tns.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

@SuppressWarnings("unused")
public class Example {

	public static void main(String[] args) {
		//LocalDate l=LocalDate.now();
		//LocalTime t=LocalTime.now();
		LocalDateTime dt=LocalDateTime.now();
		LocalDate d=LocalDate.of(2022,Month.APRIL,31);
		//System.out.println(l);
		//System.out.println(t);
		System.out.println(dt);
		System.out.println(d);
	}

}