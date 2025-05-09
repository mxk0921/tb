package com.huawei.hms.framework.network.grs.h;

import com.huawei.hms.framework.common.Logger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5360a = "e";

    public static boolean a(Long l) {
        if (l == null) {
            Logger.v(f5360a, "Method isTimeExpire input param expireTime is null.");
            return true;
        }
        try {
        } catch (NumberFormatException unused) {
            Logger.v(f5360a, "isSpExpire spValue NumberFormatException.");
        }
        if (l.longValue() - System.currentTimeMillis() >= 0) {
            Logger.i(f5360a, "isSpExpire false.");
            return false;
        }
        Logger.i(f5360a, "isSpExpire true.");
        return true;
    }

    public static boolean a(Long l, long j) {
        if (l == null) {
            Logger.v(f5360a, "Method isTimeWillExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l.longValue() - (System.currentTimeMillis() + j) >= 0) {
                Logger.v(f5360a, "isSpExpire false.");
                return false;
            }
        } catch (NumberFormatException unused) {
            Logger.v(f5360a, "isSpExpire spValue NumberFormatException.");
        }
        return true;
    }
}
