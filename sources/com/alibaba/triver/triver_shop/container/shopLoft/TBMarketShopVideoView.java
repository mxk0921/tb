package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.Map;
import tb.a1v;
import tb.ckf;
import tb.fsc;
import tb.kew;
import tb.r54;
import tb.swr;
import tb.t2o;
import tb.xau;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TBMarketShopVideoView implements xpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f3009a;
    public xpd.c b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public View h;
    public FrameLayout i;
    public ImageView j;
    public FrameLayout k;
    public TextView l;
    public boolean m;
    public final swr n = new swr();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements fsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xpd.c f3010a;

        public a(xpd.c cVar) {
            this.f3010a = cVar;
        }

        @Override // tb.fsc
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f38cbe1d", new Object[]{this});
                return;
            }
            xpd.c cVar = this.f3010a;
            if (cVar != null) {
                cVar.p("onPause", null);
            }
        }
    }

    static {
        t2o.a(766509216);
        t2o.a(766509126);
    }

    public static final /* synthetic */ boolean a(TBMarketShopVideoView tBMarketShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7aca4167", new Object[]{tBMarketShopVideoView})).booleanValue();
        }
        return tBMarketShopVideoView.m;
    }

    public static final /* synthetic */ String b(TBMarketShopVideoView tBMarketShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b912048", new Object[]{tBMarketShopVideoView});
        }
        return tBMarketShopVideoView.g;
    }

    public static final /* synthetic */ String c(TBMarketShopVideoView tBMarketShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33ffbaca", new Object[]{tBMarketShopVideoView});
        }
        return tBMarketShopVideoView.c;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e136be20", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.f3009a;
        String str = null;
        this.c = jSONObject == null ? null : jSONObject.getString("videoUrl");
        JSONObject jSONObject2 = this.f3009a;
        this.d = jSONObject2 == null ? null : jSONObject2.getString("btnTitle");
        JSONObject jSONObject3 = this.f3009a;
        this.e = jSONObject3 == null ? null : jSONObject3.getString("btnColor");
        JSONObject jSONObject4 = this.f3009a;
        this.f = jSONObject4 == null ? null : jSONObject4.getString("btnTitleColor");
        JSONObject jSONObject5 = this.f3009a;
        this.g = jSONObject5 == null ? null : jSONObject5.getString("targetUrl");
        JSONObject jSONObject6 = this.f3009a;
        if (jSONObject6 != null) {
            str = jSONObject6.getString("inBigCard");
        }
        this.m = ckf.b(str, "true");
    }

    @Override // tb.xpd
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        Map<String, String> uTProperties = getUTProperties();
        if (uTProperties != null) {
            uTProperties.put("spm", "a2141.b91375813.c1638791681170.d1638791681170");
        }
        a1v.n("Page_Shop_2Fcontentfeed_marketcard", "Page_Shop_2Fcontentfeed_marketcard_exposure", uTProperties);
        play();
    }

    @Override // tb.xpd
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
        } else {
            pause();
        }
    }

    @Override // tb.xpd
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        ShareContent shareContent = new ShareContent();
        JSONObject jSONObject = this.f3009a;
        String str = null;
        shareContent.imageUrl = jSONObject == null ? null : jSONObject.getString("shareImage");
        JSONObject jSONObject2 = this.f3009a;
        shareContent.title = jSONObject2 == null ? null : jSONObject2.getString("shareTitle");
        JSONObject jSONObject3 = this.f3009a;
        if (jSONObject3 != null) {
            str = jSONObject3.getString("shareText");
        }
        shareContent.description = str;
        return shareContent;
    }

    @Override // tb.xpd
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        return "Page_Shop_2Fcontentfeed_marketcard";
    }

    @Override // tb.xpd
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = this.f3009a;
        String str = null;
        hashMap.put("shop_id", jSONObject == null ? null : jSONObject.getString("shopId"));
        JSONObject jSONObject2 = this.f3009a;
        hashMap.put("seller_id", jSONObject2 == null ? null : jSONObject2.getString("sellerId"));
        JSONObject jSONObject3 = this.f3009a;
        hashMap.put("videoid", jSONObject3 == null ? null : jSONObject3.getString("id"));
        JSONObject jSONObject4 = this.f3009a;
        if (jSONObject4 != null) {
            str = jSONObject4.getString("id");
        }
        hashMap.put(xau.PROPERTY_VIDEO_ID, str);
        hashMap.put("spm-cnt", "a2141.b91375813.0.0");
        hashMap.put("tag", "2FMarket");
        return hashMap;
    }

    @Override // tb.xpd
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.xpd
    public void initWithData(Context context, JSONObject jSONObject, xpd.c cVar, xpd.a aVar) {
        FrameLayout frameLayout;
        ImageView imageView;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e834f", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        this.f3009a = jSONObject;
        this.b = cVar;
        d();
        TextView textView = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_market_loft_view, (ViewGroup) null);
        this.h = inflate;
        if (inflate == null) {
            frameLayout = null;
        } else {
            frameLayout = (FrameLayout) inflate.findViewById(R.id.shop_loft_market_video_container);
        }
        this.i = frameLayout;
        View view = this.h;
        if (view == null) {
            imageView = null;
        } else {
            imageView = (ImageView) view.findViewById(R.id.shop_loft_market_image);
        }
        this.j = imageView;
        View view2 = this.h;
        if (view2 == null) {
            frameLayout2 = null;
        } else {
            frameLayout2 = (FrameLayout) view2.findViewById(R.id.shop_loft_market_button);
        }
        this.k = frameLayout2;
        View view3 = this.h;
        if (view3 != null) {
            textView = (TextView) view3.findViewById(R.id.shop_loft_market_button_text);
        }
        this.l = textView;
        FrameLayout frameLayout4 = this.i;
        if (frameLayout4 != null) {
            kew.g0(frameLayout4);
        }
        ImageView imageView2 = this.j;
        if (imageView2 != null) {
            kew.C(imageView2);
        }
        this.n.b(context, new TBMarketShopVideoView$initWithData$1(this));
        this.n.q(new a(cVar));
        FrameLayout frameLayout5 = this.i;
        if (frameLayout5 != null) {
            frameLayout5.addView(this.n.f());
        }
        FrameLayout frameLayout6 = this.k;
        if (frameLayout6 != null) {
            frameLayout6.setOnClickListener(new b(context, this));
        }
        TextView textView2 = this.l;
        if (textView2 != null) {
            if (TextUtils.isEmpty(this.d)) {
                FrameLayout frameLayout7 = this.k;
                if (frameLayout7 != null) {
                    kew.C(frameLayout7);
                }
            } else {
                textView2.setText(this.d);
                textView2.setTextColor(Color.parseColor(this.f));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(kew.p(Float.valueOf(25.0f)));
                gradientDrawable.setColor(Color.parseColor(this.e));
                gradientDrawable.setStroke(kew.p(Double.valueOf(1.5d)), Color.parseColor("#37FFFFFF"));
                textView2.setBackground(gradientDrawable);
            }
        }
        if (this.m && (frameLayout3 = this.k) != null) {
            kew.B(frameLayout3);
        }
    }

    @Override // tb.xpd
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        } else {
            this.n.i(z);
        }
    }

    @Override // tb.xpd
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        } else {
            this.n.j();
        }
    }

    @Override // tb.xpd
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        } else {
            this.n.r();
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
        this.n.j();
        this.n.d();
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.n.j();
        }
    }

    @Override // tb.xpd
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            this.n.r();
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3011a;
        public final /* synthetic */ TBMarketShopVideoView b;

        public b(Context context, TBMarketShopVideoView tBMarketShopVideoView) {
            this.f3011a = context;
            this.b = tBMarketShopVideoView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!r54.f(this.f3011a, TBMarketShopVideoView.b(this.b))) {
                Map<String, String> uTProperties = this.b.getUTProperties();
                ckf.d(uTProperties);
                uTProperties.put("spm", "a2141.b91375813.c1638791741528.d1638791741528");
                a1v.m("Page_Shop_2Fcontentfeed_marketcard", "Page_Shop_2Fcontentfeed_marketcard_click", uTProperties);
                Bundle bundle = new Bundle();
                bundle.putBoolean("triver_close_activity_animation", true);
                Nav.from(this.f3011a).withExtras(bundle).withFlags(65536).toUri(TBMarketShopVideoView.b(this.b));
            }
        }
    }
}
