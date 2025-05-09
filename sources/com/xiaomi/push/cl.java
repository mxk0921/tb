package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cl {

    /* renamed from: a  reason: collision with root package name */
    private static String f14805a;

    /* renamed from: a  reason: collision with other field name */
    private static SimpleDateFormat f802a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f802a = simpleDateFormat;
        f14805a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static ig a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ig igVar = new ig();
        igVar.d("category_push_stat");
        igVar.a("push_sdk_stat_channel");
        igVar.a(1L);
        igVar.b(str);
        igVar.a(true);
        igVar.b(System.currentTimeMillis());
        igVar.g(bu.a(context).m526a());
        igVar.e("com.xiaomi.xmsf");
        igVar.f("");
        igVar.c("push_stat");
        return igVar;
    }
}
