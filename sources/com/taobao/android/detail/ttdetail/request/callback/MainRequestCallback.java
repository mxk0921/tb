package com.taobao.android.detail.ttdetail.request.callback;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bw7;
import tb.epq;
import tb.hi8;
import tb.lf7;
import tb.m7j;
import tb.owc;
import tb.t2o;
import tb.tgh;
import tb.vbl;
import tb.w7j;
import tb.ywk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MainRequestCallback implements IStreamCallBackAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MainRequestCallback";
    public owc mListener;
    public MtopInfo mMtopInfo = new MtopInfo();
    public MainRequestParams mParams;
    public String mToken;

    static {
        t2o.a(912262168);
        t2o.a(912262167);
    }

    public MainRequestCallback(MainRequestParams mainRequestParams, owc owcVar) {
        this.mParams = mainRequestParams;
        this.mListener = owcVar;
        this.mToken = mainRequestParams.getDetailToken();
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public String getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.mParams.getItemId();
    }

    public void handleDowngrade(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81c39fe", new Object[]{this, str});
            return;
        }
        tgh.b(TAG, "主请求降级getDetail/6.0");
        lf7.e(this.mParams, this.mListener, str);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public void handleExceptionDowngrade(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b7034a", new Object[]{this, new Integer(i), obj});
        } else if (vbl.U()) {
            handleDowngrade(epq.a(this.mMtopInfo.a()));
        } else {
            this.mListener.b(this.mMtopInfo, i, obj);
        }
    }

    public void handleOneProductMMDegrade(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a39e904", new Object[]{this, jSONObject});
            return;
        }
        tgh.b(TAG, "一品多商降级");
        ywk.f(jSONObject, this.mParams, this.mListener);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public void handleReceiveData(m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b527e08", new Object[]{this, m7jVar, baseOutDo, new Integer(i), obj});
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public boolean handleRequestDowngrade(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92f4c829", new Object[]{this, jSONObject, str})).booleanValue();
        }
        JSONObject j = DynamicMergeUtils.j(jSONObject);
        if (DataUtils.N(j)) {
            handleDowngrade(str);
            return true;
        } else if (!ywk.h(j)) {
            return false;
        } else {
            handleOneProductMMDegrade(j);
            return true;
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        tgh.b(TAG, "主接口非预请求回调，onError");
        handleError(i, mtopResponse, obj);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        tgh.b(TAG, "主接口非预请求回调，onSuccess");
        PerformanceUtils.p(this.mParams.getDetailToken(), "response", System.currentTimeMillis());
        if (this.mListener != null) {
            this.mMtopInfo.e(mtopResponse);
            if (epq.e(mtopResponse)) {
                this.mListener.a(this.mMtopInfo, i, baseOutDo, obj);
            } else {
                handleSuccess(mtopResponse, i, baseOutDo, obj);
            }
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        tgh.b(TAG, "主接口非预请求回调，onSystemError");
        handleError(i, mtopResponse, obj);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public void setMtopInfo(MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72575c19", new Object[]{this, mtopInfo});
        } else {
            this.mMtopInfo = mtopInfo;
        }
    }

    private void handleError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8778fd", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else if (this.mListener != null) {
            String a2 = epq.a(mtopResponse);
            tgh.b(TAG, "非流式handleError traceId=" + a2);
            this.mMtopInfo.e(mtopResponse);
            this.mMtopInfo.f(3);
            if (hi8.b(mtopResponse) || epq.e(mtopResponse)) {
                this.mListener.b(this.mMtopInfo, i, obj);
            } else {
                handleExceptionDowngrade(i, obj);
            }
            lf7.r(!w7j.e(mtopResponse.getApi()), this.mParams.getItemId(), a2);
        }
    }

    private void handleSuccess(MtopResponse mtopResponse, int i, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2cb779a", new Object[]{this, mtopResponse, new Integer(i), baseOutDo, obj});
        } else if (this.mListener != null) {
            String a2 = epq.a(mtopResponse);
            tgh.b(TAG, "非流式handleSuccess traceId=" + a2);
            if (hi8.b(mtopResponse)) {
                this.mMtopInfo.f(3);
                this.mListener.b(this.mMtopInfo, i, obj);
                return;
            }
            JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
            if (originFastJsonObject == null && mtopResponse.getBytedata() != null) {
                try {
                    originFastJsonObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
                } catch (Exception e) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("itemId", this.mParams.getItemId());
                    bw7.b(hashMap, -300018, "主接口结果parse异常");
                    tgh.b(TAG, "parseObject exception:" + e);
                    originFastJsonObject = null;
                }
                mtopResponse.setOriginFastJsonObject(originFastJsonObject);
            }
            if (originFastJsonObject == null) {
                this.mMtopInfo.f(3);
                handleExceptionDowngrade(i, obj);
                lf7.p(!w7j.e(mtopResponse.getApi()), this.mParams.getItemId(), a2);
                return;
            }
            JSONObject jSONObject = originFastJsonObject.getJSONObject("data");
            if (jSONObject == null || jSONObject.isEmpty()) {
                this.mMtopInfo.f(3);
                handleExceptionDowngrade(i, obj);
                lf7.p(!w7j.e(mtopResponse.getApi()), this.mParams.getItemId(), a2);
            } else if (!handleRequestDowngrade(originFastJsonObject, a2)) {
                this.mMtopInfo.f(2);
                this.mListener.a(this.mMtopInfo, i, baseOutDo, obj);
            }
        }
    }
}
