package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class CheckedTextViewCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static ColorStateList getCheckMarkTintList(CheckedTextView checkedTextView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorStateList) ipChange.ipc$dispatch("20e56a74", new Object[]{checkedTextView});
            }
            return checkedTextView.getCheckMarkTintList();
        }

        public static PorterDuff.Mode getCheckMarkTintMode(CheckedTextView checkedTextView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PorterDuff.Mode) ipChange.ipc$dispatch("c5acc5c", new Object[]{checkedTextView});
            }
            return checkedTextView.getCheckMarkTintMode();
        }

        public static void setCheckMarkTintList(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13909c12", new Object[]{checkedTextView, colorStateList});
            } else {
                checkedTextView.setCheckMarkTintList(colorStateList);
            }
        }

        public static void setCheckMarkTintMode(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("925cae24", new Object[]{checkedTextView, mode});
            } else {
                checkedTextView.setCheckMarkTintMode(mode);
            }
        }
    }

    private CheckedTextViewCompat() {
    }

    public static Drawable getCheckMarkDrawable(CheckedTextView checkedTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("f4a8ee95", new Object[]{checkedTextView});
        }
        return checkedTextView.getCheckMarkDrawable();
    }

    public static ColorStateList getCheckMarkTintList(CheckedTextView checkedTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("20e56a74", new Object[]{checkedTextView});
        }
        return Api21Impl.getCheckMarkTintList(checkedTextView);
    }

    public static PorterDuff.Mode getCheckMarkTintMode(CheckedTextView checkedTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("c5acc5c", new Object[]{checkedTextView});
        }
        return Api21Impl.getCheckMarkTintMode(checkedTextView);
    }

    public static void setCheckMarkTintList(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13909c12", new Object[]{checkedTextView, colorStateList});
        } else {
            Api21Impl.setCheckMarkTintList(checkedTextView, colorStateList);
        }
    }

    public static void setCheckMarkTintMode(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925cae24", new Object[]{checkedTextView, mode});
        } else {
            Api21Impl.setCheckMarkTintMode(checkedTextView, mode);
        }
    }
}
