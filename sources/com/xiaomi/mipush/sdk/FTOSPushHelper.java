package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FTOSPushHelper {

    /* renamed from: a  reason: collision with root package name */
    private static long f14696a;

    /* renamed from: a  reason: collision with other field name */
    private static volatile boolean f655a;

    private static void a(Context context) {
        AbstractPushManager a2 = f.a(context).a(e.ASSEMBLE_PUSH_FTOS);
        if (a2 != null) {
            b.m410a("ASSEMBLE_PUSH :  register fun touch os when network change!");
            a2.register();
        }
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (getNeedRegister()) {
            long j = f14696a;
            if (j <= 0 || j + 300000 <= elapsedRealtime) {
                f14696a = elapsedRealtime;
                a(context);
            }
        }
    }

    public static boolean getNeedRegister() {
        return f655a;
    }

    public static boolean hasNetwork(Context context) {
        return i.m474a(context);
    }

    public static void setNeedRegister(boolean z) {
        f655a = z;
    }

    public static void uploadToken(Context context, String str) {
        i.m473a(context, e.ASSEMBLE_PUSH_FTOS, str);
    }

    public static void notifyFTOSNotificationClicked(Context context, Map<String, String> map) {
        PushMessageReceiver a2;
        if (map != null && map.containsKey("pushMsg")) {
            String str = map.get("pushMsg");
            if (!TextUtils.isEmpty(str) && (a2 = i.a(context)) != null) {
                MiPushMessage a3 = i.a(str);
                if (!a3.getExtra().containsKey("notify_effect")) {
                    a2.onNotificationMessageClicked(context, a3);
                }
            }
        }
    }
}
