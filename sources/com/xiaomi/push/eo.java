package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eo {
    public static void a(Context context, String str, int i, String str2) {
        ah.a(context).a(new ep(context, str, i, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str, int i, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("awake_info", str);
                hashMap.put("event_type", String.valueOf(i));
                hashMap.put("description", str2);
                int a2 = es.a(context).a();
                if (a2 != 1) {
                    if (a2 != 2) {
                        if (a2 == 3) {
                            a(context, hashMap);
                        }
                    }
                    c(context, hashMap);
                } else {
                    a(context, hashMap);
                }
                b(context, hashMap);
            } catch (Exception e) {
                b.a(e);
            }
        }
    }

    private static void a(Context context, HashMap<String, String> hashMap) {
        ew a2 = es.a(context).m672a();
        if (a2 != null) {
            a2.a(context, hashMap);
        }
    }

    private static void b(Context context, HashMap<String, String> hashMap) {
        ew a2 = es.a(context).m672a();
        if (a2 != null) {
            a2.c(context, hashMap);
        }
    }

    private static void c(Context context, HashMap<String, String> hashMap) {
        ew a2 = es.a(context).m672a();
        if (a2 != null) {
            a2.b(context, hashMap);
        }
    }
}
