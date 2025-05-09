package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962592982);
    }

    public static Map<String, String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9487013c", new Object[]{context});
        }
        return o1v.b(context);
    }
}
