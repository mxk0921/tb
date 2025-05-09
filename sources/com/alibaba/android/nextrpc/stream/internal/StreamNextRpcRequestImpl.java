package com.alibaba.android.nextrpc.stream.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.mtop.IStreamMtopRequestCallback;
import com.alibaba.android.nextrpc.stream.internal.mtop.StreamMtopRequestClient;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.nextrpc.stream.request.StreamNextRpcRequest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.beu;
import tb.dtd;
import tb.k7j;
import tb.l7j;
import tb.m7j;
import tb.npq;
import tb.ppq;
import tb.qpq;
import tb.roq;
import tb.tmu;
import tb.u2k;
import tb.vu3;
import tb.wpq;
import tb.wuv;
import tb.z5o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StreamNextRpcRequestImpl implements IStreamMtopRequestCallback, dtd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTACHED_RESPONSE_HEADER_ERROR_CODE = "errorCode";
    private static final String ATTACHED_RESPONSE_HEADER_ERROR_MSG = "errorMsg";
    private static final String ATTACHED_RESPONSE_HEADER_REQ_COUNT = "seqCount";
    private static final String ATTACHED_RESPONSE_HEADER_REQ_ID = "reqId";
    private static final String ATTACHED_RESPONSE_HEADER_REQ_NUM = "seqNum";
    private static final String ATTACHED_RESPONSE_HEADER_SUCCESS = "success";
    private static final String MAIN_REQUEST_HEADER_REQ_ID = "nextrpc-req-id";
    private static final String TAG = "StreamNextRpcRequestImpl";
    private byte[] errorByteData;
    private String[] errorRet;
    private boolean isMainResponseFinish;
    private String mApiName;
    private String mVersion;
    private int mainNum;
    private ppq nextRpcResponseCallback;
    private String requestHeaderId;
    private String requestTime;
    private wpq responseStatusListener;
    private String retCode;
    private String retMsg;
    private Handler scheduleTimeoutHandler = new Handler(Looper.getMainLooper());
    private long nextrpcTimeout = 30000;
    private Map<String, qpq> attachedQueueMap = new HashMap();
    private Map<String, List<AttachedResponse>> attachedResponseMap = new HashMap();

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
            UnifyLog.d(StreamNextRpcRequestImpl.TAG, "api=" + StreamNextRpcRequestImpl.access$000(StreamNextRpcRequestImpl.this) + ",requestId=" + StreamNextRpcRequestImpl.access$100(StreamNextRpcRequestImpl.this) + ",nextrpc timeout", new Object[0]);
            StreamNextRpcRequestImpl.this.release();
            StreamOtherResponse streamOtherResponse = new StreamOtherResponse(null, StreamNextRpcRequestImpl.access$000(StreamNextRpcRequestImpl.this), StreamNextRpcRequestImpl.access$200(StreamNextRpcRequestImpl.this), -1, null);
            streamOtherResponse.setFinishType("TIMEOUT");
            StreamNextRpcRequestImpl.access$300(StreamNextRpcRequestImpl.this).b(streamOtherResponse);
            StreamNextRpcRequestImpl.access$400(StreamNextRpcRequestImpl.this, "nextrpc-timeout", null, null);
        }
    }

    public static /* synthetic */ String access$000(StreamNextRpcRequestImpl streamNextRpcRequestImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a907b7d8", new Object[]{streamNextRpcRequestImpl});
        }
        return streamNextRpcRequestImpl.mApiName;
    }

    public static /* synthetic */ String access$100(StreamNextRpcRequestImpl streamNextRpcRequestImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78c7eb77", new Object[]{streamNextRpcRequestImpl});
        }
        return streamNextRpcRequestImpl.requestHeaderId;
    }

    public static /* synthetic */ String access$200(StreamNextRpcRequestImpl streamNextRpcRequestImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48881f16", new Object[]{streamNextRpcRequestImpl});
        }
        return streamNextRpcRequestImpl.mVersion;
    }

    public static /* synthetic */ ppq access$300(StreamNextRpcRequestImpl streamNextRpcRequestImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppq) ipChange.ipc$dispatch("55123fb3", new Object[]{streamNextRpcRequestImpl});
        }
        return streamNextRpcRequestImpl.nextRpcResponseCallback;
    }

    public static /* synthetic */ void access$400(StreamNextRpcRequestImpl streamNextRpcRequestImpl, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83480a5", new Object[]{streamNextRpcRequestImpl, str, str2, map});
        } else {
            streamNextRpcRequestImpl.userTracker(str, str2, map);
        }
    }

    private void cancelScheduleTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da89d77", new Object[]{this});
        } else {
            this.scheduleTimeoutHandler.removeCallbacksAndMessages(null);
        }
    }

    private Map<String, String> getRequestTimeTraceParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bd5c65c1", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("requestTime", this.requestTime);
        hashMap.put(tmu.CURRENT_TIME, String.valueOf(System.currentTimeMillis()));
        hashMap.put("seqNum", String.valueOf(this.mainNum));
        return hashMap;
    }

    private boolean isAllAttachedResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b8d3ac7", new Object[]{this})).booleanValue();
        }
        for (qpq qpqVar : this.attachedQueueMap.values()) {
            if (!qpqVar.b()) {
                return false;
            }
        }
        return true;
    }

    private Map<String, List<String>> parseHeaders(JSONObject jSONObject) {
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

    private void receiveDataUt(boolean z, String str, boolean z2) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ff2ea9", new Object[]{this, new Boolean(z), str, new Boolean(z2)});
            return;
        }
        HashMap hashMap = new HashMap();
        if (z2) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        hashMap.put("isAllAttachedResponse", str2);
        hashMap.put("traceId", str);
        hashMap.putAll(getRequestTimeTraceParams());
        if (z) {
            str3 = "hasNextData";
        } else {
            str3 = "noNextData";
        }
        userTracker("nextrpc-main-response-success", str3, hashMap);
    }

    private void scheduleTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10099a51", new Object[]{this});
        } else {
            this.scheduleTimeoutHandler.postDelayed(new a(), this.nextrpcTimeout);
        }
    }

    private void userTracker(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9c07d", new Object[]{this, str, str2, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("isStream", "true");
        wuv.b(str, this.mApiName, str2, map);
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    @Deprecated
    public void onReceiveData(m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d309f1", new Object[]{this, m7jVar, baseOutDo, new Integer(i), obj});
        }
    }

    @Override // tb.dtd
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        ((npq.a) this.responseStatusListener).a(this.requestHeaderId);
        cancelScheduleTimeout();
        UnifyLog.d(TAG, "api=" + this.mApiName + ",requestId=" + this.requestHeaderId + ",release nextrpc", new Object[0]);
    }

    @Override // com.alibaba.android.nextrpc.stream.internal.mtop.IStreamMtopRequestCallback
    public void onReceiveData(StreamRemoteMainResponse streamRemoteMainResponse, BaseOutDo baseOutDo, int i, Object obj) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35bf9f64", new Object[]{this, streamRemoteMainResponse, baseOutDo, new Integer(i), obj});
            return;
        }
        m7j mtopStreamResponse = streamRemoteMainResponse.getMtopStreamResponse();
        if (TextUtils.isEmpty(mtopStreamResponse.c)) {
            mtopStreamResponse.c = this.mApiName;
        }
        if (TextUtils.isEmpty(mtopStreamResponse.d)) {
            mtopStreamResponse.d = this.mVersion;
        }
        if (!streamRemoteMainResponse.isBizSuccess()) {
            this.errorByteData = mtopStreamResponse.e;
            this.errorRet = mtopStreamResponse.h;
            this.retCode = mtopStreamResponse.f23820a;
            this.retMsg = mtopStreamResponse.b;
            UnifyLog.d(TAG, "onReceiveData biz error api=" + this.mApiName + ",requestId=" + this.requestHeaderId + ",mainNum=" + this.mainNum + ",ret=" + Arrays.toString(mtopStreamResponse.h) + ",retCode=" + mtopStreamResponse.f23820a + ",retMsg=" + mtopStreamResponse.b, new Object[0]);
            return;
        }
        int i2 = this.mainNum + 1;
        this.mainNum = i2;
        streamRemoteMainResponse.setMainNum(i2);
        String attachedResponseStat = streamRemoteMainResponse.getAttachedResponseStat();
        if (TextUtils.isEmpty(attachedResponseStat)) {
            this.nextRpcResponseCallback.d(streamRemoteMainResponse, null);
            if (attachedResponseStat == null) {
                z = false;
            }
            receiveDataUt(z, streamRemoteMainResponse.getTraceId(), false);
            return;
        }
        roq roqVar = new roq();
        this.attachedQueueMap.put(attachedResponseStat, roqVar);
        roqVar.d(streamRemoteMainResponse);
        for (String str : JSON.parseObject(attachedResponseStat).keySet()) {
            List<AttachedResponse> list = this.attachedResponseMap.get(str);
            if (list != null) {
                for (AttachedResponse attachedResponse : list) {
                    roqVar.a(attachedResponse);
                }
            }
        }
        ArrayList arrayList = new ArrayList(roqVar.c());
        roqVar.clear();
        this.nextRpcResponseCallback.d(streamRemoteMainResponse, arrayList);
        receiveDataUt(true, streamRemoteMainResponse.getTraceId(), isAllAttachedResponse());
    }

    @Override // com.alibaba.android.nextrpc.stream.internal.mtop.IStreamMtopRequestCallback
    public String request(StreamNextRpcRequest streamNextRpcRequest, ppq ppqVar, wpq wpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f501d571", new Object[]{this, streamNextRpcRequest, ppqVar, wpqVar});
        }
        this.nextRpcResponseCallback = ppqVar;
        this.responseStatusListener = wpqVar;
        this.requestHeaderId = z5o.b();
        this.mApiName = streamNextRpcRequest.getMtopBusiness().request.getApiName();
        this.mVersion = streamNextRpcRequest.getMtopBusiness().request.getVersion();
        if (streamNextRpcRequest.getAllTimeOutSeconds() > vu3.b.GEO_NOT_SUPPORT) {
            this.nextrpcTimeout = (long) (streamNextRpcRequest.getAllTimeOutSeconds() * 1000.0d);
        }
        if (this.nextrpcTimeout < streamNextRpcRequest.getMtopBusiness().mtopProp.connTimeout) {
            streamNextRpcRequest.getMtopBusiness().setConnectionTimeoutMilliSecond((int) this.nextrpcTimeout);
        }
        Map<String, String> requestHeaders = streamNextRpcRequest.getMtopBusiness().mtopProp.getRequestHeaders();
        if (requestHeaders == null) {
            requestHeaders = new HashMap<>();
        }
        requestHeaders.put("nextrpc-req-id", this.requestHeaderId);
        streamNextRpcRequest.getMtopBusiness().mtopProp.setRequestHeaders(requestHeaders);
        this.requestTime = String.valueOf(System.currentTimeMillis());
        u2k.a(TAG, "真正发起网络请求", System.currentTimeMillis(), null);
        new StreamMtopRequestClient(streamNextRpcRequest.getMtopBusiness()).b(this);
        scheduleTimeout();
        HashMap hashMap = new HashMap();
        hashMap.put("requestTime", this.requestTime);
        hashMap.put("useAttachedQueue", "true");
        try {
            userTracker("nextrpc-main-request", "", hashMap);
        } catch (Throwable th) {
            th.printStackTrace();
            UnifyLog.d(TAG, "UserTracker exception !", new Object[0]);
        }
        return this.requestHeaderId;
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public void onError(k7j k7jVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9471629", new Object[]{this, k7jVar, new Integer(i), obj});
            return;
        }
        this.mainNum++;
        this.isMainResponseFinish = true;
        StreamOtherResponse streamOtherResponse = new StreamOtherResponse(k7jVar, this.mApiName, this.mVersion, i, obj);
        streamOtherResponse.setByteData(this.errorByteData);
        streamOtherResponse.setRet(this.errorRet);
        streamOtherResponse.setMainNum(this.mainNum);
        streamOtherResponse.setRetCode(this.retCode);
        streamOtherResponse.setRetMsg(this.retMsg);
        streamOtherResponse.setMappingCode(k7jVar.e);
        streamOtherResponse.setResponseCode(k7jVar.f);
        UnifyLog.d(TAG, "onError api=" + this.mApiName + ",requestId=" + this.requestHeaderId + ",mainNum=" + this.mainNum + ",ret=" + Arrays.toString(this.errorRet) + ",retCode=" + k7jVar.b + ",retMsg=" + k7jVar.c, new Object[0]);
        this.errorByteData = null;
        this.errorRet = null;
        this.nextRpcResponseCallback.c(streamOtherResponse);
        if (isAllAttachedResponse()) {
            streamOtherResponse.setFinishType("MTOP_FAILURE");
            this.nextRpcResponseCallback.b(streamOtherResponse);
            release();
        }
        userTracker("nextrpc-main-response-failed", null, getRequestTimeTraceParams());
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public void onFinish(l7j l7jVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3ac67", new Object[]{this, l7jVar, new Integer(i), obj});
            return;
        }
        this.isMainResponseFinish = true;
        StreamOtherResponse streamOtherResponse = new StreamOtherResponse(l7jVar, this.mApiName, this.mVersion, i, obj);
        streamOtherResponse.setMainNum(this.mainNum);
        streamOtherResponse.setMappingCode(l7jVar.e);
        streamOtherResponse.setResponseCode(l7jVar.f);
        UnifyLog.d(TAG, "onFinish api=" + this.mApiName + ",requestId=" + this.requestHeaderId + ",mainNum=" + this.mainNum, new Object[0]);
        if (isAllAttachedResponse()) {
            this.nextRpcResponseCallback.b(streamOtherResponse);
            release();
        }
        userTracker("nextrpc-main-response-finish", null, getRequestTimeTraceParams());
    }

    @Override // com.alibaba.android.nextrpc.stream.internal.mtop.IStreamMtopRequestCallback
    public void onReceiveAccsData(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646e216b", new Object[]{this, str, str2, str3, jSONObject});
            return;
        }
        AttachedResponse attachedResponse = new AttachedResponse(jSONObject.getString("reqId"), str3, parseHeaders(jSONObject), jSONObject.getIntValue("seqNum"), jSONObject.getIntValue("seqCount"), jSONObject.getBooleanValue("success"), jSONObject.getString("errorCode"), jSONObject.getString("errorMsg"));
        String bizName = attachedResponse.getBizName();
        qpq qpqVar = null;
        for (String str4 : this.attachedQueueMap.keySet()) {
            if (JSON.parseObject(str4).containsKey(bizName)) {
                qpqVar = this.attachedQueueMap.get(str4);
            }
        }
        Map<String, String> b = beu.b(attachedResponse.getHeaders());
        b.putAll(getRequestTimeTraceParams());
        userTracker("nextrpc-attached-response", "", b);
        if (qpqVar == null) {
            List<AttachedResponse> list = this.attachedResponseMap.get(bizName);
            if (list == null) {
                list = new ArrayList<>();
                this.attachedResponseMap.put(bizName, list);
            }
            list.add(attachedResponse);
            return;
        }
        qpqVar.a(attachedResponse);
        qpqVar.clear();
        if (attachedResponse.isSucceed().booleanValue()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(attachedResponse);
            this.nextRpcResponseCallback.a(arrayList);
        }
        if (isAllAttachedResponse()) {
            if (this.isMainResponseFinish) {
                this.nextRpcResponseCallback.b(new StreamOtherResponse(null, this.mApiName, this.mVersion, -1, null));
            }
            release();
        }
    }
}
