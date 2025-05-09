package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class DetailNode implements Serializable {
    public JSONObject root;

    static {
        t2o.a(706740230);
    }

    public DetailNode(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.root = jSONObject;
            return;
        }
        throw new IllegalArgumentException();
    }

    public DetailNode() {
    }
}
