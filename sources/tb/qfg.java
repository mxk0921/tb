package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.label.LabelStyle;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qfg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767062);
    }

    public static LabelStyle a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LabelStyle) ipChange.ipc$dispatch("3980d42f", new Object[0]);
        }
        LabelStyle labelStyle = new LabelStyle();
        labelStyle.lineColor = 0;
        labelStyle.lineWidth = 10;
        int i = R.drawable.dw_umi_mark_shape_rect;
        labelStyle.labelBgLeft = i;
        labelStyle.labelBgRight = i;
        labelStyle.height = 26;
        labelStyle.dotSrc = R.drawable.dw_umi_mark_shape_dot;
        labelStyle.textSize = 12;
        return labelStyle;
    }
}
