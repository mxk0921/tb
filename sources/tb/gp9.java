package tb;

import android.content.Context;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gp9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(435159122);
    }

    public static hp9 a(Context context, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hp9) ipChange.ipc$dispatch("d222bfff", new Object[]{context, handler});
        }
        return new hp9(context, handler);
    }

    public static Map<String, Integer> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83482f49", new Object[0]);
        }
        Map<String, Integer> g = ep9.h().g();
        yv8.e("FloatWindowTrigger.getAllWindowStatus=%s", g);
        return g;
    }
}
