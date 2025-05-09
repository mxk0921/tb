package com.taobao.tao.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BuiltConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946412);
    }

    private BuiltConfig() {
    }

    public static boolean getBoolean(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2037feae", new Object[]{new Integer(i)})).booleanValue();
        }
        return !"0".equals(Globals.getApplication().getString(i));
    }

    public static int getInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ab0c236", new Object[]{new Integer(i)})).intValue();
        }
        return Integer.parseInt(Globals.getApplication().getString(i));
    }

    public static String getString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{new Integer(i)});
        }
        return Globals.getApplication().getString(i);
    }
}
