package com.alibaba.aliweex.adapter.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.bbe;
import tb.dgb;
import tb.mtw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WXAPMGeneratorAdapter implements dgb, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(85983246);
        t2o.a(985661624);
    }

    @Override // tb.dgb
    public bbe generateApmInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbe) ipChange.ipc$dispatch("c822fa13", new Object[]{this, str});
        }
        return new mtw();
    }
}
