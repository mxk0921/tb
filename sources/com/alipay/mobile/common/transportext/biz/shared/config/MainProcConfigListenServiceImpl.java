package com.alipay.mobile.common.transportext.biz.shared.config;

import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.ext.MainProcConfigListenService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MainProcConfigListenServiceImpl implements MainProcConfigListenService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static MainProcConfigListenServiceImpl f4213a;

    public static final MainProcConfigListenService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainProcConfigListenService) ipChange.ipc$dispatch("cf9b81b8", new Object[0]);
        }
        MainProcConfigListenServiceImpl mainProcConfigListenServiceImpl = f4213a;
        if (mainProcConfigListenServiceImpl != null) {
            return mainProcConfigListenServiceImpl;
        }
        synchronized (MainProcConfigListenServiceImpl.class) {
            try {
                MainProcConfigListenServiceImpl mainProcConfigListenServiceImpl2 = f4213a;
                if (mainProcConfigListenServiceImpl2 != null) {
                    return mainProcConfigListenServiceImpl2;
                }
                MainProcConfigListenServiceImpl mainProcConfigListenServiceImpl3 = new MainProcConfigListenServiceImpl();
                f4213a = mainProcConfigListenServiceImpl3;
                return mainProcConfigListenServiceImpl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.MainProcConfigListenService
    public void notifyConfigureChangedEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c0198a", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.shared.config.MainProcConfigListenServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    LogCatUtil.info("MainProcConfigListenService", "Accepted push condfigure changed");
                    TransportConfigureManager.getInstance().updateConfig(ExtTransportEnv.getAppContext());
                    SwitchMonitorLogUtil.monitorSwitchUpdatedLog(ExtTransportEnv.getAppContext(), NwSharedSwitchUtil.getSwitchSrc());
                }
            });
        }
    }
}
