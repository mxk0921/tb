package tb;

import android.os.Bundle;
import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IInteractingListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class xq3 implements yib, reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299831);
        t2o.a(589299813);
        t2o.a(589299812);
    }

    @Override // tb.yib
    public String a(w4j w4jVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8127648a", new Object[]{this, w4jVar});
        }
        MtopBuilder mtopBuilder = w4jVar.o;
        if (!(mtopBuilder instanceof MtopBusiness)) {
            return "CONTINUE";
        }
        MtopBusiness mtopBusiness = (MtopBusiness) mtopBuilder;
        MtopRequest mtopRequest = w4jVar.b;
        Mtop mtop = w4jVar.f30449a;
        boolean isNeedEcode = mtopRequest.isNeedEcode();
        try {
            str = mtopBusiness.mtopProp.userInfo;
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.CheckSessionDuplexFilter", w4jVar.h, " execute CheckSessionBeforeFilter error.", e);
        }
        if (!isNeedEcode || nyn.d(mtop, str)) {
            if (isNeedEcode && StringUtils.isBlank(mtop.getMultiAccountSid(str))) {
                sih c = nyn.c(mtop, str);
                if (c == null || StringUtils.isBlank(c.f28073a)) {
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                        TBSdkLog.e("mtopsdk.CheckSessionDuplexFilter", w4jVar.h, "execute CheckSessionBeforeFilter.isSessionInvalid = true,getLoginContext = null");
                    }
                    l5o.a("SESSION").a(mtop, str, mtopBusiness);
                    if (mtopBusiness.isShowLoginUI()) {
                        MtopListener mtopListener = mtopBusiness.listener;
                        if (mtopListener instanceof IInteractingListener) {
                            ((IInteractingListener) mtopListener).onInteract("login");
                        }
                    }
                    nyn.e(mtop, str, mtopBusiness.isShowLoginUI(), mtopRequest);
                    return FilterManager.STOP;
                }
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("mtopsdk.CheckSessionDuplexFilter", w4jVar.h, "session in loginContext is valid but mtopInstance's sid is null");
                }
                mtop.registerMultiAccountSession(str, c.f28073a, c.b);
            }
            return "CONTINUE";
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
            TBSdkLog.e("mtopsdk.CheckSessionDuplexFilter", w4jVar.h, "execute CheckSessionBeforeFilter.isSessionInvalid = false");
        }
        l5o.a("SESSION").a(mtop, str, mtopBusiness);
        if (mtopBusiness.isShowLoginUI()) {
            MtopListener mtopListener2 = mtopBusiness.listener;
            if (mtopListener2 instanceof IInteractingListener) {
                ((IInteractingListener) mtopListener2).onInteract("login");
            }
        }
        nyn.e(mtop, str, mtopBusiness.isShowLoginUI(), mtopRequest);
        return FilterManager.STOP;
    }

    @Override // tb.reb
    public String c(w4j w4jVar) {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9fc1c03", new Object[]{this, w4jVar});
        }
        MtopBuilder mtopBuilder = w4jVar.o;
        if (!(mtopBuilder instanceof MtopBusiness)) {
            return "CONTINUE";
        }
        MtopBusiness mtopBusiness = (MtopBusiness) mtopBuilder;
        MtopRequest mtopRequest = w4jVar.b;
        Mtop mtop = w4jVar.f30449a;
        MtopResponse mtopResponse = w4jVar.c;
        if (mtop.getMtopConfig().notifySessionResult) {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.X_SESSION_RET);
            if (StringUtils.isNotBlank(singleHeaderFieldByKey)) {
                Bundle bundle = new Bundle();
                bundle.putString(HttpHeaderConstant.X_SESSION_RET, singleHeaderFieldByKey);
                bundle.putString("Date", HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), "Date"));
                nyn.g(mtop, bundle);
            }
        }
        if (mtopResponse.isSessionInvalid() || (SwitchConfig.getInstance().isUnitProtectEnable() && mtopResponse.isUnitProtect())) {
            z = true;
        } else {
            z = false;
        }
        if (!SwitchConfig.getInstance().removePreLimitOfLogin()) {
            if (z && mtopRequest.isNeedEcode()) {
                z2 = true;
            }
            z = z2;
        }
        if (!z || mtopBusiness.getRetryTime() != 0) {
            return "CONTINUE";
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
            TBSdkLog.e("mtopsdk.CheckSessionDuplexFilter", w4jVar.h, "execute CheckSessionAfterFilter.");
        }
        String str = mtopBusiness.mtopProp.userInfo;
        l5o.a("SESSION").a(mtop, str, mtopBusiness);
        if (mtopBusiness.isShowLoginUI()) {
            MtopListener mtopListener = mtopBusiness.listener;
            if (mtopListener instanceof IInteractingListener) {
                ((IInteractingListener) mtopListener).onInteract("login");
            }
        }
        nyn.e(mtop, str, mtopBusiness.isShowLoginUI(), mtopResponse);
        MtopStatistics mtopStatistics = w4jVar.g;
        if (mtopStatistics == null) {
            return FilterManager.STOP;
        }
        mtopStatistics.isLoginRedo = true;
        return FilterManager.STOP;
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.CheckSessionDuplexFilter";
    }
}
