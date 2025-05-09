package tb;

import android.util.LruCache;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class awf {

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<Class, etx> f16043a = new LruCache<>(100);

    public etx a(Class cls) {
        return this.f16043a.get(cls);
    }

    public void b(Class cls, etx etxVar) {
        this.f16043a.put(cls, etxVar);
    }
}
