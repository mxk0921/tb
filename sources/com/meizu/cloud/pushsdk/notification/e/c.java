package com.meizu.cloud.pushsdk.notification.e;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.a;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c extends a {
    public c(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public void b(Notification.Builder builder, MessageV3 messageV3) {
        AppIconSetting appIconSetting;
        Bitmap a2;
        String str;
        if ((!MzSystemUtils.isInternational() || MzSystemUtils.isMeizuAndFlyme()) && (appIconSetting = messageV3.getAppIconSetting()) != null) {
            if (appIconSetting.isDefaultLargeIcon()) {
                PushNotificationBuilder pushNotificationBuilder = this.b;
                if (pushNotificationBuilder == null || pushNotificationBuilder.getLargeIcon() == 0) {
                    PushNotificationBuilder pushNotificationBuilder2 = this.b;
                    if (pushNotificationBuilder2 == null || pushNotificationBuilder2.getAppLargeIcon() == null) {
                        a2 = a(this.f5906a, messageV3.getUploadDataPackageName());
                        str = "set largeIcon by package default large icon";
                    } else {
                        a2 = this.b.getAppLargeIcon();
                        str = "set largeIcon by bitmap provided by user setting";
                    }
                } else {
                    a2 = BitmapFactory.decodeResource(this.f5906a.getResources(), this.b.getLargeIcon());
                    str = "set largeIcon by resource id";
                }
                DebugLogger.i("AbstractPushNotification", str);
            } else if (Thread.currentThread() != this.f5906a.getMainLooper().getThread()) {
                Bitmap a3 = a(appIconSetting.getLargeIconUrl());
                if (a3 != null) {
                    DebugLogger.i("AbstractPushNotification", "On other Thread down load largeIcon image success");
                    builder.setLargeIcon(a3);
                    return;
                }
                a2 = a(this.f5906a, messageV3.getUploadDataPackageName());
            } else {
                return;
            }
            builder.setLargeIcon(a2);
        }
    }
}
