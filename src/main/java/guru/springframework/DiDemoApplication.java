package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.GetterInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.examplebeans.ApplicationDataSource;
import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.toString());

		FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.toString());

		ApplicationDataSource applicationDataSource = ctx.getBean(ApplicationDataSource.class);
		System.out.println(applicationDataSource.toString());

	}
}
