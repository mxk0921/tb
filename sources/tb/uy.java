package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class uy<T> implements a92<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public uy<T> f29664a;

    static {
        t2o.a(713031828);
        t2o.a(713031829);
    }

    public final boolean b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a75e0cf", new Object[]{this, t})).booleanValue();
        }
        if (c(t)) {
            return a(t);
        }
        uy<T> uyVar = this.f29664a;
        if (uyVar != null) {
            return uyVar.b(t);
        }
        return false;
    }

    public abstract boolean c(T t);

    public void d(uy<T> uyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("787f654e", new Object[]{this, uyVar});
        } else {
            this.f29664a = uyVar;
        }
    }
}
