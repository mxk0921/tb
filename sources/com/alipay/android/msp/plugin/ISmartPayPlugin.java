package com.alipay.android.msp.plugin;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface ISmartPayPlugin {
    public static final int FP_AUTH_TYPE = 1;
    public static final int FP_WEARABLE_TYPE = 0;

    String getFastPayAuthData(String str);

    String getRegAuthData(int i, int i2, String str);
}
