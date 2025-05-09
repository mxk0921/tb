package mtopsdk.ssrcore;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.log.LogAdapter;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.init.IMtopInitTask;
import mtopsdk.mtop.network.NetworkPropertyServiceImpl;
import mtopsdk.mtop.stat.UploadStatAppMonitorImpl;
import tb.inx;
import tb.kfq;
import tb.kqd;
import tb.n4s;
import tb.n9f;
import tb.sfq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SsrMtopInitTask implements IMtopInitTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ssr.SsrMtopInitTask";

    @Override // mtopsdk.mtop.global.init.IMtopInitTask
    public void executeCoreTask(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fb5a3", new Object[]{this, mtopConfig});
            return;
        }
        LogAdapter logAdapter = MtopConfig.logAdapterImpl;
        if (logAdapter == null) {
            logAdapter = new n4s();
        }
        TBSdkLog.setLogAdapter(logAdapter);
        String str = mtopConfig.instanceId;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, str + " [executeSsrCoreTask]MtopSDK initcore start. ");
        }
        try {
            if (mtopConfig.uploadStats == null) {
                mtopConfig.uploadStats = new UploadStatAppMonitorImpl();
            }
            mtopConfig.networkPropertyService = new NetworkPropertyServiceImpl();
            inx.e(mtopConfig.context);
            inx.m(str, "ttid", mtopConfig.ttid);
            mtopConfig.networkPropertyService.setTtid(mtopConfig.ttid);
            Object obj = mtopConfig.sign;
            if (obj == null) {
                obj = new n9f();
            }
            n9f n9fVar = (n9f) obj;
            n9fVar.d(mtopConfig);
            mtopConfig.sign = n9fVar;
            if (StringUtils.isEmpty(mtopConfig.appKey)) {
                mtopConfig.appKey = n9fVar.i(new kqd.a(mtopConfig.appKeyIndex, mtopConfig.authCode));
            }
            mtopConfig.mFilterManager = new kfq();
            if (mtopConfig.callFactory == null) {
                mtopConfig.callFactory = new sfq(mtopConfig.context);
            }
        } catch (Throwable th) {
            TBSdkLog.e(TAG, str + " [executeInitCoreTask]MtopSDK initCore error", th);
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, str + " [executeInitCoreTask]MtopSDK initCore end");
        }
    }

    @Override // mtopsdk.mtop.global.init.IMtopInitTask
    public void executeExtraTask(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4401378a", new Object[]{this, mtopConfig});
        }
    }
}
