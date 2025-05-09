package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.instance.WeexDOMInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p4x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982516267);
    }

    public static String a(WeexInstance weexInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("325c356b", new Object[]{weexInstance, str});
        }
        if (!(weexInstance instanceof WeexDOMInstance)) {
            return str;
        }
        return ((WeexDOMInstance) weexInstance).getOriginURLString() + str;
    }
}
