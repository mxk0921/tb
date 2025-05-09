package com.alibaba.triver.triver_shop.container.shopLoft;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentListAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.npp;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftComponent$requestListData$1 extends Lambda implements g1a<JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopLoftComponent this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent$requestListData$1$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass3 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ShopLoftComponentListAdapter.ShopLoftItemViewHolder $currentHolder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ShopLoftComponentListAdapter.ShopLoftItemViewHolder shopLoftItemViewHolder) {
            super(0);
            this.$currentHolder = shopLoftItemViewHolder;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponent$requestListData$1$3");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            ShopLoftComponentListAdapter.ShopLoftItemViewHolder shopLoftItemViewHolder = this.$currentHolder;
            if (shopLoftItemViewHolder != null) {
                shopLoftItemViewHolder.r0();
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent$requestListData$1$4  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass4 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ArrayList<JSONObject> $newData;
        public final /* synthetic */ ShopLoftComponent this$0;

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent$requestListData$1$4$1  reason: invalid class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ ShopLoftComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ShopLoftComponent shopLoftComponent) {
                super(0);
                this.this$0 = shopLoftComponent;
            }

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponent$requestListData$1$4$1");
            }

            @Override // tb.d1a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                    return;
                }
                ShopLoftComponentView e = ShopLoftComponent.e(this.this$0);
                if (e != null) {
                    e.onLoadNewData();
                } else {
                    ckf.y("componentView");
                    throw null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ShopLoftComponent shopLoftComponent, ArrayList<JSONObject> arrayList) {
            super(0);
            this.this$0 = shopLoftComponent;
            this.$newData = arrayList;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponent$requestListData$1$4");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            List<JSONObject> dataList = ShopLoftComponent.a(this.this$0).getDataList();
            int size = dataList == null ? 0 : dataList.size();
            if (size - 1 >= 0) {
                i = size;
            }
            List<JSONObject> dataList2 = ShopLoftComponent.a(this.this$0).getDataList();
            if (dataList2 != null) {
                dataList2.addAll(this.$newData);
            }
            ShopLoftComponent.a(this.this$0).notifyItemInserted(i);
            r54.F(new AnonymousClass1(this.this$0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftComponent$requestListData$1(ShopLoftComponent shopLoftComponent) {
        super(1);
        this.this$0 = shopLoftComponent;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftComponent$requestListData$1 shopLoftComponent$requestListData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponent$requestListData$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        ShopLoftComponent.a w;
        JSONObject jSONObject2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
            return;
        }
        boolean h = ShopLoftComponent.h(this.this$0);
        ShopLoftComponent.q(this.this$0, false);
        if (jSONObject == null || jSONObject.isEmpty()) {
            if (h && !ShopLoftComponent.i(this.this$0) && (w = this.this$0.w()) != null) {
                w.b(h);
            }
            npp.Companion.b("shop loft request no data");
            return;
        }
        ShopLoftComponent shopLoftComponent = this.this$0;
        ShopLoftComponent.s(shopLoftComponent, ShopLoftComponent.j(shopLoftComponent) + 1);
        if (ShopLoftComponent.n(this.this$0)) {
            JSONObject jSONObject3 = new JSONObject();
            Object obj = jSONObject.get("data");
            if (obj instanceof JSONObject) {
                jSONObject3 = obj;
            }
            JSONObject jSONObject4 = new JSONObject();
            Object obj2 = jSONObject3.get("data");
            if (obj2 instanceof JSONObject) {
                jSONObject4 = obj2;
            }
            jSONObject2 = jSONObject4;
        } else {
            JSONObject jSONObject5 = new JSONObject();
            Object obj3 = jSONObject.get("data");
            if (obj3 instanceof JSONObject) {
                jSONObject5 = obj3;
            }
            jSONObject2 = jSONObject5;
        }
        ShopLoftComponent.r(this.this$0, ckf.b("true", jSONObject2.getString("hasNext")));
        JSONArray jSONArray = new JSONArray();
        Object obj4 = jSONObject2.get("list");
        if (obj4 instanceof JSONArray) {
            jSONArray = obj4;
        }
        JSONArray jSONArray2 = jSONArray;
        ShopLoftComponent shopLoftComponent2 = this.this$0;
        JSONObject jSONObject6 = jSONObject2.getJSONObject("commonData");
        ShopLoftComponent.t(shopLoftComponent2, jSONObject6 == null ? null : jSONObject6.getString("pvUuid"));
        ShopLoftComponent shopLoftComponent3 = this.this$0;
        JSONObject jSONObject7 = jSONObject2.getJSONObject("commonData");
        shopLoftComponent3.P(jSONObject7 == null ? null : jSONObject7.getJSONObject("shareParams"));
        JSONObject jSONObject8 = jSONObject2.getJSONObject("commonData");
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        if (!jSONArray2.isEmpty() || ShopLoftComponent.i(this.this$0)) {
            Iterator<Object> it = jSONArray2.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    ((Map) next).put("commonData", jSONObject8);
                    JSONObject jSONObject9 = (JSONObject) next;
                    jSONObject9.put("entryUtParam", (Object) ShopLoftComponent.f(this.this$0));
                    jSONObject9.put("clickid", (Object) ShopLoftComponent.d(this.this$0));
                    String k = ShopLoftComponent.k(this.this$0);
                    if (k != null) {
                        jSONObject9.put("pvUuid", (Object) k);
                    }
                    if (i == 0 && !ShopLoftComponent.b(this.this$0)) {
                        JSONObject g = ShopLoftComponent.g(this.this$0);
                        if (g != null) {
                            jSONObject9.putAll(g);
                        }
                        ShopLoftComponent.p(this.this$0, true);
                    }
                    if (ShopLoftComponent.i(this.this$0)) {
                        String string = jSONObject9.getString("id");
                        JSONObject l = ShopLoftComponent.l(this.this$0);
                        if (ckf.b(string, l == null ? null : l.getString("id"))) {
                            i++;
                            JSONObject l2 = ShopLoftComponent.l(this.this$0);
                            if (l2 != null) {
                                l2.put("spmParams", jSONObject9.get("spmParams"));
                            }
                            JSONObject l3 = ShopLoftComponent.l(this.this$0);
                            if (l3 != null) {
                                l3.put("transitionCard", jSONObject9.get("transitionCard"));
                            }
                            z = true;
                        }
                    }
                    jSONObject9.put("source", (Object) ShopLoftComponent.m(this.this$0));
                    arrayList.add(next);
                }
                i++;
            }
            if (z) {
                ShopLoftComponentListAdapter.ShopLoftItemViewHolder W = ShopLoftComponent.a(this.this$0).W();
                if ((W == null ? null : W.getData()) == ShopLoftComponent.l(this.this$0)) {
                    npp.Companion.b("needRefreshFirstPageTransitionCard");
                    r54.C(new AnonymousClass3(W));
                }
            }
            if (arrayList.size() != 0) {
                ShopLoftComponent.a w2 = this.this$0.w();
                if (w2 != null) {
                    w2.c(arrayList);
                }
                JSONObject jSONObject10 = arrayList.get(arrayList.size() - 1);
                ckf.f(jSONObject10, "newData[newData.size - 1]");
                JSONObject jSONObject11 = jSONObject10;
                String string2 = jSONObject11.getString("sceneId");
                boolean b = ckf.b("13", jSONObject11.getString("contentType"));
                if (ShopLoftViewManager.isMarketType(string2) && b) {
                    ShopLoftComponentView e = ShopLoftComponent.e(this.this$0);
                    if (e != null) {
                        e.setLastItemIsLiveCard(true);
                    } else {
                        ckf.y("componentView");
                        throw null;
                    }
                }
                r54.C(new AnonymousClass4(this.this$0, arrayList));
                return;
            }
            return;
        }
        ShopLoftComponent.a w3 = this.this$0.w();
        if (w3 != null) {
            w3.b(h);
        }
        npp.Companion.b("shop loft request list is empty");
    }
}
