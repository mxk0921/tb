package tb;

import android.graphics.drawable.GradientDrawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.stylekit.datatype.GradientColorVO;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yx7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1039138857);
    }

    public static GradientDrawable a(int i, int i2, int i3, float f, GradientColorVO gradientColorVO) {
        GradientDrawable gradientDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("f7dbbafd", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Float(f), gradientColorVO});
        }
        if (gradientColorVO == null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(i);
            gradientDrawable = gradientDrawable2;
        } else if (gradientColorVO.type == GradientColorVO.VERTICAL) {
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, gradientColorVO.colors);
        } else {
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, gradientColorVO.colors);
        }
        gradientDrawable.setGradientType(0);
        gradientDrawable.setStroke(i3, i2);
        gradientDrawable.setCornerRadius(f);
        return gradientDrawable;
    }
}
