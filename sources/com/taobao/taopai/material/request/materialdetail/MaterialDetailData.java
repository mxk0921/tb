package com.taobao.taopai.material.request.materialdetail;

import com.taobao.taopai.material.bean.MaterialDetail;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialDetailData implements IMTOPDataObject {
    private MaterialDetail model;

    static {
        t2o.a(782237802);
        t2o.a(589299906);
    }

    public MaterialDetail getModel() {
        return this.model;
    }

    public void setModel(MaterialDetail materialDetail) {
        this.model = materialDetail;
    }
}
