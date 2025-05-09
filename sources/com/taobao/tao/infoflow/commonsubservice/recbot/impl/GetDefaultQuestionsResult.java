package com.taobao.tao.infoflow.commonsubservice.recbot.impl;

import com.alibaba.fastjson.JSONObject;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GetDefaultQuestionsResult implements IMTOPDataObject {
    public JSONObject questions;

    static {
        t2o.a(729809422);
        t2o.a(589299906);
    }

    public boolean isValid() {
        JSONObject jSONObject = this.questions;
        if (jSONObject == null || jSONObject.isEmpty()) {
            return false;
        }
        return true;
    }
}
