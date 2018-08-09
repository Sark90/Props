package levelup;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context.xml");
        ctx.refresh();

        User user = ctx.getBean("user", User.class);
        System.out.println("User info\nname: " + user.getName() + "\nsurname: " + user.getSurname()
                + "\nbirthday: " + user.getBirthday().toString());
    }
}
