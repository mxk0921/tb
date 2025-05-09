package com.taobao.android.dinamicx.widget.recycler;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import java.util.ArrayList;
import java.util.List;
import tb.rpq;
import tb.t2o;
import tb.ysd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class BaseStickyAdapter extends RecyclerView.Adapter implements ysd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean c;
    public rpq d;
    public int f;
    public int e = -1;

    /* renamed from: a  reason: collision with root package name */
    public final List<Integer> f7461a = new ArrayList();
    public final List<Integer> b = new ArrayList();

    static {
        t2o.a(444597511);
        t2o.a(444597517);
    }

    public BaseStickyAdapter() {
        T();
    }

    public static /* synthetic */ Object ipc$super(BaseStickyAdapter baseStickyAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/BaseStickyAdapter");
    }

    @Override // tb.ysd
    public List<Integer> C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("41c031a8", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.ysd
    public boolean K(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5079e1ae", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (e(i) >= 0) {
            return true;
        }
        return false;
    }

    public void M(int i, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f39747", new Object[]{this, new Integer(i), viewHolder});
            return;
        }
        if (DXTraceUtil.f()) {
            DXTraceUtil.b("bindData position=" + i);
        }
        if (((RecyclerAdapter) this).o(i)) {
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
            if (layoutParams != null) {
                layoutParams.height = 0;
            }
            viewHolder.itemView.requestLayout();
            ((ArrayList) this.b).add(Integer.valueOf(i));
        } else {
            N(viewHolder, i);
        }
        if (DXTraceUtil.f()) {
            DXTraceUtil.c();
        }
    }

    public abstract void N(RecyclerView.ViewHolder viewHolder, int i);

    public void O(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910c890f", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void P(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46db97ca", new Object[]{this, recyclerView});
        } else if ((recyclerView instanceof DXRecyclerView) && this.c) {
            rpq rpqVar = this.d;
            if (rpqVar != null) {
                rpqVar.f(this.f);
            } else {
                this.d = new rpq((DXRecyclerView) recyclerView, this, this.f);
            }
        }
    }

    public void Q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67424775", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263324a4", new Object[]{this});
        } else {
            registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.taobao.android.dinamicx.widget.recycler.BaseStickyAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r4, String str, Object... objArr) {
                    switch (str.hashCode()) {
                        case -1902625302:
                            super.onItemRangeInserted(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                            return null;
                        case -1756146412:
                            super.onItemRangeMoved(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                            return null;
                        case -238222724:
                            super.onItemRangeRemoved(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                            return null;
                        case 1882209744:
                            super.onItemRangeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                            return null;
                        default:
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/BaseStickyAdapter$1");
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ba16f5dc", new Object[]{this});
                    } else {
                        BaseStickyAdapter.this.T();
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeChanged(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onItemRangeChanged(i, i2);
                    BaseStickyAdapter.this.T();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeInserted(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onItemRangeInserted(i, i2);
                    BaseStickyAdapter.this.T();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeMoved(int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("97535514", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                        return;
                    }
                    super.onItemRangeMoved(i, i2, i3);
                    BaseStickyAdapter.this.T();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeRemoved(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f1cd027c", new Object[]{this, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onItemRangeRemoved(i, i2);
                    BaseStickyAdapter.this.T();
                }
            });
        }
    }

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbf5b736", new Object[]{this});
            return;
        }
        this.f7461a.clear();
        this.e = -1;
        int itemCount = getItemCount();
        int i = -1;
        for (int i2 = 0; i2 < itemCount; i2++) {
            if (((RecyclerAdapter) this).o(i2)) {
                if (this.e == -1) {
                    this.e = i2;
                }
                i = i2;
            }
            this.f7461a.add(Integer.valueOf(i));
        }
    }

    @Override // tb.ysd
    public void c(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c25a507", new Object[]{this, viewHolder, new Integer(i)});
        } else if (i >= 0 && i < getItemCount()) {
            N(viewHolder, i);
        }
    }

    @Override // tb.ysd
    public int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbc93527", new Object[]{this, new Integer(i)})).intValue();
        }
        List<Integer> list = this.f7461a;
        if (list == null || i < 0 || i >= ((ArrayList) list).size()) {
            return -1;
        }
        return ((Integer) ((ArrayList) this.f7461a).get(i)).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
        } else if (!this.c) {
            M(i, viewHolder);
        } else {
            this.d.e(viewHolder, i);
        }
    }

    @Override // tb.ysd
    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23f6fc46", new Object[]{this})).intValue();
        }
        return this.e;
    }
}
