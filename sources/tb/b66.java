package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b66 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f16205a;
    public int b;
    public int c;
    public int d;

    static {
        t2o.a(444597334);
    }

    public b66 a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b66) ipChange.ipc$dispatch("e738cc71", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            return this;
        }
        b66 b66Var = new b66();
        b66Var.f16205a = this.f16205a;
        b66Var.b = this.b;
        b66Var.c = this.c;
        b66Var.d = this.d;
        return b66Var;
    }
}
