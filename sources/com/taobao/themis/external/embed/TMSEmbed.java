package com.taobao.themis.external.embed;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.adapter.ITMSRUMAdapter;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import kotlin.Deprecated;
import kotlin.Metadata;
import tb.aas;
import tb.bbs;
import tb.ckf;
import tb.eas;
import tb.idx;
import tb.jpu;
import tb.krb;
import tb.mcs;
import tb.mop;
import tb.ncs;
import tb.p8s;
import tb.qgr;
import tb.t2o;
import tb.xhv;
import tb.yad;
import tb.z9s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSEmbed {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f13515a;
    public TMSEmbedSolutionType b;
    public final EmbedRootView c;
    public a d;
    public z9s e;
    public FrameLayout f;
    public final String g;
    public final long h;
    public final long i;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/external/embed/TMSEmbed$EmbedRootView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ltb/bbs;", "instance", "Ltb/xhv;", "bindInstance", "(Ltb/bbs;)V", "getInstance", "()Ltb/bbs;", "mInstance", "Ltb/bbs;", "themis_interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class EmbedRootView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private bbs mInstance;

        static {
            t2o.a(838860812);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmbedRootView(Context context) {
            super(context);
            ckf.g(context, "context");
        }

        public static /* synthetic */ Object ipc$super(EmbedRootView embedRootView, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/external/embed/TMSEmbed$EmbedRootView");
        }

        public final void bindInstance(bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c25f8ed5", new Object[]{this, bbsVar});
                return;
            }
            ckf.g(bbsVar, "instance");
            this.mInstance = bbsVar;
        }

        public final bbs getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bbs) ipChange.ipc$dispatch("57ded820", new Object[]{this});
            }
            return this.mInstance;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(838860813);
        }

        public boolean b(boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("17a6ad2f", new Object[]{this, new Boolean(z), str, str2})).booleanValue();
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            return false;
        }

        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0577fac", new Object[]{this});
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43750d97", new Object[]{this});
            }
        }

        @Deprecated(message = "onPop is deprecated, use IContainerExtension#setOnCloseHandler instead")
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3809a779", new Object[]{this});
            }
        }

        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
        }

        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c832df14", new Object[]{this});
            }
        }

        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements bbs.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.bbs.e
        public final void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af48699b", new Object[]{this, str, str2});
                return;
            }
            a c = TMSEmbed.c(TMSEmbed.this);
            if (c != null) {
                if (str == null) {
                    str = "JSError";
                }
                if (str2 == null) {
                    str2 = "";
                }
                c.c(str, str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements yad {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bbs f13517a;
        public final /* synthetic */ TMSEmbed b;

        public c(bbs bbsVar, TMSEmbed tMSEmbed) {
            this.f13517a = bbsVar;
            this.b = tMSEmbed;
        }

        @Override // tb.yad
        public void E() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3809a779", new Object[]{this});
                return;
            }
            mcs.e(mcs.MODULE_EMBED, "ON_POP", ncs.d(this.f13517a), ckf.p(ncs.d(this.f13517a), TMSEmbed.b(this.b)), new JSONObject());
            a c = TMSEmbed.c(this.b);
            if (c != null) {
                c.f();
            }
        }

        @Override // tb.t4c
        public void N(bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
            } else {
                yad.a.a(this, bbsVar);
            }
        }

        @Override // tb.t4c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("896696a2", new Object[]{this});
            } else {
                yad.a.b(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements bbs.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bbs f13518a;
        public final /* synthetic */ TMSEmbed b;
        public final /* synthetic */ StartParams c;

        public d(bbs bbsVar, TMSEmbed tMSEmbed, StartParams startParams) {
            this.f13518a = bbsVar;
            this.b = tMSEmbed;
            this.c = startParams;
        }

        @Override // tb.bbs.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                return;
            }
            mcs.e(mcs.MODULE_EMBED, "ON_RENDER_SUCCESS", ncs.d(this.f13518a), ckf.p(ncs.d(this.f13518a), TMSEmbed.b(this.b)), new JSONObject());
            a c = TMSEmbed.c(this.b);
            if (c != null) {
                c.n();
            }
        }

        @Override // tb.bbs.d
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a16c1d38", new Object[]{this});
                return;
            }
            mcs.e(mcs.MODULE_EMBED, "ON_LAUNCH_FINISH", ncs.d(this.f13518a), ckf.p(ncs.d(this.f13518a), TMSEmbed.b(this.b)), new JSONObject());
            a c = TMSEmbed.c(this.b);
            if (c != null) {
                c.d();
            }
        }

        @Override // tb.bbs.d
        public void c(eas easVar) {
            Boolean bool;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("528f285d", new Object[]{this, easVar});
                return;
            }
            ckf.g(easVar, "error");
            String d = ncs.d(this.f13518a);
            String p = ckf.p(ncs.d(this.f13518a), TMSEmbed.b(this.b));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "errorCode", easVar.f18428a);
            jSONObject2.put((JSONObject) "errorMsg", easVar.b);
            xhv xhvVar = xhv.INSTANCE;
            jSONObject.put((JSONObject) "onRenderErrorParam", (String) jSONObject2);
            mcs.c(mcs.MODULE_EMBED, "ON_RENDER_ERROR", d, p, jSONObject);
            a c = TMSEmbed.c(this.b);
            if (c != null) {
                String str = easVar.f18428a;
                ckf.f(str, "error.errorCode");
                String str2 = easVar.b;
                ckf.f(str2, "error.errorMsg");
                c.l(str, str2);
            }
            a c2 = TMSEmbed.c(this.b);
            if (c2 == null) {
                bool = null;
            } else {
                boolean p2 = TMSEmbed.a(this.b).p();
                String str3 = easVar.f18428a;
                ckf.f(str3, "error.errorCode");
                String str4 = easVar.b;
                ckf.f(str4, "error.errorMsg");
                bool = Boolean.valueOf(c2.b(p2, str3, str4));
            }
            String d2 = ncs.d(this.f13518a);
            String p3 = ckf.p(ncs.d(this.f13518a), TMSEmbed.b(this.b));
            JSONObject jSONObject3 = new JSONObject();
            TMSEmbed tMSEmbed = this.b;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put((JSONObject) "downgradeIntercept", (String) bool);
            jSONObject4.put((JSONObject) "canAutoDowngrade", (String) Boolean.valueOf(TMSEmbed.a(tMSEmbed).p()));
            jSONObject3.put((JSONObject) "onDowngradeParam", (String) jSONObject4);
            mcs.c(mcs.MODULE_EMBED, "ON_DOWNGRADE", d2, p3, jSONObject3);
            if (ckf.b(bool, Boolean.FALSE) && TMSEmbed.a(this.b).p()) {
                this.b.s(this.c, TMSEmbedSolutionType.WEB_SINGLE_PAGE);
            }
        }

        @Override // tb.bbs.d
        public void onRenderReady() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61f6bd5", new Object[]{this});
                return;
            }
            mcs.e(mcs.MODULE_EMBED, "ON_RENDER_START", ncs.d(this.f13518a), ckf.p(ncs.d(this.f13518a), TMSEmbed.b(this.b)), new JSONObject());
            a c = TMSEmbed.c(this.b);
            if (c != null) {
                c.m();
            }
        }
    }

    static {
        t2o.a(838860811);
    }

    public TMSEmbed(Activity activity, TMSEmbedSolutionType tMSEmbedSolutionType, EmbedRootView embedRootView, boolean z) {
        ckf.g(activity, "activity");
        ckf.g(embedRootView, "mRootView");
        this.f13515a = activity;
        this.b = tMSEmbedSolutionType;
        this.c = embedRootView;
        this.g = "_embed";
        this.h = -1L;
        this.i = -1L;
        this.h = System.currentTimeMillis();
        qgr.a(activity.getApplicationContext());
        this.i = System.currentTimeMillis();
        if (z) {
            j();
        }
        this.e = new z9s(activity, this.f, embedRootView);
    }

    public static final /* synthetic */ z9s a(TMSEmbed tMSEmbed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z9s) ipChange.ipc$dispatch("a43850ae", new Object[]{tMSEmbed});
        }
        return tMSEmbed.e;
    }

    public static final /* synthetic */ String b(TMSEmbed tMSEmbed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13fb69e8", new Object[]{tMSEmbed});
        }
        return tMSEmbed.g;
    }

    public static final /* synthetic */ a c(TMSEmbed tMSEmbed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("aebf3c89", new Object[]{tMSEmbed});
        }
        return tMSEmbed.d;
    }

    public static /* synthetic */ void f(TMSEmbed tMSEmbed, String str, JSON json, String str2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9984aa", new Object[]{tMSEmbed, str, json, str2, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        tMSEmbed.e(str, json, str2);
    }

    public static /* synthetic */ void t(TMSEmbed tMSEmbed, StartParams startParams, TMSEmbedSolutionType tMSEmbedSolutionType, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86071f60", new Object[]{tMSEmbed, startParams, tMSEmbedSolutionType, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            tMSEmbedSolutionType = null;
        }
        tMSEmbed.s(startParams, tMSEmbedSolutionType);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.e.k();
        }
    }

    public final void e(String str, JSON json, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df877ac8", new Object[]{this, str, json, str2});
            return;
        }
        ckf.g(str, "eventName");
        this.e.q(str, json, str2);
    }

    public final <T extends krb> T g(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((krb) ipChange.ipc$dispatch("3ff331de", new Object[]{this, cls}));
        }
        ckf.g(cls, "clz");
        return (T) this.e.r(cls);
    }

    public final View h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.c;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c23163", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.f13515a);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setVisibility(8);
        this.f = frameLayout;
        this.c.addView(frameLayout);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        } else {
            this.e.s();
        }
    }

    public final void l(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.e.j(i, i2, intent);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        } else {
            this.e.t();
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
        } else {
            this.e.u();
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        } else {
            this.e.v();
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
        } else {
            this.e.w();
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
        } else {
            this.e.x();
        }
    }

    public final void r(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df770afb", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        this.d = aVar;
    }

    public final void s(StartParams startParams, TMSEmbedSolutionType tMSEmbedSolutionType) {
        TMSEmbedSolutionType tMSEmbedSolutionType2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78cda280", new Object[]{this, startParams, tMSEmbedSolutionType});
            return;
        }
        ckf.g(startParams, RVConstants.EXTRA_START_PARAMS);
        bbs i = this.e.i();
        ckf.d(i);
        String d2 = ncs.d(i);
        bbs i2 = this.e.i();
        ckf.d(i2);
        String p = ckf.p(ncs.d(i2), this.g);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "url", startParams.getUrl());
        String name = tMSEmbedSolutionType == null ? null : tMSEmbedSolutionType.name();
        if (name == null && ((tMSEmbedSolutionType2 = this.b) == null || (name = tMSEmbedSolutionType2.name()) == null)) {
            name = "";
        }
        jSONObject2.put((JSONObject) "solution", name);
        xhv xhvVar = xhv.INSTANCE;
        jSONObject.put((JSONObject) "onReloadParam", (String) jSONObject2);
        mcs.c(mcs.MODULE_EMBED, "ON_RELOAD", d2, p, jSONObject);
        if (tMSEmbedSolutionType == null || tMSEmbedSolutionType == this.b) {
            String url = startParams.getUrl();
            if (url != null) {
                this.e.z(url);
                return;
            }
            return;
        }
        this.e.k();
        this.c.removeAllViews();
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            frameLayout.removeAllViews();
            this.c.addView(this.f);
        }
        this.e = new z9s(this.f13515a, this.f, this.c);
        this.b = tMSEmbedSolutionType;
        i(startParams);
        u();
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
        } else {
            this.e.A();
        }
    }

    public final void i(StartParams startParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4623b0c2", new Object[]{this, startParams});
            return;
        }
        ckf.g(startParams, RVConstants.EXTRA_START_PARAMS);
        String url = startParams.getUrl();
        if (url == null) {
            url = "";
        }
        Uri build = Uri.parse(url).buildUpon().build();
        JSONObject jSONObject = new JSONObject();
        boolean z = startParams instanceof WidgetStartParams;
        if (z) {
            WidgetStartParams widgetStartParams = (WidgetStartParams) startParams;
            String sceneParamValue = widgetStartParams.getSceneParamValue("sceneId");
            if (sceneParamValue != null) {
                jSONObject.put((JSONObject) "sceneId", sceneParamValue);
            }
            String sceneParamValue2 = widgetStartParams.getSceneParamValue("sellerId");
            if (sceneParamValue2 != null) {
                jSONObject.put((JSONObject) "sellerId", sceneParamValue2);
            }
        }
        if ((startParams instanceof Weex2StartParams) && ((Weex2StartParams) startParams).getAsyncCreate()) {
            jSONObject.put((JSONObject) "tms_weex_async_create", (String) Boolean.TRUE);
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.e();
        }
        z9s z9sVar = this.e;
        String uri = build.toString();
        ckf.f(uri, "uri.toString()");
        bbs b2 = z9sVar.b(uri, jSONObject);
        this.e.o(kotlin.collections.a.j(jpu.a(mop.KEY_CONTAINER_START, String.valueOf(this.i)), jpu.a("containerOnCreate", String.valueOf(this.h))));
        String d2 = ncs.d(b2);
        String p = ckf.p(ncs.d(b2), this.g);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "url", startParams.getUrl());
        TMSEmbedSolutionType tMSEmbedSolutionType = this.b;
        TMSSolutionType tMSSolutionType = null;
        jSONObject2.put((JSONObject) "solution", tMSEmbedSolutionType == null ? null : tMSEmbedSolutionType.name());
        jSONObject2.put((JSONObject) RVConstants.EXTRA_START_PARAMS, (String) JSON.parse(JSON.toJSONString(startParams)));
        xhv xhvVar = xhv.INSTANCE;
        mcs.e(mcs.MODULE_EMBED, "ON_LAUNCH_START", d2, p, jSONObject2);
        b2.m0(new b());
        this.e.y(new c(b2, this));
        if (z) {
            this.c.bindInstance(b2);
            WidgetStartParams widgetStartParams2 = (WidgetStartParams) startParams;
            b2.v0(widgetStartParams2.getSpmOri());
            b2.k(idx.class, new idx(widgetStartParams2));
        }
        b2.k(StartParams.class, startParams);
        bbs i = this.e.i();
        if (i != null) {
            ITMSRUMAdapter iTMSRUMAdapter = (ITMSRUMAdapter) p8s.b(ITMSRUMAdapter.class);
            if (iTMSRUMAdapter != null) {
                iTMSRUMAdapter.registerRumEmbedExtension(i);
            }
            i.k0(new aas());
        }
        z9s z9sVar2 = this.e;
        TMSEmbedSolutionType tMSEmbedSolutionType2 = this.b;
        if (tMSEmbedSolutionType2 != null) {
            tMSSolutionType = tMSEmbedSolutionType2.convert();
        }
        z9sVar2.a(tMSSolutionType, new d(b2, this, startParams));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TMSEmbed(Activity activity, TMSEmbedSolutionType tMSEmbedSolutionType) {
        this(activity, tMSEmbedSolutionType, new EmbedRootView(activity), true);
        ckf.g(activity, "activity");
        ckf.g(tMSEmbedSolutionType, "solution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TMSEmbed(Activity activity) {
        this(activity, null, new EmbedRootView(activity), true);
        ckf.g(activity, "activity");
    }
}
