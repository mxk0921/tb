package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.widget.swipe.SwipeFrameLayout;
import com.taobao.android.icart.widget.touch.DXCartWrapperFrameLayoutWidgetNode;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.android.icart.widget.touch.DragManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.schedule.ViewProxy;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xw7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kmb f31637a;
    public final DragManager b;
    public final List<IDMComponent> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements neb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.neb
        public void a(List<IDMComponent> list, RecyclerViewHolder recyclerViewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae0ba1b", new Object[]{this, list, recyclerViewHolder, new Integer(i)});
            } else if (xw7.b(xw7.this).r((IDMComponent) xw7.a(xw7.this).get(i))) {
                xw7.c(xw7.this, recyclerViewHolder, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IDMComponent f31639a;
        public final /* synthetic */ RecyclerView.ViewHolder b;

        public b(IDMComponent iDMComponent, RecyclerView.ViewHolder viewHolder) {
            this.f31639a = iDMComponent;
            this.b = viewHolder;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            if (!xw7.b(xw7.this).r(this.f31639a)) {
                return false;
            }
            xw7.b(xw7.this).A(this.b.itemView, this.f31639a);
            return true;
        }
    }

    static {
        t2o.a(478151164);
    }

    public xw7(kmb kmbVar, DragManager dragManager, DragFloatLayer<String> dragFloatLayer) {
        this.f31637a = kmbVar;
        this.b = dragManager;
        this.c = kmbVar.e().t().H().getData();
    }

    public static /* synthetic */ List a(xw7 xw7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1d0390cf", new Object[]{xw7Var});
        }
        return xw7Var.c;
    }

    public static /* synthetic */ DragManager b(xw7 xw7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DragManager) ipChange.ipc$dispatch("5bb627b1", new Object[]{xw7Var});
        }
        return xw7Var.b;
    }

    public static /* synthetic */ void c(xw7 xw7Var, RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3952d469", new Object[]{xw7Var, viewHolder, new Integer(i)});
        } else {
            xw7Var.d(viewHolder, i);
        }
    }

    public final void d(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a15cb3e", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        b bVar = new b(this.c.get(i), viewHolder);
        View view = viewHolder.itemView;
        if (view instanceof DXRootView) {
            DXRootView dXRootView = (DXRootView) view;
            if (dXRootView.getFlattenWidgetNode() != null) {
                DXWidgetNode queryWidgetNodeByUserId = dXRootView.getFlattenWidgetNode().queryWidgetNodeByUserId("main");
                View D = (queryWidgetNodeByUserId == null || queryWidgetNodeByUserId.getDXRuntimeContext() == null) ? null : queryWidgetNodeByUserId.getDXRuntimeContext().D();
                if (D instanceof SwipeFrameLayout) {
                    ((SwipeFrameLayout) D).setOnLongClick(bVar);
                    ViewProxy.setOnLongClickListener(viewHolder.itemView, null);
                    return;
                } else if (D instanceof DXCartWrapperFrameLayoutWidgetNode.LongClickNativeFrameLayout) {
                    ((DXCartWrapperFrameLayoutWidgetNode.LongClickNativeFrameLayout) D).setOnLongClick(bVar);
                    ViewProxy.setOnLongClickListener(viewHolder.itemView, null);
                    return;
                }
            }
        }
        ViewProxy.setOnLongClickListener(viewHolder.itemView, bVar);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd39490", new Object[]{this});
        } else {
            this.f31637a.e().c0(new a());
        }
    }
}
