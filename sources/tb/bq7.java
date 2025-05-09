package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bq7 implements jn2<cq7> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16551a;
    public cq7 b;

    static {
        t2o.a(620757018);
        t2o.a(620757013);
    }

    public cq7 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cq7) ipChange.ipc$dispatch("4bdad503", new Object[]{this});
        }
        if (this.f16551a) {
            return this.b;
        }
        this.f16551a = true;
        cq7 cq7Var = this.b;
        if (cq7Var != null) {
            cq7Var.init();
        }
        return this.b;
    }

    public jn2<cq7> b(cq7 cq7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jn2) ipChange.ipc$dispatch("ff95387", new Object[]{this, cq7Var});
        }
        this.b = cq7Var;
        return this;
    }
}
