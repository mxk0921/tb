package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ash {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Object a(Object obj, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("55414bb7", new Object[]{obj, cls});
        }
        if (obj == null || cls == null) {
            return null;
        }
        if (obj.getClass() == cls) {
            return obj;
        }
        if (cls == String.class) {
            return obj.toString();
        }
        return obj;
    }
}
