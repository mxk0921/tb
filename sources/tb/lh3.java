package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class lh3<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lh3 f23335a;

    static {
        t2o.a(478150692);
    }

    public lh3(lh3 lh3Var) {
        this.f23335a = lh3Var;
    }

    public boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9b91fa3", new Object[]{this, t})).booleanValue();
        }
        lh3 lh3Var = this.f23335a;
        if (lh3Var == null || !lh3Var.b(t)) {
            return false;
        }
        return true;
    }

    public abstract boolean b(T t);
}
