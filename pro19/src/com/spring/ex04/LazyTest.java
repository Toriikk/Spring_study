package com.spring.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LazyTest {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("lazy.xml");
		// appcontext는 모든 걸 다 호출해줌 그래서 잘 사용하지 않는 것들은 lazy-init 사용해서 원하는 것만 호출할 수 있도록
		System.out.println("SecondBean 얻기");
		context.getBean("secondBean");

	}

}
