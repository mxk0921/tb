package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.BizExtKt;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.taobao.R;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.share.business.ShareContent;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.ckf;
import tb.ic1;
import tb.jpu;
import tb.kew;
import tb.npp;
import tb.qlr;
import tb.r54;
import tb.rlr;
import tb.t2o;
import tb.xhv;
import tb.xpd;
import tb.zpp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopNewLiveLoftView implements xpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f3005a;
    public TBLiveOpenCardView b;
    public ViewGroup c;
    public ShopDataParser d;
    public xpd.a e;
    public View f;
    public FrameLayout g;
    public View h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a extends xpd.a.AbstractC1101a {
        void a();

        void onError();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements qlr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.qlr
        public void onError(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
                return;
            }
            npp.Companion.b(ckf.p("ShopNewLiveLoftView tbLiveOpenCardView onError: ", Integer.valueOf(i)));
            ShopNewLiveLoftView.c(ShopNewLiveLoftView.this);
        }

        @Override // tb.qlr
        public void onInfo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44be144f", new Object[]{this, new Integer(i)});
                return;
            }
            npp.Companion.b(ckf.p("ShopNewLiveLoftView tbLiveOpenCardView onInfo: ", Integer.valueOf(i)));
            if (i == 100005) {
                View a2 = ShopNewLiveLoftView.a(ShopNewLiveLoftView.this);
                if (a2 != null) {
                    kew.h(a2);
                }
                ShopNewLiveLoftView.b(ShopNewLiveLoftView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements rlr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.rlr
        public void onMediaError(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42ee0aa", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            npp.a aVar = npp.Companion;
            aVar.b("ShopNewLiveLoftView tbLiveOpenCardView onMediaError: " + i + ", " + i2);
            if (i == -10604) {
                ShopNewLiveLoftView.this.h();
            } else {
                ShopNewLiveLoftView.c(ShopNewLiveLoftView.this);
            }
        }

        @Override // tb.rlr
        public void onMediaInfo(long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
                return;
            }
            npp.a aVar = npp.Companion;
            aVar.b("ShopNewLiveLoftView tbLiveOpenCardView onMediaInfo: " + j + ", " + j2 + ", " + j3 + ", " + obj);
        }
    }

    static {
        t2o.a(766509193);
        t2o.a(766509126);
    }

    public static final /* synthetic */ View a(ShopNewLiveLoftView shopNewLiveLoftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("120f95eb", new Object[]{shopNewLiveLoftView});
        }
        return shopNewLiveLoftView.h;
    }

    public static final /* synthetic */ void b(ShopNewLiveLoftView shopNewLiveLoftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708b353c", new Object[]{shopNewLiveLoftView});
        } else {
            shopNewLiveLoftView.i();
        }
    }

    public static final /* synthetic */ void c(ShopNewLiveLoftView shopNewLiveLoftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c948db5", new Object[]{shopNewLiveLoftView});
        } else {
            shopNewLiveLoftView.j();
        }
    }

    public static final /* synthetic */ void d(ShopNewLiveLoftView shopNewLiveLoftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccd165c", new Object[]{shopNewLiveLoftView});
        } else {
            shopNewLiveLoftView.k();
        }
    }

    @Override // tb.xpd
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b327ac", new Object[]{this});
            return;
        }
        View inflate = View.inflate(this.f3005a, R.layout.view_tab3_live_error_layout, null);
        ((TextView) inflate.findViewById(R.id.shop_live_retry_text)).setOnClickListener(new zpp(this));
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

    public final a f() {
        xpd.a.AbstractC1101a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c46e7a5a", new Object[]{this});
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

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("916e8e6b", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            kew.h(view);
        }
        a f = f();
        if (f != null) {
            f.a();
        }
    }

    @Override // tb.xpd
    public void initWithData(Context context, JSONObject jSONObject, xpd.c cVar, xpd.a aVar) {
        String str;
        TBLiveOpenCardView tBLiveOpenCardView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e834f", new Object[]{this, context, jSONObject, cVar, aVar});
        } else if (context != null) {
            this.f3005a = context;
            this.c = new FrameLayout(context);
            this.e = aVar;
            e();
            g();
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
            TBLiveOpenCardView tBLiveOpenCardView2 = new TBLiveOpenCardView(context);
            this.b = tBLiveOpenCardView2;
            tBLiveOpenCardView2.setSubBusinessType("ShopSampleCard");
            ViewGroup viewGroup = this.c;
            ckf.d(viewGroup);
            viewGroup.addView(this.b);
            if (jSONObject == null) {
                str = null;
            } else {
                str = jSONObject.getString("coverPicUrl");
            }
            if (!TextUtils.isEmpty(str) && (tBLiveOpenCardView = this.b) != null) {
                tBLiveOpenCardView.setImageUrl(str);
            }
            TBLiveOpenCardView tBLiveOpenCardView3 = this.b;
            if (tBLiveOpenCardView3 != null) {
                tBLiveOpenCardView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            TBLiveOpenCardView tBLiveOpenCardView4 = this.b;
            if (tBLiveOpenCardView4 != null) {
                tBLiveOpenCardView4.setPlayerData(jSONObject);
            }
            TBLiveOpenCardView tBLiveOpenCardView5 = this.b;
            ckf.d(tBLiveOpenCardView5);
            tBLiveOpenCardView5.setPlayVideo(true);
            View view = new View(context);
            kew.S(view, new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, ic1.h0(new Integer[]{Integer.valueOf(Color.parseColor("#FF000000")), Integer.valueOf(Color.parseColor("#00000000"))})));
            ViewGroup viewGroup2 = this.c;
            if (viewGroup2 != null) {
                viewGroup2.addView(view, kew.j(0, kew.Q(265), 0, 0, 0, 0, 0, 125, null));
            }
        }
    }

    public final void j() {
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
        a f = f();
        if (f != null) {
            f.onError();
        }
    }

    public final void k() {
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
        r54.E(new ShopNewLiveLoftView$showLoadingView$1(this), 5000L);
    }

    @Override // tb.xpd
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveOpenCardView tBLiveOpenCardView = this.b;
        if (tBLiveOpenCardView != null) {
            tBLiveOpenCardView.setMuted(z);
        }
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
        TBLiveOpenCardView tBLiveOpenCardView = this.b;
        if (tBLiveOpenCardView != null) {
            tBLiveOpenCardView.destroy();
        }
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
        TBLiveOpenCardView tBLiveOpenCardView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        TBLiveOpenCardView tBLiveOpenCardView2 = this.b;
        if ((tBLiveOpenCardView2 == null || tBLiveOpenCardView2.isPlaying()) && (tBLiveOpenCardView = this.b) != null) {
            tBLiveOpenCardView.stopVideo();
        }
    }

    @Override // tb.xpd
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        TBLiveOpenCardView tBLiveOpenCardView = this.b;
        if (tBLiveOpenCardView == null || !tBLiveOpenCardView.isPlaying()) {
            ShopExtKt.F(this.d);
            TBLiveOpenCardView tBLiveOpenCardView2 = this.b;
            if (tBLiveOpenCardView2 != null) {
                tBLiveOpenCardView2.playVideo(new b(), new c());
            }
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }

    public final void g() {
        View K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16a1bed8", new Object[]{this});
            return;
        }
        Context context = this.f3005a;
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

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e4f5f7", new Object[]{this});
            return;
        }
        String str = null;
        View inflate = View.inflate(this.f3005a, R.layout.view_tab3_live_end_layout, null);
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
            BizExtKt.h(this.f3005a, "mtop.mediaplatform.live.getshopliveinfoList", AfcCustomSdk.SDK_VERSION, kotlin.collections.a.k(jpu.a("sellerId", str), jpu.a("pre", "true")), new ShopNewLiveLoftView$onLiveEnd$1(inflate), ShopNewLiveLoftView$onLiveEnd$2.INSTANCE, false, false, false, null, false, null, null, 8128, null);
        }
    }
}
