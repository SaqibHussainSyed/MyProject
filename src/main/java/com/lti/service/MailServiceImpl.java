package com.lti.service;

import javax.mail.Message;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import com.lti.dao.MailDao;




@Service("mailService")
public class MailServiceImpl implements MailService
{

	@Autowired
	JavaMailSender mailSender;
	
	@Autowired
	MailDao maildao;

	public String sendEmail(String emailid)
	{
		String senderEmailId = "divyaap2307@gmail.com";
		//System.out.println(emailid);
		String receiverEmailId = emailid;
		String subject = "Your Password is";
		String pass = maildao.getpassword(emailid);
		if(pass!=null) {
		String message = "Password:" +  pass;
		MimeMessagePreparator preparator = new MimeMessagePreparator()
		{

			public void prepare(MimeMessage mimeMessage) throws Exception
			{
				mimeMessage.setFrom(senderEmailId);
				mimeMessage.setRecipient(Message.RecipientType.TO,
						new InternetAddress(receiverEmailId));
				mimeMessage.setSubject(subject);
				mimeMessage.setText(message);

			}
		};

		try
		{
			mailSender.send(preparator);
			System.out.println("Message Sent...Hurrey");
			return "sent";
		}
		catch (Exception exe)
		{
			exe.printStackTrace();
			return "not sent";
		}
	}
		return "not sent";
	}
}