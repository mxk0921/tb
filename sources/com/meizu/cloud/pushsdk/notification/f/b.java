package com.meizu.cloud.pushsdk.notification.f;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.g.c;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b extends c {
    public b(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public void a(Notification notification, MessageV3 messageV3, PendingIntent pendingIntent) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            RemoteViews remoteViews = new RemoteViews(this.f5906a.getPackageName(), c.h(this.f5906a));
            remoteViews.setTextViewText(c.f(this.f5906a), messageV3.getTitle());
            remoteViews.setLong(c.d(this.f5906a), pg1.ATOM_EXT_setTime, System.currentTimeMillis());
            a(remoteViews, messageV3);
            if (messageV3.getNotificationStyle() != null && !TextUtils.isEmpty(messageV3.getNotificationStyle().getExpandableText())) {
                remoteViews.setViewVisibility(c.a(this.f5906a), 0);
                remoteViews.setTextViewText(c.a(this.f5906a), messageV3.getNotificationStyle().getExpandableText());
            }
            notification.bigContentView = remoteViews;
        }
    }
}
