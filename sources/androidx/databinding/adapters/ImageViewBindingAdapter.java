package androidx.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ImageViewBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void setImageDrawable(ImageView imageView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e479f03c", new Object[]{imageView, drawable});
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    public static void setImageUri(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976e7f9e", new Object[]{imageView, str});
        } else if (str == null) {
            imageView.setImageURI(null);
        } else {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public static void setImageUri(ImageView imageView, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b9034f3", new Object[]{imageView, uri});
        } else {
            imageView.setImageURI(uri);
        }
    }
}
