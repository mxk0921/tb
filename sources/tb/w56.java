package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w56 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f30469a = -1;
    public int b = 0;
    public int c = 0;
    public int d = -1;
    public int e = -1;

    static {
        t2o.a(444597328);
    }

    public w56 a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w56) ipChange.ipc$dispatch("b936adb3", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            return this;
        }
        w56 w56Var = new w56();
        w56Var.f30469a = this.f30469a;
        w56Var.b = this.b;
        w56Var.c = this.c;
        w56Var.d = this.d;
        w56Var.e = this.e;
        return w56Var;
    }
}
