package com.alipay.mobile.common.amnet.service;

import com.alipay.mobile.common.amnet.api.AcceptDataListener;
import com.alipay.mobile.common.amnet.api.model.AcceptedData;
import com.alipay.mobile.common.amnet.api.model.ChannelType;
import com.alipay.mobile.common.amnet.biz.AmnetSwitchManagerImpl;
import com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcDataListenService;
import com.alipay.mobile.common.amnet.service.util.PushIpcHelper;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MasterProxyDataListener implements AcceptDataListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static MasterProxyDataListener b;

    /* renamed from: a  reason: collision with root package name */
    public MainProcDataListenService f3909a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AyncDataEventTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private AcceptedData f3910a;

        public AyncDataEventTask(AcceptedData acceptedData) {
            this.f3910a = acceptedData;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LogCatUtil.info("amnet_MasterProxyDataListener", "start AyncDataEventTask#run");
            if (PushIpcHelper.hasRegister()) {
                LogCatUtil.info("amnet_MasterProxyDataListener", "AyncDataEventTask onAcceptedDataEvent!");
                MasterProxyDataListener.this.getMainProcDataListenService().onAcceptedDataEvent(this.f3910a);
            } else if (!AmnetSwitchManagerImpl.getInstance().isCanStartMainProcDispatch()) {
                LogCatUtil.info("amnet_MasterProxyDataListener", "AyncDataEventTask  CanStartMainProcDispatch is false.");
            } else if (PushIpcHelper.waitBinded()) {
                LogCatUtil.info("amnet_MasterProxyDataListener", "AyncDataEventTask hard onAcceptedDataEvent!");
                MasterProxyDataListener.this.getMainProcDataListenService().onAcceptedDataEvent(this.f3910a);
            } else {
                MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
                monitorLoggerModel.setBizType("MMTP");
                monitorLoggerModel.setSubType("PROCESS");
                monitorLoggerModel.setParam3("dead_main_process");
                MonitorInfoUtil.record(monitorLoggerModel);
            }
        }
    }

    public static final MasterProxyDataListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MasterProxyDataListener) ipChange.ipc$dispatch("35e1ad4f", new Object[0]);
        }
        MasterProxyDataListener masterProxyDataListener = b;
        if (masterProxyDataListener != null) {
            return masterProxyDataListener;
        }
        synchronized (MasterProxyDataListener.class) {
            try {
                MasterProxyDataListener masterProxyDataListener2 = b;
                if (masterProxyDataListener2 != null) {
                    return masterProxyDataListener2;
                }
                MasterProxyDataListener masterProxyDataListener3 = new MasterProxyDataListener();
                b = masterProxyDataListener3;
                return masterProxyDataListener3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public MainProcDataListenService getMainProcDataListenService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainProcDataListenService) ipChange.ipc$dispatch("e5903a25", new Object[]{this});
        }
        if (this.f3909a == null) {
            this.f3909a = (MainProcDataListenService) PushIpcHelper.getIpcProxy(MainProcDataListenService.class);
        }
        return this.f3909a;
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataListener
    public void onAcceptedDataEvent(AcceptedData acceptedData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4098", new Object[]{this, acceptedData});
            return;
        }
        LogCatUtil.info("amnet_MasterProxyDataListener", "start onAcceptedDataEvent");
        if (PushIpcHelper.hasRegister()) {
            LogCatUtil.info("amnet_MasterProxyDataListener", "notifyAcceptedDataEvent to main proc!");
            acceptedData.ipcP2m = System.currentTimeMillis();
            getMainProcDataListenService().onAcceptedDataEvent(acceptedData);
        } else if (!AmnetSwitchManagerImpl.getInstance().isCanStartMainProcDispatch()) {
            LogCatUtil.info("amnet_MasterProxyDataListener", "[onAcceptedDataEvent]  CanStartMainProcDispatch is false.");
        } else if (ChannelType.isSync(acceptedData.channel)) {
            try {
                PushIpcHelper.startServiceOfMainProc();
                LogCatUtil.info("amnet_MasterProxyDataListener", "Start power main proc!");
                NetworkAsyncTaskExecutor.execute(new AyncDataEventTask(acceptedData));
            } catch (Exception e) {
                LogCatUtil.printError("amnet_MasterProxyDataListener", e);
            }
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataListener
    public void recycle(byte b2, Map<String, String> map, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67573cea", new Object[]{this, new Byte(b2), map, bArr});
        } else if (PushIpcHelper.hasRegister()) {
            getMainProcDataListenService().recycle(b2, map, bArr);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataListener
    public void tell(byte b2, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d83fa0", new Object[]{this, new Byte(b2), new Long(j), new Integer(i), new Integer(i2)});
        } else if (PushIpcHelper.hasRegister()) {
            getMainProcDataListenService().tell(b2, j, i, i2);
        }
    }
}
