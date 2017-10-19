/*
 * @(#)SmtpExample.java
 *
 * Copyright (c) JSCAPE LLC.
 *
 * This software is the confidential and proprietary information of
 * JScape. ("Confidential Information").  You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with JScape.
 */
package beans;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class HRRC_MailSender {
	private final String HOST = "lmdamail01.apollotyres.com";

	public void sendMessage(String recipients[], String emailFromAddress,
			String subject, String message) throws MessagingException {
		Properties props = new Properties();
		props.put("mail.smtp.host", HOST);

		Session session = Session.getDefaultInstance(props, null);

		Message msg = new MimeMessage(session);
		InternetAddress addressFrom = new InternetAddress(emailFromAddress);
		msg.setFrom(addressFrom);

		InternetAddress[] addressTo = new InternetAddress[recipients.length];
		for (int i = 0; i < recipients.length; i++) {
			addressTo[i] = new InternetAddress(recipients[i].trim());
		}
		msg.setRecipients(Message.RecipientType.TO, addressTo);
		msg.setSubject(subject);
		msg.setContent(message, "text/html");

		Transport.send(msg);
	}
}