package com.att.repository.mapper;

import com.att.repository.entity.Certification;
import com.att.repository.entity.CertificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CertificationMapper {
    long countByExample(CertificationExample example);

    int deleteByExample(CertificationExample example);

    int insert(Certification record);

    int insertSelective(Certification record);

    List<Certification> selectByExample(CertificationExample example);

    int updateByExampleSelective(@Param("record") Certification record, @Param("example") CertificationExample example);

    int updateByExample(@Param("record") Certification record, @Param("example") CertificationExample example);
}