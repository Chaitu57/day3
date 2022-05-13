package com.mindgate.factory;

import com.mindgate.pojo.EmailNotification;
import com.mindgate.pojo.SMSnotification;
import com.mindgate.pojo.WhatAppnotification;
import com.mindgate.service.Notification;

public class NotificationFactory {
	public static Notification getNotification(int choice)
	{
		Notification notification=null;
		switch (choice) {
		case 1:
			notification=new SMSnotification();
			break;
		case 2:
			notification=new EmailNotification();
			break;
		case 3:
			notification=new WhatAppnotification();
			break;

		}
		return notification;
	}

}
