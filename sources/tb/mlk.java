package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mlk<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile T f24121a;
    public volatile fk4<T> b;

    public void a(fk4<T> fk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3941f87", new Object[]{this, fk4Var});
            return;
        }
        this.b = fk4Var;
        T t = this.f24121a;
        if (fk4Var != null && t != null) {
            fk4Var.a(t);
        }
    }

    public void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d18cac", new Object[]{this, t});
            return;
        }
        this.f24121a = t;
        fk4<T> fk4Var = this.b;
        if (fk4Var != null && t != null) {
            fk4Var.a(t);
        }
    }
}
