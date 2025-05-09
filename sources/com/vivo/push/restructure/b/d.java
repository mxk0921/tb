package com.vivo.push.restructure.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.vivo.push.PushConfig;
import com.vivo.push.model.b;
import com.vivo.push.restructure.a;
import com.vivo.push.util.aa;
import com.vivo.push.util.g;
import com.vivo.push.util.u;
import com.vivo.push.util.z;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, c> f14633a = new ConcurrentHashMap();
    private String b;
    private z c;
    private volatile PushConfig d;

    public d(z zVar) {
        this.c = zVar;
    }

    @Override // com.vivo.push.restructure.b.a
    public final String a(Context context, String str) {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (context == null || TextUtils.isEmpty(str)) {
            u.a("PushRelyImpl", "getReceiverClassName() params error, context = " + context + ", action = " + str);
            return "";
        }
        String packageName = context.getPackageName();
        String a2 = a(context, packageName, str);
        this.b = a2;
        if (TextUtils.isEmpty(a2)) {
            u.d("PushRelyImpl", " reflectReceiver error: receiver for: " + str + " not found, package: " + packageName);
        }
        return this.b;
    }

    @Override // com.vivo.push.restructure.b.a
    public final void b() {
        a("");
    }

    @Override // com.vivo.push.restructure.b.a
    public final String c() {
        c cVar = f14633a.get(a.a().b().getPackageName());
        if (cVar != null) {
            String b = cVar.b();
            if (!TextUtils.isEmpty(b)) {
                return b;
            }
        }
        String c = this.c.c();
        if (!TextUtils.isEmpty(c)) {
            if (cVar == null) {
                cVar = new c();
            }
            cVar.b(c);
            f14633a.put(a.a().b().getPackageName(), cVar);
        }
        return c;
    }

    @Override // com.vivo.push.restructure.b.a
    public final void d() {
        b("");
    }

    @Override // com.vivo.push.restructure.b.a
    public final void e() {
        this.c.a();
        f14633a.clear();
    }

    @Override // com.vivo.push.restructure.b.a
    public final String f() {
        return this.c.b("APP_TOKEN", (String) null);
    }

    @Override // com.vivo.push.restructure.b.a
    public final String g() {
        return this.c.b("APP_TAGS", (String) null);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void h() {
        this.c.a("APP_TAGS");
    }

    @Override // com.vivo.push.restructure.b.a
    public final String i() {
        return this.c.b("APP_ALIAS", (String) null);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void j() {
        this.c.a("APP_ALIAS");
    }

    @Override // com.vivo.push.restructure.b.a
    public final String k() {
        b a2 = aa.a(a.a().b(), a.a().f());
        if (a2 == null || a2.c()) {
            return null;
        }
        return a2.a();
    }

    @Override // com.vivo.push.restructure.b.a
    public final PushConfig l() {
        boolean z;
        if (this.d != null) {
            return this.d;
        }
        boolean z2 = true;
        int b = this.c.b("PUSH_CLIENT_CONFIG", 1);
        PushConfig.Builder builder = new PushConfig.Builder();
        int i = b & 1;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        PushConfig.Builder agreePrivacyStatement = builder.agreePrivacyStatement(z);
        if (i == 0) {
            z2 = false;
        }
        return agreePrivacyStatement.openMultiUserMode(z2).build();
    }

    @Override // com.vivo.push.restructure.b.a
    public final void b(String str) {
        this.c.a("APP_APIKEY", str);
        c cVar = f14633a.get(a.a().b().getPackageName());
        if (cVar == null) {
            cVar = new c();
        }
        cVar.b(str);
        f14633a.put(a.a().b().getPackageName(), cVar);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void d(String str) {
        this.c.a("APP_TAGS", str);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void e(String str) {
        this.c.a("APP_ALIAS", str);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void c(String str) {
        this.c.a("APP_TOKEN", str);
    }

    private static String a(Context context, String str, String str2) {
        List<ResolveInfo> queryBroadcastReceivers;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 64)) == null || queryBroadcastReceivers.size() <= 0) {
                return null;
            }
            return queryBroadcastReceivers.get(0).activityInfo.name;
        } catch (Exception e) {
            u.a("PushRelyImpl", "error  " + e.getMessage());
            return null;
        }
    }

    @Override // com.vivo.push.restructure.b.a
    public final String a() {
        c cVar = f14633a.get(a.a().b().getPackageName());
        if (cVar != null) {
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
        }
        String b = this.c.b();
        if (!TextUtils.isEmpty(b)) {
            if (cVar == null) {
                cVar = new c();
            }
            cVar.a(b);
            f14633a.put(a.a().b().getPackageName(), cVar);
        }
        return b;
    }

    @Override // com.vivo.push.restructure.b.a
    public final void a(String str) {
        this.c.a("APP_APPID", str);
        c cVar = f14633a.get(a.a().b().getPackageName());
        if (cVar == null) {
            cVar = new c();
        }
        cVar.a(str);
        f14633a.put(a.a().b().getPackageName(), cVar);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void a(PushConfig pushConfig) {
        if (pushConfig != null) {
            this.d = null;
            Context b = a.a().b();
            this.c.a("PUSH_CLIENT_CONFIG", pushConfig.isAgreePrivacyStatement() | pushConfig.isOpenMultiUser());
            g.a().execute(new e(this, b, pushConfig));
            this.d = pushConfig;
        }
    }
}
