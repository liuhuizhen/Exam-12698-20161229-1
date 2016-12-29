package com.hand.event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.hand.mapper.FilmMapper;
@Component
public class MyPublisher  implements ApplicationEventPublisherAware{
		 @Autowired
		  private FilmMapper filmMapper;
		  private ApplicationContext applicationContext;
		  @Autowired@Qualifier
		  private ApplicationEventPublisher applicationEventPublisher;
		  public void setUserMapper(FilmMapper filmMapper) {
		        this.filmMapper = filmMapper;
		    }
		  public void setApplicationContext(ApplicationContext applicationContext) {
		        this.applicationContext=applicationContext;
		    }

		public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
			this.applicationEventPublisher=applicationEventPublisher;
		}


}
