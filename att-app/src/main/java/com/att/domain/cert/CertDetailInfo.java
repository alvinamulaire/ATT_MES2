package com.att.domain.cert;

import com.att.repository.entity.AttTest;

import java.util.List;

public class CertDetailInfo {
    private List<AttTest> detailInfoList;

    public List<AttTest> getDetailInfoList() {
        return detailInfoList;
    }

    public void setDetailInfoList( List<AttTest> detailInfoList ) {
        this.detailInfoList = detailInfoList;
    }

}
