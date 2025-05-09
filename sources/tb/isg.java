package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.linkback.LinkBackUrlExecutor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class isg implements hsg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e7faa4", new Object[]{this, str})).booleanValue();
        }
        return LinkBackUrlExecutor.S_ROUTE_EXCLUSION.contains(str);
    }
}
