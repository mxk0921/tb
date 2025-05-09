package com.alibaba.android.aura.datamodel.nextrpc;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURANextRPCIO extends UMFBaseIO {
    public AURANextRPCEndpoint nextRPCEndpoint;
    public String serviceName;

    static {
        t2o.a(80740385);
    }

    public AURANextRPCIO(String str, AURANextRPCEndpoint aURANextRPCEndpoint) {
        this.serviceName = str;
        this.nextRPCEndpoint = aURANextRPCEndpoint;
    }
}
