package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class bpg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int LAYOUT_TYPE_STACK = 1;
    public static final int LAYOUT_TYPE_WITH_MORE = 2;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<View> f16531a = new ArrayList<>();
    public int b = 1;
    public int c;
    public int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792481);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792480);
    }

    public final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        this.f16531a.add(view);
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62986221", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final int c() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e80b222b", new Object[]{this})).intValue();
        }
        this.c = 0;
        Iterator<View> it = this.f16531a.iterator();
        ckf.f(it, "iterator(...)");
        int i = 0;
        while (it.hasNext()) {
            View next = it.next();
            ckf.f(next, "next(...)");
            View view = next;
            if (this.b != 2 || !z) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (view.getMeasuredHeight() > i) {
                    this.c = view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    i = view.getMeasuredHeight();
                }
            } else {
                z = false;
            }
        }
        return this.c;
    }

    public final int e(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("749d7a45", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (this.b == 1) {
            Iterator<View> it = this.f16531a.iterator();
            ckf.f(it, "iterator(...)");
            while (it.hasNext()) {
                View next = it.next();
                ckf.f(next, "next(...)");
                View view = next;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                int measuredHeight = (this.d + i) - (view.getMeasuredHeight() / 2);
                int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                view.layout(i2 + i4, measuredHeight, i2 + i4 + view.getMeasuredWidth(), view.getMeasuredHeight() + measuredHeight);
                i2 = view.getRight();
            }
        } else if (this.f16531a.size() >= 2) {
            View view2 = this.f16531a.get(0);
            ckf.f(view2, "get(...)");
            View view3 = view2;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            ckf.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            int measuredHeight2 = (this.d + i) - (view3.getMeasuredHeight() / 2);
            view3.layout((i3 - marginLayoutParams.rightMargin) - view3.getMeasuredWidth(), measuredHeight2, i3 - marginLayoutParams.rightMargin, view3.getMeasuredHeight() + measuredHeight2);
            int size = this.f16531a.size();
            for (int i5 = 1; i5 < size; i5++) {
                View view4 = this.f16531a.get(i5);
                ckf.f(view4, "get(...)");
                View view5 = view4;
                ViewGroup.LayoutParams layoutParams3 = view5.getLayoutParams();
                ckf.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                int measuredHeight3 = (this.d + i) - (view5.getMeasuredHeight() / 2);
                int i6 = i2 + marginLayoutParams2.leftMargin;
                view5.layout(i6, measuredHeight3, view5.getMeasuredWidth() + i6, view5.getMeasuredHeight() + measuredHeight3);
                i2 = i6 + view5.getMeasuredWidth() + marginLayoutParams2.rightMargin;
            }
        }
        return this.c;
    }

    public final void f(int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18363f8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        this.d = 0;
        Iterator<View> it = this.f16531a.iterator();
        ckf.f(it, "iterator(...)");
        int i3 = 0;
        while (it.hasNext()) {
            View next = it.next();
            ckf.f(next, "next(...)");
            View view = next;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            view.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, Integer.MIN_VALUE), i2);
            size -= (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin) + view.getMeasuredWidth();
            if (this.b == 2 && z) {
                z = false;
            } else if (view.getMeasuredHeight() > i3) {
                i3 = view.getMeasuredHeight();
                this.d = marginLayoutParams.topMargin + (view.getMeasuredHeight() / 2);
            }
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff7f74b", new Object[]{this});
        } else {
            this.b = 2;
        }
    }

    public final void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c5962d", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        this.f16531a.add(0, view);
    }
}
