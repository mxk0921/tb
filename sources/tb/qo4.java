package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.promotion.content.Content;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qo4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_STATUS_ERROR = "error";
    public static final String DX_STATUS_INITIAL = "initial";
    public static final String DX_STATUS_LOADING = "loading";
    public static final String DX_STATUS_SUCCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f26844a;
    public JSONObject b;
    public Map<String, JSONArray> c;
    public Map<String, Boolean> d;
    public DXTemplateItem e;
    public boolean f;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public int o;
    public JSONObject p;
    public String q;
    public final Map<String, JSONObject> g = new HashMap();
    public final DXTemplateItem r = t();

    static {
        t2o.a(629145605);
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20a637c2", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ro4.c(this.j);
        e();
    }

    public final void E(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f256f90", new Object[]{this, jSONArray});
            return;
        }
        JSONArray jSONArray2 = this.c.get(this.i);
        if (jSONArray2 != null) {
            jSONArray2.addAll(jSONArray);
        }
    }

    public JSONArray F(String str) {
        JSONObject parseObject;
        JSONObject o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("570150c0", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null || parseObject.getJSONObject("data") == null || parseObject.getJSONObject("data").getJSONObject("data") == null || (o = o(parseObject.getJSONObject("data").getJSONObject("data"))) == null) {
            return null;
        }
        return i(o);
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc1d2f", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.f26844a;
        if (jSONObject != null) {
            jSONObject.put("rootHeight", (Object) (this.o + "np"));
        }
    }

    public void I(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212bc3da", new Object[]{this, new Integer(i)});
            return;
        }
        this.o = i;
        G();
    }

    public void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71029e43", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public void K(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff6ebae8", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ecd64e", new Object[]{this});
            return;
        }
        Map<String, JSONArray> map = this.c;
        if (map != null && ((HashMap) map).size() > 0) {
            JSONArray a2 = dq4.a((JSONArray) ((HashMap) this.c).get(this.i), TextUtils.equals("all", this.i) ? this.l : null, this.m, this.c, this.b);
            JSONObject jSONObject = this.b;
            this.f26844a = dq4.b(a2, jSONObject, "success", "", this.o + "np", this.p);
        }
    }

    public void b(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82168bd4", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = this.b;
        if (this.o == 0) {
            str3 = "650";
        } else {
            str3 = this.o + "np";
        }
        this.f26844a = dq4.b(null, jSONObject, str, str2, str3, this.p);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e5be96", new Object[]{this, str});
            return;
        }
        this.i = str;
        JSONObject jSONObject = this.b;
        if (jSONObject != null && this.c != null) {
            jSONObject.put("currentTag", (Object) str);
            JSONArray jSONArray = this.c.get(this.i);
            if (jSONArray == null || jSONArray.isEmpty()) {
                b("initial", "");
            } else {
                a();
            }
        }
    }

    public boolean d() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98c79eb6", new Object[]{this})).booleanValue();
        }
        Map<String, JSONArray> map = this.c;
        if (map == null || map.size() <= 0 || (jSONArray = this.c.get(this.i)) == null || jSONArray.size() <= 0) {
            return false;
        }
        return true;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            return;
        }
        this.f26844a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.h = null;
        this.i = "all";
        this.j = null;
        this.k = 0;
        this.n = null;
        this.o = 0;
        this.p = null;
        this.l = null;
        this.m = null;
        ((HashMap) this.g).clear();
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab8b4baa", new Object[]{this});
        }
        return this.q;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5a9fcbb4", new Object[]{this});
        }
        return this.f26844a;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8392bcfb", new Object[]{this});
        }
        return this.l;
    }

    public final JSONArray i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2f71c74d", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONArray("contents");
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("771dac62", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public DXTemplateItem k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("c32af741", new Object[]{this});
        }
        return this.e;
    }

    public DXTemplateItem l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("e25b6a9a", new Object[]{this});
        }
        return this.r;
    }

    public final JSONObject m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("81faf3d3", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("filter");
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.n;
    }

    public final JSONObject o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("47cf7e6e", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("model");
    }

    public JSONObject p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ddfdbb37", new Object[]{this});
        }
        return (JSONObject) ((HashMap) this.g).get(this.i);
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24f9c57e", new Object[]{this});
        }
        return this.h;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b408fffa", new Object[]{this});
        }
        return this.i;
    }

    public JSONArray s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("4ad41a94", new Object[]{this, str});
        }
        Map<String, JSONArray> map = this.c;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final DXTemplateItem t() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("ccf841d5", new Object[]{this});
        }
        if (r0.a()) {
            jSONObject = xbl.c();
        } else {
            jSONObject = xbl.b();
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = qrf.m(jSONObject, "name", "");
        dXTemplateItem.b = qrf.k(jSONObject, "version", 0L);
        dXTemplateItem.c = qrf.m(jSONObject, "url", "");
        return dXTemplateItem;
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("206169f7", new Object[]{this});
        }
        return this.j;
    }

    public JSONObject v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eaea70a2", new Object[]{this});
        }
        return this.p;
    }

    public void w(Context context, pur purVar) {
        Content content;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c1e809", new Object[]{this, context, purVar});
            return;
        }
        String utdid = UTDevice.getUtdid(context);
        this.j = utdid + System.currentTimeMillis();
        if (purVar != null && purVar.b() != null && (content = (Content) purVar.b().toJavaObject(Content.class)) != null) {
            this.h = content.seeIds;
            this.n = purVar.c();
            this.q = purVar.a();
            this.p = C(content, this.n);
            this.f = B(content);
            b("initial", "");
            ro4.a(this.j, this);
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f49bb4", new Object[]{this});
            return;
        }
        JSONArray jSONArray = this.b.getJSONArray("tagList");
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                this.c.put(((JSONObject) it.next()).getString("tag"), new JSONArray());
            }
        }
    }

    public boolean y() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("689a94dd", new Object[]{this})).booleanValue();
        }
        Map<String, Boolean> map = this.d;
        if (map != null && map.containsKey(this.i) && (bool = this.d.get(this.i)) != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean z(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b21dda8d", new Object[]{this, str})).booleanValue();
        }
        Map<String, JSONArray> map = this.c;
        if (map == null || (jSONArray = map.get(str)) == null || jSONArray.isEmpty()) {
            return true;
        }
        return false;
    }

    public final JSONObject C(Content content, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("82bd3604", new Object[]{this, content, str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = content.commonUtParams;
            jSONObject2.put("itemId", (Object) str);
            if (r0.a()) {
                str2 = PromotionFilterBean.SINGLE;
            } else {
                str2 = "normal";
            }
            jSONObject2.put("mode", (Object) str2);
            jSONObject.putAll(jSONObject2);
        } catch (Exception e) {
            odg.c("[mergeContentExposure]ContentDataManager", e.getMessage());
        }
        return jSONObject;
    }

    public boolean H(String str) {
        JSONObject parseObject;
        JSONObject o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5291a159", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null || parseObject.getJSONObject("data") == null || parseObject.getJSONObject("data").getJSONObject("data") == null || (o = o(parseObject.getJSONObject("data").getJSONObject("data"))) == null) {
            return false;
        }
        JSONObject m = m(o);
        JSONArray i = i(o);
        if (!(m == null || i == null)) {
            this.b = m;
            boolean equals = Boolean.TRUE.toString().equals(o.getString("hasNextPage"));
            if (this.c == null || this.d == null) {
                this.c = new HashMap();
                this.d = new HashMap();
                x();
            }
            this.i = qrf.m(this.b, "currentTag", "");
            if (this.f) {
                JSONObject jSONObject = o.getJSONObject(pl4.KEY_PAGINATION);
                equals = qrf.b(jSONObject, "hasMore", equals);
                ((HashMap) this.g).put(this.i, jSONObject);
            }
            if (this.e == null) {
                this.e = t();
            }
            String string = this.b.getString("currentTag");
            this.i = string;
            ((HashMap) this.d).put(string, Boolean.valueOf(equals));
            E(i);
            a();
            return true;
        }
        return false;
    }

    public final boolean B(Content content) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c22c74d", new Object[]{this, content})).booleanValue();
        }
        JSONObject jSONObject = content.extendParams;
        if (jSONObject != null && jSONObject.size() > 0) {
            try {
                if (jSONObject.containsKey("version")) {
                    if (jSONObject.getInteger("version").intValue() == 2) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
