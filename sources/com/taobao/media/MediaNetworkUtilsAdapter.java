package com.taobao.media;

import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.g0d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaNetworkUtilsAdapter implements g0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(774897683);
        t2o.a(774897669);
    }

    @Override // tb.g0d
    public String getNetworkStutas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b40e8c2f", new Object[]{this});
        }
        try {
            return NetworkStatusHelper.getStatus().getType();
        } catch (Throwable unused) {
            return "Unknown";
        }
    }

    @Override // tb.g0d
    public boolean isConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[]{this})).booleanValue();
        }
        try {
            return NetworkStatusHelper.isConnected();
        } catch (Throwable unused) {
            return true;
        }
    }
}
