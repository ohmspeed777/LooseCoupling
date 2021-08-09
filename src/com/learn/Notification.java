package com.learn;
import com.learn.notification.channel.*;
import com.learn.notification.channel.interf.Notifiable;

public class Notification {
	public static void main(String[] args) {
		Notification notification = new Notification();
		Notifiable sms = new Sms();
		Notifiable email = new Email();
		
		notification.notifyCustomer(sms);
		notification.notifyCustomer(email);
		
	}
	public void notifyCustomer(Notifiable notification) {
		notification.send();
	}
}
