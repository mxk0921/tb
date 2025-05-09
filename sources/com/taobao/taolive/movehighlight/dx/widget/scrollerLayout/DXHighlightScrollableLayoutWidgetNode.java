package com.taobao.taolive.movehighlight.dx.widget.scrollerLayout;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.android.dinamicx.widget.DXScrollerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.weex.common.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.bmv;
import tb.h36;
import tb.kzb;
import tb.mw5;
import tb.o06;
import tb.qub;
import tb.r26;
import tb.t2o;
import tb.uwa;
import tb.v2s;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DXHighlightScrollableLayoutWidgetNode extends DXScrollerLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHIGHLIGHTSCROLLABLELAYOUT_COLUMNCOUNT = 4480460401770252962L;
    public static final long DXHIGHLIGHTSCROLLABLELAYOUT_HIGHLIGHTSCROLLABLELAYOUT = -7332604652759394510L;
    public static final long DXHIGHLIGHTSCROLLABLELAYOUT_ISOPENLOADMORE = 2380170249149374095L;
    public static final long DXHIGHLIGHTSCROLLABLELAYOUT_PRELOADITEMCOUNT = -7119500793674581393L;
    public static final int LOAD_MORE_END = 4;
    public static final String LOAD_MORE_END_STRING = "LOAD_MORE_END";
    public static final int LOAD_MORE_FAIL = 3;
    public static final String LOAD_MORE_FAIL_STRING = "LOAD_MORE_FAIL";
    public static final int LOAD_MORE_IDLE = 1;
    public static final String LOAD_MORE_IDLE_STRING = "LOAD_MORE_IDLE";
    public static final int LOAD_MORE_LOADING = 2;
    public static final String LOAD_MORE_LOADING_STRING = "LOAD_MORE_LOADING";
    public static final int LOAD_MORE_NO_DATA = 5;
    public static final String LOAD_MORE_NO_DATA_STRING = "LOAD_MORE_NO_DATA";
    public static final String MSG_METHOD_UPDATE_SELETED_DATA = "HighlightDXScrollableLayout#updateSelectData";
    public static final String MSG_METHOD_appendData = "HighlightDXScrollableLayout#appendData";
    public static final String MSG_METHOD_change_selected_data = "HighlightDXScrollableLayout#changeSelectData";
    public static final String MSG_METHOD_scroll_refreshData = "HighlightDXScrollableLayout#scroll_refreshData";
    public static final String MSG_METHOD_updateLoadMoreStatus = "HighlightDXScrollableLayout#updateLoadMoreStatus";
    public static final String MSG_PROPERTY_data = "data";
    public static final String MSG_PROPERTY_status = "status";

    /* renamed from: a  reason: collision with root package name */
    public int f13083a = 1;
    public boolean b = true;
    public int c = 3;
    public List<DXWidgetNode> d;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface LoadMoreStatus {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXNativeRecyclerView f13084a;

        public a(DXNativeRecyclerView dXNativeRecyclerView) {
            this.f13084a = dXNativeRecyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.f13084a.getAdapter() != null) {
                    this.f13084a.getAdapter().notifyDataSetChanged();
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXHighlightGrideLayoutmanager f13085a;
        public final /* synthetic */ int c;

        public b(DXHighlightGrideLayoutmanager dXHighlightGrideLayoutmanager, int i) {
            this.f13085a = dXHighlightGrideLayoutmanager;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f13085a.scrollToPositionWithOffset(this.c, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f13086a;

        public c(int i) {
            this.f13086a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DXHighlightScrollableLayoutWidgetNode.this.A(this.f13086a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f13087a;

        public d(int i) {
            this.f13087a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DXHighlightScrollableLayoutWidgetNode.this.A(this.f13087a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779092656);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXHighlightScrollableLayoutWidgetNode();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f13088a;

        public f(int i) {
            this.f13088a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DXHighlightScrollableLayoutWidgetNode.this.A(this.f13088a);
            }
        }
    }

    static {
        t2o.a(779092649);
    }

    public static /* synthetic */ void a(DXHighlightScrollableLayoutWidgetNode dXHighlightScrollableLayoutWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a03970ce", new Object[]{dXHighlightScrollableLayoutWidgetNode});
        } else {
            dXHighlightScrollableLayoutWidgetNode.m0();
        }
    }

    public static /* synthetic */ Object ipc$super(DXHighlightScrollableLayoutWidgetNode dXHighlightScrollableLayoutWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1834790766:
                super.onBeforeBindChildData();
                return null;
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/widget/scrollerLayout/DXHighlightScrollableLayoutWidgetNode");
        }
    }

    public void A(int i) {
        JSONObject data;
        JSONArray jSONArray;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512b8bf6", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (getDXRuntimeContext() != null && getDXRuntimeContext().L() != null && (data = getDXRuntimeContext().L().getData()) != null && data.getJSONObject("model") != null && (jSONArray = data.getJSONObject("model").getJSONArray("timeMovingList")) != null && jSONArray.size() > i && (jSONObject = (JSONObject) jSONArray.get(i)) != null && this.itemWidgetNodes != null) {
                new JSONArray().add(jSONObject);
                this.itemWidgetNodes.remove(i);
                this.itemWidgetNodes.addAll(i, v(i, jSONObject, this.d));
                B();
            }
        } catch (Exception unused) {
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
            return;
        }
        try {
            DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) getDXRuntimeContext().D();
            if (dXNativeRecyclerView != null) {
                dXNativeRecyclerView.post(new o06(this, dXNativeRecyclerView));
            }
        } catch (Throwable th) {
            xv5.b(th);
            m0();
        }
    }

    public void C(DXWidgetNode dXWidgetNode) {
        DinamicXEngine f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a1562b", new Object[]{this, dXWidgetNode});
        } else if (getDXRuntimeContext() != null && getDXRuntimeContext().s() != null && (f2 = getDXRuntimeContext().s().f()) != null) {
            f2.I0(dXWidgetNode, 0, new DXWidgetRefreshOption.a().c(2).d(true).g(true).a());
        }
    }

    public void D(int i) {
        DXHighlightGrideLayoutmanager dXHighlightGrideLayoutmanager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c12079", new Object[]{this, new Integer(i)});
            return;
        }
        DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) getDXRuntimeContext().D();
        if (dXNativeRecyclerView != null && (dXHighlightGrideLayoutmanager = (DXHighlightGrideLayoutmanager) dXNativeRecyclerView.getLayoutManager()) != null) {
            dXNativeRecyclerView.postDelayed(new b(dXHighlightGrideLayoutmanager, i), 100L);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXHighlightScrollableLayoutWidgetNode();
    }

    public final void m0() {
        int i;
        DXNativeRecyclerView dXNativeRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fbfe1a", new Object[]{this});
        } else if (!uwa.K()) {
            try {
                kzb h = v2s.o().h();
                if (h == null || 2 != h.getDeviceLevel()) {
                    i = 500;
                } else {
                    i = 1000;
                }
                if (getDXRuntimeContext() != null && getDXRuntimeContext().D() != null && (dXNativeRecyclerView = (DXNativeRecyclerView) getDXRuntimeContext().D()) != null) {
                    dXNativeRecyclerView.postDelayed(new a(dXNativeRecyclerView), i);
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        this.d = new ArrayList();
        if (getChildren() != null && getChildren().size() > 0) {
            for (int i = 0; i < getChildren().size(); i++) {
                this.d.add(getChildAt(i).deepClone(getDXRuntimeContext()));
            }
        }
        super.onBeforeBindChildData();
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXHighlightScrollableLayoutWidgetNode)) {
            super.onClone(dXWidgetNode, z);
            DXHighlightScrollableLayoutWidgetNode dXHighlightScrollableLayoutWidgetNode = (DXHighlightScrollableLayoutWidgetNode) dXWidgetNode;
            this.d = dXHighlightScrollableLayoutWidgetNode.d;
            this.c = dXHighlightScrollableLayoutWidgetNode.c;
            this.f13083a = dXHighlightScrollableLayoutWidgetNode.f13083a;
            this.b = dXHighlightScrollableLayoutWidgetNode.b;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 4480460401770252962L) {
            if (i <= 0) {
                i = 1;
            }
            this.f13083a = i;
        } else if (j == 2380170249149374095L) {
            if (i == 0) {
                z = false;
            }
            this.b = z;
        } else if (j == DXHIGHLIGHTSCROLLABLELAYOUT_PRELOADITEMCOUNT) {
            if (i < 0) {
                i = 3;
            }
            this.c = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout
    public void setAdapter(DXScrollerLayout dXScrollerLayout, RecyclerView recyclerView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c19e8ee", new Object[]{this, dXScrollerLayout, recyclerView, context});
            return;
        }
        ScrollerAdapterUpgrade scrollerAdapterUpgrade = (ScrollerAdapterUpgrade) recyclerView.getAdapter();
        if (dXScrollerLayout instanceof DXHighlightScrollableLayoutWidgetNode) {
            DXHighlightScrollableLayoutWidgetNode dXHighlightScrollableLayoutWidgetNode = (DXHighlightScrollableLayoutWidgetNode) dXScrollerLayout;
            if (scrollerAdapterUpgrade == null) {
                scrollerAdapterUpgrade = new ScrollerAdapterUpgrade(context, dXScrollerLayout);
                scrollerAdapterUpgrade.setHasStableIds(true);
                scrollerAdapterUpgrade.setDataSource(dXHighlightScrollableLayoutWidgetNode.itemWidgetNodes);
                recyclerView.setAdapter(scrollerAdapterUpgrade);
                scrollerAdapterUpgrade.W((DXHighlightGrideLayoutmanager) recyclerView.getLayoutManager());
            } else {
                scrollerAdapterUpgrade.setDataSource(dXHighlightScrollableLayoutWidgetNode.itemWidgetNodes);
                scrollerAdapterUpgrade.setScrollerLayout(dXScrollerLayout);
                if (this.contentOffset <= -1) {
                    ((DXNativeRecyclerView) recyclerView).needScrollAfterLayout(0, 0, dXHighlightScrollableLayoutWidgetNode.contentHorizontalLength, dXHighlightScrollableLayoutWidgetNode.contentVerticalLength);
                }
                scrollerAdapterUpgrade.notifyDataSetChanged();
            }
            scrollerAdapterUpgrade.e = this.c;
            scrollerAdapterUpgrade.f13089a = this.b;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout
    public void setLayoutManager(Context context, DXScrollerLayout dXScrollerLayout, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b00aa66", new Object[]{this, context, dXScrollerLayout, recyclerView});
            return;
        }
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(1048576);
        DXHighlightGrideLayoutmanager dXHighlightGrideLayoutmanager = (DXHighlightGrideLayoutmanager) recyclerView.getLayoutManager();
        if (dXHighlightGrideLayoutmanager == null) {
            dXHighlightGrideLayoutmanager = new DXHighlightGrideLayoutmanager(context, this.f13083a);
            recyclerView.setLayoutManager(dXHighlightGrideLayoutmanager);
        }
        if (getOrientation() == 1) {
            dXHighlightGrideLayoutmanager.setOrientation(1);
        } else {
            dXHighlightGrideLayoutmanager.setOrientation(0);
        }
        dXHighlightGrideLayoutmanager.setInitialPrefetchItemCount(5);
        dXHighlightGrideLayoutmanager.setItemPrefetchEnabled(dXScrollerLayout.isItemPrefetch());
    }

    public boolean t(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d74d7597", new Object[]{this, jSONArray})).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        this.itemWidgetNodes.addAll(u(jSONArray));
        getListData().addAll(jSONArray);
        B();
        return true;
    }

    public ArrayList<DXWidgetNode> u(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2b4e94f6", new Object[]{this, jSONArray});
        }
        return generateWidgetNodeByData(getListData().size(), jSONArray, this.d);
    }

    public ArrayList<DXWidgetNode> v(int i, JSONObject jSONObject, List<DXWidgetNode> list) {
        DXRuntimeContext b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("37c6f7df", new Object[]{this, new Integer(i), jSONObject, list});
        }
        ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
        for (DXWidgetNode dXWidgetNode : list) {
            if (!(dXWidgetNode == null || dXWidgetNode.getDXRuntimeContext() == null || (b2 = dXWidgetNode.getDXRuntimeContext().b(dXWidgetNode)) == null)) {
                b2.q0(jSONObject);
                b2.r0(i);
                HashMap hashMap = new HashMap();
                b2.j0(hashMap);
                hashMap.put(bmv.MSGTYPE_INTERVAL, mw5.K(i));
                hashMap.put(Constants.Name.Recycler.LIST_DATA, mw5.F(getListData()));
                DXWidgetNode b3 = r26.b(dXWidgetNode, b2);
                b3.setParentWidget(this);
                arrayList.add(b3);
            }
        }
        return arrayList;
    }

    public void w(int i) {
        DXNativeRecyclerView dXNativeRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d464404", new Object[]{this, new Integer(i)});
        } else if (getDXRuntimeContext() != null && (dXNativeRecyclerView = (DXNativeRecyclerView) getDXRuntimeContext().D()) != null) {
            dXNativeRecyclerView.post(new f(i));
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f0f627", new Object[]{this});
        } else {
            postEvent(new DXHighlightScrollableOnLoadMoreEvent());
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a87be1", new Object[]{this});
            return;
        }
        h36.i("收到loadMore", new String[0]);
        E(2);
        z();
    }

    public boolean E(int i) {
        ScrollerAdapterUpgrade scrollerAdapterUpgrade;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f31f6ca", new Object[]{this, new Integer(i)})).booleanValue();
        }
        View D = getDXRuntimeContext().D();
        if (D == null || !(D instanceof DXNativeRecyclerView) || (scrollerAdapterUpgrade = (ScrollerAdapterUpgrade) ((DXNativeRecyclerView) D).getAdapter()) == null) {
            return false;
        }
        scrollerAdapterUpgrade.X(i);
        h36.i("更新状态" + i, new String[0]);
        return true;
    }

    public void x(String str, int i) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e44c4b4", new Object[]{this, str, new Integer(i)});
        } else if (getDXRuntimeContext() != null && getDXRuntimeContext().L() != null && getDXRuntimeContext().s() != null) {
            JSONObject data = getDXRuntimeContext().L().getData();
            DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) getDXRuntimeContext().D();
            if (!(data == null || dXNativeRecyclerView == null || (intValue = data.getInteger("selectedItemIndex").intValue()) == i)) {
                data.put("selectedItemIndex", (Object) Integer.valueOf(i));
                data.put("selectedItemId", (Object) str);
                dXNativeRecyclerView.post(new c(intValue));
                dXNativeRecyclerView.post(new d(i));
                if (getDXRuntimeContext().L().getExpandWidgetNode() != null) {
                    List<DXWidgetNode> children = getDXRuntimeContext().L().getExpandWidgetNode().getChildren();
                    for (int i2 = 0; i2 < children.size(); i2++) {
                        if (children.get(i2).getUserId() == null || !"loadMoreWidget".equals(children.get(i2).getUserId())) {
                            C(children.get(i2));
                        }
                    }
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent instanceof DXMsgCenterEvent) {
            DXMsgCenterEvent dXMsgCenterEvent = (DXMsgCenterEvent) dXEvent;
            if (dXMsgCenterEvent.getType().equalsIgnoreCase("General")) {
                JSONObject params = dXMsgCenterEvent.getParams();
                String method = dXMsgCenterEvent.getMethod();
                if (MSG_METHOD_updateLoadMoreStatus.equalsIgnoreCase(method)) {
                    String string = params.getString("status");
                    string.hashCode();
                    char c2 = 65535;
                    switch (string.hashCode()) {
                        case -1870033097:
                            if (string.equals(LOAD_MORE_NO_DATA_STRING)) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -464686673:
                            if (string.equals(LOAD_MORE_FAIL_STRING)) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case -464594331:
                            if (string.equals(LOAD_MORE_IDLE_STRING)) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 123556874:
                            if (string.equals(LOAD_MORE_END_STRING)) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 622228715:
                            if (string.equals(LOAD_MORE_LOADING_STRING)) {
                                c2 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            return E(5);
                        case 1:
                            return E(3);
                        case 2:
                            return E(1);
                        case 3:
                            return E(4);
                        case 4:
                            return E(2);
                        default:
                            return false;
                    }
                } else if (MSG_METHOD_appendData.equalsIgnoreCase(method)) {
                    return t(params.getJSONArray("data"));
                } else {
                    if (MSG_METHOD_scroll_refreshData.equalsIgnoreCase(method)) {
                        Integer integer = params.getInteger("data");
                        if (integer != null) {
                            D(integer.intValue());
                        }
                        return true;
                    } else if (MSG_METHOD_change_selected_data.equalsIgnoreCase(method)) {
                        String string2 = params.getString("itemId");
                        int intValue2 = params.getInteger("subDataIndex").intValue();
                        if (!TextUtils.isEmpty(string2) && intValue2 >= 0) {
                            x(string2, intValue2);
                        }
                    } else if (MSG_METHOD_UPDATE_SELETED_DATA.equalsIgnoreCase(method) && (intValue = params.getInteger("subDataIndex").intValue()) >= 0) {
                        w(intValue);
                    }
                }
            }
        }
        return super.onEvent(dXEvent);
    }
}
