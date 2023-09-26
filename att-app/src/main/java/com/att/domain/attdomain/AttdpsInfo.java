package com.att.domain.attdomain;

import com.att.repository.entity.AttProductObject;

import java.util.List;

public class AttdpsInfo extends AttProductObject {

    private List<AttProductObject> detailInfoList;

    public List<AttProductObject> getDetailInfoList() {
        return detailInfoList;
    }

    public void setDetailInfoList( List<AttProductObject> detailInfoList ) {
        this.detailInfoList = detailInfoList;
    }
}
