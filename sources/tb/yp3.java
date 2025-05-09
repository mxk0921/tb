package tb;

import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class yp3 implements yib, reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299830);
        t2o.a(589299813);
        t2o.a(589299812);
    }

    @Override // tb.yib
    public String a(w4j w4jVar) {
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
        boolean isNeedAuth = mtopBusiness.isNeedAuth();
        if (isNeedEcode && isNeedAuth) {
            try {
                if (mtopBusiness.getRetryTime() < 3) {
                    xj1 xj1Var = new xj1(mtopBusiness.mtopProp.openAppKey, mtopBusiness.authParam, mtopBusiness.showAuthUI);
                    if (!hxn.d(mtop, xj1Var)) {
                        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                            TBSdkLog.i("mtopsdk.CheckAuthDuplexFilter", w4jVar.h, " execute CheckAuthBeforeFilter.isAuthInfoValid = false");
                        }
                        l5o.a("AUTH").a(mtop, xj1Var.f31419a, mtopBusiness);
                        hxn.a(mtop, xj1Var);
                        return FilterManager.STOP;
                    }
                    String concatStr = StringUtils.concatStr(mtop.getInstanceId(), xj1Var.f31419a);
                    if (StringUtils.isBlank(inx.d(concatStr, "accessToken"))) {
                        String c = hxn.c(mtop, xj1Var);
                        if (StringUtils.isNotBlank(c)) {
                            inx.m(concatStr, "accessToken", c);
                        } else {
                            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                                TBSdkLog.i("mtopsdk.CheckAuthDuplexFilter", w4jVar.h, " execute CheckAuthBeforeFilter.isAuthInfoValid = true,getAuthToken is null.");
                            }
                            l5o.a("AUTH").a(mtop, xj1Var.f31419a, mtopBusiness);
                            hxn.a(mtop, xj1Var);
                            return FilterManager.STOP;
                        }
                    }
                }
            } catch (Exception e) {
                TBSdkLog.e("mtopsdk.CheckAuthDuplexFilter", w4jVar.h, " execute CheckAuthBeforeFilter error.", e);
            }
        }
        return "CONTINUE";
    }

    @Override // tb.reb
    public String c(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9fc1c03", new Object[]{this, w4jVar});
        }
        MtopBuilder mtopBuilder = w4jVar.o;
        if (!(mtopBuilder instanceof MtopBusiness)) {
            return "CONTINUE";
        }
        MtopBusiness mtopBusiness = (MtopBusiness) mtopBuilder;
        Mtop mtop = w4jVar.f30449a;
        MtopResponse mtopResponse = w4jVar.c;
        String retCode = mtopResponse.getRetCode();
        try {
            if (mtopBusiness.isNeedAuth() && mtopBusiness.getRetryTime() < 3 && SwitchConfig.authErrorCodeSet.contains(retCode)) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.CheckAuthDuplexFilter", w4jVar.h, " execute CheckAuthAfterFilter.");
                }
                xj1 xj1Var = new xj1(mtopBusiness.mtopProp.openAppKey, mtopBusiness.authParam, mtopBusiness.showAuthUI);
                xj1Var.d = mtopBusiness.request.getKey();
                if (mtopBusiness.mtopProp.isInnerOpen) {
                    xj1Var.e = retCode;
                } else {
                    xj1Var.e = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.X_ACT_HINT);
                }
                l5o.a("AUTH").a(mtop, xj1Var.f31419a, mtopBusiness);
                hxn.a(mtop, xj1Var);
                return FilterManager.STOP;
            }
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.CheckAuthDuplexFilter", w4jVar.h, " execute CheckAuthAfterFilter error.", e);
        }
        return "CONTINUE";
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.CheckAuthDuplexFilter";
    }
}
