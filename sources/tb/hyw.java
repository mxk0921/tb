package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class hyw<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<T> f20974a;

    static {
        t2o.a(1001390095);
    }

    public hyw(T t) {
        ckf.g(t, "ref");
        this.f20974a = new WeakReference<>(t);
    }

    public final T a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        return this.f20974a.get();
    }
}
