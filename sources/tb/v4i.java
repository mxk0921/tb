package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.Map;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class v4i implements xpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f29778a;
    public JSONObject b;
    public xpd.c c;
    public String d;
    public String e;
    public String f;
    public TUrlImageView g;
    public TextView h;
    public FrameLayout i;
    public View j;
    public String k;
    public String l;
    public String m;
    public boolean n;

    static {
        t2o.a(766509131);
        t2o.a(766509126);
    }

    public static final /* synthetic */ Context a(v4i v4iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e2665e6f", new Object[]{v4iVar});
        }
        return v4iVar.f29778a;
    }

    public static final /* synthetic */ String b(v4i v4iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("174539fa", new Object[]{v4iVar});
        }
        return v4iVar.f;
    }

    public final void c() {
        TUrlImageView tUrlImageView;
        TextView textView;
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        d();
        Context context = this.f29778a;
        if (context != null) {
            FrameLayout frameLayout2 = null;
            View inflate = LayoutInflater.from(context).inflate(R.layout.view_market_loft_view, (ViewGroup) null);
            this.j = inflate;
            if (inflate == null) {
                tUrlImageView = null;
            } else {
                tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.shop_loft_market_image);
            }
            this.g = tUrlImageView;
            View view = this.j;
            if (view == null) {
                textView = null;
            } else {
                textView = (TextView) view.findViewById(R.id.shop_loft_market_button_text);
            }
            this.h = textView;
            View view2 = this.j;
            if (view2 != null) {
                frameLayout2 = (FrameLayout) view2.findViewById(R.id.shop_loft_market_button);
            }
            this.i = frameLayout2;
            if (frameLayout2 != null) {
                frameLayout2.setOnClickListener(new u4i(this));
            }
            if (this.n) {
                TUrlImageView tUrlImageView2 = this.g;
                if (tUrlImageView2 != null) {
                    tUrlImageView2.setImageUrl(this.e);
                }
            } else {
                TUrlImageView tUrlImageView3 = this.g;
                if (tUrlImageView3 != null) {
                    tUrlImageView3.setImageUrl(this.d);
                }
            }
            TextView textView2 = this.h;
            if (textView2 != null) {
                if (TextUtils.isEmpty(this.k)) {
                    FrameLayout frameLayout3 = this.i;
                    if (frameLayout3 != null) {
                        kew.C(frameLayout3);
                    }
                } else {
                    textView2.setText(this.k);
                    textView2.setTextColor(Color.parseColor(this.l));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(kew.p(Float.valueOf(25.0f)));
                    gradientDrawable.setColor(Color.parseColor(this.m));
                    gradientDrawable.setStroke(kew.p(Double.valueOf(1.5d)), Color.parseColor("#37FFFFFF"));
                    textView2.setBackground(gradientDrawable);
                }
            }
            if (this.n && (frameLayout = this.i) != null) {
                kew.B(frameLayout);
            }
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e136be20", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.b;
        String str = null;
        this.d = jSONObject == null ? null : jSONObject.getString("bigImageUrl");
        JSONObject jSONObject2 = this.b;
        this.e = jSONObject2 == null ? null : jSONObject2.getString("smallImageUrl");
        JSONObject jSONObject3 = this.b;
        this.f = jSONObject3 == null ? null : jSONObject3.getString("targetUrl");
        JSONObject jSONObject4 = this.b;
        this.k = jSONObject4 == null ? null : jSONObject4.getString("btnTitle");
        JSONObject jSONObject5 = this.b;
        this.l = jSONObject5 == null ? null : jSONObject5.getString("btnTitleColor");
        JSONObject jSONObject6 = this.b;
        this.m = jSONObject6 == null ? null : jSONObject6.getString("btnColor");
        JSONObject jSONObject7 = this.b;
        if (jSONObject7 != null) {
            str = jSONObject7.getString("inBigCard");
        }
        this.n = ckf.b(str, "true");
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
    }

    @Override // tb.xpd
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
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
        if (jSONObject3 != null) {
            str = jSONObject3.getString("id");
        }
        hashMap.put("imageid", str);
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e834f", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        this.f29778a = context;
        this.b = jSONObject;
        this.c = cVar;
        c();
    }

    @Override // tb.xpd
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
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
        }
    }

    @Override // tb.xpd
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
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
}
