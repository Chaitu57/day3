package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class SMSnotification implements Notification{

	public void sendNotification(String to,String message)
	{
		System.out.println("sending SMS Notification");
		System.out.println("To ::"+ to);
		System.out.println("massage::"+message);
	}
}
