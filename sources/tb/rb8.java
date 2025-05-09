package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.falco.m;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.WebStartParams;
import com.taobao.themis.external.embed.Weex2StartParams;
import com.taobao.themis.kernel.extension.page.rum.TMSRumTarget;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rb8 implements m3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile TMSEmbed f27246a;
    public ImageView b;
    public ViewGroup c;
    public long d;
    public final uaq e;
    public volatile drs f;
    public drs g;
    public Activity i;
    public final String m;
    public final String n;
    public final int o;
    public final Object h = new Object();
    public boolean j = false;
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final Runnable l = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                rb8.a(rb8.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27248a;
        public final /* synthetic */ drs b;
        public final /* synthetic */ Activity c;

        public b(String str, drs drsVar, Activity activity) {
            this.f27248a = str;
            this.b = drsVar;
            this.c = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            rb8.b(rb8.this).j = System.currentTimeMillis();
            rb8.e(rb8.this, this.f27248a, this.b, this.c);
            rb8.b(rb8.this).k = System.currentTimeMillis();
            TLog.loge("tab3edlp", "tmsEmbedInstance use time is  " + (rb8.b(rb8.this).k - rb8.f(rb8.this)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TMSEmbed f27249a;

        public c(TMSEmbed tMSEmbed) {
            this.f27249a = tMSEmbed;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            StringBuilder sb = new StringBuilder();
            rb8 rb8Var = rb8.this;
            sb.append(rb8.i(rb8Var, rb8.g(rb8Var)));
            sb.append(".destroy() start");
            TLog.loge("tab3edlp", sb.toString());
            this.f27249a.d();
            StringBuilder sb2 = new StringBuilder();
            rb8 rb8Var2 = rb8.this;
            sb2.append(rb8.i(rb8Var2, rb8.g(rb8Var2)));
            sb2.append(".destroy() end");
            TLog.loge("tab3edlp", sb2.toString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TMSEmbed f27250a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;

        public d(TMSEmbed tMSEmbed, boolean z, String str) {
            this.f27250a = tMSEmbed;
            this.b = z;
            this.c = str;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
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
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/edlp/themis/EmbedInstanceManager$4");
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
                return;
            }
            super.c(str, str2);
            TLog.loge("tab3edlp", "onJSException " + str + "|" + str2);
            if (this.b) {
                rvu.a(rb8.j(rb8.this), rb8.k(rb8.this));
            }
            a81.d("Page_Edlp", "webJsException", str + "|" + str2, 1.0d);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0577fac", new Object[]{this});
                return;
            }
            super.d();
            rb8.this.C();
            rb8.b(rb8.this).r = System.currentTimeMillis();
            TLog.loge("tab3edlp", sxl.LAUNCHER_FINISH_TIME);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43750d97", new Object[]{this});
                return;
            }
            super.e();
            rb8.b(rb8.this).q = System.currentTimeMillis();
            TLog.loge("tab3edlp", sxl.LAUNCHER_START_TIME);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            super.l(str, str2);
            TLog.loge("tab3edlp", "onRenderFailed " + str + "|" + str2);
            if (this.b) {
                rvu.a(rb8.j(rb8.this), rb8.k(rb8.this));
            }
            a81.b("Page_Edlp", "renderWeb", this.c, str, str2);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c832df14", new Object[]{this});
                return;
            }
            super.m();
            rb8.b(rb8.this).s = System.currentTimeMillis();
            TLog.loge("tab3edlp", sxl.RENDER_START_TIME);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                return;
            }
            super.n();
            rb8.b(rb8.this).t = System.currentTimeMillis();
            TLog.loge("tab3edlp", "onRenderSuccess " + rb8.i(rb8.this, this.f27250a));
            if (this.b) {
                rvu.a(rb8.j(rb8.this), rb8.k(rb8.this));
            }
            a81.c("Page_Edlp", "renderWeb", this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f27251a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TMSEmbed f27252a;

            public a(TMSEmbed tMSEmbed) {
                this.f27252a = tMSEmbed;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TLog.loge("tab3edlp", rb8.i(rb8.this, this.f27252a) + ".destroy() start");
                this.f27252a.d();
                TLog.loge("tab3edlp", rb8.i(rb8.this, this.f27252a) + ".destroy() end");
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b extends TMSEmbed.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TMSEmbed f27253a;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
            public class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Activity activity = e.this.f27251a;
                    if (activity == null || activity.isFinishing()) {
                        TLog.loge("tab3edlp", "onLaunchFinish error activity is finish");
                        return;
                    }
                    TLog.loge("tab3edlp", "start render");
                    b.this.f27253a.u();
                }
            }

            /* compiled from: Taobao */
            /* renamed from: tb.rb8$e$b$b  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
            public class RunnableC1046b implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public RunnableC1046b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        rb8.a(rb8.this);
                    }
                }
            }

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
            public class c implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public c() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        rb8.a(rb8.this);
                    }
                }
            }

            public b(TMSEmbed tMSEmbed) {
                this.f27253a = tMSEmbed;
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
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/edlp/themis/EmbedInstanceManager$5$2");
                }
            }

            @Override // com.taobao.themis.external.embed.TMSEmbed.a
            public boolean b(boolean z, String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("17a6ad2f", new Object[]{this, new Boolean(z), str, str2})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.themis.external.embed.TMSEmbed.a
            public void c(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
                    return;
                }
                super.c(str, str2);
                TLog.loge("tab3edlp", "onJSException " + str + "|" + str2);
                rvu.b(new c());
                a81.d("Page_Edlp", "jsException", str + "|" + str2, 1.0d);
            }

            @Override // com.taobao.themis.external.embed.TMSEmbed.a
            public void d() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d0577fac", new Object[]{this});
                    return;
                }
                super.d();
                rb8.this.C();
                rb8.b(rb8.this).r = System.currentTimeMillis();
                TLog.loge("tab3edlp", sxl.LAUNCHER_FINISH_TIME);
                rvu.b(new a());
            }

            @Override // com.taobao.themis.external.embed.TMSEmbed.a
            public void e() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("43750d97", new Object[]{this});
                    return;
                }
                super.e();
                rb8.b(rb8.this).q = System.currentTimeMillis();
                TLog.loge("tab3edlp", sxl.LAUNCHER_START_TIME);
            }

            @Override // com.taobao.themis.external.embed.TMSEmbed.a
            public void l(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                    return;
                }
                super.l(str, str2);
                TLog.loge("tab3edlp", "onRenderFailed " + str + "|" + str2);
                rvu.b(new RunnableC1046b());
                a81.b("Page_Edlp", "renderWeex", e.this.b, str, str2);
            }

            @Override // com.taobao.themis.external.embed.TMSEmbed.a
            public void m() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c832df14", new Object[]{this});
                    return;
                }
                super.m();
                rb8.b(rb8.this).s = System.currentTimeMillis();
                TLog.loge("tab3edlp", sxl.RENDER_START_TIME);
            }

            @Override // com.taobao.themis.external.embed.TMSEmbed.a
            public void n() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                    return;
                }
                super.n();
                rb8.b(rb8.this).t = System.currentTimeMillis();
                TLog.loge("tab3edlp", "onRenderSuccess " + rb8.i(rb8.this, this.f27253a));
                rvu.a(rb8.j(rb8.this), (long) rb8.k(rb8.this));
                a81.c("Page_Edlp", "renderWeex", e.this.b);
            }
        }

        public e(Activity activity, String str, boolean z) {
            this.f27251a = activity;
            this.b = str;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TMSEmbed tMSEmbed = new TMSEmbed(this.f27251a);
            StringBuilder sb = new StringBuilder("tmsEmbedInstance = ");
            rb8 rb8Var = rb8.this;
            sb.append(rb8.i(rb8Var, rb8.g(rb8Var)));
            sb.append(" --> ");
            sb.append(rb8.i(rb8.this, tMSEmbed));
            sb.append(", newType=weex");
            TLog.loge("tab3edlp", sb.toString());
            if (rb8.g(rb8.this) != null) {
                rvu.b(new a(rb8.g(rb8.this)));
            }
            rb8.h(rb8.this, tMSEmbed);
            tMSEmbed.r(new b(tMSEmbed));
            Weex2StartParams weex2StartParams = new Weex2StartParams();
            if (this.c) {
                Uri.Builder buildUpon = Uri.parse(this.b).buildUpon();
                buildUpon.appendQueryParameter("_tab3__embed_instance__", String.valueOf(tMSEmbed.hashCode()));
                weex2StartParams.setUrl(buildUpon.build().toString());
            } else {
                weex2StartParams.setUrl(this.b);
            }
            weex2StartParams.setWidth(Integer.valueOf(ir7.d()));
            weex2StartParams.setHeight(Integer.valueOf(ir7.c()));
            weex2StartParams.setAsyncCreate(true);
            TLog.loge("tab3edlp", "setAsyncCreate(true) " + this.b);
            weex2StartParams.setPreRender(true);
            weex2StartParams.setRenderMode(WeexUnicornConfig.RenderMode.texture);
            TLog.loge("tab3edlp", rb8.i(rb8.this, tMSEmbed) + ".init() before");
            tMSEmbed.i(weex2StartParams);
            TLog.loge("tab3edlp", rb8.i(rb8.this, tMSEmbed) + ".init() after");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27257a;

        public f(String str) {
            this.f27257a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            StringBuilder sb = new StringBuilder("EVENT_RENDER_SUCCESS ");
            rb8 rb8Var = rb8.this;
            sb.append(rb8.i(rb8Var, rb8.g(rb8Var)));
            TLog.loge("tab3edlp", sb.toString());
            rb8.l(rb8.this, this.f27257a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            rb8 rb8Var = rb8.this;
            rb8.e(rb8Var, rb8.m(rb8Var).f18031a, rb8.m(rb8.this), rb8.c(rb8.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            rb8.d(rb8.this);
            rb8.b(rb8.this).f29265a = true;
        }
    }

    static {
        t2o.a(1032847423);
        t2o.a(1032847368);
    }

    public rb8(uaq uaqVar) {
        this.o = 400;
        this.e = uaqVar;
        vk8.b().a(Arrays.asList("login", "renderSuccess", vk8.EVENT_TAB_PAGE_INFO_REFRESH), this);
        String str = "{\"pageType\":\"weex2\",\"url\":\"https://web.m.taobao.com/app/ug/crowd-weex2/newuser-tab3?wh_weex=true&weex_mode=dom&in_tab=true&wx_limit_raster_cache=true\"}";
        String config = OrangeConfig.getInstance().getConfig("edlp_business_switch", "defaultPageInfo", str);
        JSONObject parseObject = JSON.parseObject(!TextUtils.isEmpty(config) ? config : str);
        if (parseObject.containsKey("url")) {
            this.m = parseObject.getString("url");
        }
        if (parseObject.containsKey("pageType")) {
            this.n = parseObject.getString("pageType");
        }
        String config2 = OrangeConfig.getInstance().getConfig("edlp_business_switch", "defaultPageTimeout", "400");
        if (!TextUtils.isEmpty(config2)) {
            try {
                this.o = Integer.parseInt(config2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void a(rb8 rb8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a047a5bb", new Object[]{rb8Var});
        } else {
            rb8Var.n();
        }
    }

    public static /* synthetic */ uaq b(rb8 rb8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uaq) ipChange.ipc$dispatch("ea1d7363", new Object[]{rb8Var});
        }
        return rb8Var.e;
    }

    public static /* synthetic */ Activity c(rb8 rb8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("3d7c0d3c", new Object[]{rb8Var});
        }
        return rb8Var.i;
    }

    public static /* synthetic */ void d(rb8 rb8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09b734b", new Object[]{rb8Var});
        } else {
            rb8Var.E();
        }
    }

    public static /* synthetic */ void e(rb8 rb8Var, String str, drs drsVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b7f6ea", new Object[]{rb8Var, str, drsVar, activity});
        } else {
            rb8Var.q(str, drsVar, activity);
        }
    }

    public static /* synthetic */ long f(rb8 rb8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29d174cc", new Object[]{rb8Var})).longValue();
        }
        return rb8Var.d;
    }

    public static /* synthetic */ TMSEmbed g(rb8 rb8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbed) ipChange.ipc$dispatch("6b066425", new Object[]{rb8Var});
        }
        return rb8Var.f27246a;
    }

    public static /* synthetic */ TMSEmbed h(rb8 rb8Var, TMSEmbed tMSEmbed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbed) ipChange.ipc$dispatch("e349fa17", new Object[]{rb8Var, tMSEmbed});
        }
        rb8Var.f27246a = tMSEmbed;
        return tMSEmbed;
    }

    public static /* synthetic */ String i(rb8 rb8Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d64ff6ee", new Object[]{rb8Var, obj});
        }
        return rb8Var.w(obj);
    }

    public static /* synthetic */ Runnable j(rb8 rb8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("9424ab7f", new Object[]{rb8Var});
        }
        return rb8Var.l;
    }

    public static /* synthetic */ int k(rb8 rb8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e133de47", new Object[]{rb8Var})).intValue();
        }
        return rb8Var.o;
    }

    public static /* synthetic */ void l(rb8 rb8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12c5fbbd", new Object[]{rb8Var, str});
        } else {
            rb8Var.o(str);
        }
    }

    public static /* synthetic */ drs m(rb8 rb8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drs) ipChange.ipc$dispatch("23236199", new Object[]{rb8Var});
        }
        return rb8Var.g;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e730ad9", new Object[]{this});
        } else {
            B("notifyEdlpRefresh", null);
        }
    }

    public final void B(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f530a64d", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        jSONObject2.put("uuid", (Object) Long.valueOf(currentTimeMillis));
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        TLog.loge("tab3edlp", str + "|" + currentTimeMillis);
        if (this.f27246a != null) {
            this.f27246a.e(str, jSONObject2, pg1.ATOM_EXT_window);
            return;
        }
        TLog.loge("tab3edlp", " sendEvent error " + this.f27246a);
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d61a75f", new Object[]{this});
            return;
        }
        m e2 = FalcoGlobalTracer.get().d(m.MODULE, "tap").f(FalcoGlobalTracer.get().f()).e();
        e2.y("LowPriceFragment");
        e2.a0(Long.valueOf(this.e.b));
        i2c i2cVar = (i2c) this.f27246a.g(i2c.class);
        if (i2cVar != null) {
            i2cVar.T(e2);
        } else {
            TLog.loge("tab3edlp", "embedRumExtension is null");
        }
    }

    public void D(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29a716f", new Object[]{this, viewGroup});
        } else {
            this.c = viewGroup;
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c453add0", new Object[]{this});
        } else if (this.f27246a == null) {
            TLog.loge("tab3edlp", "ignore setStag(), tmsEmbedInstance==null");
        } else {
            i2c i2cVar = (i2c) this.f27246a.g(i2c.class);
            if (i2cVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("loadDataFromCache", Boolean.valueOf(this.e.v));
                TMSRumTarget tMSRumTarget = TMSRumTarget.CUSTOM;
                i2cVar.S(hashMap, tMSRumTarget);
                i2cVar.M(this.e.a(), tMSRumTarget);
            }
        }
    }

    public final void F(ViewGroup viewGroup, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67bf526d", new Object[]{this, viewGroup, activity});
            return;
        }
        if (this.b == null) {
            ImageView imageView = new ImageView(activity);
            this.b = imageView;
            imageView.setBackgroundResource(R.drawable.edlp_tab3_placeholder);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        viewGroup.removeAllViews();
        viewGroup.addView(this.b, layoutParams);
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e7b044e", new Object[]{this, str});
        } else if (this.f27246a == null) {
            TLog.loge("tab3edlp", "tmsEmbedInstance==null, ignore renderSuccessEvent");
        } else {
            Activity activity = this.i;
            if (activity == null || activity.isFinishing()) {
                TLog.loge("tab3edlp", "mActivity null or finishing, ignore renderSuccessEvent");
            } else if (TextUtils.isEmpty(str)) {
                TLog.loge("tab3edlp", "ignore addEmbedView(), curUrl=" + this.f.f18031a + ", embedViewFromUrl=" + str);
            } else {
                String queryParameter = Uri.parse(str).getQueryParameter("_tab3__embed_instance__");
                if (queryParameter != null) {
                    if (TextUtils.equals(queryParameter, String.valueOf(this.f27246a.hashCode()))) {
                        n();
                        return;
                    }
                    TLog.loge("tab3edlp", "ignore addEmbedView(), curEmbed=" + this.f27246a.hashCode() + ", embedViewFromInstance=" + queryParameter);
                } else if (TextUtils.equals(str, this.f.f18031a)) {
                    n();
                } else {
                    TLog.loge("tab3edlp", "ignore addEmbedView(), curUrl=" + this.f.f18031a + ", embedViewFromUrl=" + str);
                }
            }
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1f2d28", new Object[]{this});
        } else if (!this.e.f29265a) {
            rvu.a(new h(), 2000L);
        }
    }

    public final void s(String str, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1936ed40", new Object[]{this, str, activity, new Boolean(z)});
        } else {
            uto.a().execute(new e(activity, str, z));
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TLog.loge("tab3edlp", " weex destroy");
        if (this.f27246a != null) {
            TLog.loge("tab3edlp", w(this.f27246a) + ".destroy() start");
            this.f27246a.d();
            TLog.loge("tab3edlp", w(this.f27246a) + ".destroy() end");
        }
        vk8.b().c(Arrays.asList("login", "renderSuccess", vk8.EVENT_TAB_PAGE_INFO_REFRESH), this);
    }

    public TMSEmbed v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbed) ipChange.ipc$dispatch("d45df459", new Object[]{this});
        }
        return this.f27246a;
    }

    public void x(String str, drs drsVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ad55108", new Object[]{this, str, drsVar, activity});
            return;
        }
        this.d = System.currentTimeMillis();
        if (this.f27246a == null) {
            this.i = activity;
            String str2 = this.m;
            if (drsVar != null && !TextUtils.isEmpty(drsVar.f18031a)) {
                str2 = drsVar.f18031a;
            }
            if (!TextUtils.isEmpty(str)) {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("ext", str).build().toString();
            }
            this.k.set(true);
            rvu.b(new b(str2, drsVar, activity));
        }
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d17113", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) str);
        B("notifyLoginStatusChange", jSONObject);
    }

    public void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676d69c3", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        B("notifyOpenFromUrl", jSONObject);
    }

    @Override // tb.m3c
    public void onEvent(String str, Map<String, Object> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed5db5b9", new Object[]{this, str, map});
        } else if (TextUtils.equals(str, "login")) {
            y("login");
        } else if (TextUtils.equals(str, "renderSuccess")) {
            this.e.u = System.currentTimeMillis();
            TLog.loge("tab3edlp", " render success time " + (System.currentTimeMillis() - this.d));
            rvu.c(this.l);
            TLog.loge("tab3edlp", "前端上报渲染完成事件，移除容器渲染回调的延时任务");
            rvu.b(new f((String) map.get("data")));
        } else if (TextUtils.equals(str, vk8.EVENT_TAB_PAGE_INFO_REFRESH)) {
            TLog.loge("tab3edlp", "EVENT_ALIEN_REFRESH arrived");
            drs drsVar = (drs) map.get("data");
            if (drsVar == null) {
                TLog.loge("tab3edlp", "ignore EVENT_ALIEN_REFRESH: tabPageInfo == null");
            } else if (this.f == null || drsVar.h <= this.f.h) {
                if (this.f == null) {
                    str2 = "null";
                } else {
                    str2 = String.valueOf(this.f.h);
                }
                TLog.loge("tab3edlp", "ignore EVENT_ALIEN_REFRESH: newInfo.version=" + drsVar.h + " <= mCurInfo.version=" + str2);
            } else if (TextUtils.isEmpty(drsVar.f18031a) || TextUtils.isEmpty(drsVar.b)) {
                TLog.loge("tab3edlp", "ignore EVENT_ALIEN_REFRESH error :" + drsVar.toString());
            } else {
                synchronized (this.h) {
                    try {
                        drs drsVar2 = this.g;
                        if (drsVar2 == null) {
                            this.g = drsVar;
                            TLog.loge("tab3edlp", "handle EVENT_ALIEN_REFRESH: update latestInfo, version=" + this.g.h + ", type=" + this.g.b);
                        } else if (drsVar.h > drsVar2.h) {
                            this.g = drsVar;
                            TLog.loge("tab3edlp", "handle EVENT_ALIEN_REFRESH: update latestInfo, version=" + this.g.h + ", type=" + this.g.b);
                        } else {
                            TLog.loge("tab3edlp", "ignore EVENT_ALIEN_REFRESH: newInfo.version=" + drsVar.h + " <= latestInfo.version=" + this.g.h);
                            return;
                        }
                        if (this.f27246a != null && !this.k.get()) {
                            TLog.loge("tab3edlp", "handle EVENT_ALIEN_REFRESH: switch to main-thread execute build");
                            this.k.set(true);
                            rvu.b(new g());
                        }
                        TLog.loge("tab3edlp", "handle EVENT_ALIEN_REFRESH: wait for current building finish");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } else {
            TextUtils.equals(str, "logout");
        }
    }

    public final void q(String str, drs drsVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("344f3eea", new Object[]{this, str, drsVar, activity});
        } else if (this.f == null || drsVar == null || !TextUtils.equals(str, this.f.f18031a) || !TextUtils.equals(drsVar.b, this.f.b)) {
            this.j = false;
            String str2 = this.n;
            if (drsVar == null || TextUtils.isEmpty(drsVar.b)) {
                drs drsVar2 = new drs();
                drsVar2.b = this.n;
                drsVar2.f18031a = str;
                this.f = drsVar2;
                TLog.loge("tab3edlp", "命中兜底配置" + this.n);
            } else {
                str2 = drsVar.b;
                this.f = drsVar;
            }
            TLog.loge("tab3edlp", "createEmbedInstance type=" + str2 + ", url=" + str);
            boolean g2 = fbl.g();
            try {
                if (TextUtils.equals("web", str2)) {
                    boolean h2 = fbl.h();
                    if (h2) {
                        F(this.c, activity);
                    }
                    r(str, activity, h2, g2);
                    return;
                }
                F(this.c, activity);
                s(str, activity, g2);
            } catch (Throwable th) {
                TLog.loge("tab3edlp", "createEmbedInstance error " + Log.getStackTraceString(th));
            }
        } else {
            this.k.set(false);
            TLog.loge("tab3edlp", "createEmbedInstance Abort! url & type are same as current");
        }
    }

    public final void r(String str, Activity activity, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d18719", new Object[]{this, str, activity, new Boolean(z), new Boolean(z2)});
            return;
        }
        TMSEmbed tMSEmbed = new TMSEmbed(activity);
        TLog.loge("tab3edlp", "tmsEmbedInstance = " + w(this.f27246a) + " --> " + w(tMSEmbed) + ", newType=web");
        if (this.f27246a != null) {
            rvu.b(new c(this.f27246a));
        }
        this.f27246a = tMSEmbed;
        tMSEmbed.r(new d(tMSEmbed, z, str));
        WebStartParams webStartParams = new WebStartParams();
        if (z2) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("_tab3__embed_instance__", String.valueOf(tMSEmbed.hashCode()));
            webStartParams.setUrl(buildUpon.build().toString());
        } else {
            webStartParams.setUrl(str);
        }
        webStartParams.setSafeArea(new woo(u(activity), 0, 0, 0));
        tMSEmbed.i(webStartParams);
        tMSEmbed.u();
        if (!z) {
            n();
        }
    }

    public final int u(Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{this, context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = context.getResources().getDimensionPixelSize(identifier);
        }
        return (int) ((i / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final String w(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80e398f", new Object[]{this, obj});
        }
        if (obj == null) {
            return "null";
        }
        String[] split = obj.toString().split("\\.");
        if (split.length > 0) {
            return split[split.length - 1];
        }
        return obj.toString();
    }

    public final void n() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e23384", new Object[]{this});
        } else if (this.j) {
            StringBuilder sb = new StringBuilder("ignore addEmbedView(), view for ");
            if (this.f == null) {
                str2 = "";
            } else {
                str2 = this.f.f18031a;
            }
            sb.append(str2);
            sb.append(" has been added once");
            TLog.loge("tab3edlp", sb.toString());
        } else {
            View h2 = this.f27246a.h();
            if (h2 != null) {
                this.c.removeAllViews();
                this.c.addView(h2);
                if (this.f == null) {
                    str = "weex2";
                } else {
                    str = this.f.b;
                }
                TLog.loge("tab3edlp", str + "Embed addView complete " + w(this.f27246a));
                this.j = true;
                this.k.set(false);
                drs drsVar = this.g;
                if (drsVar == null || drsVar.h <= this.f.h) {
                    TLog.loge("tab3edlp", "No need consume latestInfo");
                    return;
                }
                TLog.loge("tab3edlp", "consume latestInfo(type=" + this.g.b + "): mLatestVersion=" + this.g.h + " > mCurVersion=" + this.f.h);
                this.k.set(true);
                drs drsVar2 = this.g;
                q(drsVar2.f18031a, drsVar2, this.i);
            }
        }
    }
}
