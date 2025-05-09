package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class fl2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f19375a;

    static {
        t2o.a(1022361622);
    }

    public fl2(Map<?, ?> map) {
        ckf.g(map, "data");
        this.f19375a = ht4.e(map, "listenerId");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5114f734", new Object[]{this});
        }
        return this.f19375a;
    }
}
