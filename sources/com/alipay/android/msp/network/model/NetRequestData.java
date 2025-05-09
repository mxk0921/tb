package com.alipay.android.msp.network.model;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NetRequestData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RequestConfig f3708a;
    public final CustomCallback b;
    public final String c;

    public NetRequestData(RequestConfig requestConfig, String str, CustomCallback customCallback) {
        this.f3708a = requestConfig;
        this.c = str;
        this.b = customCallback == null ? CustomCallback.defaultCallback : customCallback;
    }

    public final CustomCallback getCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomCallback) ipChange.ipc$dispatch("a738929a", new Object[]{this});
        }
        return this.b;
    }

    public final RequestConfig getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("42c8a178", new Object[]{this});
        }
        return this.f3708a;
    }

    public final String getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
        }
        return this.c;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return String.format("<NetRequestData to %s with callback %s>", this.f3708a, this.b);
    }
}
