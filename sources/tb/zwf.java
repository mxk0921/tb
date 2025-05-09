package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944681);
    }

    public static <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("dfabad98", new Object[]{str, cls});
        }
        try {
            return (T) JSON.parseObject(str, cls);
        } catch (Throwable unused) {
            kgh.c("JsonUtil", "json can not convert to ".concat(cls.getName()));
            return null;
        }
    }

    public static String b(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("161d0c5", new Object[]{map});
        }
        return JSON.toJSONString(map);
    }
}
