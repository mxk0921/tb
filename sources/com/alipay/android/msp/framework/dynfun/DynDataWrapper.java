package com.alipay.android.msp.framework.dynfun;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DynDataWrapper<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f3601a;
    public final int b;
    public final String c;

    public DynDataWrapper(int i, String str, T t) {
        this.b = i;
        this.c = str;
        this.f3601a = t;
        if (drmEnabled()) {
            NativeDynFunManager.registerData(i, str, this);
        }
    }

    public static boolean drmEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c604402d", new Object[0])).booleanValue();
        }
        return DynConstants.drmEnabled();
    }

    public T read() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b7aff1b5", new Object[]{this});
        }
        return this.f3601a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DynDataWrapper{val=" + this.f3601a + ", bizId=" + this.b + ", name='" + this.c + "'}";
    }

    public void write(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee59742", new Object[]{this, t});
        } else {
            this.f3601a = t;
        }
    }

    public void writeInner(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe2e71a", new Object[]{this, t});
        } else {
            this.f3601a = t;
        }
    }
}
