package com.att.repository.mapper;

import com.att.repository.entity.ZProductionLog;
import com.att.repository.entity.ZProductionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZProductionLogMapper {
    long countByExample(ZProductionLogExample example);

    int deleteByExample(ZProductionLogExample example);

    int deleteByPrimaryKey(String sid);

    int insert(ZProductionLog record);

    int insertSelective(ZProductionLog record);

    List<ZProductionLog> selectByExample(ZProductionLogExample example);

    ZProductionLog selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") ZProductionLog record, @Param("example") ZProductionLogExample example);

    int updateByExample(@Param("record") ZProductionLog record, @Param("example") ZProductionLogExample example);

    int updateByPrimaryKeySelective(ZProductionLog record);

    int updateByPrimaryKey(ZProductionLog record);
}