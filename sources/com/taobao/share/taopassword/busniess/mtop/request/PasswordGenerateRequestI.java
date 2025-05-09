package com.taobao.share.taopassword.busniess.mtop.request;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.model.ALCreatePassWordModel;
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
import tb.ctl;
import tb.j8t;
import tb.jhs;
import tb.n8t;
import tb.ryd;
import tb.t2o;
import tb.u9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PasswordGenerateRequestI implements IRemoteBaseListener, ryd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int GET_TAOPASSWORD = 110;
    private static final String TAG = "ITaoPasswordGenerateRequest";
    private ALCreatePassWordModel inputContent;
    private RemoteBusiness remoteBusiness;
    private ctl rlistener;

    static {
        t2o.a(665845887);
        t2o.a(589299719);
        t2o.a(665845874);
    }

    private void dealError(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d74a88", new Object[]{this, mtopResponse});
        } else if (this.rlistener != null) {
            new u9().f29237a = this.inputContent;
            if (mtopResponse == null) {
                this.rlistener.a("TPShareError_Others", mtopResponse.getRetMsg());
            }
            this.rlistener.a(getErrorCode(mtopResponse), mtopResponse.getRetMsg());
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
            u9 u9Var = new u9();
            u9Var.f29237a = this.inputContent;
            u9Var.b = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getPassword();
            u9Var.e = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getContent();
            u9Var.f = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getUrl();
            u9Var.d = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getLongUrl();
            u9Var.c = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getValidDate();
            u9Var.g = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getSwitchNewWx();
            this.rlistener.c(u9Var);
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
            this.rlistener = (ctl) jhsVar;
            this.inputContent = (ALCreatePassWordModel) obj;
            if (!n8t.a(context)) {
                u9 u9Var = new u9();
                u9Var.f29237a = this.inputContent;
                this.rlistener.c(u9Var);
                return;
            }
            MtopGenPasswordRequest mtopGenPasswordRequest = new MtopGenPasswordRequest();
            mtopGenPasswordRequest.setBizId(this.inputContent.c);
            mtopGenPasswordRequest.setTitle(this.inputContent.b);
            mtopGenPasswordRequest.setTargetUrl(this.inputContent.f11766a);
            String str = this.inputContent.j;
            if (str != null) {
                mtopGenPasswordRequest.setSourceType(str);
            }
            String str2 = this.inputContent.e;
            if (str2 != null) {
                mtopGenPasswordRequest.setTemplateId(str2);
            }
            String str3 = this.inputContent.d;
            if (str3 != null) {
                mtopGenPasswordRequest.setPicUrl(str3);
            }
            String str4 = this.inputContent.g;
            if (str4 != null) {
                mtopGenPasswordRequest.setPopType(str4);
            }
            String str5 = this.inputContent.h;
            if (str5 != null) {
                mtopGenPasswordRequest.setPopUrl(str5);
            }
            String str6 = this.inputContent.i;
            if (str6 != null) {
                mtopGenPasswordRequest.setTarget(str6);
            }
            Map<String, String> map = this.inputContent.f;
            if (map == null || map.size() <= 0) {
                mtopGenPasswordRequest.setExtendInfo(null);
            } else {
                mtopGenPasswordRequest.setExtendInfo(JSON.toJSONString(this.inputContent.f));
            }
            RemoteBusiness registeListener = ((RemoteBusiness) RemoteBusiness.build(context, mtopGenPasswordRequest, j8t.a()).useWua().reqMethod(MethodEnum.POST)).registeListener((MtopListener) this);
            this.remoteBusiness = registeListener;
            registeListener.setBizId(67);
            this.remoteBusiness.startRequest(110, MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponse.class);
        }
    }
}
