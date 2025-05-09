package androidx.transition;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ImageViewUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static Field sDrawMatrixField = null;
    private static boolean sDrawMatrixFieldFetched = false;
    private static boolean sTryHiddenAnimateTransform = true;

    private ImageViewUtils() {
    }

    public static void animateTransform(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else {
            hiddenAnimateTransform(imageView, matrix);
        }
    }

    private static void fetchDrawMatrixField() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a49966c2", new Object[0]);
        } else if (!sDrawMatrixFieldFetched) {
            try {
                Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
                sDrawMatrixField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            sDrawMatrixFieldFetched = true;
        }
    }

    private static void hiddenAnimateTransform(ImageView imageView, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2298106", new Object[]{imageView, matrix});
        } else if (sTryHiddenAnimateTransform) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                sTryHiddenAnimateTransform = false;
            }
        }
    }
}
