package di.setter04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain03 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/setter.xml");
		
		IWriteArticleMgr mgr =(IWriteArticleMgr)factory.getBean("article");
		/*ArticleDTO user = new ArticleDTO("jang","1234","ddd","dd");
		
		mgr.write(user);
		
		IWriteArticleMgr mgr2 =(IWriteArticleMgr)factory.getBean("article2");
		//�⺻���¿��� �̱�������Ȯ�� - �⺻���� ���� �������� �ʰ� scope�Ӽ��� prototype���� �����ϸ� getbean�� ȣ��ɶ����� ���� �����ȴ�.
		//(�⺻�� Applicationcontext��ü�� ������ �� �� ���� �����ȴ�.
		
		
		ArticleDTO user2= new ArticleDTO("jang","123d4","dsdd","dsd");
		
		mgr.write(user2);
		
		if(mgr==mgr2){
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		}
		*/

	}

}
