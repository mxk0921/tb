package tb;

import android.app.Application;
import android.content.Context;
import android.text.format.DateFormat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.DiagnoseJSBridge;
import com.taobao.android.diagnose.model.AppInfo;
import com.taobao.android.diagnose.snapshot.ExceptionManager;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.orange.OConstant;
import com.taobao.tao.log.logger.EventLogger;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uk7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f29430a;
    public Application b;
    public boolean c;
    public File d;
    public jgg e;
    public final qk7 f;
    public n04 g;
    public com.taobao.android.diagnose.scene.a h;
    public ExceptionManager i;
    public final zk7 j;
    public otc k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final uk7 f29431a = new uk7();

        static {
            t2o.a(615514119);
        }

        public static /* synthetic */ uk7 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uk7) ipChange.ipc$dispatch("2ce85898", new Object[0]);
            }
            return f29431a;
        }
    }

    static {
        t2o.a(615514117);
    }

    public static uk7 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uk7) ipChange.ipc$dispatch("8b4fcff2", new Object[0]);
        }
        return b.a();
    }

    public uk7 d(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uk7) ipChange.ipc$dispatch("529a04dd", new Object[]{this, application});
        }
        this.b = application;
        this.f29430a = application.getApplicationContext();
        return this;
    }

    public Application e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return this.b;
    }

    public Context f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f29430a;
    }

    public qk7 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qk7) ipChange.ipc$dispatch("6f598cc", new Object[]{this});
        }
        return this.f;
    }

    public nzb h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzb) ipChange.ipc$dispatch("99ce21d8", new Object[]{this});
        }
        return this.j;
    }

    public jgg j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgg) ipChange.ipc$dispatch("b11804a0", new Object[]{this});
        }
        return this.e;
    }

    public File k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("3bb2f520", new Object[]{this});
        }
        return this.d;
    }

    public void l(jgg jggVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1a6133", new Object[]{this, jggVar});
        } else if (!this.c) {
            this.c = true;
            if (jggVar == null) {
                jggVar = new jgg();
            }
            this.e = jggVar;
            idh.a("DiagnoseManager", "DiagnoseManager init!");
            try {
                File file = new File(this.f29430a.getFilesDir(), "diagnose");
                this.d = file;
                if (!file.exists()) {
                    this.d.mkdirs();
                }
                mk7.k(this.f29430a);
                if (!mk7.n()) {
                    idh.b("DiagnoseManager", "DiagnoseManager is disable");
                    return;
                }
                p();
                al7.b().a(new Runnable() { // from class: tb.rk7
                    @Override // java.lang.Runnable
                    public final void run() {
                        uk7.this.m();
                    }
                });
                idh.a("DiagnoseManager", "DiagnoseManager init Done!");
            } catch (Exception e) {
                idh.c("DiagnoseManager", "Exception when init diagnose SDK: ", e);
            }
        }
    }

    public final /* synthetic */ void m() {
        otc otcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5073a3dd", new Object[]{this});
            return;
        }
        if (this.e.m) {
            HashMap hashMap = new HashMap();
            hashMap.put("appVersion", this.e.f);
            hashMap.put("process", this.e.g);
            hashMap.put(OConstant.LAUNCH_ENVINDEX, Integer.valueOf(this.e.i));
            hashMap.put(v4s.PARAM_IS_INNER, Boolean.valueOf(this.f.c().isInner));
            lwt.a(this.f29430a, hashMap);
        }
        ExceptionManager exceptionManager = new ExceptionManager(this.f29430a, this.f);
        this.i = exceptionManager;
        exceptionManager.i();
        n04 n04Var = new n04(this.b, this.f);
        this.g = n04Var;
        n04Var.b();
        com.taobao.android.diagnose.scene.a aVar = new com.taobao.android.diagnose.scene.a(this.f29430a, this.f);
        this.h = aVar;
        this.i.q(aVar, this.g);
        this.g.c(this.h);
        this.h.g();
        this.j.f(this.h, this.f);
        if (mk7.m() && (otcVar = this.k) != null) {
            wk7.c(this.f29430a, this.h, otcVar);
            this.k.init(this.f29430a, this.e);
        }
        DiagnoseJSBridge.init();
    }

    public final /* synthetic */ void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bf3707", new Object[]{this});
        } else {
            EventLogger.builder(1).setTime(this.e.e).setData(this.f.c().toMap()).log(al7.b().c());
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19578fae", new Object[]{this});
        } else {
            al7.b().a(new Runnable() { // from class: tb.sk7
                @Override // java.lang.Runnable
                public final void run() {
                    uk7.this.n();
                }
            });
        }
    }

    public uk7 q(otc otcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uk7) ipChange.ipc$dispatch("12cfa5d7", new Object[]{this, otcVar});
        }
        this.k = otcVar;
        return this;
    }

    public uk7() {
        this.f29430a = null;
        this.c = false;
        this.f = new qk7();
        this.h = null;
        this.g = null;
        this.j = new zk7();
        this.k = null;
        this.e = null;
    }

    public final /* synthetic */ void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2e6c2", new Object[]{this});
            return;
        }
        try {
            this.f.r(this.e.e);
            AppInfo c = this.f.c();
            UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
            crashCaughtHeader.addHeaderInfo("os", c.os);
            crashCaughtHeader.addHeaderInfo("osDisplay", c.osDisplay);
            jgg jggVar = this.e;
            c.appVer = jggVar.f;
            c.process = jggVar.g;
            c.isDebug = jggVar.h;
            c.envIndex = jggVar.i;
            c.uid = jggVar.j;
            c.utdid = jggVar.k;
            c.accountName = jggVar.l;
            c.isInner = cl7.g(this.f29430a);
            int i = mk7.i(this.f29430a);
            c.userType = i;
            if (c.isInner) {
                c.userType = 1 | i;
            } else {
                c.userType = i & (-2);
            }
            if (mk7.p()) {
                com.taobao.android.diagnose.scene.a.p("fact_os_type", c.os);
                com.taobao.android.diagnose.scene.a.p("fact_os_ver", c.osVer);
                com.taobao.android.diagnose.scene.a.p("fact_os_sdk", c.osSdk);
                com.taobao.android.diagnose.scene.a.p("fact_dev_brand", c.brand);
                com.taobao.android.diagnose.scene.a.p("fact_dev_model", c.model);
                com.taobao.android.diagnose.scene.a.p("fact_dev_abi", c.abi);
                com.taobao.android.diagnose.scene.a.p("fact_app_ver", c.appVer);
                com.taobao.android.diagnose.scene.a.p("fact_debug", Boolean.valueOf(c.isDebug));
                com.taobao.android.diagnose.scene.a.p("fact_uid", c.uid);
                com.taobao.android.diagnose.scene.a.p("fact_utdid", c.utdid);
                com.taobao.android.diagnose.scene.a.p("fact_account_name", c.accountName);
                com.taobao.android.diagnose.scene.a.p("fact_inner_user", Boolean.valueOf(c.isInner));
            }
            c.innerDir = this.f29430a.getFilesDir().getAbsolutePath();
            File externalFilesDir = this.f29430a.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                c.extDir = externalFilesDir.getAbsolutePath();
            }
            c.lastLaunchInfo = mk7.s(this.f29430a, "time=" + ((Object) DateFormat.format("yyyy-MM-dd HH:mm:ss", this.e.e)) + ";pid=" + c.pid + ";appVer=" + c.appVer + ";os=os;osVer=" + c.osVer + ";osDisplay=" + c.osDisplay, c);
            c.lastExitInfo = ExceptionManager.h(this.f29430a, this.e.g);
            al7.b().d(new Runnable() { // from class: tb.tk7
                @Override // java.lang.Runnable
                public final void run() {
                    uk7.this.o();
                }
            }, 10L, TimeUnit.SECONDS);
        } catch (Exception e) {
            idh.c("DiagnoseManager", "launchEvent", e);
        }
    }
}
