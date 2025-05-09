package com.alibaba.android.icart.core.event;

import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.cb4;
import tb.gsb;
import tb.imb;
import tb.lcu;
import tb.lmb;
import tb.na3;
import tb.t2o;
import tb.zxb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CartGroupInitSubscribe extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RecyclerView.OnScrollListener l;
    public RecyclerView.OnItemTouchListener m;
    public boolean n;
    public float o;
    public float p;
    public imb.b q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements imb.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f2194a;

        public a(RecyclerView recyclerView) {
            this.f2194a = recyclerView;
        }

        @Override // tb.imb.b
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
                return;
            }
            this.f2194a.removeOnItemTouchListener(CartGroupInitSubscribe.v(CartGroupInitSubscribe.this));
            this.f2194a.removeOnScrollListener(CartGroupInitSubscribe.w(CartGroupInitSubscribe.this));
            CartGroupInitSubscribe.x(CartGroupInitSubscribe.this, false);
        }

        @Override // tb.imb.b
        public void onShow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(479199381);
    }

    public static /* synthetic */ Object ipc$super(CartGroupInitSubscribe cartGroupInitSubscribe, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartGroupInitSubscribe");
    }

    public static /* synthetic */ float p(CartGroupInitSubscribe cartGroupInitSubscribe) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e73e121", new Object[]{cartGroupInitSubscribe})).floatValue();
        }
        return cartGroupInitSubscribe.p;
    }

    public static /* synthetic */ float q(CartGroupInitSubscribe cartGroupInitSubscribe, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("678ba421", new Object[]{cartGroupInitSubscribe, new Float(f)})).floatValue();
        }
        cartGroupInitSubscribe.p = f;
        return f;
    }

    public static /* synthetic */ void r(CartGroupInitSubscribe cartGroupInitSubscribe, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a15a8744", new Object[]{cartGroupInitSubscribe, new Boolean(z)});
        } else {
            cartGroupInitSubscribe.y(z);
        }
    }

    public static /* synthetic */ float s(CartGroupInitSubscribe cartGroupInitSubscribe) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("574fd9df", new Object[]{cartGroupInitSubscribe})).floatValue();
        }
        return cartGroupInitSubscribe.o;
    }

    public static /* synthetic */ float t(CartGroupInitSubscribe cartGroupInitSubscribe, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a2ec323", new Object[]{cartGroupInitSubscribe, new Float(f)})).floatValue();
        }
        cartGroupInitSubscribe.o = f;
        return f;
    }

    public static /* synthetic */ zxb u(CartGroupInitSubscribe cartGroupInitSubscribe) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("74666e3c", new Object[]{cartGroupInitSubscribe});
        }
        return cartGroupInitSubscribe.k;
    }

    public static /* synthetic */ RecyclerView.OnItemTouchListener v(CartGroupInitSubscribe cartGroupInitSubscribe) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnItemTouchListener) ipChange.ipc$dispatch("522783d7", new Object[]{cartGroupInitSubscribe});
        }
        return cartGroupInitSubscribe.m;
    }

    public static /* synthetic */ RecyclerView.OnScrollListener w(CartGroupInitSubscribe cartGroupInitSubscribe) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("271fcb1f", new Object[]{cartGroupInitSubscribe});
        }
        return cartGroupInitSubscribe.l;
    }

    public static /* synthetic */ boolean x(CartGroupInitSubscribe cartGroupInitSubscribe, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f754c4f", new Object[]{cartGroupInitSubscribe, new Boolean(z)})).booleanValue();
        }
        cartGroupInitSubscribe.n = z;
        return z;
    }

    public final void y(boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9946f1c6", new Object[]{this, new Boolean(z)});
            return;
        }
        DataBizContext.CartGroupContext h = this.k.B().h();
        if (h.getIsRecommendTitleShow() != z) {
            h.setIsRecommendTitleShow(z);
            z2 = true;
        }
        if (!h.isHandleExpanded() && h.getIsExpanded() != z) {
            h.setIsExpanded(z);
            z2 = true;
        }
        if (z2) {
            this.j.e().h0().c(1);
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
            return;
        }
        imb h0 = this.j.e().h0();
        RecyclerView i = h0.i();
        if (this.l == null) {
            this.l = new RecyclerView.OnScrollListener() { // from class: com.alibaba.android.icart.core.event.CartGroupInitSubscribe.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartGroupInitSubscribe$1");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i2)});
                    } else if (((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition() <= 1 && CartGroupInitSubscribe.p(CartGroupInitSubscribe.this) > 0.0f) {
                        CartGroupInitSubscribe.r(CartGroupInitSubscribe.this, true);
                    }
                }
            };
        }
        if (this.m == null) {
            this.m = new RecyclerView.OnItemTouchListener() { // from class: com.alibaba.android.icart.core.event.CartGroupInitSubscribe.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
                public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("35491ccb", new Object[]{this, recyclerView, motionEvent})).booleanValue();
                    }
                    if (motionEvent.getAction() == 0) {
                        CartGroupInitSubscribe.t(CartGroupInitSubscribe.this, motionEvent.getRawY());
                    }
                    CartGroupInitSubscribe.q(CartGroupInitSubscribe.this, motionEvent.getRawY() - CartGroupInitSubscribe.s(CartGroupInitSubscribe.this));
                    DataBizContext.CartGroupContext h = CartGroupInitSubscribe.u(CartGroupInitSubscribe.this).B().h();
                    if (CartGroupInitSubscribe.p(CartGroupInitSubscribe.this) < 0.0f && h != null) {
                        CartGroupInitSubscribe.r(CartGroupInitSubscribe.this, false);
                    }
                    return false;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
                public void onRequestDisallowInterceptTouchEvent(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c1dcb2bb", new Object[]{this, new Boolean(z)});
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
                public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d4838b0b", new Object[]{this, recyclerView, motionEvent});
                    }
                }
            };
        }
        if (this.q == null) {
            this.q = new a(i);
        }
        if (!this.n) {
            i.addOnScrollListener(this.l);
            i.addOnItemTouchListener(this.m);
            h0.h(this.q);
            this.n = true;
        }
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
        } else if (this.e != null) {
            DataBizContext B = this.k.B();
            DataBizContext.CartGroupContext cartGroupContext = new DataBizContext.CartGroupContext();
            B.I(cartGroupContext);
            for (gsb gsbVar : (List) lcuVar.e("events")) {
                if (TextUtils.equals(gsbVar.getType(), "popupQuery")) {
                    cartGroupContext.setDefaultFilterItem(gsbVar.getFields().getString("filterItem"));
                } else if (TextUtils.equals(gsbVar.getType(), "openPopupWindow")) {
                    for (IDMComponent iDMComponent : cb4.B(this.k, gsbVar)) {
                        if (TextUtils.equals("groupRecommendTab", iDMComponent.getTag())) {
                            B.o(iDMComponent.getKey()).c(0);
                            iDMComponent.getData().put("status", (Object) "hidden");
                        } else if (TextUtils.equals(na3.sKeyTagGroupExtendBody, iDMComponent.getTag())) {
                            iDMComponent.getFields().clear();
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if ("bundleHeader".equals(this.e.getTag())) {
                ArrayList arrayList2 = new ArrayList();
                cb4.h(arrayList2, cb4.o(this.e));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    IDMComponent iDMComponent2 = (IDMComponent) it.next();
                    if ("item".equals(iDMComponent2.getTag())) {
                        arrayList.add(iDMComponent2.getKey());
                    }
                }
                cartGroupContext.setName(this.e.getFields().getString("title"));
                Object obj = this.e.getExtMap().get("type");
                cartGroupContext.setType(obj instanceof Integer ? Integer.parseInt(obj.toString()) : 1);
            } else {
                if ("empty".equals(this.e.getTag()) || "createGroup".equals(this.e.getTag())) {
                    cartGroupContext.setType(2);
                }
                cartGroupContext.setName(Localization.q(R.string.taobao_app_1028_1_21668));
            }
            cartGroupContext.setTriggerComponentKey(this.e.getKey());
            cartGroupContext.setItems(arrayList);
            cartGroupContext.setIsExpanded(true);
            cartGroupContext.setIsRecommendTitleShow(true);
            cartGroupContext.setOriginItems(arrayList);
            z();
        }
    }
}
