package com.taobao.android.fluid.framework.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bwr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ShareAdapter implements IShareAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713821);
        t2o.a(468713816);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return IShareAdapter.ADAPTER_NAME;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IShareAdapter
    public boolean isShareContentContainerShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf57ca93", new Object[]{this})).booleanValue();
        }
        return bwr.h().i();
    }
}
