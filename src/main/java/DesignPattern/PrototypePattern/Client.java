package DesignPattern.PrototypePattern;

import java.util.ArrayList;
import java.util.Random;

import util.Printer;

/**
 * 原型模式 银行电子广告 1.有什么弊端 2.单线程，发送 600万封需要多长时间 3.改用多线程
 */
public class Client {

	public static int MAX_COUNT = 2;

	public void Start() {
		/* 发送邮件 */
		final Mail mail = new Mail(new MailTemp());
		mail.setTail("xxx银行的所有版权");
		ArrayList<Mail> mailList = new ArrayList<>();
		Printer.TimeCounter_Start();
		for (int i = 0; i < MAX_COUNT; i++) {
			try {
				// 浅拷贝clone() 只拷贝基本数据类型int、long、string...
				Mail cloneMail = mail.clone();
				//Mail.HashCoed()不同
				Printer.Print("Mail.HashCoed():");
				Printer.Print(mail.hashCode());
				Printer.Print(cloneMail.hashCode());
				//Mail.getSub().HashCoed()相同
				Printer.Print("Mail.getSub().HashCoed():");
				Printer.Print(mail.getSub().hashCode());
				Printer.Print(cloneMail.getSub().hashCode());
				
				cloneMail.setSub(getRandString(5) + " 先生（女士） ");
				Printer.Print("cloneMail.setSub:");
				Printer.Print(mail.getSub().hashCode());
				Printer.Print(cloneMail.getSub().hashCode());
				cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
				mailList.add(cloneMail);
				sendMail(cloneMail);
				Printer.Print();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		Printer.Print("标题： " + mail.getSub() + "\t收件人" + mail.getReceiver() + "\t....发送成功！ ");
		Printer.TimeCounter_Stop();
	}

	public static void sendMail(Mail mail) {
		Printer.Print("标题： " + mail.getSub() + "\t收件人" + mail.getReceiver() + "\t....发送成功！ ");
	}

	public static String getRandString(int maxLength) {
		String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}
}