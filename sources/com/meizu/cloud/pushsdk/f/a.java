package com.meizu.cloud.pushsdk.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.f.c.a;
import com.meizu.cloud.pushsdk.f.c.b;
import com.meizu.cloud.pushsdk.f.c.f;
import com.meizu.cloud.pushsdk.f.f.a;
import com.meizu.cloud.pushsdk.f.f.c;
import com.meizu.cloud.pushsdk.f.g.c;
import com.meizu.cloud.pushsdk.f.g.e;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static com.meizu.cloud.pushsdk.f.f.a f5853a;
    private static BroadcastReceiver b;

    /* compiled from: Taobao */
    /* renamed from: com.meizu.cloud.pushsdk.f.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class C0282a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.meizu.cloud.pushsdk.f.f.a f5854a;

        public C0282a(com.meizu.cloud.pushsdk.f.f.a aVar) {
            this.f5854a = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (e.d(context)) {
                c.b("QuickTracker", "restart track event: %s", "online true");
                this.f5854a.b();
            }
        }
    }

    public static com.meizu.cloud.pushsdk.f.f.a a(Context context, com.meizu.cloud.pushsdk.e.d.a aVar, f fVar) {
        if (f5853a == null) {
            synchronized (a.class) {
                try {
                    if (f5853a == null) {
                        com.meizu.cloud.pushsdk.f.f.a a2 = a(b(context, aVar, fVar), (com.meizu.cloud.pushsdk.f.f.c) null, context);
                        f5853a = a2;
                        a(context, a2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5853a;
    }

    private static com.meizu.cloud.pushsdk.f.c.a b(Context context, com.meizu.cloud.pushsdk.e.d.a aVar, f fVar) {
        a.C0283a c = new a.C0283a(a(), context, com.meizu.cloud.pushsdk.f.c.h.a.class).a(fVar).a(aVar).c(1);
        b bVar = b.DefaultGroup;
        return new com.meizu.cloud.pushsdk.f.c.h.a(c.a(bVar).b(bVar.a()).a(2));
    }

    public static com.meizu.cloud.pushsdk.f.f.a a(Context context, boolean z) {
        if (f5853a == null) {
            synchronized (a.class) {
                try {
                    if (f5853a == null) {
                        f5853a = a(b(context, null, null), (com.meizu.cloud.pushsdk.f.f.c) null, context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        DebugLogger.i("PushAndroidTracker", "can upload subject " + z);
        if (z) {
            f5853a.a(a(context));
        }
        return f5853a;
    }

    private static com.meizu.cloud.pushsdk.f.f.a a(com.meizu.cloud.pushsdk.f.c.a aVar, com.meizu.cloud.pushsdk.f.f.c cVar, Context context) {
        return new com.meizu.cloud.pushsdk.f.f.d.a(new a.C0287a(aVar, "PushAndroidTracker", context.getPackageCodePath(), context, com.meizu.cloud.pushsdk.f.f.d.a.class).a(com.meizu.cloud.pushsdk.f.g.b.VERBOSE).a(Boolean.FALSE).a(cVar).a(4));
    }

    private static com.meizu.cloud.pushsdk.f.f.c a(Context context) {
        return new c.b().a(context).a();
    }

    private static String a() {
        String str = MzSystemUtils.isOverseas() ? PushConstants.URL_ABROAD_STATICS_DOMAIN : PushConstants.URL_STATICS_DOMAIN;
        DebugLogger.e("QuickTracker", "current statics domain is ".concat(str));
        return str;
    }

    private static void a(Context context, com.meizu.cloud.pushsdk.f.f.a aVar) {
        if (b == null) {
            b = new C0282a(aVar);
            context.registerReceiver(b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }
}
