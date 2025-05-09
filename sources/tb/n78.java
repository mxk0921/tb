package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.core.EditionSwitchServiceImpl;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n78 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<Class<? extends qod>, qod> f24554a;

    static {
        t2o.a(456130599);
        HashMap<Class<? extends qod>, qod> hashMap = new HashMap<>();
        f24554a = hashMap;
        hashMap.put(t1c.class, new EditionSwitchServiceImpl());
        hashMap.put(scc.class, new xya());
    }

    public static <T extends qod> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((qod) ipChange.ipc$dispatch("75cf46e4", new Object[]{cls}));
        }
        return (T) f24554a.get(cls);
    }
}
