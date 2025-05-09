package com.taobao.android.weex_ability.mtop;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import anetwork.channel.statist.StatisticData;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.bridge.WeexPlatformCommonBridge;
import com.taobao.android.weex_ability.mtop.MUSMtopModule;
import com.taobao.android.weex_framework.devtool.NetworkResourceType;
import com.taobao.mtop.wvplugin.MtopWVPlugin;
import com.taobao.tao.remotebusiness.IRemoteCacheListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.global.SDKConfig;
import mtopsdk.mtop.util.MtopStatistics;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.bxh;
import tb.d7j;
import tb.dwh;
import tb.pvh;
import tb.rb;
import tb.sij;
import tb.t2o;
import tb.vuj;
import tb.vvh;
import tb.w6j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSMtopRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MSG_FAILED = "MS_FAILED";
    public static final String MSG_PARAM_ERR = "MSG_PARAM_ERR";
    public static final String MSG_SUCCESS = "MS_SUCCESS";
    public static final ScheduledThreadPoolExecutor c;

    /* renamed from: a  reason: collision with root package name */
    public final MUSMtopModule.MTOP_VERSION f9937a;
    public final Handler b = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class RbListener implements IRemoteListener, IRemoteCacheListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private MtopResponse cachedResponse;
        private pvh callback;
        private pvh failure;
        public String id;
        public int instanceId;
        private WeakReference<RemoteBusiness> rbWeakRef;
        public String requestAi;
        private long timer;
        private final vuj tracker;
        private boolean isTimeout = false;
        private boolean isFinish = false;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MtopResponse f9938a;

            public a(MtopResponse mtopResponse) {
                this.f9938a = mtopResponse;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                RbListener rbListener = RbListener.this;
                w6j g = MUSMtopRequest.g(MUSMtopRequest.this, RbListener.access$700(rbListener), RbListener.access$800(RbListener.this), this.f9938a);
                if (g != null) {
                    try {
                        g.k(JSON.parseObject(g.toString()));
                    } catch (Exception unused) {
                    }
                }
                MUSMtopRequest.c(MUSMtopRequest.this, g);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MtopResponse f9939a;

            public b(MtopResponse mtopResponse) {
                this.f9939a = mtopResponse;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                RbListener rbListener = RbListener.this;
                w6j g = MUSMtopRequest.g(MUSMtopRequest.this, RbListener.access$700(rbListener), RbListener.access$800(RbListener.this), this.f9939a);
                g.l(RbListener.this.instanceId);
                MUSMtopRequest.c(MUSMtopRequest.this, g);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
                    RbListener.this.onTimeOut();
                }
            }
        }

        static {
            t2o.a(980418641);
            t2o.a(589299721);
            t2o.a(589299720);
        }

        public RbListener(pvh pvhVar, pvh pvhVar2, RemoteBusiness remoteBusiness, long j, int i, vuj vujVar) {
            this.callback = pvhVar;
            this.failure = pvhVar2;
            this.timer = j;
            this.rbWeakRef = new WeakReference<>(remoteBusiness);
            this.instanceId = i;
            this.tracker = vujVar;
        }

        public static /* synthetic */ pvh access$700(RbListener rbListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pvh) ipChange.ipc$dispatch("c80d95c7", new Object[]{rbListener});
            }
            return rbListener.callback;
        }

        public static /* synthetic */ pvh access$800(RbListener rbListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pvh) ipChange.ipc$dispatch("e446e926", new Object[]{rbListener});
            }
            return rbListener.failure;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteCacheListener
        public synchronized void onCached(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73f40859", new Object[]{this, mtopCacheEvent, baseOutDo, obj});
                return;
            }
            if (mtopCacheEvent != null) {
                MtopResponse mtopResponse = mtopCacheEvent.getMtopResponse();
                this.cachedResponse = mtopResponse;
                vuj vujVar = this.tracker;
                if (vujVar != null) {
                    vujVar.e(mtopResponse.getResponseCode(), true, this.cachedResponse.getHeaderFields());
                    this.tracker.a(this.cachedResponse.getBytedata());
                    this.tracker.c();
                }
                MUSMtopRequest.h().schedule(new c(), this.timer, TimeUnit.MILLISECONDS);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public synchronized void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            if (mtopResponse != null && !this.isTimeout) {
                vuj vujVar = this.tracker;
                if (vujVar != null) {
                    vujVar.e(mtopResponse.getResponseCode(), false, mtopResponse.getHeaderFields());
                    this.tracker.a(mtopResponse.getBytedata());
                    vuj vujVar2 = this.tracker;
                    vujVar2.b(404, mtopResponse.getRetCode() + ": " + mtopResponse.getRetMsg());
                }
                this.isFinish = true;
                MUSMtopRequest.h().submit(new b(mtopResponse));
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public synchronized void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            if (mtopResponse != null && !this.isTimeout) {
                vuj vujVar = this.tracker;
                if (vujVar != null) {
                    vujVar.e(mtopResponse.getResponseCode(), false, mtopResponse.getHeaderFields());
                    this.tracker.a(mtopResponse.getBytedata());
                    this.tracker.c();
                }
                this.isFinish = true;
                MUSMtopRequest.h().submit(new a(mtopResponse));
            }
        }

        public synchronized void onTimeOut() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47459e9", new Object[]{this});
            } else if (!this.isFinish) {
                vuj vujVar = this.tracker;
                if (vujVar != null) {
                    vujVar.b(400, "request timeout");
                }
                this.isTimeout = true;
                RemoteBusiness remoteBusiness = this.rbWeakRef.get();
                if (remoteBusiness != null) {
                    remoteBusiness.cancelRequest();
                }
                MUSMtopRequest mUSMtopRequest = MUSMtopRequest.this;
                MUSMtopRequest.c(mUSMtopRequest, MUSMtopRequest.g(mUSMtopRequest, this.callback, this.failure, this.cachedResponse));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9942a;
        public final /* synthetic */ pvh b;
        public final /* synthetic */ pvh c;
        public final /* synthetic */ vuj d;
        public final /* synthetic */ int e;

        public b(String str, pvh pvhVar, pvh pvhVar2, vuj vujVar, int i) {
            this.f9942a = str;
            this.b = pvhVar;
            this.c = pvhVar2;
            this.d = vujVar;
            this.e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(this.f9942a);
                d7j b = MUSMtopRequest.b(MUSMtopRequest.this, jSONObject);
                if (b == null) {
                    w6j w6jVar = new w6j(this.b, this.c);
                    w6jVar.b(rb.RESULT_KEY, new JSONArray().put("HY_PARAM_ERR"));
                    MUSMtopRequest.c(MUSMtopRequest.this, w6jVar);
                    return;
                }
                vuj vujVar = this.d;
                if (vujVar != null) {
                    vujVar.g(MUSMtopRequest.d(MUSMtopRequest.this, this.e, b));
                }
                MtopRequest e = MUSMtopRequest.e(MUSMtopRequest.this, b);
                String optString = jSONObject.optString("userAgent");
                if (TextUtils.isEmpty(optString)) {
                    optString = vvh.d("system", "userAgent");
                }
                RemoteBusiness f = MUSMtopRequest.f(MUSMtopRequest.this, e, b, optString);
                RbListener rbListener = new RbListener(this.b, this.c, f, b.f, this.e, this.d);
                rbListener.requestAi = e.getApiName();
                f.registeListener((IRemoteListener) rbListener);
                f.startRequest();
            } catch (Exception e2) {
                TBSdkLog.e("MUSMtopRequest", "send Request failed" + e2);
                w6j w6jVar2 = new w6j(this.b, this.c);
                w6jVar2.b(rb.RESULT_KEY, new JSONArray().put("HY_FAILED"));
                MUSMtopRequest.c(MUSMtopRequest.this, w6jVar2);
            }
        }
    }

    static {
        t2o.a(980418638);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new sij("MUSMtopRequest"));
        c = scheduledThreadPoolExecutor;
        try {
            scheduledThreadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
            scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            Log.e("MUSMtopRequest", "", th);
        }
    }

    public MUSMtopRequest(MUSMtopModule.MTOP_VERSION mtop_version) {
        this.f9937a = mtop_version;
    }

    public static /* synthetic */ MUSMtopModule.MTOP_VERSION a(MUSMtopRequest mUSMtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSMtopModule.MTOP_VERSION) ipChange.ipc$dispatch("1157ae8b", new Object[]{mUSMtopRequest});
        }
        return mUSMtopRequest.f9937a;
    }

    public static /* synthetic */ d7j b(MUSMtopRequest mUSMtopRequest, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d7j) ipChange.ipc$dispatch("c77f7591", new Object[]{mUSMtopRequest, jSONObject});
        }
        return mUSMtopRequest.m(jSONObject);
    }

    public static /* synthetic */ void c(MUSMtopRequest mUSMtopRequest, w6j w6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e1f430", new Object[]{mUSMtopRequest, w6jVar});
        } else {
            mUSMtopRequest.l(w6jVar);
        }
    }

    public static /* synthetic */ bxh d(MUSMtopRequest mUSMtopRequest, int i, d7j d7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bxh) ipChange.ipc$dispatch("ee40094f", new Object[]{mUSMtopRequest, new Integer(i), d7jVar});
        }
        return mUSMtopRequest.k(i, d7jVar);
    }

    public static /* synthetic */ MtopRequest e(MUSMtopRequest mUSMtopRequest, d7j d7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("9c311211", new Object[]{mUSMtopRequest, d7jVar});
        }
        return mUSMtopRequest.j(d7jVar);
    }

    public static /* synthetic */ RemoteBusiness f(MUSMtopRequest mUSMtopRequest, MtopRequest mtopRequest, d7j d7jVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("eedb9e7c", new Object[]{mUSMtopRequest, mtopRequest, d7jVar, str});
        }
        return mUSMtopRequest.i(mtopRequest, d7jVar, str);
    }

    public static /* synthetic */ w6j g(MUSMtopRequest mUSMtopRequest, pvh pvhVar, pvh pvhVar2, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w6j) ipChange.ipc$dispatch("3c5ec57d", new Object[]{mUSMtopRequest, pvhVar, pvhVar2, mtopResponse});
        }
        return mUSMtopRequest.n(pvhVar, pvhVar2, mtopResponse);
    }

    public static /* synthetic */ ScheduledThreadPoolExecutor h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("2e24ba77", new Object[0]);
        }
        return c;
    }

    public final MtopRequest j(d7j d7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("159539c", new Object[]{this, d7jVar});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(d7jVar.f17638a);
        mtopRequest.setVersion(d7jVar.b);
        mtopRequest.setNeedEcode(d7jVar.c);
        mtopRequest.setNeedSession(true);
        if (!TextUtils.isEmpty(d7jVar.j)) {
            mtopRequest.setData(d7jVar.j);
        }
        mtopRequest.dataParams = d7jVar.c();
        return mtopRequest;
    }

    public final bxh k(int i, d7j d7jVar) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bxh) ipChange.ipc$dispatch("2e012794", new Object[]{this, new Integer(i), d7jVar});
        }
        bxh bxhVar = new bxh();
        if (d7jVar.h) {
            str = "POST";
        } else {
            str = "GET";
        }
        bxhVar.d = str;
        if (this.f9937a == MUSMtopModule.MTOP_VERSION.V1) {
            str2 = "send";
        } else {
            str2 = "request";
        }
        String str3 = d7jVar.f17638a;
        String str4 = d7jVar.b;
        bxhVar.c = "mtop://" + str2 + "/" + str3 + "?v=" + str4;
        if (d7jVar.h) {
            bxhVar.e = d7jVar.j;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(bxhVar.c);
            String str5 = d7jVar.j;
            sb.append("&data=" + str5);
            bxhVar.c = sb.toString();
        }
        Map<String, String> d = d7jVar.d();
        if (d != null) {
            ((ConcurrentHashMap) bxhVar.b).putAll(d);
        }
        bxhVar.g = new bxh.a(NetworkResourceType.Fetch, i);
        return bxhVar;
    }

    public final void l(w6j w6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f5d8006", new Object[]{this, w6jVar});
        } else {
            this.b.obtainMessage(500, w6jVar).sendToTarget();
        }
    }

    public void o(com.taobao.android.weex_framework.a aVar, com.alibaba.fastjson.JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2877bf5b", new Object[]{this, aVar, jSONObject, pvhVar, pvhVar2});
        } else {
            p(aVar, jSONObject.toString(), pvhVar, pvhVar2);
        }
    }

    public void p(com.taobao.android.weex_framework.a aVar, String str, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf5c3ca", new Object[]{this, aVar, str, pvhVar, pvhVar2});
            return;
        }
        c.submit(new b(str, pvhVar, pvhVar2, new vuj(), aVar.getInstanceId()));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/mtop/MUSMtopRequest$1");
        }

        public final void a(w6j w6jVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71501a03", new Object[]{this, w6jVar});
                return;
            }
            try {
                if (w6jVar.g() != null) {
                    str = w6jVar.g().getString("code");
                } else {
                    str = "";
                }
                WeexPlatformCommonBridge.reportExceptionInnerInfo(w6jVar.f(), WeexErrorType.MTOP_ERROR.errCode, "MTOP_" + str, w6jVar.h() + "|" + w6jVar.e);
            } catch (Exception unused) {
                dwh.e("mtop report exception");
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            pvh pvhVar;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 500 && (message.obj instanceof w6j)) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d("MUSMtopRequest", "call result, retString: " + ((w6j) message.obj).toString());
                }
                try {
                    w6j w6jVar = (w6j) message.obj;
                    if (w6jVar.c() != null && w6jVar.g() != null) {
                        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                        if (MUSMtopRequest.a(MUSMtopRequest.this) == MUSMtopModule.MTOP_VERSION.V1) {
                            if (w6jVar.i()) {
                                str = MUSMtopRequest.MSG_SUCCESS;
                            } else {
                                str = MUSMtopRequest.MSG_FAILED;
                            }
                            jSONObject.put("result", (Object) str);
                            if (w6jVar.e() != null) {
                                jSONObject.put("data", (Object) w6jVar.e());
                            } else {
                                jSONObject.put("data", (Object) JSON.parseObject(w6jVar.toString()));
                            }
                            pvhVar = w6jVar.c();
                            if (!w6jVar.i()) {
                                a(w6jVar);
                            }
                        } else {
                            if (w6jVar.e() != null) {
                                jSONObject = w6jVar.e();
                            } else {
                                jSONObject = JSON.parseObject(w6jVar.toString());
                            }
                            if (w6jVar.i()) {
                                pvhVar = w6jVar.c();
                            } else {
                                if (!jSONObject.containsKey("result")) {
                                    jSONObject.put("result", (Object) w6jVar.h());
                                }
                                pvhVar = w6jVar.d();
                                a(w6jVar);
                            }
                        }
                        if (pvhVar != null) {
                            pvhVar.b(jSONObject);
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final RemoteBusiness i(MtopRequest mtopRequest, d7j d7jVar, String str) {
        String str2;
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("4619aa73", new Object[]{this, mtopRequest, d7jVar, str});
        }
        if (StringUtils.isBlank(d7jVar.e)) {
            str2 = SDKConfig.getInstance().getGlobalTtid();
        } else {
            str2 = d7jVar.e;
        }
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, str2);
        build.showLoginUI(true ^ d7jVar.i.equals("AutoLoginOnly"));
        if (d7jVar.l) {
            build.protocol(ProtocolEnum.HTTPSECURE);
        } else {
            build.protocol(ProtocolEnum.HTTP);
        }
        if (!TextUtils.isEmpty(d7jVar.k)) {
            build.setCustomDomain(d7jVar.k);
        }
        if (d7jVar.d > 0) {
            build.useWua();
        }
        if (d7jVar.h) {
            methodEnum = MethodEnum.POST;
        } else {
            methodEnum = MethodEnum.GET;
        }
        build.reqMethod(methodEnum);
        if (d7jVar.d() != null) {
            build.headers(d7jVar.d());
        }
        if (StringUtils.isNotBlank(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(HttpHeaderConstant.X_UA, str);
            build.headers((Map<String, String>) hashMap);
        }
        if (!StringUtils.isBlank(d7jVar.g) && ("json".equals(d7jVar.g) || "originaljson".equals(d7jVar.g))) {
            build.setJsonType(JsonTypeEnum.valueOf(d7jVar.g.toUpperCase()));
        }
        if (!TextUtils.isEmpty(d7jVar.m)) {
            build.setBizTopic(d7jVar.m);
        }
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1 A[Catch: JSONException -> 0x0183, TryCatch #0 {JSONException -> 0x0183, blocks: (B:6:0x002e, B:9:0x0052, B:12:0x0059, B:14:0x0061, B:15:0x006a, B:19:0x0073, B:20:0x0076, B:21:0x0080, B:23:0x00a1, B:24:0x00a6, B:26:0x00ac, B:27:0x00b1, B:31:0x00bb, B:33:0x00c3, B:34:0x00cb, B:35:0x00cf, B:37:0x00e0, B:38:0x00e9, B:39:0x00eb, B:40:0x00f2, B:42:0x0116, B:43:0x011b, B:45:0x0124, B:46:0x0128, B:48:0x012e, B:50:0x0143, B:52:0x0147, B:53:0x014f, B:54:0x0155, B:56:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x0177, B:64:0x017e), top: B:68:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6 A[Catch: JSONException -> 0x0183, TryCatch #0 {JSONException -> 0x0183, blocks: (B:6:0x002e, B:9:0x0052, B:12:0x0059, B:14:0x0061, B:15:0x006a, B:19:0x0073, B:20:0x0076, B:21:0x0080, B:23:0x00a1, B:24:0x00a6, B:26:0x00ac, B:27:0x00b1, B:31:0x00bb, B:33:0x00c3, B:34:0x00cb, B:35:0x00cf, B:37:0x00e0, B:38:0x00e9, B:39:0x00eb, B:40:0x00f2, B:42:0x0116, B:43:0x011b, B:45:0x0124, B:46:0x0128, B:48:0x012e, B:50:0x0143, B:52:0x0147, B:53:0x014f, B:54:0x0155, B:56:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x0177, B:64:0x017e), top: B:68:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3 A[Catch: JSONException -> 0x0183, TryCatch #0 {JSONException -> 0x0183, blocks: (B:6:0x002e, B:9:0x0052, B:12:0x0059, B:14:0x0061, B:15:0x006a, B:19:0x0073, B:20:0x0076, B:21:0x0080, B:23:0x00a1, B:24:0x00a6, B:26:0x00ac, B:27:0x00b1, B:31:0x00bb, B:33:0x00c3, B:34:0x00cb, B:35:0x00cf, B:37:0x00e0, B:38:0x00e9, B:39:0x00eb, B:40:0x00f2, B:42:0x0116, B:43:0x011b, B:45:0x0124, B:46:0x0128, B:48:0x012e, B:50:0x0143, B:52:0x0147, B:53:0x014f, B:54:0x0155, B:56:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x0177, B:64:0x017e), top: B:68:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb A[Catch: JSONException -> 0x0183, TryCatch #0 {JSONException -> 0x0183, blocks: (B:6:0x002e, B:9:0x0052, B:12:0x0059, B:14:0x0061, B:15:0x006a, B:19:0x0073, B:20:0x0076, B:21:0x0080, B:23:0x00a1, B:24:0x00a6, B:26:0x00ac, B:27:0x00b1, B:31:0x00bb, B:33:0x00c3, B:34:0x00cb, B:35:0x00cf, B:37:0x00e0, B:38:0x00e9, B:39:0x00eb, B:40:0x00f2, B:42:0x0116, B:43:0x011b, B:45:0x0124, B:46:0x0128, B:48:0x012e, B:50:0x0143, B:52:0x0147, B:53:0x014f, B:54:0x0155, B:56:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x0177, B:64:0x017e), top: B:68:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0 A[Catch: JSONException -> 0x0183, TryCatch #0 {JSONException -> 0x0183, blocks: (B:6:0x002e, B:9:0x0052, B:12:0x0059, B:14:0x0061, B:15:0x006a, B:19:0x0073, B:20:0x0076, B:21:0x0080, B:23:0x00a1, B:24:0x00a6, B:26:0x00ac, B:27:0x00b1, B:31:0x00bb, B:33:0x00c3, B:34:0x00cb, B:35:0x00cf, B:37:0x00e0, B:38:0x00e9, B:39:0x00eb, B:40:0x00f2, B:42:0x0116, B:43:0x011b, B:45:0x0124, B:46:0x0128, B:48:0x012e, B:50:0x0143, B:52:0x0147, B:53:0x014f, B:54:0x0155, B:56:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x0177, B:64:0x017e), top: B:68:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb A[Catch: JSONException -> 0x0183, TryCatch #0 {JSONException -> 0x0183, blocks: (B:6:0x002e, B:9:0x0052, B:12:0x0059, B:14:0x0061, B:15:0x006a, B:19:0x0073, B:20:0x0076, B:21:0x0080, B:23:0x00a1, B:24:0x00a6, B:26:0x00ac, B:27:0x00b1, B:31:0x00bb, B:33:0x00c3, B:34:0x00cb, B:35:0x00cf, B:37:0x00e0, B:38:0x00e9, B:39:0x00eb, B:40:0x00f2, B:42:0x0116, B:43:0x011b, B:45:0x0124, B:46:0x0128, B:48:0x012e, B:50:0x0143, B:52:0x0147, B:53:0x014f, B:54:0x0155, B:56:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x0177, B:64:0x017e), top: B:68:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116 A[Catch: JSONException -> 0x0183, TryCatch #0 {JSONException -> 0x0183, blocks: (B:6:0x002e, B:9:0x0052, B:12:0x0059, B:14:0x0061, B:15:0x006a, B:19:0x0073, B:20:0x0076, B:21:0x0080, B:23:0x00a1, B:24:0x00a6, B:26:0x00ac, B:27:0x00b1, B:31:0x00bb, B:33:0x00c3, B:34:0x00cb, B:35:0x00cf, B:37:0x00e0, B:38:0x00e9, B:39:0x00eb, B:40:0x00f2, B:42:0x0116, B:43:0x011b, B:45:0x0124, B:46:0x0128, B:48:0x012e, B:50:0x0143, B:52:0x0147, B:53:0x014f, B:54:0x0155, B:56:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x0177, B:64:0x017e), top: B:68:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b A[Catch: JSONException -> 0x0183, TryCatch #0 {JSONException -> 0x0183, blocks: (B:6:0x002e, B:9:0x0052, B:12:0x0059, B:14:0x0061, B:15:0x006a, B:19:0x0073, B:20:0x0076, B:21:0x0080, B:23:0x00a1, B:24:0x00a6, B:26:0x00ac, B:27:0x00b1, B:31:0x00bb, B:33:0x00c3, B:34:0x00cb, B:35:0x00cf, B:37:0x00e0, B:38:0x00e9, B:39:0x00eb, B:40:0x00f2, B:42:0x0116, B:43:0x011b, B:45:0x0124, B:46:0x0128, B:48:0x012e, B:50:0x0143, B:52:0x0147, B:53:0x014f, B:54:0x0155, B:56:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x0177, B:64:0x017e), top: B:68:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0124 A[Catch: JSONException -> 0x0183, TryCatch #0 {JSONException -> 0x0183, blocks: (B:6:0x002e, B:9:0x0052, B:12:0x0059, B:14:0x0061, B:15:0x006a, B:19:0x0073, B:20:0x0076, B:21:0x0080, B:23:0x00a1, B:24:0x00a6, B:26:0x00ac, B:27:0x00b1, B:31:0x00bb, B:33:0x00c3, B:34:0x00cb, B:35:0x00cf, B:37:0x00e0, B:38:0x00e9, B:39:0x00eb, B:40:0x00f2, B:42:0x0116, B:43:0x011b, B:45:0x0124, B:46:0x0128, B:48:0x012e, B:50:0x0143, B:52:0x0147, B:53:0x014f, B:54:0x0155, B:56:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x0177, B:64:0x017e), top: B:68:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d A[Catch: JSONException -> 0x0183, TryCatch #0 {JSONException -> 0x0183, blocks: (B:6:0x002e, B:9:0x0052, B:12:0x0059, B:14:0x0061, B:15:0x006a, B:19:0x0073, B:20:0x0076, B:21:0x0080, B:23:0x00a1, B:24:0x00a6, B:26:0x00ac, B:27:0x00b1, B:31:0x00bb, B:33:0x00c3, B:34:0x00cb, B:35:0x00cf, B:37:0x00e0, B:38:0x00e9, B:39:0x00eb, B:40:0x00f2, B:42:0x0116, B:43:0x011b, B:45:0x0124, B:46:0x0128, B:48:0x012e, B:50:0x0143, B:52:0x0147, B:53:0x014f, B:54:0x0155, B:56:0x015d, B:57:0x0161, B:59:0x0167, B:61:0x0177, B:64:0x017e), top: B:68:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.d7j m(org.json.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_ability.mtop.MUSMtopRequest.m(org.json.JSONObject):tb.d7j");
    }

    public final w6j n(pvh pvhVar, pvh pvhVar2, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w6j) ipChange.ipc$dispatch("f105d003", new Object[]{this, pvhVar, pvhVar2, mtopResponse});
        }
        long currentTimeMillis = System.currentTimeMillis();
        w6j w6jVar = new w6j(pvhVar, pvhVar2);
        if (mtopResponse != null) {
            w6jVar.e = mtopResponse.getApi();
        }
        w6jVar.b(rb.RESULT_KEY, new JSONArray().put("HY_FAILED"));
        if (mtopResponse == null) {
            w6jVar.a("code", "-1");
            TBSdkLog.d("MUSMtopRequest", "parseResult: time out");
            return w6jVar;
        }
        w6jVar.a("code", String.valueOf(mtopResponse.getResponseCode()));
        if (mtopResponse.isSessionInvalid()) {
            w6jVar.b(rb.RESULT_KEY, new JSONArray().put(MtopWVPlugin.ERR_SID_INVALID));
            return w6jVar;
        }
        try {
            if (mtopResponse.getBytedata() != null) {
                JSONObject jSONObject = new JSONObject(new String(mtopResponse.getBytedata(), "utf-8"));
                jSONObject.put("code", String.valueOf(mtopResponse.getResponseCode()));
                JSONObject jSONObject2 = new JSONObject();
                if (mtopResponse.getMtopStat() == null || mtopResponse.getMtopStat().getNetStat() == null) {
                    jSONObject2.put("oneWayTime", 0);
                    jSONObject2.put("recDataSize", 0);
                } else {
                    MtopStatistics mtopStat = mtopResponse.getMtopStat();
                    StatisticData netStat = mtopResponse.getMtopStat().getNetStat();
                    jSONObject2.put("oneWayTime", netStat.oneWayTime_AEngine);
                    jSONObject2.put("recDataSize", netStat.totalSize);
                    jSONObject2.put("eagleEyeTraceId", mtopStat.eagleEyeTraceId);
                    jSONObject2.put("falcoId", mtopStat.falcoId);
                }
                jSONObject.put("stat", jSONObject2);
                w6jVar.j(jSONObject);
            }
            if (mtopResponse.isApiSuccess()) {
                w6jVar.n(true);
            } else {
                w6jVar.m(mtopResponse.getRetCode());
            }
        } catch (Exception unused) {
            if (TBSdkLog.isPrintLog()) {
                TBSdkLog.e("MUSMtopRequest", "parseResult mtop response parse fail, content: " + mtopResponse.toString());
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("MUSMtopRequest", "parseResult cost time(ms):" + (System.currentTimeMillis() - currentTimeMillis));
        }
        return w6jVar;
    }
}
