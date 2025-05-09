package com.alipay.mobile.common.transport.monitor.networkqos;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WestWoodManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static WestWoodManager b;

    /* renamed from: a  reason: collision with root package name */
    public final WestWoodModel f4128a = new WestWoodModel();

    public static WestWoodManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WestWoodManager) ipChange.ipc$dispatch("f0c67671", new Object[0]);
        }
        WestWoodManager westWoodManager = b;
        if (westWoodManager != null) {
            return westWoodManager;
        }
        synchronized (WestWoodManager.class) {
            try {
                if (b == null) {
                    b = new WestWoodManager();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public double calBw(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("610974f8", new Object[]{this, new Double(d), new Double(d2)})).doubleValue();
        }
        return this.f4128a.calBw(d, d2);
    }
}
