package com.alipay.mobile.common.amnet.service.ipcservice;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class OutEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void onAppResumeEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efc9c52", new Object[]{this});
        }
    }
}
