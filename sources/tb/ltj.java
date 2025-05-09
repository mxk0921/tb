package tb;

import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ltj implements reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299819);
        t2o.a(589299812);
    }

    @Override // tb.reb
    public String c(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9fc1c03", new Object[]{this, w4jVar});
        }
        MtopResponse mtopResponse = w4jVar.c;
        if (mtopResponse.getResponseCode() < 0) {
            ApiID apiID = w4jVar.f;
            if (apiID != null && apiID.getCall() != null && (w4jVar.f.getCall() instanceof i00) && ((i00) w4jVar.f.getCall()).b(mtopResponse.getResponseCode())) {
                mtopResponse.setRetCode(ErrorConstant.ERRCODE_NO_NETWORK);
                mtopResponse.setRetMsg(ErrorConstant.ERRMSG_NO_NETWORK);
            } else if (mtopResponse.getResponseCode() == -9) {
                mtopResponse.setRetCode(ErrorConstant.ERRCODE_SYS_STREAM_BODY_TIMEOUT);
                mtopResponse.setRetMsg(ErrorConstant.ERRMSG_SYS_STREAM_BODY_TIMEOUT);
            } else {
                mtopResponse.setRetCode("ANDROID_SYS_NETWORK_ERROR");
                mtopResponse.setRetMsg("网络错误");
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                StringBuilder sb = new StringBuilder(128);
                sb.append("api=");
                sb.append(mtopResponse.getApi());
                sb.append(",v=");
                sb.append(mtopResponse.getV());
                sb.append(",retCode =");
                sb.append(mtopResponse.getRetCode());
                sb.append(",responseCode =");
                sb.append(mtopResponse.getResponseCode());
                sb.append(",responseHeader=");
                sb.append(mtopResponse.getHeaderFields());
                TBSdkLog.e("mtopsdk.NetworkErrorAfterFilter", w4jVar.h, sb.toString());
            }
            ui9.b(w4jVar);
            return FilterManager.STOP;
        }
        int responseCode = mtopResponse.getResponseCode();
        if (!SwitchConfig.getInstance().isEnableLongParamOptimize()) {
            return "CONTINUE";
        }
        if ((responseCode != 400 && responseCode != 414 && responseCode != 431 && responseCode != 500) || w4jVar.p <= 8192) {
            return "CONTINUE";
        }
        mtopResponse.setRetCode(ErrorConstant.ERRCODE_SYS_PARAM_TOO_LONG);
        mtopResponse.setRetMsg(ErrorConstant.ERRMSG_SYS_PARAM_TOO_LONG);
        ui9.b(w4jVar);
        return FilterManager.STOP;
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.NetworkErrorAfterFilter";
    }
}
