package com.taobao.taopai2.material.business.specified;

import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SpecifiedFilterResultBean implements Serializable {
    public List<MaterialDetailBean> mMaterialList;
    public Map<String, MaterialSpecifiedRule> mRuleMap = new HashMap();

    static {
        t2o.a(782237912);
    }
}
