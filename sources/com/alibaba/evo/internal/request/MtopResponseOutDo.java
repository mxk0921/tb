package com.alibaba.evo.internal.request;

import com.alibaba.fastjson.annotation.JSONField;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.lo8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MtopResponseOutDo extends BaseOutDo {
    @JSONField(name = "data")
    public lo8 data;

    static {
        t2o.a(961544247);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public Object getData() {
        return this.data;
    }
}
