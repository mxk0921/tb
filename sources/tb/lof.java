package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.widget.swipe.SwipeFrameLayout;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.schedule.ViewProxy;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lof {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v0c f23468a;
        public final /* synthetic */ kmb b;
        public final /* synthetic */ IDMComponent c;
        public final /* synthetic */ DXRootView d;

        public a(v0c v0cVar, kmb kmbVar, IDMComponent iDMComponent, DXRootView dXRootView) {
            this.f23468a = v0cVar;
            this.b = kmbVar;
            this.c = iDMComponent;
            this.d = dXRootView;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            if (!this.f23468a.a()) {
                return false;
            }
            cb4.g(this.b, this.c.getKey(), "itemLongClick", this.d);
            return true;
        }
    }

    static {
        t2o.a(478151167);
    }

    public static boolean a(kmb kmbVar, List<IDMComponent> list, RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50487ecb", new Object[]{kmbVar, list, viewHolder, new Integer(i)})).booleanValue();
        }
        fwi fwiVar = new fwi(kmbVar);
        if (!(list == null || viewHolder == null || !fwiVar.a())) {
            IDMComponent iDMComponent = list.get(i);
            View view = viewHolder.itemView;
            if (view instanceof DXRootView) {
                DXRootView dXRootView = (DXRootView) view;
                if (dXRootView.getFlattenWidgetNode() != null) {
                    DXWidgetNode queryWidgetNodeByUserId = dXRootView.getFlattenWidgetNode().queryWidgetNodeByUserId("main");
                    View D = (queryWidgetNodeByUserId == null || queryWidgetNodeByUserId.getDXRuntimeContext() == null) ? null : queryWidgetNodeByUserId.getDXRuntimeContext().D();
                    if (D instanceof SwipeFrameLayout) {
                        SwipeFrameLayout swipeFrameLayout = (SwipeFrameLayout) D;
                        swipeFrameLayout.setOnLongClickListener(null);
                        swipeFrameLayout.setOnLongClick(new a(fwiVar, kmbVar, iDMComponent, dXRootView));
                        ViewProxy.setOnLongClickListener(viewHolder.itemView, null);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
