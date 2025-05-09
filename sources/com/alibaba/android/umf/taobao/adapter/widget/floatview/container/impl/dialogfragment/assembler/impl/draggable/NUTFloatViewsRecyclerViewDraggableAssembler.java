package com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.assembler.impl.draggable;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ck;
import tb.ln;
import tb.lw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NUTFloatViewsRecyclerViewDraggableAssembler extends lw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RecyclerView.AdapterDataObserver j;

    static {
        t2o.a(81789342);
    }

    public static /* synthetic */ void N(NUTFloatViewsRecyclerViewDraggableAssembler nUTFloatViewsRecyclerViewDraggableAssembler, RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224e29f7", new Object[]{nUTFloatViewsRecyclerViewDraggableAssembler, recyclerView, adapter});
        } else {
            nUTFloatViewsRecyclerViewDraggableAssembler.T(recyclerView, adapter);
        }
    }

    public static /* synthetic */ Object ipc$super(NUTFloatViewsRecyclerViewDraggableAssembler nUTFloatViewsRecyclerViewDraggableAssembler, String str, Object... objArr) {
        if (str.hashCode() == 1816468530) {
            super.b();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/taobao/adapter/widget/floatview/container/impl/dialogfragment/assembler/impl/draggable/NUTFloatViewsRecyclerViewDraggableAssembler");
    }

    @Override // tb.lw
    public void G(ViewGroup viewGroup, final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4769cf80", new Object[]{this, viewGroup, view});
        } else if (view instanceof RecyclerView) {
            final RecyclerView.Adapter P = P(view);
            if (P == null) {
                ck.g().b("NUTFloatViewsRecyclerViewDraggableAssembler", "calculateContentViewCanDraggable", "contentView不是RecyclerView，无法获取Adapter");
                return;
            }
            V(P);
            RecyclerView.AdapterDataObserver adapterDataObserver = new RecyclerView.AdapterDataObserver() { // from class: com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.assembler.impl.draggable.NUTFloatViewsRecyclerViewDraggableAssembler.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.assembler.impl.draggable.NUTFloatViewsRecyclerViewDraggableAssembler$1$a */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
                public class a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public a() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        AnonymousClass1 r0 = AnonymousClass1.this;
                        NUTFloatViewsRecyclerViewDraggableAssembler.N(NUTFloatViewsRecyclerViewDraggableAssembler.this, (RecyclerView) view, P);
                    }
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    if (str.hashCode() == -1172900388) {
                        super.onChanged();
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/taobao/adapter/widget/floatview/container/impl/dialogfragment/assembler/impl/draggable/NUTFloatViewsRecyclerViewDraggableAssembler$1");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ba16f5dc", new Object[]{this});
                        return;
                    }
                    super.onChanged();
                    view.post(new a());
                }
            };
            this.j = adapterDataObserver;
            P.registerAdapterDataObserver(adapterDataObserver);
            T((RecyclerView) view, P);
        }
    }

    public final int O(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe964182", new Object[]{this, layoutManager})).intValue();
        }
        return Q(layoutManager);
    }

    public final RecyclerView.Adapter P(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Adapter) ipChange.ipc$dispatch("66d56719", new Object[]{this, view});
        }
        if (!(view instanceof RecyclerView)) {
            return null;
        }
        return ((RecyclerView) view).getAdapter();
    }

    public final int Q(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10ecea0", new Object[]{this, layoutManager})).intValue();
        }
        return R(layoutManager, false);
    }

    public final int R(RecyclerView.LayoutManager layoutManager, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d2fa72f", new Object[]{this, layoutManager, new Boolean(z)})).intValue();
        }
        if (!(layoutManager instanceof VirtualLayoutManager)) {
            return 0;
        }
        for (a aVar : ((VirtualLayoutManager) layoutManager).n0()) {
            if (aVar instanceof ln) {
                boolean o0 = ((ln) aVar).o0();
                if ((z && o0) || (!z && !o0)) {
                    i += aVar.m();
                }
            }
        }
        return i;
    }

    public final int S(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d1f1314", new Object[]{this, layoutManager})).intValue();
        }
        return R(layoutManager, true);
    }

    public final void T(RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94ee10e", new Object[]{this, recyclerView, adapter});
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            int itemCount = adapter.getItemCount();
            if (-1 == findFirstCompletelyVisibleItemPosition || -1 == findLastCompletelyVisibleItemPosition) {
                L(false);
            } else if (4 != J() || !U(layoutManager, findFirstCompletelyVisibleItemPosition, findLastCompletelyVisibleItemPosition, itemCount)) {
                L(true);
            } else {
                L(false);
            }
        } else {
            L(true);
        }
    }

    public final boolean U(RecyclerView.LayoutManager layoutManager, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2f0798", new Object[]{this, layoutManager, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        int S = S(layoutManager) + Q(layoutManager);
        if ((i == 0 || S != i3 - 1 || i2 != i) && Math.abs((i2 - i) + 1) < i3 - O(layoutManager)) {
            return false;
        }
        return true;
    }

    public final void V(RecyclerView.Adapter adapter) {
        RecyclerView.AdapterDataObserver adapterDataObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85afa089", new Object[]{this, adapter});
        } else if (adapter != null && (adapterDataObserver = this.j) != null) {
            try {
                adapter.unregisterAdapterDataObserver(adapterDataObserver);
            } catch (Exception e) {
                ck.g().b("NUTFloatViewsRecyclerViewDraggableAssembler", "unRegisterDataObserver#error", e.getMessage());
            }
            this.j = null;
        }
    }

    @Override // tb.lw, tb.kw, tb.gyc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c451c32", new Object[]{this});
            return;
        }
        super.b();
        V(P(l()));
    }
}
