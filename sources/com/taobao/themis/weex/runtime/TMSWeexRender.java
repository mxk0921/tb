package com.taobao.themis.weex.runtime;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.external.embed.Weex2StartParams;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.adapter.IWeexAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.kernel.utils.TMSAssertUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import org.android.agoo.common.AgooConstants;
import tb.a07;
import tb.ah0;
import tb.arf;
import tb.b6x;
import tb.bbs;
import tb.ckf;
import tb.cqc;
import tb.d9s;
import tb.gld;
import tb.h8s;
import tb.h8x;
import tb.ies;
import tb.j3x;
import tb.j6x;
import tb.mab;
import tb.mcs;
import tb.mgg;
import tb.mop;
import tb.n9s;
import tb.ncs;
import tb.njg;
import tb.o7x;
import tb.o9s;
import tb.ocs;
import tb.p8s;
import tb.pcs;
import tb.pg1;
import tb.pgd;
import tb.q9s;
import tb.qml;
import tb.rce;
import tb.rrb;
import tb.s5x;
import tb.t2o;
import tb.t5x;
import tb.tll;
import tb.uj3;
import tb.w5d;
import tb.wes;
import tb.x9b;
import tb.xcs;
import tb.ygv;
import tb.z7x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWeexRender extends d9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public WeexInstance e;
    public String f;
    public final njg g = kotlin.a.b(new TMSWeexRender$mActivity$2(this));
    public final njg h = kotlin.a.b(new TMSWeexRender$mRootView$2(this));
    public final String i = "TMSWeexRender";
    public JSONObject j;
    public final c k;
    public b6x.a l;
    public final boolean m;
    public final boolean n;
    public final AtomicBoolean o;
    public final List<String> p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(851443724);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements j6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ITMSPage b;

        public c(ITMSPage iTMSPage) {
            this.b = iTMSPage;
        }

        @Override // tb.j6x
        public void E1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            ckf.g(weexInstance, "instance");
            TMSWeexRender.v1(TMSWeexRender.this).onRenderReady();
        }

        @Override // tb.j6x
        public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            ckf.g(weexInstance, "instance");
            ckf.g(str, "errorMsg");
            if (weexErrorType != null) {
                TMSWeexRender.v1(TMSWeexRender.this).b(ckf.p("TMS_ERR_WEEX_", weexErrorType.name()), str);
            }
            if (this.b.getInstance().O() != TMSContainerType.EMBEDDED) {
                TMSWeexRender.r1(TMSWeexRender.this);
            }
        }

        @Override // tb.j6x
        public void I1(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
            } else {
                ckf.g(weexInstance, "instance");
            }
        }

        @Override // tb.j6x
        public void K0(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            } else {
                ckf.g(weexInstance, "instance");
            }
        }

        @Override // tb.j6x
        public void K1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            ckf.g(weexInstance, "instance");
            TMSWeexRender.v1(TMSWeexRender.this).a();
        }

        @Override // tb.j6x
        public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
                return;
            }
            ckf.g(weexInstance, "instance");
            ckf.g(weexErrorType, "type");
            ckf.g(str, "errorMsg");
        }

        @Override // tb.j6x
        public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
                return;
            }
            ckf.g(weexInstance, "instance");
            ckf.g(weexErrorType, "type");
            ckf.g(str, "errorMsg");
        }

        @Override // tb.j6x
        public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
                return;
            }
            ckf.g(weexInstance, "instance");
            ckf.g(weexErrorType, "type");
            ckf.g(str, "errorMsg");
        }

        @Override // tb.j6x
        public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            ckf.g(weexInstance, "instance");
            if (weexErrorType != null) {
                TMSWeexRender.v1(TMSWeexRender.this).b(ckf.p("TMS_ERR_WEEX_", weexErrorType.name()), str);
            }
            if (this.b.getInstance().O() != TMSContainerType.EMBEDDED) {
                TMSWeexRender.r1(TMSWeexRender.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements cqc.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ cqc b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TMSWeexRender f13800a;

            public a(TMSWeexRender tMSWeexRender) {
                this.f13800a = tMSWeexRender;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TMSWeexRender.q1(this.f13800a);
                }
            }
        }

        public d(cqc cqcVar) {
            this.b = cqcVar;
        }

        @Override // tb.cqc.c
        public void a(ygv ygvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d8000ea", new Object[]{this, ygvVar});
                return;
            }
            ckf.g(ygvVar, "loadInfo");
            if (TMSWeexRender.u1(TMSWeexRender.this) == null || TMSWeexRender.t1(TMSWeexRender.this) == null) {
                this.b.invalid();
                return;
            }
            mcs.e(mcs.MODULE_LAUNCH_PAGE, "ON_FINISH_MAINDOCUMENT_EXTENSION", ncs.d(TMSWeexRender.t1(TMSWeexRender.this)), ncs.c(TMSWeexRender.u1(TMSWeexRender.this)), new JSONObject());
            if (ygvVar.a() != null) {
                WeexInstance H1 = TMSWeexRender.this.H1();
                ckf.d(H1);
                H1.initWithData(ygvVar.a(), TMSWeexRender.w1(TMSWeexRender.this));
            } else {
                WeexInstance H12 = TMSWeexRender.this.H1();
                ckf.d(H12);
                H12.initWithURL(TMSWeexRender.w1(TMSWeexRender.this));
            }
            CommonExtKt.n(new a(TMSWeexRender.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements rce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.rce
        public void a(rce.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b995c1ec", new Object[]{this, aVar});
                return;
            }
            try {
                pgd pgdVar = (pgd) TMSWeexRender.u1(TMSWeexRender.this).getExtension(pgd.class);
                Object obj = null;
                Object B0 = pgdVar == null ? null : pgdVar.B0();
                if (pgdVar != null) {
                    obj = pgdVar.q0();
                }
                if (pgdVar != null && B0 != null && obj != null) {
                    pgdVar.G0();
                    if (aVar != null) {
                        ((j3x.b) aVar).a(B0, obj);
                    }
                }
            } catch (Exception e) {
                TMSLogger.b(TMSWeexRender.x1(TMSWeexRender.this), ckf.p("rum report error ", e.getMessage()));
            }
        }

        @Override // tb.rce
        public void onEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efc72903", new Object[]{this});
                return;
            }
            pgd pgdVar = (pgd) TMSWeexRender.u1(TMSWeexRender.this).getExtension(pgd.class);
            if (pgdVar != null) {
                pgdVar.G0();
            }
        }
    }

    static {
        t2o.a(851443723);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
        if (r6 != false) goto L_0x00c4;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TMSWeexRender(com.taobao.themis.kernel.page.ITMSPage r6, tb.ocs r7) {
        /*
            r5 = this;
            java.lang.String r0 = "page"
            tb.ckf.g(r6, r0)
            java.lang.String r0 = "renderListener"
            tb.ckf.g(r7, r0)
            r5.<init>(r6, r7)
            java.lang.String r7 = r6.c()
            r5.f = r7
            com.taobao.themis.weex.runtime.TMSWeexRender$mActivity$2 r7 = new com.taobao.themis.weex.runtime.TMSWeexRender$mActivity$2
            r7.<init>(r5)
            tb.njg r7 = kotlin.a.b(r7)
            r5.g = r7
            com.taobao.themis.weex.runtime.TMSWeexRender$mRootView$2 r7 = new com.taobao.themis.weex.runtime.TMSWeexRender$mRootView$2
            r7.<init>(r5)
            tb.njg r7 = kotlin.a.b(r7)
            r5.h = r7
            java.lang.String r7 = "TMSWeexRender"
            r5.i = r7
            tb.bbs r7 = r5.d
            java.lang.Class<com.taobao.themis.external.embed.StartParams> r0 = com.taobao.themis.external.embed.StartParams.class
            java.lang.Object r7 = r7.g(r0)
            com.taobao.themis.external.embed.StartParams r7 = (com.taobao.themis.external.embed.StartParams) r7
            r1 = 0
            if (r7 != 0) goto L_0x003d
            goto L_0x0042
        L_0x003d:
            boolean r2 = r7 instanceof com.taobao.themis.external.embed.Weex2StartParams
            if (r2 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r7 = r1
        L_0x0043:
            com.taobao.themis.external.embed.Weex2StartParams r7 = (com.taobao.themis.external.embed.Weex2StartParams) r7
            if (r7 != 0) goto L_0x0049
            r7 = r1
            goto L_0x004d
        L_0x0049:
            com.alibaba.fastjson.JSONObject r7 = r7.getInitData()
        L_0x004d:
            r5.j = r7
            com.taobao.themis.weex.runtime.TMSWeexRender$c r7 = new com.taobao.themis.weex.runtime.TMSWeexRender$c
            r7.<init>(r6)
            r5.k = r7
            boolean r7 = tb.q9s.J2()
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L_0x008e
            tb.bbs r7 = r5.d
            java.lang.Object r7 = r7.g(r0)
            com.taobao.themis.external.embed.StartParams r7 = (com.taobao.themis.external.embed.StartParams) r7
            if (r7 != 0) goto L_0x0069
            goto L_0x006e
        L_0x0069:
            boolean r4 = r7 instanceof com.taobao.themis.external.embed.Weex2StartParams
            if (r4 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r7 = r1
        L_0x006f:
            com.taobao.themis.external.embed.Weex2StartParams r7 = (com.taobao.themis.external.embed.Weex2StartParams) r7
            if (r7 != 0) goto L_0x0075
            r7 = r1
            goto L_0x007d
        L_0x0075:
            boolean r7 = r7.getAsyncCreate()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L_0x007d:
            if (r7 != 0) goto L_0x0086
            tb.bbs r7 = r5.d
            boolean r7 = com.taobao.themis.kernel.utils.TMSInstanceExtKt.e(r7)
            goto L_0x008a
        L_0x0086:
            boolean r7 = r7.booleanValue()
        L_0x008a:
            if (r7 == 0) goto L_0x008e
            r7 = 1
            goto L_0x008f
        L_0x008e:
            r7 = 0
        L_0x008f:
            r5.m = r7
            if (r7 == 0) goto L_0x00c3
            tb.bbs r7 = r5.d
            java.lang.Object r7 = r7.g(r0)
            com.taobao.themis.external.embed.StartParams r7 = (com.taobao.themis.external.embed.StartParams) r7
            if (r7 != 0) goto L_0x009e
            goto L_0x00a3
        L_0x009e:
            boolean r0 = r7 instanceof com.taobao.themis.external.embed.Weex2StartParams
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r7 = r1
        L_0x00a4:
            com.taobao.themis.external.embed.Weex2StartParams r7 = (com.taobao.themis.external.embed.Weex2StartParams) r7
            if (r7 != 0) goto L_0x00a9
            goto L_0x00b1
        L_0x00a9:
            boolean r7 = r7.getPreRender()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
        L_0x00b1:
            if (r1 != 0) goto L_0x00bc
            tb.ccs r6 = r6.getPageParams()
            boolean r6 = r6.o()
            goto L_0x00c0
        L_0x00bc:
            boolean r6 = r1.booleanValue()
        L_0x00c0:
            if (r6 == 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r2 = 0
        L_0x00c4:
            r5.n = r2
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean
            r6.<init>(r3)
            r5.o = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.p = r6
            r5.J1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.weex.runtime.TMSWeexRender.<init>(com.taobao.themis.kernel.page.ITMSPage, tb.ocs):void");
    }

    public static /* synthetic */ Object ipc$super(TMSWeexRender tMSWeexRender, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2088493082:
                super.onViewDisappear();
                return null;
            case -1983604863:
                super.destroy();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 392282426:
                super.X0((String) objArr[0], (JSON) objArr[1]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1073542112:
                super.onViewAppear();
                return null;
            case 1192889117:
                super.s();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/weex/runtime/TMSWeexRender");
        }
    }

    public static final /* synthetic */ void q1(TMSWeexRender tMSWeexRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24fc6d5", new Object[]{tMSWeexRender});
        } else {
            tMSWeexRender.D1();
        }
    }

    public static final /* synthetic */ void r1(TMSWeexRender tMSWeexRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e0a5c9", new Object[]{tMSWeexRender});
        } else {
            tMSWeexRender.E1();
        }
    }

    public static final /* synthetic */ Activity s1(TMSWeexRender tMSWeexRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("a238416e", new Object[]{tMSWeexRender});
        }
        return tMSWeexRender.F1();
    }

    public static final /* synthetic */ bbs t1(TMSWeexRender tMSWeexRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("2ceb7126", new Object[]{tMSWeexRender});
        }
        return tMSWeexRender.d;
    }

    public static final /* synthetic */ ITMSPage u1(TMSWeexRender tMSWeexRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("d08208fb", new Object[]{tMSWeexRender});
        }
        return tMSWeexRender.f17670a;
    }

    public static final /* synthetic */ ocs v1(TMSWeexRender tMSWeexRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ocs) ipChange.ipc$dispatch("51009553", new Object[]{tMSWeexRender});
        }
        return tMSWeexRender.b;
    }

    public static final /* synthetic */ String w1(TMSWeexRender tMSWeexRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ba25d7e", new Object[]{tMSWeexRender});
        }
        return tMSWeexRender.f;
    }

    public static final /* synthetic */ String x1(TMSWeexRender tMSWeexRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3da4a5dc", new Object[]{tMSWeexRender});
        }
        return tMSWeexRender.i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.d9s, tb.qcs
    public void D0(String str, String str2, JSON json) {
        WeexEventTarget weexEventTarget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b91c0a1", new Object[]{this, str, str2, json});
            return;
        }
        ckf.g(str, "target");
        ckf.g(str2, "event");
        switch (str.hashCode()) {
            case -787751952:
                if (str.equals(pg1.ATOM_EXT_window)) {
                    weexEventTarget = WeexEventTarget.WINDOW_TARGET;
                    break;
                }
                weexEventTarget = WeexEventTarget.WINDOW_TARGET;
                break;
            case 3029410:
                if (str.equals(AgooConstants.MESSAGE_BODY)) {
                    weexEventTarget = WeexEventTarget.BODY_TARGET;
                    break;
                }
                weexEventTarget = WeexEventTarget.WINDOW_TARGET;
                break;
            case 3645441:
                if (str.equals("weex")) {
                    weexEventTarget = WeexEventTarget.WEEX_TARGET;
                    break;
                }
                weexEventTarget = WeexEventTarget.WINDOW_TARGET;
                break;
            case 861720859:
                if (str.equals("document")) {
                    weexEventTarget = WeexEventTarget.DOCUMENT_TARGET;
                    break;
                }
                weexEventTarget = WeexEventTarget.WINDOW_TARGET;
                break;
            default:
                weexEventTarget = WeexEventTarget.WINDOW_TARGET;
                break;
        }
        if (!this.m || this.o.get()) {
            IpChange ipChange2 = TMSAssertUtils.$ipChange;
            WeexInstance weexInstance = this.e;
            if (weexInstance != null) {
                weexInstance.dispatchEvent(weexEventTarget, str2, com.taobao.android.weex.b.e().b((JSONObject) json));
                return;
            }
            return;
        }
        b6x.a aVar = this.l;
        ckf.d(aVar);
        aVar.dispatchEvent(weexEventTarget, str2, com.taobao.android.weex.b.e().b((JSONObject) json));
    }

    public final void D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7a0208", new Object[]{this});
        } else if (this.e != null) {
            y1();
            if (!this.n) {
                if (q9s.P1() || this.d.a0() == TMSSolutionType.UNIAPP) {
                    WeexInstance weexInstance = this.e;
                    ckf.d(weexInstance);
                    String d2 = n9s.d(this.f17670a);
                    Charset forName = Charset.forName("utf-8");
                    ckf.f(forName, "forName(charsetName)");
                    byte[] bytes = d2.getBytes(forName);
                    ckf.f(bytes, "this as java.lang.String).getBytes(charset)");
                    weexInstance.execute(bytes, "safeArea.js");
                }
                WeexInstance weexInstance2 = this.e;
                ckf.d(weexInstance2);
                String f = n9s.f(this.f17670a);
                Charset forName2 = Charset.forName("utf-8");
                ckf.f(forName2, "forName(charsetName)");
                byte[] bytes2 = f.getBytes(forName2);
                ckf.f(bytes2, "this as java.lang.String).getBytes(charset)");
                weexInstance2.execute(bytes2, "titleBarPos.js");
                WeexInstance weexInstance3 = this.e;
                ckf.d(weexInstance3);
                weexInstance3.render(WeexValueImpl.ofJSON(this.j));
            }
        }
    }

    public final void E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5467727c", new Object[]{this});
        } else if (this.f17670a.getPageContext() != null) {
            tll pageContext = this.f17670a.getPageContext();
            ckf.d(pageContext);
            if (pageContext.getCurrentActivity() != null) {
                if (q9s.D2()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("category", "com.taobao.intent.category.HYBRID_UI");
                    Boolean bool = Boolean.TRUE;
                    hashMap.put("skipPreProcessor", bool);
                    hashMap.put("disableTransition", bool);
                    hashMap.put("disallowLoopback", bool);
                    INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) p8s.b(INavigatorAdapter.class);
                    if (iNavigatorAdapter != null) {
                        tll pageContext2 = this.f17670a.getPageContext();
                        ckf.d(pageContext2);
                        Activity currentActivity = pageContext2.getCurrentActivity();
                        ckf.d(currentActivity);
                        iNavigatorAdapter.openURL(currentActivity, this.f, null, null, hashMap);
                    } else {
                        return;
                    }
                } else {
                    tll pageContext3 = this.f17670a.getPageContext();
                    ckf.d(pageContext3);
                    Nav.from(pageContext3.getCurrentActivity()).withCategory("com.taobao.intent.category.HYBRID_UI").skipPreprocess().disableTransition().disallowLoopback().toUri(this.f);
                }
                this.f17670a.getInstance().destroy();
            }
        }
    }

    public final Activity F1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("3806435b", new Object[]{this});
        }
        return (Activity) this.g.getValue();
    }

    public final FrameLayout G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("1c0f70b4", new Object[]{this});
        }
        return (FrameLayout) this.h.getValue();
    }

    public final WeexInstance H1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("7636b0e0", new Object[]{this});
        }
        return this.e;
    }

    public final void I1(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("507aed31", new Object[]{this, list});
            return;
        }
        for (String str : list) {
            switch (str.hashCode()) {
                case -1340212393:
                    if (!str.equals("onPause")) {
                        break;
                    } else {
                        onPause();
                        break;
                    }
                case -1336895037:
                    if (!str.equals("onStart")) {
                        break;
                    } else {
                        onStart();
                        break;
                    }
                case -1012956543:
                    if (!str.equals("onStop")) {
                        break;
                    } else {
                        onStop();
                        break;
                    }
                case -840036609:
                    if (!str.equals("onViewDisAppear")) {
                        break;
                    } else {
                        onViewDisappear();
                        break;
                    }
                case 959382489:
                    if (!str.equals("onViewAppear")) {
                        break;
                    } else {
                        onViewAppear();
                        break;
                    }
                case 1463983852:
                    if (!str.equals("onResume")) {
                        break;
                    } else {
                        onResume();
                        break;
                    }
            }
        }
    }

    public final void L1(wes.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23bfe9a", new Object[]{this, aVar});
        } else if (q9s.O1()) {
            pgd pgdVar = (pgd) this.f17670a.getExtension(pgd.class);
            if (pgdVar != null) {
                pgdVar.onViewAppear();
            }
            aVar.b().o(new e());
        }
    }

    @Override // tb.qcs
    public void P(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb823f9b", new Object[]{this, str, json});
        } else {
            ckf.g(str, "event");
        }
    }

    @Override // tb.d9s, tb.qcs
    public void X0(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1761c13a", new Object[]{this, str, json});
            return;
        }
        ckf.g(str, "event");
        super.X0(str, json);
        if (!this.m || this.o.get()) {
            IpChange ipChange2 = TMSAssertUtils.$ipChange;
            WeexInstance weexInstance = this.e;
            if (weexInstance != null) {
                weexInstance.dispatchEvent(WeexEventTarget.WINDOW_TARGET, str, com.taobao.android.weex.b.e().b((JSONObject) json));
                return;
            }
            return;
        }
        b6x.a aVar = this.l;
        ckf.d(aVar);
        aVar.dispatchEvent(WeexEventTarget.WINDOW_TARGET, str, com.taobao.android.weex.b.e().b((JSONObject) json));
    }

    @Override // tb.d9s, tb.qcs
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        WeexInstance weexInstance = this.e;
        if (weexInstance != null) {
            weexInstance.destroy();
        }
        b6x.a aVar = this.l;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // tb.qcs
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e88638d3", new Object[]{this});
        }
        return "Weex";
    }

    @Override // tb.qcs
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return G1();
    }

    @Override // tb.d9s, tb.qcs
    public void i0(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a50b91", new Object[]{this, str, obj});
            return;
        }
        WeexInstance weexInstance = this.e;
        if (weexInstance != null && ckf.b("tabBarHeight", str) && (obj instanceof Integer)) {
            z7x z7xVar = new z7x();
            z7xVar.e(((Number) obj).intValue());
            weexInstance.updateRenderEnvironments(z7xVar);
        }
    }

    @Override // tb.qcs
    public Bitmap l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ea6f4fbb", new Object[]{this});
        }
        return null;
    }

    @Override // tb.qcs
    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245d3ac6", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "script");
        if (!this.m || this.o.get()) {
            IpChange ipChange2 = TMSAssertUtils.$ipChange;
            WeexInstance weexInstance = this.e;
            if (weexInstance != null) {
                byte[] bytes = str.getBytes(uj3.UTF_8);
                ckf.f(bytes, "this as java.lang.String).getBytes(charset)");
                weexInstance.execute(bytes, str2);
                return;
            }
            return;
        }
        b6x.a aVar = this.l;
        ckf.d(aVar);
        byte[] bytes2 = str.getBytes(uj3.UTF_8);
        ckf.f(bytes2, "this as java.lang.String).getBytes(charset)");
        aVar.execute(bytes2, str2);
    }

    @Override // tb.d9s, tb.qcs
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        IpChange ipChange2 = TMSAssertUtils.$ipChange;
        WeexInstance weexInstance = this.e;
        if (weexInstance != null) {
            weexInstance.onActivityResult(i, i2, intent);
        }
    }

    @Override // tb.qcs
    public void r(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15684483", new Object[]{this, bArr, str});
            return;
        }
        ckf.g(bArr, "script");
        if (!this.m || this.o.get()) {
            IpChange ipChange2 = TMSAssertUtils.$ipChange;
            WeexInstance weexInstance = this.e;
            if (weexInstance != null) {
                weexInstance.execute(bArr, str);
                return;
            }
            return;
        }
        b6x.a aVar = this.l;
        ckf.d(aVar);
        aVar.execute(bArr, str);
    }

    public final void y1() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f6ab63", new Object[]{this});
            return;
        }
        TMSLogger.f(this.i, "addRenderView Start");
        if (this.e != null) {
            if (G1().getChildCount() > 0) {
                G1().removeAllViews();
            }
            String str = this.i;
            WeexInstance weexInstance = this.e;
            ckf.d(weexInstance);
            if (weexInstance.getRootView() == null) {
                z = true;
            }
            TMSLogger.f(str, ckf.p("addRenderView execute: rootView is ", Boolean.valueOf(z)));
            FrameLayout G1 = G1();
            WeexInstance weexInstance2 = this.e;
            ckf.d(weexInstance2);
            G1.addView(weexInstance2.getRootView());
            TMSLogger.f(this.i, "addRenderView end");
        }
    }

    public final void z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37bcf22d", new Object[]{this});
        } else if (q9s.A1() && !TextUtils.isEmpty(this.f)) {
            Uri g = ies.g(this.f);
            if (g.isHierarchical() && ckf.b(g.getQueryParameter("afc_tms_weex"), "true")) {
                String uri = g.buildUpon().appendQueryParameter("wh_weex", "true").appendQueryParameter(h8x.KEY_WEEX_MODE, "dom").build().toString();
                ckf.f(uri, "newUri.toString()");
                this.f = uri;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements w5d.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.w5d.c
        public int getPriority() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
            }
            return 9;
        }

        @Override // tb.w5d.c
        public boolean a(ITMSPage iTMSPage, TMSBackPressedType tMSBackPressedType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("89a4e043", new Object[]{this, iTMSPage, tMSBackPressedType})).booleanValue();
            }
            ckf.g(iTMSPage, "page");
            ckf.g(tMSBackPressedType, "type");
            if (TMSBackPressedType.ON_KEY_DOWN == tMSBackPressedType && TMSWeexRender.this.H1() != null) {
                WeexInstance H1 = TMSWeexRender.this.H1();
                ckf.d(H1);
                if (H1.canGoBack()) {
                    WeexInstance H12 = TMSWeexRender.this.H1();
                    ckf.d(H12);
                    H12.goBack();
                    return true;
                }
            }
            return false;
        }
    }

    public final void A1(WeexInstanceConfig weexInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1cdfcc3", new Object[]{this, weexInstanceConfig});
        } else if (q9s.M()) {
            try {
                if (this.d.getExtension(x9b.class) != null) {
                    weexInstanceConfig.n(true);
                }
            } catch (Throwable th) {
                TMSLogger.b(this.i, ckf.p("reportAfcData error ", th.getMessage()));
            }
        }
    }

    public final void B1(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72980dc4", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        StartParams startParams = (StartParams) this.d.g(StartParams.class);
        if (startParams == null || !(startParams instanceof Weex2StartParams)) {
            startParams = null;
        }
        wes.a d2 = wes.d(str, (Weex2StartParams) startParams, this.d.a0());
        d2.b().l(qml.a(this.f17670a));
        d2.b().p(true);
        L1(d2);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (q9s.L0()) {
            ITMSPage iTMSPage = this.f17670a;
            jSONObject2.put((JSONObject) "safeAreaTop", (String) Integer.valueOf(qml.u(iTMSPage)));
            jSONObject2.put((JSONObject) "safeAreaBottom", (String) Integer.valueOf(qml.r(iTMSPage)));
            jSONObject2.put((JSONObject) "safeAreaLeft", (String) Integer.valueOf(qml.s(iTMSPage)));
            jSONObject2.put((JSONObject) "safeAreaRight", (String) Integer.valueOf(qml.t(iTMSPage)));
            jSONObject2.put((JSONObject) "navBarHeight", (String) Integer.valueOf(qml.i(iTMSPage)));
            jSONObject2.put((JSONObject) "tabBarHeight", (String) Integer.valueOf(qml.w(iTMSPage)));
            jSONObject2.put((JSONObject) "statusBarHeight", (String) Integer.valueOf(xcs.f(context, xcs.d(context))));
            jSONObject.put((JSONObject) "render_param", (String) jSONObject2);
        }
        if (this.d.O() == TMSContainerType.EMBEDDED) {
            jSONObject.put((JSONObject) "container_type", "tms_embed");
        } else {
            jSONObject.put((JSONObject) "container_type", "tms_default");
        }
        A1(d2.b());
        this.e = com.taobao.android.weex.b.a(context, d2.a(), d2.c(), d2.d(), jSONObject, d2.b());
        gld m = CommonExtKt.m(this.f17670a.getInstance());
        if (m != null) {
            m.C("engineInitEnd");
        }
        WeexInstance weexInstance = this.e;
        ckf.d(weexInstance);
        weexInstance.addInstanceListener(this.k);
        String c2 = wes.c(this.d);
        IWeexAdapter iWeexAdapter = (IWeexAdapter) p8s.b(IWeexAdapter.class);
        if (iWeexAdapter != null) {
            c2 = iWeexAdapter.getUserAgent(c2);
        }
        WeexInstance weexInstance2 = this.e;
        ckf.d(weexInstance2);
        weexInstance2.updateInstanceEnv("userAgent", WeexValueImpl.ofString(c2));
        WeexInstance weexInstance3 = this.e;
        ckf.d(weexInstance3);
        weexInstance3.setTag("themis_page", this.f17670a);
        ITMSPage iTMSPage2 = this.f17670a;
        ITMSPage iTMSPage3 = this.f17670a;
        WeexInstance weexInstance4 = this.e;
        ckf.d(weexInstance4);
        iTMSPage2.x(new o7x(iTMSPage3, weexInstance4, this));
    }

    public final void C1(Application application, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2db8b01", new Object[]{this, application, str, new Integer(i), new Integer(i2)});
            return;
        }
        StartParams startParams = (StartParams) this.d.g(StartParams.class);
        b6x.a aVar = null;
        if (startParams == null || !(startParams instanceof Weex2StartParams)) {
            startParams = null;
        }
        wes.a d2 = wes.d(str, (Weex2StartParams) startParams, this.d.a0());
        d2.b().l(qml.a(this.f17670a));
        d2.b().p(true);
        L1(d2);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (q9s.L0()) {
            ITMSPage iTMSPage = this.f17670a;
            jSONObject2.put((JSONObject) "safeAreaTop", (String) Integer.valueOf(qml.u(iTMSPage)));
            jSONObject2.put((JSONObject) "safeAreaBottom", (String) Integer.valueOf(qml.r(iTMSPage)));
            jSONObject2.put((JSONObject) "safeAreaLeft", (String) Integer.valueOf(qml.s(iTMSPage)));
            jSONObject2.put((JSONObject) "safeAreaRight", (String) Integer.valueOf(qml.t(iTMSPage)));
            jSONObject2.put((JSONObject) "navBarHeight", (String) Integer.valueOf(qml.i(iTMSPage)));
            jSONObject2.put((JSONObject) "tabBarHeight", (String) Integer.valueOf(qml.w(iTMSPage)));
            jSONObject2.put((JSONObject) "statusBarHeight", (String) Integer.valueOf(xcs.f(application, xcs.d(application))));
            jSONObject.put((JSONObject) "render_param", (String) jSONObject2);
        }
        if (this.d.O() == TMSContainerType.EMBEDDED) {
            jSONObject.put((JSONObject) "container_type", "tms_embed");
        } else {
            jSONObject.put((JSONObject) "container_type", "tms_default");
        }
        A1(d2.b());
        t5x tag = com.taobao.android.weex.b.b(application, d2.a(), d2.c(), d2.d(), jSONObject, d2.b()).addInstanceListener(this.k).c(i, i2).initWithURL(d2.a()).setTag("themis_page", this.f17670a);
        rrb rrbVar = (rrb) this.d.getExtension(rrb.class);
        if (rrbVar != null) {
            tag.setTag("themis_data_extension", rrbVar);
        }
        b6x.a a2 = tag.a();
        if (a2 != null) {
            String e2 = qml.e(this.f17670a, true);
            Charset charset = StandardCharsets.UTF_8;
            ckf.f(charset, "UTF_8");
            byte[] bytes = e2.getBytes(charset);
            ckf.f(bytes, "this as java.lang.String).getBytes(charset)");
            a2.updateInstanceEnv("userAgent", WeexValueImpl.ofString(wes.c(this.d)));
            if (this.n) {
                a2.execute(bytes, "injected.js");
                String d3 = n9s.d(this.f17670a);
                Charset forName = Charset.forName("utf-8");
                ckf.f(forName, "forName(charsetName)");
                byte[] bytes2 = d3.getBytes(forName);
                ckf.f(bytes2, "this as java.lang.String).getBytes(charset)");
                a2.execute(bytes2, "safeArea.js");
                String f = n9s.f(this.f17670a);
                Charset forName2 = Charset.forName("utf-8");
                ckf.f(forName2, "forName(charsetName)");
                byte[] bytes3 = f.getBytes(forName2);
                ckf.f(bytes3, "this as java.lang.String).getBytes(charset)");
                a2.execute(bytes3, "titleBarPos.js");
                a2.render(WeexValueImpl.ofJSON(this.j));
            }
            aVar = a2;
        }
        this.l = aVar;
    }

    public final void J1() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        StartParams startParams = (StartParams) this.d.g(StartParams.class);
        Integer num = null;
        if (startParams == null || !(startParams instanceof Weex2StartParams)) {
            startParams = null;
        }
        Weex2StartParams weex2StartParams = (Weex2StartParams) startParams;
        Integer width = weex2StartParams == null ? null : weex2StartParams.getWidth();
        if (width == null) {
            i = xcs.c(this.d.M());
        } else {
            i = width.intValue();
        }
        StartParams startParams2 = (StartParams) this.d.g(StartParams.class);
        if (startParams2 == null || !(startParams2 instanceof Weex2StartParams)) {
            startParams2 = null;
        }
        Weex2StartParams weex2StartParams2 = (Weex2StartParams) startParams2;
        if (weex2StartParams2 != null) {
            num = weex2StartParams2.getHeight();
        }
        if (num == null) {
            i2 = xcs.b(this.d.M());
        } else {
            i2 = num.intValue();
        }
        pgd pgdVar = (pgd) this.f17670a.getExtension(pgd.class);
        if (pgdVar != null) {
            pgdVar.p1(false);
        }
        z1();
        if (this.m) {
            Application M = this.f17670a.getInstance().M();
            ckf.f(M, "mPage.getInstance().application");
            C1(M, this.f, i, i2);
        } else {
            B1(F1(), this.f, false);
        }
        w5d w5dVar = (w5d) this.f17670a.getExtension(w5d.class);
        if (w5dVar != null && this.f17670a.getInstance().a0() == TMSSolutionType.WEEX) {
            w5dVar.A(new b());
        }
    }

    @Override // tb.d9s, tb.qcs
    public void reload(pcs pcsVar) {
        WeexInstance weexInstance;
        s5x s5xVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961bd7e0", new Object[]{this, pcsVar});
            return;
        }
        if (pcsVar == null) {
            pcsVar = new pcs();
            pcsVar.f26018a = this.f;
        }
        if (!(!q9s.M() || (weexInstance = this.e) == null || (s5xVar = (s5x) weexInstance.getExtend(s5x.class)) == null)) {
            s5xVar.b("is_tms_afc_link_launch", "false");
        }
        WeexInstance weexInstance2 = this.e;
        if (weexInstance2 != null) {
            weexInstance2.destroy();
        }
        String str = pcsVar.f26018a;
        ckf.f(str, "finalRenderOptions.url");
        this.f = str;
        this.j = null;
        B1(F1(), this.f, true);
        s();
    }

    public final void K1() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80181445", new Object[]{this});
        } else if (q9s.M()) {
            try {
                if (this.d.getExtension(x9b.class) != null) {
                    z = true;
                }
                WeexInstance weexInstance = this.e;
                Map<String, Object> map = null;
                s5x s5xVar = weexInstance == null ? null : (s5x) weexInstance.getExtend(s5x.class);
                if (s5xVar != null) {
                    s5xVar.b("is_tms_afc_link_launch", String.valueOf(z));
                    s5xVar.b("is_tms_afc_mini_kernel", String.valueOf(h8s.sTMSAfcMiniKernel.get()));
                    if (z) {
                        mgg S = this.d.S();
                        ckf.f(S, "mInstance.launchMonitorData");
                        if (S.e(mop.KEY_CONTAINER_START)) {
                            s5xVar.a("TMS_appStart", o9s.d(S.h(mop.KEY_CONTAINER_START)));
                        }
                        if (S.e("firstPageRenderStart")) {
                            s5xVar.a("TMS_renderStart", o9s.d(S.h("firstPageRenderStart")));
                        }
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashSet.add("isManifestLocal");
                        linkedHashSet.add("launchType");
                        linkedHashSet.add("schemaUrl");
                        linkedHashSet.add(ah0.AFC_LINK_NAV_START);
                        linkedHashSet.add(ah0.AFC_ID);
                        mab mabVar = (mab) this.f17670a.getExtension(mab.class);
                        if (mabVar != null) {
                            map = mabVar.g1(linkedHashSet);
                        }
                        if (map != null) {
                            for (Map.Entry<String, Object> entry : map.entrySet()) {
                                s5xVar.b(entry.getKey(), entry.getValue().toString());
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TMSLogger.b(this.i, ckf.p("reportAfcData error ", th.getMessage()));
            }
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        K1();
        if (!this.m || this.o.get()) {
            super.onPause();
            IpChange ipChange2 = TMSAssertUtils.$ipChange;
            WeexInstance weexInstance = this.e;
            if (weexInstance != null) {
                weexInstance.onActivityPause();
            }
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, ncs.c(this.f17670a), mcs.d(ncs.c(this.f17670a)), arf.b(new Pair("name", "WeexInstance.onActivityPause")));
            return;
        }
        ((ArrayList) this.p).add("onPause");
    }

    @Override // tb.d9s, tb.qcs
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (!this.m || this.o.get()) {
            super.onResume();
            IpChange ipChange2 = TMSAssertUtils.$ipChange;
            WeexInstance weexInstance = this.e;
            if (weexInstance != null) {
                weexInstance.onActivityResume();
            }
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, ncs.c(this.f17670a), mcs.d(ncs.c(this.f17670a)), arf.b(new Pair("name", "WeexInstance.onActivityResume")));
        } else {
            this.p.add("onResume");
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (!this.m || this.o.get()) {
            super.onStart();
            IpChange ipChange2 = TMSAssertUtils.$ipChange;
            WeexInstance weexInstance = this.e;
            if (weexInstance != null) {
                weexInstance.onActivityStart();
            }
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, ncs.c(this.f17670a), mcs.d(ncs.c(this.f17670a)), arf.b(new Pair("name", "WeexInstance.onActivityStart")));
        } else {
            this.p.add("onStart");
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else if (!this.m || this.o.get()) {
            super.onStop();
            IpChange ipChange2 = TMSAssertUtils.$ipChange;
            WeexInstance weexInstance = this.e;
            if (weexInstance != null) {
                weexInstance.onActivityStop();
            }
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, ncs.c(this.f17670a), mcs.d(ncs.c(this.f17670a)), arf.b(new Pair("name", "WeexInstance.onActivityStop")));
        } else {
            this.p.add("onStop");
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onViewAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
        } else if (!this.m || this.o.get()) {
            super.onViewAppear();
            IpChange ipChange2 = TMSAssertUtils.$ipChange;
            WeexInstance weexInstance = this.e;
            if (weexInstance != null) {
                weexInstance.onViewAppear();
            }
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, ncs.c(this.f17670a), mcs.d(ncs.c(this.f17670a)), arf.b(new Pair("name", "WeexInstance.onViewAppear")));
        } else {
            this.p.add("onViewAppear");
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onViewDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
        } else if (!this.m || this.o.get()) {
            super.onViewDisappear();
            IpChange ipChange2 = TMSAssertUtils.$ipChange;
            WeexInstance weexInstance = this.e;
            if (weexInstance != null) {
                weexInstance.onViewDisappear();
            }
            mcs.e(mcs.MODULE_LAUNCH_PAGE, mcs.EVENT_LIFECYCLE, ncs.c(this.f17670a), mcs.d(ncs.c(this.f17670a)), arf.b(new Pair("name", "WeexInstance.onViewDisappear")));
        } else {
            this.p.add("onViewDisAppear");
        }
    }

    @Override // tb.d9s, tb.qcs
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        super.s();
        if (this.m && this.o.compareAndSet(false, true)) {
            TMSLogger.f(this.i, "mAsyncWeexInstanceResult accept start");
            b6x.a aVar = this.l;
            ckf.d(aVar);
            this.e = aVar.b(F1());
            gld m = CommonExtKt.m(this.f17670a.getInstance());
            if (m != null) {
                m.C("engineInitEnd");
            }
            ITMSPage iTMSPage = this.f17670a;
            ITMSPage iTMSPage2 = this.f17670a;
            WeexInstance weexInstance = this.e;
            ckf.d(weexInstance);
            iTMSPage.x(new o7x(iTMSPage2, weexInstance, this));
            I1(this.p);
        }
        IpChange ipChange2 = TMSAssertUtils.$ipChange;
        if (this.e != null) {
            if (q9s.R2()) {
                i0("tabBarHeight", Integer.valueOf(qml.w(this.f17670a)));
            }
            if (!this.n && q9s.L0()) {
                String e2 = qml.e(this.f17670a, true);
                Charset charset = StandardCharsets.UTF_8;
                ckf.f(charset, "UTF_8");
                byte[] bytes = e2.getBytes(charset);
                ckf.f(bytes, "this as java.lang.String).getBytes(charset)");
                WeexInstance weexInstance2 = this.e;
                ckf.d(weexInstance2);
                weexInstance2.execute(bytes, "injected.js");
            }
            cqc cqcVar = (cqc) this.f17670a.getExtension(cqc.class);
            if (cqcVar == null || !cqcVar.A0()) {
                WeexInstance weexInstance3 = this.e;
                ckf.d(weexInstance3);
                weexInstance3.initWithURL(this.f);
                D1();
                return;
            }
            mcs.e(mcs.MODULE_LAUNCH_PAGE, "ON_BIND_MAINDOCUMENT_EXTENSION", ncs.d(this.d), ncs.c(this.f17670a), new JSONObject());
            cqcVar.Q(new d(cqcVar));
        }
    }
}
