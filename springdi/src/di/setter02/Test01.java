package di.setter02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test01 {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("config/setter.xml");
		AbstactPlayer p =(AbstactPlayer)container.getBean("player");
		p.play();
		System.out.println("���� ���� �ֻ����� ��:"+p.getTotalValue());
	}

}