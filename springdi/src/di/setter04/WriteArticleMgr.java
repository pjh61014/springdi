package di.setter04;

public class WriteArticleMgr implements IWriteArticleMgr {
	IArticleDAO articleDAO;
	
	
	
	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}



	@Override
	public void write(ArticleDTO article) {
		// TODO Auto-generated method stub
		
	}

}
