package com.meizu.cloud.pushsdk.notification.f;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.a;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c extends a {
    public c(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public void a(Notification notification, MessageV3 messageV3) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            RemoteViews remoteViews = new RemoteViews(this.f5906a.getPackageName(), com.meizu.cloud.pushsdk.notification.g.c.g(this.f5906a));
            remoteViews.setTextViewText(com.meizu.cloud.pushsdk.notification.g.c.f(this.f5906a), messageV3.getTitle());
            remoteViews.setTextViewText(com.meizu.cloud.pushsdk.notification.g.c.c(this.f5906a), messageV3.getContent());
            remoteViews.setLong(com.meizu.cloud.pushsdk.notification.g.c.d(this.f5906a), pg1.ATOM_EXT_setTime, System.currentTimeMillis());
            a(remoteViews, messageV3);
            remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.g.c.b(this.f5906a), 8);
            remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.g.c.a(this.f5906a), 8);
            notification.contentView = remoteViews;
        }
    }

    public void a(RemoteViews remoteViews, MessageV3 messageV3) {
        Bitmap a2;
        if (messageV3.getAppIconSetting() == null || a() || messageV3.getAppIconSetting().isDefaultLargeIcon() || (a2 = a(messageV3.getAppIconSetting().getLargeIconUrl())) == null) {
            remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.g.c.e(this.f5906a), a(this.f5906a, messageV3.getUploadDataPackageName()));
        } else {
            remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.g.c.e(this.f5906a), a2);
        }
    }
}
