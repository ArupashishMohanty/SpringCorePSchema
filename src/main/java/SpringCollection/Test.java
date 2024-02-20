package SpringCollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con= new ClassPathXmlApplicationContext("SpringCollection/collectionConfig.xml");
		Emp emp1=(Emp)con.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourses());
	}

}
