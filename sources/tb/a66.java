package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a66 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public double f15562a;
    public int f;
    public int g;
    public String j;
    public HashMap<String, Integer> k;
    public int b = -1;
    public boolean c = false;
    public int d = 1;
    public boolean e = true;
    public int h = 0;
    public boolean i = false;
    public boolean l = false;
    public boolean m = true;
    public boolean n = false;
    public boolean o = false;

    static {
        t2o.a(444597333);
    }

    public a66 a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a66) ipChange.ipc$dispatch("898ffea2", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            return this;
        }
        a66 a66Var = new a66();
        a66Var.f15562a = this.f15562a;
        a66Var.b = this.b;
        a66Var.c = this.c;
        a66Var.d = this.d;
        a66Var.e = this.e;
        a66Var.f = this.f;
        a66Var.g = this.g;
        a66Var.h = this.h;
        a66Var.i = this.i;
        a66Var.j = this.j;
        a66Var.k = this.k;
        a66Var.l = this.l;
        a66Var.n = this.n;
        a66Var.m = this.m;
        a66Var.o = this.o;
        return a66Var;
    }
}
