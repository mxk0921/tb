package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dxcommon.expression.DXExprException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c56 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f16867a;
    public int b;
    public final gh5 c;
    public final yx5 d;
    public final hw5 e = new hw5();
    public final ux5 f;

    static {
        t2o.a(444597885);
    }

    public c56() {
        gh5 gh5Var = new gh5();
        this.c = gh5Var;
        this.d = new yx5(gh5Var);
        this.f = new ux5(gh5Var);
    }

    public gh5 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gh5) ipChange.ipc$dispatch("8a1088d3", new Object[]{this});
        }
        return this.c;
    }

    public hw5 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hw5) ipChange.ipc$dispatch("e2208590", new Object[]{this});
        }
        return this.e;
    }

    public yx5 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yx5) ipChange.ipc$dispatch("2fd22c2", new Object[]{this});
        }
        return this.d;
    }

    public ux5 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux5) ipChange.ipc$dispatch("a81bf7cc", new Object[]{this});
        }
        return this.f;
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b780e9", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcb2e3c", new Object[]{this, new Integer(i)});
        } else {
            this.f16867a = i;
        }
    }

    public boolean e(lg5 lg5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a05386f6", new Object[]{this, lg5Var})).booleanValue();
        }
        int i = this.f16867a;
        lg5Var.k(i);
        lg5Var.j();
        lg5Var.h();
        byte e = lg5Var.e();
        lg5Var.c();
        for (int i2 = 0; i2 < e; i2++) {
            byte e2 = lg5Var.e();
            if (e2 == 0) {
                this.c.f(lg5Var.h() + i);
                this.c.e(lg5Var.h());
                int c = lg5Var.c();
                this.c.c(lg5Var);
                lg5Var.k(c);
            } else if (e2 == 1) {
                this.d.d(lg5Var.h() + i);
                this.d.c(lg5Var.h());
                int c2 = lg5Var.c();
                this.d.b(lg5Var);
                lg5Var.k(c2);
            } else if (e2 == 2) {
                this.e.e(lg5Var.h() + i);
                this.e.f(lg5Var.h());
                int c3 = lg5Var.c();
                this.e.d(lg5Var);
                lg5Var.k(c3);
            } else if (e2 == 3) {
                this.f.d(lg5Var.h() + i);
                this.f.c(lg5Var.h());
                this.f.b(lg5Var);
            }
        }
        if (this.b == lg5Var.c() - this.f16867a) {
            return true;
        }
        throw new DXExprException("读取方法区失败，读取的长度跟写入的长度对不上 ");
    }
}
