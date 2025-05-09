package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class wdg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ajc f30633a;
    public Object b;
    public String c;
    public String d;
    public String e;
    public ghc f;
    public fhc g;

    static {
        t2o.a(507510804);
    }

    public wdg(ajc ajcVar) {
        this.f30633a = ajcVar;
    }

    public final Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("815c6b74", new Object[]{this});
        }
        return this.b;
    }

    public final fhc b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fhc) ipChange.ipc$dispatch("ab7d7367", new Object[]{this});
        }
        return this.g;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c689e537", new Object[]{this});
        }
        return this.d;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec8bd899", new Object[]{this});
        }
        return this.c;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63f8f7fd", new Object[]{this});
        }
        return this.e;
    }

    public final ghc f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghc) ipChange.ipc$dispatch("3f733c1d", new Object[]{this});
        }
        return this.f;
    }

    public final ajc g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ajc) ipChange.ipc$dispatch("33d1b2d5", new Object[]{this});
        }
        return this.f30633a;
    }

    public final void h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e87b4e", new Object[]{this, obj});
        } else {
            this.b = obj;
        }
    }

    public final void i(fhc fhcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3115bfdd", new Object[]{this, fhcVar});
        } else {
            this.g = fhcVar;
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819c491f", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd8c1fd", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacff519", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final void m(ghc ghcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b5fe27", new Object[]{this, ghcVar});
        } else {
            this.f = ghcVar;
        }
    }

    public final void n(ajc ajcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2e08c9d", new Object[]{this, ajcVar});
        } else {
            this.f30633a = ajcVar;
        }
    }
}
