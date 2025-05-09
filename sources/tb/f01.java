package tb;

import android.content.Context;
import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IInteractingListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.antiattack.AntiAttackHandler;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class f01 implements reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299815);
        t2o.a(589299812);
    }

    @Override // tb.reb
    public String c(w4j w4jVar) {
        Context context;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9fc1c03", new Object[]{this, w4jVar});
        }
        MtopResponse mtopResponse = w4jVar.c;
        if (419 != mtopResponse.getResponseCode()) {
            return "CONTINUE";
        }
        Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, HttpHeaderConstant.BX_ACTION);
        MtopBuilder mtopBuilder = w4jVar.o;
        Mtop mtop = w4jVar.f30449a;
        String str = mtopBuilder.mtopProp.userInfo;
        if (!"login".equals(singleHeaderFieldByKey) || !((z = mtopBuilder instanceof MtopBusiness))) {
            String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, "location");
            String singleHeaderFieldByKey3 = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, HttpHeaderConstant.X_LOCATION_EXT);
            AntiAttackHandler antiAttackHandler = w4jVar.f30449a.getMtopConfig().antiAttackHandler;
            if (w4jVar.f30449a.getMtopConfig() != null) {
                context = w4jVar.f30449a.getMtopConfig().context;
            } else {
                context = MtopUtils.getContext();
            }
            if (antiAttackHandler == null || !StringUtils.isNotBlank(singleHeaderFieldByKey2) || MtopUtils.isCurrentProcessBackground(context)) {
                TBSdkLog.e("mtopsdk.AntiAttackAfterFilter", w4jVar.h, "didn't register AntiAttackHandler.");
            } else {
                antiAttackHandler.handle(singleHeaderFieldByKey2, singleHeaderFieldByKey3);
                if (mtopBuilder instanceof MtopBusiness) {
                    l5o.a("ANTI").a(mtop, "", (MtopBusiness) mtopBuilder);
                    return FilterManager.STOP;
                }
            }
            mtopResponse.setRetCode(ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK);
            mtopResponse.setRetMsg(ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                String str2 = w4jVar.h;
                TBSdkLog.w("mtopsdk.AntiAttackAfterFilter", str2, "[doAfter] execute AntiAttackAfterFilter apiKey=" + w4jVar.b.getKey());
            }
            ui9.b(w4jVar);
            return FilterManager.STOP;
        }
        MtopBusiness mtopBusiness = (MtopBusiness) mtopBuilder;
        l5o.a("SESSION").a(mtop, str, mtopBusiness);
        if (z) {
            MtopListener mtopListener = mtopBusiness.listener;
            if (mtopListener instanceof IInteractingListener) {
                ((IInteractingListener) mtopListener).onInteract("login");
            }
        }
        nyn.e(mtop, str, true, mtopBuilder);
        return FilterManager.STOP;
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.AntiAttackAfterFilter";
    }
}
