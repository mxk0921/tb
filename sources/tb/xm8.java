package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.stat.IMtopMonitor;
import mtopsdk.mtop.stat.MtopMonitor;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class xm8 implements reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299818);
        t2o.a(589299812);
    }

    @Override // tb.reb
    public String c(w4j w4jVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9fc1c03", new Object[]{this, w4jVar});
        }
        MtopStatistics mtopStatistics = w4jVar.g;
        MtopResponse mtopResponse = w4jVar.c;
        FullTraceHelper.recordRspCbDispatch(mtopStatistics);
        String str = w4jVar.h;
        MtopFinishEvent mtopFinishEvent = new MtopFinishEvent(mtopResponse);
        mtopFinishEvent.seqNo = str;
        mtopStatistics.serverTraceId = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.SERVER_TRACE_ID);
        mtopStatistics.eagleEyeTraceId = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), "eagleeye-traceid");
        mtopStatistics.parseServerStat(mtopResponse.getHeaderFields());
        mtopStatistics.retCode = mtopResponse.getRetCode();
        mtopStatistics.statusCode = mtopResponse.getResponseCode();
        mtopStatistics.mappingCode = mtopResponse.getMappingCode();
        MtopListener mtopListener = w4jVar.e;
        try {
            if (w4jVar.o instanceof MtopBusiness) {
                Handler handler = w4jVar.d.handler;
                if (handler != null) {
                    mtopStatistics.isMain = handler.getLooper().equals(Looper.getMainLooper());
                }
                z = false;
            } else {
                mtopStatistics.isMain = false;
            }
            mtopStatistics.onEndAndCommit();
            if (z) {
                FullTraceHelper.recordRspCbStart(mtopStatistics);
            }
            if (mtopListener instanceof MtopCallback.MtopFinishListener) {
                ((MtopCallback.MtopFinishListener) mtopListener).onFinished(mtopFinishEvent, w4jVar.d.reqContext);
            } else if (mtopListener instanceof MtopCallback.MtopStreamListener) {
                ((MtopCallback.MtopStreamListener) mtopListener).onFinish(mtopFinishEvent, w4jVar.d.reqContext);
            }
            if (MtopMonitor.getInstance() != null) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put(IMtopMonitor.DATA_RESPONSE, w4jVar.c.getResponseLog());
                hashMap.put(IMtopMonitor.DATA_SEQ, w4jVar.h);
                MtopMonitor.getInstance().onCommit(IMtopMonitor.MtopMonitorType.TYPE_RESPONSE, hashMap);
            }
            if (MtopMonitor.getHeaderMonitor() != null) {
                String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(w4jVar.c.getHeaderFields(), HttpHeaderConstant.X_AB);
                if (!TextUtils.isEmpty(singleHeaderFieldByKey)) {
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    hashMap2.put(HttpHeaderConstant.X_AB, singleHeaderFieldByKey);
                    hashMap2.put(IMtopMonitor.DATA_SEQ, w4jVar.h);
                    MtopMonitor.getHeaderMonitor().onCommit(IMtopMonitor.MtopMonitorType.TYPE_RESPONSE, hashMap2);
                }
            }
            if (SwitchConfig.getInstance().getEnableResponseHeader() && MtopMonitor.getResponseHeaderMonitors() != null) {
                for (Map.Entry<String, IMtopMonitor> entry : MtopMonitor.getResponseHeaderMonitors().entrySet()) {
                    String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(w4jVar.c.getHeaderFields(), entry.getKey());
                    if (StringUtils.isNotBlank(singleHeaderFieldByKey2)) {
                        HashMap<String, String> hashMap3 = new HashMap<>();
                        hashMap3.put(entry.getKey(), singleHeaderFieldByKey2);
                        hashMap3.put(IMtopMonitor.DATA_SEQ, w4jVar.h);
                        entry.getValue().onCommit(IMtopMonitor.MtopMonitorType.TYPE_RESPONSE, hashMap3);
                    }
                }
            }
            if (!z) {
                return "CONTINUE";
            }
            FullTraceHelper.recordRspCbEnd(mtopStatistics);
            mtopStatistics.commitFullTrace();
            return "CONTINUE";
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.ExecuteCallbackAfterFilter", str, "call MtopFinishListener error,apiKey=" + w4jVar.b.getKey(), th);
            return "CONTINUE";
        }
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.ExecuteCallbackAfterFilter";
    }
}
