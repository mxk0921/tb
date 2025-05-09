package com.alibaba.android.aura.taobao.adapter.extension.event.locator;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.taobao.adapter.extension.event.locator.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import tb.ai;
import tb.bh;
import tb.ck;
import tb.hbb;
import tb.pg1;
import tb.pn;
import tb.qi;
import tb.rbb;
import tb.t2o;
import tb.ws;
import tb.xk;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.event.locator")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AURALocatorEvent extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<AURARenderComponent> e;
    public RecyclerView f;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface Position {
        public static final String BOTTOM = "bottom";
        public static final String CENTER = "center";
        public static final String TOP = "top";
    }

    static {
        t2o.a(81789064);
    }

    public static /* synthetic */ Object ipc$super(AURALocatorEvent aURALocatorEvent, String str, Object... objArr) {
        if (str.hashCode() == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/event/locator/AURALocatorEvent");
    }

    public final AURARenderComponent O0(List<AURARenderComponent> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("7be2913b", new Object[]{this, list, str});
        }
        for (AURARenderComponent aURARenderComponent : list) {
            if (str.equals(aURARenderComponent.key)) {
                return aURARenderComponent;
            }
        }
        return null;
    }

    public final String P0(Object[] objArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9991c7e4", new Object[]{this, objArr, new Integer(i)});
        }
        if (objArr == null || objArr.length <= i) {
            return null;
        }
        Object obj = objArr[i];
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).getString("target");
        }
        ck.g().d("args is null");
        return null;
    }

    public final int Q0(List<AURARenderComponent> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ed8d634", new Object[]{this, list, str})).intValue();
        }
        for (int i = 0; i < list.size(); i++) {
            AURARenderComponent aURARenderComponent = list.get(i);
            if (aURARenderComponent != null && str.equals(aURARenderComponent.key)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean S0(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("815a1b5f", new Object[]{this, recyclerView, new Integer(i)})).booleanValue();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (i < findFirstVisibleItemPosition || i > findLastVisibleItemPosition) {
            return false;
        }
        return true;
    }

    public final void T0(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("445b3a2d", new Object[]{this, bVar});
            return;
        }
        AURAGlobalData B = B();
        if (B == null) {
            M0("locator", "globalData 为空");
            ck.g().e("AURALocatorEvent fun:innerHandleEvent case: globalData 为空");
            return;
        }
        B.update(a.GLOBAL_DATA_BLINK_DATA, bVar);
    }

    @Override // tb.ws, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.e = (List) aURAGlobalData.get("render_view_item_models", List.class);
        this.f = (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class);
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "locator";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class CenterSmoothScroller extends LinearSmoothScroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f2150a;
        public final String b;

        static {
            t2o.a(81789065);
        }

        public CenterSmoothScroller(Context context, String str, String str2) {
            super(context);
            this.b = str;
            this.f2150a = ai.a(pn.c(str2, 58));
        }

        public static /* synthetic */ Object ipc$super(CenterSmoothScroller centerSmoothScroller, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/event/locator/AURALocatorEvent$CenterSmoothScroller");
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            int i6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue();
            }
            if ("top".equalsIgnoreCase(this.b)) {
                i6 = (i3 - i) + this.f2150a;
            } else if ("bottom".equalsIgnoreCase(this.b)) {
                i6 = (i4 - i2) - this.f2150a;
            } else {
                i6 = (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
            }
            if (i6 == 0) {
                return 1;
            }
            return i6;
        }
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
            return;
        }
        qi eventModel = aURAEventIO.getEventModel();
        JSONObject c = eventModel.c();
        if (c == null) {
            M0("locator", "eventsFields is null!");
            ck.g().e("AURALocatorEvent fun:innerHandleEvent case: eventFields 为空");
            return;
        }
        if (TextUtils.isEmpty(c.getString("target"))) {
            str = P0(eventModel.a(), 1);
        } else {
            str = c.getString("target");
        }
        if (TextUtils.isEmpty(str)) {
            M0("locator", "target 为空");
            ck.g().e("AURALocatorEvent fun:innerHandleEvent case: target 为空");
        } else if (this.f == null || bh.a(this.e)) {
            M0("locator", "recycleView 为空");
            ck.g().e("AURALocatorEvent fun:innerHandleEvent case: recycleView 为空");
        } else {
            U0(this.e, this.f, str, c.getString("position"), c.getString("offset"), c.getString("smooth"));
            AURARenderComponent O0 = O0(this.e, str);
            if (O0 == null) {
                M0("locator", "renderComponent 为空");
                ck.g().e("AURALocatorEvent fun:innerHandleEvent case: renderComponent 为空");
                return;
            }
            JSONObject jSONObject = c.getJSONObject(pg1.ATOM_EXT_blink);
            if (!bh.b(jSONObject)) {
                T0(new a.b(jSONObject, O0));
            }
        }
    }

    public final boolean R0(AURARenderComponent aURARenderComponent) {
        AURARenderComponentLayout aURARenderComponentLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ab85426", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent == null) {
            return false;
        }
        while (aURARenderComponent != null) {
            AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
            if (aURARenderComponentData != null && (aURARenderComponentLayout = aURARenderComponentData.layout) != null && "sticky".equals(aURARenderComponentLayout.type)) {
                return false;
            }
            aURARenderComponent = aURARenderComponent.parent;
        }
        return true;
    }

    public final void U0(List<AURARenderComponent> list, RecyclerView recyclerView, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce15175", new Object[]{this, list, recyclerView, str, str2, str3, str4});
            return;
        }
        int Q0 = Q0(list, str);
        if (Q0 == -1) {
            ck.g().d("未找到位置");
            rbb g = ck.g();
            g.d("AURALocatorEvent fun:smoothScrollToPositionIfNeed case: Can not found " + str);
        } else if (!R0(list.get(Q0))) {
            ck.g().d("不支持滑动");
            ck.g().d("AURALocatorEvent fun:smoothScrollToPositionIfNeed case:  not support scroll!");
        } else {
            if (xk.a("disableScrollSmooth", true) && !Boolean.parseBoolean(str4) && !S0(recyclerView, Q0)) {
                ((LinearLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(Q0, 0);
            }
            CenterSmoothScroller centerSmoothScroller = new CenterSmoothScroller(J0().f(), str2, str3);
            centerSmoothScroller.setTargetPosition(Q0);
            recyclerView.getLayoutManager().startSmoothScroll(centerSmoothScroller);
        }
    }
}
