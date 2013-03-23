package com.girish.hibernate.SampleHibernate;

import javax.ws.rs.core.MediaType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.girish.hibernate.restclient.Category;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SessionFactory sf = new Configuration().configure("hibernate/hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		System.out.println("Transaction Began:");*/
	/*	User user = new User();
		user.setName("Girish");
		user.setUserId(123);
		
		ApplicationContext appContext = 
		    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
    	UserBo stockBo = (UserBo)appContext.getBean("userBo");
		
    	stockBo.save(user);
		System.out.println("Test it");*/
		
		WebResource resource = Client.create()
		        .resource( "https://api.mercadolibre.com/categories/MLB5672" );
		MediaType mediaType[] = new MediaType[1];
		mediaType[0] = MediaType.APPLICATION_JSON_TYPE;
		ClientResponse response = (ClientResponse) resource.accept(mediaType).get( ClientResponse.class );
		
		if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}
	 
		String output = (String) response.getEntity(String.class);
	 
			System.out.println("Output from Server .... \n");
			System.out.println(output);
	}
	
}
