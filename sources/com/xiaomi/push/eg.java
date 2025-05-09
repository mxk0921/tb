package com.xiaomi.push;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ah;
import com.xiaomi.push.service.az;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eg {

    /* renamed from: a  reason: collision with root package name */
    private static volatile eg f14848a;

    /* renamed from: a  reason: collision with other field name */
    private Context f884a;

    /* renamed from: a  reason: collision with other field name */
    private a f885a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a();
    }

    private eg(Context context) {
        this.f884a = context;
    }

    public static int a(int i) {
        return Math.max(60, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a aVar;
        ah a2 = ah.a(this.f884a);
        az a3 = az.a(this.f884a);
        SharedPreferences sharedPreferences = this.f884a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("first_try_ts", currentTimeMillis);
        if (j == currentTimeMillis) {
            sharedPreferences.edit().putLong("first_try_ts", currentTimeMillis).commit();
        }
        if (Math.abs(currentTimeMillis - j) >= AuthenticatorCache.MAX_CACHE_TIME) {
            a(a3, a2, false);
            if (a3.a(ih.StorageCollectionSwitch.a(), true)) {
                int a4 = a(a3.a(ih.StorageCollectionFrequency.a(), RemoteMessageConst.DEFAULT_TTL));
                a2.a(new ej(this.f884a, a4), a4, 0);
            }
            if (j.m869a(this.f884a) && (aVar = this.f885a) != null) {
                aVar.a();
            }
            if (a3.a(ih.ActivityTSSwitch.a(), false)) {
                a();
            }
            a(a3, a2, true);
        }
    }

    public static eg a(Context context) {
        if (f14848a == null) {
            synchronized (eg.class) {
                try {
                    if (f14848a == null) {
                        f14848a = new eg(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14848a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m603a() {
        ah.a(this.f884a).a(new eh(this));
    }

    private void a(az azVar, ah ahVar, boolean z) {
        if (azVar.a(ih.UploadSwitch.a(), true)) {
            ek ekVar = new ek(this.f884a);
            if (z) {
                ahVar.a((ah.a) ekVar, a(azVar.a(ih.UploadFrequency.a(), RemoteMessageConst.DEFAULT_TTL)));
            } else {
                ahVar.m482a((ah.a) ekVar);
            }
        }
    }

    private boolean a() {
        try {
            Context context = this.f884a;
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            ((Application) context).registerActivityLifecycleCallbacks(new ea(this.f884a, String.valueOf(System.currentTimeMillis() / 1000)));
            return true;
        } catch (Exception e) {
            b.a(e);
            return false;
        }
    }
}
