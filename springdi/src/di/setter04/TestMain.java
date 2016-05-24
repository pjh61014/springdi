package di.setter04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/setter.xml");
		
		IWriteArticleMgr mgr =(IWriteArticleMgr)factory.getBean("");
		ArticleDTO user = new ArticleDTO("jang","1234","ddd","dd");
		
		mgr.write(user);

	}

}
