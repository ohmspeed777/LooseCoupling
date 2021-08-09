package com.learn.notification.channel;

import com.learn.notification.channel.interf.Notifiable;

public class Email implements Notifiable{
	public void send() {
		System.out.println("Send Email to Customer");
	}
}
