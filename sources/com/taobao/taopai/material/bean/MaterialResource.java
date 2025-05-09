package com.taobao.taopai.material.bean;

import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import java.util.Objects;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialResource extends MaterialDetail {
    private String dirPath;
    private String materialJsonPath;

    static {
        t2o.a(782237739);
    }

    public void copyFrom(com.taobao.taopai2.material.business.res.MaterialResource materialResource) {
        if (materialResource != null) {
            super.copyFrom((MaterialDetailBean) materialResource);
            setDirPath(materialResource.dirPath);
            setMaterialJsonPath(materialResource.materialJsonPath);
        }
    }

    @Override // com.taobao.taopai.material.bean.MaterialDetail
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        MaterialResource materialResource = (MaterialResource) obj;
        if (!Objects.equals(getDirPath(), materialResource.getDirPath()) || !Objects.equals(getMaterialJsonPath(), materialResource.getMaterialJsonPath())) {
            return false;
        }
        return true;
    }

    public String getDirPath() {
        return this.dirPath;
    }

    public String getMaterialJsonPath() {
        return this.materialJsonPath;
    }

    @Override // com.taobao.taopai.material.bean.MaterialDetail
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), getDirPath(), getMaterialJsonPath());
    }

    public void setDirPath(String str) {
        this.dirPath = str;
    }

    public void setMaterialJsonPath(String str) {
        this.materialJsonPath = str;
    }

    public String toString() {
        return "MaterialResource{dirPath='" + this.dirPath + "', materialJsonPath='" + this.materialJsonPath + "'}";
    }
}
