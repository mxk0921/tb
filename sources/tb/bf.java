package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class bf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bmc f16349a;
    public v2d b;
    public x2d c;
    public yrk d;

    static {
        t2o.a(806355724);
        t2o.a(806355730);
    }

    public yrk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yrk) ipChange.ipc$dispatch("a9f080e1", new Object[]{this});
        }
        return this.d;
    }

    public bmc b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bmc) ipChange.ipc$dispatch("6780b94b", new Object[]{this});
        }
        return this.f16349a;
    }

    public v2d c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v2d) ipChange.ipc$dispatch("a117e1eb", new Object[]{this});
        }
        return this.b;
    }

    public x2d d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x2d) ipChange.ipc$dispatch("1885e971", new Object[]{this});
        }
        return this.c;
    }

    public void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154e9b71", new Object[]{this, obj});
        }
    }

    public void f(yrk yrkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6701ad53", new Object[]{this, yrkVar});
        } else {
            this.d = yrkVar;
        }
    }

    public void g(bmc bmcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91edbd1", new Object[]{this, bmcVar});
        } else {
            this.f16349a = bmcVar;
        }
    }

    public void h(v2d v2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe65b17b", new Object[]{this, v2dVar});
        } else {
            this.b = v2dVar;
        }
    }

    public void i(x2d x2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6515a2ef", new Object[]{this, x2dVar});
        } else {
            this.c = x2dVar;
        }
    }
}
