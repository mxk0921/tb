package com.taobao.android.cachecleaner.autoclear.biz;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.evo.EVO;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ConfigCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_CLEAR_AB_KEY = "biz_clear_ab_key";

    static {
        t2o.a(737148980);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long getQuotaSize(android.content.Context r5, java.lang.String r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.cachecleaner.autoclear.biz.ConfigCenter.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = "6439825c"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            return r5
        L_0x001c:
            tb.hg4 r0 = tb.hg4.j()
            r0.o()
            tb.hg4 r0 = tb.hg4.j()
            com.taobao.android.cachecleaner.monitor.config.RuleConfig r0 = r0.i()
            java.util.Map r0 = r0.getQuotaSizeMap()
            r1 = 0
            if (r0 == 0) goto L_0x0061
            java.lang.Object r3 = r0.get(r6)
            if (r3 != 0) goto L_0x003a
            goto L_0x0061
        L_0x003a:
            java.lang.Object r0 = r0.get(r6)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0044:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0061
            java.lang.Object r3 = r0.next()
            com.taobao.android.cachecleaner.autoclear.biz.data.BizQuotaData r3 = (com.taobao.android.cachecleaner.autoclear.biz.data.BizQuotaData) r3
            java.lang.String r4 = r3.abKey
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x005e
            boolean r4 = com.alibaba.evo.EVO.isSwitchOpened(r5, r6)
            if (r4 == 0) goto L_0x0044
        L_0x005e:
            long r5 = r3.size
            return r5
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.cachecleaner.autoclear.biz.ConfigCenter.getQuotaSize(android.content.Context, java.lang.String):long");
    }

    @Deprecated
    public static boolean isBizClearEnable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ba879e", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return EVO.isSwitchOpened(context, BIZ_CLEAR_AB_KEY);
    }

    public static boolean isBizClearEnable(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("740abee8", new Object[]{context, str})).booleanValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return EVO.isSwitchOpened(context, str);
    }
}
