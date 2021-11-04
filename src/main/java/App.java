import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld sameBean = (HelloWorld) applicationContext.getBean("helloworld");

        Cat barsic = applicationContext.getBean("getCat", Cat.class);
        Cat mursic = applicationContext.getBean("getCat", Cat.class);

        System.out.println(bean == sameBean);
        System.out.println(barsic == mursic);

    }
}