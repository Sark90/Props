package levelup;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App
{
    public static void main(String[] args )
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context.xml");
        ctx.refresh();

        User user = ctx.getBean("user", User.class);
        showUserInfo(user);
        System.out.println();

/*        user.setName("James");
        user.setSurname("Bond");
        DateEditor dEdit = ctx.getBean("editor", DateEditor.class);
        dEdit.setAsText("06-01-1974");
        //user.setBirthday(dEdit.getValue());
        showUserInfo(user);*/
    }

    private static void showUserInfo(User user) {
        System.out.println("User info\nname: " + user.getName() + "\nsurname: " + user.getSurname()
                + "\nbirthday: " + user.getBirthday().toString());
    }
}
