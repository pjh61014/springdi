package di.setter.basic;


public class InsaImpl implements Insa {
	MemberDAO dao;
	public InsaImpl(){
		
	}
		//�����̳ʰ� InsaImple�� ������ �� dao��ü�� �������� �� �յ��� �����ڸ� �����ؾ��Ѵ�.
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("dao injection�Ϸ�");
	}
	
	

	public MemberDAO getDao() {
		return dao;
	}
	public void setDao(MemberDAO dao) {
		this.dao = dao;
		System.out.println("setter�޼ҵ�");
	}
	@Override
	public void addUser(MemberDTO user) {
		
		dao.add(user);		
	}
	
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

	
}


