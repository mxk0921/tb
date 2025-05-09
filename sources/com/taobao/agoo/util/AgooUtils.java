package com.taobao.agoo.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import tb.j8l;
import tb.m8l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AgooUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Integer f6172a = null;

    static {
        t2o.a(343933306);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc8026f3", new Object[]{context})).intValue();
        }
        if (f6172a == null) {
            try {
                String p = j8l.p(context);
                if (TextUtils.isEmpty(p)) {
                    return -1;
                }
                Integer valueOf = Integer.valueOf(Math.abs(p.hashCode()) % 100);
                f6172a = valueOf;
                ALog.e("AgooUtils", "getAgooBucketId", "pushBucketId", valueOf);
            } catch (Throwable th) {
                ALog.e("AgooUtils", "getAgooBucketId err", th, new Object[0]);
            }
        }
        return f6172a.intValue();
    }

    public static boolean isOptimizationEnabled(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2feb6ddb", new Object[]{context})).booleanValue();
        }
        try {
            String[] split = m8l.c().split(",");
            Pair create = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
            int a2 = a(context);
            boolean z = a2 >= ((Integer) create.first).intValue() && a2 <= ((Integer) create.second).intValue();
            if ("OPPO".equals(Build.BRAND)) {
                z = z && UtilityImpl.isAppKeepAlive();
            }
            ALog.e("AgooUtils", "isOptimizationEnabled range", "enabled", Boolean.valueOf(z), "start", create.first, "end", create.second);
            return z;
        } catch (Throwable th) {
            ALog.e("AgooUtils", "isOptimizationEnabled err", th, new Object[0]);
            return false;
        }
    }
}
