package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ICUCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ICUCompat";
    private static Method sAddLikelySubtagsMethod;
    private static Method sGetScriptMethod;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static String getScript(Locale locale) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1f167883", new Object[]{locale});
            }
            return locale.getScript();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static ULocale addLikelySubtags(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ULocale) ipChange.ipc$dispatch("acbce638", new Object[]{obj});
            }
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        public static ULocale forLocale(Locale locale) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ULocale) ipChange.ipc$dispatch("40b1df10", new Object[]{locale});
            }
            return ULocale.forLocale(locale);
        }

        public static String getScript(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cebd337c", new Object[]{obj});
            }
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                sAddLikelySubtagsMethod = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    private ICUCompat() {
    }

    private static String addLikelySubtagsBelowApi21(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = sAddLikelySubtagsMethod;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }

    private static String getScriptBelowApi21(String str) {
        try {
            Method method = sGetScriptMethod;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    public static String maximizeAndGetScript(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getScript(Api24Impl.addLikelySubtags(Api24Impl.forLocale(locale)));
        }
        try {
            return Api21Impl.getScript((Locale) sAddLikelySubtagsMethod.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return Api21Impl.getScript(locale);
        }
    }
}
