package com.taobao.umipublish.extension.windvane.abilities.hander;

import com.alibaba.fastjson.JSONObject;
import com.taobao.umipublish.extension.windvane.abilities.AbilityChain;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BaseHandler extends AbilityChain.InputAndOutputHandler {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f14073a;
    public final JSONObject b;
    public final IntermediateData c;

    static {
        t2o.a(944767202);
    }

    public BaseHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        this.f14073a = jSONObject;
        this.b = jSONObject2;
        this.c = intermediateData;
    }
}
