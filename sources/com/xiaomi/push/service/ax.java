package com.xiaomi.push.service;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.bh;
import com.xiaomi.push.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ax {

    /* renamed from: a  reason: collision with other field name */
    private static final String[] f1571a = {"com.mi.globalbrowser", "com.android.browser"};

    /* renamed from: a  reason: collision with other field name */
    private static String f1570a = null;

    /* renamed from: a  reason: collision with root package name */
    public static final a<String, String, String> f15058a = new a<>("setSound", "canSound", "canSound");
    public static final a<String, String, String> b = new a<>("setVibrate", "canVibrate", "canVibrate");
    public static final a<String, String, String> c = new a<>("setLights", "canLights", "canLights");
    public static final a<String, String, String> d = new a<>("setShowOnKeyguard", "canShowOnKeyguard", "canShowOnKeyguard");
    public static final a<String, String, String> e = new a<>("setFloat", "canFloat", "canShowFloat");
    public static final a<String, String, String> f = new a<>("setShowBadge", "canShowBadge", "canShowBadge");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a<F, S, T> {

        /* renamed from: a  reason: collision with root package name */
        F f15059a;
        S b;
        T c;

        private a(F f, S s, T t) {
            this.f15059a = f;
            this.b = s;
            this.c = t;
        }
    }

    public static int a(ContentResolver contentResolver) {
        try {
            return Settings.Global.getInt(contentResolver, "user_aggregate", 0);
        } catch (Exception e2) {
            b.m410a("get user aggregate failed, " + e2);
            return 0;
        }
    }

    public static String b(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TEXT);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customContent");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static String c(Notification notification) {
        Object a2;
        String str = null;
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                str = bundle.getString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE);
            }
            if (!TextUtils.isEmpty(str) || (a2 = bh.a(notification, "extraNotification")) == null) {
                return str;
            }
            return (String) bh.a(a2, "getTargetPkg", new Object[0]);
        } catch (Exception unused) {
            return str;
        }
    }

    public static int a(Context context, String str) {
        return g.b(context, str);
    }

    public static void b(Notification notification, boolean z) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableKeyguard", z);
            }
            Object a2 = bh.a(notification, "extraNotification");
            if (a2 != null) {
                bh.a(a2, "setEnableKeyguard", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
        }
    }

    public static int a(Context context, String str, String str2, a<String, String, String> aVar) {
        if (aVar == null) {
            return -1;
        }
        try {
            Bundle a2 = a(context, aVar.b, str, str2, (Bundle) null);
            if (a2 == null || !a2.containsKey(aVar.c)) {
                return -1;
            }
            return a2.getBoolean(aVar.c) ? 1 : 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    private static Bundle a(Context context, String str, String str2, String str3, Bundle bundle) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("call notification provider failed!");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("package", str2);
        if (!TextUtils.isEmpty(str3)) {
            bundle2.putString(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, str3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return context.getContentResolver().call(Uri.parse("content://statusbar.notification"), str, (String) null, bundle2);
    }

    public static <T> T a(Notification notification, String str) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return null;
        }
        try {
            return (T) bundle.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T a(Object obj, String str, T t) {
        T t2 = null;
        try {
            if (obj instanceof Notification) {
                t2 = (T) a((Notification) obj, str);
            } else if (obj instanceof Map) {
                t2 = (T) ((Map) obj).get(str);
            } else if (obj instanceof Bundle) {
                t2 = (T) ((Bundle) obj).get(str);
            } else {
                b.m410a("not support get value from classType:" + obj);
            }
        } catch (Exception e2) {
            b.m410a("get value error " + e2);
        }
        return t2 == null ? t : t2;
    }

    public static String a(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customTitle");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static String a(Object obj) {
        return (String) a(obj, "msg_busi_type", "");
    }

    public static void a(Notification notification, int i) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putInt("miui.messageCount", i);
            }
            Object a2 = bh.a(notification, "extraNotification");
            if (a2 != null) {
                bh.a(a2, "setMessageCount", Integer.valueOf(i));
            }
        } catch (Exception unused) {
        }
    }

    public static void a(Notification notification, int i, int i2) {
        if (notification != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            notification.extras.putInt("is_priority", i);
            notification.extras.putInt("mipush_class", i2);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1041a(Notification notification, String str) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, str);
            }
            Object a2 = bh.a(notification, "extraNotification");
            if (a2 != null) {
                bh.a(a2, "setTargetPkg", str);
            }
        } catch (Exception unused) {
        }
    }

    public static void a(Notification notification, boolean z) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableFloat", z);
            }
            Object a2 = bh.a(notification, "extraNotification");
            if (a2 != null) {
                bh.a(a2, "setEnableFloat", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, String str, Intent intent) {
        if (intent != null) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
            arrayList.addAll(Arrays.asList(f1571a));
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) arrayList.get(i);
                if (!TextUtils.isEmpty(str2)) {
                    Intent intent2 = new Intent(intent);
                    intent2.setPackage(str2);
                    try {
                        if (context.getPackageManager().resolveActivity(intent2, 65536) != null) {
                            intent.setPackage(str2);
                            break;
                        }
                        continue;
                    } catch (Exception e2) {
                        b.m410a("can't match url intent. " + e2);
                    }
                }
            }
            intent.setPackage(intent.getPackage());
        }
    }

    public static void a(Map<String, String> map, Bundle bundle, String str) {
        if (map == null || bundle == null || TextUtils.isEmpty(str)) {
            b.m410a("cp map to b fail:" + str);
        } else if (TextUtils.isEmpty(map.get(str))) {
            bundle.remove(str);
        } else {
            bundle.putString(str, map.get(str));
        }
    }

    public static boolean a(Notification.Builder builder, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setGroupAlertBehavior(z ? 2 : 1);
            return true;
        }
        b.b("not support setGroupAlertBehavior");
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1042a(ContentResolver contentResolver) {
        int a2 = a(contentResolver);
        return a2 == 1 || a2 == 2;
    }

    public static boolean a(Context context, String str, String str2, a<String, String, String> aVar, boolean z) {
        if (aVar != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean(aVar.c, z);
                a(context, aVar.f15059a, str, str2, bundle);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean a(Map<String, String> map) {
        return Boolean.parseBoolean((String) a(map, "not_suppress", "true"));
    }

    /* renamed from: a  reason: collision with other method in class */
    public static Notification.Action[] m1043a(Notification notification) {
        Parcelable[] parcelableArray;
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr;
        }
        Bundle bundle = notification.extras;
        if (bundle == null || (parcelableArray = bundle.getParcelableArray("mipush.customActions")) == null) {
            return null;
        }
        return (Notification.Action[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Notification.Action[].class);
    }
}
