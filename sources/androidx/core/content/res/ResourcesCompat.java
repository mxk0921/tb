package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ResourcesCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ID_NULL = 0;
    private static final String TAG = "ResourcesCompat";
    private static final ThreadLocal<TypedValue> sTempTypedValue = new ThreadLocal<>();
    private static final WeakHashMap<ColorStateListCacheKey, SparseArray<ColorStateListCacheEntry>> sColorStateCaches = new WeakHashMap<>(0);
    private static final Object sColorStateCacheLock = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static Drawable getDrawable(Resources resources, int i, Resources.Theme theme) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("9100e11b", new Object[]{resources, new Integer(i), theme});
            }
            return resources.getDrawable(i, theme);
        }

        public static Drawable getDrawableForDensity(Resources resources, int i, int i2, Resources.Theme theme) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("3d77bd65", new Object[]{resources, new Integer(i), new Integer(i2), theme});
            }
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static int getColor(Resources resources, int i, Resources.Theme theme) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("af63d4b9", new Object[]{resources, new Integer(i), theme})).intValue();
            }
            return resources.getColor(i, theme);
        }

        public static ColorStateList getColorStateList(Resources resources, int i, Resources.Theme theme) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorStateList) ipChange.ipc$dispatch("f0ecc583", new Object[]{resources, new Integer(i), theme});
            }
            return resources.getColorStateList(i, theme);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static float getFloat(Resources resources, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b981c7df", new Object[]{resources, new Integer(i)})).floatValue();
            }
            return resources.getFloat(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ColorStateListCacheEntry {
        public final Configuration mConfiguration;
        public final int mThemeHash;
        public final ColorStateList mValue;

        public ColorStateListCacheEntry(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int i;
            this.mValue = colorStateList;
            this.mConfiguration = configuration;
            if (theme == null) {
                i = 0;
            } else {
                i = theme.hashCode();
            }
            this.mThemeHash = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class ColorStateListCacheKey {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Resources mResources;
        public final Resources.Theme mTheme;

        public ColorStateListCacheKey(Resources resources, Resources.Theme theme) {
            this.mResources = resources;
            this.mTheme = theme;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || ColorStateListCacheKey.class != obj.getClass()) {
                return false;
            }
            ColorStateListCacheKey colorStateListCacheKey = (ColorStateListCacheKey) obj;
            if (!this.mResources.equals(colorStateListCacheKey.mResources) || !ObjectsCompat.equals(this.mTheme, colorStateListCacheKey.mTheme)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return ObjectsCompat.hash(this.mResources, this.mTheme);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class FontCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static Handler getHandler(Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("c346db9b", new Object[]{handler});
            }
            if (handler == null) {
                return new Handler(Looper.getMainLooper());
            }
            return handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$callbackFailAsync$1(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72a4ebd3", new Object[]{this, new Integer(i)});
            } else {
                onFontRetrievalFailed(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$callbackSuccessAsync$0(Typeface typeface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("605fcb18", new Object[]{this, typeface});
            } else {
                onFontRetrieved(typeface);
            }
        }

        public final void callbackFailAsync(final int i, Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8950f73", new Object[]{this, new Integer(i), handler});
            } else {
                getHandler(handler).post(new Runnable() { // from class: tb.j9o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ResourcesCompat.FontCallback.this.lambda$callbackFailAsync$1(i);
                    }
                });
            }
        }

        public final void callbackSuccessAsync(final Typeface typeface, Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1430ff71", new Object[]{this, typeface, handler});
            } else {
                getHandler(handler).post(new Runnable() { // from class: tb.i9o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ResourcesCompat.FontCallback.this.lambda$callbackSuccessAsync$0(typeface);
                    }
                });
            }
        }

        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(Typeface typeface);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class ThemeCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api23Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private static Method sRebaseMethod;
            private static boolean sRebaseMethodFetched;
            private static final Object sRebaseMethodLock = new Object();

            private Api23Impl() {
            }

            public static void rebase(Resources.Theme theme) {
                synchronized (sRebaseMethodLock) {
                    if (!sRebaseMethodFetched) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            sRebaseMethod = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        sRebaseMethodFetched = true;
                    }
                    Method method = sRebaseMethod;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            sRebaseMethod = null;
                        }
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api29Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api29Impl() {
            }

            public static void rebase(Resources.Theme theme) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6dfd3551", new Object[]{theme});
                } else {
                    theme.rebase();
                }
            }
        }

        private ThemeCompat() {
        }

        public static void rebase(Resources.Theme theme) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfd3551", new Object[]{theme});
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                Api29Impl.rebase(theme);
            } else if (i >= 23) {
                Api23Impl.rebase(theme);
            }
        }
    }

    private ResourcesCompat() {
    }

    private static void addColorStateListToCache(ColorStateListCacheKey colorStateListCacheKey, int i, ColorStateList colorStateList, Resources.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae60d116", new Object[]{colorStateListCacheKey, new Integer(i), colorStateList, theme});
            return;
        }
        synchronized (sColorStateCacheLock) {
            try {
                WeakHashMap<ColorStateListCacheKey, SparseArray<ColorStateListCacheEntry>> weakHashMap = sColorStateCaches;
                SparseArray<ColorStateListCacheEntry> sparseArray = weakHashMap.get(colorStateListCacheKey);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(colorStateListCacheKey, sparseArray);
                }
                sparseArray.append(i, new ColorStateListCacheEntry(colorStateList, colorStateListCacheKey.mResources.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void clearCachesForTheme(Resources.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ba2f97", new Object[]{theme});
            return;
        }
        synchronized (sColorStateCacheLock) {
            try {
                Iterator<ColorStateListCacheKey> it = sColorStateCaches.keySet().iterator();
                while (it.hasNext()) {
                    ColorStateListCacheKey next = it.next();
                    if (next != null && theme.equals(next.mTheme)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (r2.mThemeHash == r5.hashCode()) goto L_0x005b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.res.ColorStateList getCachedColorStateList(androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey r5, int r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = androidx.core.content.res.ResourcesCompat.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001d
            java.lang.String r1 = "b77aef6"
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r6)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r3 = 0
            r6[r3] = r5
            r5 = 1
            r6[r5] = r2
            java.lang.Object r5 = r0.ipc$dispatch(r1, r6)
            android.content.res.ColorStateList r5 = (android.content.res.ColorStateList) r5
            return r5
        L_0x001d:
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: all -> 0x004f
            java.lang.Object r1 = r1.get(r5)     // Catch: all -> 0x004f
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: all -> 0x004f
            if (r1 == 0) goto L_0x0062
            int r2 = r1.size()     // Catch: all -> 0x004f
            if (r2 <= 0) goto L_0x0062
            java.lang.Object r2 = r1.get(r6)     // Catch: all -> 0x004f
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry r2 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry) r2     // Catch: all -> 0x004f
            if (r2 == 0) goto L_0x0062
            android.content.res.Configuration r3 = r2.mConfiguration     // Catch: all -> 0x004f
            android.content.res.Resources r4 = r5.mResources     // Catch: all -> 0x004f
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: all -> 0x004f
            boolean r3 = r3.equals(r4)     // Catch: all -> 0x004f
            if (r3 == 0) goto L_0x005f
            android.content.res.Resources$Theme r5 = r5.mTheme     // Catch: all -> 0x004f
            if (r5 != 0) goto L_0x0051
            int r3 = r2.mThemeHash     // Catch: all -> 0x004f
            if (r3 == 0) goto L_0x005b
            goto L_0x0051
        L_0x004f:
            r5 = move-exception
            goto L_0x0065
        L_0x0051:
            if (r5 == 0) goto L_0x005f
            int r3 = r2.mThemeHash     // Catch: all -> 0x004f
            int r5 = r5.hashCode()     // Catch: all -> 0x004f
            if (r3 != r5) goto L_0x005f
        L_0x005b:
            android.content.res.ColorStateList r5 = r2.mValue     // Catch: all -> 0x004f
            monitor-exit(r0)     // Catch: all -> 0x004f
            return r5
        L_0x005f:
            r1.remove(r6)     // Catch: all -> 0x004f
        L_0x0062:
            monitor-exit(r0)     // Catch: all -> 0x004f
            r5 = 0
            return r5
        L_0x0065:
            monitor-exit(r0)     // Catch: all -> 0x004f
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.getCachedColorStateList(androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, int):android.content.res.ColorStateList");
    }

    public static Typeface getCachedFont(Context context, int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("ad7772ff", new Object[]{context, new Integer(i)});
        }
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static int getColor(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af63d4b9", new Object[]{resources, new Integer(i), theme})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getColor(resources, i, theme);
        }
        return resources.getColor(i);
    }

    public static ColorStateList getColorStateList(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("f0ecc583", new Object[]{resources, new Integer(i), theme});
        }
        ColorStateListCacheKey colorStateListCacheKey = new ColorStateListCacheKey(resources, theme);
        ColorStateList cachedColorStateList = getCachedColorStateList(colorStateListCacheKey, i);
        if (cachedColorStateList != null) {
            return cachedColorStateList;
        }
        ColorStateList inflateColorStateList = inflateColorStateList(resources, i, theme);
        if (inflateColorStateList != null) {
            addColorStateListToCache(colorStateListCacheKey, i, inflateColorStateList, theme);
            return inflateColorStateList;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getColorStateList(resources, i, theme);
        } else {
            return resources.getColorStateList(i);
        }
    }

    public static Drawable getDrawable(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("9100e11b", new Object[]{resources, new Integer(i), theme});
        }
        return Api21Impl.getDrawable(resources, i, theme);
    }

    public static Drawable getDrawableForDensity(Resources resources, int i, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("3d77bd65", new Object[]{resources, new Integer(i), new Integer(i2), theme});
        }
        return Api21Impl.getDrawableForDensity(resources, i, i2, theme);
    }

    public static float getFloat(Resources resources, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b981c7df", new Object[]{resources, new Integer(i)})).floatValue();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.getFloat(resources, i);
        }
        TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    public static Typeface getFont(Context context, int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("dedefd3d", new Object[]{context, new Integer(i)});
        }
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, null, null, false, false);
    }

    private static TypedValue getTypedValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypedValue) ipChange.ipc$dispatch("75a8f601", new Object[0]);
        }
        ThreadLocal<TypedValue> threadLocal = sTempTypedValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList inflateColorStateList(Resources resources, int i, Resources.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("f1e690f4", new Object[]{resources, new Integer(i), theme});
        }
        if (isColorInt(resources, i)) {
            return null;
        }
        try {
            return ColorStateListInflaterCompat.createFromXml(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean isColorInt(Resources resources, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d4fe023", new Object[]{resources, new Integer(i)})).booleanValue();
        }
        TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    private static Typeface loadFont(Context context, int i, TypedValue typedValue, int i2, FontCallback fontCallback, Handler handler, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("27ed9b42", new Object[]{context, new Integer(i), typedValue, new Integer(i2), fontCallback, handler, new Boolean(z), new Boolean(z2)});
        }
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface loadFont = loadFont(context, resources, typedValue, i, i2, fontCallback, handler, z, z2);
        if (loadFont != null || fontCallback != null || z2) {
            return loadFont;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    public static void getFont(Context context, int i, FontCallback fontCallback, Handler handler) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ffa8c6", new Object[]{context, new Integer(i), fontCallback, handler});
            return;
        }
        Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
        } else {
            loadFont(context, i, new TypedValue(), 0, fontCallback, handler, false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface loadFont(android.content.Context r16, android.content.res.Resources r17, android.util.TypedValue r18, int r19, int r20, androidx.core.content.res.ResourcesCompat.FontCallback r21, android.os.Handler r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.loadFont(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    public static Typeface getFont(Context context, int i, TypedValue typedValue, int i2, FontCallback fontCallback) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("b20a7d02", new Object[]{context, new Integer(i), typedValue, new Integer(i2), fontCallback});
        }
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, typedValue, i2, fontCallback, null, true, false);
    }
}
