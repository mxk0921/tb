package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ih;
import com.xiaomi.push.service.az;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f implements AbstractPushManager {

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f14728a;

    /* renamed from: a  reason: collision with other field name */
    private Context f703a;

    /* renamed from: a  reason: collision with other field name */
    private PushConfiguration f704a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f706a = false;

    /* renamed from: a  reason: collision with other field name */
    private Map<e, AbstractPushManager> f705a = new HashMap();

    private f(Context context) {
        this.f703a = context.getApplicationContext();
    }

    public boolean b(e eVar) {
        int i = h.f14730a[eVar.ordinal()];
        boolean z = false;
        if (i == 1) {
            PushConfiguration pushConfiguration = this.f704a;
            if (pushConfiguration != null) {
                return pushConfiguration.getOpenHmsPush();
            }
            return false;
        } else if (i != 2) {
            if (i == 3) {
                PushConfiguration pushConfiguration2 = this.f704a;
                if (pushConfiguration2 != null) {
                    z = pushConfiguration2.getOpenCOSPush();
                }
            } else if (i != 4) {
                return false;
            }
            PushConfiguration pushConfiguration3 = this.f704a;
            if (pushConfiguration3 != null) {
                return pushConfiguration3.getOpenFTOSPush();
            }
            return z;
        } else {
            PushConfiguration pushConfiguration4 = this.f704a;
            if (pushConfiguration4 != null) {
                return pushConfiguration4.getOpenFCMPush();
            }
            return false;
        }
    }

    @Override // com.xiaomi.mipush.sdk.AbstractPushManager
    public void register() {
        b.m410a("ASSEMBLE_PUSH : assemble push register");
        if (this.f705a.size() <= 0) {
            a();
        }
        if (this.f705a.size() > 0) {
            for (AbstractPushManager abstractPushManager : this.f705a.values()) {
                if (abstractPushManager != null) {
                    abstractPushManager.register();
                }
            }
            i.m471a(this.f703a);
        }
    }

    @Override // com.xiaomi.mipush.sdk.AbstractPushManager
    public void unregister() {
        b.m410a("ASSEMBLE_PUSH : assemble push unregister");
        for (AbstractPushManager abstractPushManager : this.f705a.values()) {
            if (abstractPushManager != null) {
                abstractPushManager.unregister();
            }
        }
        this.f705a.clear();
    }

    public AbstractPushManager a(e eVar) {
        return this.f705a.get(eVar);
    }

    public static f a(Context context) {
        if (f14728a == null) {
            synchronized (f.class) {
                try {
                    if (f14728a == null) {
                        f14728a = new f(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14728a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a() {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.f.a():void");
    }

    public void a(PushConfiguration pushConfiguration) {
        this.f704a = pushConfiguration;
        this.f706a = az.a(this.f703a).a(ih.AggregatePushSwitch.a(), true);
        if (this.f704a.getOpenHmsPush() || this.f704a.getOpenFCMPush() || this.f704a.getOpenCOSPush() || this.f704a.getOpenFTOSPush()) {
            az.a(this.f703a).a(new g(this, 101, "assemblePush"));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m468a(e eVar) {
        this.f705a.remove(eVar);
    }

    public void a(e eVar, AbstractPushManager abstractPushManager) {
        if (abstractPushManager != null) {
            if (this.f705a.containsKey(eVar)) {
                this.f705a.remove(eVar);
            }
            this.f705a.put(eVar, abstractPushManager);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m469a(e eVar) {
        return this.f705a.containsKey(eVar);
    }
}
