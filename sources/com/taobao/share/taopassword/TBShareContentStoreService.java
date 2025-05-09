package com.taobao.share.taopassword;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bwr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBShareContentStoreService implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SAVE_TAOPASSWORD = 111;
    private String mChannelType;
    private RemoteBusiness remoteBusiness;

    static {
        t2o.a(665845842);
        t2o.a(665845843);
        t2o.a(589299719);
    }

    public TBShareContentStoreService(String str) {
        this.mChannelType = str;
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

    private String getMonitorArg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fc297a7", new Object[]{this});
        }
        TBShareContent e = bwr.h().e();
        if (e == null) {
            return "";
        }
        return e.businessId + "," + e.url;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.remoteBusiness;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        String errorCode = getErrorCode(mtopResponse);
        new StringBuilder("onError errorCode=").append(errorCode);
        AppMonitor.Alarm.commitFail("share", "storesharecontent", errorCode, Localization.q(R.string.taobao_app_1010_1_18130), getMonitorArg());
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            AppMonitor.Alarm.commitSuccess("share", "storesharecontent", getMonitorArg());
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        String errorCode = getErrorCode(mtopResponse);
        new StringBuilder("onSystemError errorCode=").append(errorCode);
        AppMonitor.Alarm.commitFail("share", "storesharecontent", errorCode, Localization.q(R.string.taobao_app_1010_1_18130), getMonitorArg());
    }

    public void request() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447a9796", new Object[]{this});
            return;
        }
        TBShareContent e = bwr.h().e();
        if (e != null && !TextUtils.isEmpty(e.url) && !TextUtils.isEmpty(e.businessId) && !TextUtils.isEmpty(e.description)) {
            MtopTaobaoSharepasswordStoresharecontentRequest mtopTaobaoSharepasswordStoresharecontentRequest = new MtopTaobaoSharepasswordStoresharecontentRequest();
            mtopTaobaoSharepasswordStoresharecontentRequest.setBizId(e.businessId);
            mtopTaobaoSharepasswordStoresharecontentRequest.setShareRequestId(e.shareId);
            mtopTaobaoSharepasswordStoresharecontentRequest.setShareChannelType(this.mChannelType);
            mtopTaobaoSharepasswordStoresharecontentRequest.setShareType(e.shareScene);
            mtopTaobaoSharepasswordStoresharecontentRequest.setShareDesc(e.description);
            mtopTaobaoSharepasswordStoresharecontentRequest.setSharePicUrl(e.imageUrl);
            mtopTaobaoSharepasswordStoresharecontentRequest.setShareUrl(e.url);
            mtopTaobaoSharepasswordStoresharecontentRequest.setMsgType("1");
            mtopTaobaoSharepasswordStoresharecontentRequest.setShareUniqueId(e.suId);
            HashMap hashMap = new HashMap();
            Map<String, String> map = e.extraParams;
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(e.extraParams);
            }
            Map<String, String> map2 = e.activityParams;
            if (map2 != null && !map2.isEmpty()) {
                String remove = e.activityParams.remove("contacts_sendName");
                if (!TextUtils.isEmpty(remove)) {
                    mtopTaobaoSharepasswordStoresharecontentRequest.setShareSendName(remove);
                }
                String remove2 = e.activityParams.remove("contacts_remark");
                if (!TextUtils.isEmpty(remove2)) {
                    mtopTaobaoSharepasswordStoresharecontentRequest.setShareRemark(remove2);
                }
                hashMap.putAll(e.activityParams);
            }
            if (!TextUtils.isEmpty(e.title)) {
                hashMap.put("title", e.title);
            }
            if (hashMap.size() > 0) {
                mtopTaobaoSharepasswordStoresharecontentRequest.setExtendInfo(JSON.toJSONString((Object) hashMap, true));
            } else {
                mtopTaobaoSharepasswordStoresharecontentRequest.setExtendInfo(null);
            }
            RemoteBusiness registeListener = RemoteBusiness.build((IMTOPDataObject) mtopTaobaoSharepasswordStoresharecontentRequest).registeListener((MtopListener) this);
            this.remoteBusiness = registeListener;
            registeListener.setBizId(67);
            this.remoteBusiness.startRequest(111, BaseOutDo.class);
        }
    }
}
