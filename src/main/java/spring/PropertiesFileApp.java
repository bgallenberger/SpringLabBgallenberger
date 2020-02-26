package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.*;

public class PropertiesFileApp {
    public static void main(String[] args) {
        // load the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from Spring container
        PCGame theGame = context.getBean("myGame", PCGame.class);

        // call methods on the bean
        System.out.println(theGame.getReview());
        System.out.println(theGame.getConsole());

        // call getters for literal values
        System.out.println(theGame.getName());
        System.out.println(theGame.getGenre());
        System.out.println(theGame.getDescription());
        System.out.println(theGame.getPrice());

        // close the context
        context.close();
    }
}
