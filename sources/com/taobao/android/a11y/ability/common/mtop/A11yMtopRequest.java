package com.taobao.android.a11y.ability.common.mtop;

import com.alibaba.fastjson.JSON;
import mtopsdk.mtop.domain.MtopRequest;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class A11yMtopRequest<T> extends MtopRequest {
    static {
        t2o.a(335544322);
    }

    public A11yMtopRequest(T t) {
        setData(JSON.toJSONString(t));
    }
}
