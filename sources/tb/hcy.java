package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.achieve.AdMonitorType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hcy implements leb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public leb f20549a;
    public Handler b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20550a;
        public final /* synthetic */ AdMonitorType b;
        public final /* synthetic */ bd0 c;

        public a(String str, AdMonitorType adMonitorType, bd0 bd0Var) {
            this.f20550a = str;
            this.b = adMonitorType;
            this.c = bd0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (hcy.f(hcy.this) != null) {
                hcy.f(hcy.this).d(this.f20550a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f20551a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ AdMonitorType d;
        public final /* synthetic */ bd0 e;

        public b(int i, String str, String str2, AdMonitorType adMonitorType, bd0 bd0Var) {
            this.f20551a = i;
            this.b = str;
            this.c = str2;
            this.d = adMonitorType;
            this.e = bd0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (hcy.f(hcy.this) != null) {
                hcy.f(hcy.this).c(this.f20551a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f20552a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ AdMonitorType d;
        public final /* synthetic */ bd0 e;

        public c(int i, String str, String str2, AdMonitorType adMonitorType, bd0 bd0Var) {
            this.f20552a = i;
            this.b = str;
            this.c = str2;
            this.d = adMonitorType;
            this.e = bd0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (hcy.f(hcy.this) != null) {
                hcy.f(hcy.this).a(this.f20552a, this.b, this.c, this.d, this.e);
            }
        }
    }

    static {
        t2o.a(283115533);
        t2o.a(283115532);
    }

    public static /* synthetic */ leb f(hcy hcyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (leb) ipChange.ipc$dispatch("e1718652", new Object[]{hcyVar});
        }
        return hcyVar.f20549a;
    }

    @Override // tb.leb
    public void a(int i, String str, String str2, AdMonitorType adMonitorType, bd0 bd0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba0c52d5", new Object[]{this, new Integer(i), str, str2, adMonitorType, bd0Var});
        } else if (this.f20549a != null) {
            e().post(new c(i, str, str2, adMonitorType, bd0Var));
        }
    }

    @Override // tb.leb
    public Looper b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Looper) ipChange.ipc$dispatch("92edbba3", new Object[]{this});
        }
        leb lebVar = this.f20549a;
        if (lebVar == null || lebVar.b() == null) {
            return Looper.myLooper();
        }
        return this.f20549a.b();
    }

    @Override // tb.leb
    public void c(int i, String str, String str2, AdMonitorType adMonitorType, bd0 bd0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56457a61", new Object[]{this, new Integer(i), str, str2, adMonitorType, bd0Var});
        } else if (this.f20549a != null) {
            e().post(new b(i, str, str2, adMonitorType, bd0Var));
        }
    }

    @Override // tb.leb
    public void d(String str, AdMonitorType adMonitorType, bd0 bd0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9accf6df", new Object[]{this, str, adMonitorType, bd0Var});
        } else if (this.f20549a != null) {
            e().post(new a(str, adMonitorType, bd0Var));
        }
    }

    public final synchronized Handler e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("524179c1", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new Handler(b());
        }
        return this.b;
    }

    public void g(leb lebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d491c28", new Object[]{this, lebVar});
        } else {
            this.f20549a = lebVar;
        }
    }
}
