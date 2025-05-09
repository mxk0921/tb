package com.taobao.android.dinamicx.widget.utils;

import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.j;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import tb.h36;
import tb.ic5;
import tb.jb6;
import tb.t2o;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXRecyclerViewCacheExtension extends RecyclerView.ViewCacheExtension implements j.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CACHE_VIEW_POSITION_TAG = R.id.cache_view_position_tag;
    public static final int DX_RECYCLER_VIEW_CACHE_SCROLL_LISTENER = R.id.dx_recycler_view_cache_scroll_listener;
    public static final int INVALID_PRE_RENDING_STATE = -1;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<SparseArray<View>> f7507a = new SparseArray<>();
    public WeakReference<RecyclerView.Recycler> b;
    public WeakReference<RecyclerView> c;
    public final String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class ScrollListener extends RecyclerView.OnScrollListener implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RecyclerView.LayoutManager f7509a;
            public final /* synthetic */ RecyclerView b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            public a(RecyclerView.LayoutManager layoutManager, RecyclerView recyclerView, int i, int i2) {
                this.f7509a = layoutManager;
                this.b = recyclerView;
                this.c = i;
                this.d = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                RecyclerView.LayoutManager layoutManager = this.f7509a;
                if (layoutManager instanceof LinearLayoutManager) {
                    ScrollListener.b(ScrollListener.this, this.b, (LinearLayoutManager) layoutManager, this.c, this.d);
                } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                    ScrollListener.o(ScrollListener.this, this.b, (StaggeredGridLayoutManager) layoutManager, this.c, this.d);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f7510a;
            public final /* synthetic */ RecyclerView b;

            public b(int i, RecyclerView recyclerView) {
                this.f7510a = i;
                this.b = recyclerView;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DXRecyclerViewCacheExtension.this.j(this.f7510a, this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f7511a;
            public final /* synthetic */ RecyclerView b;

            public c(int i, RecyclerView recyclerView) {
                this.f7511a = i;
                this.b = recyclerView;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DXRecyclerViewCacheExtension.this.j(this.f7511a, this.b);
                }
            }
        }

        static {
            t2o.a(444597693);
        }

        public ScrollListener() {
        }

        public static /* synthetic */ void b(ScrollListener scrollListener, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10f31722", new Object[]{scrollListener, recyclerView, linearLayoutManager, new Integer(i), new Integer(i2)});
            } else {
                scrollListener.p(recyclerView, linearLayoutManager, i, i2);
            }
        }

        public static /* synthetic */ Object ipc$super(ScrollListener scrollListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/utils/DXRecyclerViewCacheExtension$ScrollListener");
        }

        public static /* synthetic */ void o(ScrollListener scrollListener, RecyclerView recyclerView, StaggeredGridLayoutManager staggeredGridLayoutManager, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0afff80", new Object[]{scrollListener, recyclerView, staggeredGridLayoutManager, new Integer(i), new Integer(i2)});
            } else {
                scrollListener.r(recyclerView, staggeredGridLayoutManager, i, i2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            } else if (recyclerView != null) {
                jb6.n(new a(recyclerView.getLayoutManager(), recyclerView, i, i2));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
                return;
            }
            if (DinamicXEngine.j0()) {
                h36.g("DXRecyclerViewCacheExtension", view + " detached clearAllCache");
            }
            DXRecyclerViewCacheExtension.this.a();
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void p(androidx.recyclerview.widget.RecyclerView r5, androidx.recyclerview.widget.LinearLayoutManager r6, int r7, int r8) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension.ScrollListener.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0028
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r7)
                java.lang.Integer r7 = new java.lang.Integer
                r7.<init>(r8)
                r8 = 5
                java.lang.Object[] r8 = new java.lang.Object[r8]
                r8[r1] = r4
                r8[r0] = r5
                r5 = 2
                r8[r5] = r6
                r5 = 3
                r8[r5] = r3
                r5 = 4
                r8[r5] = r7
                java.lang.String r5 = "3c9c9c6c"
                r2.ipc$dispatch(r5, r8)
                return
            L_0x0028:
                int r2 = r6.getOrientation()
                if (r2 != 0) goto L_0x002f
                goto L_0x0030
            L_0x002f:
                r7 = r8
            L_0x0030:
                if (r7 == 0) goto L_0x0085
                int r8 = r6.getChildCount()
                if (r8 != 0) goto L_0x0039
                goto L_0x0085
            L_0x0039:
                r8 = -1
                if (r7 <= 0) goto L_0x005b
                boolean r7 = r6.getReverseLayout()
                if (r7 == 0) goto L_0x0043
                goto L_0x0049
            L_0x0043:
                int r7 = r6.getChildCount()
                int r1 = r7 + (-1)
            L_0x0049:
                android.view.View r7 = r6.getChildAt(r1)
                if (r7 == 0) goto L_0x007b
                boolean r1 = r6.getReverseLayout()
                if (r1 == 0) goto L_0x0056
                r0 = -1
            L_0x0056:
                int r6 = r6.getPosition(r7)
                goto L_0x0079
            L_0x005b:
                boolean r7 = r6.getReverseLayout()
                if (r7 == 0) goto L_0x0067
                int r7 = r6.getChildCount()
                int r1 = r7 + (-1)
            L_0x0067:
                android.view.View r7 = r6.getChildAt(r1)
                if (r7 == 0) goto L_0x007b
                boolean r1 = r6.getReverseLayout()
                if (r1 == 0) goto L_0x0074
                goto L_0x0075
            L_0x0074:
                r0 = -1
            L_0x0075:
                int r6 = r6.getPosition(r7)
            L_0x0079:
                int r8 = r6 + r0
            L_0x007b:
                if (r8 < 0) goto L_0x0085
                com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension$ScrollListener$b r6 = new com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension$ScrollListener$b
                r6.<init>(r8, r5)
                tb.jb6.n(r6)
            L_0x0085:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension.ScrollListener.p(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.LinearLayoutManager, int, int):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void r(androidx.recyclerview.widget.RecyclerView r5, androidx.recyclerview.widget.StaggeredGridLayoutManager r6, int r7, int r8) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension.ScrollListener.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0028
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r7)
                java.lang.Integer r7 = new java.lang.Integer
                r7.<init>(r8)
                r8 = 5
                java.lang.Object[] r8 = new java.lang.Object[r8]
                r8[r1] = r4
                r8[r0] = r5
                r5 = 2
                r8[r5] = r6
                r5 = 3
                r8[r5] = r3
                r5 = 4
                r8[r5] = r7
                java.lang.String r5 = "3975c16e"
                r2.ipc$dispatch(r5, r8)
                return
            L_0x0028:
                int r2 = r6.getOrientation()
                if (r2 != 0) goto L_0x002f
                goto L_0x0030
            L_0x002f:
                r7 = r8
            L_0x0030:
                if (r7 == 0) goto L_0x008c
                int r8 = r6.getChildCount()
                if (r8 == 0) goto L_0x008c
                int r8 = r6.getSpanCount()
                if (r8 == r0) goto L_0x003f
                goto L_0x008c
            L_0x003f:
                r8 = -1
                if (r7 <= 0) goto L_0x0061
                boolean r7 = r6.getReverseLayout()
                if (r7 == 0) goto L_0x0049
                goto L_0x004f
            L_0x0049:
                int r7 = r6.getChildCount()
                int r1 = r7 + (-1)
            L_0x004f:
                android.view.View r7 = r6.getChildAt(r1)
                if (r7 == 0) goto L_0x0081
                boolean r1 = r6.getReverseLayout()
                if (r1 == 0) goto L_0x005c
                r0 = -1
            L_0x005c:
                int r6 = r6.getPosition(r7)
                goto L_0x007f
            L_0x0061:
                boolean r7 = r6.getReverseLayout()
                if (r7 == 0) goto L_0x006d
                int r7 = r6.getChildCount()
                int r1 = r7 + (-1)
            L_0x006d:
                android.view.View r7 = r6.getChildAt(r1)
                if (r7 == 0) goto L_0x0081
                boolean r1 = r6.getReverseLayout()
                if (r1 == 0) goto L_0x007a
                goto L_0x007b
            L_0x007a:
                r0 = -1
            L_0x007b:
                int r6 = r6.getPosition(r7)
            L_0x007f:
                int r8 = r6 + r0
            L_0x0081:
                if (r8 >= 0) goto L_0x0084
                return
            L_0x0084:
                com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension$ScrollListener$c r6 = new com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension$ScrollListener$c
                r6.<init>(r8, r5)
                tb.jb6.n(r6)
            L_0x008c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension.ScrollListener.r(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.StaggeredGridLayoutManager, int, int):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f7512a;
        public final /* synthetic */ int b;
        public final /* synthetic */ DXRecyclerViewCacheExtension c;

        public a(RecyclerView recyclerView, int i, DXRecyclerViewCacheExtension dXRecyclerViewCacheExtension) {
            this.f7512a = recyclerView;
            this.b = i;
            this.c = dXRecyclerViewCacheExtension;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (DinamicXEngine.j0()) {
                h36.g("DXRecyclerViewCacheExtension", this.f7512a + " setupWithRecyclerViewWithPosition preRender: " + this.b);
            }
            this.c.j(this.b, this.f7512a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7513a;
        public final /* synthetic */ RecyclerView b;

        public b(int i, RecyclerView recyclerView) {
            this.f7513a = i;
            this.b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXRecyclerViewCacheExtension.this.j(this.f7513a - 1, this.b);
            DXRecyclerViewCacheExtension.this.j(this.f7513a + 1, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        View G(RecyclerView recyclerView, int i);

        boolean l(int i);
    }

    static {
        t2o.a(444597689);
        t2o.a(444596511);
    }

    public DXRecyclerViewCacheExtension(String str) {
        DinamicXEngine.Y0(this);
        this.d = str;
    }

    public static /* synthetic */ Object ipc$super(DXRecyclerViewCacheExtension dXRecyclerViewCacheExtension, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/utils/DXRecyclerViewCacheExtension");
    }

    public static void l(RecyclerView recyclerView, DXRecyclerViewCacheExtension dXRecyclerViewCacheExtension, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c070c7", new Object[]{recyclerView, dXRecyclerViewCacheExtension, new Integer(i)});
            return;
        }
        recyclerView.setViewCacheExtension(dXRecyclerViewCacheExtension);
        int i2 = DX_RECYCLER_VIEW_CACHE_SCROLL_LISTENER;
        Object tag = recyclerView.getTag(i2);
        if (tag instanceof RecyclerView.OnScrollListener) {
            recyclerView.removeOnScrollListener((RecyclerView.OnScrollListener) tag);
        }
        if (tag instanceof View.OnAttachStateChangeListener) {
            recyclerView.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) tag);
        }
        if (dXRecyclerViewCacheExtension != null) {
            ScrollListener scrollListener = new ScrollListener();
            recyclerView.setTag(i2, scrollListener);
            recyclerView.addOnScrollListener(scrollListener);
            recyclerView.addOnAttachStateChangeListener(scrollListener);
            if (DinamicXEngine.j0()) {
                h36.g("DXRecyclerViewCacheExtension", recyclerView + " setupWithRecyclerViewWithPosition: " + i);
            }
            dXRecyclerViewCacheExtension.k(recyclerView);
            if (dXRecyclerViewCacheExtension.c() == null) {
                jb6.n(new a(recyclerView, i, dXRecyclerViewCacheExtension));
            }
        } else if (tag != null) {
            recyclerView.setTag(i2, null);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4208d55", new Object[]{this});
        } else {
            this.f7507a.clear();
        }
    }

    public RecyclerView.Recycler c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Recycler) ipChange.ipc$dispatch("73c1f670", new Object[]{this});
        }
        WeakReference<RecyclerView.Recycler> weakReference = this.b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public RecyclerView d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        WeakReference<RecyclerView> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.taobao.android.dinamicx.j.a
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ed9b6d4", new Object[]{this});
        }
        if (!DinamicXEngine.j0()) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f7507a.size(); i2++) {
            SparseArray<View> sparseArray = this.f7507a.get(i2);
            if (sparseArray != null) {
                i += sparseArray.size();
            }
        }
        return " DXRecyclerViewCacheExtension mExtraCacheSize: " + i;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    public void g(int i, RecyclerView recyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b29e7d", new Object[]{this, new Integer(i), recyclerView, new Boolean(z)});
        } else if (i >= 0) {
            if (z) {
                jb6.n(new b(i, recyclerView));
                return;
            }
            j(i - 1, recyclerView);
            j(i + 1, recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ViewCacheExtension
    public View getViewForPositionAndType(RecyclerView.Recycler recycler, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("32697179", new Object[]{this, recycler, new Integer(i), new Integer(i2)});
        }
        RecyclerView d = d();
        if (!(this.b != null || recycler == null || d == null)) {
            g(i, d, true);
        }
        this.b = new WeakReference<>(recycler);
        return null;
    }

    public void h(RecyclerView.Recycler recycler, int i, int i2, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e8b64b", new Object[]{this, recycler, new Integer(i), new Integer(i2), recyclerView});
            return;
        }
        if (DinamicXEngine.j0()) {
            h36.g("DXRecyclerViewCacheExtension", recyclerView + "start 预渲染 by recycler View at " + i);
        }
        View viewForPosition = recycler.getViewForPosition(i);
        if (DinamicXEngine.j0()) {
            h36.g("DXRecyclerViewCacheExtension", recyclerView + "end 预渲染 by recycler View at " + i);
        }
        recycler.recycleView(viewForPosition);
    }

    public void i(c cVar, int i, int i2, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46dc1b93", new Object[]{this, cVar, new Integer(i), new Integer(i2), recyclerView});
            return;
        }
        if (DinamicXEngine.j0()) {
            h36.g("DXRecyclerViewCacheExtension", recyclerView + " start 预渲染 by strategy View at " + i);
        }
        View G = cVar.G(recyclerView, i);
        if (DinamicXEngine.j0()) {
            h36.g("DXRecyclerViewCacheExtension", recyclerView + " end 预渲染 by strategy View at " + i);
        }
        if (G != null) {
            SparseArray<View> sparseArray = this.f7507a.get(i2);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                this.f7507a.put(i2, sparseArray);
            }
            sparseArray.put(i, G);
        }
    }

    public void k(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46db97ca", new Object[]{this, recyclerView});
        } else if (recyclerView == null) {
            this.c = null;
        } else {
            this.c = new WeakReference<>(recyclerView);
        }
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("520cd585", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView d = d();
        if (c() == null && d != null) {
            g(i, d, true);
        }
    }

    @Override // com.taobao.android.dinamicx.j.a
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            a();
        }
    }

    public View b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("769701f1", new Object[]{this, new Integer(i)});
        }
        SparseArray<View> sparseArray = this.f7507a.get(i);
        if (sparseArray == null || sparseArray.size() == 0) {
            return null;
        }
        int size = sparseArray.size() - 1;
        View valueAt = sparseArray.valueAt(size);
        if (valueAt != null) {
            if (DinamicXEngine.j0()) {
                h36.g("DXRecyclerViewCacheExtension", d() + "extraCache 命中缓存 withViewType " + i);
            }
            sparseArray.removeAt(size);
        } else if (DinamicXEngine.j0()) {
            h36.g("DXRecyclerViewCacheExtension", d() + "extraCache 未命中缓存 withViewType " + i);
        }
        return valueAt;
    }

    public void j(int i, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8adde115", new Object[]{this, new Integer(i), recyclerView});
            return;
        }
        try {
            if (f() && recyclerView != null) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if ((adapter instanceof c) && i >= 0 && i <= adapter.getItemCount() - 1) {
                    if (((c) adapter).l(i)) {
                        int itemViewType = adapter.getItemViewType(i);
                        RecyclerView.Recycler c2 = c();
                        if (c2 != null) {
                            h(c2, i, itemViewType, recyclerView);
                        } else {
                            i((c) adapter, i, itemViewType, recyclerView);
                        }
                    } else if (DinamicXEngine.j0()) {
                        h36.g("DXRecyclerViewCacheExtension", recyclerView + "isItemNeedPreRender false 跳过预渲染 at " + i);
                    }
                }
            }
        } catch (Throwable th) {
            xv5.b(th);
            String str = this.d;
            if (str == null) {
                str = "dinamicx";
            }
            f fVar = new f(str);
            fVar.c = new ArrayList();
            f.a aVar = new f.a("DX_RECYCLER", "DX_RECYCLER", f.DX_CONTAINER_PRE_RENDER_ERROR);
            aVar.e = th.getMessage();
            HashMap hashMap = new HashMap();
            aVar.f = hashMap;
            hashMap.put("trace", xv5.a(th));
            ((ArrayList) fVar.c).add(aVar);
            ic5.p(fVar);
        }
    }
}
