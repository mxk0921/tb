package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import java.util.HashMap;
import java.util.Map;
import tb.vm0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g4o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SERVICE_NAME = "nextrpc-BUY2";
    public static final int mTaoBaoBizId = 24;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f19723a;
    public y7n b;
    public Map<String, String> c;
    public String d;
    public String e;
    public un0 f;
    public un0 g;
    public un0 h;
    public final Activity i;
    public final boolean j;

    static {
        t2o.a(301990041);
    }

    public g4o(Activity activity) {
        this.d = null;
        this.j = bbl.a("closeCreateOrderRetry", false);
        i(activity);
        this.i = activity;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac539d92", new Object[]{this, map});
            return;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        if (map != null && !map.isEmpty()) {
            this.c.putAll(map);
        }
    }

    public Map<String, String> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6e030c93", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    String key = entry.getKey();
                    if ("exParams".equals(key)) {
                        k(this.f19723a, entry.getValue());
                    } else {
                        this.f19723a.put(key, entry.getValue());
                    }
                }
            }
        }
        return this.f19723a;
    }

    public un0 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (un0) ipChange.ipc$dispatch("7a561ef0", new Object[]{this});
        }
        if (this.g == null) {
            this.g = new un0();
        }
        this.g.d(this.b.b());
        this.g.g(this.b.h());
        this.g.q(this.b.c());
        this.g.e(24);
        this.g.h(true);
        this.g.k(this.c);
        this.g.o(this.d);
        this.g.m(i0r.g());
        return this.g;
    }

    public un0 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (un0) ipChange.ipc$dispatch("3a8f3be3", new Object[]{this});
        }
        Map<String, String> k = lql.k(this.i);
        if (this.h == null) {
            this.h = new un0();
        }
        this.h.d(this.b.f());
        this.h.g(this.b.h());
        this.h.q(this.b.g());
        this.h.e(24);
        this.h.f(k);
        this.h.h(true);
        this.h.p(true);
        this.h.k(this.c);
        this.h.o(this.d);
        this.h.m(i0r.g());
        if (this.j) {
            this.h.l(0);
        }
        return this.h;
    }

    public final Map<String, String> f(Intent intent) {
        Map map;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1de939c9", new Object[]{this, intent});
        }
        try {
            map = (Map) intent.getSerializableExtra("buildOrderParams");
        } catch (Throwable unused) {
            map = null;
        }
        if (map == null) {
            Uri data = intent.getData();
            str = data != null ? data.getQueryParameter("itemId") : null;
        } else {
            str = (String) map.get("itemId");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("x-itemid", str);
        return hashMap;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd014fdc", new Object[]{this});
        }
        return this.e;
    }

    public y7n h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y7n) ipChange.ipc$dispatch("fec03e44", new Object[]{this});
        }
        return this.b;
    }

    public final void i(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a0ee0", new Object[]{this, activity});
        } else if (activity != null) {
            Intent h = hh.h(activity);
            if (h == null) {
                vm0.d(vm0.a.a("buyFragment").message("intent is empty").tag("EMPTY_INTENT_FORM_(prepare)").sampling(1.0f));
            } else {
                j(activity, h);
            }
        }
    }

    public final void j(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c475b37", new Object[]{this, context, intent});
            return;
        }
        Map<String, String> j = lql.j(context, intent);
        this.f19723a = j;
        this.e = j.remove("itemNum");
        this.c = f(intent);
        y7n y7nVar = new y7n(this.f19723a);
        this.b = y7nVar;
        if (TextUtils.isEmpty(y7nVar.h())) {
            this.d = "UNIT_TRADE";
        }
    }

    public final void k(Map<String, String> map, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb8f3e0", new Object[]{this, map, str});
        } else if (map != null && str != null) {
            String str2 = map.get("exParams");
            if (TextUtils.isEmpty(str2)) {
                map.put("exParams", str);
                return;
            }
            JSONObject jSONObject2 = null;
            try {
                jSONObject = JSON.parseObject(str2);
                try {
                    jSONObject2 = JSON.parseObject(str);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.putAll(jSONObject2);
            map.put("exParams", jSONObject.toJSONString());
        }
    }

    public un0 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (un0) ipChange.ipc$dispatch("3ce6925d", new Object[]{this});
        }
        if (this.f == null) {
            this.f = new un0();
        }
        this.f.d(this.b.d());
        this.f.g(this.b.h());
        this.f.q(this.b.e());
        this.f.f(this.f19723a);
        if (!TextUtils.isEmpty(this.e)) {
            if (!this.e.equals("1") || !AliBuyPerfSwitcher.enablePopupWindowStreamResponse()) {
                un0 un0Var = this.f;
                un0Var.n("order_" + this.e);
            } else {
                un0 un0Var2 = this.f;
                un0Var2.n("order_" + this.e + "_stream");
            }
        }
        this.f.e(24);
        this.f.h(true);
        this.f.k(this.c);
        this.f.o(this.d);
        this.f.m(i0r.g());
        return this.f;
    }

    public g4o(Context context, Intent intent) {
        this.d = null;
        j(context, intent);
    }
}
