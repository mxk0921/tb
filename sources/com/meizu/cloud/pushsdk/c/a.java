package com.meizu.cloud.pushsdk.c;

import android.content.Context;
import com.meizu.cloud.pushsdk.c.b;
import com.meizu.cloud.pushsdk.c.c.b;
import com.meizu.cloud.pushsdk.f.b.c;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {

    /* compiled from: Taobao */
    /* renamed from: com.meizu.cloud.pushsdk.c.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class RunnableC0274a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f5771a;

        public RunnableC0274a(Context context) {
            this.f5771a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.a(this.f5771a).b("POST", null, a.a(this.f5771a).toString());
        }
    }

    public static c a(Context context) {
        c cVar = new c();
        b b = b(context);
        Map<String, String> b2 = b.b();
        Map<String, Object> a2 = b.a();
        Map<String, Object> c = b.c();
        if (b2.size() > 0) {
            cVar.a(AppIconSetting.DEFAULT_LARGE_ICON, b2);
        }
        if (a2.size() > 0) {
            cVar.a("ai", a2);
        }
        if (c.size() > 0) {
            cVar.a(AppIconSetting.LARGE_ICON_URL, c);
        }
        return cVar;
    }

    private static b b(Context context) {
        return new b.C0275b().a(context).a();
    }

    public static void c(Context context) {
        com.meizu.cloud.pushsdk.d.m.a.a().execute(new RunnableC0274a(context));
    }
}
