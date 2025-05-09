package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TintContextWrapper extends ContextWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object CACHE_LOCK = new Object();
    private static ArrayList<WeakReference<TintContextWrapper>> sCache;
    private final Resources mResources;
    private final Resources.Theme mTheme;

    private TintContextWrapper(Context context) {
        super(context);
        if (VectorEnabledTintResources.shouldBeUsed()) {
            VectorEnabledTintResources vectorEnabledTintResources = new VectorEnabledTintResources(this, context.getResources());
            this.mResources = vectorEnabledTintResources;
            Resources.Theme newTheme = vectorEnabledTintResources.newTheme();
            this.mTheme = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.mResources = new TintResources(this, context.getResources());
        this.mTheme = null;
    }

    public static /* synthetic */ Object ipc$super(TintContextWrapper tintContextWrapper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 978076981) {
            super.setTheme(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 1984083782) {
            return super.getTheme();
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/appcompat/widget/TintContextWrapper");
        }
    }

    private static boolean shouldWrap(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdbe55a8", new Object[]{context})).booleanValue();
        }
        if ((context instanceof TintContextWrapper) || (context.getResources() instanceof TintResources) || (context.getResources() instanceof VectorEnabledTintResources)) {
            return false;
        }
        return VectorEnabledTintResources.shouldBeUsed();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssetManager) ipChange.ipc$dispatch("7b0fb283", new Object[]{this});
        }
        return this.mResources.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this});
        }
        return this.mResources;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources.Theme) ipChange.ipc$dispatch("7642b746", new Object[]{this});
        }
        Resources.Theme theme = this.mTheme;
        if (theme == null) {
            return super.getTheme();
        }
        return theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4c4535", new Object[]{this, new Integer(i)});
            return;
        }
        Resources.Theme theme = this.mTheme;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }

    public static Context wrap(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d9ec730f", new Object[]{context});
        }
        if (!shouldWrap(context)) {
            return context;
        }
        synchronized (CACHE_LOCK) {
            try {
                ArrayList<WeakReference<TintContextWrapper>> arrayList = sCache;
                if (arrayList == null) {
                    sCache = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<TintContextWrapper> weakReference = sCache.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            sCache.remove(size);
                        }
                    }
                    for (int size2 = sCache.size() - 1; size2 >= 0; size2--) {
                        WeakReference<TintContextWrapper> weakReference2 = sCache.get(size2);
                        TintContextWrapper tintContextWrapper = weakReference2 != null ? weakReference2.get() : null;
                        if (tintContextWrapper != null && tintContextWrapper.getBaseContext() == context) {
                            return tintContextWrapper;
                        }
                    }
                }
                TintContextWrapper tintContextWrapper2 = new TintContextWrapper(context);
                sCache.add(new WeakReference<>(tintContextWrapper2));
                return tintContextWrapper2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
