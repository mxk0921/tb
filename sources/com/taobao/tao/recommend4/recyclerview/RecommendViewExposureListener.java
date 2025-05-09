package com.taobao.tao.recommend4.recyclerview;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend2.RecommendChannelType;
import tb.bnn;
import tb.bqa;
import tb.pb6;
import tb.t2o;
import tb.won;
import tb.z4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecommendViewExposureListener extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f12710a = 1;
    public int b = -1;
    public int c = -1;
    public final z4a d;
    public int e;
    public won f;

    static {
        t2o.a(729810057);
    }

    public RecommendViewExposureListener(z4a z4aVar) {
        this.d = z4aVar;
    }

    public static /* synthetic */ Object ipc$super(RecommendViewExposureListener recommendViewExposureListener, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1177043419) {
            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 1361287682) {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/recommend4/recyclerview/RecommendViewExposureListener");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0088 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(androidx.recyclerview.widget.RecyclerView r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.recommend4.recyclerview.RecommendViewExposureListener.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "8133a120"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r10
            r4[r1] = r11
            java.lang.Object r11 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L_0x001c:
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r11.getAdapter()     // Catch: all -> 0x0050
            int r3 = r2.getItemCount()     // Catch: all -> 0x0050
            if (r3 != 0) goto L_0x0027
            return r1
        L_0x0027:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r11.getLayoutManager()     // Catch: all -> 0x0050
            int r2 = r2.getItemCount()     // Catch: all -> 0x0050
            int r2 = r2 - r1
            if (r2 > 0) goto L_0x0033
            return r1
        L_0x0033:
            boolean r4 = r3 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager     // Catch: all -> 0x0050
            if (r4 == 0) goto L_0x008a
            r4 = r3
            androidx.recyclerview.widget.StaggeredGridLayoutManager r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r4     // Catch: all -> 0x0050
            r5 = 0
            int[] r4 = r4.findLastCompletelyVisibleItemPositions(r5)     // Catch: all -> 0x0050
            r6 = -1
            r7 = 0
            r8 = -1
        L_0x0042:
            int r9 = r4.length     // Catch: all -> 0x0050
            if (r7 >= r9) goto L_0x0052
            r9 = r4[r7]     // Catch: all -> 0x0050
            if (r9 < 0) goto L_0x004e
            if (r8 == r6) goto L_0x004d
            if (r8 >= r9) goto L_0x004e
        L_0x004d:
            r8 = r9
        L_0x004e:
            int r7 = r7 + r1
            goto L_0x0042
        L_0x0050:
            r11 = move-exception
            goto L_0x0098
        L_0x0052:
            if (r8 >= 0) goto L_0x0085
            r4 = r3
            androidx.recyclerview.widget.StaggeredGridLayoutManager r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r4     // Catch: all -> 0x0050
            int[] r4 = r4.findLastVisibleItemPositions(r5)     // Catch: all -> 0x0050
            r5 = 0
        L_0x005c:
            int r7 = r4.length     // Catch: all -> 0x0050
            if (r5 >= r7) goto L_0x006a
            r7 = r4[r5]     // Catch: all -> 0x0050
            if (r7 < 0) goto L_0x0068
            if (r8 == r6) goto L_0x0067
            if (r8 >= r7) goto L_0x0068
        L_0x0067:
            r8 = r7
        L_0x0068:
            int r5 = r5 + r1
            goto L_0x005c
        L_0x006a:
            android.view.View r4 = r3.findViewByPosition(r8)     // Catch: all -> 0x0050
            if (r4 == 0) goto L_0x0086
            android.view.View r3 = r3.findViewByPosition(r8)     // Catch: all -> 0x0050
            int r3 = r3.getBottom()     // Catch: all -> 0x0050
            android.content.res.Resources r11 = r11.getResources()     // Catch: all -> 0x0050
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()     // Catch: all -> 0x0050
            int r11 = r11.heightPixels     // Catch: all -> 0x0050
            if (r3 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r6 = r8
        L_0x0086:
            if (r6 != r2) goto L_0x0089
            r0 = 1
        L_0x0089:
            return r0
        L_0x008a:
            boolean r11 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager     // Catch: all -> 0x0050
            if (r11 == 0) goto L_0x009f
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3     // Catch: all -> 0x0050
            int r11 = r3.findLastCompletelyVisibleItemPosition()     // Catch: all -> 0x0050
            if (r11 != r2) goto L_0x0097
            r0 = 1
        L_0x0097:
            return r0
        L_0x0098:
            java.lang.String r1 = "Home.nestedExposure"
            java.lang.String r2 = "check reach bottom error"
            tb.bqa.b(r1, r2, r11)
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.recommend4.recyclerview.RecommendViewExposureListener.B(androidx.recyclerview.widget.RecyclerView):boolean");
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0d9b40", new Object[]{this});
        } else {
            this.e = 0;
        }
    }

    public void E(won wonVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb0c83a1", new Object[]{this, wonVar});
        } else {
            this.f = wonVar;
        }
    }

    public final void b(ChildRecyclerView childRecyclerView) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc41944f", new Object[]{this, childRecyclerView});
            return;
        }
        RecommendRecyclerAdapter recommendRecyclerAdapter = (RecommendRecyclerAdapter) childRecyclerView.getAdapter();
        if (recommendRecyclerAdapter != null) {
            int i = this.b;
            if (i != -1 || this.c != -1) {
                while (i <= this.c) {
                    JSONObject W = recommendRecyclerAdapter.W(i);
                    if (W != null && !W.getBooleanValue("isUIThreadTrack") && (jSONObject = W.getJSONObject("ext")) != null && !jSONObject.getBooleanValue("hidden")) {
                        z4a z4aVar = this.d;
                        if (z4aVar != null) {
                            RecommendChannelType channelType = RecommendChannelType.getChannelType(z4aVar.f32522a);
                            if (channelType == null || TextUtils.isEmpty(channelType.adNamespace)) {
                                bqa.d("Home.nestedExposure", "channelType is null. containerType.containerId : " + this.d.f32522a);
                            } else {
                                W.put("adNamespace", (Object) channelType.adNamespace);
                            }
                        }
                        W.put("isUIThreadTrack", (Object) Boolean.TRUE);
                        bnn.a(W);
                    }
                    i++;
                }
                this.b = -1;
                this.c = -1;
            }
        }
    }

    public final void o(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36ff1a5a", new Object[]{this, childRecyclerView});
            return;
        }
        int p = p(childRecyclerView);
        if (p > 0) {
            RecyclerView.LayoutManager layoutManager = childRecyclerView.getLayoutManager();
            int v = v(childRecyclerView);
            View findViewByPosition = layoutManager.findViewByPosition(v);
            if (findViewByPosition != null && findViewByPosition.getMeasuredHeight() > 0 && (findViewByPosition.getTop() > p || p - findViewByPosition.getTop() <= findViewByPosition.getMeasuredHeight() / 2)) {
                v = u(childRecyclerView);
            }
            int i = v + 1;
            if (i > this.e) {
                this.e = i;
                won wonVar = this.f;
                if (wonVar != null) {
                    wonVar.a(i);
                }
            }
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
        if (recyclerView instanceof ChildRecyclerView) {
            ChildRecyclerView childRecyclerView = (ChildRecyclerView) recyclerView;
            if (i == 1) {
                r(childRecyclerView);
            } else if (i == 0) {
                r(childRecyclerView);
                b(childRecyclerView);
                o(childRecyclerView);
            }
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
        if (i2 != 0 && (recyclerView instanceof ChildRecyclerView)) {
            if (this.f12710a * i2 < 0) {
                this.f12710a = i2;
                r((ChildRecyclerView) recyclerView);
            }
            o((ChildRecyclerView) recyclerView);
        }
    }

    public final int p(ChildRecyclerView childRecyclerView) {
        View view;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("263c2239", new Object[]{this, childRecyclerView})).intValue();
        }
        int height = childRecyclerView.getHeight();
        RecyclerView x = x(childRecyclerView);
        if (x != null && !B(x)) {
            int v = v(x);
            if (v == x.getAdapter().getItemCount() - 1) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = x.findViewHolderForAdapterPosition(v);
                if (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
                    i = height;
                } else {
                    i = x.getHeight() - view.getTop();
                }
            }
            return i;
        } else if (x == null) {
            return z(childRecyclerView, height);
        } else {
            return height;
        }
    }

    public final void r(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de7435fc", new Object[]{this, childRecyclerView});
            return;
        }
        int p = p(childRecyclerView);
        if (p > 0) {
            RecyclerView.LayoutManager layoutManager = childRecyclerView.getLayoutManager();
            int t = t(childRecyclerView);
            View findViewByPosition = layoutManager.findViewByPosition(t);
            if (findViewByPosition != null && findViewByPosition.getMeasuredHeight() > 0) {
                if (p <= findViewByPosition.getMeasuredHeight() / 2) {
                    this.b = -1;
                    this.c = -1;
                    return;
                }
                if (findViewByPosition.getBottom() <= findViewByPosition.getMeasuredHeight() / 2) {
                    t = s(childRecyclerView);
                }
                int i = this.b;
                if (t < i || i == -1) {
                    this.b = t;
                }
            }
            int i2 = this.b;
            if (p < childRecyclerView.getHeight()) {
                while (i2 >= 0 && i2 < childRecyclerView.getAdapter().getItemCount()) {
                    int i3 = i2 + 1;
                    View findViewByPosition2 = layoutManager.findViewByPosition(i3);
                    if (findViewByPosition2 == null || findViewByPosition2.getTop() > p || p - findViewByPosition2.getTop() <= findViewByPosition2.getMeasuredHeight() / 2) {
                        break;
                    }
                    i2 = i3;
                }
            } else {
                i2 = v(childRecyclerView);
                View findViewByPosition3 = layoutManager.findViewByPosition(i2);
                if (findViewByPosition3 != null && findViewByPosition3.getMeasuredHeight() > 0 && (findViewByPosition3.getTop() > p || p - findViewByPosition3.getTop() <= findViewByPosition3.getMeasuredHeight() / 2)) {
                    i2 = u(childRecyclerView);
                }
            }
            if (i2 > this.c) {
                this.c = i2;
            }
        }
    }

    public final int s(RecyclerView recyclerView) {
        int[] findFirstCompletelyVisibleItemPositions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71b501e5", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int i = -1;
            for (int i2 : ((StaggeredGridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPositions(null)) {
                if (i2 >= 0 && (i == -1 || i > i2)) {
                    i = i2;
                }
            }
            return i;
        } else if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            if (findFirstCompletelyVisibleItemPosition == -1) {
                return linearLayoutManager.findFirstVisibleItemPosition();
            }
            return findFirstCompletelyVisibleItemPosition;
        }
    }

    public final int t(RecyclerView recyclerView) {
        int[] findFirstVisibleItemPositions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f8497cc", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int i = -1;
            for (int i2 : ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(null)) {
                if (i2 >= 0 && (i == -1 || i > i2)) {
                    i = i2;
                }
            }
            return i;
        } else if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        } else {
            return -1;
        }
    }

    public final int u(RecyclerView recyclerView) {
        int[] findLastCompletelyVisibleItemPositions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a263573", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int i = -1;
            for (int i2 : ((StaggeredGridLayoutManager) layoutManager).findLastCompletelyVisibleItemPositions(null)) {
                if (i2 >= 0 && (i == -1 || i < i2)) {
                    i = i2;
                }
            }
            return i;
        } else if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            if (findLastCompletelyVisibleItemPosition == -1) {
                return linearLayoutManager.findLastVisibleItemPosition();
            }
            return findLastCompletelyVisibleItemPosition;
        }
    }

    public final int v(RecyclerView recyclerView) {
        int[] findLastVisibleItemPositions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a11bff5e", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int i = -1;
            for (int i2 : ((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null)) {
                if (i2 >= 0 && (i == -1 || i < i2)) {
                    i = i2;
                }
            }
            return i;
        } else if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        } else {
            try {
                return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            } catch (Exception e) {
                bqa.d(TLogTracker.SCENE_EXCEPTION, "RecommendViewExposureListener getLastVisiblePos exception:" + e.getMessage());
                return -1;
            }
        }
    }

    public final ViewParent w(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("c8de74c6", new Object[]{this, recyclerView});
        }
        if (recyclerView == null) {
            return null;
        }
        for (ViewParent parent = recyclerView.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof CoordinatorLayout) || (parent instanceof ScrollView)) {
                return parent;
            }
        }
        return null;
    }

    public final RecyclerView x(RecyclerView recyclerView) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("86e8ecf3", new Object[]{this, recyclerView});
        }
        ViewParent parent = recyclerView.getParent();
        while (true) {
            if (parent == null || (parent instanceof RecyclerView)) {
                break;
            } else if (i == 10) {
                parent = null;
                break;
            } else {
                i++;
                parent = parent.getParent();
            }
        }
        if (parent == null) {
            return null;
        }
        return (RecyclerView) parent;
    }

    public final int z(ChildRecyclerView childRecyclerView, int i) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d1a1b9e", new Object[]{this, childRecyclerView, new Integer(i)})).intValue();
        }
        if (childRecyclerView == null) {
            return i;
        }
        ViewParent w = w(childRecyclerView);
        if (w != null) {
            if (w instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) w;
                if (coordinatorLayout.getChildCount() == 2) {
                    i3 = coordinatorLayout.getHeight();
                    i2 = coordinatorLayout.getChildAt(1).getTop();
                } else {
                    bqa.d("Home.nestedExposure", "CoordinatorLayout ChildCount != 2");
                    return i;
                }
            } else if (!(w instanceof ScrollView)) {
                return i;
            } else {
                View view = (View) w;
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                childRecyclerView.getLocationInWindow(iArr2);
                i3 = view.getHeight() + iArr[1];
                i2 = iArr2[1];
            }
            return i3 - i2;
        }
        int[] iArr3 = new int[2];
        childRecyclerView.getLocationInWindow(iArr3);
        return Math.min(pb6.r(Globals.getApplication()) - iArr3[1], childRecyclerView.getHeight());
    }
}
