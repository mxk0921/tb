package com.alipay.mobile.common.amnet.service;

import com.alipay.mobile.common.amnet.service.util.HoldOnTask;
import com.alipay.mobile.common.amnet.service.util.PushIpcHelper;
import com.alipay.mobile.common.transport.ext.MainProcConfigListenService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.utils.config.ConfigureChangedListener;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MasterConfigureChangedListener implements ConfigureChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static MasterConfigureChangedListener f3908a;

    public static final MasterConfigureChangedListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MasterConfigureChangedListener) ipChange.ipc$dispatch("6cf9bd19", new Object[0]);
        }
        MasterConfigureChangedListener masterConfigureChangedListener = f3908a;
        if (masterConfigureChangedListener != null) {
            return masterConfigureChangedListener;
        }
        MasterConfigureChangedListener masterConfigureChangedListener2 = new MasterConfigureChangedListener();
        f3908a = masterConfigureChangedListener2;
        return masterConfigureChangedListener2;
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            return;
        }
        try {
            LogCatUtil.info("amnet_MasterConfigureChangedListener", "MasterConfigureChangedListener#update start");
            new HoldOnTask("amnet_MasterConfigureChangedListener", true).execute(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.MasterConfigureChangedListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    LogCatUtil.info("amnet_MasterConfigureChangedListener", "MasterConfigureChangedListener#update async start");
                    ((MainProcConfigListenService) PushIpcHelper.getIpcProxy(MainProcConfigListenService.class)).notifyConfigureChangedEvent();
                    LogCatUtil.info("amnet_MasterConfigureChangedListener", "MasterConfigureChangedListener#update async finish");
                }
            });
        } catch (Exception e) {
            LogCatUtil.error("amnet_MasterConfigureChangedListener", "notifyConfigureChangedEvent Exception.", e);
        }
    }
}
