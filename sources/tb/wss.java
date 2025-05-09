package tb;

import android.app.Application;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.tanx.exposer.achieve.AdMonitorType;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.statistic.TBS;
import com.taobao.utils.Global;
import java.util.Arrays;
import java.util.Map;
import tb.ad0;
import tb.tp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30902a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements qzc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.wss$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C1091a implements msj {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ tp0 f30903a;
            public final /* synthetic */ szc b;

            public C1091a(a aVar, tp0 tp0Var, szc szcVar) {
                this.f30903a = tp0Var;
                this.b = szcVar;
            }

            @Override // tb.msj
            public void a(lsj lsjVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9fb14a75", new Object[]{this, lsjVar});
                } else if (lsjVar != null) {
                    if (this.f30903a.i(lsjVar.f23544a)) {
                        szc szcVar = this.b;
                        if (szcVar != null) {
                            szcVar.onSuccess("");
                            return;
                        }
                        return;
                    }
                    szc szcVar2 = this.b;
                    if (szcVar2 != null) {
                        szcVar2.onFail(-1, lsjVar.f23544a + ":" + lsjVar.b);
                    }
                }
            }
        }

        public a(wss wssVar) {
        }

        @Override // tb.qzc
        public void a(f5o f5oVar, szc szcVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58622037", new Object[]{this, f5oVar, szcVar});
            } else if (f5oVar != null && szcVar != null) {
                tp0.a aVar = new tp0.a(f5oVar.a(), jsj.RETRY_FIVE_TIMES);
                aVar.o(true);
                aVar.p(3);
                aVar.n(20000);
                aVar.q(30000);
                aVar.m(HttpRequest.HEADER_ACCEPT, MunionDeviceUtil.getAccept(Global.getApplication(), null));
                sp0 sp0Var = new sp0();
                tp0 tp0Var = new tp0(aVar);
                gsj.a().c(tp0Var);
                sp0Var.a(new tp0(aVar), new C1091a(this, tp0Var, szcVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements veb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(wss wssVar) {
        }

        @Override // tb.veb
        public void commitFail(String str, String str2, String str3, String str4, String str5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49c1ffee", new Object[]{this, str, str2, str3, str4, str5});
            } else {
                AppMonitor.Alarm.commitFail(str, str2, str3, str4, str5);
            }
        }

        @Override // tb.veb
        public void commitSuccess(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d3416f1", new Object[]{this, str, str2, str3});
            } else {
                AppMonitor.Alarm.commitSuccess(str, str2, str3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements z7e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(wss wssVar) {
        }

        @Override // tb.z7e
        public void a(String str, int i, Object obj, Object obj2, Object obj3, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("330e9ea", new Object[]{this, str, new Integer(i), obj, obj2, obj3, map});
                return;
            }
            String join = TextUtils.join(";", vm2.i());
            TBS.Ext.commitEvent("TanxMonitor", i, obj, obj2, obj3, "sdkversion=5.15.27,bucket=" + join, vzo.a(map));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements leb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(wss wssVar) {
        }

        @Override // tb.leb
        public void a(int i, String str, String str2, AdMonitorType adMonitorType, bd0 bd0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba0c52d5", new Object[]{this, new Integer(i), str, str2, adMonitorType, bd0Var});
            }
        }

        @Override // tb.leb
        public Looper b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Looper) ipChange.ipc$dispatch("92edbba3", new Object[]{this});
            }
            return Looper.getMainLooper();
        }

        @Override // tb.leb
        public void c(int i, String str, String str2, AdMonitorType adMonitorType, bd0 bd0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56457a61", new Object[]{this, new Integer(i), str, str2, adMonitorType, bd0Var});
            }
        }

        @Override // tb.leb
        public void d(String str, AdMonitorType adMonitorType, bd0 bd0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9accf6df", new Object[]{this, str, adMonitorType, bd0Var});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public static volatile wss f30904a = new wss(null);

        static {
            t2o.a(1017118818);
        }
    }

    static {
        t2o.a(1017118812);
    }

    public /* synthetic */ wss(a aVar) {
        this();
    }

    public static wss b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wss) ipChange.ipc$dispatch("5f5bb3d7", new Object[0]);
        }
        return e.f30904a;
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        try {
            ed0.h().g(application, new ad0.a(new a(this), new c(this)).p(ConnectionResult.SERVICE_UPDATING).s(3).u(true).t(true).v(Arrays.asList(AdMonitorType.CLICK, AdMonitorType.EXPOSE)).q(new b(this)).m(Global.getPackageName(), wzo.c(application)).r(false).o(false).n());
            ed0.h().i(new d(this));
            this.f30902a = true;
        } catch (Exception e2) {
            i4g.a("TanxExposerManagerError", e2.getMessage());
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue();
        }
        return this.f30902a;
    }

    public wss() {
        this.f30902a = false;
    }
}
