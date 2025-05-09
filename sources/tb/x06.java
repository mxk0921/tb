package tb;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x06 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31047a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public String h;
    public String k;
    public String l;
    public Drawable m;
    public double g = 0.5d;
    public int i = 0;
    public int j = 2;
    public boolean n = true;
    public boolean o = true;
    public boolean p = true;
    public boolean q = false;
    public boolean r = false;

    static {
        t2o.a(444597306);
    }

    public x06() {
        this.c = -1;
        if (zg5.r4()) {
            this.c = 1;
        }
    }

    public x06 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x06) ipChange.ipc$dispatch("d03f3ee7", new Object[]{this});
        }
        x06 x06Var = new x06();
        x06Var.f31047a = this.f31047a;
        x06Var.b = this.b;
        x06Var.c = this.c;
        x06Var.d = this.d;
        x06Var.e = this.e;
        x06Var.f = this.f;
        x06Var.g = this.g;
        x06Var.h = this.h;
        x06Var.i = this.i;
        x06Var.j = this.j;
        x06Var.k = this.k;
        x06Var.l = this.l;
        x06Var.m = this.m;
        x06Var.n = this.n;
        x06Var.o = this.o;
        x06Var.p = this.p;
        x06Var.q = this.q;
        x06Var.r = this.r;
        return x06Var;
    }
}
