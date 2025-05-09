package tb;

import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class py {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_ID = 2002;

    /* renamed from: a  reason: collision with root package name */
    public qon f26393a;
    public final String b;
    public final String c;

    static {
        t2o.a(729810084);
    }

    public py(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final void a(ChildRecyclerView childRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce0f1f4", new Object[]{this, childRecyclerView, new Integer(i)});
        } else if (l(childRecyclerView, i)) {
            c();
        } else {
            n();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8773bbd", new Object[]{this});
            return;
        }
        r5a.j(this.b, 2002, this.c, e(), String.valueOf(this.f26393a.a()), d());
        String e = e();
        uqa.b("Performance", e, "commit stay time:" + this.f26393a.a());
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc95f5f", new Object[]{this});
        } else if (this.f26393a != null) {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "AbsStayTimeCalculator", "dismiss enter, already has stayModel");
        } else {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "AbsStayTimeCalculator", "start enter, new stayModel");
            this.f26393a = new qon(e());
        }
    }

    public final JSONObject d() {
        AwesomeGetContainerInnerData q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this});
        }
        imn d = zza.d(this.c);
        if (d == null || (q = d.q(this.c)) == null) {
            return null;
        }
        return q.stayTimeParams;
    }

    public abstract String e();

    public int f(RecyclerView recyclerView) {
        View view;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84383a7c", new Object[]{this, recyclerView})).intValue();
        }
        int height = recyclerView.getHeight();
        RecyclerView j = j(recyclerView);
        if (j != null && !m(j)) {
            int h = h(j);
            if (h == j.getAdapter().getItemCount() - 1) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = j.findViewHolderForAdapterPosition(h);
                if (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
                    i = height;
                } else {
                    i = j.getHeight() - view.getTop();
                }
            }
            return i;
        } else if (j != null || !(recyclerView instanceof HomeChildRecyclerView)) {
            return height;
        } else {
            return k((HomeChildRecyclerView) recyclerView, height);
        }
    }

    public int g(RecyclerView recyclerView) {
        int[] findFirstVisibleItemPositions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ce4e7", new Object[]{this, recyclerView})).intValue();
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

    public int h(RecyclerView recyclerView) {
        int[] findLastVisibleItemPositions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d614315", new Object[]{this, recyclerView})).intValue();
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

    public ViewParent i(RecyclerView recyclerView) {
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

    public RecyclerView j(RecyclerView recyclerView) {
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

    public int k(ChildRecyclerView childRecyclerView, int i) {
        int r;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d1a1b9e", new Object[]{this, childRecyclerView, new Integer(i)})).intValue();
        }
        if (childRecyclerView == null) {
            return i;
        }
        ViewParent i3 = i(childRecyclerView);
        if (i3 == null) {
            int[] iArr = new int[2];
            childRecyclerView.getLocationInWindow(iArr);
            r = pb6.r(Globals.getApplication());
            i2 = iArr[1];
        } else if (i3 instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) i3;
            if (coordinatorLayout.getChildCount() == 2) {
                r = coordinatorLayout.getHeight() - coordinatorLayout.getChildAt(0).getTop();
                i2 = coordinatorLayout.getChildAt(1).getTop();
            } else {
                bqa.d("AbsStayTimeCalculator", "CoordinatorLayout ChildCount != 2");
                return i;
            }
        } else if (!(i3 instanceof ScrollView)) {
            return i;
        } else {
            View view = (View) i3;
            int[] iArr2 = new int[2];
            view.getLocationInWindow(iArr2);
            int[] iArr3 = new int[2];
            childRecyclerView.getLocationInWindow(iArr3);
            r = view.getHeight() + iArr2[1];
            i2 = iArr3[1];
        }
        return r - i2;
    }

    public abstract boolean l(ChildRecyclerView childRecyclerView, int i);

    /* JADX WARN: Removed duplicated region for block: B:42:0x0088 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m(androidx.recyclerview.widget.RecyclerView r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.py.$ipChange
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
            java.lang.String r1 = "AbsStayTimeCalculator"
            java.lang.String r2 = "check reach bottom error"
            tb.bqa.b(r1, r2, r11)
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.py.m(androidx.recyclerview.widget.RecyclerView):boolean");
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f29fbe", new Object[]{this});
        } else if (this.f26393a == null) {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "AbsStayTimeCalculator", "dismiss leave, stayModel is null");
        } else {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "AbsStayTimeCalculator", "start leave, commit ut");
            this.f26393a.b();
            b();
            this.f26393a = null;
        }
    }
}
