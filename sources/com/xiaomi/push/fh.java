package com.xiaomi.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.al;
import com.xiaomi.push.service.aw;
import com.xiaomi.push.service.ax;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class fh extends ff {

    /* renamed from: a  reason: collision with root package name */
    private int f14875a;

    /* renamed from: a  reason: collision with other field name */
    protected Bitmap f975a;

    /* renamed from: a  reason: collision with other field name */
    private RemoteViews f976a;

    /* renamed from: a  reason: collision with other field name */
    protected CharSequence f977a;

    /* renamed from: a  reason: collision with other field name */
    private String f978a;

    /* renamed from: a  reason: collision with other field name */
    private ArrayList<Notification.Action> f979a;

    /* renamed from: a  reason: collision with other field name */
    protected Map<String, String> f980a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f981a;
    private int b;

    /* renamed from: b  reason: collision with other field name */
    protected CharSequence f982b;

    /* renamed from: b  reason: collision with other field name */
    private boolean f983b;

    public fh(Context context, int i, String str) {
        super(context);
        this.f979a = new ArrayList<>();
        this.b = 0;
        this.f978a = str;
        this.f14875a = i;
        m682c();
    }

    private String c() {
        boolean e = e();
        this.f983b = e;
        return e ? b() : mo686a();
    }

    private void d() {
        super.setContentTitle(this.f977a);
        super.setContentText(this.f982b);
    }

    private boolean e() {
        if (!m684d() || !f()) {
            return false;
        }
        return true;
    }

    private boolean f() {
        List<StatusBarNotification> b = aw.a(mo686a(), this.f978a).m1040b();
        if (b != null && !b.isEmpty()) {
            for (StatusBarNotification statusBarNotification : b) {
                if (statusBarNotification.getId() == this.f14875a) {
                    Notification notification = statusBarNotification.getNotification();
                    if (notification == null) {
                        return false;
                    }
                    return !notification.extras.getBoolean("mipush.customCopyLayout", true);
                }
            }
        }
        return false;
    }

    public int a(float f) {
        return (int) ((f * mo686a().getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a  reason: collision with other method in class */
    public abstract String mo686a();

    @Override // com.xiaomi.push.ff
    /* renamed from: a  reason: collision with other method in class */
    public abstract boolean mo686a();

    /* renamed from: b */
    public fh setContentText(CharSequence charSequence) {
        this.f982b = charSequence;
        return this;
    }

    public abstract String b();

    public fh(Context context, String str) {
        this(context, 0, str);
    }

    private Bitmap a() {
        return al.a(g.m701a(mo686a(), this.f978a));
    }

    /* renamed from: c  reason: collision with other method in class */
    private void m682c() {
        int a2 = a(mo686a().getResources(), c(), "layout", mo686a().getPackageName());
        if (a2 != 0) {
            this.f976a = new RemoteViews(mo686a().getPackageName(), a2);
            this.f981a = mo686a();
            return;
        }
        b.m410a("create RemoteViews failed, no such layout resource was found");
    }

    /* renamed from: d  reason: collision with other method in class */
    private boolean m684d() {
        return !TextUtils.isEmpty(b()) && !TextUtils.isEmpty(this.f978a);
    }

    /* renamed from: b  reason: collision with other method in class */
    public final void m688b() {
        super.setContentTitle(this.f977a);
        super.setContentText(this.f982b);
        Bitmap bitmap = this.f975a;
        if (bitmap != null) {
            super.setLargeIcon(bitmap);
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    private boolean m683c() {
        Map<String, String> map = this.f980a;
        return map != null && Boolean.parseBoolean(map.get("custom_builder_set_title"));
    }

    public Bitmap a(Bitmap bitmap, float f) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawRoundRect(new RectF(rect), f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: b  reason: collision with other method in class */
    public final boolean m689b() {
        return this.f981a;
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    public final RemoteViews mo686a() {
        return this.f976a;
    }

    @Override // com.xiaomi.push.ff
    public ff a(Map<String, String> map) {
        this.f980a = map;
        return this;
    }

    /* renamed from: a */
    public fh addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        addAction(new Notification.Action(i, charSequence, pendingIntent));
        return this;
    }

    /* renamed from: a */
    public fh addAction(Notification.Action action) {
        if (action != null) {
            this.f979a.add(action);
        }
        int i = this.b;
        this.b = i + 1;
        a(i, action);
        return this;
    }

    /* renamed from: a */
    public fh setLargeIcon(Bitmap bitmap) {
        this.f975a = bitmap;
        return this;
    }

    /* renamed from: a */
    public fh setContentTitle(CharSequence charSequence) {
        this.f977a = charSequence;
        return this;
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    public void mo686a() {
        super.a();
        Bundle bundle = new Bundle();
        if (m684d()) {
            bundle.putBoolean("mipush.customCopyLayout", this.f983b);
        } else {
            bundle.putBoolean("mipush.customCopyLayout", false);
        }
        bundle.putBoolean("miui.customHeight", false);
        bundle.putBoolean("mipush.customNotification", true);
        bundle.putInt("mipush.customLargeIconId", a("large_icon"));
        if (this.f979a.size() > 0) {
            Notification.Action[] actionArr = new Notification.Action[this.f979a.size()];
            this.f979a.toArray(actionArr);
            bundle.putParcelableArray("mipush.customActions", actionArr);
        }
        if (m683c() || !ax.m1042a(mo686a().getContentResolver())) {
            d();
        } else {
            bundle.putCharSequence("mipush.customTitle", this.f977a);
            bundle.putCharSequence("mipush.customContent", this.f982b);
        }
        addExtras(bundle);
    }

    public void a(int i) {
        Bitmap a2 = a();
        if (a2 != null) {
            mo686a().setImageViewBitmap(i, a2);
            return;
        }
        int b = g.b(mo686a(), this.f978a);
        if (b != 0) {
            mo686a().setImageViewResource(i, b);
        }
    }

    public void a(int i, Notification.Action action) {
    }

    /* renamed from: a  reason: collision with other method in class */
    public final boolean m687a(int i) {
        return ((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d) < 192.0d;
    }
}
