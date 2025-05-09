package com.xiaomi.push.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.bh;
import com.xiaomi.push.g;
import com.xiaomi.push.ip;
import com.xiaomi.push.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.aig;
import tb.e73;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class as {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f15050a = Log.isLoggable("NCHelper", 3);

    private static int a(NotificationChannel notificationChannel) {
        int i = 0;
        try {
            i = ((Integer) bh.b((Object) notificationChannel, "getUserLockedFields", new Object[0])).intValue();
            if (f15050a) {
                a("isUserLockedChannel:" + i + " " + notificationChannel);
            }
        } catch (Exception e) {
            b.m411a("NCHelper", "is user locked error" + e);
        }
        return i;
    }

    private static void b(Context context, String str) {
        if (f15050a) {
            a("recordCopiedChannel:" + str);
        }
        a(context).edit().putBoolean(str, true).apply();
    }

    private static void c(Context context, String str) {
        try {
            aw a2 = aw.a(context, str);
            Set<String> keySet = a(context).getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (String str2 : keySet) {
                if (a2.m1039a(str2)) {
                    arrayList.add(str2);
                    if (f15050a) {
                        a("delete channel copy record:" + str2);
                    }
                }
            }
            a(context, arrayList);
        } catch (Exception unused) {
        }
    }

    private static NotificationChannel a(String str, NotificationChannel notificationChannel) {
        CharSequence name;
        int importance;
        String description;
        boolean shouldVibrate;
        boolean shouldShowLights;
        Uri sound;
        AudioAttributes audioAttributes;
        int lockscreenVisibility;
        e73.a();
        name = notificationChannel.getName();
        importance = notificationChannel.getImportance();
        NotificationChannel a2 = aig.a(str, name, importance);
        description = notificationChannel.getDescription();
        a2.setDescription(description);
        shouldVibrate = notificationChannel.shouldVibrate();
        a2.enableVibration(shouldVibrate);
        shouldShowLights = notificationChannel.shouldShowLights();
        a2.enableLights(shouldShowLights);
        sound = notificationChannel.getSound();
        audioAttributes = notificationChannel.getAudioAttributes();
        a2.setSound(sound, audioAttributes);
        lockscreenVisibility = notificationChannel.getLockscreenVisibility();
        a2.setLockscreenVisibility(lockscreenVisibility);
        return a2;
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("mipush_channel_copy_sp", 0);
    }

    public static String a(aw awVar, String str, CharSequence charSequence, String str2, int i, int i2, String str3, String str4) {
        String a2 = awVar.m1037a(str);
        boolean z = f15050a;
        if (z) {
            a("createChannel: appChannelId:" + a2 + " serverChannelId:" + str + " serverChannelName:" + ((Object) charSequence) + " serverChannelDesc:" + str2 + " serverChannelNotifyType:" + i + " serverChannelName:" + ((Object) charSequence) + " serverChannelImportance:" + i2 + " channelSoundStr:" + str3 + " channelPermissions:" + str4);
        }
        NotificationChannel a3 = aig.a(a2, charSequence, i2);
        a3.setDescription(str2);
        boolean z2 = false;
        a3.enableVibration((i & 2) != 0);
        if ((i & 4) != 0) {
            z2 = true;
        }
        a3.enableLights(z2);
        if ((i & 1) == 0) {
            a3.setSound(null, null);
        } else if (!TextUtils.isEmpty(str3)) {
            if (str3.startsWith("android.resource://" + awVar.m1036a())) {
                a3.setSound(Uri.parse(str3), Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if (z) {
            a("create channel:" + a3);
        }
        a(awVar, a3, str4);
        return a2;
    }

    public static void a(Context context, aw awVar, NotificationChannel notificationChannel, int i, String str) {
        String id;
        String id2;
        int lockscreenVisibility;
        int importance;
        boolean shouldShowLights;
        boolean shouldVibrate;
        Uri sound;
        if (i > 0) {
            int a2 = g.a(context) >= 2 ? f.a(context.getPackageName(), str) : 0;
            id = notificationChannel.getId();
            NotificationChannel a3 = a(id, notificationChannel);
            if ((i & 32) != 0) {
                sound = notificationChannel.getSound();
                if (sound != null) {
                    a3.setSound(null, null);
                } else {
                    a3.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
                }
            }
            if ((i & 16) != 0) {
                shouldVibrate = notificationChannel.shouldVibrate();
                if (shouldVibrate) {
                    a3.enableVibration(false);
                } else {
                    a3.enableVibration(true);
                }
            }
            if ((i & 8) != 0) {
                shouldShowLights = notificationChannel.shouldShowLights();
                if (shouldShowLights) {
                    a3.enableLights(false);
                } else {
                    a3.enableLights(true);
                }
            }
            if ((i & 4) != 0) {
                importance = notificationChannel.getImportance();
                int i2 = importance - 1;
                if (i2 <= 0) {
                    i2 = 2;
                }
                a3.setImportance(i2);
            }
            if ((i & 2) != 0) {
                lockscreenVisibility = notificationChannel.getLockscreenVisibility();
                a3.setLockscreenVisibility(lockscreenVisibility - 1);
            }
            awVar.a(a3);
            awVar.a(notificationChannel, true);
            String a4 = awVar.m1036a();
            id2 = notificationChannel.getId();
            f.a(a4, id2, a2, 0);
            return;
        }
        awVar.a(notificationChannel);
    }

    public static void a(Context context, String str) {
        if (j.m869a(context) && !TextUtils.isEmpty(str)) {
            c(context, str);
            f.a(context, str);
        }
    }

    private static void a(Context context, List<String> list) {
        if (f15050a) {
            a("deleteCopiedChannelRecord:" + list);
        }
        if (!list.isEmpty()) {
            SharedPreferences.Editor edit = a(context).edit();
            for (String str : list) {
                edit.remove(str);
            }
            edit.apply();
        }
    }

    public static void a(ip ipVar) {
        Map<String, String> map;
        if (ipVar != null && (map = ipVar.f1203a) != null && map.containsKey("REMOVE_CHANNEL_MARK")) {
            ipVar.f1199a = 0;
            ipVar.f1203a.remove(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID);
            ipVar.f1203a.remove("channel_importance");
            ipVar.f1203a.remove("channel_name");
            ipVar.f1203a.remove("channel_description");
            ipVar.f1203a.remove("channel_perm");
            b.m410a("delete channel info by:" + ipVar.f1203a.get("REMOVE_CHANNEL_MARK"));
            ipVar.f1203a.remove("REMOVE_CHANNEL_MARK");
        }
    }

    private static void a(aw awVar, NotificationChannel notificationChannel, String str) {
        String id;
        char c;
        int i;
        int importance;
        NotificationChannel notificationChannel2;
        String id2;
        Context a2 = awVar.m1035a();
        id = notificationChannel.getId();
        String a3 = aw.a(id, awVar.m1036a());
        boolean z = f15050a;
        if (z) {
            a("appChannelId:" + id + " oldChannelId:" + a3);
        }
        if (!j.m869a(a2) || TextUtils.equals(id, a3)) {
            NotificationChannel a4 = awVar.m1034a(id);
            if (z) {
                a("elseLogic getNotificationChannel:" + a4);
            }
            if (a4 == null) {
                awVar.a(notificationChannel);
            }
            i = 0;
            c = 0;
        } else {
            NotificationManager notificationManager = (NotificationManager) a2.getSystemService(RemoteMessageConst.NOTIFICATION);
            notificationChannel2 = notificationManager.getNotificationChannel(a3);
            NotificationChannel a5 = awVar.m1034a(id);
            if (z) {
                a("xmsfChannel:" + notificationChannel2);
                a("appChannel:" + a5);
            }
            if (notificationChannel2 != null) {
                NotificationChannel a6 = a(id, notificationChannel2);
                if (z) {
                    a("copyXmsf copyXmsfChannel:" + a6);
                }
                if (a5 != null) {
                    i = a(a5);
                    awVar.a(a6, i == 0);
                    c = 3;
                } else {
                    i = a(notificationChannel2);
                    id2 = notificationChannel2.getId();
                    a(a2, awVar, a6, i, id2);
                    c = 4;
                }
                b(a2, id);
                notificationManager.deleteNotificationChannel(a3);
            } else if (a5 == null) {
                if (z) {
                    a("appHack createNotificationChannel:" + notificationChannel);
                }
                awVar.a(notificationChannel);
                i = 0;
                c = 1;
            } else if (m1026a(a2, id) || !a(notificationChannel, a5)) {
                i = 0;
                c = 0;
            } else {
                if (z) {
                    a("appHack updateNotificationChannel:" + notificationChannel);
                }
                i = a(a5);
                awVar.a(notificationChannel, i == 0);
                c = 2;
            }
        }
        boolean z2 = c == 1 || c == 4 || c == 3;
        Context a7 = awVar.m1035a();
        String a8 = awVar.m1036a();
        importance = notificationChannel.getImportance();
        f.a(a7, a8, id, importance, str, z2, i);
    }

    private static void a(String str) {
        b.m411a("NCHelper", str);
    }

    private static boolean a(NotificationChannel notificationChannel, NotificationChannel notificationChannel2) {
        CharSequence name;
        CharSequence name2;
        String description;
        String description2;
        int importance;
        int importance2;
        boolean shouldVibrate;
        boolean shouldVibrate2;
        boolean shouldShowLights;
        boolean shouldShowLights2;
        Uri sound;
        Uri sound2;
        int importance3;
        int importance4;
        int importance5;
        int importance6;
        boolean z = false;
        if (notificationChannel == null || notificationChannel2 == null) {
            return false;
        }
        name = notificationChannel.getName();
        name2 = notificationChannel2.getName();
        boolean equals = TextUtils.equals(name, name2);
        boolean z2 = true;
        if (!equals) {
            if (f15050a) {
                a("appHack channelConfigLowerCompare:getName");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        description = notificationChannel.getDescription();
        description2 = notificationChannel2.getDescription();
        if (!TextUtils.equals(description, description2)) {
            if (f15050a) {
                a("appHack channelConfigLowerCompare:getDescription");
            }
            z2 = true;
        }
        importance = notificationChannel.getImportance();
        importance2 = notificationChannel2.getImportance();
        if (importance != importance2) {
            importance3 = notificationChannel.getImportance();
            importance4 = notificationChannel2.getImportance();
            notificationChannel.setImportance(Math.min(importance3, importance4));
            if (f15050a) {
                StringBuilder sb = new StringBuilder("appHack channelConfigLowerCompare:getImportance  ");
                importance5 = notificationChannel.getImportance();
                sb.append(importance5);
                sb.append(" ");
                importance6 = notificationChannel2.getImportance();
                sb.append(importance6);
                a(sb.toString());
            }
            z2 = true;
        }
        shouldVibrate = notificationChannel.shouldVibrate();
        shouldVibrate2 = notificationChannel2.shouldVibrate();
        if (shouldVibrate != shouldVibrate2) {
            notificationChannel.enableVibration(false);
            if (f15050a) {
                a("appHack channelConfigLowerCompare:enableVibration");
            }
            z2 = true;
        }
        shouldShowLights = notificationChannel.shouldShowLights();
        shouldShowLights2 = notificationChannel2.shouldShowLights();
        if (shouldShowLights != shouldShowLights2) {
            notificationChannel.enableLights(false);
            if (f15050a) {
                a("appHack channelConfigLowerCompare:enableLights");
            }
            z2 = true;
        }
        sound = notificationChannel.getSound();
        boolean z3 = sound != null;
        sound2 = notificationChannel2.getSound();
        if (sound2 != null) {
            z = true;
        }
        if (z3 != z) {
            notificationChannel.setSound(null, null);
            if (f15050a) {
                a("appHack channelConfigLowerCompare:setSound");
            }
        }
        if (f15050a) {
            a("appHack channelConfigLowerCompare:isDifferent:" + z2);
        }
        return z2;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m1026a(Context context, String str) {
        if (f15050a) {
            a("checkCopeidChannel:newFullChannelId:" + str + "  " + a(context).getBoolean(str, false));
        }
        return a(context).getBoolean(str, false);
    }
}
