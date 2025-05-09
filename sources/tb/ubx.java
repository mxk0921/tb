package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.i8c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ubx implements i8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(852492374);
        t2o.a(843055246);
    }

    public ubx(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
    }

    @Override // tb.i8c
    public String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc023456", new Object[]{this});
        }
        return "3000000069082854";
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            i8c.a.a(this, bbsVar);
        }
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            i8c.a.b(this);
        }
    }
}
