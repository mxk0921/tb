package com.taobao.taopai.material.bean;

import java.util.ArrayList;
import java.util.Objects;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialListBean implements IMTOPDataObject {
    private int currentPage = -1;
    private ArrayList<MaterialDetail> model;
    private int total;
    private int totalPage;

    static {
        t2o.a(782237738);
        t2o.a(589299906);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MaterialListBean materialListBean = (MaterialListBean) obj;
        if (getCurrentPage() == materialListBean.getCurrentPage() && getTotal() == materialListBean.getTotal() && getTotalPage() == materialListBean.getTotalPage() && Objects.equals(getModel(), materialListBean.getModel())) {
            return true;
        }
        return false;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public ArrayList<MaterialDetail> getModel() {
        return this.model;
    }

    public int getTotal() {
        return this.total;
    }

    public int getTotalPage() {
        return this.totalPage;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(getCurrentPage()), Integer.valueOf(getTotal()), Integer.valueOf(getTotalPage()), getModel());
    }

    public void setCurrentPage(int i) {
        this.currentPage = i;
    }

    public void setModel(ArrayList<MaterialDetail> arrayList) {
        this.model = arrayList;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public void setTotalPage(int i) {
        this.totalPage = i;
    }
}
