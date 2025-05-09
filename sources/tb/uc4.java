package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uc4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class<? extends la4>> f29288a = new ConcurrentHashMap();

    static {
        t2o.a(758120472);
    }

    public static Class<? extends la4> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("64b86bef", new Object[]{str});
        }
        return (Class) ((ConcurrentHashMap) f29288a).get(str);
    }

    public static void b(String str, Class<? extends la4> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb9ae0c9", new Object[]{str, cls});
        } else if (!TextUtils.isEmpty(str)) {
            Map<String, Class<? extends la4>> map = f29288a;
            if (((ConcurrentHashMap) map).containsKey(str)) {
                if (!((Class) ((ConcurrentHashMap) map).get(str)).equals(cls)) {
                    throw new IllegalStateException("This component type = " + str + " was registed");
                }
            } else if (cls != null) {
                ((ConcurrentHashMap) map).put(str, cls);
            }
        }
    }
}
