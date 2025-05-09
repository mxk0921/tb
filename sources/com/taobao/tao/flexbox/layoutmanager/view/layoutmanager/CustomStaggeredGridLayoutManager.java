package com.taobao.tao.flexbox.layoutmanager.view.layoutmanager;

import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import tb.s6o;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CustomStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public GridLayoutManager.SpanSizeLookup f12404a;
    public final RecyclerView b;
    public int c;
    public Parcelable e;
    public float d = 1.0f;
    public boolean f = true;
    public Method g = null;
    public boolean h = false;

    static {
        t2o.a(503317516);
    }

    public CustomStaggeredGridLayoutManager(int i, int i2, RecyclerView recyclerView) {
        super(i, i2);
        this.b = recyclerView;
    }

    public static /* synthetic */ Object ipc$super(CustomStaggeredGridLayoutManager customStaggeredGridLayoutManager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -574012007:
                return new Boolean(super.canScrollHorizontally());
            case 514551467:
                return new Boolean(super.canScrollVertically());
            case 1027840325:
                super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                return null;
            case 1050392251:
                super.onDetachedFromWindow((RecyclerView) objArr[0], (RecyclerView.Recycler) objArr[1]);
                return null;
            case 1242672066:
                super.onAttachedToWindow((RecyclerView) objArr[0]);
                return null;
            case 1365175321:
                super.requestSimpleAnimationsInNextLayout();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/layoutmanager/CustomStaggeredGridLayoutManager");
        }
    }

    public static /* synthetic */ int y(CustomStaggeredGridLayoutManager customStaggeredGridLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86f9c1ea", new Object[]{customStaggeredGridLayoutManager})).intValue();
        }
        return customStaggeredGridLayoutManager.c;
    }

    public void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void B(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e464894e", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void C(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc9cad2", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
        }
        if (this.f) {
            return super.canScrollHorizontally();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        if (this.f) {
            return super.canScrollVertically();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a11abc2", new Object[]{this, recyclerView});
            return;
        }
        onRestoreInstanceState(this.e);
        super.onAttachedToWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9bb6bb", new Object[]{this, recyclerView, recycler});
            return;
        }
        this.e = onSaveInstanceState();
        super.onDetachedFromWindow(recyclerView, recycler);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.g == null && !this.h) {
            try {
                Method declaredMethod = RecyclerView.class.getDeclaredMethod("markItemDecorInsetsDirty", new Class[0]);
                this.g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                this.h = true;
            }
        }
        if (this.g != null && state.willRunSimpleAnimations()) {
            try {
                this.g.invoke(this.b, new Object[0]);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception e4) {
            tfs.e("ListViewComponent", e4.getMessage());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void requestSimpleAnimationsInNextLayout() {
        super.requestSimpleAnimationsInNextLayout();
        Method method = this.g;
        if (method != null) {
            try {
                method.invoke(this.b, new Object[0]);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void setSpanSizeLookup(GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6609c801", new Object[]{this, spanSizeLookup});
        } else {
            this.f12404a = spanSizeLookup;
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
        } else if (this.c <= 0) {
            CustomLinearSmoothScroller.f12403a = this.d;
            CustomLinearSmoothScroller customLinearSmoothScroller = new CustomLinearSmoothScroller(recyclerView.getContext());
            this.d = 1.0f;
            CustomLinearSmoothScroller.f12403a = 1.0f;
            customLinearSmoothScroller.setTargetPosition(i);
            startSmoothScroll(customLinearSmoothScroller);
        } else {
            int width = recyclerView.getWidth();
            if (width <= 0) {
                width = s6o.S(recyclerView.getContext(), 750);
            }
            final float f = width;
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.taobao.tao.flexbox.layoutmanager.view.layoutmanager.CustomStaggeredGridLayoutManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/layoutmanager/CustomStaggeredGridLayoutManager$1");
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
                    }
                    return CustomStaggeredGridLayoutManager.y(CustomStaggeredGridLayoutManager.this) / f;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public int calculateTimeForDeceleration(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("396f02ba", new Object[]{this, new Integer(i2)})).intValue();
                    }
                    return (int) Math.ceil(calculateTimeForScrolling(i2));
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public void onTargetFound(View view, RecyclerView.State state2, RecyclerView.SmoothScroller.Action action) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43a25518", new Object[]{this, view, state2, action});
                        return;
                    }
                    int calculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
                    int calculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
                    int calculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((calculateDxToMakeVisible * calculateDxToMakeVisible) + (calculateDyToMakeVisible * calculateDyToMakeVisible)));
                    if (calculateTimeForDeceleration > 0) {
                        action.update(-calculateDxToMakeVisible, -calculateDyToMakeVisible, calculateTimeForDeceleration, this.mLinearInterpolator);
                    }
                }
            };
            linearSmoothScroller.setTargetPosition(i);
            startSmoothScroll(linearSmoothScroller);
        }
    }

    public int z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i)})).intValue();
        }
        GridLayoutManager.SpanSizeLookup spanSizeLookup = this.f12404a;
        if (spanSizeLookup != null) {
            return spanSizeLookup.getSpanSize(i);
        }
        return -1;
    }
}
