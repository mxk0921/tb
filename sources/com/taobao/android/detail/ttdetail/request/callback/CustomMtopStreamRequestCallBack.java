package com.taobao.android.detail.ttdetail.request.callback;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import java.util.ArrayList;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bw7;
import tb.h8n;
import tb.m7j;
import tb.owc;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CustomMtopStreamRequestCallBack extends CustomMtopRequestCallback implements IStreamCallBackAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CustomMtopStreamRequestCallBack";

    static {
        t2o.a(912262166);
        t2o.a(912262167);
    }

    public CustomMtopStreamRequestCallBack(h8n h8nVar, owc owcVar) {
        super(h8nVar, owcVar);
    }

    public static /* synthetic */ Object ipc$super(CustomMtopStreamRequestCallBack customMtopStreamRequestCallBack, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/request/callback/CustomMtopStreamRequestCallBack");
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public String getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        h8n h8nVar = this.mQueryParams;
        if (h8nVar == null) {
            return "";
        }
        return h8nVar.c();
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public void handleExceptionDowngrade(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b7034a", new Object[]{this, new Integer(i), obj});
            return;
        }
        tgh.b(TAG, "handleExceptionDowngrade");
        handleError(i, obj);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public void handleReceiveData(m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b527e08", new Object[]{this, m7jVar, baseOutDo, new Integer(i), obj});
        } else if (m7jVar != null) {
            byte[] bArr = m7jVar.e;
            JSONObject jSONObject = m7jVar.i;
            if (jSONObject == null && bArr != null) {
                try {
                    jSONObject = JSON.parseObject(new String(bArr));
                } catch (Exception e) {
                    tgh.b(TAG, "handleReceiveData parse exception:" + e);
                }
            }
            if (jSONObject == null || jSONObject.getJSONObject("data") == null || jSONObject.getJSONObject("data").isEmpty()) {
                MtopResponse mtopResponse = new MtopResponse();
                HashMap hashMap = new HashMap();
                hashMap.put("useStreamApi", new ArrayList());
                mtopResponse.setHeaderFields(hashMap);
                mtopResponse.setRetMsg("MainScreenDataEmpty");
                this.mMtopInfo.e(mtopResponse);
                handleError(i, obj);
            }
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public boolean handleRequestDowngrade(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92f4c829", new Object[]{this, jSONObject, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.CustomMtopRequestCallback, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        tgh.b(TAG, "customStreamApi mtop接口请求回调onError");
        handleError(i, obj);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.CustomMtopRequestCallback, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        owc owcVar = this.mListener;
        if (owcVar != null) {
            owcVar.a(this.mMtopInfo, i, baseOutDo, obj);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.CustomMtopRequestCallback, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        tgh.b(TAG, "customStreamApi mtop接口请求回调onSystemError");
        handleError(i, obj);
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

    private void handleError(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea606b78", new Object[]{this, new Integer(i), obj});
            return;
        }
        tgh.b(TAG, "handleError");
        this.mMtopInfo.f(3);
        owc owcVar = this.mListener;
        if (owcVar != null) {
            owcVar.b(this.mMtopInfo, i, obj);
        }
        bw7.b(new HashMap(), -300127, "自定义流式请求回调失败");
    }
}
