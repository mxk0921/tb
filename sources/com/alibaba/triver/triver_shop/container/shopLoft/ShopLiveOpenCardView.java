package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.BizExtKt;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.taobao.R;
import com.taobao.taolive.room.controller2.TBLVOpenShopCardComponent;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.share.business.ShareContent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import tb.aqp;
import tb.bia;
import tb.ckf;
import tb.eop;
import tb.g1a;
import tb.ic1;
import tb.jpu;
import tb.kew;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.xhv;
import tb.xpd;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLiveOpenCardView implements xpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f2987a;
    public TBLVOpenShopCardComponent b;
    public ViewGroup c;
    public ShopDataParser d;
    public xpd.a e;
    public View f;
    public FrameLayout g;
    public View h;
    public boolean i;
    public g1a<? super JSONObject, xhv> j;
    public boolean k;
    public final boolean l = aqp.Companion.C0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a extends xpd.a.AbstractC1101a {
        void a();

        void onError();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ShopLiveOpenCardView.d(ShopLiveOpenCardView.this);
            ShopLiveOpenCardView.this.play();
        }
    }

    static {
        t2o.a(766509144);
        t2o.a(766509126);
    }

    public static final /* synthetic */ View a(ShopLiveOpenCardView shopLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("56270abc", new Object[]{shopLiveOpenCardView});
        }
        return shopLiveOpenCardView.h;
    }

    public static final /* synthetic */ void b(ShopLiveOpenCardView shopLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa63f807", new Object[]{shopLiveOpenCardView});
        } else {
            shopLiveOpenCardView.k();
        }
    }

    public static final /* synthetic */ void c(ShopLiveOpenCardView shopLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f85aeae", new Object[]{shopLiveOpenCardView});
        } else {
            shopLiveOpenCardView.m();
        }
    }

    public static final /* synthetic */ void d(ShopLiveOpenCardView shopLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365e3ae7", new Object[]{shopLiveOpenCardView});
        } else {
            shopLiveOpenCardView.n();
        }
    }

    @Override // tb.xpd
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
        } else if (!this.i) {
            this.i = true;
            TBLVOpenShopCardComponent tBLVOpenShopCardComponent = this.b;
            if (tBLVOpenShopCardComponent != null) {
                tBLVOpenShopCardComponent.K();
            }
            npp.Companion.f("ShopLiveOpenCardView didAppear ");
        }
    }

    @Override // tb.xpd
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        this.i = false;
        TBLVOpenShopCardComponent tBLVOpenShopCardComponent = this.b;
        if (tBLVOpenShopCardComponent != null) {
            tBLVOpenShopCardComponent.L();
        }
        npp.Companion.f("ShopLiveOpenCardView didDisappear ");
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b327ac", new Object[]{this});
            return;
        }
        View inflate = View.inflate(this.f2987a, R.layout.view_tab3_live_error_layout, null);
        ((TextView) inflate.findViewById(R.id.shop_live_retry_text)).setOnClickListener(new b());
        TextView textView = (TextView) inflate.findViewById(R.id.shop_live_go_home_page_text);
        ckf.f(textView, "goHomePageText");
        kew.B(textView);
        this.f = inflate;
    }

    @Override // tb.xpd
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb77565", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public final g1a<JSONObject, xhv> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("c09f1d62", new Object[]{this});
        }
        return this.j;
    }

    @Override // tb.xpd
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        return new ShareContent();
    }

    @Override // tb.xpd
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        return "";
    }

    @Override // tb.xpd
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        return new LinkedHashMap();
    }

    @Override // tb.xpd
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            kew.h(viewGroup);
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 != null) {
            kew.Y(viewGroup2);
        }
        return this.c;
    }

    public final a h() {
        xpd.a.AbstractC1101a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d7895d1", new Object[]{this});
        }
        xpd.a aVar2 = this.e;
        if (aVar2 == null) {
            aVar = null;
        } else {
            aVar = aVar2.a(a.class.getName());
        }
        if (aVar instanceof a) {
            return (a) aVar;
        }
        return null;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("916e8e6b", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            kew.h(view);
        }
        a h = h();
        if (h != null) {
            h.a();
        }
    }

    public final void l(g1a<? super JSONObject, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba48d2f4", new Object[]{this, g1aVar});
        } else {
            this.j = g1aVar;
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed586412", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            kew.h(view);
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            View view2 = this.f;
            if (view2 != null) {
                kew.a(frameLayout, view2);
            } else {
                return;
            }
        }
        a h = h();
        if (h != null) {
            h.onError();
        }
    }

    @Override // tb.xpd
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLVOpenShopCardComponent tBLVOpenShopCardComponent = this.b;
        if (tBLVOpenShopCardComponent != null) {
            tBLVOpenShopCardComponent.T(z);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f114b", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            View view = this.h;
            if (view != null) {
                kew.a(frameLayout, view);
            } else {
                return;
            }
        }
        View view2 = this.f;
        if (view2 != null) {
            kew.h(view2);
        }
        r54.E(new ShopLiveOpenCardView$showLoadingView$1(this), 5000L);
    }

    @Override // tb.xpd
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        willDisappear();
        didDisappear();
    }

    @Override // tb.xpd
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void pause() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        this.i = false;
        try {
            willDisappear();
            didDisappear();
            TBLVOpenShopCardComponent tBLVOpenShopCardComponent = this.b;
            if (tBLVOpenShopCardComponent != null) {
                tBLVOpenShopCardComponent.q();
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    @Override // tb.xpd
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        ShopExtKt.F(this.d);
        if (!this.i) {
            willAppear();
            didAppear();
        }
        TBLVOpenShopCardComponent tBLVOpenShopCardComponent = this.b;
        if (tBLVOpenShopCardComponent != null) {
            tBLVOpenShopCardComponent.l();
        }
    }

    @Override // tb.xpd
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void willAppear() {
        TBLVOpenShopCardComponent tBLVOpenShopCardComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        } else if (!this.i && (tBLVOpenShopCardComponent = this.b) != null) {
            tBLVOpenShopCardComponent.M();
        }
    }

    @Override // tb.xpd
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
            return;
        }
        TBLVOpenShopCardComponent tBLVOpenShopCardComponent = this.b;
        if (tBLVOpenShopCardComponent != null) {
            tBLVOpenShopCardComponent.N();
        }
    }

    public final void i() {
        View K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16a1bed8", new Object[]{this});
            return;
        }
        Context context = this.f2987a;
        View view = null;
        if (!(context == null || (K = kew.K(context, R.layout.view_tab3_live_loading_layout)) == null)) {
            TUrlImageView tUrlImageView = (TUrlImageView) K.findViewById(R.id.view_tab3_live_progress_icon);
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01Lz8fBP1FtCKzfI6Ig_!!6000000000544-54-tps-72-72.apng");
                tUrlImageView.setSkipAutoSize(true);
            }
            xhv xhvVar = xhv.INSTANCE;
            view = K;
        }
        this.h = view;
    }

    @Override // tb.xpd
    public void initWithData(Context context, JSONObject jSONObject, xpd.c cVar, xpd.a aVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e834f", new Object[]{this, context, jSONObject, cVar, aVar});
        } else if (context != null) {
            npp.a aVar2 = npp.Companion;
            aVar2.f(ckf.p("ShopLiveOpenCardView initWithData ", jSONObject));
            this.f2987a = context;
            this.c = new FrameLayout(context);
            this.e = aVar;
            e();
            i();
            if (aVar != null) {
                xpd.a.AbstractC1101a a2 = aVar.a(EmbedShopLoftComponent.e.class.getName());
                if (a2 != null && (a2 instanceof EmbedShopLoftComponent.e)) {
                    this.d = ((EmbedShopLoftComponent.e) a2).e();
                }
                xpd.a.AbstractC1101a a3 = aVar.a(EmbedShopLoftComponent.d.class.getName());
                if (a3 != null && (a3 instanceof EmbedShopLoftComponent.d)) {
                    this.g = ((EmbedShopLoftComponent.d) a3).e();
                }
            }
            View view = null;
            Map t = jSONObject == null ? null : kotlin.collections.a.t(jSONObject);
            if ((jSONObject == null ? null : jSONObject.getString("liveId")) == null && t != null) {
                t.put("liveId", jSONObject.getString("id"));
            }
            if (t != null) {
                t.put("initMuteStatus", Boolean.TRUE);
            }
            ShopDataParser shopDataParser = this.d;
            String u0 = shopDataParser == null ? null : shopDataParser.u0();
            this.k = ckf.b(u0, eop.VIDEO_SHOP_2);
            aVar2.f("ShopLiveOpenCardView " + ((Object) u0) + " hideComment " + this.k);
            if (t != null) {
                t.put("shopCardDisableGoodsCard", Boolean.valueOf(this.k));
            }
            if (t != null) {
                t.put("shopCardDisableComment", Boolean.valueOf(this.k));
            }
            if (t != null) {
                t.put("liveUrlList", (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("queryParam")) == null) ? null : jSONObject2.getJSONArray("liveUrlList"));
            }
            if (t != null) {
                t.put("shopBottomOffset", Integer.valueOf(kew.p(30)));
            }
            TBLVOpenShopCardComponent tBLVOpenShopCardComponent = new TBLVOpenShopCardComponent(context, t);
            this.b = tBLVOpenShopCardComponent;
            tBLVOpenShopCardComponent.S(new TBLVOpenShopCardComponent.d() { // from class: com.alibaba.triver.triver_shop.container.shopLoft.ShopLiveOpenCardView$initWithData$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.controller2.TBLVOpenShopCardComponent.d
                public void a(TBLVOpenShopCardComponent.TBLVOpenShopCardComponentClickType tBLVOpenShopCardComponentClickType, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfc05ae", new Object[]{this, tBLVOpenShopCardComponentClickType, map});
                        return;
                    }
                    npp.Companion.f(ckf.p("ShopLiveOpenCardView onLiveComponentClick ", tBLVOpenShopCardComponentClickType));
                    Object obj = null;
                    if (tBLVOpenShopCardComponentClickType == TBLVOpenShopCardComponent.TBLVOpenShopCardComponentClickType.DEFAULT) {
                        g1a<JSONObject, xhv> g = ShopLiveOpenCardView.this.g();
                        if (g != null) {
                            g.invoke(null);
                        }
                    } else if (tBLVOpenShopCardComponentClickType == TBLVOpenShopCardComponent.TBLVOpenShopCardComponentClickType.GOODS_CARD) {
                        JSONObject jSONObject3 = new JSONObject();
                        if (map != null) {
                            for (Map.Entry<String, Object> entry : map.entrySet()) {
                                jSONObject3.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (map != null) {
                            obj = map.get("itemId");
                        }
                        jSONObject3.put(yj4.PARAM_ITEM_IDS, (Object) String.valueOf(obj));
                        jSONObject3.put(yj4.PARAM_ITEM_HOLD_TYPE, (Object) bia.UNDER_TAKE_INSIDE_DETAIL);
                        g1a<JSONObject, xhv> g2 = ShopLiveOpenCardView.this.g();
                        if (g2 != null) {
                            g2.invoke(jSONObject3);
                        }
                    }
                }

                @Override // com.taobao.taolive.room.controller2.TBLVOpenShopCardComponent.d
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c5adf9a", new Object[]{this});
                    } else if (ShopLiveOpenCardView.this.f()) {
                        r54.H(new ShopLiveOpenCardView$initWithData$2$firstVideoFrameDidRender$1(ShopLiveOpenCardView.this));
                    } else {
                        View a4 = ShopLiveOpenCardView.a(ShopLiveOpenCardView.this);
                        if (a4 != null) {
                            kew.h(a4);
                        }
                        ShopLiveOpenCardView.b(ShopLiveOpenCardView.this);
                    }
                }

                @Override // com.taobao.taolive.room.controller2.TBLVOpenShopCardComponent.d
                public void c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8b2a1024", new Object[]{this});
                    } else {
                        ShopLiveOpenCardView.this.j();
                    }
                }

                @Override // com.taobao.taolive.room.controller2.TBLVOpenShopCardComponent.d
                public void d() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("577073a", new Object[]{this});
                    } else {
                        ShopLiveOpenCardView.c(ShopLiveOpenCardView.this);
                    }
                }
            });
            ViewGroup viewGroup = this.c;
            ckf.d(viewGroup);
            TBLVOpenShopCardComponent tBLVOpenShopCardComponent2 = this.b;
            if (tBLVOpenShopCardComponent2 != null) {
                view = tBLVOpenShopCardComponent2.getView();
            }
            viewGroup.addView(view);
            View view2 = new View(context);
            kew.S(view2, new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, ic1.h0(new Integer[]{Integer.valueOf(Color.parseColor("#FF000000")), Integer.valueOf(Color.parseColor("#00000000"))})));
            ViewGroup viewGroup2 = this.c;
            if (viewGroup2 != null) {
                viewGroup2.addView(view2, kew.j(0, kew.Q(265), 0, 0, 0, 0, 0, 125, null));
            }
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e4f5f7", new Object[]{this});
            return;
        }
        String str = null;
        View inflate = View.inflate(this.f2987a, R.layout.view_tab3_live_end_layout, null);
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 != null) {
            viewGroup2.addView(inflate, kew.j(0, 0, 0, 0, 0, 0, 0, 127, null));
        }
        ShopDataParser shopDataParser = this.d;
        if (shopDataParser != null) {
            str = shopDataParser.N0();
        }
        if (str != null) {
            BizExtKt.h(this.f2987a, "mtop.mediaplatform.live.getshopliveinfoList", AfcCustomSdk.SDK_VERSION, kotlin.collections.a.k(jpu.a("sellerId", str), jpu.a("pre", "true")), new ShopLiveOpenCardView$onLiveEnd$1(inflate), ShopLiveOpenCardView$onLiveEnd$2.INSTANCE, false, false, false, null, false, null, null, 8128, null);
        }
    }
}
