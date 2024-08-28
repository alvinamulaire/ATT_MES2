package com.att.repository.mapper;

import com.att.repository.entity.FwDutyState;
import com.att.repository.entity.FwDutyStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FwDutyStateMapper {
    long countByExample(FwDutyStateExample example);

    int deleteByExample(FwDutyStateExample example);

    int deleteByPrimaryKey(String sid);

    int insert(FwDutyState record);

    int insertSelective(FwDutyState record);

    List<FwDutyState> selectByExample(FwDutyStateExample example);

    FwDutyState selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") FwDutyState record, @Param("example") FwDutyStateExample example);

    int updateByExample(@Param("record") FwDutyState record, @Param("example") FwDutyStateExample example);

    int updateByPrimaryKeySelective(FwDutyState record);

    int updateByPrimaryKey(FwDutyState record);
}