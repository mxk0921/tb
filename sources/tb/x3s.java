package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class x3s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356518);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bc05aa3", new Object[]{new Integer(i)})).intValue();
        }
        return new Random(System.currentTimeMillis()).nextInt(i);
    }
}
