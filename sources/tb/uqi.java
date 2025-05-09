package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uqi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MessageServiceTransaction";

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<bwd> f29558a;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public c j;
    public final c k;
    public int l = 0;
    public int m = 0;
    public final zvd o = new a();
    public final zvd p = new b();
    public int b = 100;
    public final Handler n = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements zvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.uqi$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class RunnableC1074a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f29560a;

            public RunnableC1074a(int i) {
                this.f29560a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (this.f29560a == 1000) {
                    uqi.b(uqi.this, "single subscribe success");
                    uqi.c(uqi.this);
                } else {
                    uqi.b(uqi.this, "single subscribe error");
                    uqi.d(uqi.this, this.f29560a);
                }
            }
        }

        public a() {
        }

        @Override // tb.zvd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else if (uqi.a(uqi.this) != null) {
                uqi.a(uqi.this).post(new RunnableC1074a(i));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements zvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f29562a;

            public a(int i) {
                this.f29562a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (this.f29562a == 1000) {
                    uqi.b(uqi.this, "single unSubscribe success");
                    uqi.e(uqi.this);
                } else {
                    uqi.b(uqi.this, "single unSubscribe error");
                    uqi.f(uqi.this, this.f29562a);
                }
            }
        }

        public b() {
        }

        @Override // tb.zvd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else if (uqi.a(uqi.this) != null) {
                uqi.a(uqi.this).post(new a(i));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a(int i, uqi uqiVar);

        void c(uqi uqiVar);

        void d(uqi uqiVar);

        void e(int i, uqi uqiVar);
    }

    static {
        t2o.a(806356167);
    }

    public uqi(tqi tqiVar) {
        this.g = "";
        this.k = tqiVar.h;
        this.f29558a = tqiVar.i;
        this.c = tqiVar.f();
        this.d = tqiVar.e();
        this.e = tqiVar.a();
        this.f = tqiVar.b();
        this.g = tqiVar.d();
        this.h = tqiVar.g();
        this.i = tqiVar.c();
    }

    public static /* synthetic */ Handler a(uqi uqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("9168001", new Object[]{uqiVar});
        }
        return uqiVar.n;
    }

    public static /* synthetic */ void b(uqi uqiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("190f1b30", new Object[]{uqiVar, str});
        } else {
            uqiVar.s(str);
        }
    }

    public static /* synthetic */ void c(uqi uqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b12327", new Object[]{uqiVar});
        } else {
            uqiVar.y();
        }
    }

    public static /* synthetic */ void d(uqi uqiVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53d4b89b", new Object[]{uqiVar, new Integer(i)});
        } else {
            uqiVar.x(i);
        }
    }

    public static /* synthetic */ void e(uqi uqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d02ba9", new Object[]{uqiVar});
        } else {
            uqiVar.A();
        }
    }

    public static /* synthetic */ void f(uqi uqiVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5096c059", new Object[]{uqiVar, new Integer(i)});
        } else {
            uqiVar.z(i);
        }
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abc2064c", new Object[0]);
        }
        return UUID.randomUUID().toString();
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5608fd2", new Object[]{this});
        } else {
            u();
        }
    }

    public void B(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08b986a", new Object[]{this, cVar});
        } else {
            this.j = cVar;
        }
    }

    public void C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfef36d", new Object[]{this, new Integer(i)});
            return;
        }
        s("setState before " + vqi.a(this.b));
        this.b = i;
        s("setState after " + vqi.a(this.b));
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("842ad8e4", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3babe84c", new Object[]{this});
        }
        return this.f;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcd84ee", new Object[]{this});
        }
        return this.i;
    }

    public c k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f226e50e", new Object[]{this});
        }
        return this.k;
    }

    public WeakReference<bwd> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("43e7c32", new Object[]{this});
        }
        return this.f29558a;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
        }
        return this.g;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9744dbb6", new Object[]{this});
        }
        return this.d;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.c;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14cbff24", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c32224ba", new Object[]{this})).booleanValue();
        }
        WeakReference<bwd> weakReference = this.f29558a;
        if (weakReference == null || weakReference.get() == null || this.c == null || this.d == null) {
            return false;
        }
        return true;
    }

    public final void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        String str2 = xlr.TAG;
        eir.a(str2, "MessageServiceTransaction-" + this.c + "-" + this.d + " " + str);
    }

    public final void t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9f49b0", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.e(i, this);
        }
        c cVar2 = this.j;
        if (cVar2 != null) {
            cVar2.e(i, this);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MessageServiceTransaction{mState=" + vqi.a(this.b) + ", topic='" + this.c + "', pmSession='" + this.d + "', mBizCode=" + this.e + ", mChannel='" + this.f + "', nick='" + this.g + "', isFandom=" + this.h + '}';
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178c053c", new Object[]{this});
            return;
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.c(this);
        }
        c cVar2 = this.j;
        if (cVar2 != null) {
            cVar2.c(this);
        }
    }

    public final void v(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f394882e", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.a(i, this);
        }
        c cVar2 = this.j;
        if (cVar2 != null) {
            cVar2.a(i, this);
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52b9c3a", new Object[]{this});
            return;
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.d(this);
        }
        c cVar2 = this.j;
        if (cVar2 != null) {
            cVar2.d(this);
        }
    }

    public void D() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da1acd1", new Object[]{this});
            return;
        }
        s("subscribe mEnterRetryCount = " + this.l);
        bwd bwdVar = this.f29558a.get();
        if (bwdVar != null) {
            int i = this.e;
            String str2 = this.c;
            String str3 = this.f;
            String str4 = this.g;
            if (this.h) {
                str = "33";
            } else {
                str = "tb";
            }
            bwdVar.q(i, str2, str3, str4, str, this.i, this.o, new Object[0]);
        }
    }

    public void E() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd50eb8", new Object[]{this});
            return;
        }
        s("unSubscribe mLeaveRetryCount = " + this.m);
        bwd bwdVar = this.f29558a.get();
        if (bwdVar != null) {
            int i = this.e;
            String str2 = this.c;
            String str3 = this.f;
            String str4 = this.g;
            if (this.h) {
                str = "33";
            } else {
                str = "tb";
            }
            bwdVar.k(i, str2, str3, str4, str, this.i, this.p, new Object[0]);
        } else if (hjr.u()) {
            s("unSubscribe realLiveMsgService is null,redirect notifyLeaveFail");
            t(2000);
            this.m = 0;
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e22911", new Object[]{this});
            return;
        }
        w();
        if (d4s.e("enablePMIrregularTrack", true)) {
            HashMap hashMap = new HashMap();
            hashMap.put("subscribe", "success");
            v2s.o().E().trackCustom(yj4.STAIN_TRACK_PAGE, 2101, "Page_liveRoomStability_lpm_pmStability", "", "", hashMap);
        }
    }

    public final void x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f665ec5", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.l;
        if (i2 < 3) {
            this.l = i2 + 1;
            D();
            return;
        }
        v(i);
        this.l = 0;
        if (d4s.e("enablePMIrregularTrack", true)) {
            HashMap hashMap = new HashMap();
            hashMap.put("subscribe", "fail");
            v2s.o().E().trackCustom(yj4.STAIN_TRACK_PAGE, 2101, "Page_liveRoomStability_lpm_pmStability", "", "", hashMap);
        }
    }

    public final void z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32181c6", new Object[]{this, new Integer(i)});
        } else if (hjr.E("enableRedirectNotifyLeaveFail", true)) {
            s("unSubscribe onLeaveFail redirect notifyLeaveFail, result = " + i);
            t(i);
        } else {
            int i2 = this.m;
            if (i2 < 3) {
                this.m = i2 + 1;
                E();
                return;
            }
            t(i);
            this.m = 0;
        }
    }
}
