package tb;

import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class htt implements reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299821);
        t2o.a(589299812);
    }

    @Override // tb.reb
    public String c(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9fc1c03", new Object[]{this, w4jVar});
        }
        MtopResponse mtopResponse = w4jVar.c;
        MtopNetworkProp mtopNetworkProp = w4jVar.d;
        if (!mtopResponse.isExpiredRequest() || mtopNetworkProp.timeCalibrated) {
            return "CONTINUE";
        }
        mtopNetworkProp.timeCalibrated = true;
        mtopNetworkProp.skipCacheCallback = true;
        try {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.X_SYSTIME);
            if (!StringUtils.isNotBlank(singleHeaderFieldByKey)) {
                return "CONTINUE";
            }
            inx.l("t_offset", String.valueOf(Long.parseLong(singleHeaderFieldByKey) - (System.currentTimeMillis() / 1000)));
            hi9 hi9Var = w4jVar.f30449a.getMtopConfig().filterManager;
            if (hi9Var == null) {
                return "CONTINUE";
            }
            ((f10) hi9Var).d(new r1n(null).getName(), w4jVar);
            return FilterManager.STOP;
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.TimeCalibrationAfterFilter", w4jVar.h, "parse x-systime from mtop response header error", e);
            return "CONTINUE";
        }
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.TimeCalibrationAfterFilter";
    }
}
