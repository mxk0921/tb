package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class GtsUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static long f4142a = -1;

    public static final String get64HexCurrentTimeMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("445df574", new Object[0]);
        }
        return HexaDecimalConvUtil.c10to64(getCurrentTimeMillis());
    }

    public static final long getCurrentTimeMillis() {
        long currentTimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7aff3291", new Object[0])).longValue();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (currentTimeMillis2 != f4142a) {
            f4142a = currentTimeMillis2;
            return currentTimeMillis2;
        }
        synchronized (GtsUtils.class) {
            try {
                Thread.sleep(5L);
            } catch (InterruptedException e) {
                LogCatUtil.printError("GtsUtils", e);
            }
            currentTimeMillis = System.currentTimeMillis();
            f4142a = currentTimeMillis;
        }
        return currentTimeMillis;
    }
}
