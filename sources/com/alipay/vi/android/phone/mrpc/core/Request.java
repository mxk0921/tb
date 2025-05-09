package com.alipay.vi.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class Request {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4565a = false;
    public TransportCallback mCallback;

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.f4565a = true;
        }
    }

    public TransportCallback getCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransportCallback) ipChange.ipc$dispatch("4fa0c844", new Object[]{this});
        }
        return this.mCallback;
    }

    public boolean isCanceled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83e706ee", new Object[]{this})).booleanValue();
        }
        return this.f4565a;
    }

    public void setTransportCallback(TransportCallback transportCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa048a5f", new Object[]{this, transportCallback});
        } else {
            this.mCallback = transportCallback;
        }
    }
}
