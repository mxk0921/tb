package com.taobao.android.searchbaseframe.business.common.list;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.util.ListStyle;
import tb.jib;
import tb.kib;
import tb.o02;
import tb.rz;
import tb.t2o;
import tb.ymx;
import tb.yw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class BaseListView<VIEW, PRESENTER extends jib> extends rz<VIEW, PRESENTER> implements kib<VIEW, PRESENTER> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RecyclerView.ItemDecoration d;
    public PartnerRecyclerView e;
    public int f;
    public RecyclerView.OnItemTouchListener h;
    public ListStyle g = ListStyle.LIST;
    public boolean i = false;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.searchbaseframe.business.common.list.BaseListView$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class AnonymousClass2 extends StaggeredGridLayoutManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            if (str.hashCode() == -579854207) {
                super.onLayoutCompleted((RecyclerView.State) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/common/list/BaseListView$2");
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutCompleted(RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd702081", new Object[]{this, state});
            } else {
                super.onLayoutCompleted(state);
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(ListStyle listStyle, int i, o02 o02Var, RecyclerView recyclerView, RecyclerView.ItemDecoration itemDecoration);

        RecyclerView.ItemDecoration b(int i, o02 o02Var);

        void c(RecyclerView.ItemDecoration itemDecoration, int i, int i2);
    }

    static {
        t2o.a(993001636);
        t2o.a(993001649);
    }

    public static /* synthetic */ Object ipc$super(BaseListView baseListView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/common/list/BaseListView");
    }

    @Override // tb.kib
    public void A(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff5138b2", new Object[]{this, new Integer(i)});
            return;
        }
        this.f = i;
        V(this.g);
    }

    @Override // tb.kib
    public void C(int i, BaseListAdapter baseListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a785eb", new Object[]{this, new Integer(i), baseListAdapter});
        } else {
            baseListAdapter.M(i, this.e);
        }
    }

    @Override // tb.kib
    public ViewGroup D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9c32f0be", new Object[]{this});
        }
        return this.e.getFooterFrame();
    }

    @Override // tb.kib
    public void E(int i, int i2, BaseListAdapter baseListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab2e427", new Object[]{this, new Integer(i), new Integer(i2), baseListAdapter});
        } else {
            baseListAdapter.N(i, i2, this.e);
        }
    }

    @Override // tb.kib
    public void F(yw1 yw1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a1a24a", new Object[]{this, yw1Var});
            return;
        }
        this.i = false;
        this.e.setAlpha(1.0f);
        this.e.invalidate();
        yw1Var.G2();
        RecyclerView.OnItemTouchListener onItemTouchListener = this.h;
        if (onItemTouchListener != null) {
            this.e.removeOnItemTouchListener(onItemTouchListener);
        }
    }

    @Override // tb.kib
    public void G(int i, SparseArrayCompat<Boolean> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d51d2c2", new Object[]{this, new Integer(i), sparseArrayCompat});
        } else {
            this.e.getCurrentDisplayedPositions(i, sparseArrayCompat);
        }
    }

    @Override // tb.kib
    public void H(yw1 yw1Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa34fbb1", new Object[]{this, yw1Var, new Boolean(z)});
            return;
        }
        this.i = true;
        if (z) {
            yw1Var.B2();
        } else {
            this.e.setAlpha(0.0f);
            this.e.invalidate();
        }
        if (this.h == null) {
            this.h = new RecyclerView.OnItemTouchListener(this) { // from class: com.taobao.android.searchbaseframe.business.common.list.BaseListView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
                public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("35491ccb", new Object[]{this, recyclerView, motionEvent})).booleanValue();
                    }
                    return true;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
                public void onRequestDisallowInterceptTouchEvent(boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c1dcb2bb", new Object[]{this, new Boolean(z2)});
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
                public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d4838b0b", new Object[]{this, recyclerView, motionEvent});
                    }
                }
            };
        }
        this.e.addOnItemTouchListener(this.h);
    }

    @Override // tb.kib
    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7462d541", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public void J(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc54e61", new Object[]{this, listStyle});
            return;
        }
        this.g = listStyle;
        V(listStyle);
    }

    public void K(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f067f8", new Object[]{this, adapter});
        } else {
            this.e.setAdapter(adapter);
        }
    }

    @Override // tb.kib
    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f5a315", new Object[]{this});
        } else if (this.e.getAdapter().getItemCount() != 0) {
            RecyclerView.LayoutManager layoutManager = this.e.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).scrollToPositionWithOffset(this.e.getAdapter().getItemCount() - 1, Integer.MIN_VALUE);
            } else if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(this.e.getAdapter().getItemCount() - 1, Integer.MIN_VALUE);
            }
        }
    }

    public abstract RecyclerView.ItemDecoration Q(int i);

    public abstract int R();

    public abstract StaggeredGridLayoutManager S(PartnerRecyclerView partnerRecyclerView);

    public void T(PartnerRecyclerView partnerRecyclerView, Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb489d98", new Object[]{this, partnerRecyclerView, context, viewGroup});
            return;
        }
        int R = R();
        this.e = partnerRecyclerView;
        partnerRecyclerView.setItemAnimator(null);
        partnerRecyclerView.setHasFixedSize(true);
        partnerRecyclerView.setLayoutManager(S(partnerRecyclerView));
        RecyclerView.ItemDecoration Q = Q(R);
        this.d = Q;
        partnerRecyclerView.addItemDecoration(Q);
        partnerRecyclerView.setClipToPadding(false);
        int i = -R;
        partnerRecyclerView.setPadding(i, 0, i, 0);
        partnerRecyclerView.setListEventListener((PartnerRecyclerView.a) P());
        Float o2 = ((jib) P()).o2();
        if (o2 != null) {
            partnerRecyclerView.setExposeFactor(o2.floatValue());
        }
        partnerRecyclerView.setSaveEnabled(false);
        U(partnerRecyclerView);
        if (O().g().isDebug()) {
            partnerRecyclerView.addOnItemTouchListener(new RecyclerView.SimpleOnItemTouchListener(this) { // from class: com.taobao.android.searchbaseframe.business.common.list.BaseListView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/common/list/BaseListView$1");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
                public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("35491ccb", new Object[]{this, recyclerView, motionEvent})).booleanValue();
                    }
                    int i2 = ymx.f32206a;
                    return false;
                }
            });
        }
    }

    public abstract void U(PartnerRecyclerView partnerRecyclerView);

    public abstract void V(ListStyle listStyle);

    @Override // tb.kib
    public void addFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df49456a", new Object[]{this, view});
        } else {
            this.e.addFooterView(view);
        }
    }

    @Override // tb.kib
    public void addHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59909138", new Object[]{this, view});
        } else {
            this.e.addHeaderView(view);
        }
    }

    @Override // tb.kib
    public RecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.kib
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e79b3a", new Object[]{this});
        } else {
            this.e.backToTop();
        }
    }

    @Override // tb.kib
    public int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2555b7e8", new Object[]{this})).intValue();
        }
        return this.e.getTotalScrollOffset();
    }
}
