package tb;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.falco.m;
import com.taobao.tao.log.TLog;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.WebStartParams;
import com.taobao.themis.external.embed.Weex2StartParams;
import com.taobao.themis.kernel.extension.page.rum.TMSRumTarget;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Regex;
import tb.qdr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class qdr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f26687a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public long h;
    public ImageView i;
    public boolean j;
    public volatile idr k;
    public idr l;
    public Activity n;
    public ViewGroup o;
    public TMSEmbed p;
    public long s;
    public boolean u;
    public boolean v;
    public final Object g = new Object();
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final Map<String, Long> q = new LinkedHashMap();
    public String r = "";
    public final Runnable t = new Runnable() { // from class: tb.jdr
        @Override // java.lang.Runnable
        public final void run() {
            qdr.w(qdr.this);
        }
    };
    public int w = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(1031798807);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TMSEmbed b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ String d;

        public b(TMSEmbed tMSEmbed, boolean z, String str) {
            this.b = tMSEmbed;
            this.c = z;
            this.d = str;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1799497502:
                    super.c((String) objArr[0], (String) objArr[1]);
                    return null;
                case -936190188:
                    super.m();
                    return null;
                case -799572052:
                    super.d();
                    return null;
                case -302283915:
                    super.n();
                    return null;
                case 1131744663:
                    super.e();
                    return null;
                case 2123836685:
                    super.l((String) objArr[0], (String) objArr[1]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/hudong/embed/TBHDEmbedManager$createWebEmbedInstance$2");
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            super.c(str, str2);
            TLog.loge("TBHDEmbedManager", "onJSException " + str + '|' + str2);
            if (this.c) {
                vto.INSTANCE.c(qdr.j(qdr.this), qdr.i(qdr.this));
            }
            AppMonitor.Counter.commit("Page_Edlp", "webJsException", str + '|' + str2, 1.0d);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0577fac", new Object[]{this});
                return;
            }
            super.d();
            qdr.this.H();
            qdr.k(qdr.this).put("TMSOnLaunchEndTime", Long.valueOf(System.currentTimeMillis()));
            TLog.loge("TBHDEmbedManager", sxl.LAUNCHER_FINISH_TIME);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43750d97", new Object[]{this});
                return;
            }
            super.e();
            qdr.k(qdr.this).put("TMSOnLaunchStartTime", Long.valueOf(System.currentTimeMillis()));
            TLog.loge("TBHDEmbedManager", sxl.LAUNCHER_START_TIME);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            super.l(str, str2);
            TLog.loge("TBHDEmbedManager", "onRenderFailed " + str + '|' + str2);
            if (this.c) {
                vto.INSTANCE.c(qdr.j(qdr.this), qdr.i(qdr.this));
            }
            AppMonitor.Alarm.commitFail("Page_Edlp", "renderWeb", this.d, str, str2);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c832df14", new Object[]{this});
                return;
            }
            super.m();
            qdr.k(qdr.this).put("TMSonRenderStartTime", Long.valueOf(System.currentTimeMillis()));
            TLog.loge("TBHDEmbedManager", sxl.RENDER_START_TIME);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                return;
            }
            super.n();
            qdr.k(qdr.this).put("TMSonRenderEndTime", Long.valueOf(System.currentTimeMillis()));
            TLog.loge("TBHDEmbedManager", ckf.p("onRenderSuccess ", qdr.l(qdr.this, this.b)));
            if (this.c) {
                vto.INSTANCE.c(qdr.j(qdr.this), qdr.i(qdr.this));
            }
            AppMonitor.Alarm.commitSuccess("Page_Edlp", "renderWeb", this.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ TMSEmbed c;
        public final /* synthetic */ String d;

        public c(Activity activity, TMSEmbed tMSEmbed, String str) {
            this.b = activity;
            this.c = tMSEmbed;
            this.d = str;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1799497502:
                    super.c((String) objArr[0], (String) objArr[1]);
                    return null;
                case -936190188:
                    super.m();
                    return null;
                case -799572052:
                    super.d();
                    return null;
                case -302283915:
                    super.n();
                    return null;
                case 1131744663:
                    super.e();
                    return null;
                case 2123836685:
                    super.l((String) objArr[0], (String) objArr[1]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/hudong/embed/TBHDEmbedManager$createWeexEmbedInstance$1$2");
            }
        }

        public static final void r(qdr qdrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0a7eca0", new Object[]{qdrVar});
                return;
            }
            ckf.g(qdrVar, "this$0");
            qdr.h(qdrVar);
        }

        public static final void s(Activity activity, TMSEmbed tMSEmbed) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbb67ddc", new Object[]{activity, tMSEmbed});
                return;
            }
            ckf.g(tMSEmbed, "$instance");
            if (activity == null || activity.isFinishing()) {
                TLog.loge("TBHDEmbedManager", "onLaunchFinish error activity is finish");
                return;
            }
            TLog.loge("TBHDEmbedManager", "start render");
            tMSEmbed.u();
        }

        public static final void t(qdr qdrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a07ec2d4", new Object[]{qdrVar});
                return;
            }
            ckf.g(qdrVar, "this$0");
            qdr.h(qdrVar);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public boolean b(boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("17a6ad2f", new Object[]{this, new Boolean(z), str, str2})).booleanValue();
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            return true;
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            super.c(str, str2);
            TLog.loge("TBHDEmbedManager", "onJSException " + str + '|' + str2);
            vto vtoVar = vto.INSTANCE;
            final qdr qdrVar = qdr.this;
            vtoVar.b(new Runnable() { // from class: tb.sdr
                @Override // java.lang.Runnable
                public final void run() {
                    qdr.c.r(qdr.this);
                }
            });
            AppMonitor.Counter.commit("Page_Edlp", "jsException", str + '|' + str2, 1.0d);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0577fac", new Object[]{this});
                return;
            }
            super.d();
            qdr.this.H();
            qdr.k(qdr.this).put("TMSOnLaunchEndTime", Long.valueOf(System.currentTimeMillis()));
            TLog.loge("TBHDEmbedManager", sxl.LAUNCHER_FINISH_TIME);
            vto vtoVar = vto.INSTANCE;
            final Activity activity = this.b;
            final TMSEmbed tMSEmbed = this.c;
            vtoVar.b(new Runnable() { // from class: tb.rdr
                @Override // java.lang.Runnable
                public final void run() {
                    qdr.c.s(activity, tMSEmbed);
                }
            });
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43750d97", new Object[]{this});
                return;
            }
            super.e();
            qdr.k(qdr.this).put("TMSOnLaunchStartTime", Long.valueOf(System.currentTimeMillis()));
            TLog.loge("TBHDEmbedManager", sxl.LAUNCHER_START_TIME);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            super.l(str, str2);
            TLog.loge("TBHDEmbedManager", "onRenderFailed " + str + '|' + str2);
            vto vtoVar = vto.INSTANCE;
            final qdr qdrVar = qdr.this;
            vtoVar.b(new Runnable() { // from class: tb.tdr
                @Override // java.lang.Runnable
                public final void run() {
                    qdr.c.t(qdr.this);
                }
            });
            AppMonitor.Alarm.commitFail("Page_Edlp", "renderWeex", this.d, str, str2);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c832df14", new Object[]{this});
                return;
            }
            super.m();
            qdr.k(qdr.this).put("TMSonRenderStartTime", Long.valueOf(System.currentTimeMillis()));
            TLog.loge("TBHDEmbedManager", sxl.RENDER_START_TIME);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                return;
            }
            super.n();
            qdr.k(qdr.this).put("TMSonRenderEndTime", Long.valueOf(System.currentTimeMillis()));
            TLog.loge("TBHDEmbedManager", ckf.p("onRenderSuccess ", qdr.l(qdr.this, this.c)));
            vto.INSTANCE.c(qdr.j(qdr.this), qdr.i(qdr.this));
            AppMonitor.Alarm.commitSuccess("Page_Edlp", "renderWeex", this.d);
        }
    }

    static {
        t2o.a(1031798806);
    }

    public qdr(String str, String str2, int i, int i2, int i3, String str3) {
        ckf.g(str, "defaultUrl");
        ckf.g(str2, "defaultPageType");
        ckf.g(str3, "weexUrlAppendKey");
        this.f26687a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        AppMonitor.Alarm.commitSuccess("TBHDEmbedManager", "create", "success");
    }

    public static final void D(qdr qdrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9dc3de", new Object[]{qdrVar, str});
            return;
        }
        ckf.g(qdrVar, "this$0");
        TLog.loge("TBHDEmbedManager", ckf.p("EVENT_RENDER_SUCCESS ", qdrVar.x(qdrVar.p)));
        qdrVar.n(str);
    }

    public static final void O(qdr qdrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86efd081", new Object[]{qdrVar});
            return;
        }
        ckf.g(qdrVar, "this$0");
        idr idrVar = qdrVar.l;
        ckf.d(idrVar);
        String b2 = idrVar.b();
        idr idrVar2 = qdrVar.l;
        Activity activity = qdrVar.n;
        ckf.d(activity);
        qdrVar.p(b2, idrVar2, activity);
    }

    public static final /* synthetic */ void h(qdr qdrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3fcc74", new Object[]{qdrVar});
        } else {
            qdrVar.m();
        }
    }

    public static final /* synthetic */ int i(qdr qdrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbff9d", new Object[]{qdrVar})).intValue();
        }
        return qdrVar.c;
    }

    public static final /* synthetic */ Runnable j(qdr qdrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("c2c0a79c", new Object[]{qdrVar});
        }
        return qdrVar.t;
    }

    public static final /* synthetic */ Map k(qdr qdrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fea99b71", new Object[]{qdrVar});
        }
        return qdrVar.q;
    }

    public static final /* synthetic */ String l(qdr qdrVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a292a8df", new Object[]{qdrVar, obj});
        }
        return qdrVar.x(obj);
    }

    public static final void r(qdr qdrVar, TMSEmbed tMSEmbed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad4e68", new Object[]{qdrVar, tMSEmbed});
            return;
        }
        ckf.g(qdrVar, "this$0");
        TLog.loge("TBHDEmbedManager", ckf.p(qdrVar.x(tMSEmbed), ".destroy() start"));
        tMSEmbed.d();
        TLog.loge("TBHDEmbedManager", ckf.p(qdrVar.x(tMSEmbed), ".destroy() end"));
    }

    public static final void u(qdr qdrVar, TMSEmbed tMSEmbed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b9fe57", new Object[]{qdrVar, tMSEmbed});
            return;
        }
        ckf.g(qdrVar, "this$0");
        TLog.loge("TBHDEmbedManager", ckf.p(qdrVar.x(tMSEmbed), ".destroy() start"));
        tMSEmbed.d();
        TLog.loge("TBHDEmbedManager", ckf.p(qdrVar.x(tMSEmbed), ".destroy() end"));
    }

    public static final void w(qdr qdrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7146766", new Object[]{qdrVar});
            return;
        }
        ckf.g(qdrVar, "this$0");
        qdrVar.m();
    }

    public static final void z(qdr qdrVar, String str, idr idrVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d178c6a3", new Object[]{qdrVar, str, idrVar, activity});
            return;
        }
        ckf.g(qdrVar, "this$0");
        ckf.g(str, "$pageUrl");
        ckf.g(activity, "$activity");
        qdrVar.q.put("TMSEmbedInitStartTime", Long.valueOf(System.currentTimeMillis()));
        qdrVar.p(str, idrVar, activity);
        qdrVar.q.put("TMSEmbedInitEndTime", Long.valueOf(System.currentTimeMillis()));
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.p;
        if (tMSEmbed != null) {
            tMSEmbed.n();
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.p;
        if (tMSEmbed != null) {
            tMSEmbed.o();
        }
    }

    public final void C(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("190885ad", new Object[]{this, str});
            return;
        }
        this.q.put("frontEndRenderSuccessTime", Long.valueOf(System.currentTimeMillis()));
        TLog.loge("TBHDEmbedManager", ckf.p(" render success time ", Long.valueOf(System.currentTimeMillis() - this.h)));
        vto vtoVar = vto.INSTANCE;
        vtoVar.d(this.t);
        TLog.loge("TBHDEmbedManager", "前端上报渲染完成事件，移除容器渲染回调的延时任务");
        vtoVar.b(new Runnable() { // from class: tb.ldr
            @Override // java.lang.Runnable
            public final void run() {
                qdr.D(qdr.this, str);
            }
        });
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.p;
        if (tMSEmbed != null) {
            tMSEmbed.p();
        }
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.p;
        if (tMSEmbed != null) {
            tMSEmbed.q();
        }
    }

    public final void G(String str, JSONObject jSONObject) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d873226", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "eventName");
        JSONObject jSONObject2 = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        jSONObject2.put((JSONObject) "uuid", (String) Long.valueOf(currentTimeMillis));
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        TLog.loge("TBHDEmbedManager", str + '|' + currentTimeMillis);
        TMSEmbed tMSEmbed = this.p;
        if (tMSEmbed == null) {
            xhvVar = null;
        } else {
            tMSEmbed.e(str, jSONObject2, pg1.ATOM_EXT_window);
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            TLog.loge("TBHDEmbedManager", " sendEvent error, mTMSEmbed == null");
        }
    }

    public final void H() {
        i2c i2cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d61a75f", new Object[]{this});
            return;
        }
        m e = FalcoGlobalTracer.get().d(m.MODULE, "tap").f(FalcoGlobalTracer.get().f()).e();
        e.y(this.r);
        e.a0(Long.valueOf(this.s));
        TMSEmbed tMSEmbed = this.p;
        xhv xhvVar = null;
        if (!(tMSEmbed == null || (i2cVar = (i2c) tMSEmbed.g(i2c.class)) == null)) {
            i2cVar.T(e);
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            TLog.loge("TBHDEmbedManager", "embedRumExtension is null");
        }
    }

    public final void I(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29a716f", new Object[]{this, viewGroup});
            return;
        }
        ckf.g(viewGroup, "rootView");
        this.o = viewGroup;
    }

    public final void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("607f55b3", new Object[]{this, str});
            return;
        }
        ckf.g(str, "pageName");
        this.r = str;
    }

    public final void K(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a287a4", new Object[]{this, new Long(j)});
        } else {
            this.s = j;
        }
    }

    public final void L(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ede652d", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        this.w = i;
        this.u = z;
        this.v = z2;
    }

    public final void M(ViewGroup viewGroup, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67bf526d", new Object[]{this, viewGroup, activity});
        } else if (viewGroup != null) {
            ImageView imageView = this.i;
            if (imageView == null) {
                imageView = new ImageView(activity);
                imageView.setBackgroundResource(this.w);
            }
            this.i = imageView;
            viewGroup.removeAllViews();
            viewGroup.addView(this.i, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final void o(Map<String, Long> map, Map<String, ? extends Object> map2) {
        i2c i2cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe89c88", new Object[]{this, map, map2});
            return;
        }
        TMSEmbed tMSEmbed = this.p;
        if (tMSEmbed != null && (i2cVar = (i2c) tMSEmbed.g(i2c.class)) != null) {
            if (map2 == null) {
                map2 = kotlin.collections.a.h();
            }
            TMSRumTarget tMSRumTarget = TMSRumTarget.CUSTOM;
            i2cVar.S(map2, tMSRumTarget);
            if (map == null) {
                map = kotlin.collections.a.h();
            }
            Map<String, Long> t = kotlin.collections.a.t(map);
            t.putAll(this.q);
            i2cVar.M(t, tMSRumTarget);
        }
    }

    public final void s(final String str, final Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1936ed40", new Object[]{this, str, activity, new Boolean(z)});
        } else {
            vto.INSTANCE.a().execute(new Runnable() { // from class: tb.odr
                @Override // java.lang.Runnable
                public final void run() {
                    qdr.t(activity, this, str);
                }
            });
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.p;
        if (tMSEmbed != null) {
            tMSEmbed.d();
        }
    }

    public static final void t(Activity activity, final qdr qdrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2677ca99", new Object[]{activity, qdrVar, str});
            return;
        }
        ckf.g(qdrVar, "this$0");
        ckf.g(str, "$weexUrl");
        ckf.d(activity);
        TMSEmbed tMSEmbed = new TMSEmbed(activity);
        TLog.loge("TBHDEmbedManager", "tmsEmbedInstance = " + ((Object) qdrVar.x(qdrVar.p)) + " --> " + ((Object) qdrVar.x(tMSEmbed)) + ", newType=weex");
        final TMSEmbed tMSEmbed2 = qdrVar.p;
        if (tMSEmbed2 != null) {
            vto.INSTANCE.b(new Runnable() { // from class: tb.pdr
                @Override // java.lang.Runnable
                public final void run() {
                    qdr.u(qdr.this, tMSEmbed2);
                }
            });
        }
        qdrVar.p = tMSEmbed;
        tMSEmbed.r(new c(activity, tMSEmbed, str));
        Weex2StartParams weex2StartParams = new Weex2StartParams();
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter(qdrVar.f, String.valueOf(tMSEmbed.hashCode()));
        String uri = buildUpon.build().toString();
        ckf.f(uri, "uriBuilder.build().toString()");
        weex2StartParams.setUrl(uri);
        weex2StartParams.setWidth(Integer.valueOf(qdrVar.d));
        weex2StartParams.setHeight(Integer.valueOf(qdrVar.e));
        weex2StartParams.setAsyncCreate(true);
        TLog.loge("TBHDEmbedManager", ckf.p("setAsyncCreate(true) ", str));
        weex2StartParams.setPreRender(true);
        weex2StartParams.setRenderMode(WeexUnicornConfig.RenderMode.texture);
        TLog.loge("TBHDEmbedManager", ckf.p(qdrVar.x(tMSEmbed), ".init() before"));
        tMSEmbed.i(weex2StartParams);
        TLog.loge("TBHDEmbedManager", ckf.p(qdrVar.x(tMSEmbed), ".init() after"));
    }

    public final void N(idr idrVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c945b568", new Object[]{this, idrVar});
            return;
        }
        TLog.loge("TBHDEmbedManager", "EVENT_ALIEN_REFRESH arrived");
        if (idrVar == null) {
            TLog.loge("TBHDEmbedManager", "ignore EVENT_ALIEN_REFRESH: tabPageInfo == null");
            return;
        }
        if (this.k != null) {
            long c2 = idrVar.c();
            idr idrVar2 = this.k;
            ckf.d(idrVar2);
            if (c2 > idrVar2.c()) {
                if (TextUtils.isEmpty(idrVar.b()) || TextUtils.isEmpty(idrVar.a())) {
                    TLog.loge("TBHDEmbedManager", ckf.p("ignore EVENT_ALIEN_REFRESH error :", idrVar));
                    return;
                }
                synchronized (this.g) {
                    try {
                        if (this.l == null) {
                            this.l = idrVar;
                            StringBuilder sb = new StringBuilder("handle EVENT_ALIEN_REFRESH: update latestInfo, version=");
                            idr idrVar3 = this.l;
                            ckf.d(idrVar3);
                            sb.append(idrVar3.c());
                            sb.append(", type=");
                            idr idrVar4 = this.l;
                            ckf.d(idrVar4);
                            sb.append(idrVar4.a());
                            TLog.loge("TBHDEmbedManager", sb.toString());
                        } else {
                            long c3 = idrVar.c();
                            idr idrVar5 = this.l;
                            ckf.d(idrVar5);
                            if (c3 > idrVar5.c()) {
                                this.l = idrVar;
                                StringBuilder sb2 = new StringBuilder("handle EVENT_ALIEN_REFRESH: update latestInfo, version=");
                                idr idrVar6 = this.l;
                                ckf.d(idrVar6);
                                sb2.append(idrVar6.c());
                                sb2.append(", type=");
                                idr idrVar7 = this.l;
                                ckf.d(idrVar7);
                                sb2.append(idrVar7.a());
                                TLog.loge("TBHDEmbedManager", sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder("ignore EVENT_ALIEN_REFRESH: newInfo.version=");
                                sb3.append(idrVar.c());
                                sb3.append(" <= latestInfo.version=");
                                idr idrVar8 = this.l;
                                ckf.d(idrVar8);
                                sb3.append(idrVar8.c());
                                TLog.loge("TBHDEmbedManager", sb3.toString());
                                return;
                            }
                        }
                        if (this.p != null && !this.m.get()) {
                            TLog.loge("TBHDEmbedManager", "handle EVENT_ALIEN_REFRESH: switch to main-thread execute build");
                            this.m.set(true);
                            vto.INSTANCE.b(new Runnable() { // from class: tb.kdr
                                @Override // java.lang.Runnable
                                public final void run() {
                                    qdr.O(qdr.this);
                                }
                            });
                            xhv xhvVar = xhv.INSTANCE;
                            return;
                        }
                        TLog.loge("TBHDEmbedManager", "handle EVENT_ALIEN_REFRESH: wait for current building finish");
                        xhv xhvVar2 = xhv.INSTANCE;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.k == null) {
            str = "null";
        } else {
            idr idrVar9 = this.k;
            ckf.d(idrVar9);
            str = String.valueOf(idrVar9.c());
        }
        TLog.loge("TBHDEmbedManager", "ignore EVENT_ALIEN_REFRESH: newInfo.version=" + idrVar.c() + " <= mCurInfo.version=" + str);
    }

    public final void n(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e7b044e", new Object[]{this, str});
        } else if (this.p == null) {
            TLog.loge("TBHDEmbedManager", "tmsEmbedInstance==null, ignore renderSuccessEvent");
        } else {
            Activity activity = this.n;
            if (activity != null) {
                ckf.d(activity);
                if (!activity.isFinishing()) {
                    if (TextUtils.isEmpty(str)) {
                        StringBuilder sb = new StringBuilder("ignore addEmbedView(), curUrl=");
                        idr idrVar = this.k;
                        ckf.d(idrVar);
                        sb.append(idrVar.b());
                        sb.append(", embedViewFromUrl=");
                        sb.append((Object) str);
                        TLog.loge("TBHDEmbedManager", sb.toString());
                        return;
                    }
                    String queryParameter = Uri.parse(str).getQueryParameter(this.f);
                    if (queryParameter != null) {
                        TMSEmbed tMSEmbed = this.p;
                        if (TextUtils.equals(queryParameter, String.valueOf(tMSEmbed == null ? 0 : tMSEmbed.hashCode()))) {
                            m();
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder("ignore addEmbedView(), curEmbed=");
                        TMSEmbed tMSEmbed2 = this.p;
                        if (tMSEmbed2 != null) {
                            i = tMSEmbed2.hashCode();
                        }
                        sb2.append(i);
                        sb2.append(", embedViewFromInstance=");
                        sb2.append((Object) queryParameter);
                        TLog.loge("TBHDEmbedManager", sb2.toString());
                        return;
                    }
                    idr idrVar2 = this.k;
                    ckf.d(idrVar2);
                    if (TextUtils.equals(str, idrVar2.b())) {
                        m();
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder("ignore addEmbedView(), curUrl=");
                    idr idrVar3 = this.k;
                    ckf.d(idrVar3);
                    sb3.append(idrVar3.b());
                    sb3.append(", embedViewFromUrl=");
                    sb3.append((Object) str);
                    TLog.loge("TBHDEmbedManager", sb3.toString());
                    return;
                }
            }
            TLog.loge("TBHDEmbedManager", "mActivity null or finishing, ignore renderSuccessEvent");
        }
    }

    public final void p(String str, idr idrVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543162e3", new Object[]{this, str, idrVar, activity});
            return;
        }
        if (!(this.k == null || idrVar == null)) {
            idr idrVar2 = this.k;
            ckf.d(idrVar2);
            if (TextUtils.equals(str, idrVar2.b())) {
                String a2 = idrVar.a();
                idr idrVar3 = this.k;
                ckf.d(idrVar3);
                if (TextUtils.equals(a2, idrVar3.a())) {
                    this.m.set(false);
                    TLog.loge("TBHDEmbedManager", "createEmbedInstance Abort! url & type are same as current");
                    return;
                }
            }
        }
        this.j = false;
        String str2 = this.b;
        if (idrVar == null || TextUtils.isEmpty(idrVar.a())) {
            idr idrVar4 = new idr();
            idrVar4.d(this.b);
            idrVar4.e(str);
            this.k = idrVar4;
            TLog.loge("TBHDEmbedManager", ckf.p("命中兜底配置", this.b));
        } else {
            str2 = idrVar.a();
            this.k = idrVar;
        }
        TLog.loge("TBHDEmbedManager", "createEmbedInstance type=" + str2 + ", url=" + str);
        try {
            if (TextUtils.equals("web", str2)) {
                if (this.u) {
                    ViewGroup viewGroup = this.o;
                    if (viewGroup != null) {
                        M(viewGroup, activity);
                    } else {
                        ckf.y("mRootView");
                        throw null;
                    }
                }
                q(str, activity, this.u);
                return;
            }
            if (this.v) {
                ViewGroup viewGroup2 = this.o;
                if (viewGroup2 != null) {
                    M(viewGroup2, activity);
                } else {
                    ckf.y("mRootView");
                    throw null;
                }
            }
            s(str, activity, this.v);
        } catch (Throwable th) {
            TLog.loge("TBHDEmbedManager", ckf.p("createEmbedInstance error ", Log.getStackTraceString(th)));
        }
    }

    public final void q(String str, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3510f1b", new Object[]{this, str, activity, new Boolean(z)});
            return;
        }
        TMSEmbed tMSEmbed = new TMSEmbed(activity);
        TLog.loge("TBHDEmbedManager", "tmsEmbedInstance = " + ((Object) x(this.p)) + " --> " + ((Object) x(tMSEmbed)) + ", newType=web");
        final TMSEmbed tMSEmbed2 = this.p;
        if (tMSEmbed2 != null) {
            vto.INSTANCE.b(new Runnable() { // from class: tb.ndr
                @Override // java.lang.Runnable
                public final void run() {
                    qdr.r(qdr.this, tMSEmbed2);
                }
            });
        }
        this.p = tMSEmbed;
        tMSEmbed.r(new b(tMSEmbed, z, str));
        WebStartParams webStartParams = new WebStartParams();
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter(this.f, String.valueOf(tMSEmbed.hashCode()));
        String uri = buildUpon.build().toString();
        ckf.f(uri, "uriBuilder.build().toString()");
        webStartParams.setUrl(uri);
        webStartParams.setSafeArea(new woo(dxo.INSTANCE.b(activity), 0, 0, 0));
        tMSEmbed.i(webStartParams);
        tMSEmbed.u();
        if (!z) {
            m();
        }
    }

    public final String x(Object obj) {
        String obj2;
        List<String> split;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80e398f", new Object[]{this, obj});
        }
        return (obj == null || (obj2 = obj.toString()) == null || (split = new Regex("\\.").split(obj2, 0)) == null || (str = (String) i04.m0(split)) == null) ? "null" : str;
    }

    public final void y(String str, final idr idrVar, final Activity activity) {
        String b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419d1105", new Object[]{this, str, idrVar, activity});
            return;
        }
        ckf.g(activity, "activity");
        this.h = System.currentTimeMillis();
        if (this.p == null) {
            this.n = activity;
            final String str2 = null;
            if (!(idrVar == null || (b2 = idrVar.b()) == null || TextUtils.isEmpty(b2))) {
                str2 = b2;
            }
            if (str2 == null) {
                str2 = this.f26687a;
            }
            if (!(str == null || str.length() == 0)) {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("ext", str).build().toString();
                ckf.f(str2, "{\n            Uri.parse(…ld().toString()\n        }");
            }
            this.m.set(true);
            vto.INSTANCE.b(new Runnable() { // from class: tb.mdr
                @Override // java.lang.Runnable
                public final void run() {
                    qdr.z(qdr.this, str2, idrVar, activity);
                }
            });
        }
    }

    public final void m() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e23384", new Object[]{this});
        } else if (this.j) {
            StringBuilder sb = new StringBuilder("ignore addEmbedView(), view for ");
            if (this.k == null) {
                str2 = "";
            } else {
                idr idrVar = this.k;
                ckf.d(idrVar);
                str2 = idrVar.b();
            }
            sb.append(str2);
            sb.append(" has been added once");
            TLog.loge("TBHDEmbedManager", sb.toString());
        } else {
            TMSEmbed tMSEmbed = this.p;
            View h = tMSEmbed == null ? null : tMSEmbed.h();
            if (h != null) {
                ViewGroup viewGroup = this.o;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                    ViewGroup viewGroup2 = this.o;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(h);
                        if (this.k == null) {
                            str = "weex2";
                        } else {
                            idr idrVar2 = this.k;
                            ckf.d(idrVar2);
                            str = idrVar2.a();
                        }
                        TLog.loge("TBHDEmbedManager", str + "Embed addView complete " + ((Object) x(this.p)));
                        this.j = true;
                        this.m.set(false);
                        idr idrVar3 = this.l;
                        if (idrVar3 != null) {
                            ckf.d(idrVar3);
                            long c2 = idrVar3.c();
                            idr idrVar4 = this.k;
                            ckf.d(idrVar4);
                            if (c2 > idrVar4.c()) {
                                StringBuilder sb2 = new StringBuilder("consume latestInfo(type=");
                                idr idrVar5 = this.l;
                                ckf.d(idrVar5);
                                sb2.append(idrVar5.a());
                                sb2.append("): mLatestVersion=");
                                idr idrVar6 = this.l;
                                ckf.d(idrVar6);
                                sb2.append(idrVar6.c());
                                sb2.append(" > mCurVersion=");
                                idr idrVar7 = this.k;
                                ckf.d(idrVar7);
                                sb2.append(idrVar7.c());
                                TLog.loge("TBHDEmbedManager", sb2.toString());
                                this.m.set(true);
                                idr idrVar8 = this.l;
                                ckf.d(idrVar8);
                                String b2 = idrVar8.b();
                                idr idrVar9 = this.l;
                                Activity activity = this.n;
                                ckf.d(activity);
                                p(b2, idrVar9, activity);
                                return;
                            }
                        }
                        TLog.loge("TBHDEmbedManager", "No need consume latestInfo");
                        return;
                    }
                    ckf.y("mRootView");
                    throw null;
                }
                ckf.y("mRootView");
                throw null;
            }
        }
    }
}
