package com.taobao.android.detail.ttdetail.request.stream;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.taobao.tao.stream.IMtopStreamListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a4o;
import tb.bw7;
import tb.epq;
import tb.hi8;
import tb.jk;
import tb.k7j;
import tb.l7j;
import tb.m7j;
import tb.t2o;
import tb.tgh;
import tb.upq;
import tb.w7j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MtopStreamRequestCallback implements IMtopStreamListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MtopStreamRequestCallback";
    public static final String X_USED_STREAM = "x-used-stream";
    private IStreamCallBackAdapter mRequestCallback;
    private volatile String mStreamId;
    private String mToken;
    private AtomicBoolean mIsFirstReceived = new AtomicBoolean(false);
    private upq mStreamDataController = new upq();

    static {
        t2o.a(912262218);
        t2o.a(589299782);
    }

    public MtopStreamRequestCallback(String str, String str2) {
        this.mToken = str;
        this.mStreamId = str2;
        a4o.n(str, str2);
    }

    private Map<String, List<String>> copyMap(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8a3fa10c", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        String key = entry.getKey();
                        List<String> value = entry.getValue();
                        ArrayList arrayList = new ArrayList();
                        if (value != null && !value.isEmpty()) {
                            arrayList.addAll(value);
                            hashMap.put(key, arrayList);
                        }
                        hashMap.put(key, arrayList);
                    }
                }
            } catch (Exception e) {
                tgh.c(TAG, "streamId=" + this.mStreamId + ", 流式返回headerFields异常", e);
            }
        }
        return hashMap;
    }

    private boolean isStreamData(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5e1a78e", new Object[]{this, map})).booleanValue();
        }
        return epq.c(map);
    }

    private void monitorStreamDataEmpty(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b758eb46", new Object[]{this, str, str2, str3, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put(jk.KEY_RET_CODE, str2);
        hashMap.put(jk.KEY_RET_MSG, str3);
        hashMap.put("isStream", String.valueOf(z));
        bw7.b(hashMap, -300007, "流式返回数据为空");
    }

    private void monitorStreamError(String str, String str2, String str3, boolean z, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea67a6b", new Object[]{this, str, str2, str3, new Boolean(z), str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put(jk.KEY_RET_CODE, str2);
        hashMap.put(jk.KEY_RET_MSG, str3);
        hashMap.put("errorMsg", str4);
        hashMap.put("isStream", String.valueOf(z));
        bw7.b(hashMap, -300008, "流式请求回调错误");
    }

    public synchronized void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mRequestCallback = null;
        tgh.b(TAG, "destroy(), set mRequestCallback null");
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public void onError(k7j k7jVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9471629", new Object[]{this, k7jVar, new Integer(i), obj});
            return;
        }
        tgh.b(TAG, "streamId=" + this.mStreamId + ", 主接口流式请求回调，onError");
        if (!TextUtils.equals(this.mStreamId, a4o.f(this.mToken))) {
            bw7.a(-300014, "丢弃流式回调结果");
            return;
        }
        synchronized (this) {
            handleStreamError(k7jVar, i, obj);
        }
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public void onFinish(l7j l7jVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3ac67", new Object[]{this, l7jVar, new Integer(i), obj});
            return;
        }
        tgh.b(TAG, "streamId=" + this.mStreamId + ", 主接口流式请求回调，onFinish");
        if (!TextUtils.equals(this.mStreamId, a4o.f(this.mToken))) {
            bw7.a(-300014, "丢弃流式回调结果");
            return;
        }
        synchronized (this) {
            handleStreamFinish(l7jVar, i, obj);
        }
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public void onReceiveData(m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d309f1", new Object[]{this, m7jVar, baseOutDo, new Integer(i), obj});
            return;
        }
        tgh.b(TAG, "streamId=" + this.mStreamId + ", 主接口流式请求回调，onReceiveData");
        PerformanceUtils.p(this.mToken, "response", System.currentTimeMillis());
        if (!TextUtils.equals(this.mStreamId, a4o.f(this.mToken))) {
            bw7.a(-300014, "丢弃流式回调结果");
            return;
        }
        synchronized (this) {
            handleReceiveData(m7jVar, baseOutDo, i, obj);
        }
    }

    public void setMtopRequestCallback(IStreamCallBackAdapter iStreamCallBackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3fc97a8", new Object[]{this, iStreamCallBackAdapter});
        } else {
            this.mRequestCallback = iStreamCallBackAdapter;
        }
    }

    private void handleStreamError(k7j k7jVar, int i, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c632b312", new Object[]{this, k7jVar, new Integer(i), obj});
            return;
        }
        Map<String, List<String>> map = null;
        this.mStreamId = null;
        this.mStreamDataController.a();
        if (this.mRequestCallback != null) {
            if (k7jVar != null) {
                map = k7jVar.f25875a;
            }
            String str2 = "";
            String str3 = k7jVar == null ? str2 : k7jVar.b;
            if (k7jVar != null) {
                str2 = k7jVar.c;
            }
            int i2 = k7jVar == null ? 0 : k7jVar.f;
            Map<String, List<String>> copyMap = copyMap(map);
            copyMap.put("useStreamApi", new ArrayList());
            MtopResponse mtopResponse = new MtopResponse();
            mtopResponse.setRetCode(str3);
            mtopResponse.setRetMsg(str2);
            mtopResponse.setHeaderFields(copyMap);
            mtopResponse.setResponseCode(i2);
            String a2 = epq.a(mtopResponse);
            tgh.b(TAG, "流式handleStreamError traceId=" + a2);
            MtopInfo mtopInfo = new MtopInfo();
            mtopInfo.e(mtopResponse);
            mtopInfo.f(3);
            this.mRequestCallback.setMtopInfo(mtopInfo);
            if (this.mIsFirstReceived.compareAndSet(false, true)) {
                tgh.b(TAG, "无onReceiveData流式调用error, retCode:" + str3 + ", retMsg:" + str2);
                if (hi8.b(mtopResponse)) {
                    this.mRequestCallback.onError(i, mtopResponse, obj);
                } else {
                    this.mRequestCallback.handleExceptionDowngrade(i, obj);
                }
                str = "noOnReceiveDataError";
            } else {
                tgh.b(TAG, "有onReceiveData流式调用error, retCode:" + str3 + "retMsg:" + str2);
                this.mRequestCallback.onError(i, mtopResponse, obj);
                str = "onReceiveDataError";
            }
            monitorStreamError(this.mRequestCallback.getItemId(), str3, str2, isStreamData(copyMap), str);
        }
    }

    private void handleStreamFinish(l7j l7jVar, int i, Object obj) {
        String str;
        String str2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4bb310", new Object[]{this, l7jVar, new Integer(i), obj});
        } else if (this.mRequestCallback == null) {
            this.mStreamId = null;
            this.mStreamDataController.a();
        } else {
            Map<String, List<String>> map = l7jVar == null ? null : l7jVar.f25875a;
            if (l7jVar == null) {
                str = "";
            } else {
                str = l7jVar.b;
            }
            if (l7jVar == null) {
                str2 = "";
            } else {
                str2 = l7jVar.c;
            }
            Map<String, List<String>> copyMap = copyMap(map);
            copyMap.put("useStreamApi", new ArrayList());
            MtopResponse mtopResponse = new MtopResponse();
            mtopResponse.setRetCode(str);
            mtopResponse.setRetMsg(str2);
            mtopResponse.setHeaderFields(copyMap);
            String a2 = epq.a(mtopResponse);
            tgh.b(TAG, "流式handleStreamFinish traceId=" + a2);
            boolean isStreamData = isStreamData(copyMap);
            tgh.b(TAG, "streamId=" + this.mStreamId + ", 流式回调：" + isStreamData);
            MtopInfo mtopInfo = new MtopInfo();
            mtopInfo.e(mtopResponse);
            mtopInfo.f(3);
            this.mRequestCallback.setMtopInfo(mtopInfo);
            if (this.mIsFirstReceived.compareAndSet(false, true)) {
                tgh.b(TAG, "streamId=" + this.mStreamId + ", 无onReceiveData流式调用finish, retCode:" + str + "retMsg:" + str2);
                monitorStreamError(this.mRequestCallback.getItemId(), str, str2, isStreamData, "NoOnReceiveDataFinish");
                this.mRequestCallback.onError(i, mtopResponse, obj);
            } else {
                try {
                    jSONObject = this.mStreamDataController.g();
                } catch (Throwable th) {
                    tgh.c(TAG, "streamId=" + this.mStreamId + ", 合并数据失败", th);
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("itemId", this.mRequestCallback.getItemId());
                    bw7.b(hashMap, -300009, "流式数据合并失败");
                    mtopInfo.f(3);
                    this.mRequestCallback.onError(i, mtopResponse, obj);
                } else {
                    mtopResponse.setOriginFastJsonObject(jSONObject);
                    mtopResponse.setSupportStreamJson(true);
                    mtopInfo.f(2);
                    mtopInfo.d(this.mStreamDataController.c());
                    this.mRequestCallback.onSuccess(i, mtopResponse, null, obj);
                }
            }
            this.mStreamId = null;
            this.mStreamDataController.a();
        }
    }

    private void handleReceiveData(m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b527e08", new Object[]{this, m7jVar, baseOutDo, new Integer(i), obj});
            return;
        }
        byte[] bArr = m7jVar == null ? null : m7jVar.e;
        String str = "";
        if (this.mIsFirstReceived.compareAndSet(false, true)) {
            Map<String, List<String>> map = m7jVar == null ? null : m7jVar.g;
            String str2 = m7jVar == null ? str : m7jVar.f23820a;
            String str3 = m7jVar == null ? str : m7jVar.b;
            String str4 = m7jVar == null ? str : m7jVar.c;
            JSONObject jSONObject = m7jVar == null ? null : m7jVar.i;
            Map<String, List<String>> copyMap = copyMap(map);
            boolean isStreamData = isStreamData(copyMap);
            tgh.b(TAG, "streamId=" + this.mStreamId + ", 流式回调：" + isStreamData);
            copyMap.put("useStreamApi", new ArrayList());
            MtopResponse mtopResponse = new MtopResponse();
            mtopResponse.setRetCode(str2);
            mtopResponse.setRetMsg(str3);
            mtopResponse.setApi(str4);
            mtopResponse.setBytedata(bArr);
            if (jSONObject == null && bArr != null) {
                try {
                    jSONObject = JSON.parseObject(new String(bArr));
                } catch (Exception e) {
                    IStreamCallBackAdapter iStreamCallBackAdapter = this.mRequestCallback;
                    if (iStreamCallBackAdapter != null) {
                        str = iStreamCallBackAdapter.getItemId();
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("itemId", str);
                    if (w7j.e(str4)) {
                        bw7.b(hashMap, -300018, "主接口结果parse异常");
                    }
                    tgh.b(TAG, "parseObject exception:" + e);
                    jSONObject = null;
                }
            }
            mtopResponse.setOriginFastJsonObject(jSONObject);
            mtopResponse.setSupportStreamJson(true);
            mtopResponse.setHeaderFields(copyMap);
            String a2 = epq.a(mtopResponse);
            tgh.b(TAG, "流式一段handleReceiveData traceId=" + a2);
            IStreamCallBackAdapter iStreamCallBackAdapter2 = this.mRequestCallback;
            if (iStreamCallBackAdapter2 != null) {
                String itemId = iStreamCallBackAdapter2.getItemId();
                MtopInfo mtopInfo = new MtopInfo();
                mtopInfo.e(mtopResponse);
                this.mRequestCallback.setMtopInfo(mtopInfo);
                if (hi8.b(mtopResponse)) {
                    mtopInfo.f(3);
                    this.mRequestCallback.onError(i, mtopResponse, obj);
                } else if (jSONObject == null) {
                    mtopInfo.f(3);
                    this.mRequestCallback.handleExceptionDowngrade(i, obj);
                    this.mStreamId = null;
                    this.mStreamDataController.a();
                    monitorStreamDataEmpty(itemId, str2, str3, isStreamData);
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (jSONObject2 == null || jSONObject2.isEmpty()) {
                        mtopInfo.f(3);
                        this.mRequestCallback.handleExceptionDowngrade(i, obj);
                        this.mStreamId = null;
                        this.mStreamDataController.a();
                        monitorStreamDataEmpty(itemId, str2, str3, isStreamData);
                    } else if (this.mRequestCallback.handleRequestDowngrade(jSONObject, a2)) {
                        this.mStreamId = null;
                        this.mStreamDataController.a();
                    } else {
                        this.mStreamDataController.b(bArr);
                        mtopInfo.f(1);
                        mtopInfo.d(this.mStreamDataController.c());
                        this.mRequestCallback.onSuccess(i, mtopResponse, baseOutDo, obj);
                        tgh.b(TAG, "首段数据返回");
                    }
                }
            }
        } else {
            this.mStreamDataController.b(bArr);
            StringBuilder sb = new StringBuilder("streamId=");
            sb.append(this.mStreamId);
            sb.append(", 第");
            if (m7jVar != null) {
                str = m7jVar.f;
            }
            sb.append(str);
            sb.append("段数据返回");
            tgh.b(TAG, sb.toString());
            IStreamCallBackAdapter iStreamCallBackAdapter3 = this.mRequestCallback;
            if (iStreamCallBackAdapter3 != null) {
                iStreamCallBackAdapter3.handleReceiveData(m7jVar, baseOutDo, i, obj);
            }
        }
    }
}
