package com.att.repository.mapper;

import com.att.repository.entity.AttDpsItemDesc;
import com.att.repository.entity.AttDpsItemDescExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttDpsItemDescMapper {
    long countByExample(AttDpsItemDescExample example);

    List<AttDpsItemDesc> selectByExample(@Param("locale") String locale,
                                         @Param("example") AttDpsItemDescExample example);
}