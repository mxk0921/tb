package com.taobao.android.weex_ability.page;

import android.view.Menu;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.lq0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.weex_ability.page.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface AbstractC0517a {
        void a(int i);
    }

    static {
        t2o.a(980418656);
    }

    public abstract lq0 a(com.taobao.android.weex_framework.a aVar);

    public abstract lq0 b(com.taobao.android.weex_framework.a aVar);

    public abstract lq0 c(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject);

    public abstract lq0 d(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject);

    public abstract boolean e(com.taobao.android.weex_framework.a aVar, Menu menu);

    public abstract lq0 f(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject);

    public abstract lq0 g(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject, AbstractC0517a aVar2);

    public abstract lq0 h(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject, AbstractC0517a aVar2);

    public abstract lq0 i(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject, AbstractC0517a aVar2);

    public abstract lq0 j(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject);

    public abstract lq0 k(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject);

    public abstract lq0 l(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject);

    public abstract lq0 m(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject);

    public lq0 n(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("5bf4fc27", new Object[]{this, aVar, jSONObject});
        }
        return new lq0("WX_NOT_SUPPORTED", "Only Taobao app support showMenu(), check implement in TBNavBarAdapter");
    }
}
