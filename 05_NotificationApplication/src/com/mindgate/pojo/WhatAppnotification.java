package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class WhatAppnotification implements Notification {
	public void sendNotification(String to,String message)
	{
		System.out.println("sending WhatsAPP Notification");
		System.out.println("To ::"+ to);
		System.out.println("WhatAppmassage::"+message);

}
}

