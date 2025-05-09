package com.alipay.mobile.beehive.eventbus;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SubscriberConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isWeakRef = true;
    public boolean supportPending = false;
    public boolean supportSticky = false;
    public String uniqueId = "";

    public boolean isSupportSticky() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8846ab19", new Object[]{this})).booleanValue();
        }
        if (this.supportSticky || this.supportPending) {
            return true;
        }
        return false;
    }
}
