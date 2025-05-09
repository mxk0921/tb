package com.taobao.tmgcashier.prefetch;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ReflectUtil;
import org.json.JSONObject;
import tb.nsw;
import tb.t2o;
import tb.t6s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PrefetchDataState implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PrefetchDataState";
    private WVCallBackContext mCallback;
    private Context mContext;
    private volatile PrefetchDataStateEnum mState = PrefetchDataStateEnum.INIT;
    private String mResultInfo = "";
    private String mErrorInfo = "";
    public Map<String, String> params = new HashMap(16);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum PrefetchDataStateEnum {
        INIT,
        STARTING,
        ERROR,
        SUCCESS,
        REQUESTED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(PrefetchDataStateEnum prefetchDataStateEnum, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tmgcashier/prefetch/PrefetchDataState$PrefetchDataStateEnum");
        }

        public static PrefetchDataStateEnum valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PrefetchDataStateEnum) ipChange.ipc$dispatch("c8d067a0", new Object[]{str});
            }
            return (PrefetchDataStateEnum) Enum.valueOf(PrefetchDataStateEnum.class, str);
        }
    }

    static {
        t2o.a(860880913);
        t2o.a(589299719);
    }

    public PrefetchDataState(Context context) {
        this.mContext = context;
    }

    private void sendResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8b2696", new Object[]{this, str});
        } else if (this.mCallback != null) {
            nsw nswVar = new nsw();
            nswVar.j("HY_FAILED");
            nswVar.b("errorInfo", str);
            this.mCallback.error(nswVar);
        }
    }

    private void sendSuccessResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51039bdf", new Object[]{this});
            return;
        }
        WVCallBackContext wVCallBackContext = this.mCallback;
        if (wVCallBackContext != null) {
            wVCallBackContext.success(this.mResultInfo);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        TLog.logd("frontCashier", "CashActivity", "prefetchData error:" + mtopResponse.toString());
        this.mErrorInfo = mtopResponse.toString();
        setState(PrefetchDataStateEnum.ERROR, "onError ");
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        TLog.logd("frontCashier", "CashActivity", "prefetchData onSuccess");
        JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("data", (Object) dataJsonObject.toString());
        jSONObject.put("response_date", (Object) Long.valueOf(System.currentTimeMillis()));
        jSONObject.put("request_params", (Object) this.params);
        setState(PrefetchDataStateEnum.SUCCESS, jSONObject.toJSONString());
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        TLog.logd("frontCashier", "CashActivity", "prefetchData onSystemError:" + mtopResponse.toString());
        this.mErrorInfo = mtopResponse.toString();
        setState(PrefetchDataStateEnum.ERROR, "onSystemError ");
    }

    public void setCallBack(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94d82b", new Object[]{this, wVCallBackContext});
        } else {
            this.mCallback = wVCallBackContext;
        }
    }

    public synchronized void setState(PrefetchDataStateEnum prefetchDataStateEnum, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab23de83", new Object[]{this, prefetchDataStateEnum, str});
            return;
        }
        PrefetchDataStateEnum prefetchDataStateEnum2 = PrefetchDataStateEnum.SUCCESS;
        if (prefetchDataStateEnum == prefetchDataStateEnum2) {
            this.mResultInfo = str;
        }
        PrefetchDataStateEnum prefetchDataStateEnum3 = PrefetchDataStateEnum.REQUESTED;
        if (prefetchDataStateEnum == prefetchDataStateEnum3) {
            if (this.mState == prefetchDataStateEnum2) {
                sendSuccessResult();
                this.mResultInfo = "";
            } else if (this.mState == PrefetchDataStateEnum.ERROR) {
                sendResult(this.mErrorInfo);
            } else if (this.mState == prefetchDataStateEnum3) {
                sendResult("bridge重复调用！");
            }
        }
        if (prefetchDataStateEnum == prefetchDataStateEnum2 && this.mState == prefetchDataStateEnum3) {
            sendSuccessResult();
            this.mResultInfo = "";
        } else if (prefetchDataStateEnum == PrefetchDataStateEnum.ERROR && this.mState == prefetchDataStateEnum3) {
            sendResult(this.mErrorInfo);
        }
        this.mState = prefetchDataStateEnum;
    }

    public void startRequest(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4289591", new Object[]{this, intent});
            return;
        }
        Uri data = intent.getData();
        com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(t6s.f28513a);
        String string = parseObject.getString("mtop_name");
        String string2 = parseObject.getString("api_version");
        JSONArray jSONArray = parseObject.getJSONArray("request_key_list");
        this.params.clear();
        for (int i = 0; i < jSONArray.size(); i++) {
            String str = (String) jSONArray.get(i);
            String queryParameter = data.getQueryParameter(str);
            if (queryParameter != null) {
                this.params.put(str, queryParameter);
            } else {
                TLog.logd("frontCashier", "CashActivity", "prefetchData key 为空：" + str);
            }
        }
        this.params.put("openDataPrefetch", "true");
        this.params.put("hasClose", "true");
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(string);
        mtopRequest.setVersion(string2);
        mtopRequest.setNeedEcode(false);
        mtopRequest.setData(ReflectUtil.convertMapToDataStr(this.params));
        MtopBusiness build = MtopBusiness.build(Mtop.getInstance(""), mtopRequest);
        build.reqMethod(MethodEnum.POST);
        build.registerListener((IRemoteListener) this);
        build.startRequest();
    }
}
