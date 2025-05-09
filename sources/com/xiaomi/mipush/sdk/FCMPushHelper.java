package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ic;
import com.xiaomi.push.iy;
import com.xiaomi.push.j;
import com.xiaomi.push.jf;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.z;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FCMPushHelper {
    private static Map<String, String> a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("actionType", String.valueOf(ic.AckMessage.a()));
        hashMap.put("deviceStatus", String.valueOf((int) jm.a(context, context.getPackageName())));
        hashMap.put("mat", Long.toString(System.currentTimeMillis()));
        return hashMap;
    }

    private static boolean b(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getBoolean("is_xmsf_sup_decrypt", false);
    }

    public static void clearToken(Context context) {
        i.m472a(context, e.ASSEMBLE_PUSH_FCM);
    }

    public static void convertMessage(Intent intent) {
        i.a(intent);
    }

    public static boolean isFCMSwitchOpen(Context context) {
        if (!i.m475a(context, e.ASSEMBLE_PUSH_FCM) || !MiPushClient.getOpenFCMPush(context)) {
            return false;
        }
        return true;
    }

    public static void notifyFCMNotificationCome(Context context, Map<String, String> map) {
        PushMessageReceiver a2;
        String str = map.get("pushMsg");
        if (!TextUtils.isEmpty(str) && (a2 = i.a(context)) != null) {
            a2.onNotificationMessageArrived(context, i.a(str));
        }
    }

    public static Map<String, String> notifyFCMPassThoughMessageCome(Context context, Map<String, String> map) {
        PushMessageReceiver a2;
        String str = map.get("pushMsg");
        if (!TextUtils.isEmpty(str) && (a2 = i.a(context)) != null) {
            a2.onReceivePassThroughMessage(context, i.a(str));
        }
        String str2 = map.get("mipushContainer");
        if (TextUtils.isEmpty(str2)) {
            return new HashMap();
        }
        try {
            byte[] decode = Base64.decode(str2, 2);
            a(context, z.a(decode));
            a(context, decode);
        } catch (Throwable th) {
            b.a("fcm notify notification error ", th);
        }
        return a(context);
    }

    public static void persistIfXmsfSupDecrypt(Context context) {
        boolean z = false;
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        if (j.b(context) >= 50002000) {
            z = true;
        }
        edit.putBoolean("is_xmsf_sup_decrypt", z).apply();
    }

    public static void reportFCMMessageDelete() {
        MiTinyDataClient.upload(i.c(e.ASSEMBLE_PUSH_FCM), "fcm", 1L, "some fcm messages was deleted ");
    }

    public static void uploadToken(Context context, String str) {
        i.m473a(context, e.ASSEMBLE_PUSH_FCM, str);
    }

    private static void a(Context context, iy iyVar) {
        try {
            MiPushMessage generateMessage = PushMessageHelper.generateMessage((jf) ai.a(context, iyVar), iyVar.m853a(), false);
            PushMessageReceiver a2 = i.a(context);
            if (a2 != null) {
                a2.onNotificationMessageArrived(context, generateMessage);
            }
        } catch (Throwable th) {
            b.a("fcm broadcast notification come error ", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(android.content.Context r6, byte[] r7) {
        /*
            com.xiaomi.mipush.sdk.ao r0 = com.xiaomi.mipush.sdk.ao.a(r6)
            boolean r0 = r0.m445a()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r2 = "com.xiaomi.xmsf"
            boolean r1 = r2.equals(r1)
            r3 = r1 ^ 1
            boolean r4 = m425a(r6)
            r5 = 0
            if (r0 == 0) goto L_0x0069
            if (r1 != 0) goto L_0x0069
            if (r4 == 0) goto L_0x0069
            com.xiaomi.mipush.sdk.b r0 = com.xiaomi.mipush.sdk.b.m452a(r6)
            java.lang.String r0 = r0.d()
            byte[] r7 = com.xiaomi.push.service.o.a(r7, r0)
            if (r7 != 0) goto L_0x0033
            java.lang.String r0 = "fcm message encrypt failed"
        L_0x002f:
            com.xiaomi.channel.commonutils.logger.b.m410a(r0)
            goto L_0x0089
        L_0x0033:
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r7, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0041
            java.lang.String r0 = "fcm message buf base64 encode failed"
            goto L_0x002f
        L_0x0041:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = com.xiaomi.push.service.bj.n
            r1.<init>(r3)
            r1.setPackage(r2)
            java.lang.String r3 = "com.xiaomi.push.service.XMPushService"
            r1.setClassName(r2, r3)
            java.lang.String r2 = "ext_fcm_container_buffer"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "mipush_app_package"
            java.lang.String r2 = r6.getPackageName()
            r1.putExtra(r0, r2)
            r6.startService(r1)
            java.lang.String r0 = "fcm message reroute to xmsf"
            com.xiaomi.channel.commonutils.logger.b.m410a(r0)
            r5 = 1
            goto L_0x0089
        L_0x0069:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "xmsf can not receive fcm msg - shouldUseMIUIPush="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ";isNotXmsf="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ";xmsfSupport="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            goto L_0x002f
        L_0x0089:
            if (r5 != 0) goto L_0x0097
            java.lang.String r0 = "fcm message post local"
            com.xiaomi.channel.commonutils.logger.b.b(r0)
            com.xiaomi.push.iy r0 = com.xiaomi.push.service.z.a(r7)
            com.xiaomi.push.service.al.m1015a(r6, r0, r7)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.FCMPushHelper.a(android.content.Context, byte[]):void");
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m425a(Context context) {
        return ((long) j.b(context)) >= 50002000 && b(context);
    }
}
