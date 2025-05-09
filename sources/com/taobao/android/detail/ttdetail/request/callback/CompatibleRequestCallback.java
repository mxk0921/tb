package com.taobao.android.detail.ttdetail.request.callback;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.epq;
import tb.lf7;
import tb.owc;
import tb.t2o;
import tb.tgh;
import tb.ywk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CompatibleRequestCallback implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CompatibleRequestCallback";
    private owc mListener;
    private MtopInfo mMtopInfo = new MtopInfo();
    private MainRequestParams mParams;

    static {
        t2o.a(912262163);
        t2o.a(589299719);
    }

    public CompatibleRequestCallback(MainRequestParams mainRequestParams, owc owcVar) {
        this.mParams = mainRequestParams;
        this.mListener = owcVar;
    }

    private void handleError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8778fd", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else if (this.mListener != null) {
            this.mMtopInfo.e(mtopResponse);
            this.mMtopInfo.f(3);
            this.mListener.b(this.mMtopInfo, i, obj);
            lf7.r(true, this.mParams.getItemId(), epq.a(mtopResponse));
        }
    }

    private void handleSuccess(MtopResponse mtopResponse, int i, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2cb779a", new Object[]{this, mtopResponse, new Integer(i), baseOutDo, obj});
        } else if (this.mListener != null) {
            this.mMtopInfo.e(mtopResponse);
            JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
            if (originFastJsonObject == null && mtopResponse.getBytedata() != null) {
                originFastJsonObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
                mtopResponse.setOriginFastJsonObject(originFastJsonObject);
            }
            String a2 = epq.a(mtopResponse);
            if (originFastJsonObject == null) {
                this.mMtopInfo.f(3);
                this.mListener.b(this.mMtopInfo, i, obj);
                lf7.p(true, this.mParams.getItemId(), a2);
                return;
            }
            JSONObject jSONObject = originFastJsonObject.getJSONObject("data");
            if (jSONObject == null || jSONObject.isEmpty()) {
                this.mMtopInfo.f(3);
                this.mListener.b(this.mMtopInfo, i, obj);
                lf7.p(true, this.mParams.getItemId(), a2);
                return;
            }
            JSONObject j = DynamicMergeUtils.j(originFastJsonObject);
            if (ywk.h(j)) {
                ywk.f(j, this.mParams, this.mListener);
                return;
            }
            this.mMtopInfo.e(mtopResponse);
            this.mMtopInfo.f(2);
            this.mListener.a(this.mMtopInfo, i, baseOutDo, obj);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        tgh.b(TAG, "getDetail降级请求回调，onError");
        handleError(i, mtopResponse, obj);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        tgh.b(TAG, "getDetail降级请求回调，onSuccess");
        handleSuccess(mtopResponse, i, baseOutDo, obj);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        tgh.b(TAG, "getDetail降级请求回调，onSystemError");
        handleError(i, mtopResponse, obj);
    }
}
