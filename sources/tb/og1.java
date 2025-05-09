package tb;

import android.content.Context;
import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class og1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698638);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d990f02a", new Object[0])).intValue();
        }
        if (nh4.v()) {
            return Color.parseColor("#11192D");
        }
        return Color.parseColor("#000000");
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75fd21fd", new Object[0])).intValue();
        }
        if (nh4.v()) {
            return 76;
        }
        return 51;
    }

    public static float c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8174c8a4", new Object[]{context})).floatValue();
        }
        if (nh4.v()) {
            return hw0.b(context, 6.0f);
        }
        return hw0.b(context, 12.0f);
    }
}
