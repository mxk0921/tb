package com.taobao.taopai.material.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Objects;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialCategoryBean implements IMTOPDataObject {
    private long categoryId;
    private String name;
    @JSONField(name = yj4.PARAM_EXTEND)
    private String originExtend;
    private Extend parsedExtend;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Extend implements Serializable {
        public String logoUrl;
        public String selectedLogoUrl;

        static {
            t2o.a(782237736);
        }
    }

    static {
        t2o.a(782237735);
        t2o.a(589299906);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MaterialCategoryBean materialCategoryBean = (MaterialCategoryBean) obj;
        if (getCategoryId() != materialCategoryBean.getCategoryId() || !Objects.equals(getName(), materialCategoryBean.getName())) {
            return false;
        }
        return true;
    }

    public long getCategoryId() {
        return this.categoryId;
    }

    public Extend getExtend() {
        if (this.parsedExtend == null) {
            this.parsedExtend = (Extend) JSON.parseObject(this.originExtend, Extend.class);
        }
        return this.parsedExtend;
    }

    public String getName() {
        return this.name;
    }

    public String getOriginExtend() {
        return this.originExtend;
    }

    public int hashCode() {
        return Objects.hash(getName(), Long.valueOf(getCategoryId()));
    }

    public void setCategoryId(long j) {
        this.categoryId = j;
    }

    public void setExtend(Extend extend) {
        this.parsedExtend = extend;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOriginExtend(String str) {
        this.originExtend = str;
    }

    public String toString() {
        return "MaterialCategory{name='" + this.name + "', categoryId=" + this.categoryId + '}';
    }
}
