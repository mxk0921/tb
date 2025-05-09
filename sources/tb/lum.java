package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.preposefilter.perf.RecyclerPreposeFilterBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lum extends zx1<RecyclerPreposeFilterBean, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final b4x b = new b4x();
    public static final h8j c = new h8j();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23575a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793753);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793752);
    }

    public lum(boolean z) {
        this.f23575a = z;
    }

    public static /* synthetic */ Object ipc$super(lum lumVar, String str, Object... objArr) {
        if (str.hashCode() == 1738546442) {
            lumVar.k((JSONObject) objArr[0], (BaseTypedBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/preposefilter/PreposeFilterParser");
    }

    @Override // tb.dx
    public Class<RecyclerPreposeFilterBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return RecyclerPreposeFilterBean.class;
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_prepose_filter";
    }

    /* renamed from: l */
    public RecyclerPreposeFilterBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerPreposeFilterBean) ipChange.ipc$dispatch("ff4dbf42", new Object[]{this});
        }
        return new RecyclerPreposeFilterBean();
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e1c0b96", new Object[]{this})).booleanValue();
        }
        return this.f23575a;
    }

    public final Map<String, String> n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5551f7cc", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null) {
                hashMap.put(key, value.toString());
            }
        }
        return hashMap;
    }

    /* renamed from: o */
    public void i(JSONObject jSONObject, RecyclerPreposeFilterBean recyclerPreposeFilterBean, CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa68747", new Object[]{this, jSONObject, recyclerPreposeFilterBean, commonSearchResult});
            return;
        }
        ckf.g(jSONObject, "beanObject");
        ckf.g(recyclerPreposeFilterBean, "bean");
        k(jSONObject, recyclerPreposeFilterBean, commonSearchResult);
        recyclerPreposeFilterBean.setTraceMap(n(h19.d(jSONObject, "traceMap")));
        recyclerPreposeFilterBean.setMultiValueKeys(t(jSONObject));
        recyclerPreposeFilterBean.setButtonList(q(jSONObject, commonSearchResult, recyclerPreposeFilterBean.getMultiValueKeys()));
        recyclerPreposeFilterBean.setRefreshAll(jSONObject.getBooleanValue("refreshAll"));
    }

    public final List<dum> r(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bf406961", new Object[]{this, jSONArray});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && !jSONArray.isEmpty()) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                dum s = s(jSONArray.getJSONObject(i));
                if (s != null) {
                    arrayList.add(s);
                }
            }
        }
        return arrayList;
    }

    public final dum s(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dum) ipChange.ipc$dispatch("f943f5ae", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        dum dumVar = new dum();
        dumVar.o(jSONObject.getString("showText"));
        dumVar.r(jSONObject.getString("tailText"));
        dumVar.m(jSONObject.getString("promptText"));
        dumVar.s(jSONObject.getString("topText"));
        dumVar.n(jSONObject.getBooleanValue(mf6.TYPE_SELECTED));
        dumVar.k(jSONObject.getString("icon"));
        dumVar.j(jSONObject.getString("h5Url"));
        dumVar.u(jSONObject.getString("type"));
        dumVar.l(u(h19.c(jSONObject, "params")));
        dumVar.p(r(h19.c(jSONObject, "subData")));
        dumVar.q(v(jSONObject));
        dumVar.t(n(h19.d(jSONObject, "traceMap")));
        return dumVar;
    }

    public final List<String> t(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b4b251bd", new Object[]{this, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray c2 = h19.c(jSONObject, r4p.KEY_MULTI_VALUE_KEYS);
        if (c2 == null) {
            return arrayList;
        }
        int size = c2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(c2.getString(i));
        }
        return arrayList;
    }

    public final aum p(JSONObject jSONObject, CommonSearchResult commonSearchResult, List<String> list) {
        String c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aum) ipChange.ipc$dispatch("ab6f28b0", new Object[]{this, jSONObject, commonSearchResult, list});
        }
        if (jSONObject == null) {
            return null;
        }
        aum aumVar = new aum();
        aumVar.b0(jSONObject.getString("type"));
        if (m() && ckf.b(jSONObject.getString("leftBar"), "1")) {
            aumVar.b0("leftBar");
            aumVar.Q(jSONObject);
        }
        if (m()) {
            aumVar.E(jSONObject.getString("filterType"));
            aumVar.K(jSONObject.getString("mode"));
        }
        aumVar.Z(jSONObject.getString("showText"));
        aumVar.U(jSONObject.getBooleanValue(mf6.TYPE_SELECTED));
        aumVar.S(u(h19.c(jSONObject, "params")));
        aumVar.T(h19.e(jSONObject, "scrollTop", false));
        JSONObject d = h19.d(jSONObject, "subList");
        String str = "";
        if (d != null) {
            bum bumVar = new bum();
            String string = jSONObject.getString("mode");
            if (string == null) {
                string = PromotionFilterBean.MULTI;
            }
            bumVar.d(string);
            String string2 = d.getString("tItemType");
            if (string2 == null) {
                string2 = str;
            }
            bumVar.f(string2);
            bumVar.e(r(h19.c(d, "data")));
            aumVar.D(bumVar);
            if (m() && bumVar.b().isEmpty()) {
                aumVar.D(null);
            }
        }
        JSONObject d2 = h19.d(jSONObject, "style");
        aumVar.R(d2);
        if (d2 != null) {
            if (!m() || !d2.containsKey("textColor")) {
                aumVar.P(d2.getString("normalTextColor"));
            } else {
                aumVar.P(d2.getString("textColor"));
                aumVar.M(d2.getString(vaj.KEY_BG_COLOR));
            }
            aumVar.M(d2.getString("normalBgColor"));
            aumVar.N(d2.getString("normalBorderColor"));
            aumVar.Y(d2.getString("selectedTextColor"));
            aumVar.V(d2.getString("selectedBgColor"));
            aumVar.W(d2.getString("selectedBorderColor"));
            aumVar.G(d2.getString("icon"));
            aumVar.B(d2.getBooleanValue("bold"));
            aumVar.O(d2.getString("normalImgUrl"));
            aumVar.X(d2.getString("selectedImgUrl"));
            aumVar.I(Integer.valueOf(d2.getIntValue("imgHeight")));
            aumVar.J(Integer.valueOf(d2.getIntValue("imgWidth")));
            aumVar.H(p1p.a(qrl.e(d2.getString("iconSize"), 0) / 2.0f));
        }
        aumVar.a0(n(h19.d(jSONObject, "traceMap")));
        JSONObject d3 = h19.d(jSONObject, "dropBean");
        if (d3 != null) {
            aumVar.C((WeexBean) b.f(d3, commonSearchResult));
        }
        BEAN f = c.f(jSONObject, commonSearchResult);
        ckf.d(f);
        aumVar.L((MuiseBean) f);
        JSONObject jSONObject2 = aumVar.k().model;
        ckf.f(jSONObject2, "model");
        jSONObject2.put((JSONObject) r4p.KEY_MULTI_VALUE_KEYS, (String) list);
        MuiseBean k = aumVar.k();
        bum c3 = aumVar.c();
        if (!(c3 == null || (c2 = c3.c()) == null)) {
            str = c2;
        }
        k.type = str;
        return aumVar;
    }

    public final ArrayList<aum> q(JSONObject jSONObject, CommonSearchResult commonSearchResult, List<String> list) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("18373ea3", new Object[]{this, jSONObject, commonSearchResult, list});
        }
        ArrayList<aum> arrayList = new ArrayList<>();
        if (m()) {
            jSONArray = h19.c(jSONObject, "data");
            if (jSONArray == null && (jSONArray = h19.c(jSONObject, "sortTagData")) == null) {
                return arrayList;
            }
        } else {
            jSONArray = h19.c(jSONObject, "data");
            if (jSONArray == null) {
                return arrayList;
            }
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            aum p = p(jSONArray.getJSONObject(i), commonSearchResult, list);
            if (p != null) {
                arrayList.add(p);
            }
        }
        return arrayList;
    }

    public final Map<String, String> u(JSONArray jSONArray) {
        String string;
        String string2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cde7cb7d", new Object[]{this, jSONArray});
        }
        HashMap hashMap = new HashMap();
        if (jSONArray == null) {
            return hashMap;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (!(jSONObject == null || (string = jSONObject.getString("key")) == null || (string2 = jSONObject.getString("value")) == null)) {
                hashMap.put(string, string2);
            }
        }
        return hashMap;
    }

    public final List<String> v(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b23a74a", new Object[]{this, jSONObject});
        }
        JSONArray c2 = h19.c(jSONObject, "tag");
        if (c2 == null || c2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = c2.size();
        for (int i = 0; i < size; i++) {
            String string = c2.getString(i);
            if (!TextUtils.isEmpty(string)) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }
}
