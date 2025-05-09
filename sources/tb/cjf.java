package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class cjf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final cjf INSTANCE = new cjf();

    /* renamed from: a  reason: collision with root package name */
    public static dud f17096a;
    public static boc b;
    public static ovc c;
    public static vrb d;
    public static mnb e;
    public static jzb f;
    public static jgb g;
    public static koc h;
    public static sgb i;
    public static j8d j;

    static {
        t2o.a(144703495);
    }

    public final jgb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgb) ipChange.ipc$dispatch("9aaf7fb3", new Object[]{this});
        }
        jgb jgbVar = g;
        if (jgbVar != null) {
            return jgbVar;
        }
        iih.INSTANCE.a("InterfaceInjection", "Please inject appInfo first!");
        return null;
    }

    public final sgb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgb) ipChange.ipc$dispatch("c57b7a33", new Object[]{this});
        }
        sgb sgbVar = i;
        if (sgbVar != null) {
            return sgbVar;
        }
        iih.INSTANCE.a("InterfaceInjection", "Please inject appLifecycleObserverCreater first!");
        return null;
    }

    public final mnb c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mnb) ipChange.ipc$dispatch("41925e93", new Object[]{this});
        }
        return e;
    }

    public final vrb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vrb) ipChange.ipc$dispatch("dd00d881", new Object[]{this});
        }
        return d;
    }

    public final jzb e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzb) ipChange.ipc$dispatch("7d224aaf", new Object[]{this});
        }
        jzb jzbVar = f;
        if (jzbVar != null) {
            return jzbVar;
        }
        iih.INSTANCE.a("InterfaceInjection", "Please inject deviceInfo first!");
        return null;
    }

    public final boc f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boc) ipChange.ipc$dispatch("e575edb3", new Object[]{this});
        }
        return b;
    }

    public final koc g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (koc) ipChange.ipc$dispatch("3735fe73", new Object[]{this});
        }
        koc kocVar = h;
        if (kocVar != null) {
            return kocVar;
        }
        iih.INSTANCE.a("InterfaceInjection", "Please inject loginInfo first!");
        return null;
    }

    public final ovc h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ovc) ipChange.ipc$dispatch("7b395613", new Object[]{this});
        }
        return c;
    }

    public final j8d i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j8d) ipChange.ipc$dispatch("eedc6fd9", new Object[]{this});
        }
        j8d j8dVar = j;
        if (j8dVar != null) {
            return j8dVar;
        }
        iih.INSTANCE.a("InterfaceInjection", "Please inject permission first!");
        return null;
    }

    public final dud j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dud) ipChange.ipc$dispatch("2cf395f5", new Object[]{this});
        }
        return f17096a;
    }

    public final void k(jgb jgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ef8dcf", new Object[]{this, jgbVar});
        } else {
            g = jgbVar;
        }
    }

    public final void l(sgb sgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4220833f", new Object[]{this, sgbVar});
        } else {
            i = sgbVar;
        }
    }

    public final void m(mnb mnbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59074d31", new Object[]{this, mnbVar});
        } else {
            e = mnbVar;
        }
    }

    public final void n(vrb vrbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a316a7", new Object[]{this, vrbVar});
        } else {
            d = vrbVar;
        }
    }

    public final void o(jzb jzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc08e987", new Object[]{this, jzbVar});
        } else {
            f = jzbVar;
        }
    }

    public final void p(boc bocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e993ef", new Object[]{this, bocVar});
        } else {
            b = bocVar;
        }
    }

    public final void q(koc kocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199af33f", new Object[]{this, kocVar});
        } else {
            h = kocVar;
        }
    }

    public final void r(ovc ovcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64146079", new Object[]{this, ovcVar});
        } else {
            c = ovcVar;
        }
    }

    public final void s(j8d j8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("836a7127", new Object[]{this, j8dVar});
        } else {
            j = j8dVar;
        }
    }

    public final void t(dud dudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a87cd67", new Object[]{this, dudVar});
        } else {
            f17096a = dudVar;
        }
    }
}
