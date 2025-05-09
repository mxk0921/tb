package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zt2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Map<String, xpj> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1d6a65e6", new Object[]{this});
        }
        return iof.h(ano.a().c("uikit_navigation_extern_cache", null));
    }

    public Map<String, List<xpj>> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6743f164", new Object[]{this});
        }
        return iof.i(ano.a().c("uikit_navigation_extern_cache_with_version", null));
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d219337", new Object[]{this, str})).booleanValue();
        }
        ano.a().d("uikit_navigation_extern_cache", str);
        return true;
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3a8f045", new Object[]{this, str})).booleanValue();
        }
        ano.a().d("uikit_navigation_extern_cache_with_version", str);
        return true;
    }
}
