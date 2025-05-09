package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.view.widgets.TailFadeFrameLayout;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.util.DensityUtil;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.a3b;
import tb.bqa;
import tb.d9j;
import tb.fuq;
import tb.g3b;
import tb.hpl;
import tb.i2b;
import tb.p2b;
import tb.qpl;
import tb.r5a;
import tb.srs;
import tb.t2o;
import tb.taj;
import tb.tgm;
import tb.vaj;
import tb.yhm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final srs f12454a;
    public boolean b;
    public final List<a.c> c = new CopyOnWriteArrayList();
    public MultiTabLayout d;
    public TUrlImageView e;
    public List<JSONObject> f;
    public final taj g;
    public final qpl h;
    public View i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f12455a;
        public final /* synthetic */ TUrlImageView b;

        public a(JSONObject jSONObject, TUrlImageView tUrlImageView) {
            this.f12455a = jSONObject;
            this.b = tUrlImageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            Object k = a3b.k(this.f12455a, vaj.PATH_DOWN_PANEL_ITEM);
            if (k instanceof JSONObject) {
                r5a.d(this.f12455a, (JSONObject) k);
            }
            boolean n = hpl.n(this.f12455a);
            d9j.c("TabDownPanelViewBuilder", "customizable: " + n);
            if (n) {
                d dVar = d.this;
                d.b(dVar, this.f12455a, d.a(dVar), null);
            } else {
                d dVar2 = d.this;
                d.c(dVar2, this.f12455a, d.a(dVar2));
            }
            String g = d.d(d.this).g(n);
            if (!TextUtils.isEmpty(g)) {
                p2b.q(this.b, g, "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
                this.b.setImageUrl(g);
                this.b.setContentDescription("收起,按钮");
            }
            for (a.c cVar : d.e(d.this)) {
                cVar.c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements IPopViewService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12456a;
        public final /* synthetic */ g3b b;

        public b(String str, g3b g3bVar) {
            this.f12456a = str;
            this.b = g3bVar;
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService.a
        public void a(String str, Object obj, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64db83b", new Object[]{this, str, obj, jSONObject});
                return;
            }
            IPopData<PopSectionModel> a2 = tgm.a(obj);
            if (a2 != null && TextUtils.equals(a2.getBusinessID(), this.f12456a)) {
                bqa.d("TabDownPanelViewBuilder", "receive messageType: " + str);
                if (TextUtils.equals("selectMultiTab", str) && jSONObject != null) {
                    String string = jSONObject.getString(vaj.KEY_TAB_ID);
                    if (!TextUtils.isEmpty(string)) {
                        d.f(d.this, string);
                    }
                } else if (yhm.c(str)) {
                    String g = d.d(d.this).g(true);
                    if (!TextUtils.isEmpty(g)) {
                        p2b.q(d.g(d.this), g, "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
                        d.g(d.this).setImageUrl(g);
                        d.g(d.this).setContentDescription("展开,按钮");
                    }
                    this.b.c(this);
                }
            }
        }
    }

    static {
        t2o.a(729809510);
    }

    public d(srs srsVar, taj tajVar, fuq fuqVar) {
        this.f12454a = srsVar;
        this.g = tajVar;
        this.h = new qpl(tajVar, fuqVar);
    }

    public static /* synthetic */ MultiTabLayout a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiTabLayout) ipChange.ipc$dispatch("12fe90ac", new Object[]{dVar});
        }
        return dVar.d;
    }

    public static /* synthetic */ void b(d dVar, JSONObject jSONObject, MultiTabLayout multiTabLayout, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9f31c9", new Object[]{dVar, jSONObject, multiTabLayout, jSONObject2});
        } else {
            dVar.i(jSONObject, multiTabLayout, jSONObject2);
        }
    }

    public static /* synthetic */ void c(d dVar, JSONObject jSONObject, MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59488e08", new Object[]{dVar, jSONObject, multiTabLayout});
        } else {
            dVar.j(jSONObject, multiTabLayout);
        }
    }

    public static /* synthetic */ srs d(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (srs) ipChange.ipc$dispatch("50366646", new Object[]{dVar});
        }
        return dVar.f12454a;
    }

    public static /* synthetic */ List e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6e7b8601", new Object[]{dVar});
        }
        return dVar.c;
    }

    public static /* synthetic */ void f(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53cfe0ef", new Object[]{dVar, str});
        } else {
            dVar.n(str);
        }
    }

    public static /* synthetic */ TUrlImageView g(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("9357e838", new Object[]{dVar});
        }
        return dVar.e;
    }

    public void h(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ca6b81", new Object[]{this, cVar});
        } else {
            ((CopyOnWriteArrayList) this.c).add(cVar);
        }
    }

    public final void i(JSONObject jSONObject, MultiTabLayout multiTabLayout, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f39b46", new Object[]{this, jSONObject, multiTabLayout, jSONObject2});
            return;
        }
        View view = this.i;
        if (view == null || view.getVisibility() != 0) {
            View rootView = this.d.getRootView();
            if (rootView instanceof ViewGroup) {
                this.i = this.h.i(jSONObject, this.d.getContext(), jSONObject2);
                int[] iArr = new int[2];
                multiTabLayout.getLocationInWindow(iArr);
                this.i.setY(iArr[1]);
                ((ViewGroup) rootView).addView(this.i);
                return;
            }
            return;
        }
        this.i.setVisibility(8);
    }

    public final String l() {
        List<JSONObject> list;
        int selectedTabPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82483a5a", new Object[]{this});
        }
        if (this.b && (list = this.f) != null && !list.isEmpty() && (selectedTabPosition = this.d.getSelectedTabPosition()) >= 0 && selectedTabPosition < this.f.size()) {
            return vaj.u(this.f.get(selectedTabPosition));
        }
        return "";
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b7c40e", new Object[]{this});
            return;
        }
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void o(JSONObject jSONObject, MultiTabLayout multiTabLayout, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feafd9bf", new Object[]{this, jSONObject, multiTabLayout, jSONObject2});
        } else if (!hpl.n(jSONObject)) {
            d9j.c("TabDownPanelViewBuilder", "triggerCustomPanelShow not customizable");
        } else if (multiTabLayout == null) {
            d9j.c("TabDownPanelViewBuilder", "triggerCustomPanelShow tabLayout null");
        } else {
            d9j.c("TabDownPanelViewBuilder", "triggerCustomPanelShow  buildCustomizablePanelView");
            i(jSONObject, multiTabLayout, jSONObject2);
        }
    }

    public final void p(JSONObject jSONObject) {
        IPopData<PopSectionModel> a2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a873dca0", new Object[]{this, jSONObject});
        } else if (this.b && (a2 = tgm.a(jSONObject)) != null) {
            String businessID = a2.getBusinessID();
            if (a2.getPopConfig() == null) {
                i = 3;
            } else {
                i = a2.getPopConfig().getTrigger();
            }
            g3b g3bVar = new g3b();
            g3bVar.a(new b(businessID, g3bVar));
            g3bVar.d(i, jSONObject);
        }
    }

    public final void j(JSONObject jSONObject, MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8d2442", new Object[]{this, jSONObject, multiTabLayout});
            return;
        }
        Object k = a3b.k(jSONObject, vaj.PATH_DOWN_PANEL_POP_CONFIG);
        if (k instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) k;
            Object k2 = a3b.k(jSONObject, vaj.PATH_DOWN_PANEL_POP_SECTION);
            if (k2 instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) k2;
                JSONObject jSONObject4 = jSONObject3.getJSONObject("ext");
                if (jSONObject4 == null) {
                    jSONObject4 = new JSONObject();
                    jSONObject3.put("ext", (Object) jSONObject4);
                }
                jSONObject4.put(vaj.KEY_SELECTED_TAB_ID, (Object) l());
                int[] iArr = new int[2];
                multiTabLayout.getLocationOnScreen(iArr);
                jSONObject4.put(vaj.KEY_DOWN_PANEL_ANCHOR_Y, (Object) String.valueOf(iArr[1] + multiTabLayout.getHeight()));
                JSONArray jSONArray = new JSONArray();
                jSONArray.add(jSONObject3);
                jSONObject2.put("sections", (Object) jSONArray);
                p(jSONObject2);
            }
        }
    }

    public void k(JSONObject jSONObject, List<JSONObject> list, MultiTabLayout multiTabLayout, View view, TailFadeFrameLayout tailFadeFrameLayout, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e337cf31", new Object[]{this, jSONObject, list, multiTabLayout, view, tailFadeFrameLayout, tUrlImageView});
        } else if (jSONObject != null) {
            if (TextUtils.isEmpty(this.f12454a.r)) {
                view.setVisibility(8);
                tailFadeFrameLayout.showFade(false);
                return;
            }
            this.d = multiTabLayout;
            this.e = tUrlImageView;
            this.f = list;
            p2b.q(tUrlImageView, this.f12454a.g(true), "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
            tUrlImageView.setImageUrl(this.f12454a.g(true));
            tUrlImageView.setContentDescription("展开,按钮");
            view.setVisibility(0);
            tailFadeFrameLayout.setFadeWidth(DensityUtil.dip2px(tailFadeFrameLayout.getContext(), 18.0f));
            tailFadeFrameLayout.showFade(true);
            ViewProxy.setOnClickListener(view, new a(jSONObject, tUrlImageView));
            this.b = true;
        }
    }

    public final void n(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e84445", new Object[]{this, str});
            return;
        }
        while (true) {
            if (i >= this.f.size()) {
                i = -1;
                break;
            }
            JSONObject jSONObject = this.f.get(i).getJSONObject("content");
            if (jSONObject != null && TextUtils.equals(str, jSONObject.getString(vaj.KEY_TAB_ID))) {
                break;
            }
            i++;
        }
        if (i >= 0 && i != this.d.getSelectedTabPosition()) {
            com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) this.g.b(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
            if (aVar != null) {
                aVar.p(i, 1);
            }
            d9j.c("TabDownPanelViewBuilder", "selectTabById: " + str + ", pos: " + i);
        }
    }
}
