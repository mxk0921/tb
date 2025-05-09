package com.alipay.mobile.common.logging.api.utils;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LoggingUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f3957a;
    public static boolean sMainProcStartupStubRecorded;

    public static String convertExtParams2String(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60f03323", new Object[]{hashMap});
        }
        if (hashMap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key)) {
                if (sb.length() != 0) {
                    sb.append("&");
                }
                sb.append(key);
                sb.append(":");
                sb.append(value);
            }
        }
        return sb.toString();
    }

    public static StringBuilder convertExtParams2StringBuilder(StringBuilder sb, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("d01fb523", new Object[]{sb, str, str2, new Boolean(z)});
        }
        if (sb == null) {
            return sb;
        }
        if (TextUtils.isEmpty(str)) {
            return sb;
        }
        if (z) {
            sb.append("&");
        }
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb;
    }

    public static boolean isMainProcStartupFinishOrTimeout() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27cc9ad2", new Object[0])).booleanValue();
        }
        if (f3957a) {
            return true;
        }
        if (!LoggerFactory.getProcessInfo().isMainProcess() || !LoggerFactory.getProcessInfo().isStartupByAnyActivity() || sMainProcStartupStubRecorded || Math.abs(System.currentTimeMillis() - LoggerFactory.getProcessInfo().getProcessStartTime()) > 5000) {
            z = true;
        }
        f3957a = z;
        return z;
    }
}
