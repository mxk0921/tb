package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f3x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18987a = false;
    public static final Map<String, Class<?>> b = new HashMap();

    static {
        t2o.a(713031809);
    }

    public static Class<?> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("a0cb3dcd", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, Class<?>> map = b;
        if (!((HashMap) map).containsKey(str)) {
            return null;
        }
        return (Class) ((HashMap) map).get(str);
    }
}
