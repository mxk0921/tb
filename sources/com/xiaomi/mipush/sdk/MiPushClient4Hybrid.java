package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.bm;
import com.xiaomi.push.fn;
import com.xiaomi.push.g;
import com.xiaomi.push.i;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.iq;
import com.xiaomi.push.is;
import com.xiaomi.push.j;
import com.xiaomi.push.jb;
import com.xiaomi.push.jc;
import com.xiaomi.push.jd;
import com.xiaomi.push.ji;
import com.xiaomi.push.jj;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.al;
import com.xiaomi.push.service.bc;
import com.xiaomi.push.service.bs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MiPushClient4Hybrid {
    private static MiPushCallback sCallback;
    private static Map<String, b.a> dataMap = new HashMap();
    private static Map<String, Long> sRegisterTimeMap = new HashMap();

    private static void addPullNotificationTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putLong("last_pull_notification_" + str, System.currentTimeMillis()).commit();
    }

    private static short getDeviceStatus(MiPushMessage miPushMessage, boolean z) {
        String str;
        int i;
        if (miPushMessage.getExtra() == null) {
            str = "";
        } else {
            str = miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
        }
        if (!TextUtils.isEmpty(str)) {
            i = Integer.valueOf(str).intValue();
        } else {
            i = 0;
        }
        if (!z) {
            i = (i & (-4)) + g.b.NOT_ALLOWED.a();
        }
        return (short) i;
    }

    public static boolean isRegistered(Context context, String str) {
        if (b.m452a(context).a(str) != null) {
            return true;
        }
        return false;
    }

    public static void onReceiveRegisterResult(Context context, jd jdVar) {
        ArrayList arrayList;
        b.a aVar;
        String c = jdVar.c();
        if (jdVar.a() == 0 && (aVar = dataMap.get(c)) != null) {
            aVar.a(jdVar.f1364e, jdVar.f1365f);
            b.m452a(context).a(c, aVar);
        }
        if (!TextUtils.isEmpty(jdVar.f1364e)) {
            arrayList = new ArrayList();
            arrayList.add(jdVar.f1364e);
        } else {
            arrayList = null;
        }
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(fn.COMMAND_REGISTER.f992a, arrayList, jdVar.f1352a, jdVar.f1363d, null, null);
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveRegisterResult(c, generateCommandMessage);
        }
    }

    public static void onReceiveUnregisterResult(Context context, jj jjVar) {
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(fn.COMMAND_UNREGISTER.f992a, null, jjVar.f1430a, jjVar.f1438d, null, null);
        String a2 = jjVar.a();
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveUnregisterResult(a2, generateCommandMessage);
        }
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        long j;
        if (b.m452a(context).m457a(str2, str3, str)) {
            ArrayList arrayList = new ArrayList();
            b.a a2 = b.m452a(context).a(str);
            if (a2 != null) {
                arrayList.add(a2.c);
                MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(fn.COMMAND_REGISTER.f992a, arrayList, 0L, null, null, null);
                MiPushCallback miPushCallback = sCallback;
                if (miPushCallback != null) {
                    miPushCallback.onReceiveRegisterResult(str, generateCommandMessage);
                }
            }
            if (shouldPullNotification(context, str)) {
                jb jbVar = new jb();
                jbVar.b(str2);
                jbVar.c(im.PullOfflineMessage.f1168a);
                jbVar.a(bc.a());
                jbVar.a(false);
                ao.a(context).a(jbVar, ic.Notification, false, true, null, false, str, str2);
                com.xiaomi.channel.commonutils.logger.b.b("MiPushClient4Hybrid pull offline pass through message");
                addPullNotificationTime(context, str);
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (sRegisterTimeMap.get(str) != null) {
            j = sRegisterTimeMap.get(str).longValue();
        } else {
            j = 0;
        }
        if (Math.abs(currentTimeMillis - j) < 5000) {
            com.xiaomi.channel.commonutils.logger.b.m410a("MiPushClient4Hybrid  Could not send register message within 5s repeatedly.");
            return;
        }
        sRegisterTimeMap.put(str, Long.valueOf(currentTimeMillis));
        String a3 = bm.a(6);
        b.a aVar = new b.a(context);
        aVar.c(str2, str3, a3);
        dataMap.put(str, aVar);
        jc jcVar = new jc();
        jcVar.a(bc.a());
        jcVar.b(str2);
        jcVar.e(str3);
        jcVar.d(str);
        jcVar.f(a3);
        jcVar.c(g.m702a(context, context.getPackageName()));
        jcVar.b(g.a(context, context.getPackageName()));
        jcVar.h(BuildConfig.VERSION_NAME);
        jcVar.a(BuildConfig.VERSION_CODE);
        jcVar.a(iq.Init);
        if (!j.m874d()) {
            String d = i.d(context);
            if (!TextUtils.isEmpty(d)) {
                jcVar.i(bm.a(d));
            }
        }
        int a4 = i.a();
        if (a4 >= 0) {
            jcVar.c(a4);
        }
        jb jbVar2 = new jb();
        jbVar2.c(im.HybridRegister.f1168a);
        jbVar2.b(b.m452a(context).m453a());
        jbVar2.d(context.getPackageName());
        jbVar2.a(jm.a(jcVar));
        jbVar2.a(bc.a());
        ao.a(context).a((ao) jbVar2, ic.Notification, (ip) null);
    }

    public static void removeDuplicateCache(Context context, MiPushMessage miPushMessage) {
        String str;
        if (miPushMessage.getExtra() != null) {
            str = miPushMessage.getExtra().get("jobkey");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = miPushMessage.getMessageId();
        }
        am.a(context, str);
    }

    public static void reportMessageArrived(Context context, MiPushMessage miPushMessage, boolean z) {
        if (miPushMessage == null || miPushMessage.getExtra() == null) {
            com.xiaomi.channel.commonutils.logger.b.m410a("do not ack message, message is null");
            return;
        }
        try {
            is isVar = new is();
            isVar.b(b.m452a(context).m453a());
            isVar.a(miPushMessage.getMessageId());
            isVar.a(Long.valueOf(miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS)).longValue());
            isVar.a(getDeviceStatus(miPushMessage, z));
            if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
                isVar.c(miPushMessage.getTopic());
            }
            ao.a(context).a((ao) isVar, ic.AckMessage, false, bs.a(PushMessageHelper.generateMessage(miPushMessage)));
            com.xiaomi.channel.commonutils.logger.b.b("MiPushClient4Hybrid ack mina message, messageId is " + miPushMessage.getMessageId());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        MiPushClient.reportMessageClicked(context, miPushMessage);
    }

    public static void setCallback(MiPushCallback miPushCallback) {
        sCallback = miPushCallback;
    }

    private static boolean shouldPullNotification(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        if (Math.abs(System.currentTimeMillis() - sharedPreferences.getLong("last_pull_notification_" + str, -1L)) > 300000) {
            return true;
        }
        return false;
    }

    public static void unregisterPush(Context context, String str) {
        sRegisterTimeMap.remove(str);
        b.a a2 = b.m452a(context).a(str);
        if (a2 != null) {
            ji jiVar = new ji();
            jiVar.a(bc.a());
            jiVar.d(str);
            jiVar.b(a2.f698a);
            jiVar.c(a2.c);
            jiVar.e(a2.b);
            jb jbVar = new jb();
            jbVar.c(im.HybridUnregister.f1168a);
            jbVar.b(b.m452a(context).m453a());
            jbVar.d(context.getPackageName());
            jbVar.a(jm.a(jiVar));
            jbVar.a(bc.a());
            ao.a(context).a((ao) jbVar, ic.Notification, (ip) null);
            b.m452a(context).b(str);
        }
    }

    public static void uploadClearMessageData(Context context, LinkedList<? extends Object> linkedList) {
        al.a(context, linkedList);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class MiPushCallback {
        public void onCommandResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveRegisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveUnregisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }
    }
}
