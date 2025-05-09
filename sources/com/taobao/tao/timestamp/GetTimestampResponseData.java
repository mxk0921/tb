package com.taobao.tao.timestamp;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GetTimestampResponseData implements IMTOPDataObject {
    private String t;

    static {
        t2o.a(775946406);
        t2o.a(589299906);
    }

    public String getT() {
        return this.t;
    }

    public void setT(String str) {
        this.t = str;
    }
}
