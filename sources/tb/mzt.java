package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mzt implements e1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final f0q f24417a;

    static {
        t2o.a(962592927);
        t2o.a(962592943);
    }

    public mzt() {
        this.f24417a = null;
        try {
            this.f24417a = new f0q();
        } catch (Throwable unused) {
            nhh.g();
            this.f24417a = null;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60ed2b1c", new Object[]{this})).intValue();
        }
        f0q f0qVar = this.f24417a;
        if (f0qVar != null) {
            return f0qVar.b();
        }
        return 0;
    }

    @Override // tb.e1e
    public ozt b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozt) ipChange.ipc$dispatch("f80b62d6", new Object[]{this});
        }
        f0q f0qVar = this.f24417a;
        if (f0qVar != null) {
            return f0qVar.d();
        }
        return null;
    }

    @Override // tb.e1e
    public void c(qe2 qe2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff5b6f3", new Object[]{this, qe2Var});
            return;
        }
        f0q f0qVar = this.f24417a;
        if (f0qVar != null) {
            f0qVar.g(qe2Var.a());
        }
    }
}
