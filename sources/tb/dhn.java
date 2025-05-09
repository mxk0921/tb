package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Rate;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dhn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT = "default";
    public static final String POP = "pop";
    public static final String POP_MULTI_TAB = "pop_multi_tab";

    /* renamed from: a  reason: collision with root package name */
    public final Rate.Keywords f17826a;
    public final List<Rate.Keywords> b;
    public String c;
    public long d;
    public JSONObject f;
    public JSONObject g;
    public String h;
    public long j;
    public JSONObject k;
    public JSONArray n;
    public int e = -1;
    public boolean i = false;
    public String l = "default";
    public final List<Rate.Keywords> m = new ArrayList();
    public boolean o = true;

    static {
        t2o.a(354418766);
    }

    public dhn(Rate.Keywords keywords, List<Rate.Keywords> list) {
        this.f17826a = keywords;
        this.b = list;
    }

    public static dhn a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dhn) ipChange.ipc$dispatch("d06190a5", new Object[]{jSONObject});
        }
        return new dhn(jSONObject);
    }

    public static dhn b(Rate.Keywords keywords, List<Rate.Keywords> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dhn) ipChange.ipc$dispatch("8eb9c461", new Object[]{keywords, list});
        }
        return new dhn(keywords, list);
    }

    public static void q(dhn dhnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71c2b49", new Object[]{dhnVar, jSONObject});
            return;
        }
        dhnVar.f = jSONObject;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.getString("feedId");
        if (!TextUtils.isEmpty(string)) {
            try {
                dhnVar.d = Long.parseLong(string);
            } catch (Exception unused) {
            }
        }
        dhnVar.c = jSONObject.getString("skuVids");
        String string2 = jSONObject.getString("invokeSource");
        if (!TextUtils.isEmpty(string2)) {
            try {
                dhnVar.e = Integer.parseInt(string2);
            } catch (Exception unused2) {
            }
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("exParams");
        dhnVar.g = jSONObject2;
        jSONObject.put("exParams", (Object) jSONObject2);
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43c186ba", new Object[]{this})).longValue();
        }
        return this.j;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d7a99a31", new Object[]{this});
        }
        return this.f;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("512995b6", new Object[]{this});
        }
        return this.g;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea71e74a", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79f9b923", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fe6b105", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public Rate.Keywords i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rate.Keywords) ipChange.ipc$dispatch("8abb31c8", new Object[]{this});
        }
        return this.f17826a;
    }

    public List<Rate.Keywords> j() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c442a442", new Object[]{this});
        }
        if (this.k == null) {
            return this.m;
        }
        JSONArray jSONArray2 = this.n;
        if (jSONArray2 == null || jSONArray2.isEmpty()) {
            jSONArray = this.k.getJSONArray("keywords");
            if (jSONArray == null || jSONArray.isEmpty()) {
                return this.m;
            }
        } else {
            jSONArray = this.n;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                ((ArrayList) this.m).add(Rate.Keywords.a(jSONObject));
            }
        }
        return this.m;
    }

    public List<Rate.Keywords> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e3b41875", new Object[]{this});
        }
        return this.b;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9985256", new Object[]{this});
        }
        return this.l;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f6f6e86", new Object[]{this});
        }
        return this.h;
    }

    public JSONObject n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("45282fb8", new Object[]{this});
        }
        return this.k;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c918d90", new Object[]{this});
        }
        return this.c;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76b01c35", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public void r(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6630ca", new Object[]{this, new Long(j)});
        } else {
            this.j = j;
        }
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a61dfffb", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78862e67", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144f52e0", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20bc1e18", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void w(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e5b564", new Object[]{this, jSONObject});
        } else {
            this.k = jSONObject;
        }
    }

    public void x(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c02097b", new Object[]{this, jSONArray});
        } else {
            this.n = jSONArray;
        }
    }

    public dhn() {
    }

    public dhn(JSONObject jSONObject) {
        q(this, jSONObject);
    }
}
