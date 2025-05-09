package com.taobao.android.detail.ttdetail.floatview;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.data.meta.Trade;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.skeleton.TTDetailScrollerLayoutComponent;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import java.util.Map;
import tb.b5m;
import tb.dns;
import tb.eo9;
import tb.hxj;
import tb.ir;
import tb.jov;
import tb.mr7;
import tb.mwy;
import tb.nb4;
import tb.ntc;
import tb.nwy;
import tb.oa4;
import tb.of7;
import tb.q84;
import tb.rc7;
import tb.sos;
import tb.t2o;
import tb.tgh;
import tb.tvd;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTDFloatController implements ntc<eo9> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6773a;
    public final ze7 b;
    public final ConstraintLayout c;
    public final TUrlImageView d;
    public final TUrlImageView e;
    public final TUrlImageView f;
    public tvd g;
    public dns h;
    public com.taobao.android.detail.ttdetail.floatview.a i;
    public sos j;
    public boolean k;
    public boolean l;
    public final FrameLayout m;
    public final FrameLayout n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Resource.d f6775a;

        public a(Resource.d dVar) {
            this.f6775a = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String b = of7.b(this.f6775a);
            Resource.c a2 = of7.a(this.f6775a);
            if (!"event".equals(b) || a2 == null || a2.b() == null) {
                tgh.b("TTDFloatController", "onClick no event data. actionType:" + b + ", floatActionData:" + a2);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) a2.a());
            jSONObject.put("fields", (Object) a2.b());
            TTDFloatController.a(TTDFloatController.this).b().h(new ir(jSONObject), new RuntimeAbilityParam[0]);
            tgh.b("TTDFloatController", "btnTalkGroup onClick event type:" + a2.a() + ", fields:" + a2.b());
            String e = of7.e(this.f6775a);
            JSONObject c = UtUtils.c(TTDFloatController.a(TTDFloatController.this).e());
            c.put("url", (Object) e);
            UtUtils.f(2101, "Page_Detail_Button-Discuss", c);
        }
    }

    static {
        t2o.a(912261772);
        t2o.a(912261362);
    }

    public TTDFloatController(Context context, ze7 ze7Var, FrameLayout frameLayout) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        this.f6773a = context;
        this.b = ze7Var;
        this.m = frameLayout;
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_floating_view, (ViewGroup) null);
        this.c = constraintLayout;
        this.n = (FrameLayout) constraintLayout.findViewById(R.id.tt_float_red_packet);
        TUrlImageView tUrlImageView = (TUrlImageView) constraintLayout.findViewById(R.id.btnTalkGroup);
        this.e = tUrlImageView;
        tUrlImageView.setVisibility(8);
        TUrlImageView tUrlImageView2 = (TUrlImageView) constraintLayout.findViewById(R.id.btnNps);
        this.f = tUrlImageView2;
        tUrlImageView2.setVisibility(8);
        TUrlImageView tUrlImageView3 = (TUrlImageView) constraintLayout.findViewById(R.id.btnGoTop);
        this.d = tUrlImageView3;
        if (b5m.H().isI18nEdition()) {
            str = "https://gw.alicdn.com/imgextra/i2/O1CN01lb3JAm1I3OTNwONVu_!!6000000000837-2-tps-88-88.png";
        } else {
            str = "https://img.alicdn.com/imgextra/i1/O1CN01999pXz1FcFkNNsP07_!!6000000000507-2-tps-88-88.png";
        }
        tUrlImageView3.setImageUrl(str);
        tUrlImageView3.setVisibility(8);
        if (b5m.H().isI18nEdition()) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tUrlImageView3.getLayoutParams());
            layoutParams.setMargins(0, 0, mr7.a(8.0f), mr7.a(85.0f));
            tUrlImageView3.setLayoutParams(layoutParams);
        }
        frameLayout.addView(constraintLayout, new ViewGroup.LayoutParams(-1, -1));
        q84.i(context, eo9.class, this);
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "TTDFloatController(): " + (currentTimeMillis2 - currentTimeMillis));
    }

    public static /* synthetic */ ze7 a(TTDFloatController tTDFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("16e63ba5", new Object[]{tTDFloatController});
        }
        return tTDFloatController.b;
    }

    public static /* synthetic */ Context b(TTDFloatController tTDFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("59dcb6cc", new Object[]{tTDFloatController});
        }
        return tTDFloatController.f6773a;
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5085ff", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.c.findViewById(R.id.hint_banner);
        View b = ((TTDHintBannerController) this.g).b();
        if (viewGroup.indexOfChild(b) <= -1) {
            viewGroup.removeAllViews();
            if (b != null) {
                viewGroup.addView(b);
            }
        }
    }

    public final JSONArray d() {
        JSONObject floatView;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7b771178", new Object[]{this});
        }
        Resource resource = (Resource) this.b.e().f(Resource.class);
        if (resource == null || (floatView = resource.getFloatView()) == null || (jSONArray = floatView.getJSONArray("list")) == null || jSONArray.isEmpty()) {
            return null;
        }
        return jSONArray;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        sos sosVar = this.j;
        if (sosVar != null) {
            sosVar.g();
        }
        q84.m(this.f6773a, this);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
            return;
        }
        p();
        n();
        m();
        k();
        l();
        o();
    }

    public void j(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74eda921", new Object[]{this, onClickListener});
        } else {
            this.d.setOnClickListener(onClickListener);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a373783", new Object[]{this});
            return;
        }
        JSONObject e = dns.e(this.b);
        if (e == null || e.isEmpty()) {
            ObserverFrameLayout observerFrameLayout = (ObserverFrameLayout) this.c.findViewById(R.id.bottom_float_dx);
            if (observerFrameLayout != null) {
                observerFrameLayout.removeAllViews();
                return;
            }
            return;
        }
        if (this.h == null) {
            this.h = new dns(this.b);
        }
        tgh.b("TTDFloatController", "updateBottomFloatDX addToParent");
        this.h.d((ObserverFrameLayout) this.c.findViewById(R.id.bottom_float_dx), e);
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc32c480", new Object[]{this});
            return;
        }
        if (this.j == null) {
            this.j = new sos(this.f6773a, this.b, this.m);
        }
        this.j.k(null);
        this.j.h(d());
    }

    public final void m() {
        Trade.a hintBanner;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33da7cc3", new Object[]{this});
            return;
        }
        Trade trade = (Trade) this.b.e().f(Trade.class);
        if (trade != null && (hintBanner = trade.getHintBanner()) != null) {
            if (this.g == null) {
                this.g = new TTDHintBannerController(this.f6773a, this.b);
            }
            ((TTDHintBannerController) this.g).c(hintBanner);
            c();
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bd5641", new Object[]{this});
            return;
        }
        final Resource.d c = of7.c(this.b, of7.CODE_NPS);
        if (c != null) {
            String e = c.e();
            final String d = of7.d(c);
            this.f.setImageUrl(e);
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.floatview.TTDFloatController.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (TextUtils.equals(of7.b(c), "openUrl") && !TextUtils.isEmpty(d)) {
                        jov.k(TTDFloatController.b(TTDFloatController.this), d);
                        JSONObject c2 = UtUtils.c(TTDFloatController.a(TTDFloatController.this).e());
                        c2.put("url", (Object) d);
                        UtUtils.f(2101, "Page_Detail_Button-NPS", c2);
                    }
                    q84.f(TTDFloatController.b(TTDFloatController.this), new rc7("userTrack", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTDFloatController.2.1
                        {
                            put("eventId", "2101");
                            put("arg1", "Page_Detail_Button-Survey");
                        }
                    }, new RuntimeAbilityParam[0]));
                }
            });
            this.l = true;
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73bd06c", new Object[]{this});
            return;
        }
        List<oa4<nb4>> a2 = com.taobao.android.detail.ttdetail.floatview.a.Companion.a(this.b);
        FrameLayout frameLayout = (FrameLayout) this.c.findViewById(R.id.tt_float_view_list);
        if (a2 != null) {
            if (this.i == null) {
                this.i = new com.taobao.android.detail.ttdetail.floatview.a(this.b);
            }
            tgh.b("TTDFloatController", "updateTTFloatListDX addToParent");
            this.i.a(frameLayout, a2);
        } else if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d91b8c3", new Object[]{this});
            return;
        }
        Resource.d c = of7.c(this.b, of7.CODE_TALK_GROUP);
        if (c != null) {
            this.e.setImageUrl(c.e());
            this.e.setOnClickListener(new a(c));
            this.k = true;
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ceef8", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.d.setVisibility(0);
            q84.f(this.f6773a, new rc7("userTrack", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTDFloatController.3
                {
                    put("eventId", "2201");
                    put("arg1", "Page_Detail_Show-BackToTop");
                }
            }, new RuntimeAbilityParam[0]));
            if (this.k) {
                this.e.setVisibility(0);
            }
            if (this.l) {
                this.f.setVisibility(0);
                q84.f(this.f6773a, new rc7("userTrack", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTDFloatController.4
                    {
                        put("eventId", "2201");
                        put("arg1", "Page_Detail_Show-Survey");
                    }
                }, new RuntimeAbilityParam[0]));
            }
        } else {
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            this.f.setVisibility(8);
        }
    }

    public final void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab9d5af", new Object[]{this, jSONObject});
            return;
        }
        try {
            Object obj = jSONObject.get(hxj.EVENT_KEY);
            if (obj instanceof String) {
                this.b.b().h(new ir(new JSONObject((String) obj, new JSONObject((Map) jSONObject.get("params"))) { // from class: com.taobao.android.detail.ttdetail.floatview.TTDFloatController.5
                    public final /* synthetic */ String val$eventType;
                    public final /* synthetic */ JSONObject val$params;

                    {
                        this.val$eventType = r2;
                        this.val$params = r3;
                        put("type", (Object) r2);
                        put("fields", (Object) r3);
                    }
                }), new RuntimeAbilityParam[0]);
            }
        } catch (Throwable th) {
            tgh.c("TTDFloatController", "postEvent", th);
        }
    }

    /* renamed from: h */
    public boolean y1(eo9 eo9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91d42891", new Object[]{this, eo9Var})).booleanValue();
        }
        tgh.b("TTDFloatController", "receiveMessage weex页面向native转发消息");
        g(eo9Var.b());
        return true;
    }

    public void q(TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent) {
        mwy a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1817851", new Object[]{this, tTDetailScrollerLayoutComponent});
            return;
        }
        ze7 ze7Var = this.b;
        if (ze7Var != null && ze7Var.e() != null && (a2 = nwy.a(this.b)) != null) {
            a2.d0(this.n);
            tgh.b("TTDFloatController", "updateRedPacket ttDetailPacketComponent=" + a2 + "this:" + this);
            View componentView = a2.getComponentView(null);
            if (componentView != null) {
                tgh.b("TTDFloatController", "updateRedPacket view=" + componentView);
                if (tTDetailScrollerLayoutComponent != null) {
                    tTDetailScrollerLayoutComponent.U(a2);
                }
                ViewGroup.LayoutParams layoutParams = this.n.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int a3 = mr7.a(60.0f);
                    int a4 = b5m.H().isI18nEdition() ? mr7.a(93.0f) + mr7.a(45.0f) : a3;
                    if (this.l) {
                        a4 += a3;
                    }
                    if (this.k) {
                        a4 += a3;
                    }
                    marginLayoutParams.bottomMargin = a4 + mr7.a(15.0f);
                    this.n.setLayoutParams(marginLayoutParams);
                }
                this.n.addView(componentView);
                if (a2.t() == 1) {
                    tgh.b("TTDFloatController", "updateRedPacket MAYBE_VISIBLE");
                    componentView.setVisibility(8);
                } else if (a2.t() != 2) {
                    tgh.b("TTDFloatController", "updateRedPacket GONE");
                    componentView.setVisibility(8);
                } else if (a2.h() != null) {
                    tgh.b("TTDFloatController", "updateRedPacket VISIBLE");
                    componentView.setVisibility(0);
                } else {
                    tgh.b("TTDFloatController", "updateRedPacket GONE");
                    componentView.setVisibility(8);
                    tgh.b("TTDFloatController", "updateRedPacket redPacketData is null");
                }
            }
        }
    }
}
