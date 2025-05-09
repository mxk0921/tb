package tb;

import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.antiattack.ApiLockHelper;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKUtils;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class dq9 implements yib, reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299835);
        t2o.a(589299813);
        t2o.a(589299812);
    }

    @Override // tb.yib
    public String a(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8127648a", new Object[]{this, w4jVar});
        }
        MtopNetworkProp mtopNetworkProp = w4jVar.d;
        if (mtopNetworkProp != null && mtopNetworkProp.priorityFlag) {
            return "CONTINUE";
        }
        MtopRequest mtopRequest = w4jVar.b;
        String key = mtopRequest.getKey();
        if (MtopUtils.apiWhiteList.contains(key) || !ApiLockHelper.iSApiLocked(key, SDKUtils.getCorrectionTime())) {
            return "CONTINUE";
        }
        w4jVar.c = new MtopResponse(mtopRequest.getApiName(), mtopRequest.getVersion(), "ANDROID_SYS_API_FLOW_LIMIT_LOCKED", ErrorConstant.ERRMSG_API_FLOW_LIMIT_LOCKED);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
            String str = w4jVar.h;
            TBSdkLog.w("mtopsdk.FlowLimitDuplexFilter", str, "[doBefore] execute FlowLimitDuplexFilter apiKey=" + key);
        }
        ui9.b(w4jVar);
        return FilterManager.STOP;
    }

    @Override // tb.reb
    public String c(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9fc1c03", new Object[]{this, w4jVar});
        }
        MtopResponse mtopResponse = w4jVar.c;
        if (420 != mtopResponse.getResponseCode()) {
            return "CONTINUE";
        }
        String key = w4jVar.b.getKey();
        ApiLockHelper.lock(key, SDKUtils.getCorrectionTime(), 0L);
        ui9.c(mtopResponse);
        if (StringUtils.isBlank(mtopResponse.getRetCode())) {
            w4jVar.c.setRetCode("ANDROID_SYS_API_FLOW_LIMIT_LOCKED");
            w4jVar.c.setRetMsg(ErrorConstant.ERRMSG_API_FLOW_LIMIT_LOCKED);
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
            String str = w4jVar.h;
            TBSdkLog.w("mtopsdk.FlowLimitDuplexFilter", str, "[doAfter] execute FlowLimitDuplexFilter apiKey=" + key + " ,retCode=" + mtopResponse.getRetCode());
        }
        ui9.b(w4jVar);
        return FilterManager.STOP;
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.FlowLimitDuplexFilter";
    }
}
