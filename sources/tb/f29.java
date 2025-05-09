package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.concurrent.ConcurrentMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class f29 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentMap<String, String> f18958a = new ConcurrentMap<>();
    public final ConcurrentMap<String, g29> b = new ConcurrentMap<>();

    static {
        t2o.a(1007681548);
    }

    public final g29 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g29) ipChange.ipc$dispatch("b7db1562", new Object[]{this, str});
        }
        ckf.g(str, "id");
        return this.b.get(str);
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6e16d90", new Object[]{this, str});
        }
        ckf.g(str, "id");
        return this.f18958a.get(str);
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2e49a2", new Object[]{this, str});
            return;
        }
        ckf.g(str, "id");
        this.b.removeKey(str);
    }

    public final void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543e2d76", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "id");
        ckf.g(str2, "favCount");
        this.b.putValue(str, new g29(str, str2));
    }

    public final void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee6ad92", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "id");
        ckf.g(str2, "favCount");
        this.f18958a.putValue(str, str2);
    }
}
