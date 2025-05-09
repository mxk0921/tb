package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class f6z<K, V> extends LruCache<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a2a<Boolean, K, V, V, String, xhv> f19052a;
    public final String b;

    static {
        t2o.a(598737236);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f6z(int i, a2a<? super Boolean, ? super K, ? super V, ? super V, ? super String, xhv> a2aVar, String str) {
        super(i);
        this.f19052a = a2aVar;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(f6z f6zVar, String str, Object... objArr) {
        if (str.hashCode() == -877389389) {
            super.entryRemoved(((Boolean) objArr[0]).booleanValue(), objArr[1], objArr[2], objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/cache/EvictingLruCache");
    }

    @Override // android.util.LruCache
    public void entryRemoved(boolean z, K k, V v, V v2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), k, v, v2});
            return;
        }
        super.entryRemoved(z, k, v, v2);
        a2a<Boolean, K, V, V, String, xhv> a2aVar = this.f19052a;
        if (a2aVar != null) {
            a2aVar.invoke(Boolean.valueOf(z), k, v, v2, this.b);
        }
    }
}
