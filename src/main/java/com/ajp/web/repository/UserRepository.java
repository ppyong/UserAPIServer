package com.ajp.web.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.ajp.web.domain.User;

@Repository
public class UserRepository {
    
    private final SqlSession sqlSession;

    public UserRepository(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }
    
    public User getUserInfo(String id) {
        return this.sqlSession.selectOne("getUserInfo", id);
    }
}
