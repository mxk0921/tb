package com.taobao.passivelocation.business;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.business.report_location.MtopLbsPosServiceRequest;
import com.taobao.passivelocation.business.report_location.MtopLbsPosServiceResponse;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import tb.cyv;
import tb.h00;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PassiveLocationBusiness extends h00 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCATION_RESULT_STATUS = "failed";
    public static final int REQ_TYPE_QUERY_LBS_SWITCH = 1;
    public static final int REQ_TYPE_REPORT_LOCATION = 2;

    static {
        t2o.a(789577827);
    }

    public PassiveLocationBusiness(Application application) {
        super(application);
    }

    public static /* synthetic */ Object ipc$super(PassiveLocationBusiness passiveLocationBusiness, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/passivelocation/business/PassiveLocationBusiness");
    }

    public void reportLbsData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ecc2184", new Object[]{this, str});
            return;
        }
        MtopLbsPosServiceRequest mtopLbsPosServiceRequest = new MtopLbsPosServiceRequest();
        try {
            mtopLbsPosServiceRequest.setLoc(cyv.a(Globals.getApplication(), "lbsCollect", str));
            mtopLbsPosServiceRequest.setLocVersion("1.1");
            RemoteBusiness.build(this.mApplication, mtopLbsPosServiceRequest, TaoApplication.getTTID()).registeListener((IRemoteListener) this.mRemoteListener).showLoginUI(false).setBizId(75).startRequest(2, MtopLbsPosServiceResponse.class);
        } catch (Exception unused) {
        }
    }
}
