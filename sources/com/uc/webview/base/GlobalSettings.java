package com.uc.webview.base;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GlobalSettings extends d {
    private static Set<Observer> sObservers = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface Observer {
        void onValueChanged(int i, String str);
    }

    public static void addObserver(Observer observer) {
        synchronized (sObservers) {
            sObservers.add(observer);
        }
    }

    public static boolean get(int i, boolean z) {
        if (i >= 0 && i < KeyIdMap.f14251a.length) {
            try {
                return Boolean.valueOf(get(i, Boolean.toString(z))).booleanValue();
            } catch (Throwable unused) {
            }
        }
        return z;
    }

    public static boolean getBoolValue(int i) {
        return get(i, false);
    }

    public static float getFloatValue(int i) {
        return get(i, 0.0f);
    }

    public static int getIntValue(int i) {
        return get(i, 0);
    }

    public static String getStringValue(int i) {
        return get(i, "");
    }

    public static boolean isAccessible(int i, String str) {
        if (i < 0 || i >= KeyIdMap.f14251a.length) {
            return false;
        }
        return d.sImpl.get().isAccessible(i, str);
    }

    private static String listToString(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                sb.append(trim);
                sb.append("^^");
            }
        }
        return sb.toString();
    }

    public static boolean set(int i, boolean z) {
        if (i < 0 || i >= KeyIdMap.f14251a.length) {
            return false;
        }
        return setValue(i, Boolean.toString(z));
    }

    private static boolean setImpl(int i, String str) {
        boolean z = d.sImpl.get().set(i, str);
        if (z) {
            synchronized (sObservers) {
                try {
                    for (Observer observer : sObservers) {
                        observer.onValueChanged(i, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            StringBuilder sb = new StringBuilder("set: ");
            sb.append(KeyIdMap.f14251a[i]);
            sb.append(" = \"");
            sb.append(Log.a(str));
            sb.append("\"");
        }
        return z;
    }

    public static boolean setValue(int i, String str) {
        if (i < 0 || i >= KeyIdMap.f14251a.length) {
            return false;
        }
        int[] iArr = KeyIdMap.c[1];
        if (i < iArr[0] || i >= iArr[1]) {
            return setImpl(i, str);
        }
        try {
            return set(i, Integer.valueOf(str).intValue());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int get(int i, int i2) {
        if (i >= 0 && i < KeyIdMap.f14251a.length) {
            try {
                return Integer.valueOf(get(i, Integer.toString(i2))).intValue();
            } catch (Throwable unused) {
            }
        }
        return i2;
    }

    public static boolean set(int i, int i2) {
        if (i < 0 || i >= KeyIdMap.f14251a.length) {
            return false;
        }
        int[] iArr = KeyIdMap.e.get(Integer.valueOf(i));
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (i3 < iArr.length && i2 != iArr[i3]) {
                i3++;
            }
            if (i3 == iArr.length) {
                Log.e("GlobalSettings", String.format("set %s setting failure, \"%d\" is not one of %s", KeyIdMap.f14251a[i], Integer.valueOf(i2), Arrays.toString(iArr)));
                return false;
            }
        }
        return setImpl(i, Integer.toString(i2));
    }

    public static float get(int i, float f) {
        if (i >= 0 && i < KeyIdMap.f14251a.length) {
            try {
                return Float.valueOf(get(i, Float.toString(f))).floatValue();
            } catch (Throwable unused) {
            }
        }
        return f;
    }

    public static boolean setValue(int i, String[] strArr) {
        return setValue(i, listToString(strArr));
    }

    public static String get(int i, String str) {
        if (i < 0 || i >= KeyIdMap.f14251a.length) {
            return str;
        }
        String str2 = d.sImpl.get().get(i);
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    public static boolean set(int i, float f) {
        if (i < 0 || i >= KeyIdMap.f14251a.length) {
            return false;
        }
        return setValue(i, Float.toString(f));
    }

    public static boolean set(int i, String str) {
        if (i < 0 || i >= KeyIdMap.f14251a.length) {
            return false;
        }
        return setValue(i, str);
    }
}
