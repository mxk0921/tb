package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Class<? extends dbd>> f26071a;

    public pfw() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(4);
        this.f26071a = concurrentHashMap;
        concurrentHashMap.put(1, z28.class);
    }

    public dbd a(int i) {
        Class cls = (Class) ((ConcurrentHashMap) this.f26071a).get(Integer.valueOf(i));
        if (cls == null) {
            return null;
        }
        try {
            return (dbd) cls.newInstance();
        } catch (Throwable th) {
            vfm.d("getViewProvider error, class=".concat(cls.getName()), th);
            return null;
        }
    }

    public void b(int i, Class<? extends dbd> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85313e5", new Object[]{this, new Integer(i), cls});
        } else if (cls != null) {
            ((ConcurrentHashMap) this.f26071a).put(Integer.valueOf(i), cls);
        }
    }
}
