package com.mobile.auth;

import android.content.Context;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import tb.m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class OO0o000 {
    private static boolean O000000o;

    public static boolean O000000o(Context context) {
        try {
            if (O000000o) {
                return true;
            }
            Long O00000Oo = OO0o00.O00000Oo(context, "success_limit_time");
            long currentTimeMillis = System.currentTimeMillis();
            if (O00000Oo == null) {
                OO0o00.O000000o(context, "success_limit_time", Long.valueOf(currentTimeMillis));
                return true;
            } else if (currentTimeMillis - O00000Oo.longValue() > m.CONFIG_TRACK_1022_INTERVAL_TIME) {
                OO0o00.O000000o(context, "success_limit_time", Long.valueOf(currentTimeMillis));
                OO0o00.O000000o(context, "success_limit_count", (Long) 0L);
                return true;
            } else {
                Long O00000Oo2 = OO0o00.O00000Oo(context, "success_limit_count");
                if (O00000Oo2 != null) {
                    return O00000Oo2.longValue() <= 50;
                }
                OO0o00.O000000o(context, "success_limit_count", (Long) 0L);
                return true;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    public static void O00000Oo(Context context) {
        try {
            Long O00000Oo = OO0o00.O00000Oo(context, "success_limit_count");
            if (O00000Oo == null) {
                OO0o00.O000000o(context, "success_limit_count", (Long) 0L);
            } else {
                OO0o00.O000000o(context, "success_limit_count", Long.valueOf(O00000Oo.longValue() + 1));
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000o(Context context) {
        try {
            Long O00000Oo = OO0o00.O00000Oo(context, "count_limit_count");
            if (O00000Oo == null) {
                OO0o00.O000000o(context, "count_limit_count", (Long) 0L);
            } else {
                OO0o00.O000000o(context, "count_limit_count", Long.valueOf(O00000Oo.longValue() + 1));
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static boolean O00000o0(Context context) {
        try {
            if (O000000o) {
                return true;
            }
            Long O00000Oo = OO0o00.O00000Oo(context, "failed_limit_time");
            long currentTimeMillis = System.currentTimeMillis();
            if (O00000Oo == null) {
                OO0o00.O000000o(context, "failed_limit_time", Long.valueOf(currentTimeMillis));
                return true;
            } else if (currentTimeMillis - O00000Oo.longValue() > m.CONFIG_TRACK_1022_INTERVAL_TIME) {
                OO0o00.O000000o(context, "failed_limit_time", Long.valueOf(currentTimeMillis));
                OO0o00.O000000o(context, "count_limit_count", (Long) 0L);
                return true;
            } else {
                Long O00000Oo2 = OO0o00.O00000Oo(context, "count_limit_count");
                if (O00000Oo2 == null) {
                    OO0o00.O000000o(context, "count_limit_count", (Long) 0L);
                    return true;
                } else if (O00000Oo2.longValue() <= 50) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }
}
