package com.taobao.tao.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import java.net.URLEncoder;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MyUrlEncoder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946424);
    }

    public static String decode(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7a3d9b7", new Object[]{str, str2});
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String encod(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89574296", new Object[]{str, str2});
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}
