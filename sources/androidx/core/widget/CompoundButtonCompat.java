package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class CompoundButtonCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CompoundButtonCompat";
    private static Field sButtonDrawableField;
    private static boolean sButtonDrawableFieldFetched;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static ColorStateList getButtonTintList(CompoundButton compoundButton) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorStateList) ipChange.ipc$dispatch("ffbeeee3", new Object[]{compoundButton});
            }
            return compoundButton.getButtonTintList();
        }

        public static PorterDuff.Mode getButtonTintMode(CompoundButton compoundButton) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PorterDuff.Mode) ipChange.ipc$dispatch("dfa57cf5", new Object[]{compoundButton});
            }
            return compoundButton.getButtonTintMode();
        }

        public static void setButtonTintList(CompoundButton compoundButton, ColorStateList colorStateList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b65dff83", new Object[]{compoundButton, colorStateList});
            } else {
                compoundButton.setButtonTintList(colorStateList);
            }
        }

        public static void setButtonTintMode(CompoundButton compoundButton, PorterDuff.Mode mode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccaceaab", new Object[]{compoundButton, mode});
            } else {
                compoundButton.setButtonTintMode(mode);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static Drawable getButtonDrawable(CompoundButton compoundButton) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("ca1e0bae", new Object[]{compoundButton});
            }
            return compoundButton.getButtonDrawable();
        }
    }

    private CompoundButtonCompat() {
    }

    public static Drawable getButtonDrawable(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getButtonDrawable(compoundButton);
        }
        if (!sButtonDrawableFieldFetched) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                sButtonDrawableField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            sButtonDrawableFieldFetched = true;
        }
        Field field = sButtonDrawableField;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                sButtonDrawableField = null;
            }
        }
        return null;
    }

    public static ColorStateList getButtonTintList(CompoundButton compoundButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("ffbeeee3", new Object[]{compoundButton});
        }
        return Api21Impl.getButtonTintList(compoundButton);
    }

    public static PorterDuff.Mode getButtonTintMode(CompoundButton compoundButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("dfa57cf5", new Object[]{compoundButton});
        }
        return Api21Impl.getButtonTintMode(compoundButton);
    }

    public static void setButtonTintList(CompoundButton compoundButton, ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65dff83", new Object[]{compoundButton, colorStateList});
        } else {
            Api21Impl.setButtonTintList(compoundButton, colorStateList);
        }
    }

    public static void setButtonTintMode(CompoundButton compoundButton, PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccaceaab", new Object[]{compoundButton, mode});
        } else {
            Api21Impl.setButtonTintMode(compoundButton, mode);
        }
    }
}
