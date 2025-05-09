package com.taobao.themis.uniapp.solution;

import android.net.Uri;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.uniapp.solution.TMSResourceStepGroup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.a9s;
import tb.bbs;
import tb.ckf;
import tb.cqc;
import tb.eas;
import tb.ges;
import tb.gld;
import tb.i04;
import tb.lrg;
import tb.lwd;
import tb.mcs;
import tb.o9s;
import tb.pl4;
import tb.pzh;
import tb.q9s;
import tb.r2i;
import tb.rcs;
import tb.rwl;
import tb.t2i;
import tb.t2o;
import tb.tl;
import tb.uj3;
import tb.ve4;
import tb.wsq;
import tb.wzi;
import tb.xhv;
import tb.ygv;
import tb.zgv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSResourceStepGroup extends ve4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final lwd n;
    public a o;
    public ges.a p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class ManifestASyncConcurrentStep extends ve4.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final ges.a l;
        public final String m;

        static {
            t2o.a(848298000);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManifestASyncConcurrentStep(bbs bbsVar, ges.a aVar, String str, a9s a9sVar, ve4 ve4Var) {
            super(bbsVar, a9sVar, ve4Var);
            ckf.g(bbsVar, "instance");
            ckf.g(aVar, "baseInfo");
            ckf.g(str, "manifestUrl");
            ckf.g(a9sVar, wzi.LAUNCHER);
            ckf.g(ve4Var, "group");
            this.l = aVar;
            this.m = str;
        }

        public static /* synthetic */ Object ipc$super(ManifestASyncConcurrentStep manifestASyncConcurrentStep, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/uniapp/solution/TMSResourceStepGroup$ManifestASyncConcurrentStep");
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return "ManifestASyncConcurrentStep";
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void h() {
            AppManifestManager.RequestMode requestMode;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67daaada", new Object[]{this});
                return;
            }
            if (!ges.INSTANCE.a(this.l)) {
                requestMode = AppManifestManager.RequestMode.NOCACHE;
            } else {
                requestMode = AppManifestManager.RequestMode.UPDATE;
            }
            AppManifestManager.INSTANCE.m(this.m, null, requestMode, new AppManifestManager.a() { // from class: com.taobao.themis.uniapp.solution.TMSResourceStepGroup$ManifestASyncConcurrentStep$onExecuting$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager.a
                public void a(t2i.c cVar) {
                    String str;
                    List list;
                    Object obj;
                    String str2;
                    String appId;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c74fc60", new Object[]{this, cVar});
                        return;
                    }
                    ckf.g(cVar, "result");
                    TMSMetaInfoWrapper U = TMSResourceStepGroup.ManifestASyncConcurrentStep.this.b.U();
                    ckf.d(U);
                    String l = U.l();
                    if (cVar.e() && cVar.f() != null) {
                        AppManifest f = cVar.f();
                        ckf.d(f);
                        AppManifest.AppInfo appInfo = f.getAppInfo();
                        String version = appInfo == null ? null : appInfo.getVersion();
                        Map<String, String> d = cVar.d();
                        String str3 = d == null ? null : d.get("x-deprecated-versions");
                        Map<String, String> d2 = cVar.d();
                        String str4 = d2 == null ? null : d2.get("x-revalidate-version");
                        String str5 = TMSResourceStepGroup.ManifestASyncConcurrentStep.this.c;
                        ckf.f(str5, "mLogTraceId");
                        String d3 = mcs.d(str5);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put((JSONObject) "manifest", (String) JSON.parseObject(JSON.toJSONString(cVar.f())));
                        jSONObject.put((JSONObject) "x-deprecated-versions", str3 == null ? "" : str3);
                        jSONObject.put((JSONObject) "currentVersion", l);
                        jSONObject.put((JSONObject) "x-revalidate-version", str4);
                        xhv xhvVar = xhv.INSTANCE;
                        mcs.e(mcs.MODULE_LAUNCH_APPINFO, "ON_GET_ASYNC_MANIFEST", str5, d3, jSONObject);
                        q9s q9sVar = q9s.INSTANCE;
                        if (!q9sVar.u2() || str4 == null || o9s.b(str4, l) <= 0) {
                            if (str3 == null) {
                                str2 = "RELOAD";
                                obj = "reloadParams";
                                str = "mInstance";
                                list = null;
                            } else {
                                str2 = "RELOAD";
                                obj = "reloadParams";
                                str = "mInstance";
                                list = wsq.z0(str3, new String[]{","}, false, 0, 6, null);
                            }
                            if (q9sVar.u2() && list != null) {
                                List list2 = list;
                                if (!i04.R(list2, l)) {
                                    return;
                                }
                                if (i04.R(list2, version)) {
                                    TMSResourceStepGroup.ManifestASyncConcurrentStep manifestASyncConcurrentStep = TMSResourceStepGroup.ManifestASyncConcurrentStep.this;
                                    String str6 = manifestASyncConcurrentStep.e;
                                    String str7 = manifestASyncConcurrentStep.d;
                                    String str8 = manifestASyncConcurrentStep.c;
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put((JSONObject) "errorMsg", "latest version is in x-deprecated-versions");
                                    mcs.c(str6, mcs.EVENT_ON_ERROR, str7, str8, jSONObject2);
                                    AppManifest f2 = cVar.f();
                                    ckf.d(f2);
                                    AppManifest.AppInfo appInfo2 = f2.getAppInfo();
                                    if (!(appInfo2 == null || (appId = appInfo2.getAppId()) == null)) {
                                        AppManifestManager.INSTANCE.k(appId);
                                    }
                                    CommonExtKt.o(new TMSResourceStepGroup$ManifestASyncConcurrentStep$onExecuting$1$onCallback$5(TMSResourceStepGroup.ManifestASyncConcurrentStep.this));
                                    return;
                                }
                                TMSResourceStepGroup.ManifestASyncConcurrentStep manifestASyncConcurrentStep2 = TMSResourceStepGroup.ManifestASyncConcurrentStep.this;
                                String str9 = manifestASyncConcurrentStep2.e;
                                String str10 = manifestASyncConcurrentStep2.d;
                                String str11 = manifestASyncConcurrentStep2.c;
                                JSONObject jSONObject3 = new JSONObject();
                                JSONObject jSONObject4 = new JSONObject();
                                Map<String, String> d4 = cVar.d();
                                jSONObject4.put((JSONObject) "x-deprecated-versions", d4 == null ? null : d4.get("x-deprecated-versions"));
                                jSONObject4.put((JSONObject) "currentVersion", l);
                                jSONObject3.put((JSONObject) obj, (Object) jSONObject4);
                                mcs.c(str9, str2, str10, str11, jSONObject3);
                                bbs bbsVar = TMSResourceStepGroup.ManifestASyncConcurrentStep.this.b;
                                ckf.f(bbsVar, str);
                                TMSInstanceExtKt.a(bbsVar);
                                return;
                            }
                            return;
                        }
                        TMSResourceStepGroup.ManifestASyncConcurrentStep manifestASyncConcurrentStep3 = TMSResourceStepGroup.ManifestASyncConcurrentStep.this;
                        String str12 = manifestASyncConcurrentStep3.e;
                        String str13 = manifestASyncConcurrentStep3.d;
                        String str14 = manifestASyncConcurrentStep3.c;
                        JSONObject jSONObject5 = new JSONObject();
                        JSONObject jSONObject6 = new JSONObject();
                        Map<String, String> d5 = cVar.d();
                        jSONObject6.put((JSONObject) "x-revalidate-version", d5 == null ? null : d5.get("x-revalidate-version"));
                        jSONObject6.put((JSONObject) "currentVersion", l);
                        jSONObject5.put((JSONObject) "reloadParams", (String) jSONObject6);
                        mcs.c(str12, "RELOAD", str13, str14, jSONObject5);
                        bbs bbsVar2 = TMSResourceStepGroup.ManifestASyncConcurrentStep.this.b;
                        ckf.f(bbsVar2, "mInstance");
                        TMSInstanceExtKt.a(bbsVar2);
                    }
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a extends ve4.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final ges.a l;
        public final String m;
        public final String n;
        public final String o;
        public final boolean p;
        public final boolean q;
        public final boolean r;
        public final pzh s;
        public pzh t;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.themis.uniapp.solution.TMSResourceStepGroup$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class C0779a implements cqc.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0779a() {
            }

            @Override // tb.cqc.b
            public void a(int i, Map<String, List<String>> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8e70c5d6", new Object[]{this, new Integer(i), map});
                } else {
                    a.l(a.this, i, map);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class b implements cqc.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // tb.cqc.c
            public void a(ygv ygvVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5d8000ea", new Object[]{this, ygvVar});
                    return;
                }
                ckf.g(ygvVar, "loadInfo");
                a.k(a.this, ygvVar);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class c implements cqc.d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c() {
            }

            @Override // tb.cqc.d
            public void a(ygv ygvVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("65eed106", new Object[]{this, ygvVar});
                    return;
                }
                ckf.g(ygvVar, "loadInfo");
                a.k(a.this, ygvVar);
            }

            @Override // tb.cqc.d
            public void b(int i, Map<String, List<String>> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ccf1979", new Object[]{this, new Integer(i), map});
                } else {
                    a.l(a.this, i, map);
                }
            }

            @Override // tb.cqc.d
            public void onError(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                    return;
                }
                a aVar = a.this;
                String str2 = aVar.e;
                String str3 = aVar.d;
                String str4 = aVar.c;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "errorCode", (String) Integer.valueOf(i));
                jSONObject.put((JSONObject) "errorMsg", str);
                xhv xhvVar = xhv.INSTANCE;
                mcs.e(str2, mcs.EVENT_ON_ERROR, str3, str4, jSONObject);
                a.this.b().k(pzh.class, null);
            }
        }

        static {
            t2o.a(848297996);
        }

        public /* synthetic */ a(bbs bbsVar, ges.a aVar, String str, String str2, String str3, boolean z, boolean z2, boolean z3, a9s a9sVar, ve4 ve4Var, pzh pzhVar, int i, a07 a07Var) {
            this(bbsVar, aVar, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, a9sVar, ve4Var, (i & 1024) != 0 ? null : pzhVar);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/uniapp/solution/TMSResourceStepGroup$MainDocumentConcurrentStep");
        }

        public static final /* synthetic */ void k(a aVar, ygv ygvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("568efd6b", new Object[]{aVar, ygvVar});
            } else {
                aVar.o(ygvVar);
            }
        }

        public static final /* synthetic */ void l(a aVar, int i, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8797b7bc", new Object[]{aVar, new Integer(i), map});
            } else {
                aVar.p(i, map);
            }
        }

        public static /* synthetic */ void n(a aVar, String str, String str2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f989eb47", new Object[]{aVar, str, str2, new Integer(i), obj});
                return;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            aVar.m(str, str2);
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return "MainDocumentConcurrentStep";
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67daaada", new Object[]{this});
                return;
            }
            String str = this.e;
            String str2 = this.d;
            String str3 = this.c;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "mainDocumentUrl", this.m);
            jSONObject.put((JSONObject) "mainDocumentVersion", this.n);
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(str, mcs.EVENT_REQUEST, str2, str3, jSONObject);
            this.b.S().b("mainDocumentRequestStart");
            bbs bbsVar = this.b;
            ckf.f(bbsVar, "mInstance");
            gld m = CommonExtKt.m(bbsVar);
            if (m != null) {
                m.C("mainDocumentRequestStart");
            }
            String c2 = c();
            TMSLogger.a(c2, "request with documentUrl[" + this.m + "] and documentVersion[" + ((Object) this.n) + ']');
            if (this.s != null) {
                mcs.e(this.e, "HIT_MAIN_DOCUMENT_PREFETCH", this.d, this.c, new JSONObject());
                pzh pzhVar = this.s;
                this.t = pzhVar;
                pzhVar.h(new C0779a());
                this.s.Q(new b());
            } else {
                pzh pzhVar2 = new pzh();
                this.t = pzhVar2;
                pzhVar2.e1(this.m, this.n, this.o, Boolean.valueOf(this.q), new c(), Boolean.valueOf(this.r));
            }
            b().k(pzh.class, this.t);
            if (!this.r) {
                i();
            }
        }

        public final void m(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("415bb112", new Object[]{this, str, str2});
                return;
            }
            String str3 = this.e;
            String str4 = this.d;
            String str5 = this.c;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "documentUrl", str);
            jSONObject2.put((JSONObject) "documentVersion", str2);
            xhv xhvVar = xhv.INSTANCE;
            jSONObject.put((JSONObject) "reloadParams", (String) jSONObject2);
            mcs.e(str3, "INVALID_PREFETCH", str4, str5, jSONObject);
            pzh pzhVar = this.t;
            if (pzhVar != null) {
                pzhVar.invalid();
            }
            b().k(pzh.class, null);
            i();
        }

        public final void o(ygv ygvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5918dbd4", new Object[]{this, ygvVar});
                return;
            }
            this.b.S().b("mainDocumentRequestFinish");
            bbs bbsVar = this.b;
            ckf.f(bbsVar, "mInstance");
            gld m = CommonExtKt.m(bbsVar);
            if (m != null) {
                m.C("mainDocumentRequestFinish");
            }
            mcs.e(this.e, mcs.EVENT_ON_FINISH, this.d, this.c, new JSONObject());
        }

        public final void r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38c2816", new Object[]{this, str});
                return;
            }
            ckf.g(str, "renderer");
            pzh pzhVar = this.t;
            if (pzhVar != null) {
                pzhVar.s(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bbs bbsVar, ges.a aVar, String str, String str2, String str3, boolean z, boolean z2, boolean z3, a9s a9sVar, ve4 ve4Var, pzh pzhVar) {
            super(bbsVar, a9sVar, ve4Var);
            ckf.g(bbsVar, "instance");
            ckf.g(aVar, "baseInfo");
            ckf.g(str, "mainDocumentUrl");
            ckf.g(a9sVar, wzi.LAUNCHER);
            ckf.g(ve4Var, "group");
            this.l = aVar;
            this.m = str;
            this.n = str2;
            this.o = str3;
            this.p = z;
            this.q = z2;
            this.r = z3;
            this.s = pzhVar;
        }

        public final t2i.c q(Map<String, List<String>> map) {
            List<String> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t2i.c) ipChange.ipc$dispatch("a8fa6c0", new Object[]{this, map});
            }
            String str = null;
            if (!(map == null || (list = map.get("uniapp-manifest")) == null)) {
                str = (String) i04.d0(list, 0);
            }
            if (str == null) {
                return new t2i.c("TMS_ERR_MT_RAPID_NODATA", "no manifest in response header");
            }
            try {
                byte[] decode = Base64.decode(str, 0);
                ckf.f(decode, "decode(base64String, Base64.DEFAULT)");
                try {
                    AppManifest appManifest = (AppManifest) JSON.parseObject(new String(decode, uj3.UTF_8), AppManifest.class);
                    ckf.f(appManifest, "manifest");
                    return new t2i.c(appManifest, new HashMap(), new HashMap());
                } catch (Throwable th) {
                    TMSLogger.d(c(), th);
                    return new t2i.c("TMS_ERR_MT_RAPID_UNPARSE", "decode manifest fail");
                }
            } catch (Throwable th2) {
                TMSLogger.d(c(), th2);
                return new t2i.c("TMS_ERR_MT_RAPID_UNDECODE", "decode base64 fail");
            }
        }

        public final void p(int i, Map<String, List<String>> map) {
            List<String> list;
            String str;
            List<String> list2;
            String str2;
            AppManifest appManifest;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bce0f767", new Object[]{this, new Integer(i), map});
                return;
            }
            this.b.S().b("mainDocumentHeaderGet");
            List<String> list3 = null;
            if (this.r) {
                t2i.c q = q(map);
                if (!q.e() || q.f() == null) {
                    String str3 = this.e;
                    String str4 = this.d;
                    String str5 = this.c;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put((JSONObject) "errorCode", q.a());
                    jSONObject.put((JSONObject) "errorMsg", q.b());
                    xhv xhvVar = xhv.INSTANCE;
                    mcs.c(str3, "GET_MANIFEST_FORM_HEADER_FAIL", str4, str5, jSONObject);
                    this.b.S().a("uniappRapidError", q.a());
                    mcs.e(this.e, "START_REQUEST_MANIFEST", this.d, this.c, new JSONObject());
                    AppManifestManager appManifestManager = AppManifestManager.INSTANCE;
                    String c2 = this.l.c();
                    ckf.d(c2);
                    t2i.c n = appManifestManager.n(c2, null, AppManifestManager.RequestMode.LAUNCH);
                    mcs.e(this.e, "FINISH_REQUEST_MANIFEST", this.d, this.c, new JSONObject());
                    if (!n.e() || n.f() == null) {
                        g(new eas(ckf.p(eas.a.TMS_ERR_MANIFEST_PREFIX, n.a()), n.b(), ""));
                        appManifest = null;
                    } else {
                        appManifest = n.f();
                    }
                    z = false;
                } else {
                    appManifest = q.f();
                }
                if (appManifest != null) {
                    if (ges.INSTANCE.a(this.l)) {
                        AppManifestManager appManifestManager2 = AppManifestManager.INSTANCE;
                        if (appManifestManager2.b(appManifest)) {
                            AppManifestDao appManifestDao = new AppManifestDao();
                            AppManifest.AppInfo appInfo = appManifest.getAppInfo();
                            ckf.d(appInfo);
                            appManifestDao.setAppId(appInfo.getAppId());
                            AppManifest.AppInfo appInfo2 = appManifest.getAppInfo();
                            ckf.d(appInfo2);
                            appManifestDao.setVersion(appInfo2.getVersion());
                            appManifestDao.setAppManifest(appManifest);
                            appManifestDao.setLastRequestTimeStamp(System.currentTimeMillis());
                            appManifestDao.setLastUsedTimeStamp(System.currentTimeMillis());
                            appManifestManager2.p(appManifestDao);
                        }
                    }
                    bbs bbsVar = this.b;
                    ckf.f(bbsVar, "mInstance");
                    rcs.a(this, false, bbsVar, new TMSMetaInfoWrapper(appManifest, this.l), z);
                    i();
                }
            }
            if (!this.p) {
                if (!(map == null || (list2 = map.get("x-manifest-version")) == null || (str2 = (String) i04.d0(list2, 0)) == null)) {
                    b().j("mainDocumentManifestVersion", str2);
                }
                if (!(map == null || (list = map.get("x-page-version")) == null || (str = (String) i04.d0(list, 0)) == null)) {
                    b().j("mainDocumentPageVersion", str);
                }
                if (i >= 400) {
                    b().j("mainDocumentErrorCode", String.valueOf(i));
                }
                rcs.c(this, this.l);
            }
            String str6 = this.e;
            String str7 = this.d;
            String str8 = this.c;
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put((JSONObject) "x-manifest-version", (String) (map == null ? null : map.get("x-manifest-version")));
            jSONObject3.put((JSONObject) "x-uniapp-pageurl", (String) (map == null ? null : map.get("x-uniapp-pageurl")));
            jSONObject3.put((JSONObject) "x-page-version", (String) (map == null ? null : map.get("x-page-version")));
            if (this.r) {
                if (map != null) {
                    list3 = map.get("uniapp-manifest");
                }
                jSONObject3.put((JSONObject) "uniapp-manifest", (String) list3);
            }
            xhv xhvVar2 = xhv.INSTANCE;
            jSONObject2.put((JSONObject) lrg.EXT_DATA_MTOP_RESPONSE_HEADERS, (String) jSONObject3);
            mcs.e(str6, "ON_HEADER_RESPONSE", str7, str8, jSONObject2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b extends ve4.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final ges.a l;
        public final r2i m;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements AppManifestManager.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager.a
            public void a(t2i.c cVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c74fc60", new Object[]{this, cVar});
                    return;
                }
                ckf.g(cVar, "result");
                b bVar = b.this;
                mcs.e(bVar.e, "FINISH_MANIFEST_PREFETCH", bVar.d, bVar.c, new JSONObject());
                b.k(b.this, cVar);
            }
        }

        static {
            t2o.a(848298003);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(bbs bbsVar, ges.a aVar, a9s a9sVar, ve4 ve4Var, r2i r2iVar) {
            super(bbsVar, a9sVar, ve4Var);
            ckf.g(bbsVar, "instance");
            ckf.g(aVar, "baseInfo");
            ckf.g(a9sVar, wzi.LAUNCHER);
            ckf.g(ve4Var, "group");
            this.l = aVar;
            this.m = r2iVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/uniapp/solution/TMSResourceStepGroup$ManifestSyncConcurrentStep");
        }

        public static final /* synthetic */ void k(b bVar, t2i.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a89da69d", new Object[]{bVar, cVar});
            } else {
                bVar.l(cVar);
            }
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return "ManifestSyncConcurrentStep";
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void h() {
            AppManifestManager.RequestMode requestMode;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67daaada", new Object[]{this});
                return;
            }
            this.b.X().e("manifestFetchStart");
            if (this.m != null) {
                mcs.e(this.e, "WAIT_MANIFEST_PREFETCH", this.d, this.c, new JSONObject());
                this.m.d(new a());
                return;
            }
            if (!ges.INSTANCE.a(this.l)) {
                requestMode = AppManifestManager.RequestMode.NOCACHE;
            } else {
                requestMode = AppManifestManager.RequestMode.LAUNCH;
            }
            AppManifestManager appManifestManager = AppManifestManager.INSTANCE;
            String c = this.l.c();
            ckf.d(c);
            l(appManifestManager.n(c, null, requestMode));
        }

        public final void l(t2i.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcf065b0", new Object[]{this, cVar});
                return;
            }
            bbs bbsVar = this.b;
            ckf.f(bbsVar, "mInstance");
            gld m = CommonExtKt.m(bbsVar);
            String str = null;
            if (m != null) {
                Map<String, String> c = cVar.c();
                String str2 = c == null ? null : c.get("manifestParseStart");
                if (str2 == null) {
                    str2 = String.valueOf(System.currentTimeMillis());
                }
                m.D("manifestParseStart", str2);
            }
            bbs bbsVar2 = this.b;
            ckf.f(bbsVar2, "mInstance");
            gld m2 = CommonExtKt.m(bbsVar2);
            if (m2 != null) {
                Map<String, String> c2 = cVar.c();
                String str3 = c2 == null ? null : c2.get("manifestParseEnd");
                if (str3 == null) {
                    str3 = String.valueOf(System.currentTimeMillis());
                }
                m2.D("manifestParseEnd", str3);
            }
            this.b.X().e("manifestFetchEnd");
            if (!cVar.e() || cVar.f() == null) {
                g(new eas(ckf.p(eas.a.TMS_ERR_MANIFEST_PREFIX, cVar.a()), cVar.b(), ""));
                return;
            }
            AppManifest f = cVar.f();
            ckf.d(f);
            AppManifest.AppInfo appInfo = f.getAppInfo();
            if (appInfo != null) {
                str = appInfo.getAppId();
            }
            if (!ckf.b(str, this.l.j())) {
                g(eas.a.APP_ID_DIS_MATCH);
                return;
            }
            AppManifest f2 = cVar.f();
            ckf.d(f2);
            TMSMetaInfoWrapper tMSMetaInfoWrapper = new TMSMetaInfoWrapper(f2, this.l);
            if (q9s.INSTANCE.X()) {
                bbs bbsVar3 = this.b;
                ckf.f(bbsVar3, "mInstance");
                rcs.b(this, false, bbsVar3, tMSMetaInfoWrapper, false, 8, null);
                rcs.c(this, this.l);
            } else {
                rcs.c(this, this.l);
                bbs bbsVar4 = this.b;
                ckf.f(bbsVar4, "mInstance");
                rcs.b(this, false, bbsVar4, tMSMetaInfoWrapper, false, 8, null);
            }
            i();
        }
    }

    static {
        t2o.a(848297995);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSResourceStepGroup(bbs bbsVar, a9s a9sVar, lwd lwdVar) {
        super(bbsVar, a9sVar);
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
        ckf.g(lwdVar, "mListener");
        this.n = lwdVar;
    }

    public static /* synthetic */ Object ipc$super(TMSResourceStepGroup tMSResourceStepGroup, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/uniapp/solution/TMSResourceStepGroup");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMSResourceStepGroup";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
        }
    }

    @Override // tb.ve4
    public void m(ve4.a aVar) {
        TMSMetaInfoWrapper U;
        String renderer;
        a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653bfbe1", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, tl.KEY_STEP);
        if ((aVar instanceof b) && (U = this.b.U()) != null) {
            ges gesVar = ges.INSTANCE;
            AppManifest.Page h = gesVar.h(this.p, U);
            if (!(h == null || (renderer = h.getRenderer()) == null || (aVar2 = this.o) == null)) {
                aVar2.r(renderer);
            }
            ges.a aVar3 = this.p;
            ckf.d(aVar3);
            if (aVar3.k()) {
                if (h != null) {
                    ges.a aVar4 = this.p;
                    ckf.d(aVar4);
                    Uri parse = Uri.parse(aVar4.d());
                    ckf.f(parse, "parse(baseInfo!!.originUrl)");
                    Uri parse2 = Uri.parse(h.getUrl());
                    ckf.f(parse2, "parse(pageInfo.url)");
                    if (gesVar.e(parse, parse2)) {
                        return;
                    }
                }
                if (q9s.O()) {
                    g(eas.a.URL_NOT_MATCH);
                    return;
                }
                a aVar5 = this.o;
                if (aVar5 != null) {
                    a.n(aVar5, null, null, 3, null);
                }
            }
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void f() {
        String str;
        r2i r2iVar;
        pzh pzhVar;
        AppManifest appManifest;
        pzh pzhVar2;
        r2i r2iVar2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
            return;
        }
        l().S().b("manifestStepStart");
        ges gesVar = ges.INSTANCE;
        String e0 = this.b.e0();
        ckf.f(e0, "mInstance.url");
        this.p = gesVar.o(e0);
        String str2 = this.e;
        String str3 = this.d;
        String str4 = this.c;
        JSONObject jSONObject = new JSONObject();
        ges.a aVar = this.p;
        xhv xhvVar = null;
        jSONObject.put((JSONObject) TBImageFlowMonitor.ERROR_ORIGIN_URL, aVar == null ? null : aVar.d());
        ges.a aVar2 = this.p;
        jSONObject.put((JSONObject) "baseUrl", aVar2 == null ? null : aVar2.a());
        ges.a aVar3 = this.p;
        jSONObject.put((JSONObject) "uniAppId", aVar3 == null ? null : aVar3.j());
        ges.a aVar4 = this.p;
        jSONObject.put((JSONObject) pl4.KEY_PAGE_ID, aVar4 == null ? null : aVar4.e());
        ges.a aVar5 = this.p;
        jSONObject.put((JSONObject) "manifestUrl", aVar5 == null ? null : aVar5.c());
        ges.a aVar6 = this.p;
        jSONObject.put((JSONObject) "query", aVar6 == null ? null : aVar6.f());
        xhv xhvVar2 = xhv.INSTANCE;
        mcs.e(str2, mcs.EVENT_ON_INIT, str3, str4, jSONObject);
        ges.a aVar7 = this.p;
        ckf.d(aVar7);
        if (aVar7.g()) {
            str = rwl.DIMEN_RAPID;
        } else {
            str = "default";
        }
        l().S().a("uniappMode", str);
        l().X().onProperty("uniappMode", str);
        ges.a aVar8 = this.p;
        if (aVar8 == null || aVar8.j() == null) {
            g(eas.a.URL_EMPTY);
            return;
        }
        l().X().e("manifestLoadStart");
        l().X().e("manifestCacheReadStart");
        zgv zgvVar = zgv.INSTANCE;
        ges.a aVar9 = this.p;
        ckf.d(aVar9);
        String d = aVar9.d();
        ckf.d(d);
        r2i e = zgvVar.e(d);
        AppManifestDao h = AppManifestManager.INSTANCE.h(this.p);
        if (!(e == null || h == null)) {
            String str5 = this.c;
            ckf.f(str5, "mLogTraceId");
            mcs.e(mcs.MODULE_LAUNCH_APPINFO, "HIT_MANIFEST_PREFETCH", str5, mcs.d(str5), new JSONObject());
        }
        ges.a aVar10 = this.p;
        ckf.d(aVar10);
        String d2 = aVar10.d();
        ckf.d(d2);
        pzh d3 = zgvVar.d(d2);
        l().X().e("manifestCacheReadEnd");
        l().S().b("manifestCacheReadEnd");
        if (h == null || (appManifest = h.getAppManifest()) == null) {
            pzhVar = d3;
            r2iVar = e;
        } else {
            TMSMetaInfoWrapper tMSMetaInfoWrapper = new TMSMetaInfoWrapper(appManifest, this.p);
            AppManifest.Page h2 = gesVar.h(this.p, tMSMetaInfoWrapper);
            if (h2 == null) {
                pzhVar2 = d3;
                r2iVar = e;
                r2iVar2 = null;
            } else {
                TMSLogger.f(c(), "get valid local manifest cache");
                bbs bbsVar = this.b;
                ckf.f(bbsVar, "mInstance");
                rcs.b(this, true, bbsVar, tMSMetaInfoWrapper, false, 8, null);
                AppManifest r = tMSMetaInfoWrapper.r();
                if (!(r == null ? false : r.getPreset()) && !q9s.INSTANCE.h()) {
                    TMSLogger.f(c(), "check manifest update async");
                    bbs bbsVar2 = this.b;
                    ckf.f(bbsVar2, "mInstance");
                    ges.a aVar11 = this.p;
                    ckf.d(aVar11);
                    ges.a aVar12 = this.p;
                    ckf.d(aVar12);
                    String c = aVar12.c();
                    ckf.d(c);
                    a9s b2 = b();
                    ckf.f(b2, wzi.LAUNCHER);
                    new ManifestASyncConcurrentStep(bbsVar2, aVar11, c, b2, this).a();
                } else {
                    TMSLogger.f(c(), "skip update manifest async");
                }
                if (d3 == null) {
                    ges.a aVar13 = this.p;
                    ygv c2 = zgvVar.c(aVar13 == null ? null : aVar13.d());
                    if (c2 != null) {
                        TMSLogger.a(c(), "get valid prefetchInfo");
                        a9s b3 = b();
                        pzh pzhVar3 = new pzh();
                        pzhVar3.r(c2);
                        b3.k(pzh.class, pzhVar3);
                        String str6 = this.e;
                        String str7 = this.d;
                        String str8 = this.c;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put((JSONObject) "prefetchId", (String) c2.b());
                        mcs.e(str6, "ON_GET_MAIN_DOCUMENT_PREFETCH", str7, str8, jSONObject2);
                        pzhVar2 = d3;
                        r2iVar = e;
                        r2iVar2 = null;
                        xhvVar = xhv.INSTANCE;
                        z = true;
                    }
                }
                ges.a aVar14 = this.p;
                ckf.d(aVar14);
                if (aVar14.k()) {
                    ges.a aVar15 = this.p;
                    ckf.d(aVar15);
                    Uri parse = Uri.parse(aVar15.d());
                    ckf.f(parse, "parse(baseInfo!!.originUrl)");
                    Uri parse2 = Uri.parse(h2.getUrl());
                    ckf.f(parse2, "parse(it.url)");
                    if (!gesVar.e(parse, parse2) && q9s.O()) {
                        g(eas.a.URL_NOT_MATCH);
                    }
                }
                String url = h2.getUrl();
                ges.a aVar16 = this.p;
                String c3 = ges.c(url, aVar16 == null ? null : aVar16.f(), null, null, 12, null);
                if (c3 == null) {
                    c3 = "";
                }
                String version = h2.getVersion();
                String renderer = h2.getRenderer();
                ges.a aVar17 = this.p;
                ckf.d(aVar17);
                bbs bbsVar3 = this.b;
                AppManifest r2 = tMSMetaInfoWrapper.r();
                boolean preset = r2 == null ? false : r2.getPreset();
                a9s b4 = b();
                ckf.f(bbsVar3, "mInstance");
                ckf.f(b4, wzi.LAUNCHER);
                pzhVar2 = d3;
                r2iVar = e;
                r2iVar2 = null;
                new a(bbsVar3, aVar17, c3, version, renderer, true, preset, false, b4, this, d3, 128, null).a();
                xhvVar = xhv.INSTANCE;
                z = true;
            }
            if (xhvVar == null) {
                TMSLogger.b(c(), "cannot get first page info for main document request");
                pzhVar = pzhVar2;
                o(r2iVar2, pzhVar);
            } else {
                pzhVar = pzhVar2;
            }
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            TMSLogger.a(c(), "has no valid local manifest cache");
            o(r2iVar, pzhVar);
        }
        l().X().onProperty("isManifestExpired", Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(tb.r2i r20, tb.pzh r21) {
        /*
            r19 = this;
            r14 = r19
            r15 = 1
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.themis.uniapp.solution.TMSResourceStepGroup.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001a
            java.lang.String r2 = "c7aac6e4"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r14
            r3[r15] = r20
            r0 = 2
            r3[r0] = r21
            r1.ipc$dispatch(r2, r3)
            return
        L_0x001a:
            tb.q9s r1 = tb.q9s.INSTANCE
            boolean r1 = r1.y2()
            if (r1 == 0) goto L_0x0030
            tb.ges$a r1 = r14.p
            tb.ckf.d(r1)
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x0030
            r16 = 1
            goto L_0x0032
        L_0x0030:
            r16 = 0
        L_0x0032:
            tb.ges$a r2 = r14.p
            tb.ckf.d(r2)
            tb.bbs r1 = r14.b
            java.lang.String r3 = r1.e0()
            tb.ges$a r0 = r14.p
            tb.ckf.d(r0)
            java.lang.String r5 = r0.h()
            tb.a9s r9 = r19.b()
            com.taobao.themis.uniapp.solution.TMSResourceStepGroup$a r13 = new com.taobao.themis.uniapp.solution.TMSResourceStepGroup$a
            java.lang.String r0 = "url"
            tb.ckf.f(r3, r0)
            java.lang.String r12 = "launcher"
            tb.ckf.f(r9, r12)
            r6 = 0
            r7 = 0
            r4 = 0
            r17 = 72
            r18 = 0
            r0 = r13
            r8 = r16
            r10 = r19
            r11 = r21
            r15 = r12
            r12 = r17
            r17 = r15
            r15 = r13
            r13 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.o = r15
            if (r16 == 0) goto L_0x0079
            r14.k(r15)
            goto L_0x00bb
        L_0x0079:
            com.taobao.themis.uniapp.solution.TMSResourceStepGroup$b r6 = new com.taobao.themis.uniapp.solution.TMSResourceStepGroup$b
            tb.bbs r1 = r14.b
            java.lang.String r0 = "mInstance"
            tb.ckf.f(r1, r0)
            tb.ges$a r2 = r14.p
            tb.ckf.d(r2)
            tb.a9s r3 = r19.b()
            r0 = r17
            tb.ckf.f(r3, r0)
            r0 = r6
            r4 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            r14.k(r6)
            tb.ges$a r0 = r14.p
            if (r0 != 0) goto L_0x00a1
            goto L_0x00b3
        L_0x00a1:
            boolean r0 = r0.l()
            r1 = 1
            if (r0 != r1) goto L_0x00b3
            tb.ges$a r0 = r14.p
            if (r0 != 0) goto L_0x00ad
            goto L_0x00bb
        L_0x00ad:
            boolean r0 = r0.b()
            if (r0 != r1) goto L_0x00bb
        L_0x00b3:
            com.taobao.themis.uniapp.solution.TMSResourceStepGroup$a r0 = r14.o
            tb.ckf.d(r0)
            r14.k(r0)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.uniapp.solution.TMSResourceStepGroup.o(tb.r2i, tb.pzh):void");
    }
}
