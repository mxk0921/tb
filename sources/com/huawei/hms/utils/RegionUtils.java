package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsApp;
import tb.o78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RegionUtils {
    private static String a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return "";
        }
        return GrsApp.getInstance().getIssueCountryCode(context);
    }

    public static boolean isChinaROM(Context context) {
        return o78.CHINA_MAINLAND.equalsIgnoreCase(a(context));
    }
}
