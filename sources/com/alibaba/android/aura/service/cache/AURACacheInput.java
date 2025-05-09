package com.alibaba.android.aura.service.cache;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURACacheInput extends UMFBaseIO {
    public String cacheKey;
    public Object cacheObject;
    public int operatorType;

    static {
        t2o.a(80740416);
    }

    public AURACacheInput(int i, String str) {
        this.operatorType = i;
        this.cacheKey = str;
    }

    public AURACacheInput(int i, String str, Object obj) {
        this.operatorType = i;
        this.cacheKey = str;
        this.cacheObject = obj;
    }
}
