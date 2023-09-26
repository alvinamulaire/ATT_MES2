package com.att.repository;

import com.att.repository.entity.AttProductObject;

import java.util.List;

public interface AttDpsRepository {

//    List<AttProductObject> getattdpsInfo(AttProductObject attProductObject);

    void deleteAttdps(String site,String item_bo,String operation_bo);

    void insertAttdps(AttProductObject attProductObject);
}
