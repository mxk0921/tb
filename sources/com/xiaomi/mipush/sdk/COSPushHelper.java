package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class COSPushHelper {

    /* renamed from: a  reason: collision with root package name */
    private static long f14695a;

    /* renamed from: a  reason: collision with other field name */
    private static volatile boolean f654a;

    public static void convertMessage(Intent intent) {
        i.a(intent);
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (getNeedRegister()) {
            long j = f14695a;
            if (j <= 0 || j + 300000 <= elapsedRealtime) {
                f14695a = elapsedRealtime;
                registerCOSAssemblePush(context);
            }
        }
    }

    public static boolean getNeedRegister() {
        return f654a;
    }

    public static boolean hasNetwork(Context context) {
        return i.m474a(context);
    }

    public static void registerCOSAssemblePush(Context context) {
        AbstractPushManager a2 = f.a(context).a(e.ASSEMBLE_PUSH_COS);
        if (a2 != null) {
            b.m410a("ASSEMBLE_PUSH :  register cos when network change!");
            a2.register();
        }
    }

    public static synchronized void setNeedRegister(boolean z) {
        synchronized (COSPushHelper.class) {
            f654a = z;
        }
    }

    public static void uploadToken(Context context, String str) {
        i.m473a(context, e.ASSEMBLE_PUSH_COS, str);
    }

    public static void onNotificationMessageCome(Context context, String str) {
    }

    public static void onPassThoughMessageCome(Context context, String str) {
    }
}
