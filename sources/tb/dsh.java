package tb;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dsh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(980418681);
    }

    public static int a(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48fb0731", new Object[]{fragmentActivity})).intValue();
        }
        if (fragmentActivity == null) {
            return 0;
        }
        TypedArray obtainStyledAttributes = fragmentActivity.obtainStyledAttributes(new int[]{16843499});
        int dimension = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        return dimension;
    }

    public static Bitmap c(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6bd6d5fd", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = i / height;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static final int b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24399fe5", new Object[]{context, str})).intValue();
        }
        if (context == null || context.getResources() == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getIdentifier("uik_icon_" + str, "string", context.getPackageName());
    }
}
