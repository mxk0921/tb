package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.az;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hx implements XMPushService.n {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f14941a;

    /* renamed from: a  reason: collision with other field name */
    private int f1122a;

    /* renamed from: a  reason: collision with other field name */
    private Context f1123a;
    private boolean b;

    public hx(Context context) {
        this.f1123a = context;
    }

    private String a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f1123a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    /* renamed from: a  reason: collision with other method in class */
    public void mo775a() {
        a(this.f1123a);
        if (this.b && a()) {
            b.m410a("TinyData TinyDataCacheProcessor.pingFollowUpAction ts:" + System.currentTimeMillis());
            ib a2 = ia.a(this.f1123a).a();
            if (!a(a2)) {
                b.m410a("TinyData TinyDataCacheProcessor.pingFollowUpAction !canUpload(uploader) ts:" + System.currentTimeMillis());
                return;
            }
            f14941a = true;
            hy.a(this.f1123a, a2);
        }
    }

    private void a(Context context) {
        this.b = az.a(context).a(ih.TinyDataUploadSwitch.a(), true);
        int a2 = az.a(context).a(ih.TinyDataUploadFrequency.a(), 7200);
        this.f1122a = a2;
        this.f1122a = Math.max(60, a2);
    }

    public static void a(boolean z) {
        f14941a = z;
    }

    private boolean a() {
        return Math.abs((System.currentTimeMillis() / 1000) - this.f1123a.getSharedPreferences("mipush_extra", 4).getLong("last_tiny_data_upload_timestamp", -1L)) > ((long) this.f1122a);
    }

    private boolean a(ib ibVar) {
        if (bg.b(this.f1123a) && ibVar != null && !TextUtils.isEmpty(a(this.f1123a.getPackageName())) && new File(this.f1123a.getFilesDir(), "tiny_data.data").exists() && !f14941a) {
            return !az.a(this.f1123a).a(ih.ScreenOnOrChargingTinyDataUploadSwitch.a(), false) || i.m778a(this.f1123a) || i.m781b(this.f1123a);
        }
        return false;
    }
}
