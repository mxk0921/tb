package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class spd implements jpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(664797265);
        t2o.a(664797264);
    }

    @Override // tb.jpd
    public boolean a(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfa241d0", new Object[]{this, arrayList, tBShareContent, str})).booleanValue();
        }
        b(arrayList, tBShareContent, str);
        return false;
    }

    public abstract void b(ArrayList<String> arrayList, TBShareContent tBShareContent, String str);
}
