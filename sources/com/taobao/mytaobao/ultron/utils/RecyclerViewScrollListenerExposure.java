package com.taobao.mytaobao.ultron.utils;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.ptr.views.recycler.accessories.FixedViewAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bwu;
import tb.f8v;
import tb.ruv;
import tb.sc;
import tb.t2o;
import tb.wb6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RecyclerViewScrollListenerExposure extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f11354a = 1;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public final ArrayList<IDMComponent> e = new ArrayList<>();
    public final Map<String, Integer> f = new HashMap();
    public final f8v g;
    public final RecyclerView h;

    static {
        t2o.a(745538173);
    }

    public RecyclerViewScrollListenerExposure(com.alibaba.android.ultron.vfw.instance.a aVar, RecyclerView recyclerView) {
        this.g = aVar.getEventHandler();
        this.h = recyclerView;
    }

    public static /* synthetic */ RecyclerView b(RecyclerViewScrollListenerExposure recyclerViewScrollListenerExposure) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("4490604e", new Object[]{recyclerViewScrollListenerExposure});
        }
        return recyclerViewScrollListenerExposure.h;
    }

    public static /* synthetic */ Object ipc$super(RecyclerViewScrollListenerExposure recyclerViewScrollListenerExposure, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1177043419) {
            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 1361287682) {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/ultron/utils/RecyclerViewScrollListenerExposure");
        }
    }

    public static /* synthetic */ Map o(RecyclerViewScrollListenerExposure recyclerViewScrollListenerExposure) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e1fb5bfb", new Object[]{recyclerViewScrollListenerExposure});
        }
        return recyclerViewScrollListenerExposure.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
        } else {
            super.onScrollStateChanged(recyclerView, i);
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
        int i3 = this.f11354a + i2;
        this.f11354a = i3;
        if (i3 > 10 || i3 < -10) {
            this.f11354a = 0;
            z(recyclerView);
        }
    }

    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            r();
        }
    }

    public final boolean p(IDMComponent iDMComponent) {
        ArrayMap<String, Object> extMap;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20332b0c", new Object[]{this, iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || (extMap = iDMComponent.getExtMap()) == null) {
            return false;
        }
        Object obj = extMap.get("key_mytaobao_exposed_mark");
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            z = false;
        }
        if (z) {
            x(iDMComponent);
        }
        return z;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28141046", new Object[]{this});
            return;
        }
        ArrayList<IDMComponent> arrayList = this.e;
        if (arrayList != null && arrayList.size() > 0 && this.g != null) {
            sc.b("commitExposureComponent");
            ArrayList<IDMComponent> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.e);
            this.e.clear();
            if (arrayList2.size() > 0) {
                Iterator<IDMComponent> it = arrayList2.iterator();
                while (it.hasNext()) {
                    ruv.b(it.next(), this.g);
                }
                s(arrayList2);
            }
            sc.c("commitExposureComponent");
        }
    }

    public final void s(ArrayList<IDMComponent> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aebd0d9", new Object[]{this, arrayList});
        } else if (this.h != null && arrayList != null && !arrayList.isEmpty()) {
            this.h.postDelayed(new a(arrayList), 50L);
        }
    }

    public final RecyclerViewAdapter t(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewAdapter) ipChange.ipc$dispatch("c71bd105", new Object[]{this, recyclerView});
        }
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return null;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter instanceof FixedViewAdapter) {
            adapter = ((FixedViewAdapter) adapter).N();
        }
        if (adapter instanceof RecyclerViewAdapter) {
            return (RecyclerViewAdapter) adapter;
        }
        return null;
    }

    public final boolean u(int i, RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3aa66c59", new Object[]{this, new Integer(i), recyclerView, layoutManager})).booleanValue();
        }
        if (!(recyclerView == null || layoutManager == null || i < 0)) {
            if (this.d < 1) {
                this.d = recyclerView.getHeight();
            }
            View findViewByPosition = layoutManager.findViewByPosition(i);
            if (findViewByPosition != null) {
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
        }
        return false;
    }

    public final void v(RecyclerViewAdapter recyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b70612", new Object[]{this, recyclerViewAdapter});
        } else if (recyclerViewAdapter != null && recyclerViewAdapter.getItemCount() >= 1) {
            List<IDMComponent> data = recyclerViewAdapter.getData();
            for (int i = this.b; i <= this.c && i < data.size() && i >= 0; i++) {
                IDMComponent iDMComponent = data.get(i);
                if (p(iDMComponent)) {
                    this.e.add(iDMComponent);
                    String tag = iDMComponent.getTag();
                    if (tag != null) {
                        ((HashMap) this.f).put(tag, Integer.valueOf(i));
                    }
                }
            }
            if (this.e.size() > 0) {
                r();
            }
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.b = 0;
        this.c = 0;
        r();
        ArrayList<IDMComponent> arrayList = this.e;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void x(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685a4d77", new Object[]{this, iDMComponent});
        } else if (iDMComponent != null && iDMComponent.getExtMap() != null) {
            iDMComponent.getExtMap().put("key_mytaobao_exposed_mark", Boolean.TRUE);
        }
    }

    public void z(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38cb42c2", new Object[]{this, recyclerView});
        } else if (recyclerView != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            int i = findLastVisibleItemPosition;
            while (true) {
                if (i <= 0) {
                    break;
                } else if (u(i, recyclerView, linearLayoutManager)) {
                    this.c = i;
                    break;
                } else {
                    i--;
                }
            }
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            while (true) {
                if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
                    break;
                } else if (u(findFirstVisibleItemPosition, recyclerView, linearLayoutManager)) {
                    this.b = findFirstVisibleItemPosition;
                    break;
                } else {
                    findFirstVisibleItemPosition++;
                }
            }
            v(t(recyclerView));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f11355a;

        public a(ArrayList arrayList) {
            this.f11355a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONArray a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RecyclerView.LayoutManager layoutManager = RecyclerViewScrollListenerExposure.b(RecyclerViewScrollListenerExposure.this).getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                for (int i = 0; i < this.f11355a.size(); i++) {
                    IDMComponent iDMComponent = (IDMComponent) this.f11355a.get(i);
                    String tag = iDMComponent.getTag();
                    if (tag != null && RecyclerViewScrollListenerExposure.o(RecyclerViewScrollListenerExposure.this).containsKey(tag)) {
                        View findViewByPosition = linearLayoutManager.findViewByPosition(((Integer) RecyclerViewScrollListenerExposure.o(RecyclerViewScrollListenerExposure.this).get(tag)).intValue());
                        if (findViewByPosition instanceof DXRootView) {
                            View a3 = bwu.a((DXRootView) findViewByPosition, "scrollExpose");
                            if ((a3 instanceof RecyclerView) && (a2 = wb6.a(iDMComponent.getData(), false)) != null) {
                                wb6.b((RecyclerView) a3, a2, 0.5f, false);
                            }
                        }
                    }
                }
            }
        }
    }
}
