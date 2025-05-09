package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ?> f19688a;

    public g1r(Map<String, ?> map) {
        this.f19688a = map == null ? new HashMap<>() : map;
    }

    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5afd29d6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Object obj = this.f19688a.get(str);
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    return Boolean.parseBoolean((String) obj);
                }
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue();
                }
            } catch (Exception e) {
                xhh.c(e);
            }
        }
        return z;
    }
}
