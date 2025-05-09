package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y88 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705478);
    }

    public static Class a(Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3895ee34", new Object[]{type});
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getActualTypeArguments().length > 0) {
            return a(parameterizedType.getActualTypeArguments()[0]);
        }
        return null;
    }
}
