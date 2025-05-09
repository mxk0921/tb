package com.taobao.android.dinamicx.widget.recycler;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXRecyclerEvent;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import java.util.HashMap;
import tb.h36;
import tb.mw5;
import tb.pb6;
import tb.srf;
import tb.t2o;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ScrollListener extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f7468a;
    public DXRecyclerLayout b;
    public RecyclerView.OnScrollListener e;
    public int f;
    public int g;
    public long h;
    public double i;
    public a j;
    public int k;
    public boolean l;
    public int c = 0;
    public int d = -1;
    public AnchorState m = AnchorState.NONE;
    public int q = -1;
    public final DXRecyclerEvent n = new DXRecyclerEvent(5288751146867425108L);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum AnchorState {
        NONE,
        REACH,
        LEAVE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnchorState anchorState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/ScrollListener$AnchorState");
        }

        public static AnchorState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AnchorState) ipChange.ipc$dispatch("ee3db8db", new Object[]{str});
            }
            return (AnchorState) Enum.valueOf(AnchorState.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f7469a;
        public final boolean b;
        public int c;
        public int d;

        static {
            t2o.a(444597528);
        }

        public a(JSONObject jSONObject) {
            this.c = Integer.MAX_VALUE;
            this.d = -1;
            Boolean bool = Boolean.FALSE;
            this.f7469a = srf.c("enableScrollEventCallback", jSONObject, bool).booleanValue();
            boolean booleanValue = srf.c("enableAnchorCallback", jSONObject, bool).booleanValue();
            this.b = booleanValue;
            if (jSONObject.containsKey("translateYLimited")) {
                this.c = jSONObject.getIntValue("translateYLimited");
            }
            if (jSONObject.containsKey("anchorOffsetY")) {
                this.d = jSONObject.getIntValue("anchorOffsetY");
            }
            this.b = (this.d > 0) & booleanValue;
        }
    }

    static {
        t2o.a(444597526);
    }

    public ScrollListener(int i, DXRecyclerLayout dXRecyclerLayout) {
        this.f7468a = i;
        this.b = dXRecyclerLayout;
    }

    public static /* synthetic */ Object ipc$super(ScrollListener scrollListener, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/ScrollListener");
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11e394f0", new Object[]{this})).intValue();
        }
        return this.q;
    }

    public void b(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8572d9f", new Object[]{this, onScrollListener});
        } else {
            this.e = onScrollListener;
        }
    }

    public final int o() {
        RecyclerView j0;
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74f39796", new Object[]{this})).intValue();
        }
        DXRecyclerLayout dXRecyclerLayout = this.b;
        if (dXRecyclerLayout == null || (j0 = dXRecyclerLayout.j0()) == null || (childAt = j0.getChildAt(0)) == null) {
            return -2;
        }
        return j0.getChildAdapterPosition(childAt);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        DXRecyclerLayout dXRecyclerLayout;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        if (this.f7468a == 0 && this.c == 2 && i == 0) {
            if (this.d > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            recyclerView.scrollBy(0, i2);
        }
        if (i == 0) {
            this.h = 0L;
            DXRecyclerLayout dXRecyclerLayout2 = this.b;
            if (dXRecyclerLayout2 != null) {
                dXRecyclerLayout2.postEvent(new DXEvent(2691126191158604142L));
                this.b.l1(recyclerView);
                DXRootView L = this.b.getDXRuntimeContext().L();
                DXRuntimeContext dXRuntimeContext = this.b.getDXRuntimeContext();
                if (!(dXRuntimeContext == null || !zg5.z4(dXRuntimeContext.c()) || L == null || L.getDxNestedScrollerView(this.b.getDXRuntimeContext()) == null)) {
                    L.getDxNestedScrollerView(this.b.getDXRuntimeContext()).dispatchChildScrollStateChange(i);
                }
            }
        }
        if (i == 1 && (dXRecyclerLayout = this.b) != null) {
            dXRecyclerLayout.postEvent(new DXEvent(9144262755562405950L));
        }
        this.c = i;
        RecyclerView.OnScrollListener onScrollListener = this.e;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(recyclerView, i);
        }
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2571766a", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public double r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e7c236f", new Object[]{this})).doubleValue();
        }
        return this.i;
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1548214e", new Object[]{this})).booleanValue();
        }
        if (this.j != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.recycler.ScrollListener.t(int, int):void");
    }

    public final void u(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b6e074", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.n.setDeltaX(i);
        this.n.setDeltaY(i2);
        this.n.setOffsetX(this.g);
        this.n.setOffsetY(this.f);
        this.n.setSpeedRatio(this.i);
        DXRecyclerLayout dXRecyclerLayout = this.b;
        if (dXRecyclerLayout != null) {
            this.n.setUserId(dXRecyclerLayout.getUserId());
            this.n.setSelfWidget(this.b);
            this.n.setDataToArgs();
            this.b.postEvent(this.n);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.c = 0;
        this.d = -1;
        this.f = 0;
        this.g = 0;
        w();
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb2a414", new Object[]{this});
            return;
        }
        this.k = 0;
        this.l = false;
        a aVar = this.j;
        if (aVar != null && aVar.b && this.m == AnchorState.REACH) {
            this.n.getArgs().put("anchorState", mw5.O(AnchorState.LEAVE.toString().toLowerCase()));
            u(0, 0);
        }
        this.m = AnchorState.NONE;
    }

    public void x(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505ada", new Object[]{this, dXRecyclerLayout});
        } else {
            this.b = dXRecyclerLayout;
        }
    }

    public void z(JSONObject jSONObject, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3fc9f8a", new Object[]{this, jSONObject, dXRuntimeContext});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            this.j = new a(jSONObject);
            HashMap hashMap = new HashMap();
            this.j.c = pb6.d(dXRuntimeContext.r(), dXRuntimeContext.h(), this.j.c);
            hashMap.put("translateYLimited", mw5.K(this.j.c));
            this.j.d = pb6.d(dXRuntimeContext.r(), dXRuntimeContext.h(), this.j.d);
            hashMap.put("anchorOffsetY", mw5.K(this.j.d));
            this.n.setDataToArgs(hashMap);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int o0;
        int o;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        this.d = i2;
        this.g += i;
        this.f += i2;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.h;
        if (j < 60000) {
            boolean z2 = i2 != 0;
            if (j <= 0) {
                z = false;
            }
            if (z && z2) {
                this.i = Math.round((float) ((Math.abs(i2) * 1000) / j)) / 1.0d;
            }
        }
        this.h = currentTimeMillis;
        if (s()) {
            t(i, i2);
        } else {
            u(i, i2);
        }
        RecyclerView.OnScrollListener onScrollListener = this.e;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(recyclerView, i, i2);
        }
        if (i2 < 0 && (o0 = this.b.o0()) >= 0 && (o = o()) >= 0 && o <= o0) {
            h36.b("ScrollListener", "滚动到顶部");
            this.b.M0();
        }
        this.q = o();
        if (DinamicXEngine.j0()) {
            h36.b("ScrollListener", "dx: " + i + " dy " + i2 + " offsetY " + this.f);
        }
    }
}
