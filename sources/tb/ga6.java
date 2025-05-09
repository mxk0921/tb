package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader;
import com.taobao.android.dinamicx.widget.refresh.layout.constant.DXRefreshState;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ga6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597653);
    }

    public static TBAbsRefreshHeader.RefreshState a(DXRefreshState dXRefreshState, TBAbsRefreshHeader.RefreshState refreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBAbsRefreshHeader.RefreshState) ipChange.ipc$dispatch("420d6c3e", new Object[]{dXRefreshState, refreshState});
        }
        if (dXRefreshState == null) {
            return null;
        }
        if (dXRefreshState == DXRefreshState.None) {
            return TBAbsRefreshHeader.RefreshState.NONE;
        }
        if (dXRefreshState == DXRefreshState.PullDownToRefresh) {
            return TBAbsRefreshHeader.RefreshState.PULL_TO_REFRESH;
        }
        if (dXRefreshState == DXRefreshState.ReleaseToRefresh) {
            return TBAbsRefreshHeader.RefreshState.RELEASE_TO_REFRESH;
        }
        if (dXRefreshState == DXRefreshState.Refreshing) {
            return TBAbsRefreshHeader.RefreshState.REFRESHING;
        }
        if (dXRefreshState == DXRefreshState.RefreshFinish) {
            return TBAbsRefreshHeader.RefreshState.NONE;
        }
        if (dXRefreshState == DXRefreshState.ReleaseToTwoLevel) {
            return TBAbsRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR;
        }
        return refreshState;
    }
}
