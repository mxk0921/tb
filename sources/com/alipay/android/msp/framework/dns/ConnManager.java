package com.alipay.android.msp.framework.dns;

import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ConnManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte MAX_LOOP_COUNT = 3;

    /* renamed from: a  reason: collision with root package name */
    public static int f3595a;

    public static void inscLoopCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d88f9d", new Object[0]);
            return;
        }
        f3595a = (f3595a + 1) % 3;
        LogUtil.record(2, "", "ConnManager::inscCurrLoopCount()", "mCurrentLoopCount:" + f3595a);
        if (isClientConnDegrade()) {
            DnsManager.resetHeadIndex();
        } else {
            DnsManager.inscHeadIndex();
        }
    }

    public static boolean isClientConnDegrade() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79865060", new Object[0])).booleanValue();
        }
        if (f3595a >= 2) {
            z = true;
        }
        LogUtil.record(4, "", "ConnManager::isClientConnDegrade", "isDegrade:".concat(String.valueOf(z)));
        return z;
    }
}
