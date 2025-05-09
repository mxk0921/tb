package com.taobao.android.tschedule.strategy;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.tschedule.TScheduleInitialize;
import java.util.HashMap;
import tb.dms;
import tb.hhg;
import tb.q1r;
import tb.t2o;
import tb.zms;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ABTest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class NoABExpException extends Exception {
        static {
            t2o.a(329252958);
        }
    }

    static {
        t2o.a(329252957);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6cd6682", new Object[]{str});
        }
        String str2 = (String) hhg.a("appVersion", null);
        if (str2 == null) {
            return null;
        }
        String replace = str2.replace('.', '_');
        return "androidSchedule_" + str + "_" + replace;
    }

    public static boolean b(String str) throws NoABExpException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac9ab29e", new Object[]{str})).booleanValue();
        }
        if (q1r.c(".tschedule_ab_on")) {
            return true;
        }
        Context b = TScheduleInitialize.b();
        if (ABGlobal.b(b, "tb_global", "phazhc", str + "_strategy_schedule")) {
            return true;
        }
        String a2 = a(str);
        if (a2 == null) {
            return false;
        }
        VariationSet activate = UTABTest.activate("tschedule", a2);
        if (activate.getExperimentId() > 0) {
            boolean valueAsBoolean = activate.getVariation("open").getValueAsBoolean(false);
            HashMap hashMap = new HashMap();
            hashMap.put("expBucketId", String.valueOf(activate.getExperimentBucketId()));
            hashMap.put("switchValue", String.valueOf(valueAsBoolean));
            dms.b("downgrade", "", "1", "TSchedule", "pageOnLeave", hashMap);
            return activate.getVariation("open").getValueAsBoolean(false);
        }
        Log.e("ScheduleABTest", "No exp found, try again later");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("expBucketId", "0");
        hashMap2.put("switchValue", "N/A");
        dms.b("downgrade", "", "1", "TSchedule", "pageOnLeave", hashMap2);
        throw new NoABExpException();
    }

    public static boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9738a329", new Object[]{new Integer(i)})).booleanValue();
        }
        String str = (String) hhg.a("deviceId", "");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        long j = 0;
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                j += (31 * j) + str.charAt(i2);
            }
        }
        int i3 = 100 / i;
        if (i3 != 0) {
            j *= i3;
        }
        long d = zms.d("start_prerender_gray_hash", 0L);
        if (d <= 0) {
            return false;
        }
        return d >= 10000 || j % 10000 <= d;
    }
}
