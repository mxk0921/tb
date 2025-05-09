package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class iq0 implements hfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Boolean> f21502a = new HashMap();

    static {
        t2o.a(806355903);
        t2o.a(806355905);
    }

    @Override // tb.hfb
    public Map<String, Boolean> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83a2402a", new Object[]{this});
        }
        ((HashMap) this.f21502a).put("isTBLiveAPP", Boolean.FALSE);
        return this.f21502a;
    }
}
