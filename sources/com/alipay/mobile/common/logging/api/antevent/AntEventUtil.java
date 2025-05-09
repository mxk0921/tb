package com.alipay.mobile.common.logging.api.antevent;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AntEventUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getLogCategory(AntEvent antEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("431f46da", new Object[]{antEvent});
        }
        if (antEvent.getExtParams().containsKey("antLogCategory")) {
            return antEvent.getExtParams().get("antLogCategory");
        }
        return antEvent.getBizType();
    }
}
