package com.loc;

import java.util.Calendar;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fs {
    private static long a(long j) {
        return j - b(j);
    }

    private static long b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    private static long a(long j, long j2) {
        long b = b(j2) + a(j);
        long abs = Math.abs(b - j2);
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(b));
        int i = instance.get(11);
        if (i == 23 && abs >= 82800000) {
            b -= 86400000;
        }
        return (i != 0 || abs < 82800000) ? b : b + 86400000;
    }

    public static long a(long j, long j2, int i) {
        if (i <= 0) {
            return j;
        }
        try {
            return Math.abs(j - j2) > ((long) i) * 31536000000L ? a(j, j2) : j;
        } catch (Throwable unused) {
            return j;
        }
    }
}
