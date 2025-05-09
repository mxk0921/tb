package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w3q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public x3q f30434a;

    static {
        t2o.a(468713954);
    }

    public w3q(uq9 uq9Var) {
    }

    public x3q a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3q) ipChange.ipc$dispatch("8d52bc34", new Object[]{this});
        }
        return this.f30434a;
    }

    public void b(x3q x3qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac14a8ea", new Object[]{this, x3qVar});
        } else {
            this.f30434a = x3qVar;
        }
    }
}
