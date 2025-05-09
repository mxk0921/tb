package com.taobao.tao.recommend3.gateway.request;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKUtils;
import tb.a3b;
import tb.bqa;
import tb.ddv;
import tb.dvh;
import tb.es8;
import tb.f0b;
import tb.f4b;
import tb.fdv;
import tb.hrg;
import tb.m3o;
import tb.m5a;
import tb.mxl;
import tb.mza;
import tb.p6j;
import tb.phg;
import tb.q4a;
import tb.qy8;
import tb.r5a;
import tb.t2o;
import tb.uqa;
import tb.v5o;
import tb.vxl;
import tb.vxm;
import tb.yqm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RequestTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_CODE = "SUCCESS";
    public static final String EXT_KEY_HOMESIGNFREEAB = "homeSignFreeAb";
    public static final String HOME_SIGN_FREE_API_NAME = "mtop.taobao.wireless.home.newface.awesome.newget";
    public static final String UT_DEFAULT_CODE = "-1";

    /* renamed from: a  reason: collision with root package name */
    public RemoteBusiness f12648a;
    public final AwesomeGetRequestParams b;
    public final es8 c;
    public m3o d;
    public Map<String, String> e;
    public String f;
    public String g;
    public final f0b h;
    public long j;
    public String k;
    public final AwesomeMtopListener l = new AwesomeMtopListener();
    public final yqm i = new yqm();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class AwesomeMtopListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729809745);
            t2o.a(589299719);
        }

        public AwesomeMtopListener() {
        }

        private String getCurrentPageNum() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f00af7c5", new Object[]{this});
            }
            RequestTask requestTask = RequestTask.this;
            Map<String, AwesomeGetContainerParams> map = requestTask.b.containerParams;
            if (map == null) {
                uqa.b("MTopRequest", "commitScrollNextPageError", "containerParams == null");
                return "-1";
            }
            AwesomeGetContainerParams awesomeGetContainerParams = map.get(a3b.h(requestTask.k()));
            if (awesomeGetContainerParams == null) {
                uqa.b("MTopRequest", "commitScrollNextPageError", "awesomeGetContainerParams == null");
                return "-1";
            }
            AwesomeGetPageData awesomeGetPageData = awesomeGetContainerParams.pageParams;
            if (awesomeGetPageData != null) {
                return String.valueOf(awesomeGetPageData.pageNum);
            }
            uqa.b("MTopRequest", "commitScrollNextPageError", "pageData == null");
            return "-1";
        }

        private String translateErrorCode(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("79a4614d", new Object[]{this, mtopResponse});
            }
            String retCode = mtopResponse.getRetCode();
            if (!TextUtils.equals("SUCCESS", retCode)) {
                return retCode;
            }
            String[] ret = mtopResponse.getRet();
            if (ret.length < 1) {
                return retCode;
            }
            String str = ret[0];
            int indexOf = str.indexOf("::");
            if (indexOf > 0) {
                return str.substring(0, indexOf);
            }
            return retCode;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                onError(i, mtopResponse, obj);
            }
        }

        private void commitScrollNextPageError(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec42af8e", new Object[]{this, mtopResponse});
            } else if (TextUtils.equals(RequestTask.this.f, "scrollNextPage")) {
                if (mtopResponse == null) {
                    uqa.b("MTopRequest", "commitScrollNextPageError", "response == null");
                    return;
                }
                uqa.b("MTopRequest", "commitScrollNextPageError", "出现异常，没有下发数据" + mtopResponse.toString());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) mtopResponse.getRetCode());
                jSONObject.put("errorMsg", (Object) mtopResponse.getRetMsg());
                jSONObject.put("pageNum", (Object) getCurrentPageNum());
                jSONObject.put("s-rt", (Object) "-1");
                jSONObject.put("eagleeye-traceid", (Object) "-1");
                Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
                if (headerFields == null || headerFields.isEmpty()) {
                    r5a.h("Page_Home", 19999, "ScrollNextPageRequestError", jSONObject);
                    return;
                }
                List<String> list = headerFields.get("s-rt");
                if (list != null) {
                    jSONObject.put("s-rt", (Object) list.get(0));
                }
                List<String> list2 = headerFields.get("EagleEye-TraceId");
                if (list2 != null) {
                    jSONObject.put("eagleeye-traceid", (Object) list2.get(0));
                }
                r5a.h("Page_Home", 19999, "ScrollNextPageRequestError", jSONObject);
            }
        }

        private void traceMtopEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e338a75", new Object[]{this});
            } else if (TextUtils.equals(RequestTask.this.f, "coldStart")) {
                RequestTask.this.h.c("mtopRequest");
                RequestTask.this.h.p("homeDataProcess", 1);
            }
        }

        private boolean isResponseEmpty(BaseOutDo baseOutDo) {
            AwesomeGetData data;
            Map<String, AwesomeGetContainerData> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e8fc1675", new Object[]{this, baseOutDo})).booleanValue();
            }
            if (baseOutDo == null || baseOutDo.getData() == null || !(baseOutDo instanceof AwesomeGetResponse) || (data = ((AwesomeGetResponse) baseOutDo).getData()) == null || (map = data.containers) == null || map.isEmpty()) {
                return true;
            }
            boolean z = true;
            for (AwesomeGetContainerData awesomeGetContainerData : data.containers.values()) {
                if (awesomeGetContainerData.getBaseData() == null && awesomeGetContainerData.getDeltaData() == null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    break;
                }
            }
            return z;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            dvh.f("resp_wait", false, RequestTask.a(RequestTask.this));
            dvh.b("resp_process", RequestTask.a(RequestTask.this));
            RequestTask requestTask = RequestTask.this;
            if (requestTask.r(requestTask.f, mtopResponse)) {
                RequestTask.c(RequestTask.this, mtopResponse);
                RequestTask requestTask2 = RequestTask.this;
                RequestTask.d(requestTask2, requestTask2.d, requestTask2.e, true);
                return;
            }
            traceMtopEnd();
            commitScrollNextPageError(mtopResponse);
            dvh.f("resp_process", true, RequestTask.a(RequestTask.this));
            process(false, null, mtopResponse, obj);
            RequestTask.c(RequestTask.this, mtopResponse);
            if (!TextUtils.isEmpty(RequestTask.a(RequestTask.this))) {
                dvh.m("errorCode", mtopResponse.getRetCode(), RequestTask.a(RequestTask.this));
                dvh.m("errorMsg", mtopResponse.getRetMsg(), RequestTask.a(RequestTask.this));
                dvh.g(RequestTask.a(RequestTask.this), false);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            AwesomeGetResponse d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            dvh.f("resp_wait", true, RequestTask.a(RequestTask.this));
            dvh.b("resp_process", RequestTask.a(RequestTask.this));
            String str = (mtopResponse == null || mtopResponse.getMtopStat() == null) ? null : mtopResponse.getMtopStat().falcoId;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (TextUtils.equals(RequestTask.this.f, "coldStart")) {
                if (mtopResponse != null) {
                    dvh.n("cold_start_api", mtopResponse.getApi());
                }
                if (vxl.l() && (d = mxl.d()) != null) {
                    baseOutDo = d;
                }
            }
            traceMtopEnd();
            if (isResponseEmpty(baseOutDo)) {
                commitScrollNextPageError(mtopResponse);
                dvh.f("resp_process", true, RequestTask.a(RequestTask.this));
                process(false, null, mtopResponse, obj);
                hrg.c(fdv.F_NETWORK_REQUEST, "result_error", "网络请求结果数据为空", "gateway.RequestTask", "response is empty");
                return;
            }
            RequestTask.b(RequestTask.this, mtopResponse, str, uptimeMillis);
            dvh.f("resp_process", true, RequestTask.a(RequestTask.this));
            AwesomeGetResponse awesomeGetResponse = (AwesomeGetResponse) baseOutDo;
            process(true, awesomeGetResponse.getData(), mtopResponse, obj);
            RequestTask.this.g(awesomeGetResponse.getData());
            if (awesomeGetResponse.getData() != null) {
                mza.d().i(awesomeGetResponse.getData().getExt());
            }
            RequestTask.c(RequestTask.this, mtopResponse);
            if (!TextUtils.isEmpty(RequestTask.a(RequestTask.this))) {
                dvh.g(RequestTask.a(RequestTask.this), true);
            }
        }

        private void process(boolean z, AwesomeGetData awesomeGetData, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b508e122", new Object[]{this, new Boolean(z), awesomeGetData, mtopResponse, obj});
                return;
            }
            dvh.b("resp_bizcb", RequestTask.a(RequestTask.this));
            if (z) {
                m3o m3oVar = RequestTask.this.d;
                if (m3oVar != null) {
                    m3oVar.a(awesomeGetData);
                    dvh.f("resp_bizcb", true, RequestTask.a(RequestTask.this));
                    if (mtopResponse != null) {
                        ddv.m(mtopResponse.getApi(), mtopResponse.getV(), null);
                    }
                }
            } else {
                if (mtopResponse != null) {
                    if (!TextUtils.isEmpty(mtopResponse.getMtopStat().fullTraceId)) {
                        ddv.k(mtopResponse.getApi(), mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), "fullTraceID", mtopResponse.getMtopStat().fullTraceId);
                    } else {
                        ddv.k(mtopResponse.getApi(), mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), null, null);
                    }
                }
                if (!(RequestTask.this.d == null || mtopResponse == null)) {
                    RequestTask.this.d.error(translateErrorCode(mtopResponse), mtopResponse.getRetMsg());
                    dvh.f("resp_bizcb", false, RequestTask.a(RequestTask.this));
                }
            }
            TLog.logd("gateway2-RequestTask.process", mtopResponse.getRetCode() + "," + mtopResponse.getApi());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopResponse f12649a;
        public final /* synthetic */ JSONObject b;

        public a(MtopResponse mtopResponse, JSONObject jSONObject) {
            this.f12649a = mtopResponse;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!vxl.b().a()) {
                RequestTask.e(RequestTask.this, this.f12649a);
            }
            v5o.a(this.f12649a, this.b);
        }
    }

    static {
        t2o.a(729809743);
    }

    public RequestTask(AwesomeGetRequestParams awesomeGetRequestParams, es8 es8Var) {
        this.b = awesomeGetRequestParams;
        this.c = es8Var;
        this.h = a3b.i(awesomeGetRequestParams.containerParams.keySet());
        this.g = awesomeGetRequestParams.API_NAME;
    }

    public static /* synthetic */ String a(RequestTask requestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33e5f0e7", new Object[]{requestTask});
        }
        return requestTask.k;
    }

    public static /* synthetic */ void b(RequestTask requestTask, MtopResponse mtopResponse, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c745cdd", new Object[]{requestTask, mtopResponse, str, new Long(j)});
        } else {
            requestTask.n(mtopResponse, str, j);
        }
    }

    public static /* synthetic */ void c(RequestTask requestTask, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1461c", new Object[]{requestTask, mtopResponse});
        } else {
            requestTask.p(mtopResponse);
        }
    }

    public static /* synthetic */ void d(RequestTask requestTask, m3o m3oVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f62b69", new Object[]{requestTask, m3oVar, map, new Boolean(z)});
        } else {
            requestTask.j(m3oVar, map, z);
        }
    }

    public static /* synthetic */ void e(RequestTask requestTask, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a4d5da", new Object[]{requestTask, mtopResponse});
        } else {
            requestTask.f(mtopResponse);
        }
    }

    public final void f(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6cfb43", new Object[]{this, mtopResponse});
            return;
        }
        try {
            hrg.e(fdv.F_NETWORK_REQUEST, "gateway.RequestTask", "AwesomeGetRequestParams ：" + JSON.toJSONString(this.b) + " ---- result : " + new String(mtopResponse.getBytedata()));
        } catch (OutOfMemoryError unused) {
            hrg.c(fdv.F_NETWORK_REQUEST, "gateway.RequestTask", "oom, no log.", "", "");
        } catch (Throwable th) {
            hrg.c(fdv.F_NETWORK_REQUEST, "gateway.RequestTask", "log error, no log.", "", th.getMessage());
        }
    }

    public void g(AwesomeGetData awesomeGetData) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd875133", new Object[]{this, awesomeGetData});
        } else if (awesomeGetData != null && awesomeGetData.getExt() != null) {
            if (awesomeGetData.getExt().containsKey(EXT_KEY_HOMESIGNFREEAB)) {
                str = awesomeGetData.getExt().getString(EXT_KEY_HOMESIGNFREEAB);
                bqa.d("gateway.RequestTask", "cacheSignFreeAbValue: " + str);
            } else {
                str = "false";
            }
            qy8.b.g("homepage_switch", EXT_KEY_HOMESIGNFREEAB, TextUtils.equals("true", str));
            ddv.n("sign_free_error_code", str);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745ee826", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.f12648a;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
    }

    public void i(m3o m3oVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25562b11", new Object[]{this, m3oVar, map});
        } else {
            j(m3oVar, map, false);
        }
    }

    public Set<String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("e98c6fe3", new Object[]{this});
        }
        return this.b.containerParams.keySet();
    }

    public String l(String str) {
        Map<String, AwesomeGetContainerParams> map;
        AwesomeGetContainerParams awesomeGetContainerParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b500d9c", new Object[]{this, str});
        }
        AwesomeGetRequestParams awesomeGetRequestParams = this.b;
        if (awesomeGetRequestParams == null || (map = awesomeGetRequestParams.containerParams) == null || (awesomeGetContainerParams = map.get(str)) == null) {
            return "";
        }
        return awesomeGetContainerParams.requestType;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f8429b0", new Object[]{this});
        }
        return this.c.f18788a;
    }

    public final void p(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab09188", new Object[]{this, mtopResponse});
            return;
        }
        JSONObject c = v5o.c(this.b);
        if (this.b != null && mtopResponse != null && mtopResponse.getMtopStat() != null) {
            Coordinator.execute(new a(mtopResponse, c));
        }
    }

    public boolean q(String str, String str2) {
        Map<String, AwesomeGetContainerParams> map;
        AwesomeGetContainerParams awesomeGetContainerParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5fe3068", new Object[]{this, str, str2})).booleanValue();
        }
        AwesomeGetRequestParams awesomeGetRequestParams = this.b;
        if (awesomeGetRequestParams == null || (map = awesomeGetRequestParams.containerParams) == null || (awesomeGetContainerParams = map.get(str2)) == null) {
            return false;
        }
        return str.equals(awesomeGetContainerParams.requestType);
    }

    public final void n(MtopResponse mtopResponse, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee33a71", new Object[]{this, mtopResponse, str, new Long(j)});
        } else if (mtopResponse != null && mtopResponse.getHeaderFields() != null) {
            List<String> list = mtopResponse.getHeaderFields().get("s-rt");
            String str2 = "0";
            String str3 = (list == null || list.size() <= 0) ? str2 : list.get(0);
            List<String> list2 = mtopResponse.getHeaderFields().get(HttpHeaderConstant.X_BIN_LENGTH);
            if (list2 != null && list2.size() > 0) {
                str2 = list2.get(0);
            }
            List<String> list3 = mtopResponse.getHeaderFields().get("EagleEye-TraceId");
            String str4 = (list3 == null || list3.size() <= 0) ? null : list3.get(0);
            HashMap hashMap = new HashMap();
            hashMap.put("eyeTraceid", str4);
            hashMap.put("falcoId", str);
            hashMap.put("serverRT", str3);
            hashMap.put("responseLength", str2);
            hashMap.put("homeApi", this.b.API_NAME);
            if (TextUtils.equals(this.f, "coldStart")) {
                vxm.b.e().a("homeApi", this.b.API_NAME);
            }
            p6j.b(this.f, p6j.MTOP_STAGE_NETWORKREQUEST, 0L, j - this.j, hashMap, false);
        }
    }

    public final boolean o(String str) {
        Map<String, AwesomeGetContainerParams> map;
        AwesomeGetContainerParams awesomeGetContainerParams;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31b1911d", new Object[]{this, str})).booleanValue();
        }
        AwesomeGetRequestParams awesomeGetRequestParams = this.b;
        if (awesomeGetRequestParams == null || (map = awesomeGetRequestParams.containerParams) == null || (awesomeGetContainerParams = map.get(str)) == null || (jSONObject = awesomeGetContainerParams.bizParams) == null || jSONObject.isEmpty()) {
            return false;
        }
        return awesomeGetContainerParams.bizParams.getBooleanValue("needAddSign");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:19|54|20|(6:22|58|24|(1:26)|28|(1:30)(8:31|(7:56|33|(1:36)|37|(3:39|(4:42|(3:61|44|64)(1:63)|62|40)|60)|45|(1:47)(2:48|(1:50)(1:51)))|34|(0)|37|(0)|45|(0)(0)))|23|58|24|(0)|28|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075 A[Catch: NumberFormatException -> 0x007a, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x007a, blocks: (B:24:0x006f, B:26:0x0075), top: B:58:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String s(boolean r12) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.recommend3.gateway.request.RequestTask.s(boolean):java.lang.String");
    }

    public final void j(m3o m3oVar, Map<String, String> map, boolean z) {
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("856fe9e3", new Object[]{this, m3oVar, map, new Boolean(z)});
            return;
        }
        this.d = m3oVar;
        this.e = map;
        if (k().size() != 0) {
            String c = dvh.c(dvh.TASK_GATEWAY_REQUEST);
            this.k = c;
            dvh.b("req_prepare", c);
            String l = l(k().iterator().next());
            this.f = l;
            dvh.m("requestType", l, this.k);
            if (z || !TextUtils.equals(this.f, "coldStart")) {
                this.b.API_NAME = this.g;
            } else {
                String s = s(false);
                if (TextUtils.equals(s, "code_sign_free")) {
                    this.b.API_NAME = HOME_SIGN_FREE_API_NAME;
                } else {
                    bqa.d("gateway.RequestTask", "SignFree code value:" + s);
                    vxm.b.e().a("sign_free_error_code", s);
                    ddv.n("sign_free_error_code", s);
                }
                if (TextUtils.equals(s, "code_sign_free")) {
                    dvh.m("mtopSignFree", "true", this.k);
                } else if (TextUtils.equals(s, "code_not_logged_in")) {
                    dvh.m("mtopLoginRedo", "true", this.k);
                }
            }
            dvh.m("apiName", this.b.API_NAME, this.k);
            dvh.m("apiVersion", this.b.VERSION, this.k);
            dvh.m("retry", String.valueOf(z), this.k);
            AwesomeGetRequestParams awesomeGetRequestParams = this.b;
            awesomeGetRequestParams.tryRequest = z;
            RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) awesomeGetRequestParams, q4a.c);
            this.f12648a = build;
            build.setBizTopic(this.f);
            this.f12648a.upstreamCompress(true);
            es8 es8Var = this.c;
            if (!(es8Var == null || (methodEnum = es8Var.b) == null)) {
                this.f12648a.reqMethod(methodEnum);
            }
            if (map != null) {
                this.f12648a.headers(map);
            }
            Boolean bool = (Boolean) mza.d().c("enableZSTDDCompress", Boolean.class);
            if (bool != null && bool.booleanValue()) {
                this.f12648a.supportZstdDictionary(true);
                dvh.m("mtopZSTDD", "true", this.k);
            }
            this.f12648a.handler(m5a.a().b());
            this.f12648a.registerListener((IRemoteListener) this.l);
            if (f4b.b("mtopStreamParse", true)) {
                this.f12648a.supportStreamJson(true);
            }
            if (TextUtils.equals(this.f, "coldStart")) {
                this.h.c("mtopRequestParams");
                this.h.p("mtopRequest", 1);
            }
            es8 es8Var2 = this.c;
            if (es8Var2 == null || !es8Var2.c) {
                if (m3oVar != null) {
                    m3oVar.start();
                }
                if (mxl.e(this.f, m3oVar)) {
                    uqa.b("MTopRequest", "doRequest", " mock本地数据直接返回, requestType =" + this.f);
                    return;
                }
                uqa.b("MTopRequest", "doRequest", " 调用网络库开始正常发起请求");
                this.j = SystemClock.uptimeMillis();
                dvh.f("req_prepare", true, this.k);
                phg.i("mtop_startRequest");
                dvh.b("resp_wait", this.k);
                this.f12648a.startRequest(AwesomeGetResponse.class);
                phg.h("mtop_startRequest");
                return;
            }
            uqa.b("MTopRequest", "doRequest", " 预加载请求, requestType:" + this.f);
            this.i.e(this.f12648a, this.c, this.b);
        }
    }

    public boolean r(String str, MtopResponse mtopResponse) {
        Map<String, List<String>> headerFields;
        List<String> list;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2a9edae", new Object[]{this, str, mtopResponse})).booleanValue();
        }
        if (mtopResponse != null && TextUtils.equals(str, "coldStart") && TextUtils.equals(mtopResponse.getApi(), HOME_SIGN_FREE_API_NAME)) {
            if (TextUtils.equals(mtopResponse.getRetCode(), "FAIL_SYS_USER_VALIDATE")) {
                vxm.b.e().a("USER_VALIDATE", "true");
                return true;
            } else if (TextUtils.equals(mtopResponse.getRetCode(), "FAIL_SYS_SGCOOKIE_VALIDATE")) {
                vxm.b.e().a("SGCOOKIE_VALIDATE", "true");
                return true;
            } else if (mtopResponse.getResponseCode() == 200 && (headerFields = mtopResponse.getHeaderFields()) != null && !headerFields.isEmpty() && headerFields.containsKey("bx-signwl-retry-ts") && (list = headerFields.get("bx-signwl-retry-ts")) != null && list.size() > 0) {
                String str2 = list.get(0);
                if (!TextUtils.isEmpty(str2)) {
                    long j2 = 0;
                    try {
                        j = Long.parseLong(str2) * 1000;
                        try {
                            j2 = SDKUtils.getCorrectionTimeMillis() - System.currentTimeMillis();
                        } catch (NumberFormatException unused) {
                        }
                    } catch (NumberFormatException unused2) {
                        j = 0;
                    }
                    qy8.b.i("homepage_switch", "homeSignFreeTime", String.valueOf(j));
                    qy8.b.i("homepage_switch", "homeSignFreeTimeOffset", String.valueOf(j2));
                    return true;
                }
            }
        }
        return false;
    }
}
