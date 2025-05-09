package com.taobao.android.searchbaseframe.xsl.section.refact;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.XSRecyclerPool;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.dod;
import tb.eod;
import tb.t2o;
import tb.t7p;
import tb.ttc;
import tb.vdc;
import tb.w7p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XSectionDecoration extends RecyclerView.ItemDecoration implements eod, vdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Rect m = new Rect();
    public PartnerRecyclerView b;
    public dod c;
    public XSectionLayout d;
    public int e;
    public int i;
    public View j;
    public final t7p k;

    /* renamed from: a  reason: collision with root package name */
    public final b f9367a = new b(0, false);
    public final Map<BaseCellBean, WidgetViewHolder<BaseCellBean, ?>> f = new HashMap();
    public final Set<BaseCellBean> g = new HashSet();
    public final SparseIntArray h = new SparseIntArray();
    public final RecyclerView.RecycledViewPool l = new XSRecyclerPool();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                XSectionDecoration.b(XSectionDecoration.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f9370a;
        public boolean b;

        static {
            t2o.a(993002111);
        }

        public b(int i, boolean z) {
            this.f9370a = i;
            this.b = z;
        }
    }

    static {
        t2o.a(993002108);
        t2o.a(993002097);
        t2o.a(993002095);
    }

    public XSectionDecoration(boolean z, ttc ttcVar) {
        this.k = new t7p(z, ttcVar);
    }

    public static /* synthetic */ int a(XSectionDecoration xSectionDecoration, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("582347a6", new Object[]{xSectionDecoration, new Integer(i)})).intValue();
        }
        int i2 = xSectionDecoration.i + i;
        xSectionDecoration.i = i2;
        return i2;
    }

    public static /* synthetic */ void b(XSectionDecoration xSectionDecoration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f70c00f0", new Object[]{xSectionDecoration});
        } else {
            xSectionDecoration.k();
        }
    }

    public static /* synthetic */ Object ipc$super(XSectionDecoration xSectionDecoration, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/section/refact/XSectionDecoration");
    }

    public final void c(int i, int i2, boolean z, boolean z2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89275ed2", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        RecyclerView.ViewHolder j = j(i);
        View view = j.itemView;
        b f = f(view, i, i2, i4, z, z2, i3, i5, i6);
        if (f.f9370a + view.getMeasuredHeight() < 0 || f.f9370a > this.b.getMeasuredHeight()) {
            view.setVisibility(8);
            return;
        }
        if (f.b && z) {
            this.d.sectionTurnSticky(j);
        }
        view.setTranslationY(f.f9370a);
        view.setVisibility(0);
    }

    public void d(PartnerRecyclerView partnerRecyclerView, XSectionLayout xSectionLayout, dod dodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de013fe", new Object[]{this, partnerRecyclerView, xSectionLayout, dodVar});
            return;
        }
        this.d = xSectionLayout;
        this.b = partnerRecyclerView;
        partnerRecyclerView.addItemDecoration(this);
        this.c = dodVar;
        xSectionLayout.setHeightChangeListener(this);
        this.b.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.searchbaseframe.xsl.section.refact.XSectionDecoration.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/section/refact/XSectionDecoration$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                } else {
                    XSectionDecoration.a(XSectionDecoration.this, i2);
                }
            }
        });
        this.k.i(dodVar);
    }

    public final void e(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21fc0539", new Object[]{this, viewHolder});
            return;
        }
        this.l.putRecycledView(viewHolder);
        if (viewHolder instanceof WidgetViewHolder) {
            ((WidgetViewHolder) viewHolder).d0();
        }
    }

    public final b f(View view, int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        View childAt;
        int i11 = i5;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("59dd345a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2), new Integer(i4), new Integer(i11), new Integer(i6)});
        }
        int measuredHeight = view.getMeasuredHeight();
        int i12 = i6 - i11;
        if (!z2 || i12 <= measuredHeight) {
            i7 = 0;
        } else {
            i7 = i12 - measuredHeight;
        }
        if (!z2) {
            i11 -= measuredHeight;
        }
        w7p r = this.c.r(i);
        if (r != null) {
            i8 = r.d();
            i9 = (-r.f()) - i8;
            if (!r.i()) {
                i9 = (-measuredHeight) + i8;
            }
        } else {
            i9 = 0;
            i8 = 0;
        }
        BaseCellBean p = this.c.p(i);
        if (z) {
            BaseCellBean p2 = this.c.p(p.nextSectionPos);
            if (!(p2 == null || h(p2) == null || (childAt = this.b.getChildAt(i2 + (p.nextSectionPos - i))) == null)) {
                PartnerRecyclerView partnerRecyclerView = this.b;
                Rect rect = m;
                partnerRecyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                int i13 = (rect.top - measuredHeight) - i3;
                if (i13 <= i9) {
                    b bVar = this.f9367a;
                    bVar.f9370a = i13 + i3;
                    bVar.b = true;
                    return bVar;
                }
            }
            i11 = Math.max(i9, i11 + i7);
        }
        if (i8 <= 0 || !z) {
            int max = Math.max(i3 + i9, i11);
            if (!z) {
                max = i11 + i7;
            }
            b bVar2 = this.f9367a;
            bVar2.f9370a = max;
            if (max > i3) {
                z3 = false;
            }
            bVar2.b = z3;
            return bVar2;
        }
        int i14 = this.h.get(p.hashCode()) - i4;
        if ((!z2 || (i4 < 0 && i11 <= i14)) && i14 > (i10 = i8 + i9 + i3)) {
            i14 = i10;
        }
        if (i11 > i14) {
            i14 = i11;
        }
        int max2 = Math.max(i3 + i9, i14);
        int i15 = i3 + i7;
        if (max2 > i15) {
            max2 = i15;
        }
        if (!z2 || max2 <= measuredHeight + i11) {
            i11 = max2;
        }
        this.h.put(p.hashCode(), i11);
        b bVar3 = this.f9367a;
        bVar3.f9370a = i11;
        bVar3.b = true;
        return bVar3;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ((HashSet) this.g).clear();
        p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        PartnerRecyclerView partnerRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
        } else if (this.c != null && (partnerRecyclerView = this.b) != null) {
            int headerViewsCount = partnerRecyclerView.getHeaderViewsCount();
            int footerViewsCount = this.b.getFooterViewsCount();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition != -1 && childAdapterPosition >= headerViewsCount && childAdapterPosition < recyclerView.getAdapter().getItemCount() - footerViewsCount) {
                int i = childAdapterPosition - headerViewsCount;
                if (l(i)) {
                    int measuredHeight = j(i).itemView.getMeasuredHeight();
                    int i2 = measuredHeight / 2;
                    rect.set(0, i2, 0, measuredHeight - i2);
                }
            }
        }
    }

    public final RecyclerView.ViewHolder h(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("bb1d9d3c", new Object[]{this, baseCellBean});
        }
        return (RecyclerView.ViewHolder) ((HashMap) this.f).get(baseCellBean);
    }

    public final WidgetViewHolder<BaseCellBean, ?> i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("6b7a77f3", new Object[]{this, new Integer(i)});
        }
        WidgetViewHolder<BaseCellBean, ?> widgetViewHolder = (WidgetViewHolder) this.l.getRecycledView(i);
        if (widgetViewHolder == null) {
            return this.c.x(this.b, i);
        }
        return widgetViewHolder;
    }

    public final RecyclerView.ViewHolder j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("bb619519", new Object[]{this, new Integer(i)});
        }
        BaseCellBean p = this.c.p(i);
        WidgetViewHolder<BaseCellBean, ?> widgetViewHolder = (WidgetViewHolder) ((HashMap) this.f).get(p);
        if (widgetViewHolder == null) {
            if (p != null) {
                widgetViewHolder = i(this.c.getItemViewType(p.sectionPos));
            } else {
                widgetViewHolder = i(this.c.getItemViewType(i));
            }
            ((HashMap) this.f).put(p, widgetViewHolder);
            this.c.s(widgetViewHolder, i, p);
        } else if (p != null && p.forceUpdate) {
            this.c.s(widgetViewHolder, i, p);
            p.forceUpdate = false;
        }
        widgetViewHolder.itemView.setVisibility(0);
        widgetViewHolder.itemView.setTag(p);
        if (widgetViewHolder.itemView.getParent() == null) {
            this.d.addSection(widgetViewHolder.itemView);
            m(widgetViewHolder);
            this.d.measureChild(widgetViewHolder.itemView);
        }
        return widgetViewHolder;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd61f52", new Object[]{this});
        } else {
            this.b.invalidateItemDecorations();
        }
    }

    public final boolean l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f68f79e5", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.c.A(i);
    }

    public final void m(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb18e35", new Object[]{this, viewHolder});
        } else {
            this.d.sectionAttached(viewHolder);
        }
    }

    public final void n(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60081e83", new Object[]{this, viewHolder});
        } else {
            this.d.sectionDetached(viewHolder);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae44b5", new Object[]{this});
            return;
        }
        this.b.post(new a());
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5699bf0e", new Object[]{this, canvas, recyclerView, state});
        } else {
            this.k.e(canvas, (PartnerRecyclerView) recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1107a21a", new Object[]{this, canvas, recyclerView, state});
        } else if (this.c != null && this.b != null) {
            int childCount = recyclerView.getChildCount();
            int headerViewsCount = this.b.getHeaderViewsCount();
            int footerViewsCount = this.b.getFooterViewsCount();
            int i5 = this.i;
            this.i = 0;
            ((HashSet) this.g).clear();
            View view = this.j;
            if (view == null) {
                i = 0;
            } else {
                i = view.getHeight();
            }
            int i6 = this.e + i;
            boolean z3 = false;
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = recyclerView.getChildAt(i7);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= headerViewsCount && childAdapterPosition < recyclerView.getAdapter().getItemCount() - footerViewsCount) {
                    int i8 = childAdapterPosition - headerViewsCount;
                    boolean l = l(i8);
                    PartnerRecyclerView partnerRecyclerView = this.b;
                    Rect rect = m;
                    partnerRecyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                    this.k.f(canvas, i8, childAt.getLeft(), childAt.getRight(), rect.top);
                    if ((l || !z3) && rect.top <= i6 && rect.bottom >= i6) {
                        z2 = true;
                        z = true;
                    } else {
                        z = z3;
                        z2 = false;
                    }
                    if (l || (z2 && this.c.E(i8))) {
                        ((HashSet) this.g).add(this.c.p(i8));
                        i3 = i7;
                        i2 = i6;
                        i4 = i5;
                        c(i8, i7, z2, l, i5, i6, rect.top, rect.bottom);
                    } else {
                        i3 = i7;
                        i2 = i6;
                        i4 = i5;
                    }
                    z3 = z;
                } else {
                    i3 = i7;
                    i2 = i6;
                    i4 = i5;
                }
                i7 = i3 + 1;
                i5 = i4;
                i6 = i2;
            }
            p();
            if (((HashSet) this.g).size() > 0) {
                this.d.refreshSectionBackground();
            }
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4da4bc70", new Object[]{this});
            return;
        }
        Iterator it = ((HashMap) this.f).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((HashSet) this.g).contains(entry.getKey())) {
                WidgetViewHolder widgetViewHolder = (WidgetViewHolder) entry.getValue();
                e(widgetViewHolder);
                this.d.removeView(widgetViewHolder.itemView);
                n(widgetViewHolder);
                it.remove();
            }
        }
    }

    public void q(t7p.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3174fe7", new Object[]{this, aVar});
        } else {
            this.k.g(aVar);
        }
    }

    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85910427", new Object[]{this, new Integer(i)});
        } else {
            this.k.h(i);
        }
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc407cbd", new Object[]{this, new Integer(i)});
            return;
        }
        this.e = i;
        PartnerRecyclerView partnerRecyclerView = this.b;
        if (partnerRecyclerView != null) {
            partnerRecyclerView.invalidateItemDecorations();
        }
    }

    public void t(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cfc1455", new Object[]{this, view});
        } else {
            this.j = view;
        }
    }
}
