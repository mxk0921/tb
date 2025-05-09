package com.taobao.android.taopai.charge.net;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.taopai.charge.data.TpChargeBean;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.act;
import tb.nj3;
import tb.t2o;
import tb.wmb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ChargeReportBusiness implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE_ERROR_SYSTEM = "MtopSystemError";
    private final List<TpChargeBean> mChargeBeanList;
    private final wmb mListener;
    private RemoteBusiness mRemoteBusiness;

    static {
        t2o.a(782237713);
        t2o.a(589299719);
    }

    public ChargeReportBusiness(List<TpChargeBean> list, wmb wmbVar) {
        this.mChargeBeanList = list;
        this.mListener = wmbVar;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.mRemoteBusiness;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        wmb wmbVar = this.mListener;
        List<TpChargeBean> list = this.mChargeBeanList;
        if (mtopResponse != null) {
            str = mtopResponse.mappingCode;
        } else {
            str = "";
        }
        if (mtopResponse != null) {
            str2 = mtopResponse.getRetMsg();
        } else {
            str2 = "onError";
        }
        ((nj3) wmbVar).b(list, str, str2);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (baseOutDo instanceof ChargeReportResponse) {
            ((nj3) this.mListener).c(((ChargeReportResponse) baseOutDo).getData().traceId);
        } else {
            wmb wmbVar = this.mListener;
            List<TpChargeBean> list = this.mChargeBeanList;
            if (mtopResponse != null) {
                str = mtopResponse.getRetCode();
            } else {
                str = "";
            }
            if (mtopResponse != null) {
                str2 = mtopResponse.getRetMsg();
            } else {
                str2 = "data error";
            }
            ((nj3) wmbVar).b(list, str, str2);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        wmb wmbVar = this.mListener;
        List<TpChargeBean> list = this.mChargeBeanList;
        if (mtopResponse != null) {
            str = mtopResponse.getRetMsg();
        } else {
            str = "onSystemError";
        }
        ((nj3) wmbVar).b(list, CODE_ERROR_SYSTEM, str);
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        ChargeReportRequest chargeReportRequest = new ChargeReportRequest();
        chargeReportRequest.setClientVersion("1");
        chargeReportRequest.setBillList(JSON.toJSONString(this.mChargeBeanList));
        chargeReportRequest.setNEED_SESSION(true);
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) chargeReportRequest);
        this.mRemoteBusiness = build;
        build.registeListener((IRemoteListener) this);
        this.mRemoteBusiness.startRequest(ChargeReportResponse.class);
        if (!act.e()) {
            chargeReportRequest.getBillList();
        }
    }
}
