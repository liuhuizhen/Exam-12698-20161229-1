package com.hand.event;

import org.springframework.context.ApplicationEvent;
import com.hand.pojo.Film;

public class BeforeEvent extends ApplicationEvent{
	private Film film;

	//继承父类的构造方法
	public BeforeEvent(Film film) {
		super(film);
		this.film=film;
	}

}
