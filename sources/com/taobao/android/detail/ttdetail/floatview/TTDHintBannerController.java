package com.taobao.android.detail.ttdetail.floatview;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Trade;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.taobao.R;
import tb.ir;
import tb.mr7;
import tb.t2o;
import tb.tgh;
import tb.tvd;
import tb.vbl;
import tb.w14;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTDHintBannerController implements tvd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "hintBanner";

    /* renamed from: a  reason: collision with root package name */
    public final View f6776a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;
    public final ze7 e;

    static {
        t2o.a(912261781);
        t2o.a(912261766);
    }

    public TTDHintBannerController(Context context, ze7 ze7Var) {
        this.e = ze7Var;
        PreRenderManager g = PreRenderManager.g(context);
        if (g != null) {
            this.f6776a = g.j(context, R.layout.tt_detail_hint_banner, null, true);
        } else {
            this.f6776a = LayoutInflater.from(context).inflate(R.layout.tt_detail_hint_banner, (ViewGroup) null);
        }
        LinearLayout linearLayout = (LinearLayout) this.f6776a.findViewById(R.id.ll_hint_banner);
        this.b = linearLayout;
        this.c = (TextView) this.f6776a.findViewById(R.id.tv_hint);
        this.d = (TextView) this.f6776a.findViewById(R.id.tv_button);
        linearLayout.setTag(TAG);
    }

    public static /* synthetic */ ze7 a(TTDHintBannerController tTDHintBannerController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("8d01f2c6", new Object[]{tTDHintBannerController});
        }
        return tTDHintBannerController.e;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f6776a;
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.floatview.TTDHintBannerController$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Trade.a f6777a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ String c;

        public AnonymousClass1(Trade.a aVar, JSONObject jSONObject, String str) {
            this.f6777a = aVar;
            this.b = jSONObject;
            this.c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String d = this.f6777a.d();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = this.b;
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                jSONObject.put("type", (Object) d);
                jSONObject.put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTDHintBannerController.1.1
                    {
                        put("url", (Object) AnonymousClass1.this.c);
                    }
                });
                TTDHintBannerController.a(TTDHintBannerController.this).b().h(new ir(jSONObject), new RuntimeAbilityParam[0]);
                if (!"openUrl".equals(d) && !"open_url".equals(d)) {
                    z = false;
                }
                if (TextUtils.isEmpty(this.c)) {
                    return;
                }
                if (!z || vbl.a1()) {
                    TTDHintBannerController.a(TTDHintBannerController.this).b().h(new ir(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTDHintBannerController.1.2
                        {
                            put("type", "openUrl");
                            put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTDHintBannerController.1.2.1
                                {
                                    put("url", (Object) AnonymousClass1.this.c);
                                }
                            });
                        }
                    }), new RuntimeAbilityParam[0]);
                    return;
                }
                return;
            }
            jSONObject.put("type", (Object) d);
            jSONObject.put("fields", (Object) this.b);
            TTDHintBannerController.a(TTDHintBannerController.this).b().h(new ir(jSONObject), new RuntimeAbilityParam[0]);
        }
    }

    public void c(Trade.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7ba774", new Object[]{this, aVar});
            return;
        }
        String g = aVar.g();
        String f = aVar.f();
        if (TextUtils.isEmpty(g)) {
            g = "";
        }
        if (!TextUtils.isEmpty(f)) {
            g = g + f;
        }
        if (TextUtils.isEmpty(g)) {
            this.b.setVisibility(8);
            return;
        }
        this.b.setVisibility(0);
        this.c.setText(g);
        if (!TextUtils.isEmpty(aVar.h())) {
            try {
                this.c.setTextColor(w14.a(aVar.h()));
            } catch (Exception e) {
                tgh.b(TAG, "setupHintBanner " + e.toString());
            }
        }
        if (!TextUtils.isEmpty(aVar.a())) {
            try {
                this.b.setBackgroundColor(w14.a(aVar.a()));
            } catch (Exception e2) {
                tgh.b(TAG, "setupHintBanner " + e2.toString());
            }
        }
        if (!TextUtils.isEmpty(aVar.b())) {
            this.c.setGravity(16);
            ((LinearLayout.LayoutParams) this.c.getLayoutParams()).setMargins(mr7.a(12.0f), 0, mr7.a(10.0f), 0);
            this.d.setText(aVar.b());
            if (!TextUtils.isEmpty(aVar.c())) {
                try {
                    this.d.setTextColor(w14.a(aVar.c()));
                } catch (Exception e3) {
                    tgh.b(TAG, "setupHintBanner " + e3.toString());
                }
            }
            this.d.setVisibility(0);
            this.d.setOnClickListener(new AnonymousClass1(aVar, aVar.e(), aVar.i()));
        } else {
            this.d.setVisibility(8);
            this.c.setGravity(17);
        }
        JSONObject c = UtUtils.c(this.e.e());
        c.put("text", (Object) g);
        UtUtils.f(2201, "Page_Detail_Show_HintBanner", c);
    }
}
