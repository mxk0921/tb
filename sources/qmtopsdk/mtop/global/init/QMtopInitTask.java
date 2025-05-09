package qmtopsdk.mtop.global.init;

import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.log.LogAdapter;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.deviceid.DeviceIDManager;
import mtopsdk.mtop.domain.EntranceEnum;
import mtopsdk.mtop.features.MtopFeatureManager;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.global.init.IMtopInitTask;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import tb.dmv;
import tb.fy6;
import tb.inx;
import tb.n41;
import tb.t2o;
import tb.w25;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class QMtopInitTask implements IMtopInitTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "qmtopsdk.QMtopInitTask";

    static {
        t2o.a(590348292);
        t2o.a(589299928);
    }

    @Override // mtopsdk.mtop.global.init.IMtopInitTask
    public void executeCoreTask(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fb5a3", new Object[]{this, mtopConfig});
            return;
        }
        LogAdapter logAdapter = MtopConfig.logAdapterImpl;
        if (logAdapter != null) {
            TBSdkLog.setLogAdapter(logAdapter);
        }
        String str = mtopConfig.instanceId;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, str + " [executeInitCoreTask]MtopSDK initcore start. ");
        }
        try {
            Mtop mtop = mtopConfig.mtopInstance;
            MtopFeatureManager.setMtopFeatureFlag(mtop, 1, true);
            MtopFeatureManager.setMtopFeatureFlag(mtop, 2, true);
            MtopFeatureManager.setMtopFeatureFlag(mtop, 4, true);
            MtopFeatureManager.setMtopFeatureFlag(mtop, 5, true);
            if (mtopConfig.uploadStats == null) {
                mtopConfig.uploadStats = new dmv();
            }
            inx.e(mtopConfig.context);
            inx.m(str, "ttid", mtopConfig.ttid);
            mtopConfig.entrance = EntranceEnum.GW_INNER;
            if (TextUtils.isEmpty(mtopConfig.appKey)) {
                TBSdkLog.e(TAG, str + " [executeInitCoreTask]appkey is null, please call MtopSetting.setAppKey()");
            }
            mtopConfig.processId = Process.myPid();
            mtopConfig.filterManager = new w25();
            if (mtopConfig.callFactory == null) {
                mtopConfig.callFactory = new fy6(mtopConfig.context, MtopSDKThreadPoolExecutorFactory.getRequestThreadPoolExecutor());
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
            return;
        }
        String str = mtopConfig.instanceId;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, str + " [executeInitExtraTask]MtopSDK initExtra start");
        }
        try {
            if (mtopConfig.enableNewDeviceId) {
                DeviceIDManager.getInstance().getDeviceID(mtopConfig.context, mtopConfig.appKey);
            }
            SwitchConfig.getInstance().initConfig(mtopConfig.context);
            n41.e().i(mtopConfig);
        } catch (Throwable th) {
            TBSdkLog.e(TAG, str + " [executeInitExtraTask] execute MtopSDK initExtraTask error.", th);
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, str + " [executeInitExtraTask]MtopSDK initExtra end");
        }
    }
}
