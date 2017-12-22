package com.study.myggumi.sample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisSampleRepository implements SampleRepository {

  private static final String MAPPER_NAMESPACE =
      "mybatis.mappers.SampleMapper";

  private final SqlSession sqlSession;

  @Autowired
  public MybatisSampleRepository(SqlSession sqlSession) {
    this.sqlSession = sqlSession;
  }

  @Override
  public List<Map<String, String>> getDBVersion() {
    return sqlSession.selectList(MAPPER_NAMESPACE + ".getDBVersion");
  }
}