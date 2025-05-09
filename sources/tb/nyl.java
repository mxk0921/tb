package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXModule;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class nyl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Boolean> f25034a;

    static {
        t2o.a(144703568);
    }

    public nyl(Map<String, Boolean> map) {
        ckf.g(map, WXModule.GRANT_RESULTS);
        this.f25034a = map;
    }

    public final Map<String, Boolean> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("11b3002c", new Object[]{this});
        }
        return this.f25034a;
    }
}
