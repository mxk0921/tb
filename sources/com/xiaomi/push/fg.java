package com.xiaomi.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.al;
import java.util.Map;
import tb.pg1;
import tb.tck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fg extends fh {

    /* renamed from: a  reason: collision with other field name */
    private PendingIntent f972a;

    /* renamed from: b  reason: collision with other field name */
    private Bitmap f973b;

    /* renamed from: c  reason: collision with other field name */
    private CharSequence f974c;

    /* renamed from: a  reason: collision with root package name */
    private int f14874a = 16777216;
    private int b = 16777216;
    private int c = 16777216;

    public fg(Context context, int i, String str) {
        super(context, i, str);
    }

    private Drawable a(int i, int i2, int i3, float f) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setIntrinsicWidth(i2);
        shapeDrawable.setIntrinsicHeight(i3);
        return shapeDrawable;
    }

    public fg b(String str) {
        if (m689b() && !TextUtils.isEmpty(str)) {
            try {
                this.f14874a = Color.parseColor(str);
            } catch (Exception unused) {
                b.m410a("parse colorful notification bg color error");
            }
        }
        return this;
    }

    public fg c(String str) {
        if (m689b() && !TextUtils.isEmpty(str)) {
            try {
                this.c = Color.parseColor(str);
            } catch (Exception unused) {
                b.m410a("parse colorful notification image text color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.fh
    /* renamed from: a */
    public fg mo678a(Bitmap bitmap) {
        if (m689b() && bitmap != null) {
            if (bitmap.getWidth() != 984 || bitmap.getHeight() < 177 || bitmap.getHeight() > 207) {
                b.m410a("colorful notification bg image resolution error, must [984*177, 984*207]");
            } else {
                this.f973b = bitmap;
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.fh
    public String b() {
        return "notification_colorful_copy";
    }

    public fg a(CharSequence charSequence, PendingIntent pendingIntent) {
        if (m689b()) {
            super.addAction(0, charSequence, pendingIntent);
            this.f974c = charSequence;
            this.f972a = pendingIntent;
        }
        return this;
    }

    @Override // com.xiaomi.push.ff
    public fg a(String str) {
        if (m689b() && !TextUtils.isEmpty(str)) {
            try {
                this.b = Color.parseColor(str);
            } catch (Exception unused) {
                b.m410a("parse colorful notification button bg color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    public String mo686a() {
        return "notification_colorful";
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a  reason: collision with other method in class */
    public void mo686a() {
        RemoteViews a2;
        Bitmap bitmap;
        boolean z;
        RemoteViews a3;
        RemoteViews a4;
        Drawable a5;
        if (m689b()) {
            super.mo686a();
            Resources resources = mo686a().getResources();
            String packageName = mo686a().getPackageName();
            int a6 = a(resources, "icon", "id", packageName);
            if (((fh) this).f975a == null) {
                a(a6);
            } else {
                mo686a().setImageViewBitmap(a6, ((fh) this).f975a);
            }
            int a7 = a(resources, "title", "id", packageName);
            int a8 = a(resources, "content", "id", packageName);
            mo686a().setTextViewText(a7, ((fh) this).f977a);
            mo686a().setTextViewText(a8, ((fh) this).f982b);
            if (!TextUtils.isEmpty(this.f974c)) {
                int a9 = a(resources, "buttonContainer", "id", packageName);
                int a10 = a(resources, pg1.ATOM_EXT_button, "id", packageName);
                int a11 = a(resources, "buttonBg", "id", packageName);
                mo686a().setViewVisibility(a9, 0);
                mo686a().setTextViewText(a10, this.f974c);
                mo686a().setOnClickPendingIntent(a9, this.f972a);
                if (this.b != 16777216) {
                    int a12 = a(70.0f);
                    int a13 = a(29.0f);
                    mo686a().setImageViewBitmap(a11, al.a(a(this.b, a12, a13, a13 / 2.0f)));
                    mo686a().setTextColor(a10, m687a(this.b) ? -1 : -16777216);
                }
            }
            int a14 = a(resources, "bg", "id", packageName);
            int a15 = a(resources, "container", "id", packageName);
            if (this.f14874a != 16777216) {
                if (j.a(mo686a()) >= 10) {
                    a4 = mo686a();
                    a5 = a(this.f14874a, 984, tck.DETECT_WIDTH, 30.0f);
                } else {
                    a4 = mo686a();
                    a5 = a(this.f14874a, 984, tck.DETECT_WIDTH, 0.0f);
                }
                a4.setImageViewBitmap(a14, al.a(a5));
                a3 = mo686a();
                z = m687a(this.f14874a);
            } else if (this.f973b != null) {
                if (j.a(mo686a()) >= 10) {
                    a2 = mo686a();
                    bitmap = a(this.f973b, 30.0f);
                } else {
                    a2 = mo686a();
                    bitmap = this.f973b;
                }
                a2.setImageViewBitmap(a14, bitmap);
                Map<String, String> map = ((fh) this).f980a;
                if (map != null && this.c == 16777216) {
                    c(map.get("notification_image_text_color"));
                }
                int i = this.c;
                z = i == 16777216 || !m687a(i);
                a3 = mo686a();
            } else {
                if (Build.VERSION.SDK_INT >= 24) {
                    mo686a().setViewVisibility(a6, 8);
                    mo686a().setViewVisibility(a14, 8);
                    try {
                        bh.a((Object) this, "setStyle", r.a(mo686a(), "android.app.Notification$DecoratedCustomViewStyle").getConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        b.m410a("load class DecoratedCustomViewStyle failed");
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("miui.customHeight", true);
                addExtras(bundle);
                setCustomContentView(mo686a());
                return;
            }
            a(a3, a15, a7, a8, z);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("miui.customHeight", true);
            addExtras(bundle2);
            setCustomContentView(mo686a());
            return;
        }
        m688b();
    }

    private void a(RemoteViews remoteViews, int i, int i2, int i3, boolean z) {
        int a2 = a(6.0f);
        remoteViews.setViewPadding(i, a2, 0, a2, 0);
        int i4 = z ? -1 : -16777216;
        remoteViews.setTextColor(i2, i4);
        remoteViews.setTextColor(i3, i4);
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    public boolean mo686a() {
        if (!j.m868a()) {
            return false;
        }
        Resources resources = mo686a().getResources();
        String packageName = mo686a().getPackageName();
        return (a(resources, "icon", "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || a(resources, "content", "id", packageName) == 0) ? false : true;
    }
}
