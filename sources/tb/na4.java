package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class na4<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public cc4 f24601a;
    public mb4<T> b;

    static {
        t2o.a(803209228);
    }

    public abstract void a();

    public final mb4<T> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mb4) ipChange.ipc$dispatch("771dbd8a", new Object[]{this});
        }
        return this.b;
    }

    public final cc4 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cc4) ipChange.ipc$dispatch("33940a0a", new Object[]{this});
        }
        cc4 cc4Var = this.f24601a;
        if (cc4Var != null) {
            return cc4Var;
        }
        ckf.y("componentInfo");
        throw null;
    }

    public abstract View d();

    public final void e(mb4<T> mb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10df2936", new Object[]{this, mb4Var});
        } else {
            this.b = mb4Var;
        }
    }

    public final void f(cc4 cc4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7e8652e", new Object[]{this, cc4Var});
            return;
        }
        ckf.g(cc4Var, "<set-?>");
        this.f24601a = cc4Var;
    }

    public abstract void g();
}
