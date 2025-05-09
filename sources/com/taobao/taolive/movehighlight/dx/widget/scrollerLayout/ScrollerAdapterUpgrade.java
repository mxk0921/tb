package com.taobao.taolive.movehighlight.dx.widget.scrollerLayout;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXScrollerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.scroller.ViewHolder;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.t2o;
import tb.xb6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ScrollerAdapterUpgrade extends DXScrollerLayout.ScrollerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_COMMON_VIEW = 1;
    public static final int TYPE_EMPTY_VIEW = 3;
    public static final int TYPE_FOOTER_VIEW = 2;
    public RelativeLayout b;
    public final ProgressBar c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f13089a = true;
    public int d = 1;
    public int e = 3;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ScrollerAdapterUpgrade.N(ScrollerAdapterUpgrade.this, view);
            }
        }
    }

    static {
        t2o.a(779092659);
    }

    public ScrollerAdapterUpgrade(Context context, DXScrollerLayout dXScrollerLayout) {
        super(context, dXScrollerLayout);
        View a2 = xb6.a(context, R.layout.taolive_higlight_dx_scrollable_load_more_bottom);
        ProgressBar progressBar = (ProgressBar) a2.findViewById(R.id.taolive_highlight_scrollable_loadmore_progressbar);
        this.c = progressBar;
        progressBar.setVisibility(8);
        O(a2);
    }

    public static /* synthetic */ boolean M(ScrollerAdapterUpgrade scrollerAdapterUpgrade, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81c95c43", new Object[]{scrollerAdapterUpgrade, new Integer(i)})).booleanValue();
        }
        return scrollerAdapterUpgrade.S(i);
    }

    public static /* synthetic */ void N(ScrollerAdapterUpgrade scrollerAdapterUpgrade, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a03c6d", new Object[]{scrollerAdapterUpgrade, view});
        } else {
            scrollerAdapterUpgrade.U(view);
        }
    }

    public static /* synthetic */ Object ipc$super(ScrollerAdapterUpgrade scrollerAdapterUpgrade, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1760699264:
                return new Integer(super.getItemCount());
            case -1640234647:
                return super.onCreateViewHolder((ViewGroup) objArr[0], ((Number) objArr[1]).intValue());
            case -1441289013:
                super.onBindViewHolder((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 431080268:
                return new Long(super.getItemId(((Number) objArr[0]).intValue()));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/widget/scrollerLayout/ScrollerAdapterUpgrade");
        }
    }

    public final void O(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df49456a", new Object[]{this, view});
        } else if (view != null) {
            if (this.b == null) {
                this.b = new RelativeLayout(this.context);
            }
            V();
            this.b.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
    }

    public final int P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19994fd3", new Object[]{this})).intValue();
        }
        if (!this.f13089a || Q()) {
            return 0;
        }
        return 1;
    }

    public final boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2a946e9", new Object[]{this})).booleanValue();
        }
        ArrayList<DXWidgetNode> arrayList = this.dataSource;
        if (arrayList == null || arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean S(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70741df6", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.f13089a || i < getItemCount() - 1) {
            return false;
        }
        return true;
    }

    public final void T(int i) {
        int i2;
        DXScrollerLayout dXScrollerLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0677342", new Object[]{this, new Integer(i)});
        } else if (this.f13089a && (i2 = this.d) != 2 && i2 != 5 && !Q() && this.dataSource.size() >= 1) {
            if (i < 0) {
                DXScrollerLayout dXScrollerLayout2 = this.scrollerLayout;
                if (dXScrollerLayout2 != null && (dXScrollerLayout2 instanceof DXHighlightScrollableLayoutWidgetNode)) {
                    X(2);
                    ((DXHighlightScrollableLayoutWidgetNode) this.scrollerLayout).y();
                }
            } else if ((this.dataSource.size() - 1) - (i - P()) <= this.e && (dXScrollerLayout = this.scrollerLayout) != null && (dXScrollerLayout instanceof DXHighlightScrollableLayoutWidgetNode)) {
                X(2);
                ((DXHighlightScrollableLayoutWidgetNode) this.scrollerLayout).y();
            }
        }
    }

    public final void U(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7451b", new Object[]{this, view});
        } else if (3 == this.d) {
            T(-1);
        }
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107ac10b", new Object[]{this});
        } else {
            this.b.removeAllViews();
        }
    }

    public void W(final DXHighlightGrideLayoutmanager dXHighlightGrideLayoutmanager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e75d96", new Object[]{this, dXHighlightGrideLayoutmanager});
        } else {
            dXHighlightGrideLayoutmanager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.ScrollerAdapterUpgrade.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/widget/scrollerLayout/ScrollerAdapterUpgrade$1");
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i)})).intValue();
                    }
                    if (ScrollerAdapterUpgrade.M(ScrollerAdapterUpgrade.this, i)) {
                        return dXHighlightGrideLayoutmanager.getSpanCount();
                    }
                    return 1;
                }
            });
        }
    }

    public void X(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841d1e21", new Object[]{this, new Integer(i)});
            return;
        }
        this.d = i;
        if (i == 2) {
            this.c.setVisibility(0);
        } else if (i == 3 || i == 4 || i == 5) {
            this.c.setVisibility(8);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout.ScrollerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        ArrayList<DXWidgetNode> arrayList = this.dataSource;
        if (arrayList == null || arrayList.isEmpty()) {
            return super.getItemCount();
        }
        return this.dataSource.size() + P();
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout.ScrollerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return super.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        Q();
        if (S(i)) {
            return 2;
        }
        return 1;
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout.ScrollerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        if (getItemViewType(i) == 1) {
            super.onBindViewHolder(viewHolder, i);
        }
        T(i);
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout.ScrollerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        if (this.b == null) {
            this.b = new RelativeLayout(this.context);
        }
        ViewHolder b0 = ViewHolder.b0(this.b);
        this.b.setOnClickListener(new a());
        return b0;
    }
}
