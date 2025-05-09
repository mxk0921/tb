package com.alipay.mobile.common.logging.api.monitor;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MTBizReportFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Entity f3954a;

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface Entity {
        Map<String, String> onBeforeReportForUeo(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2);
    }

    public static Entity getEntity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Entity) ipChange.ipc$dispatch("1562217a", new Object[0]);
        }
        return f3954a;
    }

    public static void setEntity(Entity entity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807d6b3e", new Object[]{entity});
        } else if (f3954a == null) {
            f3954a = entity;
        }
    }
}
