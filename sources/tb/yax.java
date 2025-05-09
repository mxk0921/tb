package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yax {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700044);
    }

    public static String a(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("538dfeb4", new Object[]{ux9Var});
        }
        if (!(ux9Var instanceof t54)) {
            return "";
        }
        t54 t54Var = (t54) ux9Var;
        if (t54Var.w0() == null || t54Var.w0().whiteUserDataMap == null) {
            return "";
        }
        Map<String, Object> map = t54Var.w0().whiteUserDataMap;
        StringBuilder sb = new StringBuilder();
        for (Object obj : map.values()) {
            if (obj instanceof String) {
                sb.append((String) obj);
            }
        }
        return sb.toString();
    }
}
