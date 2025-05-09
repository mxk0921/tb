package com.meizu.cloud.pushsdk.d;

import com.meizu.cloud.pushsdk.d.l.a;
import com.meizu.cloud.pushsdk.d.l.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i {
    public static String a(String str) {
        d a2 = a.a("android.os.SystemProperties").a("get", String.class).a(str);
        if (a2.f5794a) {
            return (String) a2.b;
        }
        return null;
    }
}
