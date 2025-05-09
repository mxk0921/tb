package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c66 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f16888a;
    public int b;
    public int c;
    public int d;

    static {
        t2o.a(444597335);
    }

    public c66 a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c66) ipChange.ipc$dispatch("1f762ea6", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            return this;
        }
        c66 c66Var = new c66();
        c66Var.f16888a = this.f16888a;
        c66Var.b = this.b;
        c66Var.c = this.c;
        c66Var.d = this.d;
        return c66Var;
    }
}
