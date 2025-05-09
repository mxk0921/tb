package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class evh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Integer a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("3e5b837f", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (Exception e) {
                guh.b(guh.TAG, "Integer 数据解析异常。", e);
            }
        }
        guh.a(guh.TAG, "数据转换异常，无法转 int 。value:" + obj);
        return null;
    }
}
