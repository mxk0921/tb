package com.android.taobao.aop.report;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ResModel implements Serializable {
    public String packageName;
    public String resName;
    public String resType;

    static {
        t2o.a(497025033);
    }

    public ResModel(String str, String str2, String str3) {
        this.packageName = str;
        this.resType = str2;
        this.resName = str3;
    }
}
