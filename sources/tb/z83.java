package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class z83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321914);
    }

    public static int a(int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f831a04", new Object[]{new Integer(i), aVar})).intValue();
        }
        if (aVar == null) {
            return i;
        }
        if (aVar.r0()) {
            return i - 1;
        }
        return i;
    }
}
