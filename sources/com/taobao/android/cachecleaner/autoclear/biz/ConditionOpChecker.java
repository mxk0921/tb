package com.taobao.android.cachecleaner.autoclear.biz;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ConditionOpChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f6496a = new ArrayList<String>() { // from class: com.taobao.android.cachecleaner.autoclear.biz.ConditionOpChecker.1
        {
            add("&&");
            add("||");
        }
    };

    static {
        t2o.a(737148976);
    }

    public static long a(List<String> list, Map<String, Long> map) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33a1f9a3", new Object[]{list, map})).longValue();
        }
        if (list == null || list.isEmpty()) {
            return 0L;
        }
        String str = f7l.PLUS;
        long j2 = 0;
        for (String str2 : list) {
            if (TextUtils.equals(str2, f7l.PLUS)) {
                str = f7l.PLUS;
            } else if (TextUtils.equals(str2, "-")) {
                str = "-";
            } else {
                if (c(str2)) {
                    j = d(str2, 0L);
                } else if (map.containsKey(str2)) {
                    j = map.get(str2).longValue();
                } else {
                    j = 0;
                }
                if (str.equals(f7l.PLUS)) {
                    j2 += j;
                } else if (str.equals("-")) {
                    j2 -= j;
                }
            }
        }
        return j2;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20976802", new Object[]{str})).booleanValue();
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static long d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("920e4145", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            Log.e("ConditionOpChecker", "safeParseLong: NumberFormatException with str " + str);
            return j;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
        if (r10.equals("<=") == false) goto L_0x007f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(com.taobao.android.cachecleaner.autoclear.biz.data.BizOpConditionData r9, java.util.Map<java.lang.String, java.lang.Long> r10) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.cachecleaner.autoclear.biz.ConditionOpChecker.b(com.taobao.android.cachecleaner.autoclear.biz.data.BizOpConditionData, java.util.Map):boolean");
    }
}
