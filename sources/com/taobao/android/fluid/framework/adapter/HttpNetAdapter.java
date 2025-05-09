package com.taobao.android.fluid.framework.adapter;

import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.IHttpNetAdapter;
import tb.p91;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HttpNetAdapter implements IHttpNetAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713799);
        t2o.a(468713802);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return IHttpNetAdapter.ADAPTER_NAME;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IHttpNetAdapter
    public <T> void send(IHttpNetAdapter.c cVar, IHttpNetAdapter.a<T> aVar, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a57504", new Object[]{this, cVar, aVar, cls});
        } else {
            new DegradableNetwork(p91.a()).asyncSend(new RequestImpl(cVar.f7758a), null, null, new IHttpNetAdapter.b(aVar, cls));
        }
    }
}
