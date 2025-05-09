package com.taobao.themis.widget.kernal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.external.embed.WidgetStartParams;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.widget.TMSWidgetAPIBridge;
import com.taobao.themis.widget.kernal.TMSWidgetEngine;
import com.taobao.themis.widget.platformview.IntegrationVideoPlatformView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.a6x;
import tb.bbs;
import tb.bfs;
import tb.c7o;
import tb.cfs;
import tb.ckf;
import tb.d1a;
import tb.d6x;
import tb.ekd;
import tb.h6x;
import tb.h9z;
import tb.ias;
import tb.ies;
import tb.j6x;
import tb.mcs;
import tb.mgg;
import tb.ncs;
import tb.o9s;
import tb.ocs;
import tb.p8s;
import tb.pg1;
import tb.q6x;
import tb.q9s;
import tb.r8s;
import tb.s5x;
import tb.t2o;
import tb.uj3;
import tb.v51;
import tb.wsq;
import tb.xhv;
import tb.yes;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWidgetEngine implements j6x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "TMSWidgetEngine";

    /* renamed from: a */
    public final Context f13816a;
    public final yes.a b;
    public WeexInstance c;
    public bbs d;
    public final HashMap<String, WidgetRenderInstance> e;
    public boolean f;
    public boolean g;
    public final LinkedList<Runnable> h;
    public String i;
    public String j;
    public boolean k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public b p;
    public String q;
    public boolean r;
    public boolean s;
    public boolean t;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public final class WidgetRenderInstance {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final Activity f13817a;
        public final bbs b;
        public final ITMSPage c;
        public final Integer d;
        public final WeexInstance e;
        public final ocs f;
        public WeakReference<WeexInstance> g;
        public boolean h;
        public byte[] i;
        public boolean j;
        public View k;
        public ViewGroup l;
        public boolean m;
        public final WeexUnicornConfig.RenderMode n;
        public boolean o;
        public boolean p;
        public boolean q;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String b;

            public a(String str) {
                WidgetRenderInstance.this = r1;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                WidgetRenderInstance.q(WidgetRenderInstance.this, bfs.INSTANCE.d(this.b));
                WidgetRenderInstance.b(WidgetRenderInstance.this);
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ d1a<xhv> b;

            public b(d1a<xhv> d1aVar) {
                WidgetRenderInstance.this = r1;
                this.b = d1aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    WeakReference n = WidgetRenderInstance.n(WidgetRenderInstance.this);
                    WeexInstance weexInstance = n == null ? null : (WeexInstance) n.get();
                    if (weexInstance != null) {
                        HashMap<String, String> k = ((q6x) weexInstance.getExtend(q6x.class)).k();
                        ckf.f(k, "instance.getExtend(WeexI…ass.java).firstScreenInfo");
                        String str = k.get("end_time_stamp_opt");
                        WidgetRenderInstance.l(WidgetRenderInstance.this).S().c("widgetFirstScreen", str == null ? "" : str);
                        WidgetRenderInstance.l(WidgetRenderInstance.this).S().b("widgetOnDestroy");
                        String h = WidgetRenderInstance.l(WidgetRenderInstance.this).S().h("instanceCreate");
                        if (h != null) {
                            WidgetRenderInstance widgetRenderInstance = WidgetRenderInstance.this;
                            if (!TextUtils.isEmpty(str)) {
                                mgg S = WidgetRenderInstance.l(widgetRenderInstance).S();
                                ckf.d(str);
                                S.c("widgetActualInteraction", String.valueOf(Long.parseLong(str) - Long.parseLong(h)));
                            }
                        }
                        WidgetRenderInstance.o(WidgetRenderInstance.this);
                        WidgetRenderInstance.p(WidgetRenderInstance.this);
                        d1a<xhv> d1aVar = this.b;
                        if (d1aVar != null) {
                            d1aVar.invoke();
                        }
                    }
                } catch (Throwable th) {
                    TMSLogger.d(TMSWidgetEngine.TAG, th);
                }
            }
        }

        static {
            t2o.a(852492353);
        }

        public WidgetRenderInstance(TMSWidgetEngine tMSWidgetEngine, Activity activity, bbs bbsVar, ITMSPage iTMSPage, Integer num, WeexInstance weexInstance, ocs ocsVar) {
            ckf.g(tMSWidgetEngine, "this$0");
            ckf.g(activity, "activity");
            ckf.g(bbsVar, "tmsInstance");
            TMSWidgetEngine.this = tMSWidgetEngine;
            this.f13817a = activity;
            this.b = bbsVar;
            this.c = iTMSPage;
            this.d = num;
            this.e = weexInstance;
            this.f = ocsVar;
            this.n = WeexUnicornConfig.RenderMode.texture;
        }

        public static /* synthetic */ void N(WidgetRenderInstance widgetRenderInstance, ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c77d34c3", new Object[]{widgetRenderInstance, viewGroup, new Integer(i), obj});
                return;
            }
            if ((i & 1) != 0) {
                viewGroup = null;
            }
            widgetRenderInstance.M(viewGroup);
        }

        public static /* synthetic */ void P(WidgetRenderInstance widgetRenderInstance, d1a d1aVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbc4adab", new Object[]{widgetRenderInstance, d1aVar, new Integer(i), obj});
                return;
            }
            if ((i & 1) != 0) {
                d1aVar = null;
            }
            widgetRenderInstance.O(d1aVar);
        }

        public static final /* synthetic */ boolean a(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d06bc74a", new Object[]{widgetRenderInstance})).booleanValue();
            }
            return widgetRenderInstance.z();
        }

        public static final /* synthetic */ void b(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b5cb2b", new Object[]{widgetRenderInstance});
            } else {
                widgetRenderInstance.C();
            }
        }

        public static final /* synthetic */ void c(WidgetRenderInstance widgetRenderInstance, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bd7cdfa", new Object[]{widgetRenderInstance, str});
            } else {
                widgetRenderInstance.E(str);
            }
        }

        public static final /* synthetic */ byte[] d(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("92dfe73", new Object[]{widgetRenderInstance});
            }
            return widgetRenderInstance.i;
        }

        public static final /* synthetic */ boolean e(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("72c3e9d1", new Object[]{widgetRenderInstance})).booleanValue();
            }
            return widgetRenderInstance.m;
        }

        public static final /* synthetic */ boolean f(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3efffef3", new Object[]{widgetRenderInstance})).booleanValue();
            }
            return widgetRenderInstance.p;
        }

        public static final /* synthetic */ boolean g(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("53dd3edc", new Object[]{widgetRenderInstance})).booleanValue();
            }
            return widgetRenderInstance.j;
        }

        public static final /* synthetic */ WeexUnicornConfig.RenderMode h(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeexUnicornConfig.RenderMode) ipChange.ipc$dispatch("4c311981", new Object[]{widgetRenderInstance});
            }
            return widgetRenderInstance.n;
        }

        public static final /* synthetic */ View i(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("3045d7ea", new Object[]{widgetRenderInstance});
            }
            return widgetRenderInstance.k;
        }

        public static final /* synthetic */ ViewGroup j(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("827c24e1", new Object[]{widgetRenderInstance});
            }
            return widgetRenderInstance.l;
        }

        public static final /* synthetic */ WeexInstance k(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeexInstance) ipChange.ipc$dispatch("70086fde", new Object[]{widgetRenderInstance});
            }
            return widgetRenderInstance.e;
        }

        public static final /* synthetic */ bbs l(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bbs) ipChange.ipc$dispatch("d25a1203", new Object[]{widgetRenderInstance});
            }
            return widgetRenderInstance.b;
        }

        public static final /* synthetic */ boolean m(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f6e55d4a", new Object[]{widgetRenderInstance})).booleanValue();
            }
            return widgetRenderInstance.o;
        }

        public static final /* synthetic */ WeakReference n(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("9cfcabcb", new Object[]{widgetRenderInstance});
            }
            return widgetRenderInstance.g;
        }

        public static final /* synthetic */ void o(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6818d5b7", new Object[]{widgetRenderInstance});
            } else {
                widgetRenderInstance.Q();
            }
        }

        public static final /* synthetic */ void p(WidgetRenderInstance widgetRenderInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("357c5ef", new Object[]{widgetRenderInstance});
            } else {
                widgetRenderInstance.R();
            }
        }

        public static final /* synthetic */ void q(WidgetRenderInstance widgetRenderInstance, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60374965", new Object[]{widgetRenderInstance, bArr});
            } else {
                widgetRenderInstance.i = bArr;
            }
        }

        public static final /* synthetic */ void r(WidgetRenderInstance widgetRenderInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc3130a7", new Object[]{widgetRenderInstance, new Boolean(z)});
            } else {
                widgetRenderInstance.h = z;
            }
        }

        public static final /* synthetic */ void s(WidgetRenderInstance widgetRenderInstance, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb904dd3", new Object[]{widgetRenderInstance, jSONObject});
            } else {
                widgetRenderInstance.S(jSONObject);
            }
        }

        public static final /* synthetic */ void t(WidgetRenderInstance widgetRenderInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2173eb3", new Object[]{widgetRenderInstance, new Boolean(z)});
            } else {
                widgetRenderInstance.m = z;
            }
        }

        public static final /* synthetic */ void u(WidgetRenderInstance widgetRenderInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eafefad1", new Object[]{widgetRenderInstance, new Boolean(z)});
            } else {
                widgetRenderInstance.p = z;
            }
        }

        public static final /* synthetic */ void v(WidgetRenderInstance widgetRenderInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7722c36", new Object[]{widgetRenderInstance, view});
            } else {
                widgetRenderInstance.k = view;
            }
        }

        public static final /* synthetic */ void w(WidgetRenderInstance widgetRenderInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35ed0f03", new Object[]{widgetRenderInstance, new Boolean(z)});
            } else {
                widgetRenderInstance.q = z;
            }
        }

        public static final /* synthetic */ void x(WidgetRenderInstance widgetRenderInstance, WeakReference weakReference) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4752dc4d", new Object[]{widgetRenderInstance, weakReference});
            } else {
                widgetRenderInstance.g = weakReference;
            }
        }

        public final void A() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
            } else if (!this.j) {
                this.j = true;
                P(this, null, 1, null);
                this.b.destroy();
                CommonExtKt.o(new TMSWidgetEngine$WidgetRenderInstance$destroy$1(this));
            }
        }

        public final void B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
            } else {
                CommonExtKt.o(new TMSWidgetEngine$WidgetRenderInstance$detach$1(this));
            }
        }

        public final void C() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e7a0208", new Object[]{this});
                return;
            }
            final TMSWidgetEngine tMSWidgetEngine = TMSWidgetEngine.this;
            tMSWidgetEngine.J(new Runnable() { // from class: com.taobao.themis.widget.kernal.TMSWidgetEngine$WidgetRenderInstance$doRender$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                /* renamed from: com.taobao.themis.widget.kernal.TMSWidgetEngine$WidgetRenderInstance$doRender$1$1  reason: invalid class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
                public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ TMSWidgetEngine this$0;
                    public final /* synthetic */ TMSWidgetEngine.WidgetRenderInstance this$1;

                    /* compiled from: Taobao */
                    /* renamed from: com.taobao.themis.widget.kernal.TMSWidgetEngine$WidgetRenderInstance$doRender$1$1$a */
                    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
                    public static final class a implements j6x {
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ TMSWidgetEngine.WidgetRenderInstance f13821a;
                        public final /* synthetic */ TMSWidgetEngine b;

                        public a(TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance, TMSWidgetEngine tMSWidgetEngine) {
                            this.f13821a = widgetRenderInstance;
                            this.b = tMSWidgetEngine;
                        }

                        @Override // tb.j6x
                        public void E1(WeexInstance weexInstance, boolean z) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
                            }
                        }

                        @Override // tb.j6x
                        public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
                            String str2;
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                                return;
                            }
                            ocs H = this.f13821a.H();
                            if (H != null) {
                                if (weexErrorType == null) {
                                    str2 = null;
                                } else {
                                    str2 = weexErrorType.name();
                                }
                                H.b(ckf.p("TMS_ERR_WIDGET_", str2), str);
                            }
                        }

                        @Override // tb.j6x
                        public void I1(WeexInstance weexInstance) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
                            } else {
                                this.b.H(this.f13821a);
                            }
                        }

                        @Override // tb.j6x
                        public void K0(WeexInstance weexInstance) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
                            }
                        }

                        @Override // tb.j6x
                        public void K1(WeexInstance weexInstance, boolean z) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
                                return;
                            }
                            ocs H = this.f13821a.H();
                            if (H != null) {
                                H.a();
                            }
                        }

                        @Override // tb.j6x
                        public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
                            }
                        }

                        @Override // tb.j6x
                        public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
                            String str2;
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
                                return;
                            }
                            ocs H = this.f13821a.H();
                            if (H != null) {
                                if (weexErrorType == null) {
                                    str2 = null;
                                } else {
                                    str2 = weexErrorType.name();
                                }
                                H.c(str2, str);
                            }
                        }

                        @Override // tb.j6x
                        public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
                            }
                        }

                        @Override // tb.j6x
                        public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TMSWidgetEngine tMSWidgetEngine, TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance) {
                        super(0);
                        this.this$0 = tMSWidgetEngine;
                        this.this$1 = widgetRenderInstance;
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/kernal/TMSWidgetEngine$WidgetRenderInstance$doRender$1$1");
                    }

                    @Override // tb.d1a
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        String str;
                        WeexInstance weexInstance;
                        c7o Y;
                        JSONObject sceneParamObject;
                        String string;
                        JSONObject x;
                        String jSONString;
                        c7o Y2;
                        JSONObject jSONObject;
                        boolean z;
                        boolean z2 = false;
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        } else if (TMSWidgetEngine.i(this.this$0) || TMSWidgetEngine.WidgetRenderInstance.g(this.this$1)) {
                            this.this$1.A();
                        } else {
                            WeexInstance h = TMSWidgetEngine.h(this.this$0);
                            ckf.d(h);
                            d6x d6xVar = (d6x) h.getExtend(d6x.class);
                            ekd ekdVar = (ekd) TMSWidgetEngine.WidgetRenderInstance.l(this.this$1).getExtension(ekd.class);
                            if (!(ekdVar == null || (Y2 = ekdVar.Y(RVConstants.FILE_APP_CONFIG)) == null)) {
                                TMSWidgetEngine tMSWidgetEngine = this.this$0;
                                TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance = this.this$1;
                                try {
                                    byte[] bytes = Y2.getBytes();
                                    ckf.d(bytes);
                                    jSONObject = JSON.parseObject(new String(bytes, uj3.UTF_8));
                                    ckf.f(jSONObject, "{\n                      …                        }");
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    jSONObject = new JSONObject();
                                }
                                if (!q9s.T2()) {
                                    Boolean bool = jSONObject.getBoolean("useLayoutNG");
                                    Boolean bool2 = Boolean.TRUE;
                                    if (!ckf.b(bool, bool2) && !ckf.b(jSONObject.getBoolean("enableLayoutNG"), bool2)) {
                                        z = false;
                                        TMSWidgetEngine.l(tMSWidgetEngine, z);
                                        TMSWidgetEngine.WidgetRenderInstance.s(widgetRenderInstance, jSONObject);
                                        xhv xhvVar = xhv.INSTANCE;
                                    }
                                }
                                z = true;
                                TMSWidgetEngine.l(tMSWidgetEngine, z);
                                TMSWidgetEngine.WidgetRenderInstance.s(widgetRenderInstance, jSONObject);
                                xhv xhvVar2 = xhv.INSTANCE;
                            }
                            TMSWidgetEngine.WidgetRenderInstance.l(this.this$1).S().a("enableLayoutNG", String.valueOf(TMSWidgetEngine.c(this.this$0)));
                            TMSWidgetEngine.WidgetRenderInstance.l(this.this$1).S().a("widgetSceneId", TMSInstanceExtKt.l(TMSWidgetEngine.WidgetRenderInstance.l(this.this$1)));
                            TMSWidgetEngine.WidgetRenderInstance.l(this.this$1).S().a("widgetSellerId", TMSInstanceExtKt.p(TMSWidgetEngine.WidgetRenderInstance.l(this.this$1)));
                            TMSWidgetEngine.WidgetRenderInstance.l(this.this$1).S().a("frameworkVersion", this.this$0.v());
                            mgg S = TMSWidgetEngine.WidgetRenderInstance.l(this.this$1).S();
                            StartParams startParams = (StartParams) TMSWidgetEngine.WidgetRenderInstance.l(this.this$1).g(StartParams.class);
                            if (startParams == null || !(startParams instanceof WidgetStartParams)) {
                                startParams = null;
                            }
                            WidgetStartParams widgetStartParams = (WidgetStartParams) startParams;
                            if (widgetStartParams != null && widgetStartParams.getHasValidWidgetInfo()) {
                                z2 = true;
                            }
                            S.a("hitAggregatedWidgetInfo", String.valueOf(z2));
                            WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
                            WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
                            TMSWidgetEngine tMSWidgetEngine2 = this.this$0;
                            TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance2 = this.this$1;
                            HashMap<String, String> b = weexUnicornConfig.b();
                            ckf.f(b, "this.engineParams");
                            b.put("wx_use_layoutng", String.valueOf(TMSWidgetEngine.c(tMSWidgetEngine2)));
                            if (q9s.M2()) {
                                weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
                            }
                            weexUnicornConfig.k(TMSWidgetEngine.WidgetRenderInstance.m(widgetRenderInstance2));
                            xhv xhvVar3 = xhv.INSTANCE;
                            weexInstanceConfig.s(weexUnicornConfig);
                            JSONObject jSONObject2 = new JSONObject();
                            TMSWidgetEngine tMSWidgetEngine3 = this.this$0;
                            TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance3 = this.this$1;
                            JSONObject jSONObject3 = new JSONObject();
                            WeexInstance h2 = TMSWidgetEngine.h(tMSWidgetEngine3);
                            ckf.d(h2);
                            jSONObject3.put((JSONObject) "contextId", (String) Integer.valueOf(h2.getInstanceId()));
                            JSONObject jSONObject4 = new JSONObject();
                            String e = TMSWidgetEngine.e(tMSWidgetEngine3);
                            String str2 = "";
                            if (e == null) {
                                e = str2;
                            }
                            jSONObject4.put((JSONObject) "__WIDGET_API_CONFIG__", e);
                            String f = TMSWidgetEngine.f(tMSWidgetEngine3);
                            if (f != null) {
                                str2 = f;
                            }
                            jSONObject4.put((JSONObject) "__WIDGET_EVENT_CONFIG__", str2);
                            bfs bfsVar = bfs.INSTANCE;
                            jSONObject4.put((JSONObject) "__widgetEnvironment", bfsVar.b(TMSWidgetEngine.WidgetRenderInstance.l(widgetRenderInstance3)));
                            TMSMetaInfoWrapper U = TMSWidgetEngine.WidgetRenderInstance.l(widgetRenderInstance3).U();
                            String str3 = "{}";
                            if (!(U == null || (x = U.x()) == null || (jSONString = x.toJSONString()) == null)) {
                                str3 = jSONString;
                            }
                            jSONObject4.put((JSONObject) "__appInfo", str3);
                            jSONObject4.put((JSONObject) "container", o9s.h(widgetRenderInstance3.F()) ? "debug" : "release");
                            Boolean bool3 = Boolean.TRUE;
                            jSONObject4.put((JSONObject) "cluster", (String) bool3);
                            jSONObject3.put((JSONObject) "options", (String) jSONObject4);
                            jSONObject3.put((JSONObject) "label", "canal");
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put((JSONObject) "widgetId", TMSWidgetEngine.WidgetRenderInstance.l(widgetRenderInstance3).L());
                            jSONObject5.put((JSONObject) "version", r8s.i(TMSWidgetEngine.WidgetRenderInstance.l(widgetRenderInstance3)));
                            StartParams startParams2 = (StartParams) TMSWidgetEngine.WidgetRenderInstance.l(widgetRenderInstance3).g(StartParams.class);
                            if (startParams2 == null || !(startParams2 instanceof WidgetStartParams)) {
                                startParams2 = null;
                            }
                            WidgetStartParams widgetStartParams2 = (WidgetStartParams) startParams2;
                            jSONObject5.put((JSONObject) "sceneParams", widgetStartParams2 == null ? null : widgetStartParams2.getSceneParams());
                            jSONObject3.put((JSONObject) "debugInfo", (String) jSONObject5);
                            jSONObject2.put((JSONObject) "canal_config", (String) jSONObject3);
                            String p = ckf.p("https://taobao.widget.com/", TMSWidgetEngine.WidgetRenderInstance.l(this.this$1).L());
                            if (this.this$1.G() == null || TMSWidgetEngine.WidgetRenderInstance.k(this.this$1) == null) {
                                str = "canal";
                                weexInstance = d6xVar.createChildInstance(this.this$1.F(), p, jSONObject2, weexInstanceConfig);
                            } else {
                                str = "canal";
                                weexInstance = d6xVar.createChildInstance(this.this$1.F(), p, jSONObject2, weexInstanceConfig, TMSWidgetEngine.WidgetRenderInstance.k(this.this$1), this.this$1.G().intValue());
                            }
                            weexInstance.setExceptionArg("sceneId", TMSInstanceExtKt.l(TMSWidgetEngine.WidgetRenderInstance.l(this.this$1)));
                            weexInstance.setExceptionArg("sellerId", TMSInstanceExtKt.p(TMSWidgetEngine.WidgetRenderInstance.l(this.this$1)));
                            StartParams startParams3 = (StartParams) TMSWidgetEngine.WidgetRenderInstance.l(this.this$1).g(StartParams.class);
                            if (startParams3 == null || !(startParams3 instanceof WidgetStartParams)) {
                                startParams3 = null;
                            }
                            WidgetStartParams widgetStartParams3 = (WidgetStartParams) startParams3;
                            if (!(widgetStartParams3 == null || (sceneParamObject = widgetStartParams3.getSceneParamObject()) == null || (string = sceneParamObject.getString("shopId")) == null)) {
                                weexInstance.setExceptionArg("shopId", string);
                            }
                            weexInstance.setTag("tmsWidget", bool3);
                            StartParams startParams4 = (StartParams) TMSWidgetEngine.WidgetRenderInstance.l(this.this$1).g(StartParams.class);
                            if (startParams4 == null || !(startParams4 instanceof WidgetStartParams)) {
                                startParams4 = null;
                            }
                            WidgetStartParams widgetStartParams4 = (WidgetStartParams) startParams4;
                            weexInstance.setTag("widgetInitMuted", widgetStartParams4 == null ? "false" : Boolean.valueOf(widgetStartParams4.getMuted()));
                            TMSWidgetEngine.WidgetRenderInstance.v(this.this$1, weexInstance.getRootView());
                            ViewGroup j = TMSWidgetEngine.WidgetRenderInstance.j(this.this$1);
                            if (j != null) {
                                j.addView(TMSWidgetEngine.WidgetRenderInstance.i(this.this$1));
                            }
                            weexInstance.registerModule(str, TMSWidgetAPIBridge.class);
                            weexInstance.addInstanceListener(new a(this.this$1, this.this$0));
                            ITMSPage topPage = TMSWidgetEngine.WidgetRenderInstance.l(this.this$1).W().getTopPage();
                            ckf.d(topPage);
                            cfs.d(weexInstance, topPage);
                            TMSWidgetEngine.WidgetRenderInstance.x(this.this$1, new WeakReference(weexInstance));
                            weexInstance.initWithEmpty();
                            if (TMSWidgetEngine.WidgetRenderInstance.d(this.this$1) == null) {
                                TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance4 = this.this$1;
                                ekd ekdVar2 = (ekd) TMSWidgetEngine.WidgetRenderInstance.l(widgetRenderInstance4).getExtension(ekd.class);
                                byte[] bytes2 = (ekdVar2 == null || (Y = ekdVar2.Y("widget.worker.v20.wlm")) == null) ? null : Y.getBytes();
                                if (bytes2 == null) {
                                    ocs H = this.this$1.H();
                                    if (H != null) {
                                        H.b("TMS_ERR_WIDGET_JS_BUNDLE", "js bundle is empty");
                                        return;
                                    }
                                    return;
                                }
                                TMSWidgetEngine.WidgetRenderInstance.q(widgetRenderInstance4, bytes2);
                            }
                            ((a6x) weexInstance.getExtend(a6x.class)).createAppContext();
                            byte[] bytes3 = bfsVar.c(TMSWidgetEngine.WidgetRenderInstance.l(this.this$1)).getBytes(uj3.UTF_8);
                            ckf.f(bytes3, "this as java.lang.String).getBytes(charset)");
                            weexInstance.execute(bytes3, ckf.p(p, "/env.js"));
                            String p2 = ckf.p(p, "/widget.worker.v20.wlm");
                            if (q9s.c2()) {
                                TMSMetaInfoWrapper U2 = TMSWidgetEngine.WidgetRenderInstance.l(this.this$1).U();
                                d6xVar.registerSourceMapURL(p2, v51.a(U2 == null ? null : U2.c(), "widget.worker.js.map"));
                            }
                            if (TMSWidgetEngine.WidgetRenderInstance.a(this.this$1)) {
                                TMSWidgetEngine.WidgetRenderInstance.w(this.this$1, true);
                                return;
                            }
                            weexInstance.execute(TMSWidgetEngine.WidgetRenderInstance.d(this.this$1), p2);
                            TMSWidgetEngine.WidgetRenderInstance.q(this.this$1, null);
                            TMSWidgetEngine.WidgetRenderInstance.u(this.this$1, true);
                            TMSWidgetEngine.WidgetRenderInstance.c(this.this$1, "onAppShow");
                            if (TMSWidgetEngine.WidgetRenderInstance.l(this.this$1).e("hasViewAppear")) {
                                TMSWidgetEngine.WidgetRenderInstance.c(this.this$1, h9z.EVENT_ON_APPEAR);
                                TMSWidgetEngine.WidgetRenderInstance.r(this.this$1, true);
                            }
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        CommonExtKt.o(new AnonymousClass1(TMSWidgetEngine.this, this));
                    }
                }
            });
        }

        public final Activity F() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
            }
            return this.f13817a;
        }

        public final Integer G() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("40ae7961", new Object[]{this});
            }
            return this.d;
        }

        public final ocs H() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ocs) ipChange.ipc$dispatch("13808c0d", new Object[]{this});
            }
            return this.f;
        }

        public final void I() {
            WeexInstance weexInstance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
                return;
            }
            this.b.j0();
            WeakReference<WeexInstance> weakReference = this.g;
            if (!(weakReference == null || (weexInstance = weakReference.get()) == null)) {
                weexInstance.onActivityPause();
            }
            E("onAppHide");
        }

        public final void J() {
            WeexInstance weexInstance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
                return;
            }
            this.b.q0();
            WeakReference<WeexInstance> weakReference = this.g;
            if (!(weakReference == null || (weexInstance = weakReference.get()) == null)) {
                weexInstance.onActivityResume();
            }
            E("onAppShow");
        }

        public final void M(ViewGroup viewGroup) {
            Executor executor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a72705c", new Object[]{this, viewGroup});
                return;
            }
            this.l = viewGroup;
            String c = ies.c(this.b.e0(), "jsbundle");
            if (c == null || wsq.a0(c)) {
                C();
                return;
            }
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.NETWORK)) != null) {
                executor.execute(new a(c));
            }
        }

        public final void O(d1a<xhv> d1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f2db474", new Object[]{this, d1aVar});
            } else {
                TMSWidgetEngine.this.J(new b(d1aVar));
            }
        }

        public final void R() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7306864c", new Object[]{this});
                return;
            }
            WeakReference<WeexInstance> weakReference = this.g;
            WeexInstance weexInstance = weakReference == null ? null : weakReference.get();
            if (weexInstance != null) {
                String h = this.b.S().h("packageStepStart");
                if (h != null) {
                    ((s5x) weexInstance.getExtend(s5x.class)).a("wxStartDownLoadBundle", Long.parseLong(h));
                }
                String h2 = this.b.S().h("packageStepFinish");
                if (h2 != null) {
                    ((s5x) weexInstance.getExtend(s5x.class)).a("wxEndDownLoadBundle", Long.parseLong(h2));
                }
            }
        }

        public final void y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
            } else {
                CommonExtKt.o(new TMSWidgetEngine$WidgetRenderInstance$attach$1(this));
            }
        }

        public final boolean z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("330fdce7", new Object[]{this})).booleanValue();
            }
            if (!q9s.L2()) {
                return false;
            }
            StartParams startParams = (StartParams) this.b.g(StartParams.class);
            if (startParams == null || !(startParams instanceof WidgetStartParams)) {
                startParams = null;
            }
            WidgetStartParams widgetStartParams = (WidgetStartParams) startParams;
            if (widgetStartParams != null && widgetStartParams.getLazyInit() && !widgetStartParams.getHasAttached() && !this.b.e("hasViewAppear")) {
                return true;
            }
            return false;
        }

        public final void L(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6ec8529", new Object[]{this, new Boolean(z)});
            } else if (this.h) {
                this.h = false;
                E("onDisappear");
                if (z) {
                    B();
                }
            }
        }

        public final void S(JSONObject jSONObject) {
            JSONObject jSONObject2;
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9402116", new Object[]{this, jSONObject});
            } else if (q9s.INSTANCE.K2() && jSONObject != null && (jSONObject2 = jSONObject.getJSONObject(pg1.ATOM_EXT_window)) != null && (string = jSONObject2.getString("backgroundColor")) != null) {
                try {
                    int parseColor = Color.parseColor(string);
                    ViewGroup viewGroup = this.l;
                    if (viewGroup != null) {
                        viewGroup.setBackgroundColor(parseColor);
                    }
                    this.o = true;
                } catch (Throwable th) {
                    TMSLogger.d(TMSWidgetEngine.TAG, th);
                }
            }
        }

        public final void D(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61b50a8f", new Object[]{this, str, obj});
                return;
            }
            WeakReference<WeexInstance> weakReference = this.g;
            String str2 = null;
            if ((weakReference == null ? null : weakReference.get()) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "data", (String) obj);
                jSONObject.put((JSONObject) "name", str);
                WeakReference<WeexInstance> weakReference2 = this.g;
                WeexInstance weexInstance = weakReference2 == null ? null : weakReference2.get();
                ckf.d(weexInstance);
                ((h6x) weexInstance.getExtend(h6x.class)).fireGlobalEvent("widget_native_config_event", jSONObject);
                ITMSPage iTMSPage = this.c;
                if (iTMSPage != null) {
                    str2 = ncs.c(iTMSPage);
                }
                if (str2 == null) {
                    str2 = ncs.d(this.b);
                }
                String d = mcs.d(str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "name", str);
                jSONObject2.put((JSONObject) "params", (String) obj);
                xhv xhvVar = xhv.INSTANCE;
                mcs.e(mcs.MODULE_NATIVE_EVENT, mcs.EVEN_ON_NEVENT_FIRE, str2, d, jSONObject2);
            }
        }

        public final void E(String str) {
            WeexInstance weexInstance;
            h6x h6xVar;
            WeexInstance weexInstance2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d729757", new Object[]{this, str});
            } else if (this.p) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "data", str);
                WeakReference<WeexInstance> weakReference = this.g;
                String str2 = null;
                jSONObject.put((JSONObject) "insId", (String) ((weakReference == null || (weexInstance2 = weakReference.get()) == null) ? null : Integer.valueOf(weexInstance2.getInstanceId())));
                WeakReference<WeexInstance> weakReference2 = this.g;
                if (!(weakReference2 == null || (weexInstance = weakReference2.get()) == null || (h6xVar = (h6x) weexInstance.getExtend(h6x.class)) == null)) {
                    h6xVar.fireGlobalEvent("widget_lifecycle_event", jSONObject);
                }
                ITMSPage iTMSPage = this.c;
                if (iTMSPage != null) {
                    str2 = ncs.c(iTMSPage);
                }
                if (str2 == null) {
                    str2 = ncs.d(this.b);
                }
                String d = mcs.d(str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "name", str);
                xhv xhvVar = xhv.INSTANCE;
                mcs.e(mcs.MODULE_NATIVE_EVENT, mcs.EVEN_ON_NEVENT_FIRE, str2, d, jSONObject2);
            }
        }

        public final void K() {
            WeexInstance weexInstance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("321cdedb", new Object[]{this});
            } else if (!this.h) {
                if (this.q) {
                    WeakReference<WeexInstance> weakReference = this.g;
                    if (!(weakReference == null || (weexInstance = weakReference.get()) == null)) {
                        weexInstance.execute(this.i, "https://taobao.widget.com/widget.worker.v20.wlm");
                    }
                    this.i = null;
                    this.p = true;
                    E("onAppShow");
                    this.q = false;
                }
                this.h = true;
                E(h9z.EVENT_ON_APPEAR);
                y();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0051 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:16:0x0038, B:18:0x003e, B:29:0x0051, B:33:0x007c, B:35:0x0084, B:37:0x00b2, B:39:0x00bf, B:40:0x00cd, B:45:0x00f3), top: B:48:0x0038 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void Q() {
            /*
                Method dump skipped, instructions count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.widget.kernal.TMSWidgetEngine.WidgetRenderInstance.Q():void");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WidgetRenderInstance(Activity activity, bbs bbsVar, ITMSPage iTMSPage, Integer num, WeexInstance weexInstance, ocs ocsVar, int i, a07 a07Var) {
            this(r10, activity, bbsVar, (i & 4) != 0 ? null : iTMSPage, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : weexInstance, ocsVar);
            TMSWidgetEngine.this = r10;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(852492351);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a();

        void b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements ocs {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ yes.a f13822a;

        public c(yes.a aVar) {
            this.f13822a = aVar;
        }

        @Override // tb.ocs
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            } else {
                this.f13822a.a();
            }
        }

        @Override // tb.ocs
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("313409ce", new Object[]{this, str, str2});
                return;
            }
            yes.a aVar = this.f13822a;
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            aVar.b(str, str2);
        }

        @Override // tb.ocs
        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af48699b", new Object[]{this, str, str2});
            }
        }

        @Override // tb.ocs
        public void onRenderReady() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61f6bd5", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements bbs.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
            TMSWidgetEngine.this = r1;
        }

        @Override // tb.bbs.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            }
        }

        @Override // tb.bbs.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a16c1d38", new Object[]{this});
            } else {
                TMSWidgetEngine.k(TMSWidgetEngine.this);
            }
        }

        @Override // tb.bbs.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4667d5a", new Object[]{this});
            }
        }

        @Override // tb.bbs.c
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f93d9f99", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public e(String str, String str2, String str3, String str4) {
            TMSWidgetEngine.this = r1;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TMSWidgetEngine.A(TMSWidgetEngine.this, true, null, this.b, this.c, this.d, this.e, 2, null);
            }
        }
    }

    static {
        t2o.a(852492350);
        t2o.a(982515791);
    }

    public TMSWidgetEngine(Context context, yes.a aVar) {
        ckf.g(context, "context");
        this.f13816a = context;
        this.b = aVar;
        this.d = new bbs();
        this.e = new HashMap<>();
        this.h = new LinkedList<>();
    }

    public static /* synthetic */ void A(TMSWidgetEngine tMSWidgetEngine, boolean z, b bVar, String str, String str2, String str3, String str4, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f490abb", new Object[]{tMSWidgetEngine, new Boolean(z), bVar, str, str2, str3, str4, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            bVar = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        tMSWidgetEngine.z(z, bVar, str, str2, str3, str4);
    }

    public static final /* synthetic */ byte[] a(TMSWidgetEngine tMSWidgetEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfdaa66c", new Object[]{tMSWidgetEngine});
        }
        return tMSWidgetEngine.t();
    }

    public static final /* synthetic */ String b(TMSWidgetEngine tMSWidgetEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcc2a128", new Object[]{tMSWidgetEngine});
        }
        return tMSWidgetEngine.q;
    }

    public static final /* synthetic */ boolean c(TMSWidgetEngine tMSWidgetEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caaf7cef", new Object[]{tMSWidgetEngine})).booleanValue();
        }
        return tMSWidgetEngine.o;
    }

    public static final /* synthetic */ b d(TMSWidgetEngine tMSWidgetEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("797a2537", new Object[]{tMSWidgetEngine});
        }
        return tMSWidgetEngine.p;
    }

    public static final /* synthetic */ String e(TMSWidgetEngine tMSWidgetEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2b7701e", new Object[]{tMSWidgetEngine});
        }
        return tMSWidgetEngine.i;
    }

    public static final /* synthetic */ String f(TMSWidgetEngine tMSWidgetEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("329f3e5e", new Object[]{tMSWidgetEngine});
        }
        return tMSWidgetEngine.j;
    }

    public static final /* synthetic */ bbs g(TMSWidgetEngine tMSWidgetEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("ec74c7a7", new Object[]{tMSWidgetEngine});
        }
        return tMSWidgetEngine.d;
    }

    public static final /* synthetic */ WeexInstance h(TMSWidgetEngine tMSWidgetEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("fb73a56", new Object[]{tMSWidgetEngine});
        }
        return tMSWidgetEngine.c;
    }

    public static final /* synthetic */ boolean i(TMSWidgetEngine tMSWidgetEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b7b40d2", new Object[]{tMSWidgetEngine})).booleanValue();
        }
        return tMSWidgetEngine.k;
    }

    public static final /* synthetic */ LinkedList j(TMSWidgetEngine tMSWidgetEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("a7be497d", new Object[]{tMSWidgetEngine});
        }
        return tMSWidgetEngine.h;
    }

    public static final /* synthetic */ void k(TMSWidgetEngine tMSWidgetEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("623f1555", new Object[]{tMSWidgetEngine});
        } else {
            tMSWidgetEngine.C();
        }
    }

    public static final /* synthetic */ void l(TMSWidgetEngine tMSWidgetEngine, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcfa755", new Object[]{tMSWidgetEngine, new Boolean(z)});
        } else {
            tMSWidgetEngine.o = z;
        }
    }

    public static final /* synthetic */ void m(TMSWidgetEngine tMSWidgetEngine, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fe47d5", new Object[]{tMSWidgetEngine, new Boolean(z)});
        } else {
            tMSWidgetEngine.f = z;
        }
    }

    public static final /* synthetic */ void n(TMSWidgetEngine tMSWidgetEngine, WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848bb588", new Object[]{tMSWidgetEngine, weexInstance});
        } else {
            tMSWidgetEngine.c = weexInstance;
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
            return;
        }
        try {
            this.i = JSON.parse(ias.h("widget_api.json", this.f13816a)).toString();
            this.j = JSON.parse(ias.h("widget_event.json", this.f13816a)).toString();
        } catch (Exception e2) {
            TMSLogger.c(TAG, "", e2);
        }
    }

    public final void C() {
        byte[] bArr;
        byte[] bArr2;
        c7o o0;
        c7o o02;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706ddc25", new Object[]{this});
        } else if (!this.f) {
            String str = this.l;
            byte[] bArr3 = null;
            if (str == null || wsq.a0(str)) {
                ekd ekdVar = (ekd) this.d.getExtension(ekd.class);
                bArr = (ekdVar == null || (o02 = ekdVar.o0("weex-vue.min.v20.wlm")) == null) ? null : o02.getBytes();
            } else {
                bArr = bfs.INSTANCE.d(this.l);
            }
            String str2 = this.m;
            if (str2 == null || wsq.a0(str2)) {
                ekd ekdVar2 = (ekd) this.d.getExtension(ekd.class);
                bArr2 = (ekdVar2 == null || (o0 = ekdVar2.o0("tb-widget.min.v20.wlm")) == null) ? null : o0.getBytes();
            } else {
                bArr2 = bfs.INSTANCE.d(this.m);
            }
            String str3 = this.n;
            if (str3 != null && !wsq.a0(str3)) {
                bArr3 = bfs.INSTANCE.d(this.n);
            }
            if (bArr == null || bArr2 == null) {
                yes.a aVar = this.b;
                if (aVar != null) {
                    aVar.b("TMS_ERROR_ENGINE_FAIL", "framework is empty");
                }
                b bVar = this.p;
                if (bVar != null) {
                    bVar.b();
                    return;
                }
                return;
            }
            CommonExtKt.o(new TMSWidgetEngine$initMainInstance$1(this, bArr, bArr2, bArr3));
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71da2fe", new Object[]{this});
            return;
        }
        this.r = true;
        if (this.e.isEmpty()) {
            q();
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        for (Map.Entry<String, WidgetRenderInstance> entry : this.e.entrySet()) {
            entry.getValue().I();
        }
    }

    @Override // tb.j6x
    public void E1(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
        }
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        for (Map.Entry<String, WidgetRenderInstance> entry : this.e.entrySet()) {
            entry.getValue().J();
        }
    }

    public final void G(String str, String str2, String str3, String str4) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1d67642", new Object[]{this, str, str2, str3, str4});
            return;
        }
        TMSLogger.b(TAG, "reInit");
        q();
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
            executor.execute(new e(str, str2, str3, str4));
        }
    }

    public final void H(WidgetRenderInstance widgetRenderInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de808523", new Object[]{this, widgetRenderInstance});
            return;
        }
        ckf.g(widgetRenderInstance, "instance");
        String str = null;
        for (Map.Entry<String, WidgetRenderInstance> entry : this.e.entrySet()) {
            if (ckf.b(entry.getValue(), widgetRenderInstance)) {
                str = entry.getKey();
            }
        }
        if (str != null) {
            this.e.remove(str);
            widgetRenderInstance.A();
            if (!this.e.isEmpty()) {
                return;
            }
            if (this.r || q9s.INSTANCE.g()) {
                q();
            }
        }
    }

    @Override // tb.j6x
    public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
        }
    }

    public final void I(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e01fa0", new Object[]{this, new Integer(i)});
            return;
        }
        String str = null;
        WidgetRenderInstance widgetRenderInstance = null;
        for (Map.Entry<String, WidgetRenderInstance> entry : this.e.entrySet()) {
            Integer G = entry.getValue().G();
            if (G != null && G.intValue() == i) {
                widgetRenderInstance = entry.getValue();
                str = entry.getKey();
            }
        }
        if (str != null) {
            this.e.remove(str);
            WidgetRenderInstance widgetRenderInstance2 = widgetRenderInstance;
            if (widgetRenderInstance2 != null) {
                widgetRenderInstance2.A();
            }
            if (!this.e.isEmpty()) {
                return;
            }
            if (this.r || q9s.INSTANCE.g()) {
                q();
            }
        }
    }

    @Override // tb.j6x
    public void I1(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
        } else {
            this.k = true;
        }
    }

    public final void J(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c59546", new Object[]{this, runnable});
            return;
        }
        ckf.g(runnable, "r");
        if (this.f) {
            runnable.run();
        } else {
            this.h.add(runnable);
        }
    }

    public final void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc4c5f58", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    @Override // tb.j6x
    public void K0(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
        }
    }

    @Override // tb.j6x
    public void K1(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
        }
    }

    public final void L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea89b11", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    @Override // tb.j6x
    public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // tb.j6x
    public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // tb.j6x
    public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    public final WidgetRenderInstance o(Activity activity, bbs bbsVar, ITMSPage iTMSPage, ocs ocsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetRenderInstance) ipChange.ipc$dispatch("5449d5ca", new Object[]{this, activity, bbsVar, iTMSPage, ocsVar});
        }
        ckf.g(activity, "activity");
        ckf.g(bbsVar, "childInstance");
        WidgetRenderInstance widgetRenderInstance = new WidgetRenderInstance(activity, bbsVar, iTMSPage, null, null, ocsVar, 24, null);
        HashMap<String, WidgetRenderInstance> hashMap = this.e;
        String str = bbsVar.g;
        ckf.f(str, "childInstance.mInstanceId");
        hashMap.put(str, widgetRenderInstance);
        return widgetRenderInstance;
    }

    public final void r(String str) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c673b800", new Object[]{this, str});
            return;
        }
        ckf.g(str, "viewId");
        WidgetRenderInstance widgetRenderInstance = this.e.get(str);
        if (widgetRenderInstance == null) {
            xhvVar = null;
        } else {
            widgetRenderInstance.K();
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            TMSLogger.f("TMSWidget", ckf.p(str, " has not CreateInstance"));
        }
    }

    public final byte[] t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("94497214", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "userAgent", CommonExtKt.i());
        byte[] bytes = ckf.p(ias.h("widget_qjs.js", this.f13816a) + ";var navigator=" + ((Object) jSONObject.toJSONString()) + ";var __navigator=" + ((Object) jSONObject.toJSONString()) + ';', "var __publicObject=['atob', 'btoa', 'navigator']").getBytes(uj3.UTF_8);
        ckf.f(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public final Context u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f13816a;
    }

    public final String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1e54489", new Object[]{this});
        }
        TMSMetaInfoWrapper P = this.d.P();
        if (P == null) {
            return null;
        }
        return P.l();
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76e664f4", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a46628b3", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public final int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76f5203e", new Object[]{this})).intValue();
        }
        return this.e.size();
    }

    @Override // tb.j6x
    public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
        }
    }

    public final void s(String str) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1be621a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "viewId");
        WidgetRenderInstance widgetRenderInstance = this.e.get(str);
        if (widgetRenderInstance == null) {
            xhvVar = null;
        } else {
            widgetRenderInstance.L(false);
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            TMSLogger.f("TMSWidget", ckf.p(str, " has not CreateInstance"));
        }
    }

    public final void z(boolean z, b bVar, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7daecc13", new Object[]{this, new Boolean(z), bVar, str, str2, str3, str4});
        } else if (!this.f && !this.g) {
            if (this.d.g0()) {
                this.d = new bbs();
            }
            MUSEngine.registerPlatformView("widget-video", IntegrationVideoPlatformView.class);
            this.g = true;
            this.o = z;
            this.l = str;
            this.m = str2;
            this.n = str3;
            this.q = str4;
            this.p = bVar;
            B();
            this.d.u0(new WidgetFrameworkSolution(this.d));
            this.d.z0(new d());
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f = false;
        this.g = false;
        this.r = true;
        TMSLogger.b(TAG, "onDestroy");
        CommonExtKt.o(new TMSWidgetEngine$destroy$1(this));
        this.h.clear();
        for (Map.Entry<String, WidgetRenderInstance> entry : this.e.entrySet()) {
            entry.getValue().A();
        }
        this.e.clear();
    }

    public /* synthetic */ TMSWidgetEngine(Context context, yes.a aVar, int i, a07 a07Var) {
        this(context, (i & 2) != 0 ? null : aVar);
    }

    public final WidgetRenderInstance p(Activity activity, WeexInstance weexInstance, int i, WidgetStartParams widgetStartParams, bbs bbsVar, yes.a aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetRenderInstance) ipChange.ipc$dispatch("95edd047", new Object[]{this, activity, weexInstance, new Integer(i), widgetStartParams, bbsVar, aVar});
        }
        ckf.g(activity, "activity");
        ckf.g(weexInstance, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(widgetStartParams, RVConstants.EXTRA_START_PARAMS);
        ckf.g(bbsVar, "childInstance");
        ckf.g(aVar, "renderListener");
        WidgetRenderInstance widgetRenderInstance = new WidgetRenderInstance(activity, bbsVar, null, Integer.valueOf(i), weexInstance, new c(aVar), 4, null);
        TMSLogger.f("TMSWidget", ckf.p(widgetStartParams.getViewId(), " createInstance"));
        String viewId = widgetStartParams.getViewId();
        if (viewId == null || wsq.a0(viewId)) {
            str = String.valueOf(i);
        } else {
            str = widgetStartParams.getViewId();
            ckf.d(str);
        }
        this.e.put(str, widgetRenderInstance);
        return widgetRenderInstance;
    }
}
