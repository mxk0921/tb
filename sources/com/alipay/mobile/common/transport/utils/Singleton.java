package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class Singleton<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f4155a;

    public abstract T create();

    public final T get() {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        synchronized (this) {
            try {
                if (this.f4155a == null) {
                    this.f4155a = create();
                }
                t = this.f4155a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
