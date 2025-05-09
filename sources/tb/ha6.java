package tb;

import android.content.res.Resources;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ScrollingView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ha6 implements Interpolator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f20498a = 1;
    public static final float b = Resources.getSystem().getDisplayMetrics().density;
    public static final float c;
    public static final float d;

    static {
        t2o.a(444597651);
        float j = 1.0f / j(1.0f);
        c = j;
        d = 1.0f - (j * j(1.0f));
    }

    public ha6(int i) {
    }

    public static boolean a(View view, PointF pointF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44abf5b1", new Object[]{view, pointF, new Boolean(z)})).booleanValue();
        }
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null && !f(view)) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    Object tag = childAt.getTag(R.id.dx_refresh_layout_tag);
                    if ("fixed".equals(tag) || "fixed-top".equals(tag)) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean a2 = a(childAt, pointF, z);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return a2;
                }
            }
        }
        if (z || view.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public static boolean b(View view, PointF pointF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d9e59ab", new Object[]{view, pointF})).booleanValue();
        }
        if (view.canScrollVertically(-1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    Object tag = childAt.getTag(R.id.dx_refresh_layout_tag);
                    if ("fixed".equals(tag) || "fixed-bottom".equals(tag)) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean b2 = b(childAt, pointF);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return b2;
                }
            }
        }
        return true;
    }

    public static int c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88b66f1e", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f * b) + 0.5f);
    }

    public static void d(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800288d4", new Object[]{view, new Integer(i)});
        } else if (view instanceof ScrollView) {
            ((ScrollView) view).fling(i);
        } else if (view instanceof AbsListView) {
            ((AbsListView) view).fling(i);
        } else if (view instanceof WebView) {
            ((WebView) view).flingScroll(0, i);
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).fling(i);
        } else if (view instanceof RecyclerView) {
            ((RecyclerView) view).fling(0, i);
        }
    }

    public static boolean e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa19cb3b", new Object[]{view})).booleanValue();
        }
        if (view instanceof ba6) {
            return false;
        }
        if (f(view) || (view instanceof ViewPager) || (view instanceof NestedScrollingParent)) {
            return true;
        }
        return false;
    }

    public static boolean f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c12fb79", new Object[]{view})).booleanValue();
        }
        if (view instanceof ba6) {
            return false;
        }
        if ((view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof ScrollingView) || (view instanceof WebView) || (view instanceof NestedScrollingChild)) {
            return true;
        }
        return false;
    }

    public static boolean g(View view, View view2, float f, float f2, PointF pointF) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a71f0668", new Object[]{view, view2, new Float(f), new Float(f2), pointF})).booleanValue();
        }
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f, f2};
        fArr[0] = (view.getScrollX() - view2.getLeft()) + f;
        float scrollY = fArr[1] + (view.getScrollY() - view2.getTop());
        fArr[1] = scrollY;
        float f3 = fArr[0];
        if (f3 < 0.0f || scrollY < 0.0f || f3 >= view2.getWidth() || fArr[1] >= view2.getHeight()) {
            z = false;
        } else {
            z = true;
        }
        if (z && pointF != null) {
            pointF.set(fArr[0] - f, fArr[1] - f2);
        }
        return z;
    }

    public static float h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15d9b3d6", new Object[]{new Integer(i)})).floatValue();
        }
        return i / b;
    }

    public static void i(AbsListView absListView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb73f35", new Object[]{absListView, new Integer(i)});
        } else {
            absListView.scrollListBy(i);
        }
    }

    public static float j(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6dbe6049", new Object[]{new Float(f)})).floatValue();
        }
        float f2 = f * 8.0f;
        if (f2 < 1.0f) {
            return f2 - (1.0f - ((float) Math.exp(-f2)));
        }
        return 0.36787945f + ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
        }
        if (f20498a == 0) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        }
        float j = c * j(f);
        if (j > 0.0f) {
            return j + d;
        }
        return j;
    }
}
