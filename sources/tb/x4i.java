package tb;

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
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.MediaType;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.taobao.R;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class x4i implements xpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f31140a;
    public JSONObject b;
    public xpd.c c;
    public MediaPlayCenter d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public View j;
    public FrameLayout k;
    public ImageView l;
    public FrameLayout m;
    public TextView n;
    public boolean o;

    static {
        t2o.a(766509133);
        t2o.a(766509126);
    }

    public static final /* synthetic */ xpd.c a(x4i x4iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpd.c) ipChange.ipc$dispatch("63e578bc", new Object[]{x4iVar});
        }
        return x4iVar.c;
    }

    public static final /* synthetic */ String b(x4i x4iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc6836fd", new Object[]{x4iVar});
        }
        return x4iVar.i;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e136be20", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.b;
        String str = null;
        this.e = jSONObject == null ? null : jSONObject.getString("videoUrl");
        JSONObject jSONObject2 = this.b;
        this.f = jSONObject2 == null ? null : jSONObject2.getString("btnTitle");
        JSONObject jSONObject3 = this.b;
        this.g = jSONObject3 == null ? null : jSONObject3.getString("btnColor");
        JSONObject jSONObject4 = this.b;
        this.h = jSONObject4 == null ? null : jSONObject4.getString("btnTitleColor");
        JSONObject jSONObject5 = this.b;
        this.i = jSONObject5 == null ? null : jSONObject5.getString("targetUrl");
        JSONObject jSONObject6 = this.b;
        if (jSONObject6 != null) {
            str = jSONObject6.getString("inBigCard");
        }
        this.o = ckf.b(str, "true");
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
        JSONObject jSONObject = this.b;
        String str = null;
        shareContent.imageUrl = jSONObject == null ? null : jSONObject.getString("shareImage");
        JSONObject jSONObject2 = this.b;
        shareContent.title = jSONObject2 == null ? null : jSONObject2.getString("shareTitle");
        JSONObject jSONObject3 = this.b;
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
        JSONObject jSONObject = this.b;
        String str = null;
        hashMap.put("shop_id", jSONObject == null ? null : jSONObject.getString("shopId"));
        JSONObject jSONObject2 = this.b;
        hashMap.put("seller_id", jSONObject2 == null ? null : jSONObject2.getString("sellerId"));
        JSONObject jSONObject3 = this.b;
        hashMap.put("videoid", jSONObject3 == null ? null : jSONObject3.getString("id"));
        JSONObject jSONObject4 = this.b;
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
        return this.j;
    }

    @Override // tb.xpd
    public void initWithData(Context context, JSONObject jSONObject, xpd.c cVar, xpd.a aVar) {
        FrameLayout frameLayout;
        ImageView imageView;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        View view;
        FrameLayout frameLayout4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e834f", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        this.f31140a = context;
        this.b = jSONObject;
        this.c = cVar;
        d();
        TextView textView = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_market_loft_view, (ViewGroup) null);
        this.j = inflate;
        if (inflate == null) {
            frameLayout = null;
        } else {
            frameLayout = (FrameLayout) inflate.findViewById(R.id.shop_loft_market_video_container);
        }
        this.k = frameLayout;
        View view2 = this.j;
        if (view2 == null) {
            imageView = null;
        } else {
            imageView = (ImageView) view2.findViewById(R.id.shop_loft_market_image);
        }
        this.l = imageView;
        View view3 = this.j;
        if (view3 == null) {
            frameLayout2 = null;
        } else {
            frameLayout2 = (FrameLayout) view3.findViewById(R.id.shop_loft_market_button);
        }
        this.m = frameLayout2;
        View view4 = this.j;
        if (view4 != null) {
            textView = (TextView) view4.findViewById(R.id.shop_loft_market_button_text);
        }
        this.n = textView;
        FrameLayout frameLayout5 = this.k;
        if (frameLayout5 != null) {
            kew.g0(frameLayout5);
        }
        ImageView imageView2 = this.l;
        if (imageView2 != null) {
            kew.C(imageView2);
        }
        c();
        MediaPlayCenter mediaPlayCenter = this.d;
        if (!(mediaPlayCenter == null || (view = mediaPlayCenter.getView()) == null || (frameLayout4 = this.k) == null)) {
            frameLayout4.addView(view);
        }
        FrameLayout frameLayout6 = this.m;
        if (frameLayout6 != null) {
            frameLayout6.setOnClickListener(new a(context, this));
        }
        TextView textView2 = this.n;
        if (textView2 != null) {
            if (TextUtils.isEmpty(this.f)) {
                FrameLayout frameLayout7 = this.m;
                if (frameLayout7 != null) {
                    kew.C(frameLayout7);
                }
            } else {
                textView2.setText(this.f);
                textView2.setTextColor(Color.parseColor(this.h));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(kew.p(Float.valueOf(25.0f)));
                gradientDrawable.setColor(Color.parseColor(this.g));
                gradientDrawable.setStroke(kew.p(Double.valueOf(1.5d)), Color.parseColor("#37FFFFFF"));
                textView2.setBackground(gradientDrawable);
            }
        }
        if (this.o && (frameLayout3 = this.m) != null) {
            kew.B(frameLayout3);
        }
    }

    @Override // tb.xpd
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.d;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.mute(z);
        }
    }

    @Override // tb.xpd
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.d;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.pause();
        }
    }

    @Override // tb.xpd
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.d;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.start();
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
        MediaPlayCenter mediaPlayCenter = this.d;
        if (mediaPlayCenter != null) {
            ckf.d(mediaPlayCenter);
            mediaPlayCenter.pause();
            MediaPlayCenter mediaPlayCenter2 = this.d;
            ckf.d(mediaPlayCenter2);
            mediaPlayCenter2.release();
            MediaPlayCenter mediaPlayCenter3 = this.d;
            ckf.d(mediaPlayCenter3);
            mediaPlayCenter3.destroy();
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.d;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.pause();
        }
    }

    @Override // tb.xpd
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.d;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.start();
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
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f31141a;
        public final /* synthetic */ x4i b;

        public a(Context context, x4i x4iVar) {
            this.f31141a = context;
            this.b = x4iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!r54.f(this.f31141a, x4i.b(this.b))) {
                Map<String, String> uTProperties = this.b.getUTProperties();
                ckf.d(uTProperties);
                uTProperties.put("spm", "a2141.b91375813.c1638791741528.d1638791741528");
                a1v.m("Page_Shop_2Fcontentfeed_marketcard", "Page_Shop_2Fcontentfeed_marketcard_click", uTProperties);
                Bundle bundle = new Bundle();
                bundle.putBoolean("triver_close_activity_animation", true);
                Nav.from(this.f31141a).withExtras(bundle).withFlags(65536).toUri(x4i.b(this.b));
            }
        }
    }

    public final void c() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23416bc", new Object[]{this});
            return;
        }
        String str = this.e;
        MediaPlayCenter mediaPlayCenter = new MediaPlayCenter(this.f31140a);
        this.d = mediaPlayCenter;
        mediaPlayCenter.setMediaUrl(str);
        MediaPlayCenter mediaPlayCenter2 = this.d;
        ckf.d(mediaPlayCenter2);
        mediaPlayCenter2.setMediaType(MediaType.VIDEO);
        MediaPlayCenter mediaPlayCenter3 = this.d;
        ckf.d(mediaPlayCenter3);
        mediaPlayCenter3.setConfigGroup("DW");
        MediaPlayCenter mediaPlayCenter4 = this.d;
        ckf.d(mediaPlayCenter4);
        mediaPlayCenter4.setNeedPlayControlView(false);
        MediaPlayCenter mediaPlayCenter5 = this.d;
        ckf.d(mediaPlayCenter5);
        mediaPlayCenter5.hideController();
        MediaPlayCenter mediaPlayCenter6 = this.d;
        ckf.d(mediaPlayCenter6);
        mediaPlayCenter6.setBusinessId("shop_mini_video");
        MediaPlayCenter mediaPlayCenter7 = this.d;
        ckf.d(mediaPlayCenter7);
        mediaPlayCenter7.setMediaSource("CDNVideo");
        MediaPlayCenter mediaPlayCenter8 = this.d;
        ckf.d(mediaPlayCenter8);
        mediaPlayCenter8.setPlayerType(3);
        MediaPlayCenter mediaPlayCenter9 = this.d;
        ckf.d(mediaPlayCenter9);
        mediaPlayCenter9.setScenarioType(0);
        MediaPlayCenter mediaPlayCenter10 = this.d;
        ckf.d(mediaPlayCenter10);
        mediaPlayCenter10.setVideoLoop(true);
        MediaPlayCenter mediaPlayCenter11 = this.d;
        ckf.d(mediaPlayCenter11);
        mediaPlayCenter11.setMediaAspectRatio(MediaAspectRatio.DW_FIT_CENTER);
        if (this.o) {
            MediaPlayCenter mediaPlayCenter12 = this.d;
            ckf.d(mediaPlayCenter12);
            mediaPlayCenter12.setMediaAspectRatio(MediaAspectRatio.DW_CENTER_CROP);
        }
        try {
            MediaPlayCenter mediaPlayCenter13 = this.d;
            ckf.d(mediaPlayCenter13);
            mediaPlayCenter13.setVideoRecycleListener(new w4i(this));
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        npp.Companion.d(Result.m1111exceptionOrNullimpl(obj));
        MediaPlayCenter mediaPlayCenter14 = this.d;
        ckf.d(mediaPlayCenter14);
        mediaPlayCenter14.setup();
    }
}
