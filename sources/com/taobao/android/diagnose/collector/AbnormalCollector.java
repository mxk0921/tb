package com.taobao.android.diagnose.collector;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.taobao.windvane.extra.IPerformanceListener;
import android.taobao.windvane.extra.WVPerformanceListenerManager;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.collector.AbnormalCollector;
import com.taobao.android.diagnose.config.AbnormalConfig;
import com.taobao.android.diagnose.model.AbnormalInfo;
import com.taobao.android.diagnose.model.PageInfo;
import com.taobao.android.weex_framework.performance.WMInstanceApm;
import java.util.Map;
import java.util.concurrent.Executor;
import mtopsdk.mtop.common.MtopStatsListener;
import mtopsdk.mtop.intf.MtopSetting;
import tb.al7;
import tb.c21;
import tb.cl7;
import tb.idh;
import tb.ijb;
import tb.jk;
import tb.mk7;
import tb.o5s;
import tb.ord;
import tb.paq;
import tb.qk7;
import tb.rb;
import tb.t2o;
import tb.tx8;
import tb.uk7;
import tb.xk7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AbnormalCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Application f7238a;
    public final qk7 b;
    public final Executor c;
    public com.taobao.android.diagnose.scene.a d;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.diagnose.collector.AbnormalCollector$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class AnonymousClass2 extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass2() {
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/collector/AbnormalCollector$2");
        }

        public final /* synthetic */ void b(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a62abf83", new Object[]{this, intent});
                return;
            }
            try {
                AbnormalInfo abnormalInfo = new AbnormalInfo(15);
                String stringExtra = intent.getStringExtra("wxInteraction");
                String stringExtra2 = intent.getStringExtra(WMInstanceApm.KEY_PAGE_STAGES_AREA_COVERAGE);
                String stringExtra3 = intent.getStringExtra("bundleUrl");
                if (stringExtra != null) {
                    abnormalInfo.addInfo("wxInteraction", stringExtra);
                }
                if (stringExtra2 != null) {
                    abnormalInfo.addInfo(WMInstanceApm.KEY_PAGE_STAGES_AREA_COVERAGE, stringExtra2);
                }
                if (stringExtra3 != null) {
                    abnormalInfo.addInfo("bundleUrl", stringExtra3);
                }
                AbnormalCollector.h(AbnormalCollector.this, abnormalInfo);
                idh.a("AbnormalCollector", "Weex White Page Event: " + abnormalInfo.info.toString());
                if (AbnormalCollector.this.b.c().isInner) {
                    xk7.e(abnormalInfo.type);
                }
                if (AbnormalCollector.i(AbnormalCollector.this) != null) {
                    tx8 tx8Var = new tx8();
                    if (TextUtils.isEmpty(stringExtra3)) {
                        stringExtra3 = "";
                    }
                    tx8Var.e("pageName", stringExtra3);
                    AbnormalCollector.i(AbnormalCollector.this).n("scene_white_weex", tx8Var);
                }
            } catch (Exception e) {
                idh.c("AbnormalCollector", "Weex White Page Event Exception", e);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                AbnormalCollector.this.c.execute(new Runnable() { // from class: tb.yr
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbnormalCollector.AnonymousClass2.this.b(intent);
                    }
                });
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements IPerformanceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.taobao.windvane.extra.IPerformanceListener
        public int getFlag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dbfa2b5c", new Object[]{this})).intValue();
            }
            return 1;
        }

        @Override // android.taobao.windvane.extra.IPerformanceListener
        public void onPerformanceEventOccur(final int i, final Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de678e4c", new Object[]{this, new Integer(i), map});
            } else {
                AbnormalCollector.this.c.execute(new Runnable() { // from class: tb.xr
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbnormalCollector.a.this.b(i, map);
                    }
                });
            }
        }

        public final /* synthetic */ void b(int i, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("431d0227", new Object[]{this, new Integer(i), map});
            } else if (i == 1) {
                try {
                    AbnormalInfo abnormalInfo = new AbnormalInfo(9);
                    abnormalInfo.addInfo(map);
                    AbnormalCollector.h(AbnormalCollector.this, abnormalInfo);
                    idh.a("AbnormalCollector", "H5 White Page Event: " + abnormalInfo.info.toString());
                    if (AbnormalCollector.this.b.c().isInner) {
                        xk7.e(abnormalInfo.type);
                    }
                    if (AbnormalCollector.i(AbnormalCollector.this) != null) {
                        tx8 tx8Var = new tx8();
                        String str = (String) map.get("url");
                        if (TextUtils.isEmpty(str)) {
                            str = "";
                        }
                        tx8Var.e("pageName", str);
                        AbnormalCollector.i(AbnormalCollector.this).n("scene_white_h5", tx8Var);
                    }
                } catch (Exception e) {
                    idh.c("AbnormalCollector", "H5 White Page Event Exception", e);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final AbnormalCollector f7241a = new AbnormalCollector(null);

        static {
            t2o.a(615514127);
        }

        public static /* synthetic */ AbnormalCollector a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AbnormalCollector) ipChange.ipc$dispatch("b0a7e104", new Object[0]);
            }
            return f7241a;
        }
    }

    static {
        t2o.a(615514124);
    }

    public /* synthetic */ AbnormalCollector(a aVar) {
        this();
    }

    public static /* synthetic */ void h(AbnormalCollector abnormalCollector, AbnormalInfo abnormalInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c58ab18", new Object[]{abnormalCollector, abnormalInfo});
        } else {
            abnormalCollector.u(abnormalInfo);
        }
    }

    public static /* synthetic */ com.taobao.android.diagnose.scene.a i(AbnormalCollector abnormalCollector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.diagnose.scene.a) ipChange.ipc$dispatch("43003fe1", new Object[]{abnormalCollector});
        }
        return abnormalCollector.d;
    }

    public static AbnormalCollector j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbnormalCollector) ipChange.ipc$dispatch("6ea5215e", new Object[0]);
        }
        return b.a();
    }

    public void A(com.taobao.android.diagnose.scene.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7a13f7", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        idh.a("AbnormalCollector", "init");
        try {
            l();
            m();
            x();
            w();
            y();
            z();
        } catch (Exception e) {
            idh.c("AbnormalCollector", "init exception", e);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d970194b", new Object[]{this});
        } else if (mk7.m.monitorMtopError) {
            idh.a("AbnormalCollector", "initMtopErrorListener");
            MtopSetting.addMtopStatisListener("", new MtopStatsListener() { // from class: tb.rr
                @Override // mtopsdk.mtop.common.MtopStatsListener
                public final void onStats(Map map) {
                    AbnormalCollector.this.n(map);
                }
            });
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16328e53", new Object[]{this});
        } else if (mk7.m.monitorMtopTime) {
            idh.a("AbnormalCollector", "initMtopListener");
            o5s.d(this.f7238a, new ord() { // from class: tb.tr
                @Override // tb.ord
                public final void a(paq paqVar) {
                    AbnormalCollector.this.o(paqVar);
                }
            });
        }
    }

    public final /* synthetic */ void n(final Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7030db", new Object[]{this, map});
        } else {
            this.c.execute(new Runnable() { // from class: tb.vr
                @Override // java.lang.Runnable
                public final void run() {
                    AbnormalCollector.this.p(map);
                }
            });
        }
    }

    public final /* synthetic */ void o(final paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("424aeeb9", new Object[]{this, paqVar});
        } else if (paqVar != null && "mtop".equals(paqVar.d0())) {
            this.c.execute(new Runnable() { // from class: tb.ur
                @Override // java.lang.Runnable
                public final void run() {
                    AbnormalCollector.this.q(paqVar);
                }
            });
        }
    }

    public final /* synthetic */ void p(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9bed159", new Object[]{this, map});
        } else if (map != null) {
            try {
                String str = (String) map.get("api");
                if (!TextUtils.isEmpty(str)) {
                    AbnormalInfo addInfo = new AbnormalInfo(12).addInfo("api", str).addInfo("retType", (String) map.get("retType")).addInfo(rb.RESULT_KEY, (String) map.get(rb.RESULT_KEY)).addInfo(jk.KEY_MAPPING_CODE, (String) map.get(jk.KEY_MAPPING_CODE)).addInfo("httpResponseStatus", (String) map.get("httpResponseStatus"));
                    u(addInfo);
                    idh.a("AbnormalCollector", "Mtop Error Event:" + addInfo.info.toString());
                    if (com.taobao.android.diagnose.scene.a.i("scene_mtop_error") && this.d != null) {
                        tx8 tx8Var = new tx8();
                        tx8Var.e("fact_mtop_api_name", str);
                        tx8Var.e("fact_mtop_err_type", map.get("retType"));
                        tx8Var.e("fact_mtop_err_code", map.get(rb.RESULT_KEY));
                        tx8Var.e("fact_mtop_mapping_code", map.get(jk.KEY_MAPPING_CODE));
                        tx8Var.e("fact_mtop_res_code", map.get("httpResponseStatus"));
                        this.d.n("scene_mtop_error", tx8Var);
                    }
                }
            } catch (Exception e) {
                idh.c("AbnormalCollector", "Mtop Error Event Exception", e);
            }
        }
    }

    public final /* synthetic */ void q(paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56818b4a", new Object[]{this, paqVar});
            return;
        }
        String str = (String) cl7.b(paqVar.j0(), "apiName", "");
        if (!TextUtils.isEmpty(str)) {
            long s0 = paqVar.s0() - paqVar.z();
            AbnormalConfig abnormalConfig = mk7.m;
            Map<String, Long> map = abnormalConfig.mtopFilterMap;
            if (s0 > abnormalConfig.mtopTimeout || (map.containsKey(str) && s0 > map.get(str).longValue())) {
                AbnormalInfo addInfo = new AbnormalInfo(13).addInfo("api", str).addInfo("cost", String.valueOf(s0));
                u(addInfo);
                idh.a("AbnormalCollector", "Mtop Timeout Event: " + addInfo.info.toString());
            }
        }
    }

    public final /* synthetic */ void r(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788cc0a0", new Object[]{this, map});
            return;
        }
        try {
            AbnormalInfo abnormalInfo = new AbnormalInfo(11);
            for (Map.Entry entry : map.entrySet()) {
                abnormalInfo.addInfo((String) entry.getKey(), entry.getValue().toString());
            }
            u(abnormalInfo);
            idh.a("AbnormalCollector", "Lag Event: " + abnormalInfo.info.toString());
        } catch (Exception e) {
            idh.c("AbnormalCollector", "Lag Event Exception", e);
        }
    }

    public final /* synthetic */ void s(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b524f220", new Object[]{this, str, map});
            return;
        }
        try {
            AbnormalInfo addInfo = new AbnormalInfo(4).addInfo("bizName", str).addInfo(map);
            u(addInfo);
            idh.a("AbnormalCollector", "Biz Error Event: " + addInfo.info.toString());
        } catch (Exception e) {
            idh.c("AbnormalCollector", "Biz Error Event Exception", e);
        }
    }

    public final /* synthetic */ void t(final Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac9e6e3", new Object[]{this, map});
        } else {
            this.c.execute(new Runnable() { // from class: tb.wr
                @Override // java.lang.Runnable
                public final void run() {
                    AbnormalCollector.this.r(map);
                }
            });
        }
    }

    public final void u(AbnormalInfo abnormalInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439cbf23", new Object[]{this, abnormalInfo});
        } else if (abnormalInfo != null && mk7.m.abnormalEnable) {
            try {
                PageInfo k = this.b.k();
                if (k != null) {
                    k.addAbnormalInfo(abnormalInfo);
                }
                abnormalInfo.writeToLog();
            } catch (Exception e) {
                idh.c("AbnormalCollector", "onAbnormal", e);
            }
        }
    }

    public void v(final String str, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da0c51a0", new Object[]{this, str, map});
            return;
        }
        AbnormalConfig abnormalConfig = mk7.m;
        if (abnormalConfig.abnormalEnable && abnormalConfig.monitorBizError) {
            this.c.execute(new Runnable() { // from class: tb.qr
                @Override // java.lang.Runnable
                public final void run() {
                    AbnormalCollector.this.s(str, map);
                }
            });
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adacc6e8", new Object[]{this});
        } else if (mk7.m.monitorH5White) {
            idh.a("AbnormalCollector", "registerH5WhiteEvent");
            WVPerformanceListenerManager.getInstance().addPerformanceListener(new a());
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba4e2f2", new Object[]{this});
        } else if (mk7.m.monitorLag) {
            idh.a("AbnormalCollector", "registerLagEvent");
            c21.b(new ijb() { // from class: tb.sr
                @Override // tb.ijb
                public final void a(Map map) {
                    AbnormalCollector.this.t(map);
                }
            });
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89206732", new Object[]{this});
        } else {
            boolean z = mk7.m.monitorNativeWhite;
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8388a5c", new Object[]{this});
        } else if (mk7.m.monitorWeexWhite) {
            idh.a("AbnormalCollector", "registerWeexWhiteEvent");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.android.abnormal.action.weex.white");
            LocalBroadcastManager.getInstance(this.f7238a).registerReceiver(new AnonymousClass2(), intentFilter);
        }
    }

    public AbnormalCollector() {
        this.f7238a = uk7.i().e();
        this.b = uk7.i().g();
        this.c = al7.b().c();
    }
}
