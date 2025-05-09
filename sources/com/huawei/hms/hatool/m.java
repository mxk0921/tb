package com.huawei.hms.hatool;

import android.content.Context;
import com.alipay.mobile.common.logging.api.LogContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class m {
    private static m b;
    private static final Object c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f5391a;

    private m() {
    }

    public static m a() {
        if (b == null) {
            b();
        }
        return b;
    }

    private static synchronized void b() {
        synchronized (m.class) {
            if (b == null) {
                b = new m();
            }
        }
    }

    public void a(Context context) {
        synchronized (c) {
            try {
                if (this.f5391a != null) {
                    v.f("hmsSdk", "DataManager already initialized.");
                    return;
                }
                this.f5391a = context;
                s.c().b().a(this.f5391a);
                s.c().b().j(context.getPackageName());
                j.a().a(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str) {
        v.c("hmsSdk", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.f5391a;
        if (context == null) {
            v.e("hmsSdk", "sdk is not init");
            return;
        }
        s.c().b().i(e1.a(LogContext.STORAGE_APPID, str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
    }
}
