package tb;

import android.app.Application;
import android.net.Uri;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.alibity.container.file.FileAbility;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.launcher.step.TMSBasePageStep;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ace;
import tb.rwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class oes extends TMSBasePageStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f25334a;
        public final /* synthetic */ Ref$ObjectRef<InputStream> b;

        public a(CountDownLatch countDownLatch, Ref$ObjectRef<InputStream> ref$ObjectRef) {
            this.f25334a = countDownLatch;
            this.b = ref$ObjectRef;
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [java.io.ByteArrayInputStream, T] */
        @Override // tb.uq
        public void a(jr jrVar, boolean z) {
            Object obj;
            Map map;
            JSONObject a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
                return;
            }
            ByteBuffer byteBuffer = null;
            if (jrVar == null || (a2 = jrVar.a()) == null) {
                obj = null;
            } else {
                obj = a2.get("data");
            }
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                map = null;
            }
            if (map != null) {
                Ref$ObjectRef<InputStream> ref$ObjectRef = this.b;
                Object obj2 = map.get("data");
                if (obj2 instanceof ByteBuffer) {
                    byteBuffer = (ByteBuffer) obj2;
                }
                if (byteBuffer != null) {
                    ref$ObjectRef.element = new ByteArrayInputStream(byteBuffer.array());
                }
            }
            this.f25334a.countDown();
        }
    }

    static {
        t2o.a(834666604);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oes(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
    }

    public static /* synthetic */ Object ipc$super(oes oesVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/webgame/TMSWebGamePageStep");
    }

    public static final /* synthetic */ InputStream n(oes oesVar, String str, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("f2cc4f9d", new Object[]{oesVar, str, iTMSPage});
        }
        return oesVar.q(str, iTMSPage);
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMSWebGamePageStep";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBasePageStep
    public ITMSPage m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("2b198197", new Object[]{this});
        }
        rwd V = this.b.V();
        ckf.f(V, "mInstance.pageFactory");
        String p = p();
        JSONObject jSONObject = new JSONObject();
        Boolean bool = Boolean.TRUE;
        jSONObject.put((JSONObject) ccs.KEY_IS_HOME_PAGE, (String) bool);
        jSONObject.put((JSONObject) ccs.KEY_ENABLE_WEB_ASYNC_WEB_BRIDGE, (String) bool);
        jSONObject.put((JSONObject) ccs.KEY_WEEX_INIT_DATA, (String) this.b.c0().getExtraData().get(ccs.KEY_WEEX_INIT_DATA));
        xhv xhvVar = xhv.INSTANCE;
        ITMSPage a2 = rwd.a.a(V, p, null, jSONObject, null, 8, null);
        r(a2);
        this.b.W().a(a2);
        return a2;
    }

    public final String o(ITMSPage iTMSPage) {
        String H0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1514656", new Object[]{this, iTMSPage});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "solutionStart", this.b.S().h("instanceCreate"));
        jSONObject.put((JSONObject) "appinfoStart", this.b.S().h("appInfoStepStart"));
        jSONObject.put((JSONObject) "appinfoEnd", this.b.S().h("appInfoStepFinish"));
        jSONObject.put((JSONObject) "mainPkgStart", this.b.S().h("packageStepStart"));
        jSONObject.put((JSONObject) "mainPkgEnd", this.b.S().h("mainPackageFinish"));
        jSONObject.put((JSONObject) "mainPkgCached", this.b.S().f("MainPackageLocalZCache"));
        jSONObject.put((JSONObject) "assembleHtmlMark", this.b.S().h("firstPageRenderStart"));
        jSONObject.put((JSONObject) "removeLoadingMark", this.b.S().h("firstPageRenderSuccess"));
        jSONObject.put((JSONObject) "containerInitStart", this.b.S().h(mop.KEY_CONTAINER_START));
        pgd pgdVar = (pgd) iTMSPage.getExtension(pgd.class);
        String str = "";
        if (!(pgdVar == null || (H0 = pgdVar.H0()) == null)) {
            str = H0;
        }
        jSONObject.put((JSONObject) "falcoId", str);
        jSONObject.put((JSONObject) "memoryUsageLaunchStart", iTMSPage.getInstance().S().f("memoryUsageLaunchStart"));
        jSONObject.put((JSONObject) "nativeMemoryUsageLaunchStart", iTMSPage.getInstance().S().f("nativeMemoryUsageLaunchStart"));
        String jSONString = jSONObject.toJSONString();
        ckf.f(jSONString, "JSONObject().apply {\n   …\n        }.toJSONString()");
        return jSONString;
    }

    public final String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c181b872", new Object[]{this});
        }
        Uri parse = Uri.parse(this.b.e0());
        String queryParameter = parse.getQueryParameter("host");
        if (queryParameter == null) {
            queryParameter = q9s.INSTANCE.h4();
        }
        String uri = Uri.parse(queryParameter).buildUpon().encodedQuery(parse.getEncodedQuery()).build().toString();
        ckf.f(uri, "indexUrl.buildUpon().enc…Query).build().toString()");
        return uri;
    }

    public final InputStream q(String str, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("d17790c3", new Object[]{this, str, iTMSPage});
        }
        try {
            bbs instance = iTMSPage.getInstance();
            ekd ekdVar = (ekd) instance.getExtension(ekd.class);
            if (ekdVar == null) {
                return null;
            }
            if (tsq.I(str, "__package__/", false, 2, null)) {
                String I0 = wsq.I0(str, "__package__/", null, 2, null);
                c7o Y = ekdVar.Y(I0);
                if (Y != null) {
                    return Y.getStream();
                }
                c7o B = ekdVar.B(I0);
                if (B == null) {
                    return null;
                }
                return B.getStream();
            } else if (tsq.I(str, "__plugin__/", false, 2, null)) {
                List z0 = wsq.z0(str, new String[]{"/"}, false, 0, 6, null);
                if (z0.size() < 2) {
                    return null;
                }
                String str2 = (String) z0.get(1);
                c7o n = ekdVar.n(str2, wsq.I0(str, "__plugin__/" + str2 + wh6.DIR, null, 2, null));
                if (n == null) {
                    return null;
                }
                return n.getStream();
            } else if (!tsq.I(str, "__sandbox__/", false, 2, null)) {
                return null;
            } else {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                String p = ckf.p("file://", wsq.I0(str, "__sandbox__/", null, 2, null));
                Application applicationContext = ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext();
                ckf.f(applicationContext, "getNotNull(IEnvironmentS….java).applicationContext");
                bvl bvlVar = bvl.INSTANCE;
                String a2 = qml.a(iTMSPage);
                if (a2 == null) {
                    a2 = "";
                }
                String b2 = bvlVar.b(applicationContext, a2, p);
                ckf.f(b2, "INSTANCE.getRealPath(con…essId() ?: \"\", tempPath )");
                wc9.INSTANCE.g(instance, b2, new a(countDownLatch, ref$ObjectRef));
                countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
                return (InputStream) ref$ObjectRef.element;
            }
        } catch (Throwable th) {
            Throwable th2 = Result.m1111exceptionOrNullimpl(Result.m1108constructorimpl(kotlin.b.a(th)));
            if (th2 != null) {
                TMSLogger.d("Themis/Performance/Prerender", th2);
            }
            return null;
        }
    }

    public final void r(ITMSPage iTMSPage) {
        String str;
        c7o Y;
        String string;
        AppModel c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9e9fc9", new Object[]{this, iTMSPage});
            return;
        }
        rbe rbeVar = (rbe) iTMSPage.getExtension(rbe.class);
        if (rbeVar != null) {
            rbeVar.z(new b(iTMSPage, this));
        }
        TMSMetaInfoWrapper U = this.b.U();
        String str2 = "";
        if (U == null || (c2 = U.c()) == null || (str = JSON.toJSONString(c2)) == null) {
            str = str2;
        }
        ekd ekdVar = (ekd) this.b.getExtension(ekd.class);
        if (!(ekdVar == null || (Y = ekdVar.Y(RVConstants.FILE_APP_CONFIG)) == null || (string = Y.getString()) == null)) {
            str2 = string;
        }
        String o = o(iTMSPage);
        rbe rbeVar2 = (rbe) iTMSPage.getExtension(rbe.class);
        if (rbeVar2 != null) {
            rbeVar2.y(wsq.Q0("\n                (function() {\n                   window.$AppInfo=" + str + ";\n                   window.$AppConfig=" + str2 + ";\n                   window.$AppMark=" + o + ";\n                })()\n            ").toString());
        }
        rbe rbeVar3 = (rbe) iTMSPage.getExtension(rbe.class);
        if (rbeVar3 != null) {
            rbeVar3.setMegaHandler(new c(iTMSPage, this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements sbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f25335a;
        public final /* synthetic */ oes b;

        public b(ITMSPage iTMSPage, oes oesVar) {
            this.f25335a = iTMSPage;
            this.b = oesVar;
        }

        @Override // tb.sbe
        public WebResourceResponse t(WebResourceRequest webResourceRequest) {
            InputStream n;
            AppModel c;
            AppInfoModel appInfoModel;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WebResourceResponse) ipChange.ipc$dispatch("86a721d7", new Object[]{this, webResourceRequest});
            }
            ckf.g(webResourceRequest, "request");
            TMSMetaInfoWrapper U = this.f25335a.getInstance().U();
            String vhost = (U == null || (c = U.c()) == null || (appInfoModel = c.getAppInfoModel()) == null) ? null : appInfoModel.getVhost();
            if (vhost == null) {
                return null;
            }
            String uri = webResourceRequest.getUrl().toString();
            ckf.f(uri, "request.url.toString()");
            if (!tsq.I(uri, vhost, false, 2, null)) {
                return null;
            }
            String a2 = ncs.a(this.f25335a);
            String c2 = ncs.c(this.f25335a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "name", CredentialRpcData.ACTION_FETCH);
            jSONObject.put((JSONObject) "action", CredentialRpcData.ACTION_FETCH);
            jSONObject.put((JSONObject) "sync", (String) Boolean.FALSE);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "url", webResourceRequest.getUrl().toString());
            xhv xhvVar = xhv.INSTANCE;
            jSONObject.put((JSONObject) "extra", (String) jSONObject2);
            mcs.e(mcs.MODULE_JSBRIDGE, mcs.EVENT_ON_INVOKE, c2, a2, jSONObject);
            String encodedPath = webResourceRequest.getUrl().getEncodedPath();
            String r0 = encodedPath == null ? null : wsq.r0(encodedPath, "/");
            if (r0 == null || (n = oes.n(this.b, r0, this.f25335a)) == null) {
                return null;
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(ias.g(webResourceRequest.getUrl().toString()), "UTF-8", n);
            HashMap hashMap = new HashMap();
            hashMap.put("Themis-Package", "true");
            hashMap.put("Access-Control-Allow-Origin", "*");
            hashMap.put("Cross-Origin-Resource-Policy", "cross-origin");
            webResourceResponse.setResponseHeaders(hashMap);
            String c3 = ncs.c(this.f25335a);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put((JSONObject) "url", webResourceRequest.getUrl().toString());
            mcs.e(mcs.MODULE_JSBRIDGE, mcs.EVENT_ON_CALLBACK, c3, a2, jSONObject3);
            return webResourceResponse;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements ace.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f25336a;
        public final /* synthetic */ oes b;

        public c(ITMSPage iTMSPage, oes oesVar) {
            this.f25336a = iTMSPage;
            this.b = oesVar;
        }

        @Override // tb.ace.a
        public String a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("648dc2e2", new Object[]{this, str, str2, str3});
            }
            ckf.g(str, MUSMonitor.MODULE_DIM_ABILITY);
            ckf.g(str2, "api");
            ckf.g(str3, "options");
            String a2 = ncs.a(this.f25336a);
            String c = ncs.c(this.f25336a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "name", str + '.' + str2);
            jSONObject.put((JSONObject) "action", str + '.' + str2);
            jSONObject.put((JSONObject) "sync", (String) Boolean.TRUE);
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(mcs.MODULE_JSBRIDGE, mcs.EVENT_ON_INVOKE, c, a2, jSONObject);
            if (ckf.b(str, "File") && ckf.b(str2, FileAbility.API_READ_AS_STRING)) {
                JSONObject parseObject = JSON.parseObject(str3);
                ckf.f(parseObject, "parseObject(options)");
                String string = parseObject.getString("path");
                ckf.f(string, "params.getString(\"path\")");
                if (!wsq.a0(string) && !tsq.I(string, "file://", false, 2, null)) {
                    if (!tsq.I(string, "__package__/", false, 2, null)) {
                        string = ckf.p("__package__/", string);
                    }
                    InputStream n = oes.n(this.b, string, this.f25336a);
                    if (n != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put((JSONObject) "data", new String(hp2.c(n), uj3.UTF_8));
                        jSONObject2.put((JSONObject) "data", (String) jSONObject3);
                        jSONObject2.put((JSONObject) "statusCode", (String) 0);
                        String jSONString = jSONObject2.toJSONString();
                        ckf.f(jSONString, "JSONObject().apply {\n   …         }.toJSONString()");
                        return jSONString;
                    }
                }
            }
            ExecuteResult f = k8s.j().f(this.b.b, "canvas", qml.a(this.f25336a), null, str, str2, JSON.parseObject(str3));
            String c2 = ncs.c(this.f25336a);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put((JSONObject) "api", str + '.' + str2);
            mcs.e(mcs.MODULE_JSBRIDGE, mcs.EVENT_ON_CALLBACK, c2, a2, jSONObject4);
            if (f == null) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put((JSONObject) "errorMsg", "timeOut");
                String jSONString2 = jSONObject5.toJSONString();
                ckf.f(jSONString2, "JSONObject().apply {\n   …         }.toJSONString()");
                return jSONString2;
            }
            String jSONString3 = new JSONObject(f.toFormattedData()).toJSONString();
            ckf.f(jSONString3, "JSONObject(result.toForm…tedData()).toJSONString()");
            return jSONString3;
        }
    }
}
