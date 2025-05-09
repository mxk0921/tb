package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yc2 implements jn2<xc2> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public xc2 f31975a;
    public boolean b;

    static {
        t2o.a(620757012);
        t2o.a(620757013);
    }

    public synchronized xc2 a() {
        xc2 xc2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xc2) ipChange.ipc$dispatch("71392127", new Object[]{this});
        }
        if (p0m.m()) {
            return null;
        }
        if (this.b && (xc2Var = this.f31975a) != null) {
            return xc2Var;
        }
        this.b = true;
        if (this.f31975a == null) {
            vmh<String, bu2> b = s0m.B().Z().b();
            if (b instanceof xc2) {
                xc2 xc2Var2 = (xc2) b;
                this.f31975a = xc2Var2;
                xc2Var2.c(b.e() / 4);
            }
        }
        return this.f31975a;
    }
}
