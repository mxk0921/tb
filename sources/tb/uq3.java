package tb;

import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class uq3 implements yib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299822);
        t2o.a(589299813);
    }

    @Override // tb.yib
    public String a(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8127648a", new Object[]{this, w4jVar});
        }
        if (e(w4jVar)) {
            return "CONTINUE";
        }
        return FilterManager.STOP;
    }

    public final boolean e(w4j w4jVar) {
        String str;
        MtopResponse mtopResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbd02ff6", new Object[]{this, w4jVar})).booleanValue();
        }
        MtopRequest mtopRequest = w4jVar.b;
        MtopNetworkProp mtopNetworkProp = w4jVar.d;
        String str2 = w4jVar.h;
        if (mtopRequest == null) {
            str = "mtopRequest is invalid.mtopRequest=null";
            mtopResponse = new MtopResponse(ErrorConstant.ERRCODE_MTOPCONTEXT_INIT_ERROR, str);
        } else if (!mtopRequest.isLegalRequest()) {
            str = "mtopRequest is invalid. " + mtopRequest.toString();
            mtopResponse = new MtopResponse(mtopRequest.getApiName(), mtopRequest.getVersion(), ErrorConstant.ERRCODE_MTOPCONTEXT_INIT_ERROR, str);
        } else if (mtopNetworkProp == null) {
            mtopResponse = new MtopResponse(mtopRequest.getApiName(), mtopRequest.getVersion(), ErrorConstant.ERRCODE_MTOPCONTEXT_INIT_ERROR, "MtopNetworkProp is invalid.property=null");
            str = "MtopNetworkProp is invalid.property=null";
        } else {
            mtopResponse = null;
            str = null;
        }
        w4jVar.c = mtopResponse;
        if (StringUtils.isNotBlank(str) && TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
            TBSdkLog.e("mtopsdk.CheckRequestParamBeforeFilter", str2, "[checkRequiredParam]" + str);
        }
        if (mtopRequest != null && TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.CheckRequestParamBeforeFilter", str2, "[checkRequiredParam]" + mtopRequest.toString());
        }
        ui9.b(w4jVar);
        if (!SwitchConfig.getInstance().isGlobalSpdySslSwitchOpen()) {
            TBSdkLog.w("mtopsdk.CheckRequestParamBeforeFilter", str2, "[checkRequiredParam]MTOP SSL switch is false");
            w4jVar.d.protocol = ProtocolEnum.HTTP;
        }
        if (mtopResponse == null) {
            return true;
        }
        return false;
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.CheckRequestParamBeforeFilter";
    }
}
