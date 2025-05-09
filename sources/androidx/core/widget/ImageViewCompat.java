package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ImageViewCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static ColorStateList getImageTintList(ImageView imageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorStateList) ipChange.ipc$dispatch("1b74f535", new Object[]{imageView});
            }
            return imageView.getImageTintList();
        }

        public static PorterDuff.Mode getImageTintMode(ImageView imageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PorterDuff.Mode) ipChange.ipc$dispatch("d600839d", new Object[]{imageView});
            }
            return imageView.getImageTintMode();
        }

        public static void setImageTintList(ImageView imageView, ColorStateList colorStateList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a574aa71", new Object[]{imageView, colorStateList});
            } else {
                imageView.setImageTintList(colorStateList);
            }
        }

        public static void setImageTintMode(ImageView imageView, PorterDuff.Mode mode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c58c6003", new Object[]{imageView, mode});
            } else {
                imageView.setImageTintMode(mode);
            }
        }
    }

    private ImageViewCompat() {
    }

    public static ColorStateList getImageTintList(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("1b74f535", new Object[]{imageView});
        }
        return Api21Impl.getImageTintList(imageView);
    }

    public static PorterDuff.Mode getImageTintMode(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("d600839d", new Object[]{imageView});
        }
        return Api21Impl.getImageTintMode(imageView);
    }

    public static void setImageTintList(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a574aa71", new Object[]{imageView, colorStateList});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Api21Impl.setImageTintList(imageView, colorStateList);
        if (i == 21 && (drawable = imageView.getDrawable()) != null && Api21Impl.getImageTintList(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public static void setImageTintMode(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58c6003", new Object[]{imageView, mode});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Api21Impl.setImageTintMode(imageView, mode);
        if (i == 21 && (drawable = imageView.getDrawable()) != null && Api21Impl.getImageTintList(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }
}
