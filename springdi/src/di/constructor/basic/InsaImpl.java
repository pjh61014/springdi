package di.constructor.basic;


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

	@Override
	public void addUser(MemberDTO user) {
		
		dao.add(user);		
	}
	
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

	
}


