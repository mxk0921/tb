package com.taobao.share.core.share.mtop;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.ut.share.business.ShareBusiness;
import java.util.HashMap;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.bwr;
import tb.fwr;
import tb.jpd;
import tb.mip;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBShareActivityInfoService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(TBShareContent tBShareContent);
    }

    static {
        t2o.a(664797276);
    }

    public void a(final a aVar, final TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d81687ea", new Object[]{this, aVar, tBShareContent});
        } else if (!mip.m(tBShareContent.businessId)) {
            aVar.a(tBShareContent);
        } else {
            bwr.h().s(true);
            ShareBusiness.sShareUTArgs.put(ShareBusiness.ACTIVITY_INFO_START_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
            try {
                GetSharePanelBizActivityInfoRequest getSharePanelBizActivityInfoRequest = new GetSharePanelBizActivityInfoRequest();
                getSharePanelBizActivityInfoRequest.setBizCode(tBShareContent.businessId);
                getSharePanelBizActivityInfoRequest.setTargetUrl(tBShareContent.url);
                getSharePanelBizActivityInfoRequest.setTitle(tBShareContent.description);
                HashMap hashMap = new HashMap();
                String j = bwr.h().j();
                if (!TextUtils.isEmpty(j)) {
                    hashMap.put("itemId", j);
                    getSharePanelBizActivityInfoRequest.setBizParams(JSON.toJSONString((Object) hashMap, true));
                }
                RemoteBusiness registeListener = ((RemoteBusiness) RemoteBusiness.build((IMTOPDataObject) getSharePanelBizActivityInfoRequest).reqMethod(MethodEnum.POST)).registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.share.core.share.mtop.TBShareActivityInfoService.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        fwr.b("TBShareActivityInfoService", mtopResponse.toString());
                        aVar.a(tBShareContent);
                        bwr.h().s(false);
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        aVar.a(tBShareContent);
                        bwr.h().s(false);
                        fwr.b("TBShareActivityInfoService", mtopResponse.toString());
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        try {
                            GetBizActivityInfoResponseData getBizActivityInfoResponseData = ((GetBizActivityInfoResponse) baseOutDo).data;
                            if (getBizActivityInfoResponseData.showActivity) {
                                TBShareContent tBShareContent2 = tBShareContent;
                                if (tBShareContent2.extraParams == null) {
                                    tBShareContent2.extraParams = new HashMap();
                                }
                                JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                                dataJsonObject.put("originBizCode", tBShareContent.businessId);
                                dataJsonObject.put(TBImageFlowMonitor.ERROR_ORIGIN_URL, tBShareContent.url);
                                dataJsonObject.put("originTitle", tBShareContent.description);
                                tBShareContent._shareBizActivityInfo = dataJsonObject.toString();
                                if (getBizActivityInfoResponseData.isChangeParams) {
                                    if (!TextUtils.isEmpty(tBShareContent.businessId)) {
                                        TBShareContent tBShareContent3 = tBShareContent;
                                        tBShareContent3.originBizCode = tBShareContent3.businessId;
                                    }
                                    if (!TextUtils.isEmpty(getBizActivityInfoResponseData.bizcode)) {
                                        tBShareContent.businessId = getBizActivityInfoResponseData.bizcode;
                                    }
                                    if (!TextUtils.isEmpty(getBizActivityInfoResponseData.targetUrl)) {
                                        tBShareContent.url = getBizActivityInfoResponseData.targetUrl;
                                    }
                                    if (!TextUtils.isEmpty(getBizActivityInfoResponseData.title)) {
                                        tBShareContent.description = getBizActivityInfoResponseData.title;
                                    }
                                }
                            }
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                });
                registeListener.setBizId(67);
                registeListener.startRequest(GetBizActivityInfoResponse.class);
                fwr.b(jpd.TAG, "doGetSharePanelBizActivityInfoRequest");
            } catch (Throwable th) {
                th.printStackTrace();
                fwr.b("TBShareActivityInfoService", th.toString());
                aVar.a(tBShareContent);
                bwr.h().s(false);
            }
        }
    }
}
