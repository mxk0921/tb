package com.meizu.cloud.pushsdk.notification.f;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.g.c;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends c {
    public a(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    private void b(RemoteViews remoteViews, MessageV3 messageV3) {
        Bitmap a2;
        if (messageV3.getNotificationStyle() != null && !a()) {
            if (TextUtils.isEmpty(messageV3.getNotificationStyle().getExpandableImageUrl()) || (a2 = a(messageV3.getNotificationStyle().getExpandableImageUrl())) == null) {
                remoteViews.setViewVisibility(c.b(this.f5906a), 8);
                return;
            }
            remoteViews.setViewVisibility(c.b(this.f5906a), 0);
            remoteViews.setImageViewBitmap(c.b(this.f5906a), a2);
        }
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public void a(Notification notification, MessageV3 messageV3, PendingIntent pendingIntent) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            RemoteViews remoteViews = new RemoteViews(this.f5906a.getPackageName(), c.g(this.f5906a));
            remoteViews.setTextViewText(c.f(this.f5906a), messageV3.getTitle());
            remoteViews.setTextViewText(c.c(this.f5906a), messageV3.getContent());
            remoteViews.setLong(c.d(this.f5906a), pg1.ATOM_EXT_setTime, System.currentTimeMillis());
            a(remoteViews, messageV3);
            b(remoteViews, messageV3);
            notification.bigContentView = remoteViews;
        }
    }
}
