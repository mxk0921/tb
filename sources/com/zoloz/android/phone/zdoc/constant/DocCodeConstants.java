package com.zoloz.android.phone.zdoc.constant;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.ga8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class DocCodeConstants {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f15141a = "Z2000";
    public static final String b = "Z2001";
    public static final String c = "Z2002";
    public static final String d = "Z2003";
    public static final String e = "Z2004";
    public static final String f = "Z2005";
    public static final String g = "Z2006";
    public static final String h = "Z2007";
    public static final Map i = new HashMap() { // from class: com.zoloz.android.phone.zdoc.constant.DocCodeConstants.1
        {
            put(DocCodeConstants.f15141a, ga8.SYSTEM_ERROR_MSG);
            put(DocCodeConstants.b, "Failed to access the camera");
            put(DocCodeConstants.c, "User quit");
            put(DocCodeConstants.d, "Not connected to Internet");
            put(DocCodeConstants.e, "Time out");
            put(DocCodeConstants.f, "Verification Interrupted");
            put(DocCodeConstants.g, "Too many attempts");
            put(DocCodeConstants.h, "Quality check failed");
        }
    };

    static {
        t2o.a(245366927);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7d8193e", new Object[]{str});
        }
        return String.format("%s(%s)", ((HashMap) i).get(str), str);
    }
}
