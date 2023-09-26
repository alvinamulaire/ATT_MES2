package com.att.repository.mapper;

import com.att.repository.entity.AttProductObject;
import com.att.repository.entity.AttProductObjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttProductObjectMapper {
    long countByExample(AttProductObjectExample example);

    int deleteByExample(AttProductObjectExample example);

    int insert(AttProductObject record);

    int insertSelective(AttProductObject record);

    List<AttProductObject> selectByExample(AttProductObjectExample example);

    int updateByExampleSelective(@Param("record") AttProductObject record, @Param("example") AttProductObjectExample example);

    int updateByExample(@Param("record") AttProductObject record, @Param("example") AttProductObjectExample example);
}