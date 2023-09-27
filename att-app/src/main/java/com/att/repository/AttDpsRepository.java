package com.att.repository;

import com.att.repository.entity.AttDpsItemDesc;
import com.att.repository.entity.AttProductObject;

import java.util.List;

public interface AttDpsRepository {

//    List<AttProductObject> getattdpsInfo(AttProductObject attProductObject);

    List<AttDpsItemDesc> getMaterialDesc(String site,String item,String locale);

    void deleteAttdps(String site,String item_bo,String operation_bo);

    void insertAttdps(AttProductObject attProductObject);
}
