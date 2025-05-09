package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ea0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HistoryCellBean f18398a;

    static {
        t2o.a(815793210);
    }

    public ea0(HistoryCellBean historyCellBean) {
        this.f18398a = historyCellBean;
    }

    public static ea0 a(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ea0) ipChange.ipc$dispatch("10ceb9a0", new Object[]{historyCellBean});
        }
        return new ea0(historyCellBean);
    }
}
