package com.hand.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.event.AfterEvent;
import com.hand.event.BeforeEvent;
import com.hand.mapper.FilmMapper;
import com.hand.pojo.Film;

public class Main {
	 static Scanner in=new Scanner(System.in);
	private static ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	public static void main(String[] args) {
		FilmMapper mapper = (FilmMapper) applicationContext.getBean("filmMapper");
		Film film=new Film();
		System.out.println("请输入电影名称");
		film.setTitle(in.next());
		System.out.println("请输入电影描述");
		film.setDescription(in.next());
		System.out.println("请输入语言ID");
		film.setLanguage_id(in.nextInt());
		BeforeEvent event=new BeforeEvent(film);
        applicationContext.publishEvent(event);
		mapper.addFilm(film);
		AfterEvent event2=new AfterEvent(film);
		applicationContext.publishEvent(event2);

	}

}
