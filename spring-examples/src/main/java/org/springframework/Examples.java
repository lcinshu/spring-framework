package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : linken
 * @date : 2020/10/23 21:48
 * @desc :
 */
public class Examples {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cs  = new ClassPathXmlApplicationContext("config.xml");
		SimpleBean simpleBean = cs.getBean(SimpleBean.class);
		simpleBean.send();
	}
}
