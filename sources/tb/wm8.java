package tb;

import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.network.NetworkCallbackAdapter;
import mtopsdk.mtop.network.StreamNetworkCallbackAdapter;
import mtopsdk.mtop.stat.IMtopMonitor;
import mtopsdk.mtop.stat.MtopMonitor;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.MtopStatistics;
import tb.zu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class wm8 implements yib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299823);
        t2o.a(589299813);
    }

    @Override // tb.yib
    public String a(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8127648a", new Object[]{this, w4jVar});
        }
        try {
            if (MtopMonitor.getInstance() != null) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put(IMtopMonitor.DATA_REQUEST, w4jVar.b.getRequestLog());
                hashMap.put(IMtopMonitor.DATA_SEQ, w4jVar.h);
                MtopMonitor.getInstance().onCommit(IMtopMonitor.MtopMonitorType.TYPE_REQUEST, hashMap);
            }
            MtopStatistics mtopStatistics = w4jVar.g;
            mtopStatistics.netSendStartTime = mtopStatistics.currentTimeMillis();
            zu2.a aVar = w4jVar.f30449a.getMtopConfig().callFactory;
            if (aVar == null) {
                String str = w4jVar.h;
                TBSdkLog.e("mtopsdk.ExecuteCallBeforeFilter", str, "call Factory of mtopInstance is null.instanceId=" + w4jVar.f30449a.getInstanceId());
                MtopResponse mtopResponse = new MtopResponse(ErrorConstant.ERRCODE_MTOP_MISS_CALL_FACTORY, ErrorConstant.ERRMSG_MTOP_MISS_CALL_FACTORY);
                mtopResponse.setApi(w4jVar.b.getApiName());
                mtopResponse.setV(w4jVar.b.getVersion());
                w4jVar.c = mtopResponse;
                ui9.b(w4jVar);
                return FilterManager.STOP;
            }
            zu2 a2 = aVar.a(w4jVar.k);
            h3o h3oVar = w4jVar.k;
            if (h3oVar == null || !h3oVar.y) {
                a2.a(new NetworkCallbackAdapter(w4jVar));
            } else {
                a2.a(new StreamNetworkCallbackAdapter(w4jVar));
            }
            ApiID apiID = w4jVar.f;
            if (apiID == null) {
                return "CONTINUE";
            }
            apiID.setCall(a2);
            return "CONTINUE";
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.ExecuteCallBeforeFilter", w4jVar.h, "invoke call.enqueue of mtopInstance error,apiKey=" + w4jVar.b.getKey(), e);
            return FilterManager.STOP;
        }
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.ExecuteCallBeforeFilter";
    }
}
