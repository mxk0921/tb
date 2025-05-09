package com.alipay.mobile.common.logging.render;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class BaseRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f3980a;
    public LogContext b;

    public BaseRender(LogContext logContext) {
        this.b = logContext;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : TextUtils.isEmpty(str) ? str : str.replaceAll("\\$\\$", "**");
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        f3980a++;
        StringBuilder sb = new StringBuilder();
        sb.append(f3980a);
        return sb.toString();
    }
}
