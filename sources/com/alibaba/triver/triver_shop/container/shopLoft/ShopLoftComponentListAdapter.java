package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.ShopLoftActivity;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopContentRecyclerView;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentView;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import tb.a1v;
import tb.aqp;
import tb.ckf;
import tb.jpu;
import tb.kew;
import tb.kqu;
import tb.npp;
import tb.r54;
import tb.ssq;
import tb.t2o;
import tb.xhv;
import tb.xpd;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftComponentListAdapter extends RecyclerView.Adapter<ShopLoftItemViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ShopLoftItemViewHolder d;
    public List<JSONObject> e;
    public ShopLoftComponentView.a f;
    public ShopLoftComponent.c g;
    public Bundle h;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2993a = true;
    public final Set<xpd> b = new HashSet();
    public final xpd.a c = new xpd.a();
    public final boolean i = aqp.Companion.j0();
    public final long j = System.currentTimeMillis();
    public boolean k = true;
    public final ShopContentRecyclerView.b l = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class ShopLoftItemViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public xpd f2994a;
        public String b;
        public JSONObject c;
        public final View d;
        public final FrameLayout e;
        public final TUrlImageView f;
        public final TextView g;
        public final TextView h;
        public boolean i;
        public boolean j;
        public final /* synthetic */ ShopLoftComponentListAdapter k;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements xpd.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ShopLoftComponentListAdapter f2995a;
            public final /* synthetic */ ShopLoftItemViewHolder b;

            public a(ShopLoftComponentListAdapter shopLoftComponentListAdapter, ShopLoftItemViewHolder shopLoftItemViewHolder) {
                this.f2995a = shopLoftComponentListAdapter;
                this.b = shopLoftItemViewHolder;
            }

            @Override // tb.xpd.c
            public final void p(String str, JSONObject jSONObject) {
                ShopLoftComponentView.a U;
                String string;
                ShopLoftComponentView.a U2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f4d37024", new Object[]{this, str, jSONObject});
                } else if (str != null) {
                    switch (str.hashCode()) {
                        case -1830782603:
                            if (str.equals(xpd.c.EVENT_UT_PAGE_DIS_APPEAR)) {
                                UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.b.itemView.getContext());
                                return;
                            }
                            return;
                        case -1603590909:
                            if (str.equals(xpd.c.EVENT_UT_PAGE_APPEAR)) {
                                UTAnalytics.getInstance().getDefaultTracker().pageAppear(this.b.itemView.getContext());
                                return;
                            }
                            return;
                        case -1308497988:
                            if (str.equals(xpd.c.EVENT_ON_SCROLL_DISABLE) && (U = this.f2995a.U()) != null) {
                                U.b();
                                return;
                            }
                            return;
                        case -1143385942:
                            if (str.equals(xpd.c.EVENT_ON_MUTE_STATUS_CHANGED) && jSONObject != null && (string = jSONObject.getString("isMuted")) != null) {
                                ShopLoftComponentListAdapter.T(this.f2995a, ckf.b(string, "true"));
                                return;
                            }
                            return;
                        case -550425746:
                            if (str.equals(xpd.c.EVENT_ON_SHOW_BAR)) {
                                Intent intent = new Intent();
                                intent.setAction(ShopLoftActivity.KEY_SHOP_LOFT_BROADCAST_EVENT);
                                intent.putExtra("event", xpd.c.EVENT_ON_SHOW_BAR);
                                LocalBroadcastManager.getInstance(this.b.itemView.getContext()).sendBroadcastSync(intent);
                                return;
                            }
                            return;
                        case 235531827:
                            if (str.equals(xpd.c.EVENT_ON_HIDE_BAR)) {
                                Intent intent2 = new Intent();
                                intent2.setAction(ShopLoftActivity.KEY_SHOP_LOFT_BROADCAST_EVENT);
                                intent2.putExtra("event", xpd.c.EVENT_ON_HIDE_BAR);
                                LocalBroadcastManager.getInstance(this.b.itemView.getContext()).sendBroadcastSync(intent2);
                                return;
                            }
                            return;
                        case 821786159:
                            if (str.equals(xpd.c.EVENT_ON_SCROLL_ENABLE) && (U2 = this.f2995a.U()) != null) {
                                U2.a();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f2996a;
            public final /* synthetic */ FrameLayout b;

            public b(JSONObject jSONObject, FrameLayout frameLayout) {
                this.f2996a = jSONObject;
                this.b = frameLayout;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                String string = this.f2996a.getString("targetUrl");
                if (string != null) {
                    Nav.from(this.b.getContext()).toUri(string);
                }
            }
        }

        static {
            t2o.a(766509164);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShopLoftItemViewHolder(ShopLoftComponentListAdapter shopLoftComponentListAdapter, View view) {
            super(view);
            ckf.g(shopLoftComponentListAdapter, "this$0");
            this.k = shopLoftComponentListAdapter;
            TextView textView = null;
            this.d = view == null ? null : view.findViewById(R.id.second_floor_bottom_guid_container);
            this.e = view == null ? null : (FrameLayout) view.findViewById(R.id.second_floor_content_container);
            this.f = view == null ? null : (TUrlImageView) view.findViewById(R.id.second_floor_bottom_guid_image);
            this.g = view == null ? null : (TextView) view.findViewById(R.id.second_floor_bottom_guid_text_content_1);
            this.h = view != null ? (TextView) view.findViewById(R.id.second_floor_bottom_guid_text_content_2) : textView;
        }

        public static final /* synthetic */ void b0(ShopLoftItemViewHolder shopLoftItemViewHolder, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd327405", new Object[]{shopLoftItemViewHolder, str, str2, str3});
            } else {
                shopLoftItemViewHolder.q0(str, str2, str3);
            }
        }

        public static /* synthetic */ Object ipc$super(ShopLoftItemViewHolder shopLoftItemViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponentListAdapter$ShopLoftItemViewHolder");
        }

        public final View c0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("16516e20", new Object[]{this});
            }
            return this.d;
        }

        public final xpd d0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xpd) ipChange.ipc$dispatch("e5e53ac1", new Object[]{this});
            }
            return this.f2994a;
        }

        public final ShareContent e0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
            }
            xpd xpdVar = this.f2994a;
            String str = null;
            ShareContent shareContent = xpdVar == null ? null : xpdVar.getShareContent();
            if (shareContent == null) {
                return null;
            }
            Map<String, String> map = shareContent.extendParams;
            if (map == null) {
                map = new HashMap<>();
            }
            JSONObject jSONObject = this.c;
            map.put("id", jSONObject == null ? null : jSONObject.getString("id"));
            JSONObject jSONObject2 = this.c;
            if (jSONObject2 != null) {
                str = jSONObject2.getString("sceneId");
            }
            map.put("scene", str);
            shareContent.extendParams = map;
            return shareContent;
        }

        public final String f0(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("840e867d", new Object[]{this, jSONObject});
            }
            String str = null;
            if (jSONObject == null) {
                return null;
            }
            Uri.Builder buildUpon = Uri.parse(ShopLoftActivity.KEY_SHARE_URL_BASE).buildUpon();
            Bundle V = this.k.V();
            buildUpon.appendQueryParameter("seller_id", V == null ? null : V.getString("seller_id"));
            Bundle V2 = this.k.V();
            buildUpon.appendQueryParameter("shop_id", V2 == null ? null : V2.getString("shop_id"));
            buildUpon.appendQueryParameter("first_media_scene", jSONObject.getString("sceneId"));
            buildUpon.appendQueryParameter("first_media_id", jSONObject.getString("id"));
            Bundle V3 = this.k.V();
            if (V3 != null) {
                str = V3.getString("title");
            }
            buildUpon.appendQueryParameter("title", str);
            return buildUpon.build().toString();
        }

        public final Map<String, String> g0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d67c5191", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            Bundle V = this.k.V();
            String str = null;
            hashMap.put("seller_id", V == null ? null : V.getString("seller_id"));
            Bundle V2 = this.k.V();
            hashMap.put("shop_id", V2 == null ? null : V2.getString("shop_id"));
            Bundle V3 = this.k.V();
            if (V3 != null) {
                str = V3.getString("entrySpm");
            }
            hashMap.put("entrySpm", str);
            return hashMap;
        }

        public final JSONObject getData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
            }
            return this.c;
        }

        public final String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.b;
        }

        public final boolean h0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("252586c1", new Object[]{this})).booleanValue();
            }
            return ckf.b(this.b, ShopLoftViewManager.TYPE_LIVE);
        }

        public final boolean i0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("959e257c", new Object[]{this})).booleanValue();
            }
            return ckf.b(this.b, ShopLoftViewManager.TYPE_VIDEO);
        }

        public final void k0() {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
                return;
            }
            xpd xpdVar = this.f2994a;
            if (xpdVar != null) {
                xpdVar.didDisappear();
            }
            o0();
            JSONObject jSONObject = this.c;
            if (jSONObject != null) {
                jSONObject.put("alreadyLeave", (Object) "true");
                if (!ckf.b(jSONObject.getString("keepTransitionCard"), "true") && (view = this.d) != null) {
                    kew.B(view);
                }
            }
        }

        public final void l0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c7d6fb7", new Object[]{this});
                return;
            }
            xpd xpdVar = this.f2994a;
            if (xpdVar != null) {
                xpdVar.onDestroyed();
            }
            Set O = ShopLoftComponentListAdapter.O(this.k);
            xpd xpdVar2 = this.f2994a;
            if (O != null) {
                kqu.a(O).remove(xpdVar2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }

        public final void m0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
                return;
            }
            xpd xpdVar = this.f2994a;
            if (xpdVar != null) {
                xpdVar.didAppear();
            }
            xpd xpdVar2 = this.f2994a;
            if (xpdVar2 != null) {
                xpdVar2.mute(ShopLoftComponentListAdapter.P(this.k));
            }
            n0();
            if (ckf.b(this.b, ShopLoftViewManager.TYPE_LIVE)) {
                ShopLoftComponent.c a0 = this.k.a0();
                if (a0 != null) {
                    a0.a();
                    return;
                }
                return;
            }
            ShopLoftComponent.c a02 = this.k.a0();
            if (a02 != null) {
                String str = this.b;
                if (str == null) {
                    str = "";
                }
                a02.b(str);
            }
        }

        public final void n0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e933178b", new Object[]{this});
                return;
            }
            npp.a aVar = npp.Companion;
            xpd xpdVar = this.f2994a;
            aVar.a(ckf.p("pageAppear , ", xpdVar == null ? null : xpdVar.getUTPageName()));
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this.itemView.getContext());
            Map<String, String> g0 = g0();
            g0.put("spm", "a2141.25663520.0.0");
            if (i0()) {
                a1v.n("Page_Shop_2Fcontentfeed", "Page_Shop_2Fcontentfeed_video_exposure", g0);
            }
            if (h0()) {
                a1v.n("Page_Shop_2Fcontentfeed", "Page_Shop_2Fcontentfeed_live_exposure", g0);
            }
        }

        public final void o0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6c4d85b", new Object[]{this});
                return;
            }
            t0();
            npp.a aVar = npp.Companion;
            xpd xpdVar = this.f2994a;
            aVar.a(ckf.p("pageDisappear , ", xpdVar == null ? null : xpdVar.getUTPageName()));
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.itemView.getContext());
        }

        public final void p0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a880e464", new Object[]{this, new Boolean(z)});
            } else {
                this.i = z;
            }
        }

        public final void q0(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae996216", new Object[]{this, str, str2, str3});
                return;
            }
            View view = this.d;
            if (view != null) {
                kew.g0(view);
            }
            TextView textView = this.g;
            if (textView != null) {
                textView.setText(str);
            }
            TextView textView2 = this.h;
            if (textView2 != null) {
                textView2.setText(str2);
            }
            TUrlImageView tUrlImageView = this.f;
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(str3);
            }
            TUrlImageView tUrlImageView2 = this.f;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setSkipAutoSize(true);
            }
        }

        public final void t0() {
            String str;
            String string;
            JSONObject jSONObject;
            String string2;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            Map<String, String> uTProperties;
            Map<String, String> uTProperties2;
            String uTPageName;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2587d24", new Object[]{this});
                return;
            }
            xpd xpdVar = this.f2994a;
            if (!(xpdVar == null || (uTPageName = xpdVar.getUTPageName()) == null)) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(this.itemView.getContext(), uTPageName);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            xpd xpdVar2 = this.f2994a;
            if (!(xpdVar2 == null || (uTProperties2 = xpdVar2.getUTProperties()) == null)) {
                uTProperties2.putAll(g0());
                linkedHashMap.putAll(uTProperties2);
                s0(uTProperties2.get("spm-cnt"));
            }
            if (i0() && ShopLoftComponentListAdapter.M(this.k)) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(this.itemView.getContext(), "Page_Shop_2Fcontentfeed");
                HashMap hashMap = new HashMap();
                xpd xpdVar3 = this.f2994a;
                if (!(xpdVar3 == null || (uTProperties = xpdVar3.getUTProperties()) == null)) {
                    hashMap.putAll(uTProperties);
                }
                hashMap.put("spm-cnt", "a2141.25663520.0.0");
                hashMap.putAll(g0());
                linkedHashMap.putAll(hashMap);
                s0((String) hashMap.get("spm-cnt"));
            }
            JSONObject jSONObject4 = this.c;
            if (!(jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("spmParams")) == null || (jSONObject3 = jSONObject2.getJSONObject("args")) == null)) {
                linkedHashMap.putAll(r54.T(jSONObject3));
            }
            JSONObject jSONObject5 = this.c;
            if (!(jSONObject5 == null || (jSONObject = jSONObject5.getJSONObject("spmParams")) == null || (string2 = jSONObject.getString("arg1")) == null)) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(this.itemView.getContext(), string2);
            }
            linkedHashMap.put("uniqID", String.valueOf(ShopLoftComponentListAdapter.Q(this.k)));
            if (this.i) {
                str = "1";
            } else {
                str = "0";
            }
            linkedHashMap.put("is_back", str);
            String str2 = null;
            if (getAdapterPosition() == 0) {
                linkedHashMap.put("cardnum", "0");
                JSONObject jSONObject6 = this.c;
                linkedHashMap.put(yj4.PARAM_ENTRY_SOURCE, jSONObject6 == null ? null : jSONObject6.getString("source"));
            }
            JSONObject jSONObject7 = this.c;
            if (!(jSONObject7 == null || (string = jSONObject7.getString("clickid")) == null)) {
                linkedHashMap.put("clickid", string);
            }
            JSONObject jSONObject8 = this.c;
            if (jSONObject8 != null) {
                str2 = jSONObject8.getString("entryUtParam");
            }
            linkedHashMap.put("entryUtParam", str2);
            Context context = this.itemView.getContext();
            ckf.f(context, "itemView.context");
            a1v.k(context, linkedHashMap);
        }

        public final void u0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6526ff8", new Object[]{this});
                return;
            }
            xpd xpdVar = this.f2994a;
            if (xpdVar != null) {
                xpdVar.willDisappear();
            }
        }

        public final void v0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30d1baf6", new Object[]{this});
                return;
            }
            xpd xpdVar = this.f2994a;
            if (xpdVar != null) {
                xpdVar.willAppear();
            }
        }

        public final void j0(JSONObject jSONObject, boolean z, int i) {
            Object obj;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6783957c", new Object[]{this, jSONObject, new Boolean(z), new Integer(i)});
            } else if (jSONObject != null) {
                this.c = jSONObject;
                String f0 = f0(jSONObject);
                jSONObject.put((JSONObject) "listInstanceId", (String) Long.valueOf(ShopLoftComponentListAdapter.Q(this.k)));
                jSONObject.put((JSONObject) "shareUrl", f0);
                Bundle V = this.k.V();
                jSONObject.put((JSONObject) "shopId", V == null ? null : V.getString("shop_id"));
                Bundle V2 = this.k.V();
                jSONObject.put((JSONObject) "sellerId", V2 == null ? null : V2.getString("seller_id"));
                Bundle V3 = this.k.V();
                jSONObject.put((JSONObject) "sellerid", V3 == null ? null : V3.getString("seller_id"));
                Bundle V4 = this.k.V();
                jSONObject.put((JSONObject) "widgetShareParams", V4 == null ? null : V4.getString("widgetShareParams"));
                Bundle V5 = this.k.V();
                jSONObject.put((JSONObject) "entrySpm", V5 == null ? null : V5.getString("entrySpm"));
                jSONObject.put((JSONObject) "nativeIndex", (String) Integer.valueOf(getAdapterPosition()));
                this.b = ShopLoftViewManager.getTypeFromSceneId(jSONObject.getString("sceneId"));
                if (z) {
                    ShopLoftComponentListAdapter.S(this.k, h0());
                }
                jSONObject.put((JSONObject) "initMuteStatus", (String) Boolean.valueOf(ShopLoftComponentListAdapter.P(this.k)));
                if (ckf.b(ShopLoftViewManager.TYPE_MARKET, this.b) && ckf.b("13", jSONObject.getString("contentType"))) {
                    this.b = ShopLoftViewManager.TYPE_LIVE_CARD;
                } else if (ckf.b(ShopLoftViewManager.TYPE_MARKET, this.b) && ckf.b("video", jSONObject.getString("marketType"))) {
                    this.b = ShopLoftViewManager.TYPE_MARKET_VIDEO;
                }
                xpd createShopLoftViewByType = ShopLoftViewManager.createShopLoftViewByType(this.b);
                this.f2994a = createShopLoftViewByType;
                if (createShopLoftViewByType != null) {
                    ShopLoftComponentListAdapter shopLoftComponentListAdapter = this.k;
                    try {
                        npp.Companion.a(ckf.p("init with data : ", jSONObject));
                        xpd d0 = d0();
                        ckf.d(d0);
                        d0.initWithData(this.itemView.getContext(), jSONObject, new a(shopLoftComponentListAdapter, this), ShopLoftComponentListAdapter.N(shopLoftComponentListAdapter));
                        obj = Result.m1108constructorimpl(xhv.INSTANCE);
                    } catch (Throwable th) {
                        obj = Result.m1108constructorimpl(kotlin.b.a(th));
                    }
                    Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                    if (th2 != null) {
                        npp.Companion.c("init with data error : ", th2);
                    }
                    xpd xpdVar = this.f2994a;
                    ckf.d(xpdVar);
                    View view = xpdVar.getView();
                    if (view == null) {
                        npp.a aVar = npp.Companion;
                        aVar.b("loftView null , type is = " + ((Object) this.b) + " , data is = " + jSONObject);
                        return;
                    }
                    FrameLayout frameLayout = this.e;
                    if (frameLayout != null) {
                        frameLayout.removeAllViews();
                        if (ckf.b(this.b, ShopLoftViewManager.TYPE_LIVE_CARD)) {
                            frameLayout.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
                        } else {
                            frameLayout.addView(view);
                        }
                        if (ckf.b(this.b, ShopLoftViewManager.TYPE_VIDEO)) {
                            Context context = frameLayout.getContext();
                            ckf.f(context, "itemView.context");
                            frameLayout.setPadding(0, r54.n(context, kew.p(14)), 0, 0);
                        } else {
                            frameLayout.setPadding(0, 0, 0, 0);
                        }
                        if (ckf.b(this.b, ShopLoftViewManager.TYPE_LIVE) && !ckf.b("shop", jSONObject.getString("source")) && (jSONObject2 = jSONObject.getJSONObject("jumpButton")) != null) {
                            View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.view_shop_loft_back_to_shop_layout, (ViewGroup) null);
                            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.shop_loft_back_to_home_img);
                            TextView textView = (TextView) inflate.findViewById(R.id.shop_loft_back_to_home_text);
                            String string = jSONObject2.getString("iconUrl");
                            if (string != null) {
                                tUrlImageView.setImageUrl(string);
                            }
                            String string2 = jSONObject2.getString("name");
                            if (string2 != null) {
                                textView.setText(string2);
                            }
                            ViewProxy.setOnClickListener(inflate, new b(jSONObject2, frameLayout));
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kew.p(79), kew.p(25));
                            layoutParams.gravity = 8388627;
                            frameLayout.addView(inflate, layoutParams);
                        }
                    }
                    r0();
                    if (z) {
                        v0();
                        m0();
                        this.k.j0(this);
                    }
                    Set O = ShopLoftComponentListAdapter.O(this.k);
                    xpd xpdVar2 = this.f2994a;
                    ckf.d(xpdVar2);
                    O.add(xpdVar2);
                }
            }
        }

        public final void s0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd03749b", new Object[]{this, str});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(kotlin.collections.a.i(jpu.a("spm-url", str)));
            }
        }

        public final void r0() {
            String string;
            Long o;
            String string2;
            Long o2;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e47f571f", new Object[]{this});
                return;
            }
            JSONObject jSONObject = this.c;
            if (jSONObject != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("transitionCard");
                String str = null;
                boolean b2 = ckf.b("SERIAL_TYPE", jSONObject2 == null ? null : jSONObject2.getString("type"));
                boolean b3 = ckf.b("true", jSONObject.getString("alreadyShowBottomGuid"));
                if (b2) {
                    jSONObject.put((JSONObject) "keepTransitionCard", "true");
                } else if (b3) {
                    return;
                }
                String string3 = jSONObject2 == null ? null : jSONObject2.getString("iconUrl");
                String string4 = jSONObject2 == null ? null : jSONObject2.getString("content");
                long j = 5;
                if (!(jSONObject2 == null || (string2 = jSONObject2.getString("showTimeBySecond")) == null || (o2 = ssq.o(string2)) == null)) {
                    j = o2.longValue();
                }
                long longValue = (jSONObject2 == null || (string = jSONObject2.getString("waitTimeBySecond")) == null || (o = ssq.o(string)) == null) ? 0L : o.longValue();
                this.j = longValue != 0;
                if (jSONObject2 != null) {
                    str = jSONObject2.getString("subContent");
                }
                if (string3 != null && string3.length() == 0 && string4 != null && string4.length() == 0) {
                    z = true;
                }
                if (jSONObject2 == null || z || jSONObject2.isEmpty()) {
                    View view = this.d;
                    if (view != null) {
                        kew.B(view);
                    }
                } else if (this.j) {
                    r54.E(new ShopLoftComponentListAdapter$ShopLoftItemViewHolder$tryToShowTransitionCard$1(jSONObject, this.k, this, string4, str, string3, j), longValue * 1000);
                } else {
                    q0(string4, str, string3);
                    jSONObject.put((JSONObject) "alreadyShowBottomGuid", "true");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements ShopContentRecyclerView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopContentRecyclerView.b
        public void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5357fe57", new Object[]{this, viewHolder, viewHolder2});
            } else if (viewHolder2 != ShopLoftComponentListAdapter.this.W()) {
                if (viewHolder == null) {
                    viewHolder = ShopLoftComponentListAdapter.this.W();
                }
                if (viewHolder instanceof ShopLoftItemViewHolder) {
                    c(viewHolder);
                    ((ShopLoftItemViewHolder) viewHolder).k0();
                }
                if (viewHolder2 instanceof ShopLoftItemViewHolder) {
                    d(viewHolder2);
                    ShopLoftItemViewHolder shopLoftItemViewHolder = (ShopLoftItemViewHolder) viewHolder2;
                    shopLoftItemViewHolder.m0();
                    ShopLoftComponentListAdapter.this.j0(shopLoftItemViewHolder);
                    if (viewHolder == null || shopLoftItemViewHolder.getAdapterPosition() >= viewHolder.getAdapterPosition()) {
                        z = false;
                    }
                    shopLoftItemViewHolder.p0(z);
                }
            }
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopContentRecyclerView.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc4f455e", new Object[]{this});
            } else {
                ShopLoftComponentListAdapter.this.c0();
            }
        }

        public void c(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a3a3909", new Object[]{this, viewHolder});
            } else if (viewHolder instanceof ShopLoftItemViewHolder) {
                ((ShopLoftItemViewHolder) viewHolder).u0();
            }
        }

        public void d(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97f1568d", new Object[]{this, viewHolder});
            } else if (viewHolder instanceof ShopLoftItemViewHolder) {
                ((ShopLoftItemViewHolder) viewHolder).v0();
            }
        }
    }

    static {
        t2o.a(766509163);
    }

    public static final /* synthetic */ boolean M(ShopLoftComponentListAdapter shopLoftComponentListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f33d968c", new Object[]{shopLoftComponentListAdapter})).booleanValue();
        }
        return shopLoftComponentListAdapter.i;
    }

    public static final /* synthetic */ xpd.a N(ShopLoftComponentListAdapter shopLoftComponentListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpd.a) ipChange.ipc$dispatch("1fe83ad5", new Object[]{shopLoftComponentListAdapter});
        }
        return shopLoftComponentListAdapter.c;
    }

    public static final /* synthetic */ Set O(ShopLoftComponentListAdapter shopLoftComponentListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3a475d5a", new Object[]{shopLoftComponentListAdapter});
        }
        return shopLoftComponentListAdapter.b;
    }

    public static final /* synthetic */ boolean P(ShopLoftComponentListAdapter shopLoftComponentListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9292e7da", new Object[]{shopLoftComponentListAdapter})).booleanValue();
        }
        return shopLoftComponentListAdapter.k;
    }

    public static final /* synthetic */ long Q(ShopLoftComponentListAdapter shopLoftComponentListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d406abcb", new Object[]{shopLoftComponentListAdapter})).longValue();
        }
        return shopLoftComponentListAdapter.j;
    }

    public static final /* synthetic */ void S(ShopLoftComponentListAdapter shopLoftComponentListAdapter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89723350", new Object[]{shopLoftComponentListAdapter, new Boolean(z)});
        } else {
            shopLoftComponentListAdapter.b0(z);
        }
    }

    public static final /* synthetic */ void T(ShopLoftComponentListAdapter shopLoftComponentListAdapter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6663ca32", new Object[]{shopLoftComponentListAdapter, new Boolean(z)});
        } else {
            shopLoftComponentListAdapter.k = z;
        }
    }

    public static /* synthetic */ Object ipc$super(ShopLoftComponentListAdapter shopLoftComponentListAdapter, String str, Object... objArr) {
        if (str.hashCode() == 143764512) {
            super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponentListAdapter");
    }

    public final ShopLoftComponentView.a U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopLoftComponentView.a) ipChange.ipc$dispatch("7e6c0c81", new Object[]{this});
        }
        return this.f;
    }

    public final Bundle V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("673e5703", new Object[]{this});
        }
        return this.h;
    }

    public final ShopLoftItemViewHolder W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopLoftItemViewHolder) ipChange.ipc$dispatch("61c6ad65", new Object[]{this});
        }
        return this.d;
    }

    public final xpd.a X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpd.a) ipChange.ipc$dispatch("ab88fcc3", new Object[]{this});
        }
        return this.c;
    }

    public final ShareContent Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        ShopLoftItemViewHolder shopLoftItemViewHolder = this.d;
        if (shopLoftItemViewHolder == null) {
            return null;
        }
        return shopLoftItemViewHolder.e0();
    }

    public final ShopContentRecyclerView.b Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopContentRecyclerView.b) ipChange.ipc$dispatch("3ddd9d0", new Object[]{this});
        }
        return this.l;
    }

    public final ShopLoftComponent.c a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopLoftComponent.c) ipChange.ipc$dispatch("c7f46ba2", new Object[]{this});
        }
        return this.g;
    }

    public final void b0(boolean z) {
        boolean z2;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69ce372", new Object[]{this, new Boolean(z)});
            return;
        }
        Bundle bundle = this.h;
        if (bundle == null || (string = bundle.getString("initMuteStatus")) == null) {
            if (z) {
                z2 = ShopExtKt.r();
            } else {
                z2 = ShopExtKt.y();
            }
            this.k = z2;
            return;
        }
        this.k = ckf.b(string, "true");
    }

    public final void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bde401da", new Object[]{this});
            return;
        }
        Iterator it = ((HashSet) this.b).iterator();
        while (it.hasNext()) {
            ((xpd) it.next()).onPageStable();
        }
    }

    /* renamed from: d0 */
    public void onBindViewHolder(ShopLoftItemViewHolder shopLoftItemViewHolder, int i) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0290798", new Object[]{this, shopLoftItemViewHolder, new Integer(i)});
            return;
        }
        if (shopLoftItemViewHolder != null) {
            List<JSONObject> list = this.e;
            if (list == null) {
                jSONObject = null;
            } else {
                jSONObject = list.get(i);
            }
            shopLoftItemViewHolder.j0(jSONObject, this.f2993a, i);
        }
        if (this.f2993a) {
            this.f2993a = false;
        }
    }

    /* renamed from: e0 */
    public ShopLoftItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopLoftItemViewHolder) ipChange.ipc$dispatch("3bffb800", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        Context context = viewGroup.getContext();
        ckf.f(context, "parent.context");
        View K = kew.K(context, R.layout.view_second_floor_page_container);
        if (K != null) {
            K.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        if (K != null) {
            K.setBackgroundColor(-16777216);
        }
        return new ShopLoftItemViewHolder(this, K);
    }

    public final void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        Iterator it = ((HashSet) this.b).iterator();
        while (it.hasNext()) {
            try {
                ((xpd) it.next()).onDestroyed();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ((HashSet) this.b).clear();
        this.c.b();
    }

    /* renamed from: g0 */
    public void onViewRecycled(ShopLoftItemViewHolder shopLoftItemViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45712e3", new Object[]{this, shopLoftItemViewHolder});
            return;
        }
        super.onViewRecycled(shopLoftItemViewHolder);
        if (shopLoftItemViewHolder != null) {
            shopLoftItemViewHolder.l0();
        }
        npp.Companion.b("onViewRecycled");
    }

    public final List<JSONObject> getDataList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6fd2c942", new Object[]{this});
        }
        return this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<JSONObject> list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void h0(ShopLoftComponentView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5360727d", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public final void i0(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb69b0e9", new Object[]{this, bundle});
        } else {
            this.h = bundle;
        }
    }

    public final void j0(ShopLoftItemViewHolder shopLoftItemViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1510e855", new Object[]{this, shopLoftItemViewHolder});
        } else {
            this.d = shopLoftItemViewHolder;
        }
    }

    public final void k0(ShopLoftComponent.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74061232", new Object[]{this, cVar});
        } else {
            this.g = cVar;
        }
    }

    public final void setDataList(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6029d862", new Object[]{this, list});
        } else {
            this.e = list;
        }
    }
}
