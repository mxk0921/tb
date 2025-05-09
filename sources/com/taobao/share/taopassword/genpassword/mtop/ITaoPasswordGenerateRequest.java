package com.taobao.share.taopassword.genpassword.mtop;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.mtop.response.MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponse;
import com.taobao.share.taopassword.busniess.mtop.response.MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bwr;
import tb.eis;
import tb.j8t;
import tb.jhs;
import tb.n8t;
import tb.r4o;
import tb.ryd;
import tb.t2o;
import tb.vhs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ITaoPasswordGenerateRequest implements IRemoteBaseListener, ryd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int GET_TAOPASSWORD = 110;
    private static final String TAG = "ITaoPasswordGenerateRequest";
    private eis inputContent;
    private RemoteBusiness remoteBusiness;
    private r4o rlistener;

    static {
        t2o.a(665845919);
        t2o.a(589299719);
        t2o.a(665845874);
    }

    private void dealError(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d74a88", new Object[]{this, mtopResponse});
        } else if (this.rlistener != null) {
            vhs vhsVar = new vhs();
            if (mtopResponse == null) {
                vhsVar.d = "TPShareError_Others";
            }
            mtopResponse.getRetMsg();
            vhsVar.d = getErrorCode(mtopResponse);
            this.rlistener.f(vhsVar);
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
        } else if (this.rlistener != null && i == 110) {
            MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData = (MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData) baseOutDo.getData();
            bwr.h().w(bwr.GENPASSWORD, mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.shareDataTrack);
            vhs vhsVar = new vhs();
            vhsVar.b = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getPassword();
            vhsVar.f30021a = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getContent();
            vhsVar.c = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getUrl();
            StringBuilder sb = new StringBuilder("request success 1: resultContent.passwordKey=");
            sb.append(vhsVar.b);
            sb.append(" resultContent.passwordText=");
            sb.append(vhsVar.f30021a);
            sb.append("  passwordUrl=");
            sb.append(vhsVar.c);
            this.inputContent.getClass();
            this.rlistener.f(vhsVar);
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
        } else if (jhsVar != null && context != null) {
            this.rlistener = (r4o) jhsVar;
            this.inputContent = (eis) obj;
            if (!n8t.a(context)) {
                vhs vhsVar = new vhs();
                vhsVar.d = "TPShareError_NetworkLimit";
                this.rlistener.f(vhsVar);
                return;
            }
            MtopTaobaoSharePasswordGenpasswordRequest mtopTaobaoSharePasswordGenpasswordRequest = new MtopTaobaoSharePasswordGenpasswordRequest();
            mtopTaobaoSharePasswordGenpasswordRequest.setBizId(this.inputContent.f18604a);
            long j = this.inputContent.g;
            if (j > 0) {
                mtopTaobaoSharePasswordGenpasswordRequest.setExpireTime(j);
            }
            this.inputContent.getClass();
            mtopTaobaoSharePasswordGenpasswordRequest.setPassword("");
            mtopTaobaoSharePasswordGenpasswordRequest.setSourceType(this.inputContent.e);
            mtopTaobaoSharePasswordGenpasswordRequest.setTitle(this.inputContent.b);
            mtopTaobaoSharePasswordGenpasswordRequest.setTemplateId(this.inputContent.m);
            mtopTaobaoSharePasswordGenpasswordRequest.setPicUrl(this.inputContent.d);
            mtopTaobaoSharePasswordGenpasswordRequest.setTargetUrl(this.inputContent.c);
            mtopTaobaoSharePasswordGenpasswordRequest.setPasswordType(this.inputContent.f);
            mtopTaobaoSharePasswordGenpasswordRequest.setPopType(this.inputContent.i);
            mtopTaobaoSharePasswordGenpasswordRequest.setPopUrl(this.inputContent.j);
            mtopTaobaoSharePasswordGenpasswordRequest.setTarget(this.inputContent.k);
            Map<String, String> map = this.inputContent.h;
            if (map == null || map.size() <= 0) {
                mtopTaobaoSharePasswordGenpasswordRequest.setExtendInfo(null);
            } else {
                mtopTaobaoSharePasswordGenpasswordRequest.setExtendInfo(JSON.toJSONString(this.inputContent.h));
            }
            RemoteBusiness registeListener = ((RemoteBusiness) RemoteBusiness.build(context, mtopTaobaoSharePasswordGenpasswordRequest, j8t.a()).reqMethod(MethodEnum.POST)).registeListener((MtopListener) this);
            this.remoteBusiness = registeListener;
            registeListener.setBizId(67);
            this.remoteBusiness.useWua();
            this.remoteBusiness.startRequest(110, MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponse.class);
        }
    }
}
