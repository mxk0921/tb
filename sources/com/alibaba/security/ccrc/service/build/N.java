package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class N {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            fsw.h("CCRCRiskService", P.class);
        } catch (Throwable th) {
            Logging.e("windVane", "register plugin fail", th);
        }
    }
}
