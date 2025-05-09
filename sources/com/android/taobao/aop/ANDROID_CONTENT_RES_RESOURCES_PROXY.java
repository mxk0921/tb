package com.android.taobao.aop;

import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.report.ReportType;
import com.android.taobao.aop.report.ResModel;
import com.taobao.tao.Globals;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.gpv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ANDROID_CONTENT_RES_RESOURCES_PROXY {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TB_RESOURCES_PROXY_getIdentifier";
    private static Map<String, Integer> resMap = new ConcurrentHashMap();
    private static gpv sUsageReporter = gpv.a();

    static {
        t2o.a(497025028);
    }

    public static int proxy_getIdentifier(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7a2f626", new Object[]{str, str2, str3})).intValue();
        }
        String str4 = str3 + ":" + str2 + "/" + str;
        if (resMap.containsKey(str4)) {
            return resMap.get(str4).intValue();
        }
        int identifier = Globals.getApplication().getResources().getIdentifier(str, str2, str3);
        sUsageReporter.b(ReportType.RESOURCE, new ResModel(str3, str2, str), identifier);
        resMap.put(str3 + ":" + str2 + "/" + str, Integer.valueOf(identifier));
        return identifier;
    }

    public static int proxy_getIdentifier(Resources resources, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7488bd7d", new Object[]{resources, str, str2, str3})).intValue();
        }
        String str4 = str3 + ":" + str2 + "/" + str;
        if (resMap.containsKey(str4)) {
            return resMap.get(str4).intValue();
        }
        int identifier = resources.getIdentifier(str, str2, str3);
        sUsageReporter.b(ReportType.RESOURCE, new ResModel(str3, str2, str), identifier);
        resMap.put(str3 + ":" + str2 + "/" + str, Integer.valueOf(identifier));
        return identifier;
    }
}
