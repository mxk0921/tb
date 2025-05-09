package com.alipay.share.sdk.plugin;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APVersionCheck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4545a;

    public APVersionCheck(Context context) {
        this.f4545a = context;
    }

    public int getZFBAppVersionCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c660941e", new Object[]{this})).intValue();
        }
        try {
            return this.f4545a.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", 64).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }
}
