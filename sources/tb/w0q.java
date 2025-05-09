package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w0q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301990062);
    }

    public static Bitmap a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bd7add26", new Object[]{context});
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return sm0.b(context, R.drawable.purchase_mask, displayMetrics.widthPixels, displayMetrics.heightPixels, false);
    }

    public static ImageView b(Context context, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("e0cebe9", new Object[]{context, bitmap});
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageBitmap(bitmap);
        return imageView;
    }
}
