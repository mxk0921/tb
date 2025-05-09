package androidx.core.graphics.drawable;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0086\b¨\u0006\u0004"}, d2 = {"toDrawable", "Landroid/graphics/drawable/ColorDrawable;", "Landroid/graphics/Color;", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ColorDrawableKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final ColorDrawable toDrawable(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ColorDrawable) ipChange.ipc$dispatch("a41932c0", new Object[]{new Integer(i)}) : new ColorDrawable(i);
    }

    public static final ColorDrawable toDrawable(Color color) {
        int argb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorDrawable) ipChange.ipc$dispatch("e0018e2d", new Object[]{color});
        }
        argb = color.toArgb();
        return new ColorDrawable(argb);
    }
}
