package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zu1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class<? extends BaseFrame>> f33015a = new HashMap();

    static {
        t2o.a(806355032);
    }

    public static Class<? extends BaseFrame> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7544247f", new Object[]{str});
        }
        return (Class) ((HashMap) f33015a).get(str);
    }

    public static void b(String str, Class<? extends BaseFrame> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ced1102", new Object[]{str, cls});
        } else {
            ((HashMap) f33015a).put(str, cls);
        }
    }
}
