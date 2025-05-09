package com.taobao.android.detail2.core.framework.view.navbar;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alittdetail.collect.TaobaoCollectionHelper;
import com.taobao.android.detail2.core.biz.detailcard.msoa.AddFavRequest;
import com.taobao.android.detail2.core.biz.detailcard.msoa.DelFavRequest;
import com.taobao.android.detail2.core.biz.detailcard.msoa.IsFavRequest;
import com.taobao.android.detail2.core.framework.view.navbar.RightNavBarCollectIconHolder;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.cxj;
import tb.dh7;
import tb.rrh;
import tb.t2o;
import tb.txj;
import tb.ue7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TIconFontTextView f7199a;
    public JSONObject b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public final ue7 g;
    public final dh7 h;
    public final boolean i;
    public e j;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail2.core.framework.view.navbar.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class View$OnClickListenerC0392a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnClickListenerC0392a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (a.a(a.this)) {
                a.b(a.this);
                a.c(a.this, "Navigation_CancelToFavorite");
                a.d(a.this, false);
            } else {
                a.e(a.this);
                a.c(a.this, "Navigation_AddToFavorite");
                a.d(a.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else if (map == null || !map.containsKey("isFavorite")) {
                a.f(a.this, false);
            } else {
                a.f(a.this, ((Boolean) map.get("isFavorite")).booleanValue());
            }
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            a.f(a.this, false);
            txj.e(a.g(a.this), "查看是否收藏失败,原因未知");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            a.f(a.this, true);
            if (TextUtils.isEmpty(str2) || !z) {
                txj.e(a.g(a.this), "取消收藏失败,原因未知");
            } else if (ErrorConstant.isSessionInvalid(str) || "ANDROID_SYS_LOGIN_CANCEL".equals(str)) {
                txj.e(a.g(a.this), "亲,您暂未登录~");
            } else {
                txj.e(a.g(a.this), "取消收藏失败,原因未知");
            }
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else if (map == null || !map.containsKey("deleteResult") || !((Boolean) map.get("deleteResult")).booleanValue()) {
                txj.e(a.g(a.this), "取消收藏失败,原因未知");
            } else {
                a.f(a.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else if (map == null || !map.containsKey("addResult") || !((Boolean) map.get("addResult")).booleanValue()) {
                txj.e(a.g(a.this), a.i(a.this));
            } else {
                a.f(a.this, true);
                txj.e(a.g(a.this), a.h(a.this));
            }
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            a.f(a.this, false);
            if (TextUtils.isEmpty(str2) || !z) {
                txj.e(a.g(a.this), "收藏失败,原因未知");
            } else if (ErrorConstant.isSessionInvalid(str) || "ANDROID_SYS_LOGIN_CANCEL".equals(str)) {
                txj.e(a.g(a.this), "亲,您暂未登录~");
            } else {
                txj.e(a.g(a.this), "收藏失败,原因未知");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface e {
    }

    static {
        t2o.a(352322080);
    }

    public a(cxj cxjVar, dh7 dh7Var, ue7 ue7Var, TIconFontTextView tIconFontTextView, JSONObject jSONObject, int i) {
        this.f7199a = tIconFontTextView;
        this.g = ue7Var;
        this.h = dh7Var;
        this.b = jSONObject;
        o();
        if (tIconFontTextView != null && this.b != null && !TextUtils.isEmpty(this.d)) {
            tIconFontTextView.setTextColor(i);
            tIconFontTextView.setText(this.f);
            l();
            tIconFontTextView.setOnClickListener(new View$OnClickListenerC0392a());
            this.i = true;
        }
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83746de9", new Object[]{aVar})).booleanValue();
        }
        return aVar.c;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58b9b44", new Object[]{aVar});
        } else {
            aVar.m();
        }
    }

    public static /* synthetic */ void c(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c22fad", new Object[]{aVar, str});
        } else {
            aVar.r(str);
        }
    }

    public static /* synthetic */ void d(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed857d12", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.n(z);
        }
    }

    public static /* synthetic */ void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd12361", new Object[]{aVar});
        } else {
            aVar.k();
        }
    }

    public static /* synthetic */ void f(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef227a14", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.q(z);
        }
    }

    public static /* synthetic */ String g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2109861", new Object[]{aVar});
        }
        aVar.getClass();
        return "NavbarCollect";
    }

    public static /* synthetic */ String h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7bbf4e2", new Object[]{aVar});
        }
        aVar.getClass();
        return "收藏成功";
    }

    public static /* synthetic */ String i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd675163", new Object[]{aVar});
        }
        aVar.getClass();
        return "系统开小差了~";
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f0bf554", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95e7259", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", this.d);
        rrh.e().o(new AddFavRequest(TaobaoCollectionHelper.MSOA_SCENE_NAME, hashMap), new d());
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb9aaca1", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", this.d);
        rrh.e().o(new IsFavRequest(TaobaoCollectionHelper.MSOA_SCENE_NAME, hashMap), new b());
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69889baf", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", this.d);
        rrh.e().o(new DelFavRequest(TaobaoCollectionHelper.MSOA_SCENE_NAME, hashMap), new c());
    }

    public final void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273a11b5", new Object[]{this, new Boolean(z)});
            return;
        }
        e eVar = this.j;
        if (eVar != null) {
            ((RightNavBarCollectIconHolder.a) eVar).a(z);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be2ab04", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
            if (jSONObject2 == null) {
                this.b = null;
                return;
            }
            this.d = jSONObject2.getString("itemId");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("collected");
            if (jSONObject3 == null) {
                this.b = null;
                return;
            }
            this.e = jSONObject3.getString("iconFont");
            this.f = jSONObject2.getJSONObject("uncollect").getString("iconFont");
        }
    }

    public void p(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb457730", new Object[]{this, eVar});
        } else {
            this.j = eVar;
        }
    }

    public final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f737f46e", new Object[]{this, new Boolean(z)});
        } else if (this.c != z) {
            this.c = z;
            if (z) {
                this.f7199a.setText(this.e);
                this.f7199a.setTextColor(Color.parseColor("#f50000"));
                return;
            }
            this.f7199a.setTextColor(-16777216);
            this.f7199a.setText(this.f);
        }
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9519ff04", new Object[]{this, str});
        } else {
            this.h.a0().d("item", str, "", "", new HashMap(), this.g);
        }
    }
}
