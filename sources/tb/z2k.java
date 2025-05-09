package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.android.nextrpc.internal.accs.AccsServiceManager;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.request.CachedMainResponse;
import com.alibaba.android.nextrpc.request.NextRpcRequest;
import com.alibaba.android.nextrpc.request.NextRpcResponseCallbackV2;
import com.alibaba.android.nextrpc.request.RemoteMainResponse;
import com.alibaba.android.nextrpc.request.internal.mtop.MtopRequestClient;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z2k implements x2k, a3k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, List<z2k>> e = new HashMap();
    public static final Object f = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f32486a;
    public final String b;
    public final Map<String, mwc> c;
    public final c d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements z9o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99807463", new Object[]{this, str});
            } else {
                z2k.c(z2k.this, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$com$alibaba$android$nextrpc$request$NextRpcRequest$AttachedResponseStrategy;

        static {
            int[] iArr = new int[NextRpcRequest.AttachedResponseStrategy.values().length];
            $SwitchMap$com$alibaba$android$nextrpc$request$NextRpcRequest$AttachedResponseStrategy = iArr;
            try {
                iArr[NextRpcRequest.AttachedResponseStrategy.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$android$nextrpc$request$NextRpcRequest$AttachedResponseStrategy[NextRpcRequest.AttachedResponseStrategy.IMMEDIATELY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c implements wdb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, mwc> f32488a;
        public final Handler b = new Handler(Looper.getMainLooper());

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f32489a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;
            public final /* synthetic */ JSONObject d;

            public a(String str, String str2, String str3, JSONObject jSONObject) {
                this.f32489a = str;
                this.b = str2;
                this.c = str3;
                this.d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.b(c.this, this.f32489a, this.b, this.c, this.d);
                }
            }
        }

        public c(Map<String, mwc> map) {
            this.f32488a = map;
        }

        public static /* synthetic */ void b(c cVar, String str, String str2, String str3, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee2aac86", new Object[]{cVar, str, str2, str3, jSONObject});
            } else {
                cVar.d(str, str2, str3, jSONObject);
            }
        }

        public static String c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e4bdb95d", new Object[]{jSONObject});
            }
            return jSONObject.getString(d.ATTACHED_RESPONSE_HEADER_REQ_ID);
        }

        @Override // tb.wdb
        public void a(String str, String str2, String str3, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41b304a2", new Object[]{this, str, str2, str3, jSONObject});
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                d(str, str2, str3, jSONObject);
            } else {
                this.b.post(new a(str, str2, str3, jSONObject));
            }
        }

        public final void d(String str, String str2, String str3, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6c7969e", new Object[]{this, str, str2, str3, jSONObject});
            } else if (jSONObject != null && !jSONObject.isEmpty()) {
                String c = c(jSONObject);
                UnifyLog.f("NextRpcRequestClientImpl", "Received accs data,current reqId = " + c, new Object[0]);
                for (Map.Entry<String, mwc> entry : this.f32488a.entrySet()) {
                    mwc value = entry.getValue();
                    if (entry.getKey().equals(c)) {
                        value.onReceiveAccsData(str, str2, str3, jSONObject);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d implements mwc, yjc {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ATTACHED_RESPONSE_HEADER_ERROR_CODE = "errorCode";
        public static final String ATTACHED_RESPONSE_HEADER_ERROR_MSG = "errorMsg";
        public static final String ATTACHED_RESPONSE_HEADER_REQ_COUNT = "seqCount";
        public static final String ATTACHED_RESPONSE_HEADER_REQ_ID = "reqId";
        public static final String ATTACHED_RESPONSE_HEADER_REQ_NUM = "seqNum";
        public static final String ATTACHED_RESPONSE_HEADER_SUCCESS = "success";
        public static final String MAIN_REQUEST_HEADER_REQ_ID = "nextrpc-req-id";

        /* renamed from: a  reason: collision with root package name */
        public RemoteMainResponse f32490a;
        public NextRpcRequest b;
        public String d;
        public b3k g;
        public NextRpcResponseCallbackV2 h;
        public z9o i;
        public String j;
        public final Handler e = new Handler(Looper.getMainLooper());
        public long f = 30000;
        public final s8n c = new ch1();

        public static /* synthetic */ RemoteMainResponse a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteMainResponse) ipChange.ipc$dispatch("875a0ac0", new Object[]{dVar});
            }
            return dVar.f32490a;
        }

        public static /* synthetic */ void b(d dVar, String str, Object obj, String str2, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53a1b86d", new Object[]{dVar, str, obj, str2, map});
            } else {
                dVar.k(str, obj, str2, map);
            }
        }

        public static /* synthetic */ NextRpcResponseCallbackV2 c(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NextRpcResponseCallbackV2) ipChange.ipc$dispatch("62c00dc4", new Object[]{dVar});
            }
            return dVar.h;
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8da89d77", new Object[]{this});
            } else {
                this.e.removeCallbacksAndMessages(null);
            }
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fb82f5e3", new Object[]{this});
            }
            return this.d;
        }

        public final String f(NextRpcRequest nextRpcRequest) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d1120444", new Object[]{this, nextRpcRequest});
            }
            if (nextRpcRequest == null || nextRpcRequest.getMtopBusiness() == null || nextRpcRequest.getMtopBusiness().request == null) {
                return "";
            }
            return nextRpcRequest.getMtopBusiness().request.getApiName();
        }

        public final Map<String, String> g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("bd5c65c1", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("requestTime", this.j);
            hashMap.put(tmu.CURRENT_TIME, String.valueOf(System.currentTimeMillis()));
            return hashMap;
        }

        public final Map<String, List<String>> h(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("b46ba18b", new Object[]{this, jSONObject});
            }
            if (jSONObject == null || jSONObject.isEmpty()) {
                throw new IllegalArgumentException("accs header can not be null");
            }
            HashMap hashMap = new HashMap(jSONObject.size());
            try {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        List arrayList = new ArrayList();
                        if (value instanceof JSONArray) {
                            arrayList = JSON.parseArray(((JSONArray) value).toJSONString(), String.class);
                        }
                        if (value instanceof String) {
                            arrayList.add((String) value);
                        }
                        hashMap.put(key, arrayList);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return hashMap;
        }

        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10099a51", new Object[]{this});
            } else {
                this.e.postDelayed(new a(), this.f);
            }
        }

        public final void k(String str, Object obj, String str2, Map<String, String> map) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c81ffa1", new Object[]{this, str, obj, str2, map});
                return;
            }
            if (obj instanceof RemoteMainResponse) {
                RemoteMainResponse remoteMainResponse = (RemoteMainResponse) obj;
                if (remoteMainResponse.getMtopResponse() != null) {
                    str3 = remoteMainResponse.getMtopResponse().getApi();
                    wuv.b(str, str3, str2, map);
                }
            }
            if (obj instanceof String) {
                str3 = (String) obj;
            } else {
                str3 = null;
            }
            wuv.b(str, str3, str2, map);
        }

        @Override // tb.yjc
        public void release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
                return;
            }
            ((a) this.i).a(this.d);
            UnifyLog.f("NextRpcRequestClientV2Impl", "Release request, current reqId = " + e(), new Object[0]);
            d();
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
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
                if (d.a(d.this) != null) {
                    d.this.release();
                    d dVar = d.this;
                    d.b(dVar, "nextrpc-timeout", d.a(dVar), null, null);
                    UnifyLog.d("NextRpcRequestClientV2Impl", "nextrpc-timeout", new Object[0]);
                }
                if (d.c(d.this) != null) {
                    d.c(d.this).d(-2, null, null, true);
                }
            }
        }

        public String i(NextRpcRequest nextRpcRequest, hkd hkdVar, z9o z9oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5bb5745", new Object[]{this, nextRpcRequest, hkdVar, z9oVar});
            }
            if (hkdVar instanceof b3k) {
                this.g = (b3k) hkdVar;
            } else if (hkdVar instanceof NextRpcResponseCallbackV2) {
                this.h = (NextRpcResponseCallbackV2) hkdVar;
            }
            this.b = nextRpcRequest;
            this.i = z9oVar;
            this.d = z5o.b();
            if (nextRpcRequest.getAllTimeOutSeconds() > vu3.b.GEO_NOT_SUPPORT) {
                this.f = (long) (nextRpcRequest.getAllTimeOutSeconds() * 1000.0d);
            }
            if (this.f < nextRpcRequest.getMtopBusiness().mtopProp.connTimeout) {
                nextRpcRequest.getMtopBusiness().setConnectionTimeoutMilliSecond((int) this.f);
            }
            Map<String, String> requestHeaders = nextRpcRequest.getMtopBusiness().mtopProp.getRequestHeaders();
            if (requestHeaders == null) {
                requestHeaders = new HashMap<>();
            }
            requestHeaders.put(MAIN_REQUEST_HEADER_REQ_ID, this.d);
            nextRpcRequest.getMtopBusiness().mtopProp.setRequestHeaders(requestHeaders);
            this.j = String.valueOf(System.currentTimeMillis());
            HashMap hashMap = new HashMap();
            hashMap.put("requestTime", this.j);
            hashMap.put("useAttachedQueue", "true");
            try {
                k("nextrpc-main-request", nextRpcRequest.getMtopBusiness().request.getApiName(), "", hashMap);
            } catch (Throwable th) {
                th.printStackTrace();
                UnifyLog.d("NextRpcRequestClientV2Impl", "UserTracker exception !", new Object[0]);
            }
            JSONObject clientPerformance = nextRpcRequest.getClientPerformance();
            if (clientPerformance != null) {
                clientPerformance.put("mtopSend", (Object) Long.valueOf(System.currentTimeMillis()));
            }
            new MtopRequestClient(nextRpcRequest.getMtopBusiness()).a(this);
            j();
            UnifyLog.c("NextRpcRequestClientV2Impl", "requestHeaderId = " + this.d, new Object[0]);
            return this.d;
        }

        @Override // tb.mwc
        public void onCached(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73f40859", new Object[]{this, mtopCacheEvent, baseOutDo, obj});
                return;
            }
            StringBuilder sb = new StringBuilder("NextRpc onCached ");
            String str = "";
            sb.append(mtopCacheEvent == null ? str : mtopCacheEvent.mtopResponse);
            UnifyLog.f("NextRpcRequestClientV2Impl", sb.toString(), new Object[0]);
            if (mtopCacheEvent == null) {
                UnifyLog.j("NextRpcRequestClientV2Impl", "mtopCacheEvent is null! ! ", new Object[0]);
                return;
            }
            MtopResponse mtopResponse = mtopCacheEvent.getMtopResponse();
            if (mtopResponse == null) {
                UnifyLog.j("NextRpcRequestClientV2Impl", "mtopResponse is null! ! ", new Object[0]);
                return;
            }
            if (mtopResponse.getBytedata() != null) {
                str = new String(mtopResponse.getBytedata());
            }
            CachedMainResponse cachedMainResponse = new CachedMainResponse(e(), str, mtopResponse.getHeaderFields(), mtopCacheEvent, baseOutDo, obj);
            b3k b3kVar = this.g;
            if (b3kVar != null) {
                b3kVar.c(cachedMainResponse);
            }
            NextRpcResponseCallbackV2 nextRpcResponseCallbackV2 = this.h;
            if (nextRpcResponseCallbackV2 != null) {
                nextRpcResponseCallbackV2.d(0, this.f32490a, null, false);
            }
        }

        @Override // tb.mwc
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            if (mtopResponse != null) {
                RemoteMainResponse remoteMainResponse = new RemoteMainResponse(e(), i, mtopResponse, null, obj);
                this.f32490a = remoteMainResponse;
                b3k b3kVar = this.g;
                if (b3kVar != null) {
                    b3kVar.b(remoteMainResponse);
                }
                NextRpcResponseCallbackV2 nextRpcResponseCallbackV2 = this.h;
                if (nextRpcResponseCallbackV2 != null) {
                    nextRpcResponseCallbackV2.d(-1, this.f32490a, null, true);
                }
            }
            UnifyLog.f("NextRpcRequestClientV2Impl", "NextRpc onError body=" + this.f32490a.getBody(), new Object[0]);
            release();
            k("nextrpc-main-response-failed", this.f32490a, null, g());
        }

        @Override // tb.mwc
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            JSONObject clientPerformance = this.b.getClientPerformance();
            if (clientPerformance != null) {
                clientPerformance.put("mtopSuccess", (Object) Long.valueOf(System.currentTimeMillis()));
            }
            RemoteMainResponse remoteMainResponse = new RemoteMainResponse(e(), i, mtopResponse, baseOutDo, obj);
            this.f32490a = remoteMainResponse;
            ((ch1) this.c).d(remoteMainResponse);
            ArrayList arrayList = new ArrayList(((ch1) this.c).b());
            if (this.b.getAttachedResponseStrategy() != NextRpcRequest.AttachedResponseStrategy.FULL || ((ch1) this.c).c()) {
                ((ch1) this.c).a();
            } else {
                arrayList.clear();
            }
            boolean hasAttachedResponse = this.f32490a.hasAttachedResponse();
            b3k b3kVar = this.g;
            if (b3kVar != null) {
                b3kVar.e(this.f32490a, arrayList);
            }
            if (this.h != null) {
                this.h.d(1, this.f32490a, arrayList, !hasAttachedResponse || ((ch1) this.c).c());
            }
            if (!hasAttachedResponse || ((ch1) this.c).c()) {
                UnifyLog.j("NextRpcRequestClientV2Impl", "No attachedResponse or attachedResponseReady!! ", new Object[0]);
                release();
            }
            HashMap hashMap = new HashMap();
            if (((ch1) this.c).c()) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("isAllAttachedResponse", str);
            hashMap.put("traceId", this.f32490a.getTraceId());
            hashMap.putAll(g());
            RemoteMainResponse remoteMainResponse2 = this.f32490a;
            if (hasAttachedResponse) {
                str2 = "hasNextData";
            } else {
                str2 = "noNextData";
            }
            k("nextrpc-main-response-success", remoteMainResponse2, str2, hashMap);
        }

        @Override // tb.mwc
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            if (mtopResponse != null) {
                RemoteMainResponse remoteMainResponse = new RemoteMainResponse(this.d, i, mtopResponse, null, obj);
                this.f32490a = remoteMainResponse;
                b3k b3kVar = this.g;
                if (b3kVar != null) {
                    b3kVar.f(remoteMainResponse);
                }
                NextRpcResponseCallbackV2 nextRpcResponseCallbackV2 = this.h;
                if (nextRpcResponseCallbackV2 != null) {
                    nextRpcResponseCallbackV2.d(-1, this.f32490a, null, true);
                }
            }
            UnifyLog.f("NextRpcRequestClientV2Impl", "NextRpc onSystemError body=" + this.f32490a.getBody(), new Object[0]);
            release();
            k("nextrpc-main-response-failed", this.f32490a, null, null);
        }

        @Override // tb.mwc
        public void onReceiveAccsData(String str, String str2, String str3, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("646e216b", new Object[]{this, str, str2, str3, jSONObject});
                return;
            }
            UnifyLog.f("NextRpcRequestClientV2Impl", "MainRequest receive attachedResponse data, current reqId = " + e(), new Object[0]);
            AttachedResponse attachedResponse = new AttachedResponse(jSONObject.getString(ATTACHED_RESPONSE_HEADER_REQ_ID), str3, h(jSONObject), jSONObject.getIntValue(ATTACHED_RESPONSE_HEADER_REQ_NUM), jSONObject.getIntValue(ATTACHED_RESPONSE_HEADER_REQ_COUNT), jSONObject.getBooleanValue("success"), jSONObject.getString("errorCode"), jSONObject.getString("errorMsg"));
            Map<String, String> b = beu.b(attachedResponse.getHeaders());
            b.putAll(g());
            k("nextrpc-attached-response", f(this.b), "", b);
            ((ch1) this.c).e(attachedResponse);
            if (this.f32490a != null) {
                int i = b.$SwitchMap$com$alibaba$android$nextrpc$request$NextRpcRequest$AttachedResponseStrategy[this.b.getAttachedResponseStrategy().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        UnifyLog.f("NextRpcRequestClientV2Impl", "ResponseStrategy no found! ! ", new Object[0]);
                    } else {
                        if (attachedResponse.isSucceed().booleanValue()) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(attachedResponse);
                            b3k b3kVar = this.g;
                            if (b3kVar != null) {
                                b3kVar.a(arrayList);
                            }
                            NextRpcResponseCallbackV2 nextRpcResponseCallbackV2 = this.h;
                            if (nextRpcResponseCallbackV2 != null) {
                                nextRpcResponseCallbackV2.d(2, this.f32490a, arrayList, ((ch1) this.c).c());
                            }
                        } else {
                            UnifyLog.f("NextRpcRequestClientV2Impl", "nextRpcResponseCallback is null or  [errorCode:" + attachedResponse.getErrorCode() + ",errorMsg:" + attachedResponse.getErrorMsg() + "]", new Object[0]);
                        }
                        ((ch1) this.c).a();
                    }
                } else if (((ch1) this.c).c() && ((ch1) this.c).b().size() > 0) {
                    b3k b3kVar2 = this.g;
                    if (b3kVar2 != null) {
                        b3kVar2.a(((ch1) this.c).b());
                    }
                    NextRpcResponseCallbackV2 nextRpcResponseCallbackV22 = this.h;
                    if (nextRpcResponseCallbackV22 != null) {
                        nextRpcResponseCallbackV22.d(2, this.f32490a, ((ch1) this.c).b(), true);
                    }
                }
                if (((ch1) this.c).c() && this.f32490a != null) {
                    release();
                }
            }
        }
    }

    public z2k(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.c = concurrentHashMap;
        this.f32486a = context.getApplicationContext();
        this.b = str;
        synchronized (f) {
            try {
                Map<String, List<z2k>> map = e;
                List list = (List) ((HashMap) map).get(str);
                list = list == null ? new ArrayList() : list;
                list.add(this);
                ((HashMap) map).put(str, list);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            c cVar = new c(concurrentHashMap);
            this.d = cVar;
            AccsServiceManager.b().a(context, str, cVar);
        }
        q70.a(context);
    }

    public static /* synthetic */ void c(z2k z2kVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ecf778", new Object[]{z2kVar, str});
        } else {
            z2kVar.f(str);
        }
    }

    @Override // tb.a3k
    public String a(NextRpcRequest nextRpcRequest, NextRpcResponseCallbackV2 nextRpcResponseCallbackV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("123fbf5b", new Object[]{this, nextRpcRequest, nextRpcResponseCallbackV2});
        }
        return e(nextRpcRequest, nextRpcResponseCallbackV2);
    }

    @Override // tb.x2k
    public String b(NextRpcRequest nextRpcRequest, b3k b3kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e14a9aa3", new Object[]{this, nextRpcRequest, b3kVar});
        }
        return e(nextRpcRequest, b3kVar);
    }

    public final void d(String str, mwc mwcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58bb4c7", new Object[]{this, str, mwcVar});
        } else {
            ((ConcurrentHashMap) this.c).put(str, mwcVar);
        }
    }

    @Override // tb.x2k, tb.a3k
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        synchronized (f) {
            try {
                Map<String, List<z2k>> map = e;
                List list = (List) ((HashMap) map).get(this.b);
                if (list != null) {
                    list.remove(this);
                    if (list.size() == 0) {
                        ((HashMap) map).remove(this.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!TextUtils.isEmpty(this.b) && this.d != null) {
            AccsServiceManager.b().d(this.f32486a, this.b, this.d);
        }
        for (String str : ((ConcurrentHashMap) this.c).keySet()) {
            if (str != null) {
                mwc mwcVar = (mwc) ((ConcurrentHashMap) this.c).get(str);
                if (mwcVar instanceof yjc) {
                    ((yjc) mwcVar).release();
                }
            }
        }
    }

    public final String e(NextRpcRequest nextRpcRequest, hkd hkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("baf0252", new Object[]{this, nextRpcRequest, hkdVar});
        }
        d dVar = new d();
        String i = dVar.i(nextRpcRequest, hkdVar, new a());
        UnifyLog.d("NextRpcRequestClientImpl", "Current reqId = " + i + " ," + nextRpcRequest.getMtopBusiness().request.toString(), new Object[0]);
        d(i, dVar);
        return i;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8457467", new Object[]{this, str});
            return;
        }
        Map<String, mwc> map = this.c;
        if (map != null) {
            ((ConcurrentHashMap) map).remove(str);
        }
    }
}
