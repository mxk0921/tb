package com.taobao.weex.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.ey1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Switch {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(773849133);
    }

    public static Boolean isSwitchOn(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("962b944b", new Object[]{str});
        }
        return Boolean.valueOf(new File(ey1.SWITCH_FILE_DIR, str).exists());
    }
}
