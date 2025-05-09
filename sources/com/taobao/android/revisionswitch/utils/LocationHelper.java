package com.taobao.android.revisionswitch.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.o78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LocationHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_EDITION_CODE_CHANGED = "EDITON_SWITCHER_EDITTION_CODE_CHANGED";
    public static final String ELDER_HOME = "elderHome";
    public static final int MAINLAND = 0;
    public static final int OLD = 2;
    public static final int OTHER = 3;
    public static final int OVERSEAS = 1;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface LocationFrom {
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("395073c9", new Object[]{context})).intValue();
        }
        PositionInfo i = o78.i(context);
        if (o78.p(context)) {
            return 1;
        }
        if (o78.CHINA_MAINLAND.equalsIgnoreCase(i.editionCode)) {
            return 0;
        }
        if ("OLD".equalsIgnoreCase(i.editionCode)) {
            return 2;
        }
        return 3;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e242e25", new Object[]{context})).booleanValue();
        }
        return "1".equalsIgnoreCase(TBRevisionSwitchManager.c().e("elderHome"));
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23fb2157", new Object[]{context})).booleanValue();
        }
        if (TBRevisionSwitchManager.e) {
            return o78.s(context);
        }
        return o78.CHINA_MAINLAND.equalsIgnoreCase(o78.i(context).editionCode);
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9898023", new Object[]{context})).booleanValue();
        }
        return o78.p(context);
    }
}
