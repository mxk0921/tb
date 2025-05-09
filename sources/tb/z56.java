package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class z56 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f32549a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g = Integer.MIN_VALUE;
    public int h = Integer.MIN_VALUE;

    static {
        t2o.a(444597332);
    }

    public z56 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z56) ipChange.ipc$dispatch("7dfbce6e", new Object[]{this});
        }
        z56 z56Var = new z56();
        z56Var.d = this.d;
        z56Var.f32549a = this.f32549a;
        z56Var.c = this.c;
        z56Var.b = this.b;
        z56Var.f = this.f;
        z56Var.e = this.e;
        z56Var.h = this.h;
        z56Var.g = this.g;
        return z56Var;
    }
}
