package Microsoft.Springfirst;

import java.lang.System.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	MovieService movServiceObj=(MovieService) context.getBean("movieService");
    	
    	movServiceObj.displayMovie();
        
    }
}
