package com.taobao.taolive.room.pre;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.business.IRemoteExtendListener;
import com.taobao.taolive.sdk.core.impl.TBLiveDataProvider;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.List;
import java.util.Map;
import tb.eir;
import tb.hlc;
import tb.jg7;
import tb.t2o;
import tb.v2s;
import tb.vnm;
import tb.y6j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PreRequestImpl implements IRemoteExtendListener, hlc.a, TBLiveDataProvider.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TBLiveDataProvider.c mHeaderListener;
    private hlc.a mIGetVideoInfoListener;
    private PreRequestInfo mPreRequestInfo;

    static {
        t2o.a(806355769);
        t2o.a(806355975);
        t2o.a(806356090);
        t2o.a(806356086);
        t2o.a(806355767);
    }

    @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
    public void dataParseBegin(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a054be1d", new Object[]{this, new Long(j)});
        }
    }

    @Override // tb.hlc.a
    public void onGetFandomInfoSuccess(FandomInfo fandomInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52d6dd", new Object[]{this, fandomInfo, str});
            return;
        }
        eir.b(vnm.TAG, "onGetFandomInfoSuccess");
        hlc.a aVar = this.mIGetVideoInfoListener;
        if (aVar != null) {
            aVar.onGetFandomInfoSuccess(fandomInfo, str);
        }
        PreRequestInfo preRequestInfo = this.mPreRequestInfo;
        if (preRequestInfo != null) {
            preRequestInfo.fandomInfo = fandomInfo;
            preRequestInfo.fandomResponse = str;
        }
    }

    @Override // com.taobao.taolive.sdk.core.impl.TBLiveDataProvider.c
    public void onGetHeaderFields(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd45ac1", new Object[]{this, map});
            return;
        }
        TBLiveDataProvider.c cVar = this.mHeaderListener;
        if (cVar != null) {
            cVar.onGetHeaderFields(map);
        }
    }

    @Override // tb.hlc.a
    public void onGetVideoInfoSuccess(VideoInfo videoInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889673f", new Object[]{this, videoInfo, str});
            return;
        }
        hlc.a aVar = this.mIGetVideoInfoListener;
        if (aVar != null) {
            aVar.onGetVideoInfoSuccess(videoInfo, str);
        }
        PreRequestInfo preRequestInfo = this.mPreRequestInfo;
        if (preRequestInfo != null) {
            preRequestInfo.info = videoInfo;
            preRequestInfo.rawData = str;
            preRequestInfo.responseStatus = 1;
        }
    }

    public void removeResponseListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4a0c0", new Object[]{this});
            return;
        }
        this.mIGetVideoInfoListener = null;
        this.mHeaderListener = null;
    }

    @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
    public void responseReceive(y6j y6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f400314d", new Object[]{this, y6jVar});
        }
    }

    public void setResponseListener(hlc.a aVar, TBLiveDataProvider.c cVar) {
        hlc.a aVar2;
        TBLiveDataProvider.c cVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f62c045", new Object[]{this, aVar, cVar});
            return;
        }
        this.mIGetVideoInfoListener = aVar;
        this.mHeaderListener = cVar;
        PreRequestInfo preRequestInfo = this.mPreRequestInfo;
        if (preRequestInfo != null) {
            int i = preRequestInfo.responseStatus;
            if (i != 1) {
                if (i == 2 && aVar != null) {
                    aVar.onGetVideoInfoFail(preRequestInfo.errCode);
                    eir.b(vnm.TAG, "addResponseListener fail feedId:" + this.mPreRequestInfo.errCode);
                }
            } else if (aVar != null) {
                aVar.onGetVideoInfoSuccess(preRequestInfo.info, preRequestInfo.rawData);
                if (this.mPreRequestInfo.info != null) {
                    eir.b(vnm.TAG, "addResponseListener success feedId:" + this.mPreRequestInfo.info.liveId);
                }
            }
            PreRequestInfo preRequestInfo2 = this.mPreRequestInfo;
            if (preRequestInfo2.headerResponseStatus == 1 && (cVar2 = this.mHeaderListener) != null) {
                cVar2.onGetHeaderFields(preRequestInfo2.headerMap);
                eir.b(vnm.TAG, "addResponseListener headerResponseStatus success");
            }
            PreRequestInfo preRequestInfo3 = this.mPreRequestInfo;
            if (preRequestInfo3.fandomInfo != null && !TextUtils.isEmpty(preRequestInfo3.fandomResponse) && (aVar2 = this.mIGetVideoInfoListener) != null) {
                PreRequestInfo preRequestInfo4 = this.mPreRequestInfo;
                aVar2.onGetFandomInfoSuccess(preRequestInfo4.fandomInfo, preRequestInfo4.fandomResponse);
                eir.b(vnm.TAG, "addResponseListener onGetFandomInfoSuccess success");
            }
        }
    }

    public void startRealRequest(PreRequestInfo preRequestInfo) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bedbdf", new Object[]{this, preRequestInfo});
            return;
        }
        this.mPreRequestInfo = preRequestInfo;
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(preRequestInfo.params.itemid)) {
            jSONObject2.put("itemid", (Object) preRequestInfo.params.itemid);
        }
        jSONObject2.put("guardAnchorSwitch", (Object) Boolean.valueOf(v2s.o().I("enableAnchorGuard")));
        jSONObject2.put("version", (Object) "202107");
        JSONObject jSONObject3 = preRequestInfo.params.extJson;
        if (jSONObject3 != null) {
            jSONObject2.putAll(jSONObject3);
        }
        preRequestInfo.tbLiveDataProvider.setIRemoteExtendListener(this);
        LiveDetailPreRequestParams liveDetailPreRequestParams = preRequestInfo.params;
        jg7 jg7Var = new jg7(liveDetailPreRequestParams.feedId, liveDetailPreRequestParams.userId);
        jg7 s = jg7Var.D(liveDetailPreRequestParams.timeMovingItemId).B(preRequestInfo.params.sjsdItemId).w(preRequestInfo.params.liveSource).s(jSONObject2.toString());
        LiveDetailPreRequestParams liveDetailPreRequestParams2 = preRequestInfo.params;
        s.u(liveDetailPreRequestParams2.itemIds, liveDetailPreRequestParams2.holdType).t(preRequestInfo.params.forceFandom).F(preRequestInfo.params.transParams).y(preRequestInfo.params.needRecommend).v(preRequestInfo.params.keyPointId);
        LiveDetailPreRequestParams liveDetailPreRequestParams3 = preRequestInfo.params;
        jg7Var.t = liveDetailPreRequestParams3.outerParam;
        if (!TextUtils.isEmpty(liveDetailPreRequestParams3.productType)) {
            jg7Var.z(preRequestInfo.params.productType);
        }
        if (!TextUtils.isEmpty(preRequestInfo.params.timeMovingItemId)) {
            jg7Var.D(preRequestInfo.params.timeMovingItemId);
        }
        jg7Var.G(preRequestInfo.params.useLiveFandom);
        jg7Var.E(preRequestInfo.params.transMap);
        LiveDetailPreRequestParams liveDetailPreRequestParams4 = preRequestInfo.params;
        if (!(liveDetailPreRequestParams4 == null || (jSONObject = liveDetailPreRequestParams4.tcpParams) == null)) {
            jg7Var.r = jSONObject;
        }
        preRequestInfo.tbLiveDataProvider.getVideoInfo(jg7Var, liveDetailPreRequestParams4.rcmd, this);
        TBLiveDataProvider tBLiveDataProvider = preRequestInfo.tbLiveDataProvider;
        if (tBLiveDataProvider instanceof TBLiveDataProvider) {
            tBLiveDataProvider.setResponseHeaderListener(this);
        }
    }

    @Override // tb.hlc.a
    public void onGetVideoInfoFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa662561", new Object[]{this, str});
            return;
        }
        eir.b(vnm.TAG, "onGetVideoInfoFail errCode:" + str);
        hlc.a aVar = this.mIGetVideoInfoListener;
        if (aVar != null) {
            aVar.onGetVideoInfoFail(str);
        }
        PreRequestInfo preRequestInfo = this.mPreRequestInfo;
        if (preRequestInfo != null) {
            preRequestInfo.errCode = str;
            preRequestInfo.responseStatus = 2;
        }
    }
}
