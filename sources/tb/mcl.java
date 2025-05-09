package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.constants.OrderBizCode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mcl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(297795653);
    }

    public static <T> T b(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Exception e) {
            idl.d(OrderBizCode.logisticsDetail, "反射创建失败", str + "," + e.getMessage());
            return null;
        }
    }

    public static Object a(String str, String str2, Object obj, Class<?> cls) {
        try {
            return Class.forName(str).getMethod(str2, cls).invoke(null, obj);
        } catch (Exception e) {
            idl.d(OrderBizCode.logisticsDetail, "反射调用static方法失败", str + "," + str2 + "," + e.getMessage());
            return null;
        }
    }
}
