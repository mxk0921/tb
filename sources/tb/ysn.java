package tb;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.RecycleViewAdapter;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IExposeItemFilterService;
import com.taobao.infoflow.protocol.subservice.biz.IUserExperienceCheckService;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.ArrayList;
import java.util.List;
import tb.h6c;
import tb.sgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ysn extends wu implements h6c.c<RecyclerView>, sgc.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final cfc d;

    /* renamed from: a  reason: collision with root package name */
    public int f32322a = 1;
    public int b = -1;
    public int c = -1;
    public boolean f = false;
    public final dnn e = new dnn();

    static {
        t2o.a(486539649);
        t2o.a(488636470);
        t2o.a(488636482);
    }

    public ysn(cfc cfcVar) {
        this.d = cfcVar;
    }

    public static /* synthetic */ cfc G(ysn ysnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("32679214", new Object[]{ysnVar});
        }
        return ysnVar.d;
    }

    public static /* synthetic */ void H(ysn ysnVar, BaseSectionModel baseSectionModel, int i, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("befedd81", new Object[]{ysnVar, baseSectionModel, new Integer(i), recyclerView});
        } else {
            ysnVar.m(baseSectionModel, i, recyclerView);
        }
    }

    public static /* synthetic */ void I(ysn ysnVar, BaseSectionModel baseSectionModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6cbe95", new Object[]{ysnVar, baseSectionModel, new Integer(i)});
        } else {
            ysnVar.s(baseSectionModel, i);
        }
    }

    public static /* synthetic */ Object ipc$super(ysn ysnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/framework/container/mainfeeds/handler/usertrack/exposure/item/RecyclerViewExposureListener");
    }

    public static /* synthetic */ boolean j(ysn ysnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31f41627", new Object[]{ysnVar})).booleanValue();
        }
        return ysnVar.f;
    }

    public static /* synthetic */ boolean k(ysn ysnVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac273253", new Object[]{ysnVar, new Boolean(z)})).booleanValue();
        }
        ysnVar.f = z;
        return z;
    }

    public final RecyclerView A(RecyclerView recyclerView) {
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
            com.android.alibaba.ip.runtime.IpChange r2 = tb.ysn.$ipChange
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
            java.lang.String r1 = "InfoFlowRecyclerViewExposure"
            java.lang.String r2 = "check reach bottom error"
            tb.bqa.b(r1, r2, r11)
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ysn.B(androidx.recyclerview.widget.RecyclerView):boolean");
    }

    /* renamed from: C */
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
        } else if (i == 1) {
            q(recyclerView);
        } else if (i == 0) {
            q(recyclerView);
            u(recyclerView);
        }
    }

    /* renamed from: D */
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (this.f32322a * i2 < 0) {
            this.f32322a = i2;
            q(recyclerView);
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f32322a = 1;
        this.b = -1;
        this.c = -1;
    }

    public final void F(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144d5eda", new Object[]{this, view});
        } else if (!mve.a("disableOutOfWindowAnimate", false) && (view instanceof ViewGroup)) {
            ((ViewGroup) view).setClipChildren(false);
        }
    }

    @Override // tb.sgc.b
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
        }
    }

    @Override // tb.wu
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
        } else {
            p();
        }
    }

    @Override // tb.wu
    public void e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            p();
        }
    }

    @Override // tb.wu
    public void g(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cd027c", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            p();
        }
    }

    @Override // tb.sgc.b
    public void h(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab94fc2e", new Object[]{this, new Integer(i), view, baseSectionModel});
        }
    }

    @Override // tb.sgc.b
    public void i(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe58018e", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
        } else if (z && (args = baseSectionModel.getArgs()) != null) {
            args.put("realExposeIndex", (Object) Integer.valueOf(i));
            l(args, i);
            Integer integer = args.getInteger("recIndex");
            if (integer != null && integer.intValue() >= 0) {
                F(view);
            }
        }
    }

    public final void l(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65976e55", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        int b = this.e.b(i);
        if (b != -1) {
            jSONObject.put("recIndex", (Object) Integer.valueOf(b));
        }
    }

    public final void m(BaseSectionModel<?> baseSectionModel, int i, RecyclerView recyclerView) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d595d", new Object[]{this, baseSectionModel, new Integer(i), recyclerView});
        } else if (recyclerView != null && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager()) != null && (findViewByPosition = staggeredGridLayoutManager.findViewByPosition(i)) != null) {
            wsn.a(baseSectionModel, findViewByPosition);
        }
    }

    @Override // tb.h6c.c
    public void n(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // tb.sgc.b
    public void o(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4bbbcc6", new Object[]{this, new Integer(i), view, baseSectionModel});
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc418a1", new Object[]{this});
        } else {
            this.e.a(this.d);
        }
    }

    public final void q(RecyclerView recyclerView) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde620e0", new Object[]{this, recyclerView});
        } else if (recyclerView != null && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager()) != null) {
            if (recyclerView instanceof ChildRecyclerView) {
                i = w((ChildRecyclerView) recyclerView);
            } else {
                i = r(recyclerView);
            }
            int[] findFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
            int i2 = findFirstVisibleItemPositions[0];
            if (findFirstVisibleItemPositions.length >= 2) {
                i2 = Math.min(i2, findFirstVisibleItemPositions[1]);
            }
            View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(findFirstVisibleItemPositions[0]);
            int i3 = -1;
            if (findViewByPosition != null && findViewByPosition.getMeasuredHeight() > 0) {
                if (i <= findViewByPosition.getMeasuredHeight() / 2) {
                    this.b = -1;
                    this.c = -1;
                    return;
                }
                if (findViewByPosition.getBottom() <= findViewByPosition.getMeasuredHeight() / 2) {
                    i2 = staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(null)[0];
                }
                int i4 = this.b;
                if (i2 < i4 || i4 == -1) {
                    this.b = i2;
                }
            }
            if (i < recyclerView.getHeight()) {
                int i5 = this.b;
                while (i5 >= 0 && i5 < recyclerView.getAdapter().getItemCount()) {
                    i5++;
                    View findViewByPosition2 = staggeredGridLayoutManager.findViewByPosition(i5);
                    if (findViewByPosition2 == null || findViewByPosition2.getTop() > i || i - findViewByPosition2.getTop() <= findViewByPosition2.getMeasuredHeight() / 2) {
                        break;
                    }
                    i3 = i5;
                }
            } else {
                i3 = y(recyclerView, staggeredGridLayoutManager, i);
            }
            if (i3 > this.c) {
                this.c = i3;
            }
        }
    }

    public final void s(BaseSectionModel<?> baseSectionModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f5e746", new Object[]{this, baseSectionModel, new Integer(i)});
        } else if (baseSectionModel != null && !baseSectionModel.getBooleanValue("isUIThreadTrack") && !baseSectionModel.getExt().getBooleanValue("hidden")) {
            if (TextUtils.isEmpty(baseSectionModel.getString("adNamespace"))) {
                baseSectionModel.put("adNamespace", (Object) "tb_recmd_homePage");
            }
            baseSectionModel.put("isUIThreadTrack", (Object) Boolean.TRUE);
            v(baseSectionModel);
            vve.p(baseSectionModel, null);
            IExposeItemFilterService iExposeItemFilterService = (IExposeItemFilterService) this.d.a(IExposeItemFilterService.class);
            if (iExposeItemFilterService != null) {
                iExposeItemFilterService.addExposeItem(baseSectionModel);
            }
        }
    }

    public final void t(int i, int i2, List<BaseSectionModel> list, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109d6693", new Object[]{this, new Integer(i), new Integer(i2), list, recyclerView});
        } else if (list == null || list.isEmpty()) {
            fve.e("InfoFlowRecyclerViewExposure", "exposeList is null");
        } else {
            get.a().i(new a(i, i2, list, recyclerView));
        }
    }

    public final void u(RecyclerView recyclerView) {
        RecycleViewAdapter recycleViewAdapter;
        ArrayList arrayList;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa67e72", new Object[]{this, recyclerView});
        } else if (recyclerView != null) {
            if (recyclerView.getAdapter() instanceof RecycleViewAdapter) {
                recycleViewAdapter = (RecycleViewAdapter) recyclerView.getAdapter();
            } else if (recyclerView instanceof TRecyclerView) {
                recycleViewAdapter = (RecycleViewAdapter) ((TRecyclerView) recyclerView).getRawAdapter();
            } else {
                recycleViewAdapter = null;
            }
            if (recycleViewAdapter == null) {
                return;
            }
            if (this.b != -1 || this.c != -1) {
                if (recyclerView instanceof TRecyclerView) {
                    i = ((TRecyclerView) recyclerView).getHeaderViewsCount();
                }
                int i2 = this.b - i;
                int min = Math.min((this.c - i) + 1, recycleViewAdapter.getItemCount() - 1);
                int min2 = Math.min(i2, min);
                int max = Math.max(i2, min);
                List<BaseSectionModel> Q = recycleViewAdapter.Q(min2, max);
                if (Q != null) {
                    arrayList = new ArrayList(Q);
                } else {
                    arrayList = new ArrayList();
                }
                t(min2, max, arrayList, recyclerView);
                this.b = -1;
                this.c = -1;
            }
        }
    }

    public final void v(BaseSectionModel<?> baseSectionModel) {
        cfc cfcVar;
        IUserExperienceCheckService iUserExperienceCheckService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab2860d", new Object[]{this, baseSectionModel});
        } else if (!baseSectionModel.getBooleanValue("isTracked") && (cfcVar = this.d) != null && (iUserExperienceCheckService = (IUserExperienceCheckService) cfcVar.a(IUserExperienceCheckService.class)) != null) {
            iUserExperienceCheckService.startExperienceCheckTask(baseSectionModel, IUserExperienceCheckService.CheckOccasion.EXPOSE);
        }
    }

    public final int w(ChildRecyclerView childRecyclerView) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("263c2239", new Object[]{this, childRecyclerView})).intValue();
        }
        int height = childRecyclerView.getHeight();
        RecyclerView A = A(childRecyclerView);
        if (A != null && !B(A)) {
            int z = z(A);
            if (z != A.getAdapter().getItemCount() - 1) {
                return 0;
            }
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = A.findViewHolderForAdapterPosition(z);
            if (!(findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null)) {
                return A.getHeight() - view.getTop();
            }
        }
        return height;
    }

    public final int x(RecyclerView recyclerView) {
        int[] findLastCompletelyVisibleItemPositions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a365102f", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        int i = -1;
        for (int i2 : ((StaggeredGridLayoutManager) layoutManager).findLastCompletelyVisibleItemPositions(null)) {
            if (i2 >= 0 && (i == -1 || i < i2)) {
                i = i2;
            }
        }
        return i;
    }

    public final int y(RecyclerView recyclerView, StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19830f54", new Object[]{this, recyclerView, staggeredGridLayoutManager, new Integer(i)})).intValue();
        }
        int[] findLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
        if (findLastVisibleItemPositions == null) {
            return -1;
        }
        int i2 = -1;
        int i3 = -1;
        for (int i4 : findLastVisibleItemPositions) {
            if (!(i4 == -1 || (findViewByPosition = staggeredGridLayoutManager.findViewByPosition(i4)) == null || findViewByPosition.getMeasuredHeight() <= 0)) {
                if (findViewByPosition.getTop() > i || i - findViewByPosition.getTop() <= findViewByPosition.getMeasuredHeight() / 2) {
                    i2 = x(recyclerView);
                } else if (i4 > i3) {
                    i3 = i4;
                }
            }
        }
        return Math.max(i2, i3);
    }

    public final int z(RecyclerView recyclerView) {
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32323a;
        public final /* synthetic */ int b;
        public final /* synthetic */ List c;
        public final /* synthetic */ RecyclerView d;

        public a(int i, int i2, List list, RecyclerView recyclerView) {
            this.f32323a = i;
            this.b = i2;
            this.c = list;
            this.d = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fve.e("InfoFlowRecyclerViewExposure", "exposeList fromIndex :" + this.f32323a + ", toIndex : " + this.b);
            if (!ysn.j(ysn.this) && TextUtils.equals(xn4.REC_ORDER_LIST.f31484a, ysn.G(ysn.this).getContainerType().getContainerId())) {
                ysn.k(ysn.this, true);
                uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "after_buy_new_framework", "no_order_card_expose", null, null);
            }
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                BaseSectionModel baseSectionModel = (BaseSectionModel) this.c.get(i);
                ysn.H(ysn.this, baseSectionModel, this.f32323a + i, this.d);
                ysn.I(ysn.this, baseSectionModel, this.f32323a + i);
            }
        }
    }

    public final int r(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a707f9f", new Object[]{this, view})).intValue();
        }
        int s = pb6.s(view.getContext());
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (rect.right > 0 && rect.left < s) {
            return rect.height();
        }
        fve.e(RPCDataItems.SWITCH_TAG_LOG, "容器在屏幕上不可见");
        return 0;
    }
}
