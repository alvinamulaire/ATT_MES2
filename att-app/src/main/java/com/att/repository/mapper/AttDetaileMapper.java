package com.att.repository.mapper;

import com.att.repository.entity.AttDetaile;
import com.att.repository.entity.AttDetaileExample;
import java.util.List;

public interface AttDetaileMapper {
    long countByExample(AttDetaileExample example);

    List<AttDetaile> selectByExample(AttDetaileExample example);
}