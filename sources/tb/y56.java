package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y56 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f31861a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;

    static {
        t2o.a(444597331);
    }

    public y56 a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y56) ipChange.ipc$dispatch("ee2174aa", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            return this;
        }
        y56 y56Var = new y56();
        y56Var.f31861a = this.f31861a;
        y56Var.b = this.b;
        y56Var.c = this.c;
        y56Var.d = this.d;
        y56Var.e = this.e;
        return y56Var;
    }
}
