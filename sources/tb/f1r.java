package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ?> f18947a;

    static {
        t2o.a(408944655);
    }

    public f1r(Map<String, ?> map) {
        this.f18947a = map == null ? new HashMap<>() : map;
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10d58f94", new Object[]{this, str, str2});
        }
        Object obj = this.f18947a.get(str);
        if (obj == null || !(obj instanceof String)) {
            return str2;
        }
        return (String) obj;
    }

    public boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5afd29d6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Object obj = this.f18947a.get(str);
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    return Boolean.parseBoolean((String) obj);
                }
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue();
                }
            } catch (Exception e) {
                uhh.d(e);
            }
        }
        return z;
    }
}
