package com.hand.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener<ApplicationEvent>{

	public void onApplicationEvent(ApplicationEvent event) {
		//"Before Insert Film Data" "After Insert Film Data"
		//判断事件为MyEvent时候执行
        if(event instanceof BeforeEvent){
            System.out.println(event.getSource());
        }
        if(event instanceof AfterEvent){
        	System.out.println(event.getSource());
        } 
        if(event instanceof ContextRefreshedEvent){
            System.out.println("Context Start");
        }
        if(event instanceof ContextClosedEvent){
            System.out.println("Context Stop");
        }
	
	}
}

