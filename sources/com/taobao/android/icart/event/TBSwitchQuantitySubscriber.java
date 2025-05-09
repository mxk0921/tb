package com.taobao.android.icart.event;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.a2s;
import tb.c9x;
import tb.fdv;
import tb.fsb;
import tb.imb;
import tb.juv;
import tb.kmb;
import tb.lcu;
import tb.lmb;
import tb.t2o;
import tb.vav;
import tb.vo0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBSwitchQuantitySubscriber extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE_SWITCH_QUANTITY = "switchQuantity";
    public RecyclerView.OnScrollListener l;
    public final List<String> m = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRootView f7986a;

        public a(DXRootView dXRootView) {
            this.f7986a = dXRootView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXWidgetNode queryWidgetNodeByUserId = this.f7986a.getFlattenWidgetNode().queryWidgetNodeByUserId(a2s.WIDGET_NAME);
            if (queryWidgetNodeByUserId != null && queryWidgetNodeByUserId.getDXRuntimeContext() != null) {
                queryWidgetNodeByUserId.getDXRuntimeContext().D().sendAccessibilityEvent(128);
            }
        }
    }

    static {
        t2o.a(478150789);
    }

    public static /* synthetic */ Object ipc$super(TBSwitchQuantitySubscriber tBSwitchQuantitySubscriber, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/TBSwitchQuantitySubscriber");
    }

    public static /* synthetic */ List p(TBSwitchQuantitySubscriber tBSwitchQuantitySubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("49ffbb40", new Object[]{tBSwitchQuantitySubscriber});
        }
        return tBSwitchQuantitySubscriber.m;
    }

    public static /* synthetic */ kmb q(TBSwitchQuantitySubscriber tBSwitchQuantitySubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("4214630f", new Object[]{tBSwitchQuantitySubscriber});
        }
        return tBSwitchQuantitySubscriber.j;
    }

    public static /* synthetic */ boolean r(TBSwitchQuantitySubscriber tBSwitchQuantitySubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9897469", new Object[]{tBSwitchQuantitySubscriber})).booleanValue();
        }
        return tBSwitchQuantitySubscriber.v();
    }

    public static /* synthetic */ kmb s(TBSwitchQuantitySubscriber tBSwitchQuantitySubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("5e2cb6cd", new Object[]{tBSwitchQuantitySubscriber});
        }
        return tBSwitchQuantitySubscriber.j;
    }

    public static /* synthetic */ kmb t(TBSwitchQuantitySubscriber tBSwitchQuantitySubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("6c38e0ac", new Object[]{tBSwitchQuantitySubscriber});
        }
        return tBSwitchQuantitySubscriber.j;
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763c6e00", new Object[]{this});
            return;
        }
        Object e = this.f23048a.e("triggerView");
        if (e instanceof DXRootView) {
            DXRootView dXRootView = (DXRootView) e;
            dXRootView.post(new a(dXRootView));
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c6102a", new Object[]{this});
        } else if (this.l == null) {
            this.l = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.icart.event.TBSwitchQuantitySubscriber.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    if (str.hashCode() == 1361287682) {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/TBSwitchQuantitySubscriber$2");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    fsb b;
                    boolean z = false;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (1 == i && TBSwitchQuantitySubscriber.p(TBSwitchQuantitySubscriber.this).size() > 0 && (b = TBSwitchQuantitySubscriber.q(TBSwitchQuantitySubscriber.this).b()) != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = TBSwitchQuantitySubscriber.p(TBSwitchQuantitySubscriber.this).iterator();
                        while (it.hasNext()) {
                            IDMComponent componentByName = b.getComponentByName((String) it.next());
                            if (componentByName != null) {
                                arrayList.add(componentByName);
                                JSONObject fields = componentByName.getFields();
                                if (fields != null && "true".equals(fields.get("showQuantity"))) {
                                    fields.put("showQuantity", (Object) Boolean.FALSE);
                                    z = true;
                                }
                                it.remove();
                            }
                        }
                        if (!z) {
                            return;
                        }
                        if (TBSwitchQuantitySubscriber.r(TBSwitchQuantitySubscriber.this)) {
                            TBSwitchQuantitySubscriber.s(TBSwitchQuantitySubscriber.this).e().E(2);
                        } else {
                            TBSwitchQuantitySubscriber.t(TBSwitchQuantitySubscriber.this).e().F(arrayList);
                        }
                    }
                }
            };
            ((RecyclerView) this.j.e().o()).addOnScrollListener(this.l);
            imb h0 = this.j.e().h0();
            if (h0 != null && h0.i() != null) {
                h0.i().addOnScrollListener(this.l);
            }
        }
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30fb1f0", new Object[]{this})).booleanValue();
        }
        return vav.a(c9x.CART_BIZ_NAME, "refreshAllWhenChangeQuantity", false);
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        fdv.d(lcuVar);
        if (lcuVar != null && (objArr = (Object[]) lcuVar.e("extraParams")) != null && objArr.length >= 2) {
            String valueOf = String.valueOf(objArr[1]);
            if (!TextUtils.isEmpty(valueOf)) {
                this.e.getFields().put("showQuantity", (Object) valueOf);
                this.j.e().D();
                ((ArrayList) this.m).add(this.e.getKey());
                w();
                kmb kmbVar = this.j;
                juv.a(kmbVar, "Page_ShoppingCart_Item_SwitchQuantity", vo0.b(this.e, kmbVar, "showQuantity=".concat(valueOf)));
                u();
            }
        }
    }
}
