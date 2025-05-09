package tb;

import android.graphics.PointF;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class grn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297644);
    }

    public static PointF a(PointF pointF, PointF pointF2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("5f4472cf", new Object[]{pointF, pointF2});
        }
        if (pointF.x / pointF.y > pointF2.x / pointF2.y) {
            float f = pointF2.x;
            return new PointF(f, (pointF.y * f) / pointF.x);
        }
        float f2 = pointF2.y;
        return new PointF((pointF.x * f2) / pointF.y, f2);
    }
}
