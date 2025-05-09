package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ywb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public oub f32389a;
    public qvb b;
    public gwb c;
    public zwb d;
    public Class<? extends cwb> e;

    static {
        t2o.a(444598024);
    }

    public Class<? extends cwb> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("74ce26f6", new Object[]{this});
        }
        return this.e;
    }

    public oub<oub> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oub) ipChange.ipc$dispatch("72b020ec", new Object[]{this});
        }
        return this.f32389a;
    }

    public qvb c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qvb) ipChange.ipc$dispatch("4a78cc60", new Object[]{this});
        }
        return this.b;
    }

    public gwb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gwb) ipChange.ipc$dispatch("cdd27352", new Object[]{this});
        }
        return this.c;
    }

    public zwb e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zwb) ipChange.ipc$dispatch("cf4095fa", new Object[]{this});
        }
        return this.d;
    }

    public void f(Class<? extends cwb> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bae0788", new Object[]{this, cls});
        } else {
            this.e = cls;
        }
    }

    public void g(oub<oub> oubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb9ae8e", new Object[]{this, oubVar});
        } else {
            this.f32389a = oubVar;
        }
    }

    public void h(qvb qvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27afecce", new Object[]{this, qvbVar});
        } else {
            this.b = qvbVar;
        }
    }

    public void i(gwb gwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("941ec72e", new Object[]{this, gwbVar});
        } else {
            this.c = gwbVar;
        }
    }

    public void j(zwb zwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac97ef2e", new Object[]{this, zwbVar});
        } else {
            this.d = zwbVar;
        }
    }
}
