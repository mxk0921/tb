package tb;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qu5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int[] STATE_CHECKED = {16842912};

    static {
        t2o.a(444597687);
    }

    public static StateListDrawable a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateListDrawable) ipChange.ipc$dispatch("27872640", new Object[]{drawable, drawable2, drawable3, drawable4});
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912, -16842910}, drawable3);
        stateListDrawable.addState(new int[]{-16842912, -16842910}, drawable4);
        stateListDrawable.addState(new int[]{16842912}, drawable);
        stateListDrawable.addState(new int[]{-16842912}, drawable2);
        return stateListDrawable;
    }

    public static StateListDrawable b(Drawable drawable, Drawable drawable2, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateListDrawable) ipChange.ipc$dispatch("1a28b443", new Object[]{drawable, drawable2, iArr});
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(iArr, drawable);
        stateListDrawable.addState(new int[0], drawable2);
        return stateListDrawable;
    }

    public static GradientDrawable c(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("74ceeb98", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(i, i2);
        gradientDrawable.setCornerRadius(i3);
        gradientDrawable.setColor(i4);
        gradientDrawable.setSize(i5, i6);
        return gradientDrawable;
    }
}
