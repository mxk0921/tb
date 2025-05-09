package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a16 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f15475a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        t2o.a(444597868);
        t2o.a(444597873);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a153f16", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc56f447", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bde3e2", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a18b0b24", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("578ecdb1", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3670453", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4e64025", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10f0c672", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18a64eeb", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public boolean j(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2df0ee7", new Object[]{this, lg5Var, dXRuntimeContext})).booleanValue();
        }
        lg5Var.k(this.f15475a);
        this.b = lg5Var.h();
        this.c = lg5Var.h();
        this.d = lg5Var.h();
        lg5Var.h();
        this.e = lg5Var.h();
        this.f = lg5Var.h();
        this.g = lg5Var.h();
        lg5Var.h();
        this.h = lg5Var.h();
        lg5Var.h();
        this.i = lg5Var.h();
        lg5Var.h();
        this.j = lg5Var.h();
        lg5Var.h();
        return true;
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75807baa", new Object[]{this, new Integer(i)});
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc407cbd", new Object[]{this, new Integer(i)});
        } else {
            this.f15475a = i;
        }
    }
}
