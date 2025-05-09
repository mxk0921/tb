package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.request.AbsResponse;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.request.NextRpcRequest;
import com.alibaba.android.nextrpc.request.NextRpcResponseCallbackV2;
import com.alibaba.android.nextrpc.request.RemoteMainResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.weex.WXEnvironment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class svf implements jhc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String sParamsKeyDisableJSONParse = "disableJSONParse";
    public static final String sParamsKeyEnableCacheWeex1UA = "enableCacheWeex1UA";
    public static final String sParamsKeyEnableWeex2UA = "enableWeex2UA";

    /* renamed from: a  reason: collision with root package name */
    public a3k f28298a;
    public final String b;
    public final Context c;
    public Map<String, String> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements NextRpcResponseCallbackV2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kvf f28299a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ boolean c;

        public a(kvf kvfVar, JSONObject jSONObject, boolean z) {
            this.f28299a = kvfVar;
            this.b = jSONObject;
            this.c = z;
        }

        @Override // com.alibaba.android.nextrpc.request.NextRpcResponseCallbackV2
        public void d(int i, AbsResponse absResponse, List<AttachedResponse> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc616c53", new Object[]{this, new Integer(i), absResponse, list, new Boolean(z)});
            } else {
                svf.a(svf.this, this.f28299a, i, absResponse, list, z, this.b, this.c);
            }
        }
    }

    public svf(Context context, String str) {
        this.c = context;
        this.b = str;
    }

    public static /* synthetic */ void a(svf svfVar, kvf kvfVar, int i, AbsResponse absResponse, List list, boolean z, JSONObject jSONObject, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42dcc122", new Object[]{svfVar, kvfVar, new Integer(i), absResponse, list, new Boolean(z), jSONObject, new Boolean(z2)});
        } else {
            svfVar.g(kvfVar, i, absResponse, list, z, jSONObject, z2);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7e30e", new Object[]{this, str});
        } else if (this.f28298a == null) {
            this.f28298a = new y2k().d(this.c).e(str).b();
        }
    }

    public final JSONObject c(AbsResponse absResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e95a813e", new Object[]{this, absResponse});
        }
        JSONObject jSONObject = new JSONObject();
        if (absResponse instanceof RemoteMainResponse) {
            MtopResponse mtopResponse = ((RemoteMainResponse) absResponse).getMtopResponse();
            jSONObject.put("api", (Object) mtopResponse.getApi());
            jSONObject.put("v", (Object) mtopResponse.getV());
            jSONObject.put("result", (Object) mtopResponse.getRetCode());
        }
        return jSONObject;
    }

    public final MtopRequest e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("9a76437d", new Object[]{this, bVar});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(bVar.f28300a);
        mtopRequest.setVersion(bVar.b);
        mtopRequest.setNeedEcode(bVar.c);
        mtopRequest.setNeedSession(true);
        if (StringUtils.isNotBlank(bVar.i)) {
            mtopRequest.setData(bVar.i);
        }
        mtopRequest.dataParams = bVar.c();
        return mtopRequest;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        a3k a3kVar = this.f28298a;
        if (a3kVar != null) {
            a3kVar.destroy();
        }
    }

    public final MtopBusiness d(MtopRequest mtopRequest, b bVar, String str) {
        String str2;
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("36f59e40", new Object[]{this, mtopRequest, bVar, str});
        }
        if (StringUtils.isBlank(bVar.e)) {
            str2 = SDKConfig.getInstance().getGlobalTtid();
        } else {
            str2 = bVar.e;
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest, str2);
        build.showLoginUI(true ^ bVar.h.equals("AutoLoginOnly"));
        if (bVar.d > 0) {
            build.useWua();
        }
        if (bVar.g) {
            methodEnum = MethodEnum.POST;
        } else {
            methodEnum = MethodEnum.GET;
        }
        build.reqMethod(methodEnum);
        if (bVar.d() != null) {
            build.headers(bVar.d());
        }
        if (StringUtils.isNotBlank(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(HttpHeaderConstant.X_UA, str);
            build.headers((Map<String, String>) hashMap);
        }
        if (!StringUtils.isBlank(bVar.f) && ("json".equals(bVar.f) || "originaljson".equals(bVar.f))) {
            build.setJsonType(JsonTypeEnum.valueOf(bVar.f.toUpperCase()));
        }
        try {
            if (!TextUtils.isEmpty(bVar.j)) {
                build.setPageUrl(bVar.j);
            }
        } catch (Throwable unused) {
        }
        if (!StringUtils.isBlank(bVar.l)) {
            build.setCustomDomain(bVar.l);
        }
        try {
            if (!TextUtils.isEmpty(bVar.k)) {
                build.setPageName(bVar.k);
            }
        } catch (Throwable unused2) {
        }
        build.setBizTopic(bVar.m);
        build.upstreamCompress(bVar.n);
        return build;
    }

    public void i(String str, kvf kvfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e862a8f6", new Object[]{this, str, kvfVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("wxExecute", (Object) Long.valueOf(System.currentTimeMillis()));
        try {
            try {
                if (this.f28298a == null) {
                    UnifyLog.j(this.b, "nextRpc don't bind!!!", new Object[0]);
                    if (kvfVar != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("error", (Object) "nextRpc don't bind!!!");
                        kvfVar.invoke(jSONObject2);
                        return;
                    }
                    return;
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(str);
                b h = h(jSONObject3);
                if (h == null) {
                    UnifyLog.j(this.b, "parse Param error", new Object[0]);
                    if (kvfVar != null) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("error", (Object) "parse Param error");
                        kvfVar.invoke(jSONObject4);
                        return;
                    }
                    return;
                }
                MtopRequest e = e(h);
                String optString = jSONObject3.optString("userAgent");
                if (TextUtils.isEmpty(optString)) {
                    if (jSONObject3.optBoolean(sParamsKeyEnableWeex2UA, false)) {
                        optString = com.taobao.android.weex.b.d().getUserAgent();
                    } else {
                        try {
                            if (!jSONObject3.optBoolean(sParamsKeyEnableCacheWeex1UA, false)) {
                                this.d = WXEnvironment.getConfig();
                            } else if (this.d == null) {
                                this.d = WXEnvironment.getConfig();
                            }
                            optString = nuw.a(this.c, this.d);
                        } catch (Throwable th) {
                            UnifyLog.d(this.b, "userAgent get error msg=" + th.getMessage(), new Object[0]);
                        }
                    }
                }
                NextRpcRequest nextRpcRequest = new NextRpcRequest(d(e, h, optString), 1000.0d, NextRpcRequest.AttachedResponseStrategy.getStrategyByOrdinal(jSONObject3.optInt("attachedStrategy")));
                nextRpcRequest.setClientPerformance(jSONObject);
                this.f28298a.a(nextRpcRequest, new a(kvfVar, jSONObject, jSONObject3.optBoolean(sParamsKeyDisableJSONParse, false)));
            } catch (Exception e2) {
                String str2 = "send Request failed" + e2.getMessage();
                UnifyLog.d(this.b, str2, new Object[0]);
                if (str2 != null && kvfVar != null) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("error", (Object) str2);
                    kvfVar.invoke(jSONObject5);
                }
            }
        } catch (Throwable th2) {
            if (!(0 == 0 || kvfVar == null)) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("error", (Object) null);
                kvfVar.invoke(jSONObject6);
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    public final void g(kvf kvfVar, int i, AbsResponse absResponse, List<AttachedResponse> list, boolean z, JSONObject jSONObject, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393c0ac", new Object[]{this, kvfVar, new Integer(i), absResponse, list, new Boolean(z), jSONObject, new Boolean(z2)});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (AttachedResponse attachedResponse : list) {
                    Object body = attachedResponse.getBody();
                    if (!z2) {
                        body = JSON.parse(body);
                    }
                    jSONArray.add(body);
                }
            }
            jSONObject2.put("responseType", Integer.valueOf(i));
            if (!jSONArray.isEmpty()) {
                jSONObject2.put("attachedResponses", (Object) jSONArray);
            }
            if (i == 1 && absResponse != null && !TextUtils.isEmpty(absResponse.getBody())) {
                String body2 = absResponse.getBody();
                jSONObject2.put("mainResponse", z2 ? body2 : JSON.parse(body2));
            } else if (i == -1) {
                jSONObject2.put("mainResponse", c(absResponse));
            }
        } catch (Exception e) {
            String str = this.b;
            UnifyLog.j(str, "jsonResult parse error msg=" + e.getMessage(), new Object[0]);
        }
        if (jSONObject != null) {
            jSONObject.put("wxCallback", (Object) Long.valueOf(System.currentTimeMillis()));
            jSONObject2.put("performance", (Object) jSONObject);
        }
        if (kvfVar == 0) {
            return;
        }
        if (z) {
            kvfVar.invoke(jSONObject2);
        } else {
            kvfVar.invokeAndKeepAlive(jSONObject2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f28300a;
        public String b;
        public boolean c;
        public int d;
        public String e;
        public String f;
        public boolean g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public boolean n;
        public final Map<String, String> o;
        public Map<String, String> p;

        public b() {
            this.d = -1;
            this.o = new HashMap();
            this.p = null;
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34725f06", new Object[]{this, str, str2});
            } else {
                ((HashMap) this.o).put(str, str2);
            }
        }

        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8f9a6a9", new Object[]{this, str, str2});
                return;
            }
            if (this.p == null) {
                this.p = new HashMap();
            }
            this.p.put(str, str2);
        }

        public Map<String, String> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("c3847098", new Object[]{this});
            }
            return this.o;
        }

        public Map<String, String> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
            }
            return this.p;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[Catch: JSONException -> 0x0190, TryCatch #0 {JSONException -> 0x0190, blocks: (B:7:0x0033, B:10:0x0057, B:13:0x005e, B:15:0x0066, B:16:0x006f, B:20:0x0078, B:21:0x007b, B:22:0x0085, B:24:0x00a8, B:25:0x00ad, B:27:0x00b3, B:28:0x00b8, B:32:0x00c3, B:34:0x00cb, B:35:0x00d3, B:36:0x00d7, B:38:0x00e8, B:39:0x00f1, B:40:0x00f6, B:42:0x0107, B:43:0x010c, B:45:0x0115, B:46:0x0119, B:48:0x011f, B:50:0x0134, B:52:0x0138, B:53:0x0140, B:54:0x0146, B:56:0x014e, B:57:0x0152, B:59:0x0158, B:61:0x0168, B:64:0x016f, B:65:0x0173, B:67:0x017c, B:68:0x017e), top: B:72:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad A[Catch: JSONException -> 0x0190, TryCatch #0 {JSONException -> 0x0190, blocks: (B:7:0x0033, B:10:0x0057, B:13:0x005e, B:15:0x0066, B:16:0x006f, B:20:0x0078, B:21:0x007b, B:22:0x0085, B:24:0x00a8, B:25:0x00ad, B:27:0x00b3, B:28:0x00b8, B:32:0x00c3, B:34:0x00cb, B:35:0x00d3, B:36:0x00d7, B:38:0x00e8, B:39:0x00f1, B:40:0x00f6, B:42:0x0107, B:43:0x010c, B:45:0x0115, B:46:0x0119, B:48:0x011f, B:50:0x0134, B:52:0x0138, B:53:0x0140, B:54:0x0146, B:56:0x014e, B:57:0x0152, B:59:0x0158, B:61:0x0168, B:64:0x016f, B:65:0x0173, B:67:0x017c, B:68:0x017e), top: B:72:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb A[Catch: JSONException -> 0x0190, TryCatch #0 {JSONException -> 0x0190, blocks: (B:7:0x0033, B:10:0x0057, B:13:0x005e, B:15:0x0066, B:16:0x006f, B:20:0x0078, B:21:0x007b, B:22:0x0085, B:24:0x00a8, B:25:0x00ad, B:27:0x00b3, B:28:0x00b8, B:32:0x00c3, B:34:0x00cb, B:35:0x00d3, B:36:0x00d7, B:38:0x00e8, B:39:0x00f1, B:40:0x00f6, B:42:0x0107, B:43:0x010c, B:45:0x0115, B:46:0x0119, B:48:0x011f, B:50:0x0134, B:52:0x0138, B:53:0x0140, B:54:0x0146, B:56:0x014e, B:57:0x0152, B:59:0x0158, B:61:0x0168, B:64:0x016f, B:65:0x0173, B:67:0x017c, B:68:0x017e), top: B:72:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3 A[Catch: JSONException -> 0x0190, TryCatch #0 {JSONException -> 0x0190, blocks: (B:7:0x0033, B:10:0x0057, B:13:0x005e, B:15:0x0066, B:16:0x006f, B:20:0x0078, B:21:0x007b, B:22:0x0085, B:24:0x00a8, B:25:0x00ad, B:27:0x00b3, B:28:0x00b8, B:32:0x00c3, B:34:0x00cb, B:35:0x00d3, B:36:0x00d7, B:38:0x00e8, B:39:0x00f1, B:40:0x00f6, B:42:0x0107, B:43:0x010c, B:45:0x0115, B:46:0x0119, B:48:0x011f, B:50:0x0134, B:52:0x0138, B:53:0x0140, B:54:0x0146, B:56:0x014e, B:57:0x0152, B:59:0x0158, B:61:0x0168, B:64:0x016f, B:65:0x0173, B:67:0x017c, B:68:0x017e), top: B:72:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8 A[Catch: JSONException -> 0x0190, TryCatch #0 {JSONException -> 0x0190, blocks: (B:7:0x0033, B:10:0x0057, B:13:0x005e, B:15:0x0066, B:16:0x006f, B:20:0x0078, B:21:0x007b, B:22:0x0085, B:24:0x00a8, B:25:0x00ad, B:27:0x00b3, B:28:0x00b8, B:32:0x00c3, B:34:0x00cb, B:35:0x00d3, B:36:0x00d7, B:38:0x00e8, B:39:0x00f1, B:40:0x00f6, B:42:0x0107, B:43:0x010c, B:45:0x0115, B:46:0x0119, B:48:0x011f, B:50:0x0134, B:52:0x0138, B:53:0x0140, B:54:0x0146, B:56:0x014e, B:57:0x0152, B:59:0x0158, B:61:0x0168, B:64:0x016f, B:65:0x0173, B:67:0x017c, B:68:0x017e), top: B:72:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1 A[Catch: JSONException -> 0x0190, TryCatch #0 {JSONException -> 0x0190, blocks: (B:7:0x0033, B:10:0x0057, B:13:0x005e, B:15:0x0066, B:16:0x006f, B:20:0x0078, B:21:0x007b, B:22:0x0085, B:24:0x00a8, B:25:0x00ad, B:27:0x00b3, B:28:0x00b8, B:32:0x00c3, B:34:0x00cb, B:35:0x00d3, B:36:0x00d7, B:38:0x00e8, B:39:0x00f1, B:40:0x00f6, B:42:0x0107, B:43:0x010c, B:45:0x0115, B:46:0x0119, B:48:0x011f, B:50:0x0134, B:52:0x0138, B:53:0x0140, B:54:0x0146, B:56:0x014e, B:57:0x0152, B:59:0x0158, B:61:0x0168, B:64:0x016f, B:65:0x0173, B:67:0x017c, B:68:0x017e), top: B:72:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107 A[Catch: JSONException -> 0x0190, TryCatch #0 {JSONException -> 0x0190, blocks: (B:7:0x0033, B:10:0x0057, B:13:0x005e, B:15:0x0066, B:16:0x006f, B:20:0x0078, B:21:0x007b, B:22:0x0085, B:24:0x00a8, B:25:0x00ad, B:27:0x00b3, B:28:0x00b8, B:32:0x00c3, B:34:0x00cb, B:35:0x00d3, B:36:0x00d7, B:38:0x00e8, B:39:0x00f1, B:40:0x00f6, B:42:0x0107, B:43:0x010c, B:45:0x0115, B:46:0x0119, B:48:0x011f, B:50:0x0134, B:52:0x0138, B:53:0x0140, B:54:0x0146, B:56:0x014e, B:57:0x0152, B:59:0x0158, B:61:0x0168, B:64:0x016f, B:65:0x0173, B:67:0x017c, B:68:0x017e), top: B:72:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c A[Catch: JSONException -> 0x0190, TryCatch #0 {JSONException -> 0x0190, blocks: (B:7:0x0033, B:10:0x0057, B:13:0x005e, B:15:0x0066, B:16:0x006f, B:20:0x0078, B:21:0x007b, B:22:0x0085, B:24:0x00a8, B:25:0x00ad, B:27:0x00b3, B:28:0x00b8, B:32:0x00c3, B:34:0x00cb, B:35:0x00d3, B:36:0x00d7, B:38:0x00e8, B:39:0x00f1, B:40:0x00f6, B:42:0x0107, B:43:0x010c, B:45:0x0115, B:46:0x0119, B:48:0x011f, B:50:0x0134, B:52:0x0138, B:53:0x0140, B:54:0x0146, B:56:0x014e, B:57:0x0152, B:59:0x0158, B:61:0x0168, B:64:0x016f, B:65:0x0173, B:67:0x017c, B:68:0x017e), top: B:72:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115 A[Catch: JSONException -> 0x0190, TryCatch #0 {JSONException -> 0x0190, blocks: (B:7:0x0033, B:10:0x0057, B:13:0x005e, B:15:0x0066, B:16:0x006f, B:20:0x0078, B:21:0x007b, B:22:0x0085, B:24:0x00a8, B:25:0x00ad, B:27:0x00b3, B:28:0x00b8, B:32:0x00c3, B:34:0x00cb, B:35:0x00d3, B:36:0x00d7, B:38:0x00e8, B:39:0x00f1, B:40:0x00f6, B:42:0x0107, B:43:0x010c, B:45:0x0115, B:46:0x0119, B:48:0x011f, B:50:0x0134, B:52:0x0138, B:53:0x0140, B:54:0x0146, B:56:0x014e, B:57:0x0152, B:59:0x0158, B:61:0x0168, B:64:0x016f, B:65:0x0173, B:67:0x017c, B:68:0x017e), top: B:72:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e A[Catch: JSONException -> 0x0190, TryCatch #0 {JSONException -> 0x0190, blocks: (B:7:0x0033, B:10:0x0057, B:13:0x005e, B:15:0x0066, B:16:0x006f, B:20:0x0078, B:21:0x007b, B:22:0x0085, B:24:0x00a8, B:25:0x00ad, B:27:0x00b3, B:28:0x00b8, B:32:0x00c3, B:34:0x00cb, B:35:0x00d3, B:36:0x00d7, B:38:0x00e8, B:39:0x00f1, B:40:0x00f6, B:42:0x0107, B:43:0x010c, B:45:0x0115, B:46:0x0119, B:48:0x011f, B:50:0x0134, B:52:0x0138, B:53:0x0140, B:54:0x0146, B:56:0x014e, B:57:0x0152, B:59:0x0158, B:61:0x0168, B:64:0x016f, B:65:0x0173, B:67:0x017c, B:68:0x017e), top: B:72:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c A[Catch: JSONException -> 0x0190, TryCatch #0 {JSONException -> 0x0190, blocks: (B:7:0x0033, B:10:0x0057, B:13:0x005e, B:15:0x0066, B:16:0x006f, B:20:0x0078, B:21:0x007b, B:22:0x0085, B:24:0x00a8, B:25:0x00ad, B:27:0x00b3, B:28:0x00b8, B:32:0x00c3, B:34:0x00cb, B:35:0x00d3, B:36:0x00d7, B:38:0x00e8, B:39:0x00f1, B:40:0x00f6, B:42:0x0107, B:43:0x010c, B:45:0x0115, B:46:0x0119, B:48:0x011f, B:50:0x0134, B:52:0x0138, B:53:0x0140, B:54:0x0146, B:56:0x014e, B:57:0x0152, B:59:0x0158, B:61:0x0168, B:64:0x016f, B:65:0x0173, B:67:0x017c, B:68:0x017e), top: B:72:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.svf.b h(org.json.JSONObject r17) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.svf.h(org.json.JSONObject):tb.svf$b");
    }
}
