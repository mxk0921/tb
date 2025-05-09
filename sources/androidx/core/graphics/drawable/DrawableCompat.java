package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DrawableCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DrawableCompat";
    private static Method sGetLayoutDirectionMethod;
    private static boolean sGetLayoutDirectionMethodFetched;
    private static Method sSetLayoutDirectionMethod;
    private static boolean sSetLayoutDirectionMethodFetched;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static void applyTheme(Drawable drawable, Resources.Theme theme) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19509016", new Object[]{drawable, theme});
            } else {
                drawable.applyTheme(theme);
            }
        }

        public static boolean canApplyTheme(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("41ba781a", new Object[]{drawable})).booleanValue();
            }
            return drawable.canApplyTheme();
        }

        public static ColorFilter getColorFilter(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorFilter) ipChange.ipc$dispatch("83e8337e", new Object[]{drawable});
            }
            return drawable.getColorFilter();
        }

        public static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4f15e07", new Object[]{drawable, resources, xmlPullParser, attributeSet, theme});
            } else {
                drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            }
        }

        public static void setHotspot(Drawable drawable, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("117e9138", new Object[]{drawable, new Float(f), new Float(f2)});
            } else {
                drawable.setHotspot(f, f2);
            }
        }

        public static void setHotspotBounds(Drawable drawable, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f048ad8d", new Object[]{drawable, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                drawable.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public static void setTint(Drawable drawable, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db27f65b", new Object[]{drawable, new Integer(i)});
            } else {
                drawable.setTint(i);
            }
        }

        public static void setTintList(Drawable drawable, ColorStateList colorStateList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b296d64", new Object[]{drawable, colorStateList});
            } else {
                drawable.setTintList(colorStateList);
            }
        }

        public static void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2bd8176", new Object[]{drawable, mode});
            } else {
                drawable.setTintMode(mode);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static int getLayoutDirection(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ac5cb25d", new Object[]{drawable})).intValue();
            }
            return drawable.getLayoutDirection();
        }

        public static boolean setLayoutDirection(Drawable drawable, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a7bfa6e9", new Object[]{drawable, new Integer(i)})).booleanValue();
            }
            return drawable.setLayoutDirection(i);
        }
    }

    private DrawableCompat() {
    }

    public static void applyTheme(Drawable drawable, Resources.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19509016", new Object[]{drawable, theme});
        } else {
            Api21Impl.applyTheme(drawable, theme);
        }
    }

    public static boolean canApplyTheme(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41ba781a", new Object[]{drawable})).booleanValue();
        }
        return Api21Impl.canApplyTheme(drawable);
    }

    public static void clearColorFilter(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23fe6a59", new Object[]{drawable});
        } else if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
        } else {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                clearColorFilter(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof WrappedDrawable) {
                clearColorFilter(((WrappedDrawable) drawable).getWrappedDrawable());
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    Drawable child = drawableContainerState.getChild(i);
                    if (child != null) {
                        clearColorFilter(child);
                    }
                }
            }
        }
    }

    public static int getAlpha(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d33bfc6", new Object[]{drawable})).intValue();
        }
        return drawable.getAlpha();
    }

    public static ColorFilter getColorFilter(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorFilter) ipChange.ipc$dispatch("83e8337e", new Object[]{drawable});
        }
        return Api21Impl.getColorFilter(drawable);
    }

    public static int getLayoutDirection(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getLayoutDirection(drawable);
        }
        if (!sGetLayoutDirectionMethodFetched) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                sGetLayoutDirectionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sGetLayoutDirectionMethodFetched = true;
        }
        Method method = sGetLayoutDirectionMethod;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                sGetLayoutDirectionMethod = null;
            }
        }
        return 0;
    }

    public static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4f15e07", new Object[]{drawable, resources, xmlPullParser, attributeSet, theme});
        } else {
            Api21Impl.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
        }
    }

    public static boolean isAutoMirrored(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41886e6", new Object[]{drawable})).booleanValue();
        }
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void jumpToCurrentState(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ecfac", new Object[]{drawable});
        } else {
            drawable.jumpToCurrentState();
        }
    }

    public static void setAutoMirrored(Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2a6bfa", new Object[]{drawable, new Boolean(z)});
        } else {
            drawable.setAutoMirrored(z);
        }
    }

    public static void setHotspot(Drawable drawable, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117e9138", new Object[]{drawable, new Float(f), new Float(f2)});
        } else {
            Api21Impl.setHotspot(drawable, f, f2);
        }
    }

    public static void setHotspotBounds(Drawable drawable, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f048ad8d", new Object[]{drawable, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            Api21Impl.setHotspotBounds(drawable, i, i2, i3, i4);
        }
    }

    public static void setTint(Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db27f65b", new Object[]{drawable, new Integer(i)});
        } else {
            Api21Impl.setTint(drawable, i);
        }
    }

    public static void setTintList(Drawable drawable, ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b296d64", new Object[]{drawable, colorStateList});
        } else {
            Api21Impl.setTintList(drawable, colorStateList);
        }
    }

    public static void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2bd8176", new Object[]{drawable, mode});
        } else {
            Api21Impl.setTintMode(drawable, mode);
        }
    }

    public static <T extends Drawable> T unwrap(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Drawable) ipChange.ipc$dispatch("ceeed36c", new Object[]{drawable}));
        }
        return drawable instanceof WrappedDrawable ? (T) ((WrappedDrawable) drawable).getWrappedDrawable() : drawable;
    }

    public static Drawable wrap(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("d8e4bf25", new Object[]{drawable});
        }
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof TintAwareDrawable)) ? new WrappedDrawableApi21(drawable) : drawable;
    }

    public static boolean setLayoutDirection(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.setLayoutDirection(drawable, i);
        }
        if (!sSetLayoutDirectionMethodFetched) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                sSetLayoutDirectionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sSetLayoutDirectionMethodFetched = true;
        }
        Method method = sSetLayoutDirectionMethod;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                sSetLayoutDirectionMethod = null;
            }
        }
        return false;
    }
}
