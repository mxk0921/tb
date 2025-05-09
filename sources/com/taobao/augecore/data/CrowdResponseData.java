package com.taobao.augecore.data;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CrowdResponseData implements IMTOPDataObject, Serializable {
    public List<GroupData> crowds;
    public String expireTime;
    public SpecialCrowd specialCrowd;

    public List<GroupData> getCrowds() {
        return this.crowds;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public SpecialCrowd getSpecialCrowd() {
        return this.specialCrowd;
    }

    public void setCrowds(List<GroupData> list) {
        this.crowds = list;
    }

    public void setExpireTime(String str) {
        this.expireTime = str;
    }

    public void setSpecialCrowd(SpecialCrowd specialCrowd) {
        this.specialCrowd = specialCrowd;
    }
}
