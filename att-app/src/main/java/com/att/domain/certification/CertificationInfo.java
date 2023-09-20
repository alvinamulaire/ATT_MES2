package com.att.domain.certification;

import com.att.repository.entity.Certification;

import java.util.List;

public class CertificationInfo extends Certification {

    private List<Certification> detailInfoList;

    public List<Certification> getDetailInfoList() {
        return detailInfoList;
    }

    public void setDetailInfoList( List<Certification> detailInfoList ) {
        this.detailInfoList = detailInfoList;
    }
}
