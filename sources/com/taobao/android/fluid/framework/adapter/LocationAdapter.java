package com.taobao.android.fluid.framework.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LocationAdapter implements ILocationAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713818);
        t2o.a(468713809);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return ILocationAdapter.ADAPTER_NAME;
    }
}
