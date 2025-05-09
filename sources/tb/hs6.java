package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hs6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public qzo f20851a;
    public st6 b;
    public a c;
    public js6 d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        mnd a();
    }

    static {
        t2o.a(463470653);
    }

    public js6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (js6) ipChange.ipc$dispatch("b9c1c662", new Object[]{this});
        }
        return this.d;
    }

    public st6 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (st6) ipChange.ipc$dispatch("3b97dcb", new Object[]{this});
        }
        return this.b;
    }

    public a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2cda68cf", new Object[]{this});
        }
        return this.c;
    }

    public qzo d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzo) ipChange.ipc$dispatch("bf8246dc", new Object[]{this});
        }
        return this.f20851a;
    }

    public void e(js6 js6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee93756", new Object[]{this, js6Var});
        } else {
            this.d = js6Var;
        }
    }

    public void f(st6 st6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7005e4af", new Object[]{this, st6Var});
        } else {
            this.b = st6Var;
        }
    }

    public void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c1a97b", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public void h(qzo qzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf34afc", new Object[]{this, qzoVar});
        } else {
            this.f20851a = qzoVar;
        }
    }
}
