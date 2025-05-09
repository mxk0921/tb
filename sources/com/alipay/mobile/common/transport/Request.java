package com.alipay.mobile.common.transport;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class Request {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4047a = false;
    public TransportCallback mCallback;

    public void cancel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5301f18b", new Object[]{this, str});
        }
    }

    public TransportCallback getCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransportCallback) ipChange.ipc$dispatch("c4794909", new Object[]{this});
        }
        return this.mCallback;
    }

    public boolean isCanceled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83e706ee", new Object[]{this})).booleanValue();
        }
        return this.f4047a;
    }

    public void setTransportCallback(TransportCallback transportCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c1df508", new Object[]{this, transportCallback});
        } else {
            this.mCallback = new SafeTransportCallbackWrapper(transportCallback);
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.f4047a = true;
        }
    }
}
