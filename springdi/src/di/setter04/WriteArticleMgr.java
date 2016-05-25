package di.setter04;

public class WriteArticleMgr implements IWriteArticleMgr {
	IArticleDAO articleDAO;
	
	
	
	public WriteArticleMgr() {
		super();
	}



	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}



	public IArticleDAO getArticleDAO() {
		return articleDAO;
	}



	public void setArticleDAO(IArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}

	

	@Override
	public void write(ArticleDTO article) {
		System.out.println(article);
		articleDAO.insert(article);
		
	}
	

}
