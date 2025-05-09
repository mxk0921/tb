package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.DrawableCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DrawableUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int[] EMPTY_STATE_SET = new int[0];
    public static final Rect INSETS_NONE = new Rect();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static Insets getOpticalInsets(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("6bfffe7a", new Object[]{drawable});
            }
            return drawable.getOpticalInsets();
        }
    }

    private DrawableUtils() {
    }

    @Deprecated
    public static boolean canSafelyMutateDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7caa689d", new Object[]{drawable})).booleanValue();
        }
        return true;
    }

    public static void fixDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e992cfe", new Object[]{drawable});
            return;
        }
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            forceDrawableStateChange(drawable);
        } else if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            forceDrawableStateChange(drawable);
        }
    }

    private static void forceDrawableStateChange(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3beb63", new Object[]{drawable});
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(CHECKED_STATE_SET);
        } else {
            drawable.setState(EMPTY_STATE_SET);
        }
        drawable.setState(state);
    }

    public static Rect getOpticalBounds(Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("fcc7fe0b", new Object[]{drawable});
        }
        if (Build.VERSION.SDK_INT < 29) {
            return Api18Impl.getOpticalInsets(DrawableCompat.unwrap(drawable));
        }
        Insets opticalInsets = Api29Impl.getOpticalInsets(drawable);
        i = opticalInsets.left;
        i2 = opticalInsets.top;
        i3 = opticalInsets.right;
        i4 = opticalInsets.bottom;
        return new Rect(i, i2, i3, i4);
    }

    public static PorterDuff.Mode parseTintMode(int i, PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("30cd7ab", new Object[]{new Integer(i), mode});
        }
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api18Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final Field sBottom;
        private static final Method sGetOpticalInsets;
        private static final Field sLeft;
        private static final boolean sReflectionSuccessful;
        private static final Field sRight;
        private static final Field sTop;

        private Api18Impl() {
        }

        public static Rect getOpticalInsets(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && sReflectionSuccessful) {
                try {
                    Object invoke = sGetOpticalInsets.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(sLeft.getInt(invoke), sTop.getInt(invoke), sRight.getInt(invoke), sBottom.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return DrawableUtils.INSETS_NONE;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: NoSuchFieldException -> 0x004c, ClassNotFoundException -> 0x0050, NoSuchMethodException -> 0x0054
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: NoSuchFieldException -> 0x004c, ClassNotFoundException -> 0x0050, NoSuchMethodException -> 0x0054
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: NoSuchFieldException -> 0x004c, ClassNotFoundException -> 0x0050, NoSuchMethodException -> 0x0054
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: NoSuchFieldException -> 0x0040, ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0048
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: NoSuchFieldException -> 0x0036, ClassNotFoundException -> 0x003a, NoSuchMethodException -> 0x003d
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: NoSuchMethodException | ClassNotFoundException | NoSuchFieldException -> 0x0033
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: NoSuchMethodException | ClassNotFoundException | NoSuchFieldException -> 0x0031
                r8 = 1
                goto L_0x005a
            L_0x0031:
                goto L_0x0058
            L_0x0033:
                r7 = r1
                goto L_0x0058
            L_0x0036:
                r6 = r1
            L_0x0038:
                r7 = r6
                goto L_0x0058
            L_0x003a:
                r6 = r1
                goto L_0x0038
            L_0x003d:
                r6 = r1
                goto L_0x0038
            L_0x0040:
                r5 = r1
            L_0x0042:
                r6 = r5
                goto L_0x0038
            L_0x0044:
                r5 = r1
            L_0x0046:
                r6 = r5
                goto L_0x0038
            L_0x0048:
                r5 = r1
            L_0x004a:
                r6 = r5
                goto L_0x0038
            L_0x004c:
                r4 = r1
                r5 = r4
                goto L_0x0042
            L_0x0050:
                r4 = r1
                r5 = r4
                goto L_0x0046
            L_0x0054:
                r4 = r1
                r5 = r4
                goto L_0x004a
            L_0x0058:
                r3 = r1
                r8 = 0
            L_0x005a:
                if (r8 == 0) goto L_0x0069
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets = r4
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft = r5
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop = r6
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight = r7
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom = r3
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful = r0
                goto L_0x0075
            L_0x0069:
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful = r2
            L_0x0075:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DrawableUtils.Api18Impl.<clinit>():void");
        }
    }
}
