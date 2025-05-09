package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.adapter.BehaviXAppAdapter;
import java.util.ArrayList;
import java.util.List;
import tb.o0r;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b5k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static b5k e;

    /* renamed from: a  reason: collision with root package name */
    public List<d5k> f16187a;
    public List<d5k> b;
    public String c = "";
    public String d = "";

    static {
        t2o.a(404750514);
    }

    public b5k() {
        new JSONObject();
    }

    public static b5k f() {
        b5k b5kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b5k) ipChange.ipc$dispatch("6b5cffe5", new Object[0]);
        }
        b5k b5kVar2 = e;
        if (b5kVar2 != null) {
            return b5kVar2;
        }
        synchronized (b5k.class) {
            try {
                if (e == null) {
                    e = new b5k();
                }
                b5kVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b5kVar;
    }

    public final List<d5k> a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("954730b5", new Object[]{this, jSONObject, str});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray != null && jSONArray.size() > 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    arrayList.add(new d5k(jSONObject2));
                }
            }
        }
        return arrayList;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            String l = v82.l(o0r.a.K_NODE_FILTERS, BehaviXAppAdapter.a(o0r.a.K_NODE_FILTERS));
            if (!TextUtils.equals(l, this.c)) {
                if (TextUtils.isEmpty(l)) {
                    d();
                    return;
                }
                try {
                    JSONObject parseObject = JSON.parseObject(l);
                    this.c = l;
                    if (!(parseObject == null || parseObject.size() == 0)) {
                        this.f16187a = a(parseObject, "whitelist");
                        this.b = a(parseObject, "blacklist");
                        return;
                    }
                    d();
                } catch (Exception e2) {
                    q82.f("NodeConfigCenter.updateConfig", "", null, e2);
                }
            }
        } catch (Throwable th) {
            q82.f("NodeConfigCenter.updateConfig", null, null, th);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            String l = v82.l(o0r.a.K_TABLE_CONFIG, "{\"dc_userBehavior_custom_node\":{\"limit\":1000,\"expire\":30}}");
            if (!TextUtils.equals(l, this.d)) {
                if (TextUtils.isEmpty(l)) {
                    new JSONObject();
                    return;
                }
                try {
                    JSONObject parseObject = JSON.parseObject(l);
                    this.d = l;
                    if (parseObject == null || parseObject.size() == 0) {
                        new JSONObject();
                    }
                } catch (Exception e2) {
                    q82.f("NodeConfigCenter.updateTableConfig", "", null, e2);
                }
            }
        } catch (Throwable th) {
            q82.f("NodeConfigCenter.updateTableConfig", null, null, th);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f16187a = new ArrayList(0);
        this.b = new ArrayList(0);
    }

    public List<d5k> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("86b53519", new Object[]{this});
        }
        if (v82.c.n()) {
            return this.b;
        }
        this.b = new ArrayList(0);
        this.c = null;
        return null;
    }

    public List<d5k> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("508ce9af", new Object[]{this});
        }
        if (v82.c.n()) {
            return this.f16187a;
        }
        this.f16187a = new ArrayList(0);
        this.c = null;
        return null;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[]{this});
        } else if (!v82.c.n()) {
            d();
        } else {
            b();
            c();
        }
    }
}
