package com.alipay.mobile.common.amnet.service;

import com.alipay.mobile.common.amnet.service.util.AmnetManagerFactory;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelChangedListener;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.strategy.TunnelChangeEventModel;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PushProcAmnetSelfTunnelChangedListener implements NetworkTunnelChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static PushProcAmnetSelfTunnelChangedListener f3914a;

    public static final PushProcAmnetSelfTunnelChangedListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PushProcAmnetSelfTunnelChangedListener) ipChange.ipc$dispatch("f5f0b26a", new Object[0]);
        }
        PushProcAmnetSelfTunnelChangedListener pushProcAmnetSelfTunnelChangedListener = f3914a;
        if (pushProcAmnetSelfTunnelChangedListener != null) {
            return pushProcAmnetSelfTunnelChangedListener;
        }
        synchronized (PushProcAmnetSelfTunnelChangedListener.class) {
            try {
                if (f3914a == null) {
                    f3914a = new PushProcAmnetSelfTunnelChangedListener();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3914a;
    }

    public final void a(TunnelChangeEventModel tunnelChangeEventModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde694a8", new Object[]{this, tunnelChangeEventModel});
        } else if (tunnelChangeEventModel.newTunnelType == 3) {
            if (!NetworkTunnelStrategy.getInstance().isCanUseAmnetOnOnlyPush()) {
                AmnetServiceOperationHelper.startAmnetConnect();
            } else {
                AmnetManagerFactory.getInstance().reconnect();
            }
        } else if (!NetworkTunnelStrategy.getInstance().isCanUseAmnet() && TransportStrategy.isEnabledOnlyPush()) {
            AmnetServiceOperationHelper.startAmnetConnect();
        } else if (TransportStrategy.isEnabledOnlyPush()) {
            AmnetManagerFactory.getInstance().reconnect();
        } else {
            AmnetServiceOperationHelper.stopAmnetConnect();
        }
    }

    @Override // com.alipay.mobile.common.transport.strategy.NetworkTunnelChangedListener, java.util.Observer
    public void update(Observable observable, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            return;
        }
        TunnelChangeEventModel tunnelChangeEventModel = (TunnelChangeEventModel) obj;
        LogCatUtil.info("PushProcAmnetSelfTunnelChangedListener", "Accepte channel changed：current: " + tunnelChangeEventModel.currentTunnelType + ", new: " + tunnelChangeEventModel.newTunnelType);
        a(tunnelChangeEventModel);
    }
}
