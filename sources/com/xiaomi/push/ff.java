package com.xiaomi.push;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.xiaomi.channel.commonutils.logger.b;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ff extends Notification.Builder {

    /* renamed from: a  reason: collision with root package name */
    private Context f14873a;

    public ff(Context context) {
        super(context);
        this.f14873a = context;
    }

    public int a(Resources resources, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            return resources.getIdentifier(str, str2, str3);
        }
        return 0;
    }

    @Override // android.app.Notification.Builder
    public Notification build() {
        a();
        return super.build();
    }

    public final int a(String str) {
        return a(mo686a().getResources(), str, "id", mo686a().getPackageName());
    }

    /* renamed from: a */
    public Context mo686a() {
        return this.f14873a;
    }

    /* renamed from: a */
    public ff addExtras(Bundle bundle) {
        super.addExtras(bundle);
        return this;
    }

    /* renamed from: a */
    public ff setCustomContentView(RemoteViews remoteViews) {
        if (Build.VERSION.SDK_INT >= 24) {
            super.setCustomContentView(remoteViews);
        } else {
            super.setContent(remoteViews);
        }
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ff m680a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                bh.a((Object) this, "setColor", Integer.valueOf(Color.parseColor(str)));
            } catch (Exception e) {
                b.d("fail to set color. " + e);
            }
        }
        return this;
    }

    public ff a(Map<String, String> map) {
        return this;
    }

    public void a() {
    }
}
