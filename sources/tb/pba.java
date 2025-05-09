package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class pba {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final pba INSTANCE = new pba();

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<BaseCellBean> f25996a = new HashSet<>();

    static {
        t2o.a(815792856);
    }

    public final void a(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9c528b", new Object[]{this, baseCellBean});
            return;
        }
        ckf.g(baseCellBean, "item");
        if (!baseCellBean.exposeRecord && !TextUtils.isEmpty(baseCellBean.itemId)) {
            f25996a.add(baseCellBean);
        }
    }

    public final Set<BaseCellBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c0c3c613", new Object[]{this});
        }
        return f25996a;
    }

    public final void c(ArrayList<BaseCellBean> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641c8b6a", new Object[]{this, arrayList});
            return;
        }
        ckf.g(arrayList, "reportCells");
        for (BaseCellBean baseCellBean : arrayList) {
            baseCellBean.exposeRecord = true;
            f25996a.remove(baseCellBean);
        }
    }
}
