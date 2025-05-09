package tb;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.BHXVisualCenterItem;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.afterbuy.NestedScrollRecyclerView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yo2 implements h6c.c<RecyclerView>, h6c.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final cfc c;
    public final IMainFeedsViewService<?> d;

    /* renamed from: a  reason: collision with root package name */
    public boolean f32227a = false;
    public boolean b = false;
    public boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f32228a;

        public a(boolean z) {
            this.f32228a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (yo2.b(yo2.this) != null && (recyclerView = (RecyclerView) yo2.b(yo2.this).getOriginalView()) != null) {
                yo2.e(yo2.this, recyclerView, this.f32228a);
            }
        }
    }

    static {
        t2o.a(486539636);
        t2o.a(488636470);
        t2o.a(488636469);
    }

    public yo2(cfc cfcVar) {
        this.d = null;
        this.c = cfcVar;
        this.d = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
    }

    public static /* synthetic */ IMainFeedsViewService b(yo2 yo2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsViewService) ipChange.ipc$dispatch("6c057ac7", new Object[]{yo2Var});
        }
        return yo2Var.d;
    }

    public static /* synthetic */ void e(yo2 yo2Var, RecyclerView recyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4cfa89d", new Object[]{yo2Var, recyclerView, new Boolean(z)});
        } else {
            yo2Var.g(recyclerView, z);
        }
    }

    @Override // tb.h6c.b
    public void c() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
            return;
        }
        cfc cfcVar = this.c;
        if (!(cfcVar == null || cfcVar.getContainerType() == null)) {
            z = zn4.a(this.c.getContainerType().getContainerId());
        }
        if (!z || !this.e) {
            this.e = true;
            get.a().f(new a(z), 100L);
        }
    }

    @Override // tb.h6c.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d673366", new Object[]{this});
        }
    }

    public final int f(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa711a9b", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
        }
        if (view == null || i <= 0 || i2 <= 0) {
            return -1;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = iArr[0] + (view.getWidth() / 2);
        if (iArr[1] + (view.getHeight() / 2) < i2) {
            if (width > i) {
                return 2;
            }
            return 1;
        } else if (width > i) {
            return 4;
        } else {
            return 3;
        }
    }

    public final void h(final List<BHXVisualCenterItem> list, final String str) {
        final String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722597fc", new Object[]{this, list, str});
        } else if (!list.isEmpty()) {
            cfc cfcVar = this.c;
            if (cfcVar == null || cfcVar.getContainerType() == null) {
                str2 = "";
            } else {
                str2 = this.c.getContainerType().a();
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "Page_Home";
            }
            get.a().e(new Runnable() { // from class: tb.xo2
                @Override // java.lang.Runnable
                public final void run() {
                    yo2.k(str, str2, list);
                }
            });
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20cfb33d", new Object[]{this})).booleanValue();
        }
        IRocketSubService iRocketSubService = (IRocketSubService) this.c.a(IRocketSubService.class);
        if (iRocketSubService != null) {
            return !iRocketSubService.isOnRocketState();
        }
        return false;
    }

    /* renamed from: l */
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        if ((recyclerView instanceof NestedScrollRecyclerView) && i == 0) {
            lrj nestedScrollParent = ((NestedScrollRecyclerView) recyclerView).getNestedScrollParent();
            if ((nestedScrollParent instanceof RecyclerView) && ((RecyclerView) nestedScrollParent).getScrollState() != 0) {
                return;
            }
        }
        if (i == 0) {
            g(recyclerView, false);
        }
    }

    /* renamed from: m */
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.h6c.c
    public void n(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
            return;
        }
        JSONObject jSONObject = (JSONObject) mza.d().c("uploadExposeLevel", JSONObject.class);
        if (jSONObject != null) {
            this.b = true;
            this.f32227a = jSONObject.getBooleanValue("enableExposeLevel");
        }
    }

    public final void o(RecyclerView recyclerView, List<Integer> list, StaggeredGridLayoutManager staggeredGridLayoutManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec6805b", new Object[]{this, recyclerView, list, staggeredGridLayoutManager, str});
            return;
        }
        int s = pb6.s(recyclerView.getContext()) / 2;
        int r = pb6.r(recyclerView.getContext()) / 2;
        ArrayList arrayList = new ArrayList();
        om1 h = hue.h(recyclerView);
        for (Integer num : list) {
            int intValue = num.intValue();
            View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(intValue);
            if (findViewByPosition != null && findViewByPosition.getGlobalVisibleRect(new Rect())) {
                BaseSectionModel<?> findItemDataByPosition = this.d.findItemDataByPosition(intValue);
                String b = wsn.b(findItemDataByPosition);
                if (TextUtils.isEmpty(b)) {
                    b = wsn.d(findItemDataByPosition);
                }
                if (!TextUtils.isEmpty(b)) {
                    BHXVisualCenterItem bHXVisualCenterItem = new BHXVisualCenterItem();
                    bHXVisualCenterItem.i = f(findViewByPosition, s, r);
                    bHXVisualCenterItem.f27464a = b;
                    int e = wsn.e(findItemDataByPosition);
                    cfc cfcVar = this.c;
                    if (cfcVar == null || cfcVar.getContainerType() == null || !zn4.a(this.c.getContainerType().getContainerId())) {
                        intValue = e;
                    }
                    bHXVisualCenterItem.d = intValue;
                    HashMap hashMap = new HashMap();
                    hashMap.put(yj4.PARAM_PVID, wsn.c(findItemDataByPosition));
                    JSONObject ext = findItemDataByPosition.getExt();
                    String str2 = "0";
                    String string = ext != null ? ext.getString(jtv.S_ARGS_IS_CLIENT_CACHE) : str2;
                    if (string != null) {
                        str2 = string;
                    }
                    hashMap.put(jtv.S_ARGS_IS_CLIENT_CACHE, str2);
                    bHXVisualCenterItem.h = hashMap;
                    bHXVisualCenterItem.b = hue.g(findViewByPosition);
                    bHXVisualCenterItem.c = h;
                    arrayList.add(bHXVisualCenterItem);
                }
            }
        }
        h(arrayList, str);
    }

    public static /* synthetic */ void k(String str, String str2, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fdc787b", new Object[]{str, str2, list});
        } else if (TextUtils.equals(str, "scrollStatusEnd")) {
            fve.e("BxUserTrackExposeLevelHandler", "commitVisualCenter, STATUS_SCREEN_END");
            cqv.v(str2, list, false);
        } else if (TextUtils.equals(str, "statusFirstScreen")) {
            fve.e("BxUserTrackExposeLevelHandler", "commitVisualCenter, STATUS_FIRST_SCREEN");
            cqv.v(str2, list, true);
        }
    }

    public final void g(RecyclerView recyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0b9df2", new Object[]{this, recyclerView, new Boolean(z)});
            return;
        }
        if (!this.b) {
            i();
        }
        if (this.f32227a) {
            String str = "statusFirstScreen";
            if (!z && !j()) {
                str = "scrollStatusEnd";
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
            if (staggeredGridLayoutManager != null) {
                int spanCount = staggeredGridLayoutManager.getSpanCount();
                int[] findFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
                int[] findLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < spanCount; i++) {
                    for (int i2 = findFirstVisibleItemPositions[i]; i2 <= findLastVisibleItemPositions[i]; i2++) {
                        if (!arrayList.contains(Integer.valueOf(i2))) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                }
                try {
                    o(recyclerView, arrayList, staggeredGridLayoutManager, str);
                } catch (Throwable th) {
                    fve.c("BxUserTrackExposeLevelHandler", "bx接口异常", th);
                }
            }
        }
    }
}
