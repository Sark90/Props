package levelup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext
                ("META-INF/spring/app-context.xml");
        User user = ctx.getBean("user", User.class);
        System.out.println("User info:\nname: " + user.getName() + "\nsurname: " + user.getSurname()
                + "\nbirthday" + user.getBirthday().toString());
    }
}
