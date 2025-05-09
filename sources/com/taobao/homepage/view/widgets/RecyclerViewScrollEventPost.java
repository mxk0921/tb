package com.taobao.homepage.view.widgets;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.List;
import tb.a3b;
import tb.sfh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RecyclerViewScrollEventPost extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_ON_SCROLL_START = 7952648158329995189L;
    public static final long DX_ON_SCROLL_STOP = -7968002352509477560L;

    /* renamed from: a  reason: collision with root package name */
    public int f10614a;
    public final b b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        float a(View view);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729809185);
            t2o.a(729809184);
        }

        public static DXRootView b(View view) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXRootView) ipChange.ipc$dispatch("55ea5980", new Object[]{view});
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    return null;
                }
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof DXRootView) {
                    return (DXRootView) childAt;
                }
                i++;
            }
        }

        @Override // com.taobao.homepage.view.widgets.RecyclerViewScrollEventPost.b
        public float a(View view) {
            RecyclerView d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b12baedf", new Object[]{this, view})).floatValue();
            }
            if (view == null || (d = d()) == null) {
                return -1.0f;
            }
            return a3b.b(d, view, false);
        }

        public List<DXRootView> c(RecyclerView recyclerView) {
            DXRootView b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("9150f5d6", new Object[]{this, recyclerView});
            }
            ArrayList arrayList = new ArrayList();
            if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
                int[] findFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
                int[] findLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
                if (!(findFirstVisibleItemPositions.length == 0 || findLastVisibleItemPositions.length == 0)) {
                    int i = findFirstVisibleItemPositions[0];
                    int i2 = findLastVisibleItemPositions[0];
                    for (int i3 = 1; i3 < findFirstVisibleItemPositions.length; i3++) {
                        i = Math.min(i, findFirstVisibleItemPositions[i3]);
                    }
                    for (int i4 = 1; i4 < findLastVisibleItemPositions.length; i4++) {
                        i2 = Math.max(i2, findLastVisibleItemPositions[i4]);
                    }
                    if (i >= 0 && i2 >= 0) {
                        while (i <= i2) {
                            View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(i);
                            if (findViewByPosition.getVisibility() == 0 && (b = b(findViewByPosition)) != null) {
                                arrayList.add(b);
                            }
                            i++;
                        }
                    }
                }
            }
            return arrayList;
        }

        public RecyclerView d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final RecyclerViewScrollEventPost f10615a = new RecyclerViewScrollEventPost();

        static {
            t2o.a(729809186);
        }

        public static /* synthetic */ RecyclerViewScrollEventPost a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerViewScrollEventPost) ipChange.ipc$dispatch("f04fec0", new Object[0]);
            }
            return f10615a;
        }
    }

    static {
        t2o.a(729809182);
    }

    public static /* synthetic */ Object ipc$super(RecyclerViewScrollEventPost recyclerViewScrollEventPost, String str, Object... objArr) {
        if (str.hashCode() == -1177043419) {
            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/view/widgets/RecyclerViewScrollEventPost");
    }

    public static RecyclerViewScrollEventPost o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewScrollEventPost) ipChange.ipc$dispatch("56e3e6a6", new Object[0]);
        }
        return d.a();
    }

    public b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d5cdf737", new Object[]{this});
        }
        return this.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    public boolean p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fabfd655", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public void r(DXRootView dXRootView, boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939bd7de", new Object[]{this, dXRootView, new Boolean(z)});
        } else if (dXRootView != null) {
            if (z) {
                j = 7952648158329995189L;
            } else {
                j = -7968002352509477560L;
            }
            DXEvent dXEvent = new DXEvent(j);
            DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
            if (expandWidgetNode != null) {
                expandWidgetNode.sendBroadcastEvent(dXEvent);
            }
        }
    }

    private RecyclerViewScrollEventPost() {
        this.f10614a = -1;
        this.b = new c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        try {
            int i2 = this.f10614a;
            if (i2 == -1 || p(i2) != p(i)) {
                this.f10614a = i;
                List<DXRootView> c2 = ((c) this.b).c(recyclerView);
                if (i == 0) {
                    sfh.d("RecyclerViewScrollEventPost", "post scroll stop event");
                    for (int i3 = 0; i3 < c2.size(); i3++) {
                        r(c2.get(i3), false);
                    }
                } else if (i == 1 || i == 2) {
                    sfh.d("RecyclerViewScrollEventPost", "post scroll start event");
                    for (int i4 = 0; i4 < c2.size(); i4++) {
                        r(c2.get(i4), true);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            sfh.e("RecyclerViewScrollEventPost", "onScrollStateChanged error", e);
        }
    }
}
