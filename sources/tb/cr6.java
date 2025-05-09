package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class cr6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f17256a;
    public Boolean b;
    public JSONObject c;
    public JSONArray d;
    public JSONObject e;
    public JSONObject f;
    public JSONArray g;
    public JSONObject h;
    public boolean i;
    public boolean j;
    public Long k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public final JSONObject q;

    static {
        t2o.a(745537701);
    }

    public cr6() {
        this(null, 1, null);
    }

    public final cr6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cr6) ipChange.ipc$dispatch("df5e0dd9", new Object[]{this});
        }
        JSONObject i = i();
        if (i == null) {
            return null;
        }
        cr6 cr6Var = new cr6(JSON.parseObject(i.toJSONString()));
        cr6Var.b = this.b;
        return cr6Var;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65273e6a", new Object[]{this});
        }
        return this.m;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fd160cb", new Object[]{this});
        }
        return this.n;
    }

    public final JSONObject e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("313145de", new Object[]{this, str});
        }
        ckf.h(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        JSONObject jSONObject = this.h;
        if (jSONObject != null) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    public final JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("141118af", new Object[]{this});
        }
        return this.f;
    }

    public final JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f743d4e5", new Object[]{this});
        }
        return this.h;
    }

    public final JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("723586c9", new Object[]{this});
        }
        return this.c;
    }

    public final JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5e83d693", new Object[]{this});
        }
        if (!ckf.b(this.b, Boolean.TRUE)) {
            return null;
        }
        if (this.f17256a == null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("data", (Object) jSONObject2);
            jSONObject2.put("pagebackContext", (Object) this.c);
            jSONObject2.put("hierarchy", (Object) this.d);
            jSONObject2.put("global", (Object) this.e);
            jSONObject2.put("hierarchyData", (Object) this.f);
            this.f17256a = jSONObject;
        }
        return this.f17256a;
    }

    public final JSONObject j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fcb3d485", new Object[]{this, str});
        }
        ckf.h(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        return this.f.getJSONObject(str);
    }

    public final Long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("543a5793", new Object[]{this});
        }
        return this.k;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6002b3ff", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bd05495", new Object[]{this});
        }
        return this.o;
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("767a76f6", new Object[]{this});
        }
        return this.p;
    }

    public final String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f467ca35", new Object[]{this});
        }
        return this.l;
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75c9c91e", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3638f1", new Object[]{this});
        } else {
            this.b = Boolean.FALSE;
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccd59fd", new Object[]{this});
        } else if (!ckf.b(this.b, Boolean.FALSE)) {
            this.b = Boolean.TRUE;
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd3e3", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.e;
        if (jSONObject != null) {
            this.i = jSONObject.getBooleanValue("is88Vip");
            this.j = jSONObject.getBooleanValue("refreshBasement");
            this.k = jSONObject.getLong("mainInterfaceExpireTime");
        }
    }

    public final void v(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9897073d", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject8 = jSONObject.getJSONObject("headerModule");
        if (jSONObject8 != null) {
            JSONObject jSONObject9 = jSONObject8.getJSONObject("fields");
            String str = null;
            this.l = jSONObject9 != null ? jSONObject9.getString("nick") : null;
            JSONObject jSONObject10 = jSONObject8.getJSONObject("fields");
            this.m = (jSONObject10 == null || (jSONObject7 = jSONObject10.getJSONObject("customerService")) == null) ? null : jSONObject7.getString("text");
            JSONObject jSONObject11 = jSONObject8.getJSONObject("fields");
            this.o = (jSONObject11 == null || (jSONObject6 = jSONObject11.getJSONObject("settingButton")) == null) ? null : jSONObject6.getString("text");
            JSONObject jSONObject12 = jSONObject8.getJSONObject("events");
            this.n = (jSONObject12 == null || (jSONObject4 = jSONObject12.getJSONObject("clickEvents")) == null || (jSONObject5 = jSONObject4.getJSONObject("openCustomerService")) == null) ? null : jSONObject5.getString("url");
            JSONObject jSONObject13 = jSONObject8.getJSONObject("events");
            if (!(jSONObject13 == null || (jSONObject2 = jSONObject13.getJSONObject("clickEvents")) == null || (jSONObject3 = jSONObject2.getJSONObject("openSetting")) == null)) {
                str = jSONObject3.getString("url");
            }
            this.p = str;
        }
    }

    public final void w(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0e9bd7", new Object[]{this, jSONObject});
        } else {
            this.h = jSONObject;
        }
    }

    public cr6(JSONObject jSONObject) {
        this.q = jSONObject;
        this.f = new JSONObject();
        b();
    }

    public final void b() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca249742", new Object[]{this});
            return;
        }
        JSONObject jSONObject2 = this.q;
        if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("data")) == null)) {
            this.c = jSONObject.getJSONObject("pagebackContext");
            JSONArray jSONArray = jSONObject.getJSONArray("hierarchy");
            if (jSONArray != null) {
                this.d = jSONArray;
                JSONObject jSONObject3 = jSONObject.getJSONObject("global");
                if (jSONObject3 != null) {
                    this.e = jSONObject3;
                    JSONObject jSONObject4 = jSONObject.getJSONObject("hierarchyData");
                    if (jSONObject4 != null) {
                        this.f = jSONObject4;
                        this.g = new JSONArray();
                        this.h = new JSONObject();
                        JSONArray jSONArray2 = this.d;
                        if (jSONArray2 != null) {
                            int size = jSONArray2.size();
                            for (int i = 0; i < size; i++) {
                                JSONArray jSONArray3 = this.d;
                                if (jSONArray3 != null) {
                                    JSONArray jSONArray4 = jSONArray3.getJSONArray(i);
                                    JSONArray jSONArray5 = this.g;
                                    if (jSONArray5 != null) {
                                        jSONArray5.addAll(jSONArray4);
                                        ckf.c(jSONArray4, "array");
                                        int size2 = jSONArray4.size();
                                        for (int i2 = 0; i2 < size2; i2++) {
                                            JSONObject jSONObject5 = jSONArray4.getJSONObject(i2);
                                            JSONObject jSONObject6 = this.h;
                                            if (jSONObject6 != null) {
                                                jSONObject6.put((JSONObject) jSONObject5.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME), (String) jSONObject5);
                                            } else {
                                                ckf.s();
                                                throw null;
                                            }
                                        }
                                    } else {
                                        ckf.s();
                                        throw null;
                                    }
                                } else {
                                    ckf.s();
                                    throw null;
                                }
                            }
                            u();
                            v(this.f);
                            this.f17256a = this.q;
                            this.b = Boolean.TRUE;
                            return;
                        }
                        ckf.s();
                        throw null;
                    }
                }
            }
        }
    }

    public final dbo q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dbo) ipChange.ipc$dispatch("fdf088de", new Object[]{this});
        }
        JSONArray jSONArray = this.g;
        if (jSONArray == null) {
            return new dbo(false, "mHierarchyListEmpty", "mHierarchyListEmpty");
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            String string = jSONArray.getJSONObject(i).getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
            boolean booleanValue = jSONArray.getJSONObject(i).getBooleanValue("ignoreCheck");
            if (!(this.f.containsKey(string) || booleanValue)) {
                return new dbo(false, string, string);
            }
        }
        return new dbo(true, null, null);
    }

    public final void t(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a6ecc7", new Object[]{this, jSONObject});
            return;
        }
        ckf.h(jSONObject, "steamData");
        JSONObject jSONObject2 = jSONObject.getJSONObject("pagebackContext");
        if (jSONObject2 != null) {
            this.c = jSONObject2;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("hierarchy");
        if (jSONArray != null) {
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONArray jSONArray3 = jSONArray.getJSONArray(i);
                jSONArray2.addAll(jSONArray3);
                ckf.c(jSONArray3, "array");
                int size2 = jSONArray3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
                    jSONObject3.put((JSONObject) jSONObject4.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME), (String) jSONObject4);
                }
            }
            this.d = jSONArray;
            this.g = jSONArray2;
            this.h = jSONObject3;
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject("global");
        if (jSONObject5 != null) {
            this.e = jSONObject5;
            u();
        }
        JSONObject jSONObject6 = jSONObject.getJSONObject("hierarchyData");
        if (jSONObject6 != null) {
            this.f.putAll(jSONObject6);
            v(jSONObject6);
        }
    }

    public /* synthetic */ cr6(JSONObject jSONObject, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : jSONObject);
    }
}
