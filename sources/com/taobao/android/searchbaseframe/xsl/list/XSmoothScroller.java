package com.taobao.android.searchbaseframe.xsl.list;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import java.lang.reflect.Field;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XSmoothScroller implements PartnerRecyclerView.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c f9352a;
    public final RecyclerView b;
    public int c;
    public int d;
    public boolean e = false;
    public final b f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class FakeScroller extends SimpleScroller {
        public static Field b;
        public static Field c;

        static {
            t2o.a(993002035);
        }

        public FakeScroller(Context context, int i, RecyclerView recyclerView) {
            super(context, i);
            try {
                if (b == null) {
                    b = RecyclerView.SmoothScroller.class.getDeclaredField("mRecyclerView");
                    c = RecyclerView.SmoothScroller.class.getDeclaredField("mLayoutManager");
                    b.setAccessible(true);
                    c.setAccessible(true);
                }
                b.set(this, recyclerView);
                c.set(this, recyclerView.getLayoutManager());
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class SimpleScroller extends LinearSmoothScroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f9354a;

        static {
            t2o.a(993002038);
        }

        public SimpleScroller(Context context, int i) {
            super(context);
            this.f9354a = i;
        }

        public static /* synthetic */ Object ipc$super(SimpleScroller simpleScroller, String str, Object... objArr) {
            if (str.hashCode() == -1154160711) {
                return new Integer(super.calculateDyToMakeVisible((View) objArr[0], ((Number) objArr[1]).intValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/list/XSmoothScroller$SimpleScroller");
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDyToMakeVisible(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bb34e7b9", new Object[]{this, view, new Integer(i)})).intValue();
            }
            return super.calculateDyToMakeVisible(view, i) + this.f9354a;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
            }
            return -1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else {
                XSmoothScroller.b(XSmoothScroller.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void d(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f9356a;
        public final int b;
        public final int c;

        static {
            t2o.a(993002037);
        }

        public c(int i, int i2, int i3) {
            this.f9356a = i;
            this.b = i2;
            this.c = i3;
        }

        public static /* synthetic */ int a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("42fe6856", new Object[]{cVar})).intValue();
            }
            return cVar.f9356a;
        }

        public static /* synthetic */ int b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("71afd275", new Object[]{cVar})).intValue();
            }
            return cVar.b;
        }

        public static /* synthetic */ int c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a0613c94", new Object[]{cVar})).intValue();
            }
            return cVar.c;
        }
    }

    static {
        t2o.a(993002032);
        t2o.a(993001671);
    }

    public XSmoothScroller(RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        this.b = recyclerView;
        recyclerView.addOnLayoutChangeListener(new a());
        j();
        ((PartnerRecyclerView) recyclerView).setLayoutCompleteListener(this);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.searchbaseframe.xsl.list.XSmoothScroller.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                if (str.hashCode() == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/list/XSmoothScroller$2");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView2, i, i2);
                if (XSmoothScroller.c(XSmoothScroller.this)) {
                    XSmoothScroller.d(XSmoothScroller.this, i2);
                }
            }
        });
        if (adapter instanceof b) {
            this.f = (b) adapter;
        } else {
            this.f = null;
        }
    }

    public static /* synthetic */ void b(XSmoothScroller xSmoothScroller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2169c7cf", new Object[]{xSmoothScroller});
        } else {
            xSmoothScroller.j();
        }
    }

    public static /* synthetic */ boolean c(XSmoothScroller xSmoothScroller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdd7c432", new Object[]{xSmoothScroller})).booleanValue();
        }
        return xSmoothScroller.e;
    }

    public static /* synthetic */ int d(XSmoothScroller xSmoothScroller, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5f5bb8b", new Object[]{xSmoothScroller, new Integer(i)})).intValue();
        }
        xSmoothScroller.d = i;
        return i;
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        c cVar = this.f9352a;
        if (cVar != null) {
            h(c.a(cVar), c.b(this.f9352a), c.c(this.f9352a));
            this.f9352a = null;
        }
    }

    public final void e(StaggeredGridLayoutManager staggeredGridLayoutManager, boolean z, boolean z2, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e2b4076", new Object[]{this, staggeredGridLayoutManager, new Boolean(z), new Boolean(z2), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (z) {
            this.f9352a = new c(i, i2, i4);
            if (z2) {
                i3 = -i3;
            }
            staggeredGridLayoutManager.scrollToPositionWithOffset(i, i3 + i2);
        } else {
            h(i, i2, i4);
        }
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f467c3", new Object[]{this, new Integer(i)});
            return;
        }
        this.d = 0;
        this.e = true;
        if (i != 0) {
            this.b.scrollBy(0, i);
        }
        this.e = false;
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11842396", new Object[]{this, new Boolean(z)});
            return;
        }
        b bVar = this.f;
        if (bVar != null) {
            bVar.d(z);
        }
    }

    public final void h(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896a641", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        SimpleScroller simpleScroller = new SimpleScroller(this.b.getContext(), i2 - i3);
        simpleScroller.setTargetPosition(i);
        if (this.b.getLayoutManager() != null) {
            this.b.startNestedScroll(2, 1);
            this.b.getLayoutManager().startSmoothScroll(simpleScroller);
        }
    }

    public void i(int i, int i2, int i3) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb17e9d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        int i4 = this.c;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.b.getLayoutManager();
        if (staggeredGridLayoutManager != null) {
            View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(i);
            if (findViewByPosition != null) {
                h(i, i2, i3);
                return;
            }
            g(true);
            PointF computeScrollVectorForPosition = staggeredGridLayoutManager.computeScrollVectorForPosition(i);
            int ceil = (int) Math.ceil((i4 * 1.0f) / this.b.getMeasuredHeight());
            if (computeScrollVectorForPosition == null || computeScrollVectorForPosition.y < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            int measuredHeight = this.b.getMeasuredHeight();
            if (z) {
                measuredHeight = -measuredHeight;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < ceil; i6++) {
                f(measuredHeight);
                i5 += this.d;
                findViewByPosition = staggeredGridLayoutManager.findViewByPosition(i);
                if (findViewByPosition != null) {
                    break;
                }
            }
            int i7 = i4 + 1;
            if (findViewByPosition != null) {
                FakeScroller fakeScroller = new FakeScroller(this.b.getContext(), i2, this.b);
                int calculateDyToMakeVisible = fakeScroller.calculateDyToMakeVisible(findViewByPosition, fakeScroller.getVerticalSnapPreference());
                if (!z || i2 > 0) {
                    f(-calculateDyToMakeVisible);
                    calculateDyToMakeVisible = -this.d;
                    f(calculateDyToMakeVisible);
                }
                i7 = calculateDyToMakeVisible - i5;
            }
            f(-i5);
            g(false);
            if (Math.abs(i7) > i4) {
                z2 = true;
            } else {
                z2 = false;
            }
            e(staggeredGridLayoutManager, z2, z, i, i2, i4, i3);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae54c577", new Object[]{this});
        } else {
            this.c = (int) (this.b.getMeasuredHeight() * 1.5f);
        }
    }
}
