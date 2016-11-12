package com.mavenTest.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("taskJob")
public class TaskJob2 {

	@Scheduled(cron = "*/7 * * * * ?")
	public void task(){
		System.out.println("task22... = " + System.currentTimeMillis());
	}
}
