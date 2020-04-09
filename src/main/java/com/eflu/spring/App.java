package com.eflu.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eflu.beans.City;
import com.eflu.beans.Person;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("IOC Container created...");
		Person person = context.getBean("myPerson", Person.class);
		System.out.println("Name: " + person.getName());
		System.out.println("Id: " + person.getId());
		System.out.println("Nickname: " + person.getNickName());
		System.out.println("Country: " + person.getCountry().getName());
		System.out.print("Cities: ");

		List<City> cities = person.getCountry().getCityList();

		for (City item : cities) {
			System.out.print(item.getName() + " ");
		}

		((ClassPathXmlApplicationContext) context).close();
	}
}