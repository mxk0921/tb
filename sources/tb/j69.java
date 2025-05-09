package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j69 implements eld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571133);
        t2o.a(573571134);
    }

    @Override // tb.eld
    public boolean a(nwi nwiVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb21e5f9", new Object[]{this, nwiVar, new Integer(i)})).booleanValue();
        }
        jgh.a("FeedsRule", "FeedsRule verify start.");
        if (lf4.b()) {
            jgh.a("FeedsRule", "chooseInteractImageInfo, continue, disableLinkedTexiuAd = true");
            return false;
        }
        jgh.a("FeedsRule", "FeedsRule verify end. ret=true");
        return true;
    }
}
