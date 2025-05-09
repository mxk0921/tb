package com.taobao.android.dressup.common.component.mediabrowser;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.PageModel;
import com.taobao.android.nav.Nav;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.at4;
import tb.byb;
import tb.bzm;
import tb.ckf;
import tb.d2e;
import tb.i04;
import tb.jpu;
import tb.lv0;
import tb.nz3;
import tb.qpu;
import tb.t2o;
import tb.vu0;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class AnchorViews {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CT_ARTICLE = "article";
    public static final String CT_LIVE = "live";
    public static final String CT_SPOT = "spot";
    public static final String CT_VIDEO = "video";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final lv0 f7550a;
    public final FrameLayout b;
    public vu0 c;
    public final MediaBrowserComponent d;
    public final Context e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552628);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552627);
    }

    public AnchorViews(MediaBrowserComponent mediaBrowserComponent, Context context) {
        ckf.g(mediaBrowserComponent, "mediaBrowserComponent");
        ckf.g(context, "context");
        this.d = mediaBrowserComponent;
        this.e = context;
        lv0 lv0Var = new lv0(context);
        this.f7550a = lv0Var;
        this.b = lv0Var.e();
    }

    public static final /* synthetic */ void a(AnchorViews anchorViews, boolean z, bzm bzmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875bb1fa", new Object[]{anchorViews, new Boolean(z), bzmVar});
        } else {
            anchorViews.d(z, bzmVar);
        }
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26cedc06", new Object[]{this, str});
        }
        switch (str.hashCode()) {
            case -732377866:
                if (str.equals(CT_ARTICLE)) {
                    return "1";
                }
                return "";
            case 3322092:
                str.equals("live");
                return "";
            case 3537154:
                str.equals(CT_SPOT);
                return "";
            case 112202875:
                if (str.equals("video")) {
                    return "2";
                }
                return "";
            default:
                return "";
        }
    }

    public final View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    public final void e(vu0 vu0Var) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf4e3ab", new Object[]{this, vu0Var});
            return;
        }
        this.b.removeAllViews();
        if (vu0Var == null) {
            return;
        }
        if (!vu0Var.a().isEmpty() || !vu0Var.b().isEmpty()) {
            this.c = vu0Var;
            Iterator<T> it = vu0Var.b().iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                bzm bzmVar = (bzm) it.next();
                lv0 lv0Var = this.f7550a;
                List<JSONObject> c = bzmVar.c();
                if (!(c == null || (jSONObject2 = (JSONObject) i04.c0(c)) == null || (string = jSONObject2.getString("description")) == null)) {
                    str = string;
                }
                LinearLayout d = lv0Var.d(str, new AnchorViews$updateAnchors$$inlined$forEach$lambda$1(bzmVar, this));
                this.b.addView(d);
                lv0 lv0Var2 = this.f7550a;
                at4.a aVar = at4.Companion;
                lv0Var2.g(d, at4.a.c(aVar, this.e, Float.valueOf(bzmVar.a()), false, 4, null), at4.a.c(aVar, this.e, Float.valueOf(bzmVar.b()), false, 4, null), false);
            }
            for (bzm bzmVar2 : vu0Var.a()) {
                lv0 lv0Var3 = this.f7550a;
                List<JSONObject> c2 = bzmVar2.c();
                if (c2 == null || (jSONObject = (JSONObject) i04.c0(c2)) == null || (str2 = jSONObject.getString("description")) == null) {
                    str2 = str;
                }
                LinearLayout a2 = lv0Var3.a(str2, new AnchorViews$updateAnchors$$inlined$forEach$lambda$2(bzmVar2, this));
                this.b.addView(a2);
                lv0 lv0Var4 = this.f7550a;
                at4.a aVar2 = at4.Companion;
                lv0Var4.g(a2, at4.a.c(aVar2, this.e, Float.valueOf(bzmVar2.a()), false, 4, null), at4.a.c(aVar2, this.e, Float.valueOf(bzmVar2.b()), false, 4, null), true);
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b597a0", new Object[]{this});
            return;
        }
        this.b.setAlpha(1.0f);
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                int i2 = 2;
                View childAt2 = linearLayout.getChildAt(linearLayout.getChildAt(0) instanceof FrameLayout ? 0 : 2);
                View childAt3 = linearLayout.getChildAt(1);
                if (!(linearLayout.getChildAt(0) instanceof FrameLayout)) {
                    i2 = 0;
                }
                View childAt4 = linearLayout.getChildAt(i2);
                ckf.f(childAt3, "line");
                childAt3.setAlpha(0.0f);
                ckf.f(childAt4, "tagWrapper");
                childAt4.setAlpha(0.0f);
                ckf.f(childAt2, "pointContainer");
                childAt2.setAlpha(0.0f);
                childAt2.animate().alpha(1.0f).setDuration(200L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                childAt3.animate().alpha(1.0f).setDuration(300L).setStartDelay(32L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                childAt4.animate().alpha(1.0f).setDuration(300L).setStartDelay(64L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
            }
        }
    }

    public final void d(boolean z, bzm bzmVar) {
        String str;
        int i;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        vu0 vu0Var;
        List<bzm> b;
        vu0 vu0Var2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2444dc5f", new Object[]{this, new Boolean(z), bzmVar});
            return;
        }
        List<JSONObject> c = bzmVar.c();
        JSONObject jSONObject3 = c != null ? c.get(0) : null;
        Integer valueOf = (!z ? (vu0Var = this.c) == null || (b = vu0Var.b()) == null : (vu0Var2 = this.c) == null || (b = vu0Var2.a()) == null) ? null : Integer.valueOf(b.indexOf(bzmVar));
        String string = jSONObject3 != null ? jSONObject3.getString("url") : null;
        qpu o = this.d.o();
        d2e d2eVar = (d2e) o.getService(d2e.class);
        if (string != null && string.length() > 0) {
            Object s = ((byb) o.getService(byb.class)).s();
            if (!(s instanceof PageModel)) {
                s = null;
            }
            PageModel pageModel = (PageModel) s;
            JSONObject originData = pageModel != null ? pageModel.getOriginData() : null;
            String str2 = string + "&spm=" + d2eVar.b() + ".anchor." + valueOf;
            ckf.d(jSONObject3);
            JSONObject jSONObject4 = jSONObject3.getJSONObject("utParam");
            String string2 = (originData == null || (jSONObject2 = originData.getJSONObject("content")) == null) ? null : jSONObject2.getString("id");
            if (originData == null || (jSONObject = originData.getJSONObject("content")) == null || (str = jSONObject.getString("contentType")) == null) {
                str = CT_ARTICLE;
            }
            String b2 = b(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("x_object_type", jSONObject4 != null ? jSONObject4.get("x_object_type") : null);
            linkedHashMap.put("x_object_id", jSONObject4 != null ? jSONObject4.get("x_object_id") : null);
            linkedHashMap.put("x_user_ids", jSONObject4 != null ? jSONObject4.get("x_user_ids") : null);
            linkedHashMap.put("x_keyname", jSONObject4 != null ? jSONObject4.get("x_keyname") : null);
            linkedHashMap.put(nz3.X_POSITION, valueOf);
            linkedHashMap.put("x_item_ids", jSONObject3.getString("id"));
            if (jSONObject4 == null || (i = jSONObject4.get(yj4.PARAM_PVID)) == null) {
                i = 0;
            }
            linkedHashMap.put(yj4.PARAM_PVID, i);
            linkedHashMap.put("source", jSONObject4 != null ? jSONObject4.get("x_source") : null);
            if (jSONObject4 != null) {
                for (Map.Entry<String, Object> entry : jSONObject4.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!linkedHashMap.containsKey(key)) {
                        ckf.f(key, "key");
                        linkedHashMap.put(key, value);
                    }
                }
            }
            Nav.from(this.e).toUri(str2 + "&contId=" + string2 + "&contScn=" + b2 + "&utparam=" + Uri.encode(JSON.toJSONString(linkedHashMap)));
        }
        d2eVar.q("Button-Anchor", kotlin.collections.a.j(jpu.a("picPosition", Integer.valueOf(this.d.A())), jpu.a("itemId", jSONObject3 != null ? jSONObject3.getString("id") : null)), null);
    }
}
