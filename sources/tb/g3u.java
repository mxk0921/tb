package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.h3p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g3u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f19714a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public Map<String, String> g;
    public List<g3u> h;
    public Map<String, String> i;

    static {
        t2o.a(815792523);
    }

    public int a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81c9745f", new Object[]{this, new Boolean(z)})).intValue();
        }
        IpChange ipChange2 = h3p.$ipChange;
        return h3p.b(h3p.a.INSTANCE.f(), z);
    }
}
