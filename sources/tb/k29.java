package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.concurrent.ConcurrentMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class k29 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final k29 INSTANCE = new k29();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentMap<String, l29> f22362a = new ConcurrentMap<>();

    static {
        t2o.a(1007681550);
    }

    public final Boolean a(String str, String str2) {
        List<String> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e727b4fa", new Object[]{this, str, str2});
        }
        l29 l29Var = f22362a.get(str);
        if (l29Var == null || (b = l29Var.b()) == null) {
            return null;
        }
        return Boolean.valueOf(b.contains(str2));
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a42606", new Object[]{this, str});
            return;
        }
        ckf.g(str, "userId");
        f22362a.removeKey(str);
    }

    public final l29 d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l29) ipChange.ipc$dispatch("a0bc726d", new Object[]{this, str});
        }
        ckf.g(str, "userId");
        return f22362a.get(str);
    }

    public final void e(String str, l29 l29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8bcc17", new Object[]{this, str, l29Var});
            return;
        }
        ckf.g(str, "userId");
        ckf.g(l29Var, "data");
        f22362a.putValue(str, l29Var);
    }

    public final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2160ee2", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "userId");
        ckf.g(str2, "itemId");
        Boolean a2 = a(str, str2);
        if (a2 != null) {
            return a2.booleanValue();
        }
        return false;
    }
}
