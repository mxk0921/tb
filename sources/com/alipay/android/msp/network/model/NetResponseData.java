package com.alipay.android.msp.network.model;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NetResponseData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final NetRequestData f3709a;
    public final ResData b;

    public NetResponseData(NetRequestData netRequestData, ResData resData) {
        this.f3709a = netRequestData;
        this.b = resData;
    }

    public final NetRequestData getRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetRequestData) ipChange.ipc$dispatch("954d03d2", new Object[]{this});
        }
        return this.f3709a;
    }

    public final ResData getResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResData) ipChange.ipc$dispatch("da8917c0", new Object[]{this});
        }
        return this.b;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return String.format("<NetResponseData of %s with response %s>", this.f3709a, this.b);
    }
}
