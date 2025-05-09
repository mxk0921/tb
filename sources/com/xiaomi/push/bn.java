package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.manager.a;
import com.xiaomi.push.ah;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bn extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f14783a;

    public bn(Context context) {
        this.f14783a = context;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a  reason: collision with other method in class */
    public String mo607a() {
        return "100886";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (a()) {
                b.c(this.f14783a.getPackageName() + " begin upload event");
                a.a(this.f14783a).m419b();
            }
        } catch (Exception e) {
            b.a(e);
        }
    }

    private boolean a() {
        return a.a(this.f14783a).m417a().isEventUploadSwitchOpen();
    }
}
