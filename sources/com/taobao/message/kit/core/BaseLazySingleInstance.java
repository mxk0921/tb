package com.taobao.message.kit.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.sng;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class BaseLazySingleInstance<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AtomicReference<V> fCachedValue = new AtomicReference<>();

    static {
        t2o.a(529530938);
    }

    public abstract V costlyIdempotentOperation();

    public V getLazy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("c7ddcbe1", new Object[]{this});
        }
        V v = this.fCachedValue.get();
        if (v == null) {
            synchronized (BaseLazySingleInstance.class) {
                try {
                    v = this.fCachedValue.get();
                    if (v == null) {
                        v = costlyIdempotentOperation();
                        if (!sng.a(this.fCachedValue, null, v)) {
                            return this.fCachedValue.get();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return v;
    }
}
