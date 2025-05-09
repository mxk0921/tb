package tb;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class da6 implements ca6, ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f17677a;
    public View b;
    public View c;
    public View d;
    public View e;
    public int f = 0;
    public boolean g = true;
    public boolean h = true;
    public nc6 i = new nc6();

    static {
        t2o.a(444597652);
        t2o.a(444597638);
    }

    public da6(View view) {
        this.c = view;
        this.b = view;
        this.f17677a = view;
    }

    @Override // tb.ca6
    public void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f104d3", new Object[]{this, motionEvent});
            return;
        }
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.f17677a.getLeft(), -this.f17677a.getTop());
        View view = this.c;
        View view2 = this.f17677a;
        if (view != view2) {
            this.c = k(view2, pointF, view);
        }
        if (this.c == this.f17677a) {
            this.i.f24635a = null;
        } else {
            this.i.f24635a = pointF;
        }
    }

    @Override // tb.ca6
    public ValueAnimator.AnimatorUpdateListener b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator.AnimatorUpdateListener) ipChange.ipc$dispatch("d2808746", new Object[]{this, new Integer(i)});
        }
        View view = this.c;
        if (view == null || i == 0) {
            return null;
        }
        if ((i >= 0 || !view.canScrollVertically(1)) && (i <= 0 || !this.c.canScrollVertically(-1))) {
            return null;
        }
        this.f = i;
        return this;
    }

    @Override // tb.ca6
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a618c56", new Object[]{this})).booleanValue();
        }
        if (!this.h || !this.i.a(this.f17677a)) {
            return false;
        }
        return true;
    }

    @Override // tb.ca6
    public boolean canRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176657f6", new Object[]{this})).booleanValue();
        }
        if (!this.g || !this.i.b(this.f17677a)) {
            return false;
        }
        return true;
    }

    @Override // tb.ca6
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1954ca", new Object[]{this, new Boolean(z)});
        } else {
            this.i.c = z;
        }
    }

    @Override // tb.ca6
    public void e(DXRefreshLayout.i iVar, View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ceeb0e", new Object[]{this, iVar, view, view2});
        } else {
            j(this.f17677a, iVar);
        }
    }

    @Override // tb.ca6
    public void f(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a6eb4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.b.setTranslationY(i);
        }
    }

    @Override // tb.ca6
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29399002", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.c;
        if (view != null && i != 0 && (view instanceof DXRecyclerView)) {
            ((DXRecyclerView) view).scrollByAfterLayout(0, -i);
        }
    }

    @Override // tb.ca6
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f17677a;
    }

    @Override // tb.ca6
    public void h(sb6 sb6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4ff08a", new Object[]{this, sb6Var});
        } else if (sb6Var instanceof nc6) {
            this.i = (nc6) sb6Var;
        } else {
            this.i.b = sb6Var;
        }
    }

    @Override // tb.ca6
    public View i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b6d6d16b", new Object[]{this});
        }
        return this.c;
    }

    public void j(View view, DXRefreshLayout.i iVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c437cf", new Object[]{this, view, iVar});
            return;
        }
        this.f17677a.isInEditMode();
        View view2 = null;
        while (true) {
            if (view2 != null && (!(view2 instanceof NestedScrollingParent) || (view2 instanceof NestedScrollingChild))) {
                break;
            }
            if (view2 == null) {
                z = true;
            } else {
                z = false;
            }
            view = l(view, z);
            if (view == view2) {
                break;
            }
            view2 = view;
        }
        if (view2 != null) {
            this.c = view2;
        }
    }

    public View k(View view, PointF pointF, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f0c96f24", new Object[]{this, view, pointF, view2});
        }
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (ha6.g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && ha6.e(childAt)) {
                        return childAt;
                    } else {
                        pointF.offset(pointF2.x, pointF2.y);
                        View k = k(childAt, pointF, view2);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return k;
                    }
                }
            }
        }
        return view2;
    }

    public View l(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d4d47dad", new Object[]{this, view, new Boolean(z)});
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        View view2 = null;
        while (linkedList.size() > 0 && view2 == null) {
            View view3 = (View) linkedList.poll();
            if (view3 != null) {
                if ((z || view3 != view) && ha6.e(view3)) {
                    view2 = view3;
                } else if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        linkedList.add(viewGroup.getChildAt(i));
                    }
                }
            }
        }
        if (view2 == null) {
            return view;
        }
        return view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (intValue - this.f) * this.c.getScaleY();
            View view = this.c;
            if (view instanceof AbsListView) {
                ha6.i((AbsListView) view, (int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f = intValue;
    }
}
