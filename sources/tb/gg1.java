package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gg1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f19964a;
    public int b;
    public long c;

    static {
        t2o.a(295699141);
    }

    public gg1(long j, int i, int i2) {
        this.c = j;
        this.f19964a = i;
        this.b = i2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f19964a = 0;
        this.b = 0;
        this.c = -1L;
    }

    public void b(gg1 gg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3afdf9f1", new Object[]{this, gg1Var});
        } else if (gg1Var != null) {
            this.c = gg1Var.c;
            this.f19964a = gg1Var.f19964a;
            this.b = gg1Var.b;
        }
    }
}
