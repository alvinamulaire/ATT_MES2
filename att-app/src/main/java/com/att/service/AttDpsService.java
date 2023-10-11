package com.att.service;


import com.att.domain.attdomain.AttdpsInfo;
import com.att.repository.entity.AttDetaile;
import com.att.repository.entity.AttDpsItemDesc;

import java.util.List;

public interface AttDpsService {

    List<AttDetaile> getDpsdetail(AttDetaile attDetaile);

    List<AttDpsItemDesc> getMaterialDesc(String site, String item, String locale);

    void importattdps(AttdpsInfo attdpsInfo);
}

