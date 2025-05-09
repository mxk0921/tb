package tb;

import androidx.collection.LongSparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.model.DXReadWriteLongSparseArray;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.recycler.event.DXRecyclerLayoutOnPullDistanceEvent;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e5n implements TBSwipeRefreshLayout.j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXRECYCLERLAYOUT_ONPULLTOREFRESH = 3436304507723682587L;

    /* renamed from: a  reason: collision with root package name */
    public final DXEvent f18297a = new DXEvent(DXRECYCLERLAYOUT_ONPULLTOREFRESH);
    public DXRecyclerLayout b;
    public TBSwipeRefreshLayout.j c;
    public boolean d;

    static {
        t2o.a(444597522);
        t2o.a(444597603);
    }

    public e5n(DXRecyclerLayout dXRecyclerLayout) {
        this.b = dXRecyclerLayout;
        c();
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.j
    public void a(TBAbsRefreshHeader.RefreshState refreshState, TBAbsRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d44590e6", new Object[]{this, refreshState, refreshState2});
            return;
        }
        TBSwipeRefreshLayout.j jVar = this.c;
        if (jVar != null) {
            jVar.a(refreshState, refreshState2);
        }
    }

    public void b(TBSwipeRefreshLayout.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("188f0a0d", new Object[]{this, jVar});
        } else {
            this.c = jVar;
        }
    }

    public void c() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621b062", new Object[]{this});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = this.b;
        if (dXRecyclerLayout == null) {
            this.d = false;
        } else if (dXRecyclerLayout.isV4Node()) {
            DXReadWriteLongSparseArray<nvb> h = this.b.getDxv4Properties().h();
            if (!(h == null || h.get(DXRecyclerLayoutOnPullDistanceEvent.DXRECYCLERLAYOUT_ONPULLDISTANCE_ANDROID) == null)) {
                z = true;
            }
            this.d = z;
        } else {
            LongSparseArray<fw5> eventHandlersExprNode = this.b.getEventHandlersExprNode();
            if (!(eventHandlersExprNode == null || eventHandlersExprNode.get(DXRecyclerLayoutOnPullDistanceEvent.DXRECYCLERLAYOUT_ONPULLDISTANCE_ANDROID) == null)) {
                z = true;
            }
            this.d = z;
        }
    }

    public void d(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505ada", new Object[]{this, dXRecyclerLayout});
        } else {
            this.b = dXRecyclerLayout;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.j
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.b != null && this.d) {
            this.b.postEvent(new DXRecyclerLayoutOnPullDistanceEvent(i));
        }
        TBSwipeRefreshLayout.j jVar = this.c;
        if (jVar != null) {
            jVar.onPullDistance(i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.j
    public void onRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = this.b;
        if (dXRecyclerLayout != null) {
            dXRecyclerLayout.postEvent(this.f18297a);
        }
        TBSwipeRefreshLayout.j jVar = this.c;
        if (jVar != null) {
            jVar.onRefresh();
        }
    }
}
