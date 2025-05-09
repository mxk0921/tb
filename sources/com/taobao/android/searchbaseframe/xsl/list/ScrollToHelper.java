package com.taobao.android.searchbaseframe.xsl.list;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ScrollToHelper extends RecyclerView.OnScrollListener implements ViewTreeObserver.OnGlobalLayoutListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Rect n = new Rect();
    public static boolean o = true;
    public static boolean p = true;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f9349a;
    public RecyclerView.ViewHolder b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public final boolean g;
    public final XSmoothScroller h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final Handler l = new a();
    public int m = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/list/ScrollToHelper$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 1) {
                ScrollToHelper.b(ScrollToHelper.this, true);
                ScrollToHelper.o(ScrollToHelper.this).stopScroll();
                ScrollToHelper scrollToHelper = ScrollToHelper.this;
                ScrollToHelper.s(scrollToHelper, ScrollToHelper.p(scrollToHelper), false, ScrollToHelper.r(ScrollToHelper.this), 0);
                ScrollToHelper.t(ScrollToHelper.this, true);
                ScrollToHelper.b(ScrollToHelper.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a();
    }

    static {
        t2o.a(993002028);
    }

    public ScrollToHelper(RecyclerView recyclerView, boolean z, RecyclerView.Adapter adapter) {
        this.f9349a = recyclerView;
        recyclerView.addOnScrollListener(this);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.g = z;
        this.h = new XSmoothScroller(recyclerView, adapter);
    }

    public static /* synthetic */ boolean b(ScrollToHelper scrollToHelper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c4141eb", new Object[]{scrollToHelper, new Boolean(z)})).booleanValue();
        }
        scrollToHelper.j = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(ScrollToHelper scrollToHelper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/list/ScrollToHelper");
    }

    public static /* synthetic */ RecyclerView o(ScrollToHelper scrollToHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("e909173", new Object[]{scrollToHelper});
        }
        return scrollToHelper.f9349a;
    }

    public static /* synthetic */ int p(ScrollToHelper scrollToHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bbca00", new Object[]{scrollToHelper})).intValue();
        }
        return scrollToHelper.e;
    }

    public static /* synthetic */ int r(ScrollToHelper scrollToHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e27d45c1", new Object[]{scrollToHelper})).intValue();
        }
        return scrollToHelper.d;
    }

    public static /* synthetic */ void s(ScrollToHelper scrollToHelper, int i, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dcb1a60", new Object[]{scrollToHelper, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else {
            scrollToHelper.E(i, z, i2, i3);
        }
    }

    public static /* synthetic */ boolean t(ScrollToHelper scrollToHelper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a672fc6", new Object[]{scrollToHelper, new Boolean(z)})).booleanValue();
        }
        scrollToHelper.c = z;
        return z;
    }

    public static /* synthetic */ b u(ScrollToHelper scrollToHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("5a581fb6", new Object[]{scrollToHelper});
        }
        scrollToHelper.getClass();
        return null;
    }

    public static /* synthetic */ boolean v(ScrollToHelper scrollToHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("518334d6", new Object[]{scrollToHelper})).booleanValue();
        }
        return scrollToHelper.g;
    }

    public static /* synthetic */ int w(ScrollToHelper scrollToHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d44b086", new Object[]{scrollToHelper})).intValue();
        }
        return scrollToHelper.m;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f = false;
        this.c = false;
        this.b = null;
        this.e = -1;
        this.d = 0;
        this.m = -1;
    }

    public void C(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d225a7a", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        } else {
            F(i, z, i2, 0);
        }
    }

    public final void E(int i, boolean z, int i2, int i3) {
        PartnerRecyclerView partnerRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6f01bd", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else if (!z) {
            RecyclerView.LayoutManager layoutManager = this.f9349a.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).scrollToPositionWithOffset(i, i2);
            } else if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, i2);
            }
        } else if (!this.g || !o) {
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(this.f9349a.getContext()) { // from class: com.taobao.android.searchbaseframe.xsl.list.ScrollToHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r4, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1299653488) {
                        return new Integer(super.calculateTimeForScrolling(((Number) objArr[0]).intValue()));
                    }
                    if (hashCode == -1154160711) {
                        return new Integer(super.calculateDyToMakeVisible((View) objArr[0], ((Number) objArr[1]).intValue()));
                    }
                    if (hashCode == 1134712088) {
                        super.onTargetFound((View) objArr[0], (RecyclerView.State) objArr[1], (RecyclerView.SmoothScroller.Action) objArr[2]);
                        return null;
                    }
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/searchbaseframe/xsl/list/ScrollToHelper$2");
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public int calculateDyToMakeVisible(View view, int i4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("bb34e7b9", new Object[]{this, view, new Integer(i4)})).intValue();
                    }
                    return super.calculateDyToMakeVisible(view, i4) + ScrollToHelper.r(ScrollToHelper.this);
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public int calculateTimeForScrolling(int i4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("b288dc90", new Object[]{this, new Integer(i4)})).intValue();
                    }
                    if (ScrollToHelper.v(ScrollToHelper.this)) {
                        return super.calculateTimeForScrolling(i4);
                    }
                    if (ScrollToHelper.w(ScrollToHelper.this) <= 0 || i4 == 10000) {
                        return super.calculateTimeForScrolling(Math.min(2000, i4));
                    }
                    return ScrollToHelper.w(ScrollToHelper.this);
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public int getVerticalSnapPreference() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
                    }
                    return -1;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43a25518", new Object[]{this, view, state, action});
                        return;
                    }
                    if (ScrollToHelper.u(ScrollToHelper.this) != null) {
                        ScrollToHelper.u(ScrollToHelper.this).a();
                    }
                    super.onTargetFound(view, state, action);
                }
            };
            linearSmoothScroller.setTargetPosition(i);
            if (this.f9349a.getLayoutManager() != null) {
                this.f9349a.getLayoutManager().startSmoothScroll(linearSmoothScroller);
            }
            if (this.g && this.k) {
                this.k = false;
                this.l.sendEmptyMessageDelayed(1, 300L);
            }
        } else {
            this.i = true;
            RecyclerView recyclerView = this.f9349a;
            if (recyclerView instanceof PartnerRecyclerView) {
                partnerRecyclerView = (PartnerRecyclerView) recyclerView;
                partnerRecyclerView.setScrollListenerEnabled(false);
            } else {
                partnerRecyclerView = null;
            }
            this.h.i(i, i2, i3);
            if (partnerRecyclerView != null) {
                partnerRecyclerView.setScrollListenerEnabled(true);
            }
            this.i = false;
        }
    }

    public void F(int i, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992bedc4", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else if (this.f9349a.getLayoutManager() != null) {
            if (z) {
                this.k = true;
            }
            B();
            this.e = i;
            this.d = i2;
            this.f = true;
            this.b = this.f9349a.findViewHolderForAdapterPosition(i);
            E(i, z, i2, i3);
            if (!z) {
                this.c = true;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        RecyclerView.ViewHolder viewHolder;
        int z;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
        } else if (this.f && this.c && !this.i && (viewHolder = this.b) != null && (z = z(viewHolder.itemView)) != (i = this.d)) {
            if (!p || ((z <= i || this.f9349a.canScrollVertically(1)) && (z >= this.d || this.f9349a.canScrollVertically(-1)))) {
                C(this.e, false, this.d);
            } else {
                this.c = false;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
        } else if (this.f && !this.i) {
            if (i == 1) {
                this.f = false;
                this.c = false;
                this.b = null;
            } else if (i == 0 && !this.j) {
                this.l.removeMessages(1);
                this.c = true;
                if (this.b != null) {
                    x();
                } else {
                    E(this.e, false, this.d, 0);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (this.f && !this.i) {
            RecyclerView.ViewHolder viewHolder = this.b;
            if (viewHolder == null || viewHolder.getAdapterPosition() != this.e) {
                this.b = recyclerView.findViewHolderForAdapterPosition(this.e);
            }
            RecyclerView.ViewHolder viewHolder2 = this.b;
            if (viewHolder2 == null) {
                view = null;
            } else {
                view = viewHolder2.itemView;
            }
            if (view != null) {
                int z = z(view);
                if (z > recyclerView.getMeasuredHeight() && view.getBottom() < 0) {
                    return;
                }
                if ((i2 > 0 && z <= this.d) || (i2 < 0 && z >= this.d)) {
                    recyclerView.stopScroll();
                }
            }
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e340eba", new Object[]{this});
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.b;
        if (viewHolder != null) {
            int z = z(viewHolder.itemView);
            int i = this.d;
            if (z != i) {
                E(this.e, false, i, 0);
            }
        }
    }

    public final int z(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee979364", new Object[]{this, view})).intValue();
        }
        RecyclerView recyclerView = this.f9349a;
        Rect rect = n;
        recyclerView.getDecoratedBoundsWithMargins(view, rect);
        return rect.top;
    }
}
