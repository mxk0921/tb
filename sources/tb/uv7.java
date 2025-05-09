package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class uv7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29632a;

    static {
        t2o.a(1022361662);
    }

    public uv7(Map<?, ?> map) {
        ckf.g(map, "data");
        this.f29632a = ht4.e(map, "path");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        return this.f29632a;
    }
}
