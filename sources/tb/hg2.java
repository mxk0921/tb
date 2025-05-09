package tb;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hg2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713750);
    }

    public static Bitmap a(int i, RenderScript renderScript, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("7284c4ef", new Object[]{new Integer(i), renderScript, bitmap});
        }
        Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap);
        Allocation createTyped = Allocation.createTyped(renderScript, createFromBitmap.getType());
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        create.setRadius(i);
        create.setInput(createFromBitmap);
        create.forEach(createTyped);
        createTyped.copyTo(bitmap);
        return bitmap;
    }

    public static TextureView b(ViewGroup viewGroup) {
        TextureView b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("4d19f8c2", new Object[]{viewGroup});
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (b = b((ViewGroup) childAt)) != null) {
                return b;
            }
        }
        return null;
    }
}
