package com.taobao.android.turbo.subpage.component.dx;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.view.DXNativeViewPagerView;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import com.taobao.android.turbo.subpage.component.dx.DxVideoControlHelper;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import tb.hm6;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DxVideoControlHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ = "guangguang";

    /* renamed from: a  reason: collision with root package name */
    public final hm6 f9805a;
    public Method c;
    public Method d;
    public DXNativeViewPagerView e;
    public DXRecyclerView f;
    public DXRecyclerView g;
    public final String h;
    public boolean j;
    public int b = -1;
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ViewPager.OnPageChangeListener k = new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.turbo.subpage.component.dx.DxVideoControlHelper.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            } else {
                DxVideoControlHelper.k(DxVideoControlHelper.this);
            }
        }
    };
    public final RecyclerView.OnScrollListener l = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.turbo.subpage.component.dx.DxVideoControlHelper.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass4 r5, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1177043419) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode == 1361287682) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/turbo/subpage/component/dx/DxVideoControlHelper$4");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (DxVideoControlHelper.l(DxVideoControlHelper.this) == null) {
                DxVideoControlHelper.k(DxVideoControlHelper.this);
            }
            if (DxVideoControlHelper.l(DxVideoControlHelper.this) != null && !DxVideoControlHelper.l(DxVideoControlHelper.this).canScrollVertically(-1)) {
                DxVideoControlHelper dxVideoControlHelper = DxVideoControlHelper.this;
                DxVideoControlHelper.m(dxVideoControlHelper, DxVideoControlHelper.l(dxVideoControlHelper), i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (DxVideoControlHelper.l(DxVideoControlHelper.this) != null && !DxVideoControlHelper.l(DxVideoControlHelper.this).canScrollVertically(-1)) {
                DxVideoControlHelper dxVideoControlHelper = DxVideoControlHelper.this;
                DxVideoControlHelper.n(dxVideoControlHelper, DxVideoControlHelper.l(dxVideoControlHelper));
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int[] f9808a;
        public final /* synthetic */ ViewGroup b;

        public a(int[] iArr, ViewGroup viewGroup) {
            this.f9808a = iArr;
            this.b = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int[] iArr = this.f9808a;
            iArr[0] = iArr[0] + 1;
            DxVideoControlHelper.d(DxVideoControlHelper.this, (DXNativeViewPagerView) DxVideoControlHelper.r(this.b, DXNativeViewPagerView.class));
            if (DxVideoControlHelper.c(DxVideoControlHelper.this) != null) {
                DxVideoControlHelper dxVideoControlHelper = DxVideoControlHelper.this;
                DxVideoControlHelper.e(dxVideoControlHelper, DxVideoControlHelper.c(dxVideoControlHelper).getCurrentItem());
                DxVideoControlHelper dxVideoControlHelper2 = DxVideoControlHelper.this;
                DxVideoControlHelper.g(dxVideoControlHelper2, DxVideoControlHelper.h(dxVideoControlHelper2, DxVideoControlHelper.c(dxVideoControlHelper2)));
                if (DxVideoControlHelper.f(DxVideoControlHelper.this) != null) {
                    DxVideoControlHelper.f(DxVideoControlHelper.this).addOnScrollListener(DxVideoControlHelper.i(DxVideoControlHelper.this));
                }
                DxVideoControlHelper.c(DxVideoControlHelper.this).setOnPageChangeListener(DxVideoControlHelper.j(DxVideoControlHelper.this));
            } else if (this.f9808a[0] < 10) {
                this.b.postDelayed(this, 300L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.turbo.subpage.component.dx.DxVideoControlHelper.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("179906ca", new Object[]{this});
            } else {
                DxVideoControlHelper.this.y();
            }
        }

        @Override // com.taobao.android.turbo.subpage.component.dx.DxVideoControlHelper.c
        public void appear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6aff7f9c", new Object[]{this});
            } else {
                DxVideoControlHelper.this.x();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void a();

        void appear();
    }

    static {
        t2o.a(916455749);
    }

    public DxVideoControlHelper(DinamicXEngine dinamicXEngine, String str) {
        this.f9805a = dinamicXEngine.F();
        this.h = str;
    }

    public static /* synthetic */ DXNativeViewPagerView c(DxVideoControlHelper dxVideoControlHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXNativeViewPagerView) ipChange.ipc$dispatch("a1b81167", new Object[]{dxVideoControlHelper});
        }
        return dxVideoControlHelper.e;
    }

    public static /* synthetic */ DXNativeViewPagerView d(DxVideoControlHelper dxVideoControlHelper, DXNativeViewPagerView dXNativeViewPagerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXNativeViewPagerView) ipChange.ipc$dispatch("9269657", new Object[]{dxVideoControlHelper, dXNativeViewPagerView});
        }
        dxVideoControlHelper.e = dXNativeViewPagerView;
        return dXNativeViewPagerView;
    }

    public static /* synthetic */ int e(DxVideoControlHelper dxVideoControlHelper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d022b696", new Object[]{dxVideoControlHelper, new Integer(i)})).intValue();
        }
        dxVideoControlHelper.b = i;
        return i;
    }

    public static /* synthetic */ DXRecyclerView f(DxVideoControlHelper dxVideoControlHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerView) ipChange.ipc$dispatch("106dde46", new Object[]{dxVideoControlHelper});
        }
        return dxVideoControlHelper.f;
    }

    public static /* synthetic */ DXRecyclerView g(DxVideoControlHelper dxVideoControlHelper, DXRecyclerView dXRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerView) ipChange.ipc$dispatch("d4b095d", new Object[]{dxVideoControlHelper, dXRecyclerView});
        }
        dxVideoControlHelper.f = dXRecyclerView;
        return dXRecyclerView;
    }

    public static /* synthetic */ DXRecyclerView h(DxVideoControlHelper dxVideoControlHelper, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerView) ipChange.ipc$dispatch("d47b1546", new Object[]{dxVideoControlHelper, viewGroup});
        }
        return dxVideoControlHelper.t(viewGroup);
    }

    public static /* synthetic */ RecyclerView.OnScrollListener i(DxVideoControlHelper dxVideoControlHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("d3be9e6a", new Object[]{dxVideoControlHelper});
        }
        return dxVideoControlHelper.l;
    }

    public static /* synthetic */ ViewPager.OnPageChangeListener j(DxVideoControlHelper dxVideoControlHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager.OnPageChangeListener) ipChange.ipc$dispatch("615db37", new Object[]{dxVideoControlHelper});
        }
        return dxVideoControlHelper.k;
    }

    public static /* synthetic */ void k(DxVideoControlHelper dxVideoControlHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05d023", new Object[]{dxVideoControlHelper});
        } else {
            dxVideoControlHelper.z();
        }
    }

    public static /* synthetic */ DXRecyclerView l(DxVideoControlHelper dxVideoControlHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerView) ipChange.ipc$dispatch("6040c0b", new Object[]{dxVideoControlHelper});
        }
        return dxVideoControlHelper.g;
    }

    public static /* synthetic */ void m(DxVideoControlHelper dxVideoControlHelper, DXRecyclerView dXRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ef7311", new Object[]{dxVideoControlHelper, dXRecyclerView, new Integer(i)});
        } else {
            dxVideoControlHelper.p(dXRecyclerView, i);
        }
    }

    public static /* synthetic */ void n(DxVideoControlHelper dxVideoControlHelper, DXRecyclerView dXRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e867b91", new Object[]{dxVideoControlHelper, dXRecyclerView});
        } else {
            dxVideoControlHelper.q(dXRecyclerView);
        }
    }

    public static <T extends View> T r(View view, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("ac4a6a83", new Object[]{view, cls}));
        }
        if (view == 0) {
            return null;
        }
        if (view.getClass().equals(cls)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                T t = (T) r(viewGroup.getChildAt(i), cls);
                if (t != null) {
                    return t;
                }
            }
        }
        return null;
    }

    public static c s(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("2cfcba3f", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(R.id.turbo_dx_video_view_control_lifecycle);
        if (tag instanceof c) {
            return (c) tag;
        }
        return null;
    }

    public final void A(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f7c74b", new Object[]{this, new Integer(i)});
        } else {
            this.i.postDelayed(new Runnable() { // from class: tb.x38
                @Override // java.lang.Runnable
                public final void run() {
                    DxVideoControlHelper.this.w(i);
                }
            }, 350L);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3492cdce", new Object[]{this});
            return;
        }
        DXNativeViewPagerView dXNativeViewPagerView = this.e;
        if (!(dXNativeViewPagerView == null || dXNativeViewPagerView.getChildCount() == 0)) {
            for (int i = 0; i < this.e.getChildCount(); i++) {
                DXRecyclerView dXRecyclerView = (DXRecyclerView) r(this.e.getChildAt(i), DXRecyclerView.class);
                if (dXRecyclerView != null) {
                    String str = "guangguang_" + this.h + i;
                    this.f9805a.b(dXRecyclerView, str);
                    tfs.e("DxVideoControlHelper", "clearVideoQueue key :" + str);
                }
            }
        }
    }

    public final void p(DXRecyclerView dXRecyclerView, int i) {
        try {
            if (this.d == null) {
                Method declaredMethod = RecyclerView.class.getDeclaredMethod("dispatchOnScrollStateChanged", Integer.TYPE);
                this.d = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            this.d.invoke(dXRecyclerView, Integer.valueOf(i));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void q(DXRecyclerView dXRecyclerView) {
        try {
            if (this.c == null) {
                Class cls = Integer.TYPE;
                Method declaredMethod = RecyclerView.class.getDeclaredMethod("dispatchOnScrolled", cls, cls);
                this.c = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            this.c.invoke(dXRecyclerView, 0, 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final DXRecyclerView t(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerView) ipChange.ipc$dispatch("2e7122c5", new Object[]{this, viewGroup});
        }
        if (viewGroup == null) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
        if (viewGroup2 instanceof DXRecyclerView) {
            return (DXRecyclerView) viewGroup.getParent();
        }
        return t(viewGroup2);
    }

    public void u(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a8f8d6", new Object[]{this, viewGroup});
            return;
        }
        viewGroup.postDelayed(new a(new int[]{1}, viewGroup), 300L);
        viewGroup.setTag(R.id.turbo_dx_video_view_control_lifecycle, new b());
    }

    public final /* synthetic */ void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("813909f9", new Object[]{this});
        } else if (this.j) {
            String str = "guangguang_" + this.h + this.e.getCurrentItem();
            this.f9805a.g(this.g, str);
            tfs.e("DxVideoControlHelper", "addVideoQueue1  key :" + str);
        }
    }

    public final /* synthetic */ void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be5c3e2", new Object[]{this, new Integer(i)});
        } else if (this.j) {
            o();
            if (i == this.e.getCurrentItem()) {
                String str = "guangguang_" + this.h + i;
                tfs.e("DxVideoControlHelper", "addVideoQueue  key :" + str);
                this.f9805a.m(this.g, str);
            }
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8715f2af", new Object[]{this});
            return;
        }
        this.j = true;
        DXNativeViewPagerView dXNativeViewPagerView = this.e;
        if (dXNativeViewPagerView != null) {
            DXRecyclerView dXRecyclerView = (DXRecyclerView) r(dXNativeViewPagerView.getChildAt(dXNativeViewPagerView.getCurrentItem()), DXRecyclerView.class);
            this.g = dXRecyclerView;
            if (dXRecyclerView != null && this.f9805a != null) {
                this.i.postDelayed(new Runnable() { // from class: tb.v38
                    @Override // java.lang.Runnable
                    public final void run() {
                        DxVideoControlHelper.this.v();
                    }
                }, 350L);
            }
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01256d7", new Object[]{this});
            return;
        }
        this.i.removeCallbacksAndMessages(null);
        this.j = false;
        o();
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fade9b27", new Object[]{this});
            return;
        }
        o();
        if (this.b != this.e.getCurrentItem() || this.g == null) {
            this.b = this.e.getCurrentItem();
            DXNativeViewPagerView dXNativeViewPagerView = this.e;
            DXRecyclerView dXRecyclerView = (DXRecyclerView) r(dXNativeViewPagerView.getChildAt(dXNativeViewPagerView.getCurrentItem()), DXRecyclerView.class);
            this.g = dXRecyclerView;
            if (dXRecyclerView != null && this.f9805a != null) {
                this.i.removeCallbacksAndMessages(null);
                A(this.b);
            }
        }
    }
}
