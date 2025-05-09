package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class gjm implements gbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<fjm> f20044a = new SparseArray<>();

    static {
        t2o.a(995098665);
        t2o.a(995098660);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.f20044a.clear();
        }
    }

    public fjm b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fjm) ipChange.ipc$dispatch("41bcf126", new Object[]{this, new Integer(i)});
        }
        return this.f20044a.get(i);
    }

    public void c(o02<? extends BaseSearchResult, LocalDataManager> o02Var) {
        BaseSearchResult baseSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6664c1", new Object[]{this, o02Var});
            return;
        }
        ckf.h(o02Var, c4o.KEY_DATA_SOURCE);
        BaseSearchResult baseSearchResult2 = (BaseSearchResult) o02Var.getTotalSearchResult();
        if (!(baseSearchResult2 == null || (baseSearchResult = (BaseSearchResult) o02Var.getLastSearchResult()) == null)) {
            int cellsCount = baseSearchResult2.getCellsCount() - baseSearchResult.getCellsCount();
            int cellsCount2 = baseSearchResult.getCellsCount();
            for (int i = 0; i < cellsCount2; i++) {
                BaseCellBean cell = baseSearchResult.getCell(i);
                this.f20044a.put(cellsCount + i, new fjm(cell.pageNo, cell.pagePos, cell.pageSize));
            }
        }
    }
}
