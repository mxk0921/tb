package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class p2v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f25844a;

    static {
        t2o.a(1022361959);
    }

    public p2v(Map<?, ?> map) {
        ckf.g(map, "data");
        this.f25844a = ht4.a(map, "success");
    }

    public final Boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("9e0b1651", new Object[]{this});
        }
        return this.f25844a;
    }
}
