package com.taobao.taopai.material.bean;

import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import java.io.Serializable;
import java.util.Objects;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialDetail implements IMTOPDataObject, Serializable {
    private String creatorName;
    private String extend;
    private String frontIdsString;
    private String logoUrl;
    private int materialType;
    private long modifiedTime;
    private String name;
    private String resourceExtUrl;
    private String resourceUrl;
    private int tid;
    private int version;

    static {
        t2o.a(782237737);
        t2o.a(589299906);
    }

    public void copyFrom(MaterialDetailBean materialDetailBean) {
        if (materialDetailBean != null) {
            setTid((int) materialDetailBean.id);
            setLogoUrl(materialDetailBean.logoUrl);
            setMaterialType(materialDetailBean.materialType);
            setName(materialDetailBean.name);
            setResourceUrl(materialDetailBean.resourceUrl);
            setModifiedTime(materialDetailBean.lastModified);
            setVersion(materialDetailBean.version);
            setExtend(materialDetailBean.extend);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MaterialDetail materialDetail = (MaterialDetail) obj;
        if (getTid() != materialDetail.getTid() || getVersion() != materialDetail.getVersion() || getModifiedTime() != materialDetail.getModifiedTime() || getMaterialType() != materialDetail.getMaterialType() || !Objects.equals(getName(), materialDetail.getName()) || !Objects.equals(getLogoUrl(), materialDetail.getLogoUrl()) || !Objects.equals(getResourceUrl(), materialDetail.getResourceUrl()) || !Objects.equals(getCreatorName(), materialDetail.getCreatorName()) || !Objects.equals(this.frontIdsString, materialDetail.frontIdsString) || !Objects.equals(getExtend(), materialDetail.getExtend()) || !Objects.equals(getResourceExtUrl(), materialDetail.getResourceExtUrl())) {
            return false;
        }
        return true;
    }

    public String getCreatorName() {
        return this.creatorName;
    }

    public String getExtend() {
        return this.extend;
    }

    public String getFrontIdsString() {
        return this.frontIdsString;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public int getMaterialType() {
        return this.materialType;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public String getName() {
        return this.name;
    }

    public String getResourceExtUrl() {
        return this.resourceExtUrl;
    }

    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public int getTid() {
        return this.tid;
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(getTid()), Integer.valueOf(getVersion()), getName(), Long.valueOf(getModifiedTime()), getLogoUrl(), getResourceUrl(), Integer.valueOf(getMaterialType()), getCreatorName(), this.frontIdsString, getExtend(), getResourceExtUrl());
    }

    public void setCreatorName(String str) {
        this.creatorName = str;
    }

    public void setExtend(String str) {
        this.extend = str;
    }

    public void setFrontIdsString(String str) {
        this.frontIdsString = str;
    }

    public void setLogoUrl(String str) {
        this.logoUrl = str;
    }

    public void setMaterialType(int i) {
        this.materialType = i;
    }

    public void setModifiedTime(long j) {
        this.modifiedTime = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setResourceExtUrl(String str) {
        this.resourceExtUrl = str;
    }

    public void setResourceUrl(String str) {
        this.resourceUrl = str;
    }

    public void setTid(int i) {
        this.tid = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
