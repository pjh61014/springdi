package di.cunstructor02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test01 {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("config/bean.xml");
		AbstactPlayer p =(AbstactPlayer)container.getBean("player");
		p.play();
		System.out.println("���� ���� �ֻ����� ��:"+p.getTotalValue());
	}

}
