package com.ta.utdid2.android.utils;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BuildCompatUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(966787105);
    }

    public static boolean isAtLeastM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2360586c", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public static boolean isAtLeastQ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2398b670", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 29) {
            String str = Build.VERSION.CODENAME;
            if (str.length() != 1 || str.charAt(0) < 'Q' || str.charAt(0) > 'Z') {
                return false;
            }
        }
        return true;
    }
}
