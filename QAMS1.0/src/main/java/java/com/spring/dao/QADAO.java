package java.com.spring.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("QADAO")
public class QADAO {
	private SqlSession sqlSession;
	public List<Map<String, String>> getProject() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("qaport.main.getProject");
	}
	
}
