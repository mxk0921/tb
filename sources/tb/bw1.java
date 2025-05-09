package tb;

import android.os.Bundle;
import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class bw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ta0 f16674a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297107);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481297106);
    }

    public bw1(ta0 ta0Var) {
        ckf.g(ta0Var, "activityAdapter");
        this.f16674a = ta0Var;
    }

    public abstract void a();

    public final ta0 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ta0) ipChange.ipc$dispatch("23b0ed23", new Object[]{this});
        }
        return this.f16674a;
    }

    public abstract String c();

    public abstract cw1 d();

    public abstract boolean e();

    public abstract void f();

    public abstract boolean g(int i, KeyEvent keyEvent);

    public abstract void h();

    public abstract void i();

    public abstract void j(Bundle bundle);

    public abstract void k(Integer num);

    public abstract void l();

    public abstract void m();
}
