package com.att.repository;

import com.att.repository.entity.AttDetaile;
import com.att.repository.entity.AttDpsItemDesc;
import com.att.repository.entity.AttProductObject;

import java.util.List;

public interface AttDpsRepository {

    List<AttDetaile> getDpsdetail(AttDetaile attDetaile);

    List<AttDpsItemDesc> getMaterialDesc(String site,String item,String locale);

    void deleteAttdps(String site,String item_bo ,String productDay);

    void insertAttdps(AttProductObject attProductObject);
}
