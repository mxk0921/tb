package com.huawei.hms.push;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.push.TransActivity;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import tb.aig;
import tb.e73;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static int f5446a;

    public static synchronized void a(Context context, o oVar) {
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (n.class) {
            if (context != null) {
                try {
                    if (!a(oVar)) {
                        HMSLog.d("PushSelfShowLog", "showNotification, the msg id = " + oVar.o());
                        if (f5446a == 0) {
                            f5446a = (context.getPackageName() + System.currentTimeMillis()).hashCode();
                        }
                        if (TextUtils.isEmpty(oVar.k())) {
                            String p = oVar.p();
                            if (!TextUtils.isEmpty(p)) {
                                int hashCode = p.hashCode();
                                oVar.a(hashCode);
                                HMSLog.d("PushSelfShowLog", "notification msgTag = " + hashCode);
                            }
                            if (oVar.r() != -1) {
                                i4 = oVar.r();
                                i3 = (oVar.j() + System.currentTimeMillis()).hashCode();
                                i2 = i3 + 1;
                                i = (oVar.r() + oVar.j() + context.getPackageName()).hashCode();
                            } else {
                                int i5 = f5446a;
                                i4 = i5 + 1;
                                i3 = i5 + 2;
                                i2 = i5 + 3;
                                int i6 = i5 + 4;
                                f5446a = i6;
                                i = i6;
                            }
                        } else {
                            i4 = (oVar.k() + oVar.j()).hashCode();
                            int i7 = f5446a;
                            i3 = i7 + 1;
                            int i8 = i7 + 2;
                            f5446a = i8;
                            i = (oVar.k() + oVar.j() + context.getPackageName()).hashCode();
                            i2 = i8;
                        }
                        HMSLog.d("PushSelfShowLog", "notifyId:" + i4 + ",openNotifyId:" + i3 + ",delNotifyId:" + i2 + ",alarmNotifyId:" + i);
                        if (oVar.e() <= 0) {
                            i = 0;
                        }
                        Notification a2 = e.d() ? a(context, oVar, new int[]{i4, i3, i2, i}) : null;
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
                        if (!(notificationManager == null || a2 == null)) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                String string = context.getString(ResourceLoaderUtil.getStringId("hms_push_channel"));
                                e73.a();
                                notificationManager.createNotificationChannel(aig.a("HwPushChannelID", string, 3));
                            }
                            notificationManager.notify(i4, a2);
                            l.a(context, oVar.o(), oVar.b(), "100");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static PendingIntent b(Context context, o oVar, int[] iArr) {
        return ya.e(context, iArr[2], a(context, oVar, iArr, "2", 268435456), e.a());
    }

    private static PendingIntent c(Context context, o oVar, int[] iArr) {
        Intent a2 = a(context, oVar, iArr, "1", 268435456);
        if (!a()) {
            return ya.e(context, iArr[1], a2, e.a());
        }
        a2.setClass(context, TransActivity.class);
        a2.setFlags(268468224);
        return ya.c(context, iArr[1], a2, e.a());
    }

    private static void d(o oVar, Notification.Builder builder) {
        String t = oVar.t();
        String i = oVar.i();
        if (TextUtils.isEmpty(i)) {
            builder.setContentText(t);
            return;
        }
        builder.setContentText(i);
        if (!TextUtils.isEmpty(t)) {
            builder.setContentTitle(t);
        }
    }

    private static void b(Context context, Notification.Builder builder, o oVar) {
        if ("com.huawei.android.pushagent".equals(context.getPackageName())) {
            Bundle bundle = new Bundle();
            String j = oVar.j();
            if (!TextUtils.isEmpty(j)) {
                bundle.putString("hw_origin_sender_package_name", j);
                builder.setExtras(bundle);
            }
        }
    }

    private static void c(o oVar, Notification.Builder builder) {
        builder.setTicker(oVar.w());
    }

    private static void b(o oVar, Notification.Builder builder) {
        String s = oVar.s();
        if (!TextUtils.isEmpty(s)) {
            builder.setSubText(s);
        }
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static Intent a(Context context, o oVar, int[] iArr, String str, int i) {
        Intent intent = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
        intent.putExtra("selfshow_info", oVar.n()).putExtra("selfshow_token", oVar.x()).putExtra("selfshow_event_id", str).putExtra("selfshow_notify_id", iArr[0]).putExtra("selfshow_auto_clear_id", iArr[3]).setPackage(context.getPackageName()).setFlags(i);
        return intent;
    }

    private static Notification a(Context context, o oVar, int[] iArr) {
        Notification.Builder builder = new Notification.Builder(context);
        if (j.a(oVar) == k.STYLE_BIGTEXT) {
            j.a(builder, oVar.f(), oVar);
        }
        h.a(context, builder, oVar);
        b(oVar, builder);
        d(oVar, builder);
        a(context, oVar, builder);
        a(builder);
        a(oVar, builder);
        c(oVar, builder);
        builder.setContentIntent(c(context, oVar, iArr));
        builder.setDeleteIntent(b(context, oVar, iArr));
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId("HwPushChannelID");
        }
        b(context, builder, oVar);
        a(context, builder, oVar);
        return builder.build();
    }

    private static void a(Context context, Notification.Builder builder, o oVar) {
        if (HwBuildEx.VERSION.EMUI_SDK_INT >= 11 && e.a(context)) {
            Bundle bundle = new Bundle();
            String j = oVar.j();
            HMSLog.i("PushSelfShowLog", "the package name of notification is:" + j);
            if (!TextUtils.isEmpty(j)) {
                String a2 = e.a(context, j);
                HMSLog.i("PushSelfShowLog", "the app name is:" + a2);
                if (a2 != null) {
                    bundle.putCharSequence("android.extraAppName", a2);
                }
            }
            builder.setExtras(bundle);
        }
    }

    private static void a(Context context, o oVar, Notification.Builder builder) {
        Bitmap a2 = h.a(context, oVar);
        if (a2 != null) {
            builder.setLargeIcon(a2);
        }
    }

    private static void a(Notification.Builder builder) {
        builder.setShowWhen(true);
        builder.setWhen(System.currentTimeMillis());
    }

    private static void a(o oVar, Notification.Builder builder) {
        boolean z = true;
        if (oVar.d() != 1) {
            z = false;
        }
        builder.setAutoCancel(z);
        builder.setOngoing(false);
    }

    private static boolean a(o oVar) {
        return oVar == null || (TextUtils.isEmpty(oVar.t()) && TextUtils.isEmpty(oVar.i()));
    }
}
