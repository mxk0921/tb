package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.taobao.R;
import tb.nwv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TNodeNestScrollView extends AbsTNodeScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View pendingFlingView;
    private boolean scrollable;
    private Scroller scroller;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ScrollChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f12392a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.view.TNodeNestScrollView$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0706a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0706a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                TNodeNestScrollView.access$100(TNodeNestScrollView.this, aVar.f12392a);
            }
        }

        public a(View view) {
            this.f12392a = view;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onNestScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9628353", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScrollStateChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i == 0) {
                if (!((TNodeRecyclerView) this.f12392a).canScrollVertically(-1)) {
                    TNodeNestScrollView.access$000(TNodeNestScrollView.this).computeScrollOffset();
                    TNodeNestScrollView tNodeNestScrollView = TNodeNestScrollView.this;
                    tNodeNestScrollView.fling((int) (-TNodeNestScrollView.access$000(tNodeNestScrollView).getCurrVelocity()));
                }
                nwv.y0(new RunnableC0706a());
            }
        }
    }

    static {
        t2o.a(503317500);
    }

    public TNodeNestScrollView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Scroller access$000(TNodeNestScrollView tNodeNestScrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scroller) ipChange.ipc$dispatch("ef1c3777", new Object[]{tNodeNestScrollView});
        }
        return tNodeNestScrollView.scroller;
    }

    public static /* synthetic */ void access$100(TNodeNestScrollView tNodeNestScrollView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b8d628", new Object[]{tNodeNestScrollView, view});
        } else {
            tNodeNestScrollView.removeScrollChangeListenerForRecyclerView(view);
        }
    }

    private void addScrollChangeListenerForRecyclerView(View view, ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca2b541", new Object[]{this, view, scrollChangeListener});
        } else if (view instanceof TNodeRecyclerView) {
            ((TNodeRecyclerView) view).addScrollChangeListener(scrollChangeListener);
            view.setTag(R.id.layout_manager_recyclerview_scroll_listener, scrollChangeListener);
        }
    }

    public static /* synthetic */ Object ipc$super(TNodeNestScrollView tNodeNestScrollView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1577577649:
                super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1533054272:
                return new Boolean(super.onNestedPreFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue()));
            case -894236565:
                super.computeScroll();
                return null;
            case 177070687:
                super.onNestedPreScroll((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (int[]) objArr[3]);
                return null;
            case 2107577209:
                return new Boolean(super.onStartNestedScroll((View) objArr[0], (View) objArr[1], ((Number) objArr[2]).intValue()));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/TNodeNestScrollView");
        }
    }

    private void removeScrollChangeListenerForRecyclerView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8774f13", new Object[]{this, view});
        } else if (view instanceof TNodeRecyclerView) {
            TNodeRecyclerView tNodeRecyclerView = (TNodeRecyclerView) view;
            int i = R.id.layout_manager_recyclerview_scroll_listener;
            Object tag = tNodeRecyclerView.getTag(i);
            if (tag instanceof ScrollChangeListener) {
                tNodeRecyclerView.removeScrollChangeListener((ScrollChangeListener) tag);
            }
            tNodeRecyclerView.setTag(i, null);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void computeScroll() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        try {
            super.computeScroll();
            if (getScrollY() >= getMaxScrollOffset() && (view = this.pendingFlingView) != null && (view instanceof TNodeRecyclerView)) {
                Scroller scroller = this.scroller;
                if (scroller != null && scroller.computeScrollOffset()) {
                    ((TNodeRecyclerView) this.pendingFlingView).fling(0, (int) this.scroller.getCurrVelocity());
                }
                this.pendingFlingView = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue();
        }
        if (!this.scrollable) {
            return super.onNestedPreFling(view, f, f2);
        }
        removeScrollChangeListenerForRecyclerView(view);
        int maxScrollOffset = getMaxScrollOffset();
        this.pendingFlingView = null;
        if (f2 > 0.0f) {
            if (getScrollY() < maxScrollOffset) {
                int i = (int) f2;
                fling(i);
                Scroller scroller = new Scroller(getContext());
                this.scroller = scroller;
                scroller.fling(0, 0, 0, i, 0, 0, 0, Integer.MAX_VALUE);
                this.pendingFlingView = view;
                return true;
            }
        } else if (getScrollY() < maxScrollOffset) {
            fling((int) f2);
        } else if ((view instanceof TNodeRecyclerView) && view.getTag(R.id.layout_manager_recyclerview_scroll_listener) == null) {
            Scroller scroller2 = new Scroller(getContext());
            this.scroller = scroller2;
            scroller2.fling(0, 0, 0, (int) f2, 0, 0, 0, Integer.MAX_VALUE);
            addScrollChangeListenerForRecyclerView(view, new a(view));
        }
        return super.onNestedPreFling(view, f, f2);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8de25f", new Object[]{this, view, new Integer(i), new Integer(i2), iArr});
            return;
        }
        super.onNestedPreScroll(view, i, i2, iArr);
        if (this.scrollable) {
            removeScrollChangeListenerForRecyclerView(view);
            int maxScrollOffset = getMaxScrollOffset();
            if (getScrollY() < maxScrollOffset && i2 > 0) {
                int min = Math.min(maxScrollOffset - getScrollY(), i2);
                iArr[1] = min;
                scrollBy(0, min);
            }
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d9f1379", new Object[]{this, view, view2, new Integer(i)})).booleanValue();
        }
        removeScrollChangeListenerForRecyclerView(view2);
        return super.onStartNestedScroll(view, view2, i);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void scrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f8134f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int maxScrollOffset = getMaxScrollOffset();
        if (i2 > maxScrollOffset) {
            i2 = maxScrollOffset;
        }
        if (this.scrollable || i2 >= maxScrollOffset) {
            maxScrollOffset = i2;
        }
        super.scrollTo(i, maxScrollOffset);
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollable = z;
        }
    }

    public TNodeNestScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TNodeNestScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scrollable = true;
    }
}
