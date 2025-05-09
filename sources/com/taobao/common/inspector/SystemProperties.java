package com.taobao.common.inspector;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SystemProperties {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RO_BOARD_PLATFORM = "ro.board.platform";
    public static final String RO_PRODUCT_BOARD = "ro.board.platform";

    static {
        t2o.a(395313329);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{str});
        }
        return nGetString(str);
    }

    private static native String nGetString(String str);
}
