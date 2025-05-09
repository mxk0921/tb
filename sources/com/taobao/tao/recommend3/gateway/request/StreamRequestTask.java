package com.taobao.tao.recommend3.gateway.request;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetResponse;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.stream.IMtopStreamListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.global.SDKUtils;
import tb.a3b;
import tb.bqa;
import tb.ddv;
import tb.es8;
import tb.f4b;
import tb.fdv;
import tb.hrg;
import tb.k7j;
import tb.l7j;
import tb.m3o;
import tb.m5a;
import tb.m7j;
import tb.mxl;
import tb.mza;
import tb.p6j;
import tb.phg;
import tb.q4a;
import tb.qy8;
import tb.t2o;
import tb.uqa;
import tb.vxm;
import tb.yyj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class StreamRequestTask extends RequestTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOME_STREAM_SIGN_FREE_API_NAME = "mtop.taobao.wireless.home.newface.stream.newget";
    public AwesomeGetData m;
    public final AwesomeMtopStreamListener n = new AwesomeMtopStreamListener();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class AwesomeMtopStreamListener implements IMtopStreamListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ m7j f12650a;

            public a(m7j m7jVar) {
                this.f12650a = m7jVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                byte[] bArr = this.f12650a.e;
                if (bArr != null) {
                    StreamRequestTask.u(StreamRequestTask.this, new String(bArr));
                }
            }
        }

        static {
            t2o.a(729809750);
            t2o.a(589299782);
        }

        public AwesomeMtopStreamListener() {
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onError(k7j k7jVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9471629", new Object[]{this, k7jVar, new Integer(i), obj});
                return;
            }
            if (k7jVar != null) {
                StreamRequestTask streamRequestTask = StreamRequestTask.this;
                if (streamRequestTask.I(streamRequestTask.f, k7jVar)) {
                    StreamRequestTask streamRequestTask2 = StreamRequestTask.this;
                    StreamRequestTask.v(streamRequestTask2, streamRequestTask2.d, streamRequestTask2.e, true);
                    return;
                }
            }
            StreamRequestTask.w(StreamRequestTask.this);
            StreamRequestTask.x(StreamRequestTask.this, false, false, null, k7jVar);
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onFinish(l7j l7jVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad3ac67", new Object[]{this, l7jVar, new Integer(i), obj});
                return;
            }
            StreamRequestTask.w(StreamRequestTask.this);
            StreamRequestTask.x(StreamRequestTask.this, true, false, null, null);
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onReceiveData(m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99d309f1", new Object[]{this, m7jVar, baseOutDo, new Integer(i), obj});
                return;
            }
            if (m7jVar != null) {
                StreamRequestTask.t(StreamRequestTask.this, m7jVar.g, m7jVar.f, m7jVar.j);
            }
            StreamRequestTask.this.C(m7jVar, baseOutDo);
            if (StreamRequestTask.this.b != null && m7jVar != null) {
                m5a.a().k(new a(m7jVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12651a;

        public a(String str) {
            this.f12651a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                StreamRequestTask.u(StreamRequestTask.this, this.f12651a);
            }
        }
    }

    static {
        t2o.a(729809748);
    }

    public StreamRequestTask(AwesomeGetRequestParams awesomeGetRequestParams, es8 es8Var) {
        super(awesomeGetRequestParams, es8Var);
        awesomeGetRequestParams.API_NAME = "mtop.taobao.wireless.home.newface.stream.get";
        this.g = "mtop.taobao.wireless.home.newface.stream.get";
    }

    public static /* synthetic */ Object ipc$super(StreamRequestTask streamRequestTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/gateway/request/StreamRequestTask");
    }

    public static /* synthetic */ void t(StreamRequestTask streamRequestTask, Map map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49931cc0", new Object[]{streamRequestTask, map, str, str2});
        } else {
            streamRequestTask.E(map, str, str2);
        }
    }

    public static /* synthetic */ void u(StreamRequestTask streamRequestTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0c74e2", new Object[]{streamRequestTask, str});
        } else {
            streamRequestTask.z(str);
        }
    }

    public static /* synthetic */ void v(StreamRequestTask streamRequestTask, m3o m3oVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f26e308", new Object[]{streamRequestTask, m3oVar, map, new Boolean(z)});
        } else {
            streamRequestTask.A(m3oVar, map, z);
        }
    }

    public static /* synthetic */ void w(StreamRequestTask streamRequestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122059d6", new Object[]{streamRequestTask});
        } else {
            streamRequestTask.G();
        }
    }

    public static /* synthetic */ void x(StreamRequestTask streamRequestTask, boolean z, boolean z2, m7j m7jVar, k7j k7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0103f92", new Object[]{streamRequestTask, new Boolean(z), new Boolean(z2), m7jVar, k7jVar});
        } else {
            streamRequestTask.F(z, z2, m7jVar, k7jVar);
        }
    }

    public final String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f00af7c5", new Object[]{this});
        }
        Map<String, AwesomeGetContainerParams> map = this.b.containerParams;
        if (map == null) {
            uqa.b("MTopRequest", "commitScrollNextPageError", "containerParams == null");
            return "-1";
        }
        AwesomeGetContainerParams awesomeGetContainerParams = map.get(a3b.h(k()));
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

    public boolean C(m7j m7jVar, BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76ab242e", new Object[]{this, m7jVar, baseOutDo})).booleanValue();
        }
        if (m7jVar == null || baseOutDo == null) {
            F(false, true, null, null);
            return false;
        }
        String str = m7jVar.f;
        if (TextUtils.equals(str, "1")) {
            if (D(baseOutDo, true)) {
                F(false, true, m7jVar, null);
                return false;
            }
            if (this.d != null) {
                AwesomeGetData awesomeGetData = (AwesomeGetData) baseOutDo.getData();
                this.m = awesomeGetData;
                awesomeGetData.isFirstReturn = true;
                this.d.a(awesomeGetData);
            }
            AwesomeGetResponse awesomeGetResponse = (AwesomeGetResponse) baseOutDo;
            if (awesomeGetResponse.getData() != null) {
                g(awesomeGetResponse.getData());
                mza.d().i(awesomeGetResponse.getData().getExt());
            }
        } else if (TextUtils.equals(str, "2")) {
            if (this.m == null) {
                k7j k7jVar = new k7j();
                k7jVar.c = "lastData is Null";
                k7jVar.b = "2";
                k7jVar.d = 2;
                k7jVar.f25875a = m7jVar.g;
                F(false, false, m7jVar, null);
                return false;
            } else if (D(baseOutDo, false)) {
                F(false, true, m7jVar, null);
                return false;
            } else {
                AwesomeGetData awesomeGetData2 = (AwesomeGetData) baseOutDo.getData();
                awesomeGetData2.mergeSecondReturnData(this.m);
                awesomeGetData2.isSecondReturn = true;
                m3o m3oVar = this.d;
                if (m3oVar != null) {
                    m3oVar.a(awesomeGetData2);
                }
                m5a.a().k(new a(JSON.toJSONString(awesomeGetData2)));
                this.m = null;
            }
        }
        return true;
    }

    public final boolean D(BaseOutDo baseOutDo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36876a87", new Object[]{this, baseOutDo, new Boolean(z)})).booleanValue();
        }
        if (!(baseOutDo == null || baseOutDo.getData() == null || !(baseOutDo instanceof AwesomeGetResponse))) {
            AwesomeGetData data = ((AwesomeGetResponse) baseOutDo).getData();
            if (z) {
                Map<String, AwesomeGetContainerData> map = data.containers;
                if (map != null && !map.isEmpty()) {
                    boolean z2 = true;
                    for (AwesomeGetContainerData awesomeGetContainerData : data.containers.values()) {
                        if (awesomeGetContainerData.getBaseData() == null && awesomeGetContainerData.getDeltaData() == null) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (!z2) {
                            break;
                        }
                    }
                    return z2;
                }
            } else if (data == null || (data.extraParams == null && data.renderParams == null)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public final void E(Map<String, List<String>> map, String str, String str2) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c88e135", new Object[]{this, map, str, str2});
            return;
        }
        boolean equals = TextUtils.equals(str, "1");
        String str3 = p6j.MTOP_STAGE_NETWORKREQUEST;
        if (equals) {
            hashMap = new HashMap();
            y(map, hashMap);
            hashMap.put("falcoId", str2);
            hashMap.put("homeApi", this.b.API_NAME);
            if (TextUtils.equals(this.f, "coldStart")) {
                vxm.b.e().a("homeApi", this.b.API_NAME);
            }
        } else {
            str3 = str3 + str;
            hashMap = null;
        }
        p6j.b(this.f, str3, 0L, SystemClock.uptimeMillis() - this.j, hashMap, false);
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e338a75", new Object[]{this});
        } else if (TextUtils.equals(this.f, "coldStart")) {
            this.h.c("mtopRequest");
            this.h.p("homeDataProcess", 1);
        }
    }

    public final String H(m7j m7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed585fbb", new Object[]{this, m7jVar});
        }
        String str = m7jVar.f23820a;
        if (!TextUtils.equals("SUCCESS", str)) {
            return str;
        }
        String[] strArr = m7jVar.h;
        if (strArr.length < 1) {
            return str;
        }
        String str2 = strArr[0];
        int indexOf = str2.indexOf("::");
        if (indexOf > 0) {
            return str2.substring(0, indexOf);
        }
        return str;
    }

    @Override // com.taobao.tao.recommend3.gateway.request.RequestTask
    public void i(m3o m3oVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25562b11", new Object[]{this, m3oVar, map});
        } else {
            A(m3oVar, map, false);
        }
    }

    public final void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5906548", new Object[]{this, str});
            return;
        }
        try {
            hrg.e(fdv.F_NETWORK_REQUEST, "gateway.StreamRequestTask", "AwesomeGetRequestParams ：" + JSON.toJSONString(this.b) + " ---- result : " + str);
        } catch (OutOfMemoryError unused) {
            hrg.c(fdv.F_NETWORK_REQUEST, "gateway.StreamRequestTask", "oom, no log.", "", "");
        } catch (Throwable th) {
            hrg.c(fdv.F_NETWORK_REQUEST, "gateway.StreamRequestTask", "log error, no log.", "", th.getMessage());
        }
    }

    public final void A(m3o m3oVar, Map<String, String> map, boolean z) {
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("856fe9e3", new Object[]{this, m3oVar, map, new Boolean(z)});
            return;
        }
        this.d = m3oVar;
        this.e = map;
        if (!k().isEmpty()) {
            String l = l(k().iterator().next());
            this.f = l;
            if (z || !TextUtils.equals(l, "coldStart")) {
                this.b.API_NAME = this.g;
            } else {
                String s = s(true);
                if (TextUtils.equals(s, "code_sign_free")) {
                    this.b.API_NAME = HOME_STREAM_SIGN_FREE_API_NAME;
                } else {
                    bqa.d("gateway.StreamRequestTask", "SignFree code value:" + s);
                    vxm.b.e().a("sign_free_error_code", s);
                    ddv.n("sign_free_error_code", s);
                }
            }
            AwesomeGetRequestParams awesomeGetRequestParams = this.b;
            awesomeGetRequestParams.tryRequest = z;
            RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) awesomeGetRequestParams, q4a.c);
            this.f12648a = build;
            build.setBizTopic(this.f);
            this.f12648a.upstreamCompress(true);
            this.f12648a.streamMode(true);
            this.f12648a.registerListener((IMtopStreamListener) this.n);
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
            }
            this.f12648a.handler(m5a.a().b());
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
                uqa.b("MTopRequest", "doRequest", " stream 调用网络库开始正常发起请求");
                this.j = SystemClock.uptimeMillis();
                phg.i("mtop_startRequest");
                this.f12648a.startRequest(AwesomeGetResponse.class);
                phg.h("mtop_startRequest");
                return;
            }
            uqa.b("MTopRequest", "doRequest", " 预加载请求, requestType:" + this.f);
            this.i.e(this.f12648a, this.c, this.b);
        }
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    public final void F(boolean z, boolean z2, m7j m7jVar, k7j k7jVar) {
        String str;
        String str2;
        AwesomeGetContainerData u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b715613d", new Object[]{this, new Boolean(z), new Boolean(z2), m7jVar, k7jVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("RequestType", this.f);
        if (z) {
            AwesomeGetRequestParams awesomeGetRequestParams = this.b;
            ddv.m(awesomeGetRequestParams.API_NAME, awesomeGetRequestParams.VERSION, hashMap);
            return;
        }
        if (z2) {
            if (m7jVar == null) {
                str2 = "1";
                str = "response is null";
            } else {
                str2 = H(m7jVar);
                str = m7jVar.b;
                hashMap.put("currentId", m7jVar.f);
                hashMap.put("pageNum", B());
                y(m7jVar.g, hashMap);
            }
        } else if (k7jVar == null) {
            str2 = "0";
            str = "error is null";
        } else {
            str2 = k7jVar.b;
            str = k7jVar.c;
            hashMap.put("receivedDataCounts", String.valueOf(k7jVar.d));
            hashMap.put(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, String.valueOf(k7jVar.f));
            y(k7jVar.f25875a, hashMap);
        }
        if (!((this.m == null && ((m7jVar == null || !TextUtils.equals(m7jVar.f, "2")) && (k7jVar == null || k7jVar.d != 1))) || (u = yyj.e().c().u(yyj.l().f32522a)) == null || u.getPageParams() == null || u.getBase() == null)) {
            u.getPageParams().firstRequestInAdvance = -1;
            u.getBase().initCacheRequestInAdvance();
        }
        AwesomeGetRequestParams awesomeGetRequestParams2 = this.b;
        ddv.l(awesomeGetRequestParams2.API_NAME, awesomeGetRequestParams2.VERSION, str2, str, null, null, hashMap);
        m3o m3oVar = this.d;
        if (m3oVar != null) {
            m3oVar.error(str2, str);
        }
    }

    public final void y(Map<String, List<String>> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7393980d", new Object[]{this, map, map2});
        } else if (map != null && !map.isEmpty() && map2 != null) {
            List<String> list = map.get("s-rt");
            if (list != null && list.size() > 0) {
                map2.put("serverRT", list.get(0));
            }
            List<String> list2 = map.get(HttpHeaderConstant.X_BIN_LENGTH);
            if (list2 != null && list2.size() > 0) {
                map2.put("responseLength", list2.get(0));
            }
            List<String> list3 = map.get("eagleeye-traceid");
            if (list3 != null) {
                map2.put("eyeTraceid", list3.get(0));
            }
        }
    }

    public boolean I(String str, k7j k7jVar) {
        Map<String, List<String>> map;
        List<String> list;
        NumberFormatException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8d5da6f", new Object[]{this, str, k7jVar})).booleanValue();
        }
        if (k7jVar != null && TextUtils.equals(str, "coldStart") && TextUtils.equals(this.b.API_NAME, HOME_STREAM_SIGN_FREE_API_NAME)) {
            if (TextUtils.equals(k7jVar.b, "FAIL_SYS_USER_VALIDATE")) {
                vxm.b.e().a("USER_VALIDATE", "true");
                return true;
            } else if (TextUtils.equals(k7jVar.b, "FAIL_SYS_SGCOOKIE_VALIDATE")) {
                vxm.b.e().a("SGCOOKIE_VALIDATE", "true");
                return true;
            } else if (k7jVar.f == 200 && (map = k7jVar.f25875a) != null && !map.isEmpty() && map.containsKey("bx-signwl-retry-ts") && (list = map.get("bx-signwl-retry-ts")) != null && list.size() > 0) {
                String str2 = list.get(0);
                if (!TextUtils.isEmpty(str2)) {
                    long j = 0;
                    try {
                        j = Long.parseLong(str2) * 1000;
                    } catch (NumberFormatException e2) {
                        e = e2;
                        j = 0;
                    }
                    try {
                        j = SDKUtils.getCorrectionTimeMillis() - System.currentTimeMillis();
                        bqa.d("gateway.StreamRequestTask", "updateSignFreeConfig: " + j + ", " + j);
                    } catch (NumberFormatException e3) {
                        e = e3;
                        j = j;
                        bqa.d("gateway.StreamRequestTask", "updateSignFreeConfig NumberFormatException : " + e.getMessage());
                        qy8.b.i("homepage_switch", "homeSignFreeTime", String.valueOf(j));
                        qy8.b.i("homepage_switch", "homeSignFreeTimeOffset", String.valueOf(j));
                        return true;
                    }
                    qy8.b.i("homepage_switch", "homeSignFreeTime", String.valueOf(j));
                    qy8.b.i("homepage_switch", "homeSignFreeTimeOffset", String.valueOf(j));
                    return true;
                }
            }
        }
        return false;
    }
}
