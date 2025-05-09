package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xwh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982516253);
    }

    public static Method a(Class cls, String str, Class... clsArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("3e76b86d", new Object[]{cls, str, clsArr});
        }
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
