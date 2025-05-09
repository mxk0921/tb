package com.xiaomi.push;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.xiaomi.channel.commonutils.logger.b;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fe extends fh {

    /* renamed from: a  reason: collision with root package name */
    private int f14872a = 16777216;
    private Bitmap b;
    private Bitmap c;

    public fe(Context context, String str) {
        super(context, str);
    }

    @Override // com.xiaomi.push.fh
    /* renamed from: a */
    public fe mo678a(Bitmap bitmap) {
        if (m689b() && bitmap != null) {
            if (bitmap.getWidth() != 984 || 184 > bitmap.getHeight() || bitmap.getHeight() > 1678) {
                b.m410a("colorful notification banner image resolution error, must belong to [984*184, 984*1678]");
            } else {
                this.b = bitmap;
            }
        }
        return this;
    }

    public fe b(Bitmap bitmap) {
        if (m689b() && bitmap != null) {
            this.c = bitmap;
        }
        return this;
    }

    @Override // com.xiaomi.push.ff
    public fe a(String str) {
        if (m689b() && !TextUtils.isEmpty(str)) {
            try {
                this.f14872a = Color.parseColor(str);
            } catch (Exception unused) {
                b.m410a("parse banner notification image text color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.fh
    public String b() {
        return null;
    }

    @Override // com.xiaomi.push.fh
    /* renamed from: a  reason: collision with other method in class */
    public fh setLargeIcon(Bitmap bitmap) {
        return this;
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    public String mo686a() {
        return "notification_banner";
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a  reason: collision with other method in class */
    public void mo686a() {
        RemoteViews a2;
        Bitmap bitmap;
        if (!m689b() || this.b == null) {
            m688b();
            return;
        }
        super.mo686a();
        Resources resources = mo686a().getResources();
        String packageName = mo686a().getPackageName();
        int a3 = a(resources, "bg", "id", packageName);
        if (j.a(mo686a()) >= 10) {
            a2 = mo686a();
            bitmap = a(this.b, 30.0f);
        } else {
            a2 = mo686a();
            bitmap = this.b;
        }
        a2.setImageViewBitmap(a3, bitmap);
        int a4 = a(resources, "icon", "id", packageName);
        if (this.c != null) {
            mo686a().setImageViewBitmap(a4, this.c);
        } else {
            a(a4);
        }
        int a5 = a(resources, "title", "id", packageName);
        mo686a().setTextViewText(a5, ((fh) this).f977a);
        Map<String, String> map = ((fh) this).f980a;
        if (map != null && this.f14872a == 16777216) {
            a(map.get("notification_image_text_color"));
        }
        RemoteViews a6 = mo686a();
        int i = this.f14872a;
        a6.setTextColor(a5, (i == 16777216 || !m687a(i)) ? -1 : -16777216);
        setCustomContentView(mo686a());
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    public boolean mo686a() {
        if (!j.m868a()) {
            return false;
        }
        Resources resources = mo686a().getResources();
        String packageName = mo686a().getPackageName();
        return (a(mo686a().getResources(), "bg", "id", mo686a().getPackageName()) == 0 || a(resources, "icon", "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || j.a(mo686a()) < 9) ? false : true;
    }
}
