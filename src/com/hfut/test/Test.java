package com.hfut.test;

import com.hfut.pojo.PeopleFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hfut.pojo.People;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		People people=ac.getBean("peo",People.class);
		System.out.println(people);
		String[]names=ac.getBeanDefinitionNames();
		for(String string:names) {
			System.out.println(string);
		}

		/*实例工厂测试代码*/
		System.out.println("实例工厂测试");
		people=ac.getBean("peo1",People.class);
		System.out.println(people);

		/*静态工厂测试代码*/
		System.out.println("静态工厂测试");
		people=ac.getBean("peo2",People.class);
		System.out.println(people);


		
	}

}
