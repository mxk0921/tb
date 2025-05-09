package mtopsdk.mtop.global.init;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.log.LogAdapter;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.instanceconfigs.a;
import mtopsdk.mtop.antiattack.AntiAttackHandlerImpl;
import mtopsdk.mtop.deviceid.DeviceIDManager;
import mtopsdk.mtop.domain.EntranceEnum;
import mtopsdk.mtop.features.MtopFeatureManager;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.network.NetworkPropertyServiceImpl;
import mtopsdk.mtop.stat.UploadStatAppMonitorImpl;
import tb.biv;
import tb.i9f;
import tb.inx;
import tb.kqd;
import tb.n41;
import tb.n4s;
import tb.n9f;
import tb.nrf;
import tb.t2o;
import tb.vb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InnerMtopInitTask implements IExtendMtopInitTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.InnerMtopInitTask";

    static {
        t2o.a(589299929);
        t2o.a(589299927);
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
            nrf.d();
            if (mtopConfig.enableNewDeviceId) {
                DeviceIDManager.getInstance().getDeviceID(mtopConfig.context, mtopConfig.appKey);
            }
            SwitchConfig.getInstance().initConfig(mtopConfig.context);
            n41.e().i(mtopConfig);
            biv.a().c(mtopConfig.context);
            if (SwitchConfig.getInstance().dynamicInjectMtopInstance() && SwitchConfig.getInstance().fetchRemoteMtopInstance() && StringUtils.isStringEqual(mtopConfig.mtopInstance.getInstanceId(), Mtop.Id.INNER)) {
                a.c().g(mtopConfig.context, mtopConfig.appKey);
            }
        } catch (Throwable th) {
            TBSdkLog.e(TAG, str + " [executeInitExtraTask] execute MtopSDK initExtraTask error.", th);
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, str + " [executeInitExtraTask]MtopSDK initExtra end");
        }
    }

    @Override // mtopsdk.mtop.global.init.IExtendMtopInitTask
    public void executeSignTask(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d05edc1", new Object[]{this, mtopConfig});
            return;
        }
        Object obj = mtopConfig.sign;
        if (obj == null) {
            obj = new n9f();
        }
        n9f n9fVar = (n9f) obj;
        n9fVar.d(mtopConfig);
        mtopConfig.entrance = EntranceEnum.GW_INNER;
        mtopConfig.sign = n9fVar;
        if (StringUtils.isEmpty(mtopConfig.appKey)) {
            mtopConfig.appKey = n9fVar.i(new kqd.a(mtopConfig.appKeyIndex, mtopConfig.authCode));
        }
    }

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
            TBSdkLog.i(TAG, str + " [executeInitCoreTask]MtopSDK initcore start. ");
        }
        try {
            Mtop mtop = mtopConfig.mtopInstance;
            MtopFeatureManager.setMtopFeatureFlag(mtop, 1, true);
            MtopFeatureManager.setMtopFeatureFlag(mtop, 2, true);
            MtopFeatureManager.setMtopFeatureFlag(mtop, 4, true);
            MtopFeatureManager.setMtopFeatureFlag(mtop, 5, true);
            if (mtopConfig.uploadStats == null) {
                mtopConfig.uploadStats = new UploadStatAppMonitorImpl();
            }
            mtopConfig.networkPropertyService = new NetworkPropertyServiceImpl();
            RemoteConfig.getInstance().loadLocalConfig(mtopConfig.context);
            inx.e(mtopConfig.context);
            inx.m(str, "ttid", mtopConfig.ttid);
            mtopConfig.networkPropertyService.setTtid(mtopConfig.ttid);
            mtopConfig.processId = Process.myPid();
            mtopConfig.filterManager = new i9f();
            if (mtopConfig.antiAttackHandler == null) {
                mtopConfig.antiAttackHandler = new AntiAttackHandlerImpl(mtopConfig.context);
            }
            if (mtopConfig.callFactory == null) {
                mtopConfig.callFactory = new vb(mtopConfig.context);
            }
        } catch (Throwable th) {
            TBSdkLog.e(TAG, str + " [executeInitCoreTask]MtopSDK initCore error", th);
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, str + " [executeInitCoreTask]MtopSDK initCore end");
        }
    }
}
