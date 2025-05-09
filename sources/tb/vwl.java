package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vwl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30302a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final vwl f30303a = new vwl();

        static {
            t2o.a(806356391);
        }

        public static /* synthetic */ vwl a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vwl) ipChange.ipc$dispatch("ccc96517", new Object[0]);
            }
            return f30303a;
        }
    }

    static {
        t2o.a(806356389);
    }

    public static vwl e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vwl) ipChange.ipc$dispatch("6929735c", new Object[0]);
        }
        return b.a();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c54a5", new Object[]{this})).booleanValue();
        }
        if (g() && f() && giv.c() != null && giv.c().c() && !hjr.i() && d4s.e("enableLowDeviceMsgOpt", false) && d4s.c("enableLowDeviceMsgOpt", "enableLowDeviceMsgOpt", false)) {
            return true;
        }
        return false;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f14aa7", new Object[]{this})).booleanValue();
        }
        if (g() && f() && giv.c() != null && giv.c().c() && d4s.e("enableLowFrameRate", true) && d4s.c("enableLowFrameRate", "enableLowFrameRate", false)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a12e08c", new Object[]{this})).booleanValue();
        }
        if (!g()) {
            return false;
        }
        return d4s.d("enablePerfTestMode");
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad70f6c0", new Object[]{this})).booleanValue();
        }
        if (qvs.J0() == 3 || qvs.J0() == 2 || qvs.J0() == 4 || e().c()) {
            return true;
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[]{this})).booleanValue();
        }
        if (qp0.b() == 2) {
            return true;
        }
        return false;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64ac882f", new Object[]{this})).booleanValue();
        }
        return this.f30302a;
    }

    public vwl() {
        this.f30302a = d4s.e("isPerfTotalOpen", true);
    }
}
