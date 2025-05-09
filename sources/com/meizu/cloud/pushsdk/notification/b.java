package com.meizu.cloud.pushsdk.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.f.c;
import com.meizu.cloud.pushsdk.notification.model.styleenum.InnerStyleLayout;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b extends c {
    public b(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public void a(Notification notification, MessageV3 messageV3, PendingIntent pendingIntent) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            Bitmap a2 = a(messageV3.getNotificationStyle().getBannerImageUrl());
            if (!a() && a2 != null) {
                RemoteViews remoteViews = new RemoteViews(this.f5906a.getPackageName(), com.meizu.cloud.pushsdk.notification.g.c.l(this.f5906a));
                remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.g.c.i(this.f5906a), a2);
                remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.g.c.j(this.f5906a), 8);
                remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.g.c.i(this.f5906a), 0);
                notification.contentView = remoteViews;
                if (messageV3.getNotificationStyle().getInnerStyle() == InnerStyleLayout.EXPANDABLE_PIC.getCode()) {
                    Bitmap a3 = a(messageV3.getNotificationStyle().getExpandableImageUrl());
                    if (!a() && a3 != null) {
                        RemoteViews remoteViews2 = new RemoteViews(this.f5906a.getPackageName(), com.meizu.cloud.pushsdk.notification.g.c.l(this.f5906a));
                        remoteViews2.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.g.c.j(this.f5906a), a3);
                        remoteViews2.setViewVisibility(com.meizu.cloud.pushsdk.notification.g.c.j(this.f5906a), 0);
                        remoteViews2.setViewVisibility(com.meizu.cloud.pushsdk.notification.g.c.i(this.f5906a), 8);
                        notification.bigContentView = remoteViews2;
                        if (messageV3.getAdvertisementOption() != null && !TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdInstallPackage())) {
                            remoteViews2.setViewVisibility(com.meizu.cloud.pushsdk.notification.g.c.k(this.f5906a), 0);
                            remoteViews2.setOnClickPendingIntent(com.meizu.cloud.pushsdk.notification.g.c.k(this.f5906a), pendingIntent);
                        }
                    }
                }
            }
        }
    }
}
