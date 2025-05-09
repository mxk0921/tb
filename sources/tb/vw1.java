package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class vw1<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<V> f30291a = new AtomicReference<>();

    static {
        t2o.a(1032847375);
    }

    public abstract V a();

    public V b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("c7ddcbe1", new Object[]{this});
        }
        V v = this.f30291a.get();
        if (v == null) {
            synchronized (vw1.class) {
                try {
                    v = this.f30291a.get();
                    if (v == null) {
                        v = a();
                        if (!sng.a(this.f30291a, null, v)) {
                            return this.f30291a.get();
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
