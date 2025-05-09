package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u56 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f29150a = -1;
    public String b;
    public String c;

    static {
        t2o.a(444597326);
    }

    public u56 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u56) ipChange.ipc$dispatch("7ebbb2ad", new Object[]{this});
        }
        u56 u56Var = new u56();
        u56Var.f29150a = this.f29150a;
        u56Var.b = this.b;
        u56Var.c = this.c;
        return u56Var;
    }
}
