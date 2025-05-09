package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.l;
import com.xiaomi.push.bh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ak {
    public static AbstractPushManager a(Context context, e eVar) {
        return b(context, eVar);
    }

    private static AbstractPushManager b(Context context, e eVar) {
        l.a a2 = l.m477a(eVar);
        if (a2 == null || TextUtils.isEmpty(a2.f14734a) || TextUtils.isEmpty(a2.b)) {
            return null;
        }
        return (AbstractPushManager) bh.a(a2.f14734a, a2.b, context);
    }
}
