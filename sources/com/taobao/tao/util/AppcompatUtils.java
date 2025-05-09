package com.taobao.tao.util;

import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AppcompatUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(927989765);
    }

    public static String getMenuTitle(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bf0afc2", new Object[]{str, str2});
        }
        return str2 + ":" + str;
    }

    public static String getMenuTitle(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8e3b2d1", new Object[]{str, new Integer(i)});
        }
        return Globals.getApplication().getString(i) + ":" + str;
    }
}
