package com.huawei.hms.aaid.encrypt;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.opendevice.l;
import tb.ig0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PushEncrypter {
    public static String decrypter(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return ig0.f(str, l.b(context));
    }

    public static String encrypter(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return ig0.j(str, l.b(context));
    }

    public static String encrypterOld(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return ig0.k(str, l.a(context));
    }
}
