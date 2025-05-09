package tb;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ocw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571217);
    }

    public static BitmapDrawable a(ViewGroup viewGroup) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("3d685ad0", new Object[]{viewGroup});
        }
        TextureView b = b(viewGroup);
        if (b == null || (bitmap = b.getBitmap()) == null || bitmap.getByteCount() <= 0) {
            return null;
        }
        return new BitmapDrawable(b.getContext().getResources(), bitmap);
    }

    public static TextureView b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("4d19f8c2", new Object[]{viewGroup});
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if (childAt instanceof ViewGroup) {
                return b((ViewGroup) childAt);
            }
        }
        return null;
    }
}
