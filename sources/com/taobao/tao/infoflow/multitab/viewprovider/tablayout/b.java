package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.homepage.view.widgets.TailFadeFrameLayout;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bqa;
import tb.d9j;
import tb.fuq;
import tb.i2b;
import tb.p2b;
import tb.r5a;
import tb.srs;
import tb.t2o;
import tb.taj;
import tb.trs;
import tb.vaj;
import tb.wri;
import tb.z4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b implements View.OnClickListener, a.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final d f12451a;
    public boolean b = false;
    public final srs c;
    public JSONObject d;
    public TUrlImageView e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends TypeReference<Map<String, String>> {
        public a(b bVar) {
        }
    }

    static {
        t2o.a(729809505);
        t2o.a(729809499);
    }

    public b(srs srsVar, taj tajVar, fuq fuqVar) {
        this.c = srsVar;
        this.f12451a = new d(srsVar, tajVar, fuqVar);
    }

    public void a(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ca6b81", new Object[]{this, cVar});
        } else if (!this.b) {
            this.f12451a.h(cVar);
        }
    }

    public final void b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a3917b5", new Object[]{this, jSONObject, str});
        } else if (jSONObject != null) {
            r5a.l(vaj.d(jSONObject, str, d(jSONObject, str)));
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a739c28", new Object[]{this});
            return;
        }
        String q = vaj.q(this.d);
        if (!TextUtils.isEmpty(q)) {
            HashMap hashMap = new HashMap();
            hashMap.put("realtimeClickParam", q);
            wri.d().b("click", z4a.NEW_FACE_PARENT.c, hashMap);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.e
    public void d(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a3619e", new Object[]{this, new Integer(i), jSONObject});
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe0f9c2", new Object[]{this});
        } else if (!this.b) {
            this.f12451a.m();
        }
    }

    public void f(JSONObject jSONObject, MultiTabLayout multiTabLayout, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feafd9bf", new Object[]{this, jSONObject, multiTabLayout, jSONObject2});
        } else if (!this.b) {
            d9j.c("RightTopIconManager", "triggerCustomPanelShow  triggerCustomPanelShow");
            this.f12451a.o(jSONObject, multiTabLayout, jSONObject2);
        }
    }

    public void g(JSONObject jSONObject, List<JSONObject> list, MultiTabLayout multiTabLayout, View view, TailFadeFrameLayout tailFadeFrameLayout, TUrlImageView tUrlImageView, TUrlImageView tUrlImageView2, boolean z) {
        int i;
        int i2 = 8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556dbc29", new Object[]{this, jSONObject, list, multiTabLayout, view, tailFadeFrameLayout, tUrlImageView, tUrlImageView2, new Boolean(z)});
            return;
        }
        this.b = z;
        this.d = jSONObject;
        this.e = tUrlImageView2;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        tUrlImageView2.setVisibility(i);
        if (!this.b) {
            i2 = 0;
        }
        view.setVisibility(i2);
        tailFadeFrameLayout.showFade(!this.b);
        if (!this.b) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tUrlImageView.getLayoutParams();
            marginLayoutParams.width = trs.a(tUrlImageView.getContext(), 18.0f);
            marginLayoutParams.topMargin = trs.a(multiTabLayout.getContext(), 5.5f);
            marginLayoutParams.setMarginStart(trs.a(multiTabLayout.getContext(), 6.0f));
            marginLayoutParams.setMarginEnd(trs.a(multiTabLayout.getContext(), 9.0f));
            tUrlImageView.setLayoutParams(marginLayoutParams);
            this.f12451a.k(jSONObject, list, multiTabLayout, view, tailFadeFrameLayout, tUrlImageView);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) tUrlImageView2.getLayoutParams();
        int a2 = trs.a(tUrlImageView2.getContext(), 29.0f);
        marginLayoutParams2.width = (int) (a2 * this.c.z);
        marginLayoutParams2.height = a2;
        marginLayoutParams2.setMargins(trs.a(tUrlImageView2.getContext(), 6.0f), 0, trs.a(tUrlImageView2.getContext(), 8.5f), trs.a(tUrlImageView2.getContext(), 6.0f));
        tUrlImageView2.setLayoutParams(marginLayoutParams2);
        tUrlImageView2.setOnClickListener(this);
        i();
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3463a2", new Object[]{this});
            return;
        }
        Map<String, String> p = vaj.p(this.d);
        if (p != null) {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(p);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        Pair<String, String> h = this.c.h();
        JSONObject c = vaj.c(this.d, (String) h.first, d(this.d, (String) h.first));
        if (c != null) {
            h();
            Nav.from(view.getContext()).toUri(c.getString("targetUrl"));
            r5a.d(this.d, c);
            c();
        }
    }

    public final String d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bac1de5a", new Object[]{this, jSONObject, str});
        }
        JSONObject o = vaj.o(jSONObject);
        if (o == null) {
            return "";
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return (String) ((Map) JSON.parseObject(o.toJSONString(), new a(this), new Feature[0])).get(str);
            }
            return "";
        } catch (Exception e) {
            bqa.b("RightTopIconManager", "parse argsTypeMap error", e);
            return "";
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.e
    public void a(int i, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff5e72f", new Object[]{this, new Integer(i), jSONObject, new Boolean(z)});
        } else if (this.b) {
            i();
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541b8047", new Object[]{this});
        } else if (this.e != null) {
            Pair<String, String> h = this.c.h();
            if (TextUtils.equals((CharSequence) h.first, "gif")) {
                this.e.setSkipAutoSize(true);
                this.e.setWhenNullClearImg(false);
            }
            p2b.q(this.e, (String) h.second, "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
            d9j.c("RightTopIconManager", "rightTopIcon setImageUrl:" + ((String) h.second));
            this.e.setImageUrl((String) h.second);
            this.e.setScaleType(ImageView.ScaleType.FIT_XY);
            this.e.setContentDescription("拍立淘");
            this.e.setImportantForAccessibility(1);
            b(this.d, (String) h.first);
        }
    }
}
