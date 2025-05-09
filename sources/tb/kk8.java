package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kk8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321626);
        new HashMap(32);
    }

    public static <T extends pt1> int a(Class<T> cls, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("461ffe06", new Object[]{cls, obj})).intValue();
        }
        return (cls.toString() + obj).hashCode();
    }
}
