package com.taobao.android.virtual_thread.face;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.c;
import java.util.Objects;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.virtual_thread.face.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class C0514a<T> extends ThreadLocal<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final c.a<? extends T> f9893a;

        static {
            t2o.a(972029955);
        }

        public C0514a(c.a<? extends T> aVar) {
            Objects.requireNonNull(aVar);
            this.f9893a = aVar;
        }

        public static /* synthetic */ Object ipc$super(C0514a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/face/DefaultThreadLocalFactory$SupplierThreadLocal");
        }

        @Override // java.lang.ThreadLocal
        public T initialValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("2908671e", new Object[]{this});
            }
            return (T) this.f9893a.get();
        }
    }

    static {
        t2o.a(972029954);
        t2o.a(972029958);
    }

    @Override // com.taobao.android.virtual_thread.face.c
    public <T> ThreadLocal<T> a(c.a<? extends T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadLocal) ipChange.ipc$dispatch("8bcaf5a4", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return new ThreadLocal<>();
        }
        return new C0514a(aVar);
    }
}
