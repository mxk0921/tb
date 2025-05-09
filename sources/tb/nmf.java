package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class nmf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public JSONObject A;
    public JSONArray B;

    /* renamed from: a  reason: collision with root package name */
    public int f24825a;
    public Map<String, String> b;
    public String c;
    public JSONObject d;
    public JSONObject e;
    public boolean f;
    public JSONObject g;
    public JSONObject i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final List<String> h = new ArrayList();
    public boolean t = true;
    public boolean u = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297113);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        public final void a(JSONObject jSONObject, nmf nmfVar) {
            JSONArray c;
            JSONObject d;
            String i;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e5d5057", new Object[]{this, jSONObject, nmfVar});
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("combos");
            if (jSONArray == null) {
                nmfVar.N(true);
            } else if (jSONArray.size() == 0) {
                nmfVar.N(true);
            } else {
                Object obj = jSONArray.get(0);
                if (obj instanceof String) {
                    nmfVar.N(true);
                    nmfVar.R(ckf.b("notSafe", jSONArray.get(0)));
                } else if ((obj instanceof JSONObject) && (c = h19.c((JSONObject) obj, "pages")) != null && !c.isEmpty()) {
                    int i3 = 4;
                    if (c.size() <= 4) {
                        i3 = c.size();
                    }
                    while (i2 < i3) {
                        i2++;
                        Object obj2 = c.get(i2);
                        if ((obj2 instanceof JSONObject) && (d = h19.d((JSONObject) obj2, "itemPic")) != null && (i = h19.i(d, "src", "")) != null && !TextUtils.isEmpty(i)) {
                            nmfVar.e().add(i);
                        }
                    }
                }
            }
        }

        @JvmStatic
        public final nmf b(JSONObject jSONObject) {
            JSONObject d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nmf) ipChange.ipc$dispatch("f2fc467a", new Object[]{this, jSONObject});
            }
            nmf nmfVar = new nmf();
            if (jSONObject == null) {
                return nmfVar;
            }
            nmfVar.d0(jSONObject);
            nmfVar.M(jSONObject.getJSONObject("data"));
            if (!(nmfVar.d() == null || (d = nmfVar.d()) == null)) {
                JSONArray c = h19.c(d, "result");
                nmfVar.J(!(c == null || c.isEmpty()));
                nmfVar.f0(d.getString("tfs"));
                nmfVar.W(d.getString(yj4.PARAM_PVID));
                nmfVar.P(h19.c(d, "boxList"));
                nmfVar.T(d.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO));
                JSONObject k = nmfVar.k();
                if (k != null) {
                    nmfVar.V(k.getString("pltSession"));
                    JSONObject jSONObject2 = k.getJSONObject("pltSession");
                    if (jSONObject2 != null) {
                        nmfVar.Z(h19.e(jSONObject2, "needStrimg", true));
                    }
                    nmfVar.U(k.getJSONObject("pltInfo"));
                    JSONObject l = nmfVar.l();
                    if (l != null) {
                        nmfVar.g0(h19.d(l, "weakIntentionBarInfo"));
                        nmfVar.E(h19.d(l, "aiSearchBarInfo"));
                        if (TextUtils.isEmpty(nmfVar.w())) {
                            nmfVar.f0(l.getString("tfskey"));
                        }
                        nmfVar.S(l.getString("oss"));
                        nmfVar.c0(l.getString(yj4.PARAM_SEARCH_KEYWORD_RN));
                        nmfVar.H(l.getString("bboxes_str"));
                        nmfVar.Y(l.getString("region"));
                        nmfVar.F(l.getString(HiAnalyticsConstant.HaKey.BI_KEY_APPID));
                        nmfVar.X(l.getString("reach_time"));
                        nmfVar.Q(l.getString("invalidQReason"));
                        nmfVar.K(h19.e(l, "closeImageTextSearch", false));
                        JSONObject jSONObject3 = l.getJSONObject("trace");
                        if (jSONObject3 != null) {
                            nmfVar.O(jSONObject3.getString("for_bts"));
                        }
                        nmfVar.G(h19.e(l, "isAutoPullUpResult", true));
                        JSONObject d2 = h19.d(l, "listHeaderBGConfig");
                        if (d2 != null) {
                            nmfVar.I(h19.i(d2, "bgImgUrl", ""));
                        }
                    }
                }
                if (nmfVar.z()) {
                    nmf.Companion.a(d, nmfVar);
                }
            }
            return nmfVar;
        }
    }

    static {
        t2o.a(481297112);
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77cce7ad", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dc33c7f", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58594ccb", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public final boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f8fea61", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public final void E(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5c7246", new Object[]{this, jSONObject});
        }
    }

    public final void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197796cb", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public final void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39cc301f", new Object[]{this, new Boolean(z)});
        } else {
            this.u = z;
        }
    }

    public final void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16770dc", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public final void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a295424", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public final void J(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb840fb", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc4c2013", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public final void L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3717ff81", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public final void M(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    public final void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54bd3e25", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public final void O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e72748", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public final void P(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db944b2", new Object[]{this, jSONArray});
        } else {
            this.B = jSONArray;
        }
    }

    public final void Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb014fb1", new Object[]{this, str});
        } else {
            this.s = str;
        }
    }

    public final void R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57342faf", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    public final void S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc199a1e", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public final void T(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a34e084a", new Object[]{this, jSONObject});
        } else {
            this.g = jSONObject;
        }
    }

    public final void U(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f211bdc5", new Object[]{this, jSONObject});
        } else {
            this.i = jSONObject;
        }
    }

    public final void V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363f6211", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    public final void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf17394", new Object[]{this, str});
        }
    }

    public final void X(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a58c6c", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public final void Y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ed3c07", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public final void Z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb90a1df", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da36ad73", new Object[]{this});
        }
        return this.n;
    }

    public final void a0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac43116", new Object[]{this, new Integer(i)});
        } else {
            this.f24825a = i;
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("570c51da", new Object[]{this});
        }
        return this.k;
    }

    public final void b0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3f498b", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63971892", new Object[]{this});
        }
        return this.v;
    }

    public final void c0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b60e4f", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public final JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.e;
    }

    public final void d0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9177db42", new Object[]{this, jSONObject});
        } else {
            this.d = jSONObject;
        }
    }

    public final List<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a5125d52", new Object[]{this});
        }
        return this.h;
    }

    public final void e0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef6ce265", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d267f56", new Object[]{this});
        }
        return this.q;
    }

    public final void f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f793bf1", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public final JSONArray g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("f592a968", new Object[]{this});
        }
        return this.B;
    }

    public final void g0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a705fba", new Object[]{this, jSONObject});
        } else {
            this.A = jSONObject;
        }
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("499e9e65", new Object[]{this});
        }
        return this.s;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5be68855", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee5f60c0", new Object[]{this});
        }
        return this.j;
    }

    public final JSONObject k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3e68ff7a", new Object[]{this});
        }
        return this.g;
    }

    public final JSONObject l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f00a5637", new Object[]{this});
        }
        return this.i;
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7186e605", new Object[]{this});
        }
        return this.r;
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ed4844a", new Object[]{this});
        }
        return this.o;
    }

    public final String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c01b4f", new Object[]{this});
        }
        return this.l;
    }

    public final int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7175e374", new Object[]{this})).intValue();
        }
        return this.f24825a;
    }

    public final Map<String, String> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ce7e99fb", new Object[]{this});
        }
        return this.b;
    }

    public final String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ed80607", new Object[]{this});
        }
        return this.m;
    }

    public final String t() {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4f89105", new Object[]{this});
        }
        JSONObject jSONObject = this.i;
        if (jSONObject == null || (d = h19.d(jSONObject, "queryPicItem")) == null) {
            return "";
        }
        String i = h19.i(d, "picUrl", "");
        ckf.f(i, "parseString(queryPicItem, \"picUrl\", \"\")");
        if (TextUtils.isEmpty(i)) {
            return "";
        }
        return ckf.p(lg4.G2(), i);
    }

    public final JSONObject u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("62038082", new Object[]{this});
        }
        return this.d;
    }

    public final String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44a33131", new Object[]{this});
        }
        return this.c;
    }

    public final String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41f7625", new Object[]{this});
        }
        return this.p;
    }

    public final JSONObject x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("601a2c0a", new Object[]{this});
        }
        return this.A;
    }

    public final boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2eb04a21", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3b7e3c5", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final Integer[] s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer[]) ipChange.ipc$dispatch("18f2916b", new Object[]{this});
        }
        Integer[] numArr = {640, 640};
        JSONObject d = h19.d(this.i, "queryPicItem");
        if (d == null) {
            return numArr;
        }
        if (qrl.e(d.getString("w"), 640) == 0) {
            numArr[0] = 640;
        }
        if (qrl.e(d.getString("h"), 640) == 0) {
            numArr[1] = 640;
        }
        return numArr;
    }
}
