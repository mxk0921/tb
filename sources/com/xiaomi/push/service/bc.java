package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.bm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bc {

    /* renamed from: a  reason: collision with root package name */
    private static long f15063a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static String f1576a = "";

    public static String a() {
        if (TextUtils.isEmpty(f1576a)) {
            f1576a = bm.a(4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f1576a);
        long j = f15063a;
        f15063a = 1 + j;
        sb.append(j);
        return sb.toString();
    }

    public static String b() {
        return bm.a(32);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 32) {
            return str;
        }
        try {
            return "BlockId_" + str.substring(8);
        } catch (Exception e) {
            b.d("Exception occurred when filtering registration packet id for log. " + e);
            return "UnexpectedId";
        }
    }
}
