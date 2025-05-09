package com.taobao.tao.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBMainLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE_NAME = "taobaoCompat";

    static {
        t2o.a(775946442);
    }

    public static void tlog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6495106b", new Object[]{str, str2});
        } else {
            TLog.loge(MODULE_NAME, str, str2);
        }
    }
}
