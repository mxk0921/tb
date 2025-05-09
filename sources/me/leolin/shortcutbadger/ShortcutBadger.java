package me.leolin.shortcutbadger;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.AsusHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.EverythingMeHomeBadger;
import me.leolin.shortcutbadger.impl.HuaweiHomeBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.OPPOHomeBader;
import me.leolin.shortcutbadger.impl.SamsungHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;
import me.leolin.shortcutbadger.impl.VivoHomeBadger;
import me.leolin.shortcutbadger.impl.ZTEHomeBadger;
import me.leolin.shortcutbadger.impl.ZukHomeBadger;
import tb.po1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ShortcutBadger {
    private static final List<Class<? extends po1>> BADGERS;
    private static final String LOG_TAG = "ShortcutBadger";
    private static final int SUPPORTED_CHECK_ATTEMPTS = 3;
    private static ComponentName sComponentName;
    private static final Object sCounterSupportedLock = new Object();
    private static volatile Boolean sIsBadgeCounterSupported;
    private static po1 sShortcutBadger;

    static {
        LinkedList linkedList = new LinkedList();
        BADGERS = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(ZTEHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    private ShortcutBadger() {
    }

    public static boolean applyCount(Context context, int i) {
        try {
            applyCountOrThrow(context, i);
            return true;
        } catch (ShortcutBadgeException unused) {
            return false;
        }
    }

    public static void applyCountOrThrow(Context context, int i) throws ShortcutBadgeException {
        if (sShortcutBadger != null || initBadger(context)) {
            try {
                sShortcutBadger.b(context, sComponentName, i);
            } catch (Exception e) {
                throw new ShortcutBadgeException("Unable to execute badge", e);
            }
        } else {
            throw new ShortcutBadgeException("No default launcher available");
        }
    }

    public static void applyNotification(Context context, Notification notification, int i) {
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            try {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }

    private static boolean initBadger(Context context) {
        po1 po1Var;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e(LOG_TAG, "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        sComponentName = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            String str = resolveInfo.activityInfo.packageName;
            Iterator<Class<? extends po1>> it = BADGERS.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        po1Var = (po1) it.next().newInstance();
                    } catch (Exception unused) {
                        po1Var = null;
                    }
                    if (po1Var != null && po1Var.a().contains(str)) {
                        sShortcutBadger = po1Var;
                        break;
                    }
                }
            }
        }
        if (sShortcutBadger != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            sShortcutBadger = new ZukHomeBadger();
            return true;
        } else if (str2.equalsIgnoreCase("OPPO")) {
            sShortcutBadger = new OPPOHomeBader();
            return true;
        } else if (str2.equalsIgnoreCase("VIVO")) {
            sShortcutBadger = new VivoHomeBadger();
            return true;
        } else if (str2.equalsIgnoreCase("ZTE")) {
            sShortcutBadger = new ZTEHomeBadger();
            return true;
        } else {
            sShortcutBadger = new DefaultBadger();
            return true;
        }
    }

    public static boolean isBadgeCounterSupported(Context context) {
        if (sIsBadgeCounterSupported == null) {
            synchronized (sCounterSupportedLock) {
                try {
                    if (sIsBadgeCounterSupported == null) {
                        String str = null;
                        for (int i = 0; i < 3; i++) {
                            try {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Checking if platform supports badge counters, attempt ");
                                sb.append(String.format("%d/%d.", Integer.valueOf(i + 1), 3));
                            } catch (Exception e) {
                                str = e.getMessage();
                            }
                            if (initBadger(context)) {
                                sShortcutBadger.b(context, sComponentName, 0);
                                sIsBadgeCounterSupported = Boolean.TRUE;
                                break;
                            }
                            str = "Failed to initialize the badge counter.";
                        }
                        if (sIsBadgeCounterSupported == null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Badge counter seems not supported for this platform: ");
                            sb2.append(str);
                            sIsBadgeCounterSupported = Boolean.FALSE;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sIsBadgeCounterSupported.booleanValue();
    }

    public static boolean removeCount(Context context) {
        return applyCount(context, 0);
    }

    public static void removeCountOrThrow(Context context) throws ShortcutBadgeException {
        applyCountOrThrow(context, 0);
    }
}
