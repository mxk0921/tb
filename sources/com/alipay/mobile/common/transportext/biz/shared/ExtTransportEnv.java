package com.alipay.mobile.common.transportext.biz.shared;

import android.content.Context;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ExtTransportEnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Context f4210a;

    public static final Context getAppContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7e19c4c3", new Object[0]);
        }
        if (f4210a == null) {
            f4210a = TransportEnvUtil.getContext();
        }
        return f4210a;
    }

    public static final void setAppContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0c5cd1", new Object[]{context});
        } else {
            f4210a = context.getApplicationContext();
        }
    }
}
