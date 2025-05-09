package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.flexa.IKTProxy;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class r2s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TLFlexaLiveRemoteX";
    public static final r2s INSTANCE = new r2s();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, IKTProxy> f27073a = new LinkedHashMap();

    static {
        t2o.a(1003487257);
    }

    public final Map<String, IKTProxy> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("37be3e07", new Object[]{this});
        }
        return f27073a;
    }

    public final void b(Map<String, IKTProxy> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76dc5aff", new Object[]{this, map});
            return;
        }
        ckf.g(map, "map");
        f27073a.putAll(map);
    }
}
