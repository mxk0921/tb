package com.taobao.android.detail.ttdetail.request.callback;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.runtime.RuntimeParam;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bw7;
import tb.epq;
import tb.h8n;
import tb.owc;
import tb.t2o;
import tb.tgh;
import tb.u4o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CustomMtopRequestCallback implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CustomMtopRequestCallback";
    public owc mListener;
    public MtopInfo mMtopInfo = new MtopInfo();
    public h8n mQueryParams;

    static {
        t2o.a(912262164);
        t2o.a(589299719);
    }

    public CustomMtopRequestCallback(h8n h8nVar, owc owcVar) {
        this.mQueryParams = h8nVar;
        this.mListener = owcVar;
    }

    public void callFailureListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197c1aa7", new Object[]{this});
        } else {
            new u4o().k(this.mQueryParams, this.mListener, new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.request.callback.CustomMtopRequestCallback.1
                {
                    put("forbidSkuWeexSku", "true");
                }
            }, false, new RuntimeParam[0]);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        tgh.b(TAG, "自定义mtop接口请求回调onError");
        callFailureListener();
        monitorCustomCallbackError(false);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        tgh.b(TAG, "自定义mtop接口请求回调onSystemError");
        callFailureListener();
        monitorCustomCallbackError(false);
    }

    public void monitorCustomCallbackError(boolean z) {
        String str;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b0bd15", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", this.mQueryParams.d());
        MtopInfo mtopInfo = this.mMtopInfo;
        if (mtopInfo == null || !epq.e(mtopInfo.a())) {
            z2 = false;
        }
        hashMap.put("isStream", String.valueOf(z2));
        int i = z ? -300003 : -300004;
        if (z) {
            str = "自定义请求返回数据为空";
        } else {
            str = "自定义请求回调失败";
        }
        bw7.b(hashMap, i, str);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        tgh.b(TAG, "自定义mtop接口请求回调onSuccess");
        if (this.mListener != null) {
            this.mMtopInfo.e(mtopResponse);
            if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                callFailureListener();
                monitorCustomCallbackError(true);
                return;
            }
            mtopResponse.setOriginFastJsonObject(JSON.parseObject(new String(mtopResponse.getBytedata())));
            mtopResponse.setSupportStreamJson(true);
            this.mMtopInfo.f(2);
            this.mListener.a(this.mMtopInfo, i, baseOutDo, obj);
        }
    }
}
