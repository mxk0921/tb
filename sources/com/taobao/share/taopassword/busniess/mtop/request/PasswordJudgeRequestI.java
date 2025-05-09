package com.taobao.share.taopassword.busniess.mtop.request;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.mtop.response.MtopTaobaoWirelessSharePasswordGetResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.j8t;
import tb.jhs;
import tb.jtl;
import tb.n8t;
import tb.ryd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PasswordJudgeRequestI implements ryd, IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int GET_TAOPASSWORD = 110;
    private static final String TAG = "PasswordJudgeRequestI";
    private jtl mListener;
    private RemoteBusiness remoteBusiness;

    static {
        t2o.a(665845888);
        t2o.a(665845874);
        t2o.a(589299719);
    }

    private void dealError(MtopResponse mtopResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d74a88", new Object[]{this, mtopResponse});
        } else if (this.mListener != null) {
            if (mtopResponse != null) {
                str = mtopResponse.getRetMsg();
            } else {
                str = "respon is null";
            }
            this.mListener.e(getErrorCode(mtopResponse), str);
        }
    }

    private String getErrorCode(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4f0bf55", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null) {
            return "TPShareError_Others";
        }
        if (mtopResponse.isIllegelSign()) {
            return "TPShareError_IllegelSign";
        }
        if (mtopResponse.isSessionInvalid()) {
            return "TPShareError_SessionExpired";
        }
        if (mtopResponse.isNetworkError()) {
            return "TPShareError_NetworkTimeout";
        }
        if (mtopResponse.isMtopSdkError() || mtopResponse.isExpiredRequest() || mtopResponse.isSystemError()) {
            return "TPError_NetworkSysError";
        }
        if (mtopResponse.is41XResult() || mtopResponse.isApiLockedResult()) {
            return "TPShareError_NetworkLimit";
        }
        return mtopResponse.getRetCode();
    }

    @Override // tb.ryd
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.remoteBusiness;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
            this.remoteBusiness = null;
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            dealError(mtopResponse);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (this.mListener != null && i == 110) {
            Map map = (Map) baseOutDo.getData();
            boolean equals = "true".equals(map.get("result"));
            new StringBuilder("result : ").append(map.get("result"));
            this.mListener.d(equals);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            dealError(mtopResponse);
        }
    }

    @Override // tb.ryd
    public void request(Context context, Object obj, jhs jhsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e5a749", new Object[]{this, context, obj, jhsVar});
        } else if ((jhsVar instanceof jtl) && context != null) {
            this.mListener = (jtl) jhsVar;
            if (!n8t.a(context)) {
                this.mListener.d(true);
                return;
            }
            MtopJudgePasswordRequest mtopJudgePasswordRequest = new MtopJudgePasswordRequest();
            mtopJudgePasswordRequest.setPasswordContent((String) obj);
            RemoteBusiness registeListener = RemoteBusiness.build(context, mtopJudgePasswordRequest, j8t.a()).registeListener((MtopListener) this);
            this.remoteBusiness = registeListener;
            registeListener.setBizId(67);
            this.remoteBusiness.startRequest(110, MtopTaobaoWirelessSharePasswordGetResponse.class);
        }
    }
}
