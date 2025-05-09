package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class bl1 implements zab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(860880925);
        t2o.a(79691831);
    }

    @Override // tb.zab
    public boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63f7f74c", new Object[]{this, map})).booleanValue();
        }
        return true;
    }

    @Override // tb.zab
    public void b(lo loVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eddffdb", new Object[]{this, loVar});
        }
    }
}
