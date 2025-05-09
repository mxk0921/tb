package androidx.core.content.pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutInfoCompatSaver;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import tb.gsp;
import tb.jup;
import tb.ttp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ShortcutManagerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
    private static final int DEFAULT_MAX_ICON_DIMENSION_DP = 96;
    private static final int DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP = 48;
    public static final String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;
    public static final String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static final String SHORTCUT_LISTENER_INTENT_FILTER_ACTION = "androidx.core.content.pm.SHORTCUT_LISTENER";
    private static final String SHORTCUT_LISTENER_META_DATA_KEY = "androidx.core.content.pm.shortcut_listener_impl";
    private static volatile List<ShortcutInfoChangeListener> sShortcutInfoChangeListeners;
    private static volatile ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api25Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api25Impl() {
        }

        public static String getShortcutInfoWithLowestRank(List<ShortcutInfo> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cea74f5a", new Object[]{list});
            }
            int i = -1;
            String str = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > i) {
                    str = shortcutInfo.getId();
                    i = shortcutInfo.getRank();
                }
            }
            return str;
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface ShortcutMatchFlags {
    }

    private ShortcutManagerCompat() {
    }

    public static boolean addDynamicShortcuts(Context context, List<ShortcutInfoCompat> list) {
        Object systemService;
        boolean addDynamicShortcuts;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34aaaa47", new Object[]{context, list})).booleanValue();
        }
        List<ShortcutInfoCompat> removeShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            convertUriIconsToBitmapIcons(context, removeShortcutsExcludedFromSurface);
        }
        if (i >= 25) {
            ArrayList arrayList = new ArrayList();
            for (ShortcutInfoCompat shortcutInfoCompat : removeShortcutsExcludedFromSurface) {
                arrayList.add(shortcutInfoCompat.toShortcutInfo());
            }
            systemService = context.getSystemService(ttp.a());
            addDynamicShortcuts = jup.a(systemService).addDynamicShortcuts(arrayList);
            if (!addDynamicShortcuts) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).addShortcuts(removeShortcutsExcludedFromSurface);
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : getShortcutInfoListeners(context)) {
            shortcutInfoChangeListener.onShortcutAdded(list);
        }
        return true;
    }

    public static void convertUriIconsToBitmapIcons(Context context, List<ShortcutInfoCompat> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35007123", new Object[]{context, list});
            return;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            ShortcutInfoCompat shortcutInfoCompat = (ShortcutInfoCompat) it.next();
            if (!convertUriIconToBitmapIcon(context, shortcutInfoCompat)) {
                list.remove(shortcutInfoCompat);
            }
        }
    }

    public static Intent createShortcutResultIntent(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        Intent intent;
        Object systemService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("3a31e0a0", new Object[]{context, shortcutInfoCompat});
        }
        if (Build.VERSION.SDK_INT >= 26) {
            systemService = context.getSystemService(ttp.a());
            intent = jup.a(systemService).createShortcutResultIntent(shortcutInfoCompat.toShortcutInfo());
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = new Intent();
        }
        return shortcutInfoCompat.addToIntent(intent);
    }

    public static void disableShortcuts(Context context, List<String> list, CharSequence charSequence) {
        Object systemService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22c96f1", new Object[]{context, list, charSequence});
            return;
        }
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(ttp.a());
            jup.a(systemService).disableShortcuts(list, charSequence);
        }
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : getShortcutInfoListeners(context)) {
            shortcutInfoChangeListener.onShortcutRemoved(list);
        }
    }

    public static List<ShortcutInfoCompat> getDynamicShortcuts(Context context) {
        Object systemService;
        List<Object> dynamicShortcuts;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("77fd53ea", new Object[]{context});
        }
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(ttp.a());
            dynamicShortcuts = jup.a(systemService).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (Object obj : dynamicShortcuts) {
                arrayList.add(new ShortcutInfoCompat.Builder(context, gsp.a(obj)).build());
            }
            return arrayList;
        }
        try {
            return getShortcutInfoSaverInstance(context).getShortcuts();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    private static int getIconDimensionInternal(Context context, boolean z) {
        int i;
        float f;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66c4e7da", new Object[]{context, new Boolean(z)})).intValue();
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || activityManager.isLowRamDevice()) {
            z2 = true;
        }
        if (z2) {
            i = 48;
        } else {
            i = 96;
        }
        int max = Math.max(1, i);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            f = displayMetrics.xdpi;
        } else {
            f = displayMetrics.ydpi;
        }
        return (int) (max * (f / 160.0f));
    }

    public static int getIconMaxHeight(Context context) {
        Object systemService;
        int iconMaxHeight;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74c2bf18", new Object[]{context})).intValue();
        }
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT < 25) {
            return getIconDimensionInternal(context, false);
        }
        systemService = context.getSystemService(ttp.a());
        iconMaxHeight = jup.a(systemService).getIconMaxHeight();
        return iconMaxHeight;
    }

    public static int getMaxShortcutCountPerActivity(Context context) {
        Object systemService;
        int maxShortcutCountPerActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6f05743", new Object[]{context})).intValue();
        }
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT < 25) {
            return 5;
        }
        systemService = context.getSystemService(ttp.a());
        maxShortcutCountPerActivity = jup.a(systemService).getMaxShortcutCountPerActivity();
        return maxShortcutCountPerActivity;
    }

    public static List<ShortcutInfoChangeListener> getShortcutInfoChangeListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ced8cc3b", new Object[0]);
        }
        return sShortcutInfoChangeListeners;
    }

    private static String getShortcutInfoCompatWithLowestRank(List<ShortcutInfoCompat> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f48bff8", new Object[]{list});
        }
        int i = -1;
        String str = null;
        for (ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.getRank() > i) {
                str = shortcutInfoCompat.getId();
                i = shortcutInfoCompat.getRank();
            }
        }
        return str;
    }

    public static boolean isRateLimitingActive(Context context) {
        Object systemService;
        boolean isRateLimitingActive;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7543688e", new Object[]{context})).booleanValue();
        }
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(ttp.a());
            isRateLimitingActive = jup.a(systemService).isRateLimitingActive();
            return isRateLimitingActive;
        } else if (getShortcuts(context, 3).size() == getMaxShortcutCountPerActivity(context)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean pushDynamicShortcut(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        Object systemService;
        boolean isRateLimitingActive;
        List dynamicShortcuts;
        Object systemService2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("214a6ea7", new Object[]{context, shortcutInfoCompat})).booleanValue();
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(shortcutInfoCompat);
        int i = Build.VERSION.SDK_INT;
        if (i > 32 || !shortcutInfoCompat.isExcludedFromSurfaces(1)) {
            int maxShortcutCountPerActivity = getMaxShortcutCountPerActivity(context);
            if (maxShortcutCountPerActivity == 0) {
                return false;
            }
            if (i <= 29) {
                convertUriIconToBitmapIcon(context, shortcutInfoCompat);
            }
            if (i >= 30) {
                systemService2 = context.getSystemService(ttp.a());
                jup.a(systemService2).pushDynamicShortcut(shortcutInfoCompat.toShortcutInfo());
            } else if (i >= 25) {
                systemService = context.getSystemService(ttp.a());
                ShortcutManager a2 = jup.a(systemService);
                isRateLimitingActive = a2.isRateLimitingActive();
                if (isRateLimitingActive) {
                    return false;
                }
                dynamicShortcuts = a2.getDynamicShortcuts();
                if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                    a2.removeDynamicShortcuts(Arrays.asList(Api25Impl.getShortcutInfoWithLowestRank(dynamicShortcuts)));
                }
                a2.addDynamicShortcuts(Arrays.asList(shortcutInfoCompat.toShortcutInfo()));
            }
            ShortcutInfoCompatSaver<?> shortcutInfoSaverInstance = getShortcutInfoSaverInstance(context);
            try {
                List<ShortcutInfoCompat> shortcuts = shortcutInfoSaverInstance.getShortcuts();
                if (shortcuts.size() >= maxShortcutCountPerActivity) {
                    shortcutInfoSaverInstance.removeShortcuts(Arrays.asList(getShortcutInfoCompatWithLowestRank(shortcuts)));
                }
                shortcutInfoSaverInstance.addShortcuts(Arrays.asList(shortcutInfoCompat));
                for (ShortcutInfoChangeListener shortcutInfoChangeListener : getShortcutInfoListeners(context)) {
                    shortcutInfoChangeListener.onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
                }
                reportShortcutUsed(context, shortcutInfoCompat.getId());
                return true;
            } catch (Exception unused) {
                for (ShortcutInfoChangeListener shortcutInfoChangeListener2 : getShortcutInfoListeners(context)) {
                    shortcutInfoChangeListener2.onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
                }
                reportShortcutUsed(context, shortcutInfoCompat.getId());
                return false;
            } catch (Throwable th) {
                for (ShortcutInfoChangeListener shortcutInfoChangeListener3 : getShortcutInfoListeners(context)) {
                    shortcutInfoChangeListener3.onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
                }
                reportShortcutUsed(context, shortcutInfoCompat.getId());
                throw th;
            }
        } else {
            for (ShortcutInfoChangeListener shortcutInfoChangeListener4 : getShortcutInfoListeners(context)) {
                shortcutInfoChangeListener4.onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            return true;
        }
    }

    public static void removeAllDynamicShortcuts(Context context) {
        Object systemService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1cc4f6", new Object[]{context});
            return;
        }
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(ttp.a());
            jup.a(systemService).removeAllDynamicShortcuts();
        }
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : getShortcutInfoListeners(context)) {
            shortcutInfoChangeListener.onAllShortcutsRemoved();
        }
    }

    public static void removeDynamicShortcuts(Context context, List<String> list) {
        Object systemService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbe8540", new Object[]{context, list});
            return;
        }
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(ttp.a());
            jup.a(systemService).removeDynamicShortcuts(list);
        }
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : getShortcutInfoListeners(context)) {
            shortcutInfoChangeListener.onShortcutRemoved(list);
        }
    }

    public static void removeLongLivedShortcuts(Context context, List<String> list) {
        Object systemService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28598a1d", new Object[]{context, list});
        } else if (Build.VERSION.SDK_INT < 30) {
            removeDynamicShortcuts(context, list);
        } else {
            systemService = context.getSystemService(ttp.a());
            jup.a(systemService).removeLongLivedShortcuts(list);
            getShortcutInfoSaverInstance(context).removeShortcuts(list);
            for (ShortcutInfoChangeListener shortcutInfoChangeListener : getShortcutInfoListeners(context)) {
                shortcutInfoChangeListener.onShortcutRemoved(list);
            }
        }
    }

    private static List<ShortcutInfoCompat> removeShortcutsExcludedFromSurface(List<ShortcutInfoCompat> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1f86064c", new Object[]{list, new Integer(i)});
        }
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.isExcludedFromSurfaces(i)) {
                arrayList.remove(shortcutInfoCompat);
            }
        }
        return arrayList;
    }

    public static void reportShortcutUsed(Context context, String str) {
        Object systemService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95bb7b54", new Object[]{context, str});
            return;
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(ttp.a());
            jup.a(systemService).reportShortcutUsed(str);
        }
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : getShortcutInfoListeners(context)) {
            shortcutInfoChangeListener.onShortcutUsageReported(Collections.singletonList(str));
        }
    }

    public static boolean setDynamicShortcuts(Context context, List<ShortcutInfoCompat> list) {
        Object systemService;
        boolean dynamicShortcuts;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ef36e26", new Object[]{context, list})).booleanValue();
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(list);
        List<ShortcutInfoCompat> removeShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(removeShortcutsExcludedFromSurface.size());
            for (ShortcutInfoCompat shortcutInfoCompat : removeShortcutsExcludedFromSurface) {
                arrayList.add(shortcutInfoCompat.toShortcutInfo());
            }
            systemService = context.getSystemService(ttp.a());
            dynamicShortcuts = jup.a(systemService).setDynamicShortcuts(arrayList);
            if (!dynamicShortcuts) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
        getShortcutInfoSaverInstance(context).addShortcuts(removeShortcutsExcludedFromSurface);
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : getShortcutInfoListeners(context)) {
            shortcutInfoChangeListener.onAllShortcutsRemoved();
            shortcutInfoChangeListener.onShortcutAdded(list);
        }
        return true;
    }

    public static void setShortcutInfoChangeListeners(List<ShortcutInfoChangeListener> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aee9af1", new Object[]{list});
        } else {
            sShortcutInfoChangeListeners = list;
        }
    }

    public static void setShortcutInfoCompatSaver(ShortcutInfoCompatSaver<Void> shortcutInfoCompatSaver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2475bca6", new Object[]{shortcutInfoCompatSaver});
        } else {
            sShortcutInfoCompatSaver = shortcutInfoCompatSaver;
        }
    }

    public static boolean updateShortcuts(Context context, List<ShortcutInfoCompat> list) {
        Object systemService;
        boolean updateShortcuts;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b67cc72", new Object[]{context, list})).booleanValue();
        }
        List<ShortcutInfoCompat> removeShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            convertUriIconsToBitmapIcons(context, removeShortcutsExcludedFromSurface);
        }
        if (i >= 25) {
            ArrayList arrayList = new ArrayList();
            for (ShortcutInfoCompat shortcutInfoCompat : removeShortcutsExcludedFromSurface) {
                arrayList.add(shortcutInfoCompat.toShortcutInfo());
            }
            systemService = context.getSystemService(ttp.a());
            updateShortcuts = jup.a(systemService).updateShortcuts(arrayList);
            if (!updateShortcuts) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).addShortcuts(removeShortcutsExcludedFromSurface);
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : getShortcutInfoListeners(context)) {
            shortcutInfoChangeListener.onShortcutUpdated(list);
        }
        return true;
    }

    public static void enableShortcuts(Context context, List<ShortcutInfoCompat> list) {
        Object systemService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed9a9a8", new Object[]{context, list});
            return;
        }
        List<ShortcutInfoCompat> removeShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            for (ShortcutInfoCompat shortcutInfoCompat : removeShortcutsExcludedFromSurface) {
                arrayList.add(shortcutInfoCompat.mId);
            }
            systemService = context.getSystemService(ttp.a());
            jup.a(systemService).enableShortcuts(arrayList);
        }
        getShortcutInfoSaverInstance(context).addShortcuts(removeShortcutsExcludedFromSurface);
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : getShortcutInfoListeners(context)) {
            shortcutInfoChangeListener.onShortcutAdded(list);
        }
    }

    public static int getIconMaxWidth(Context context) {
        Object systemService;
        int iconMaxWidth;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da7079e3", new Object[]{context})).intValue();
        }
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT < 25) {
            return getIconDimensionInternal(context, true);
        }
        systemService = context.getSystemService(ttp.a());
        iconMaxWidth = jup.a(systemService).getIconMaxWidth();
        return iconMaxWidth;
    }

    public static boolean convertUriIconToBitmapIcon(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        Bitmap decodeStream;
        IconCompat iconCompat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce42a211", new Object[]{context, shortcutInfoCompat})).booleanValue();
        }
        IconCompat iconCompat2 = shortcutInfoCompat.mIcon;
        if (iconCompat2 == null) {
            return false;
        }
        int i = iconCompat2.mType;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream uriInputStream = iconCompat2.getUriInputStream(context);
        if (uriInputStream == null || (decodeStream = BitmapFactory.decodeStream(uriInputStream)) == null) {
            return false;
        }
        if (i == 6) {
            iconCompat = IconCompat.createWithAdaptiveBitmap(decodeStream);
        } else {
            iconCompat = IconCompat.createWithBitmap(decodeStream);
        }
        shortcutInfoCompat.mIcon = iconCompat;
        return true;
    }

    private static List<ShortcutInfoChangeListener> getShortcutInfoListeners(Context context) {
        Bundle bundle;
        String string;
        if (sShortcutInfoChangeListeners == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(SHORTCUT_LISTENER_INTENT_FILTER_ACTION);
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString(SHORTCUT_LISTENER_META_DATA_KEY)) == null)) {
                    try {
                        arrayList.add((ShortcutInfoChangeListener) Class.forName(string, false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (sShortcutInfoChangeListeners == null) {
                sShortcutInfoChangeListeners = arrayList;
            }
        }
        return sShortcutInfoChangeListeners;
    }

    private static ShortcutInfoCompatSaver<?> getShortcutInfoSaverInstance(Context context) {
        if (sShortcutInfoCompatSaver == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    sShortcutInfoCompatSaver = (ShortcutInfoCompatSaver) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (sShortcutInfoCompatSaver == null) {
                sShortcutInfoCompatSaver = new ShortcutInfoCompatSaver.NoopImpl();
            }
        }
        return sShortcutInfoCompatSaver;
    }

    public static List<ShortcutInfoCompat> getShortcuts(Context context, int i) {
        Object systemService;
        List pinnedShortcuts;
        List dynamicShortcuts;
        List manifestShortcuts;
        Object systemService2;
        List shortcuts;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ebb7a32e", new Object[]{context, new Integer(i)});
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            systemService2 = context.getSystemService(ttp.a());
            shortcuts = jup.a(systemService2).getShortcuts(i);
            return ShortcutInfoCompat.fromShortcuts(context, shortcuts);
        } else if (i2 >= 25) {
            systemService = context.getSystemService(ttp.a());
            ShortcutManager a2 = jup.a(systemService);
            ArrayList arrayList = new ArrayList();
            if ((1 & i) != 0) {
                manifestShortcuts = a2.getManifestShortcuts();
                arrayList.addAll(manifestShortcuts);
            }
            if ((i & 2) != 0) {
                dynamicShortcuts = a2.getDynamicShortcuts();
                arrayList.addAll(dynamicShortcuts);
            }
            if ((i & 4) != 0) {
                pinnedShortcuts = a2.getPinnedShortcuts();
                arrayList.addAll(pinnedShortcuts);
            }
            return ShortcutInfoCompat.fromShortcuts(context, arrayList);
        } else {
            if ((i & 2) != 0) {
                try {
                    return getShortcutInfoSaverInstance(context).getShortcuts();
                } catch (Exception unused) {
                }
            }
            return Collections.emptyList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isRequestPinShortcutSupported(android.content.Context r5) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.core.content.pm.ShortcutManagerCompat.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "1f17188d"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x0019:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L_0x0030
            java.lang.Class r0 = tb.ttp.a()
            java.lang.Object r5 = tb.eup.a(r5, r0)
            android.content.pm.ShortcutManager r5 = tb.jup.a(r5)
            boolean r5 = tb.xtp.a(r5)
            return r5
        L_0x0030:
            java.lang.String r2 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r3 = androidx.core.content.ContextCompat.checkSelfPermission(r5, r2)
            if (r3 == 0) goto L_0x003a
            return r0
        L_0x003a:
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r3.<init>(r4)
            java.util.List r5 = r5.queryBroadcastReceivers(r3, r0)
            java.util.Iterator r5 = r5.iterator()
        L_0x004e:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r5.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.permission
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x006a
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x004e
        L_0x006a:
            return r1
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.pm.ShortcutManagerCompat.isRequestPinShortcutSupported(android.content.Context):boolean");
    }

    public static boolean requestPinShortcut(Context context, ShortcutInfoCompat shortcutInfoCompat, final IntentSender intentSender) {
        Object systemService;
        boolean requestPinShortcut;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa982bb0", new Object[]{context, shortcutInfoCompat, intentSender})).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i <= 32 && shortcutInfoCompat.isExcludedFromSurfaces(1)) {
            return false;
        }
        if (i >= 26) {
            systemService = context.getSystemService(ttp.a());
            requestPinShortcut = jup.a(systemService).requestPinShortcut(shortcutInfoCompat.toShortcutInfo(), intentSender);
            return requestPinShortcut;
        } else if (!isRequestPinShortcutSupported(context)) {
            return false;
        } else {
            Intent addToIntent = shortcutInfoCompat.addToIntent(new Intent(ACTION_INSTALL_SHORTCUT));
            if (intentSender == null) {
                context.sendBroadcast(addToIntent);
                return true;
            }
            context.sendOrderedBroadcast(addToIntent, null, new BroadcastReceiver() { // from class: androidx.core.content.pm.ShortcutManagerCompat.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/content/pm/ShortcutManagerCompat$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    try {
                        intentSender.sendIntent(context2, 0, null, null, null);
                    } catch (IntentSender.SendIntentException unused) {
                    }
                }
            }, null, -1, null, null);
            return true;
        }
    }
}
