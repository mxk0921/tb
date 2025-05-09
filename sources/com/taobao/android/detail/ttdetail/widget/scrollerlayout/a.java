package com.taobao.android.detail.ttdetail.widget.scrollerlayout;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.core.view.ScrollingView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import tb.hrj;
import tb.lnd;
import tb.ozc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Method f7035a;
    public static Method b;
    public static Method c;
    public static final Rect d = new Rect();

    static {
        t2o.a(912263090);
    }

    public static void a(List<View> list, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616e984a", new Object[]{list, view, new Integer(i), new Integer(i2)});
        } else if (s(view, i, i2)) {
            list.add(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    a(list, viewGroup.getChildAt(i3), i, i2);
                }
            }
        }
    }

    public static boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1e362cf", new Object[]{view})).booleanValue();
        }
        if (c(view, 1) || c(view, -1)) {
            return true;
        }
        return false;
    }

    public static boolean c(View view, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a89699c", new Object[]{view, new Integer(i)})).booleanValue();
        }
        View n = n(view);
        if (n == null || n.getVisibility() == 8) {
            return false;
        }
        if (n instanceof AbsListView) {
            return ((AbsListView) n).canScrollList(i);
        }
        if (!(n instanceof RecyclerView)) {
            return n.canScrollVertically(i);
        }
        RecyclerView recyclerView = (RecyclerView) n;
        if ((recyclerView.canScrollHorizontally(1) || recyclerView.canScrollHorizontally(-1)) && !recyclerView.canScrollVertically(i)) {
            return false;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (!(layoutManager == null || adapter == null || adapter.getItemCount() <= 0)) {
            if (i > 0) {
                i2 = adapter.getItemCount() - 1;
            } else {
                i2 = 0;
            }
            if (layoutManager.findViewByPosition(i2) == null) {
                return true;
            }
            int childCount = recyclerView.getChildCount();
            if (i > 0) {
                for (int i3 = childCount - 1; i3 >= 0; i3--) {
                    View childAt = recyclerView.getChildAt(i3);
                    Rect rect = d;
                    recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                    if (rect.bottom > recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                        return true;
                    }
                }
                return false;
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = recyclerView.getChildAt(i4);
                Rect rect2 = d;
                recyclerView.getDecoratedBoundsWithMargins(childAt2, rect2);
                if (rect2.top < recyclerView.getPaddingTop()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cef82d6", new Object[]{view})).booleanValue();
        }
        hrj h = h(view);
        if (h == null || !h.b) {
            return false;
        }
        return true;
    }

    public static int e(View view) {
        View n = n(view);
        if (n instanceof ScrollingView) {
            return ((ScrollingView) n).computeVerticalScrollExtent();
        }
        try {
            if (c == null) {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollExtent", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = c.invoke(n, new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n.getHeight();
    }

    public static int f(View view) {
        View n = n(view);
        if (n instanceof ScrollingView) {
            return ((ScrollingView) n).computeVerticalScrollOffset();
        }
        try {
            if (f7035a == null) {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollOffset", new Class[0]);
                f7035a = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = f7035a.invoke(n, new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n.getScrollY();
    }

    public static int g(View view) {
        View n = n(view);
        if (n instanceof ScrollingView) {
            return ((ScrollingView) n).computeVerticalScrollRange();
        }
        try {
            if (b == null) {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollRange", new Class[0]);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = b.invoke(n, new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n.getHeight();
    }

    public static hrj h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hrj) ipChange.ipc$dispatch("6b640ea4", new Object[]{view});
        }
        ozc o = o(view);
        if (o instanceof hrj) {
            return (hrj) o;
        }
        return null;
    }

    public static int i(View view, MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1225ffdc", new Object[]{view, motionEvent, new Integer(i)})).intValue();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return (int) (iArr[0] + motionEvent.getX(i));
    }

    public static int j(View view, MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55b11d9d", new Object[]{view, motionEvent, new Integer(i)})).intValue();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return (int) (iArr[1] + motionEvent.getY(i));
    }

    public static int k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75cb1fbd", new Object[]{view})).intValue();
        }
        boolean c2 = c(view, 1);
        boolean d2 = d(view);
        if (!c2 || d2) {
            return 0;
        }
        return Math.max((g(view) - f(view)) - e(view), 1);
    }

    public static View l(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fc754774", new Object[]{view});
        }
        ozc o = o(view);
        if (o != null) {
            return o.r();
        }
        return view;
    }

    public static int m(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46477379", new Object[]{view})).intValue();
        }
        if (c(view, -1)) {
            return Math.min(-f(view), -1);
        }
        return 0;
    }

    public static View n(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("934794e6", new Object[]{view});
        }
        View l = l(view);
        while (l instanceof lnd) {
            View a2 = ((lnd) l).a();
            if (l == a2) {
                return a2;
            }
            l = a2;
        }
        return l;
    }

    public static ozc o(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozc) ipChange.ipc$dispatch("547cac9a", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof TTDetailScrollerLayout.LayoutParams) {
            return ((TTDetailScrollerLayout.LayoutParams) layoutParams).f7033a;
        }
        return null;
    }

    public static List<View> p(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d19921c1", new Object[]{view, new Integer(i), new Integer(i2)});
        }
        ArrayList arrayList = new ArrayList();
        a(arrayList, view, i, i2);
        return arrayList;
    }

    public static boolean q(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("839d08f8", new Object[]{view})).booleanValue();
        }
        while ((view.getParent() instanceof ViewGroup) && !(view.getParent() instanceof TTDetailScrollerLayout)) {
            view = (View) view.getParent();
        }
        if (view.getParent() instanceof TTDetailScrollerLayout) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean r(android.view.View r4, int r5, int r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0029
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r5)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r6)
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r4
            r6[r0] = r3
            r4 = 2
            r6[r4] = r5
            java.lang.String r4 = "5fcdcd94"
            java.lang.Object r4 = r2.ipc$dispatch(r4, r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0029:
            java.util.List r4 = p(r4, r5, r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x0031:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004b
            java.lang.Object r5 = r4.next()
            android.view.View r5 = (android.view.View) r5
            boolean r6 = r5.canScrollHorizontally(r0)
            if (r6 != 0) goto L_0x004a
            r6 = -1
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L_0x0031
        L_0x004a:
            return r0
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.r(android.view.View, int, int):boolean");
    }

    public static boolean s(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90afb68a", new Object[]{view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i3;
        int measuredHeight = view.getMeasuredHeight() + i4;
        if (i < i3 || i > measuredWidth || i2 < i4 || i2 > measuredHeight) {
            return false;
        }
        return true;
    }
}
