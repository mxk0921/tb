package com.taobao.android.virtual_thread.face;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.c;
import com.taobao.android.virtual_thread.stub.StubThreadLocal;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends StubThreadLocal<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c.a f9894a;

        public a(b bVar, c.a aVar) {
            this.f9894a = aVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/face/StubThreadLocalFactory$1");
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        @Override // com.taobao.android.virtual_thread.stub.StubThreadLocal, java.lang.ThreadLocal
        public T initialValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("2908671e", new Object[]{this});
            }
            return this.f9894a.get();
        }
    }

    static {
        t2o.a(974127105);
        t2o.a(972029958);
    }

    @Override // com.taobao.android.virtual_thread.face.c
    public <T> ThreadLocal<T> a(c.a<? extends T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadLocal) ipChange.ipc$dispatch("8bcaf5a4", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return new StubThreadLocal();
        }
        return new a(this, aVar);
    }
}
