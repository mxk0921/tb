package com.taobao.android.virtual_thread.stub;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.stub.annotation.Exchange;
import tb.t2o;
import tb.uiw;

/* compiled from: Taobao */
@Exchange({ThreadLocal.class, uiw.class})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class StubThreadLocal<T> extends ThreadLocal<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final boolean isVirtual = true;
    private final uiw<T> virtualThreadLocal = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends uiw<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/stub/StubThreadLocal$1");
        }

        @Override // tb.uiw
        public T b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("2908671e", new Object[]{this});
            }
            return (T) StubThreadLocal.this.initialValue();
        }
    }

    static {
        t2o.a(974127121);
    }

    public static /* synthetic */ Object ipc$super(StubThreadLocal stubThreadLocal, String str, Object... objArr) {
        if (str.hashCode() == 688416542) {
            return super.initialValue();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/stub/StubThreadLocal");
    }

    @Override // java.lang.ThreadLocal
    public T get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        return this.virtualThreadLocal.a();
    }

    @Override // java.lang.ThreadLocal
    public T initialValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2908671e", new Object[]{this});
        }
        return (T) super.initialValue();
    }

    @Override // java.lang.ThreadLocal
    public void remove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41689b0b", new Object[]{this});
        } else {
            this.virtualThreadLocal.c();
        }
    }

    @Override // java.lang.ThreadLocal
    public void set(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6236785", new Object[]{this, t});
        } else {
            this.virtualThreadLocal.d(t);
        }
    }
}
