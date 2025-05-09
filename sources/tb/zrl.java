package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zrl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356154);
    }

    public static final JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f057a803", new Object[]{str});
        }
        return fkx.d(str);
    }

    public static final <T> T b(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7e42d1b8", new Object[]{str, cls});
        }
        return (T) fkx.f(str, cls);
    }
}
