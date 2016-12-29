package com.hand.event;

import org.springframework.context.ApplicationEvent;

import com.hand.pojo.Film;

public class AfterEvent extends ApplicationEvent{
	private Film film;
	public AfterEvent(Film film) {
		super(film);
		this.film=film;
	}
}
