package com.spring.ex03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MemberTest1 {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("member.xml"));
		// 인스턴스 한 번만 -> new를 한 번만 쓴다!
		MemberService service = (MemberService) factory.getBean("memberService");
		service.listMembers();

	}

}
