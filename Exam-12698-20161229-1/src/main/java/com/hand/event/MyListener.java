package com.hand.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener<ApplicationEvent>{

	public void onApplicationEvent(ApplicationEvent event) {
		//判断事件为MyEvent时候执行
        if(event instanceof BeforeEvent){
            System.out.println("Before Insert Film Data");
        }else if(event instanceof AfterEvent){
        	System.out.println("After Insert Film Data");
        }
	
	}
}
