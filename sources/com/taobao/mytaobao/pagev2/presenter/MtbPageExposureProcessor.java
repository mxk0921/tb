package com.taobao.mytaobao.pagev2.presenter;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.mytaobao.pagev2.architecture.MtbAdapter;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import tb.bwu;
import tb.ckf;
import tb.h3j;
import tb.p3j;
import tb.r4v;
import tb.t2o;
import tb.u3j;
import tb.wb6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbPageExposureProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public RecyclerView f11297a;
    public MtbAdapter b;
    public int c;
    public int d;
    public final MtbPageExposureProcessor$scrollChangeListener$1 e = new RecyclerView.OnScrollListener() { // from class: com.taobao.mytaobao.pagev2.presenter.MtbPageExposureProcessor$scrollChangeListener$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(MtbPageExposureProcessor$scrollChangeListener$1 mtbPageExposureProcessor$scrollChangeListener$1, String str, Object... objArr) {
            if (str.hashCode() == 1361287682) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/presenter/MtbPageExposureProcessor$scrollChangeListener$1");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            ckf.h(recyclerView, OrderConfigs.RECYCLERVIEW);
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                MtbPageExposureProcessor.this.l(true);
            }
        }
    };

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List b;
        public final /* synthetic */ boolean c;

        public a(List list, boolean z) {
            MtbPageExposureProcessor.this = r1;
            this.b = list;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            wb6.a aVar;
            JSONArray c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RecyclerView c2 = MtbPageExposureProcessor.c(MtbPageExposureProcessor.this);
            RecyclerView.LayoutManager layoutManager = c2 != null ? c2.getLayoutManager() : null;
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                for (Pair pair : this.b) {
                    h3j h3jVar = (h3j) pair.getFirst();
                    View findViewByPosition = linearLayoutManager.findViewByPosition(((Number) pair.getSecond()).intValue());
                    View findViewById = findViewByPosition != null ? findViewByPosition.findViewById(R.id.mtbDxRootView) : null;
                    if (!(findViewById instanceof DXRootView)) {
                        findViewById = null;
                    }
                    DXRootView dXRootView = (DXRootView) findViewById;
                    if (dXRootView != null) {
                        View a2 = bwu.a(dXRootView, "scrollExpose");
                        if (!(a2 instanceof RecyclerView)) {
                            a2 = null;
                        }
                        RecyclerView recyclerView = (RecyclerView) a2;
                        if (!(recyclerView == null || (c = (aVar = wb6.Companion).c(h3jVar.g(), true)) == null)) {
                            aVar.d(recyclerView, c, 0.5f, !this.c);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public b(boolean z) {
            MtbPageExposureProcessor.this = r1;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MtbAdapter b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!this.b) {
                MtbPageExposureProcessor.h(MtbPageExposureProcessor.this, 0);
                MtbPageExposureProcessor.i(MtbPageExposureProcessor.this, 0);
            }
            RecyclerView c = MtbPageExposureProcessor.c(MtbPageExposureProcessor.this);
            if (c != null && (b = MtbPageExposureProcessor.b(MtbPageExposureProcessor.this)) != null) {
                RecyclerView.LayoutManager layoutManager = c.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null) {
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    int i = findLastVisibleItemPosition;
                    while (true) {
                        if (i < 0) {
                            break;
                        } else if (MtbPageExposureProcessor.f(MtbPageExposureProcessor.this, i, linearLayoutManager)) {
                            MtbPageExposureProcessor.i(MtbPageExposureProcessor.this, i);
                            break;
                        } else {
                            i--;
                        }
                    }
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                        while (true) {
                            if (!MtbPageExposureProcessor.f(MtbPageExposureProcessor.this, findFirstVisibleItemPosition, linearLayoutManager)) {
                                if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                                    break;
                                }
                                findFirstVisibleItemPosition++;
                            } else {
                                MtbPageExposureProcessor.h(MtbPageExposureProcessor.this, findFirstVisibleItemPosition);
                                break;
                            }
                        }
                    }
                    List<h3j> dataList = b.getDataList();
                    int d = MtbPageExposureProcessor.d(MtbPageExposureProcessor.this);
                    int min = Math.min(MtbPageExposureProcessor.e(MtbPageExposureProcessor.this), dataList.size() - 1);
                    if (d < min) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        if (d <= min) {
                            while (true) {
                                h3j h3jVar = dataList.get(d);
                                if (!h3jVar.e() || !this.b) {
                                    h3jVar.m(true);
                                    arrayList.add(h3jVar);
                                    arrayList2.add(new Pair(h3jVar, Integer.valueOf(d)));
                                }
                                if (d == min) {
                                    break;
                                }
                                d++;
                            }
                        }
                        MtbPageExposureProcessor.g(MtbPageExposureProcessor.this, arrayList);
                        MtbPageExposureProcessor.a(MtbPageExposureProcessor.this, arrayList2, this.b);
                    }
                }
            }
        }
    }

    static {
        t2o.a(745537979);
    }

    public static final /* synthetic */ void a(MtbPageExposureProcessor mtbPageExposureProcessor, List list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2215fdd", new Object[]{mtbPageExposureProcessor, list, new Boolean(z)});
        } else {
            mtbPageExposureProcessor.k(list, z);
        }
    }

    public static final /* synthetic */ MtbAdapter b(MtbPageExposureProcessor mtbPageExposureProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbAdapter) ipChange.ipc$dispatch("524c7b0c", new Object[]{mtbPageExposureProcessor});
        }
        return mtbPageExposureProcessor.b;
    }

    public static final /* synthetic */ RecyclerView c(MtbPageExposureProcessor mtbPageExposureProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("638e92f1", new Object[]{mtbPageExposureProcessor});
        }
        return mtbPageExposureProcessor.f11297a;
    }

    public static final /* synthetic */ int d(MtbPageExposureProcessor mtbPageExposureProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebd7b3fb", new Object[]{mtbPageExposureProcessor})).intValue();
        }
        return mtbPageExposureProcessor.c;
    }

    public static final /* synthetic */ int e(MtbPageExposureProcessor mtbPageExposureProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("179c538b", new Object[]{mtbPageExposureProcessor})).intValue();
        }
        return mtbPageExposureProcessor.d;
    }

    public static final /* synthetic */ boolean f(MtbPageExposureProcessor mtbPageExposureProcessor, int i, RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ee6af81", new Object[]{mtbPageExposureProcessor, new Integer(i), layoutManager})).booleanValue();
        }
        return mtbPageExposureProcessor.n(i, layoutManager);
    }

    public static final /* synthetic */ void g(MtbPageExposureProcessor mtbPageExposureProcessor, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdcd1f2", new Object[]{mtbPageExposureProcessor, list});
        } else {
            mtbPageExposureProcessor.o(list);
        }
    }

    public static final /* synthetic */ void h(MtbPageExposureProcessor mtbPageExposureProcessor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef17ac6f", new Object[]{mtbPageExposureProcessor, new Integer(i)});
        } else {
            mtbPageExposureProcessor.c = i;
        }
    }

    public static final /* synthetic */ void i(MtbPageExposureProcessor mtbPageExposureProcessor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be6fedf", new Object[]{mtbPageExposureProcessor, new Integer(i)});
        } else {
            mtbPageExposureProcessor.d = i;
        }
    }

    public static /* synthetic */ void m(MtbPageExposureProcessor mtbPageExposureProcessor, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e6f", new Object[]{mtbPageExposureProcessor, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        mtbPageExposureProcessor.l(z);
    }

    public final void j(RecyclerView recyclerView, MtbAdapter mtbAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a3fef0", new Object[]{this, recyclerView, mtbAdapter});
            return;
        }
        ckf.h(recyclerView, "rv");
        ckf.h(mtbAdapter, "mAdapter");
        this.f11297a = recyclerView;
        this.b = mtbAdapter;
        recyclerView.removeOnScrollListener(this.e);
        recyclerView.addOnScrollListener(this.e);
    }

    public final void k(List<Pair<h3j, Integer>> list, boolean z) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d423eab2", new Object[]{this, list, new Boolean(z)});
        } else if (!list.isEmpty() && (recyclerView = this.f11297a) != null) {
            recyclerView.postDelayed(new a(list, z), 50L);
        }
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23daabfe", new Object[]{this, new Boolean(z)});
            return;
        }
        RecyclerView recyclerView = this.f11297a;
        if (recyclerView != null) {
            recyclerView.post(new b(z));
        }
    }

    public final boolean n(int i, RecyclerView.LayoutManager layoutManager) {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0334488", new Object[]{this, new Integer(i), layoutManager})).booleanValue();
        }
        RecyclerView recyclerView = this.f11297a;
        if (!(recyclerView == null || i < 0 || (findViewByPosition = layoutManager.findViewByPosition(i)) == null)) {
            int height = findViewByPosition.getHeight();
            int top = findViewByPosition.getTop();
            if (top >= 0) {
                int height2 = recyclerView.getHeight() - top;
                if (height2 > 0 && height2 + height2 > height) {
                    return true;
                }
            } else if (top + top + height > 0) {
                return true;
            }
        }
        return false;
    }

    public final void o(List<h3j> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f4227", new Object[]{this, list});
        } else if (!list.isEmpty()) {
            p3j.g(new c(new ArrayList(list)));
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ ArrayList f11300a;

        public c(ArrayList arrayList) {
            this.f11300a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject jSONObject;
            JSONArray jSONArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                for (h3j h3jVar : this.f11300a) {
                    JSONObject g = h3jVar.g();
                    if (!(g == null || (jSONObject = g.getJSONObject("events")) == null || (jSONArray = jSONObject.getJSONArray("exposeUt")) == null)) {
                        int size = jSONArray.size();
                        for (int i = 0; i < size; i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
                            if (jSONObject3 != null) {
                                jSONObject3.put("mtCommitTime", (Object) Long.valueOf(System.currentTimeMillis()));
                            }
                            String string = jSONObject2.getString("arg1");
                            String string2 = jSONObject2.getString("page");
                            if (string2 == null) {
                                string2 = u3j.b;
                            }
                            r4v.a(string2, 2201, string, null, null, jSONObject3);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
