package com.att.repository.mapper;

import com.att.repository.entity.AttTest;
import com.att.repository.entity.AttTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttTestMapper {
    long countByExample(AttTestExample example);

    int deleteByExample(AttTestExample example);

    int insert(AttTest record);

    int insertSelective(AttTest record);

    List<AttTest> selectByExample(AttTestExample example);

    int updateByExampleSelective(@Param("record") AttTest record, @Param("example") AttTestExample example);

    int updateByExample(@Param("record") AttTest record, @Param("example") AttTestExample example);
}