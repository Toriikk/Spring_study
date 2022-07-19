package com.spring.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LazyTest {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("lazy.xml");
		// appcontext�� ��� �� �� ȣ������ �׷��� �� ������� �ʴ� �͵��� lazy-init ����ؼ� ���ϴ� �͸� ȣ���� �� �ֵ���
		System.out.println("SecondBean ���");
		context.getBean("secondBean");

	}

}
