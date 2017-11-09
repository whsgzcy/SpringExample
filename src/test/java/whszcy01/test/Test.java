package whszcy01.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import whszcy01.model.Items;
import whszcy01.service.ItemsServiceI;

public class Test {

	@org.junit.Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "spring.xml", "spring-mybatis.xml" });
		ItemsServiceI itemsServiceI = (ItemsServiceI) ac.getBean("itemsService");
		Items items = itemsServiceI.getItemById(1);
		System.out.println(items.getName());
	}

}
