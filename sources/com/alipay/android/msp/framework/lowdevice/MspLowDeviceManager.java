package com.alipay.android.msp.framework.lowdevice;

import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspLowDeviceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3627a;
    public boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class Host {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final MspLowDeviceManager f3628a = new MspLowDeviceManager();

        public static /* synthetic */ MspLowDeviceManager access$100() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MspLowDeviceManager) ipChange.ipc$dispatch("60a17872", new Object[0]);
            }
            return f3628a;
        }
    }

    public static MspLowDeviceManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspLowDeviceManager) ipChange.ipc$dispatch("2c65fed8", new Object[0]);
        }
        return Host.access$100();
    }

    public boolean isLowDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[]{this})).booleanValue();
        }
        if (!this.b) {
            checkLowDevice();
        }
        LogUtil.record(2, "MspLowDeviceManager:isLowDevice", "lowDevice=" + this.f3627a);
        return this.f3627a;
    }

    public MspLowDeviceManager() {
        this.f3627a = false;
        this.b = false;
    }

    public boolean checkLowDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f011a62d", new Object[]{this})).booleanValue();
        }
        this.b = true;
        this.f3627a = PhoneCashierMspEngine.getMspWallet().isLowDevice();
        LogUtil.record(2, "MspLowDeviceManager:checkLowDevice", "lowDevice=" + this.f3627a);
        return this.f3627a;
    }
}
