package onlinejudge.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class Config {
	@Value("${mail.username}")
	private String mailUsername;
	
	@Value("${mail.password}")
	private String mailPassword;
	
	@Value("${mail.host}")
	private String mailHost;
	
	@Value("${mail.port}")
	private int mailPort;
	
	@Bean
	public MailSender mailSender(){
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setPort(mailPort);
		mailSender.setHost(mailHost);
		mailSender.setUsername(mailUsername);
		mailSender.setPassword(mailPassword);
		
		
		Properties properties = mailSender.getJavaMailProperties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		
		return mailSender;
	}
}
