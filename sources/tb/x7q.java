package tb;

import androidx.recyclerview.widget.PagerSnapHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.pagersnap.CellPagerSnapHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x7q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597510);
    }

    public CellPagerSnapHelper a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CellPagerSnapHelper) ipChange.ipc$dispatch("6c637262", new Object[]{this});
        }
        return new CellPagerSnapHelper();
    }

    public PagerSnapHelper b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PagerSnapHelper) ipChange.ipc$dispatch("ae32d18a", new Object[]{this});
        }
        return new PagerSnapHelper();
    }
}
