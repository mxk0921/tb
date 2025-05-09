package com.taobao.android.detail2.core.framework.data.model;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CardUTArgs implements Serializable {
    public String pageName;
    public String spmCnt;

    static {
        t2o.a(352321793);
    }

    public CardUTArgs(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.pageName = jSONObject.getString("pageName");
            this.spmCnt = jSONObject.getString("spmCnt");
        }
    }
}
