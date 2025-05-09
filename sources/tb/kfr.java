package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class kfr<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Object f22634a;
    public T c;

    static {
        t2o.a(803209247);
    }

    public abstract T a(qd2 qd2Var);

    public final <U> U b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (U) ipChange.ipc$dispatch("cd159565", new Object[]{this});
        }
        return (U) this.f22634a;
    }

    public final void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649e3515", new Object[]{this, obj});
        } else {
            this.f22634a = obj;
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.c = null;
        this.f22634a = null;
    }

    public final T e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b4c825f8", new Object[]{this});
        }
        return this.c;
    }

    public final void f(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92cc54a", new Object[]{this, t});
        } else {
            this.c = t;
        }
    }
}
