package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.concurrent.ConcurrentMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class i29 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final i29 INSTANCE = new i29();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentMap<String, Boolean> f21050a = new ConcurrentMap<>();

    static {
        t2o.a(1007681549);
    }

    public final void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c62cd0", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ckf.g(str, "userId");
        f21050a.putValue(str, Boolean.valueOf(z));
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("368dfeca", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "userId");
        Boolean bool = f21050a.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
