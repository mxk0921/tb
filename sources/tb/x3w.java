package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.android.detail2.core.framework.data.model.CardInnerCommonNode;
import com.taobao.android.detail2.core.framework.data.model.CardUTArgs;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;
import com.ut.share.utils.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class x3w {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CONTEXT_DATA_HALF_HEIGHT = "halfHeight";
    public static final String KEY_CONTEXT_DATA_SCREEN_HEIGHT = "screenHeight";
    public static final String KEY_ENABLE_LEFT_SCROLL_TO_SECOND_PAGE = "enable_native_slide";
    public static final String KEY_GUIDE_TPP_ERROR = "guideTppError";
    public static final String KEY_GUIDE_TPP_ERROR_OPEN_IMMEDIATELY = "guideTppErrorOpenImmediately";
    public static final String KEY_ND_OPEN_TYPE = "ndOpenType";
    public static final String KEY_NEW_CARD_DATA = "newCardData";
    public static final String KEY_NEW_DETAIL_VISIBLE_BLOCK_HEIGHT = "screenHeight";
    public static final String KEY_NEW_DETAIL_VISIBLE_BLOCK_RATIO = "screenRadio";
    public static final String KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH = "screenWidth";
    public static final String KEY_OPEN_IMMEDIATELY_DATA = "openImmediatelyData";
    public static final String OPEN_TYPE_MVP = "mvp";
    public static final String k0 = "simpleDeliverData";
    public static final String l0 = "openImmedData";
    public static final String m0 = "realData";
    public static final String n0 = "itemNodeCurrentDataMode";
    public boolean I;
    public final com.taobao.android.detail2.core.framework.data.global.a J;
    public JSONObject K;
    public JSONObject L;
    public JSONObject M;
    public JSONObject N;
    public JSONObject O;
    public JSONArray P;
    public String Q;
    public int R;
    public JSONArray S;
    public JSONObject W;
    public boolean X;
    public String Y;

    /* renamed from: a  reason: collision with root package name */
    public int f31127a;
    public CardUTArgs a0;
    public String b;
    public JSONObject b0;
    public String c;
    public w4m c0;
    public JSONObject d;
    public JSONObject e;
    public JSONObject e0;
    public String f;
    public JSONObject f0;
    public boolean g;
    public JSONObject g0;
    public String h;
    public JSONObject h0;
    public String i;
    public String i0;
    public JSONObject j;
    public JSONObject k;
    public HashMap<String, String> l;
    public String o;
    public JSONObject p;
    public JSONObject q;
    public CardInnerCommonNode r;
    public JSONObject s;
    public String y0;
    public String m = "";
    public String n = "";
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public final List<a> x = new ArrayList();
    public final HashMap<String, String> y = new HashMap<>();
    public boolean z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public final List<String> D = new ArrayList();
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public boolean T = true;
    public final List<seo> U = new ArrayList();
    public List<ueo> V = new ArrayList();
    public boolean Z = false;
    public final JSONObject d0 = new JSONObject();
    public long j0 = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f31128a;
        public String b;
        public boolean c;

        static {
            t2o.a(352321805);
        }
    }

    public x3w(com.taobao.android.detail2.core.framework.data.global.a aVar) {
        this.J = aVar;
        O();
    }

    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef33226a", new Object[]{this});
        }
        JSONObject jSONObject = this.j;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("utLogMap");
    }

    public JSONObject B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("75308389", new Object[]{this});
        }
        JSONObject jSONObject = this.K;
        if (jSONObject == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("feature");
        if (jSONObject2 == null) {
            return new JSONObject();
        }
        return jSONObject2;
    }

    public com.taobao.android.detail2.core.framework.data.global.a C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("4acc6a70", new Object[]{this});
        }
        return this.J;
    }

    public HashMap<String, String> D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a1897d0f", new Object[]{this});
        }
        return this.l;
    }

    public JSONObject E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("242e5926", new Object[]{this});
        }
        JSONObject jSONObject = this.d0.getJSONObject("navRefreshParam");
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public JSONObject F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2e22f7ed", new Object[]{this});
        }
        JSONObject jSONObject = this.e0;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public JSONArray G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("a9994ecc", new Object[]{this});
        }
        JSONObject jSONObject = this.h0;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONArray("images");
    }

    public JSONObject H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("447a59d1", new Object[]{this});
        }
        return this.g0;
    }

    public JSONArray I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("ce2fa9ec", new Object[]{this});
        }
        JSONObject jSONObject = this.h0;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONArray("videos");
    }

    public String J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c735e537", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.n)) {
            return this.n;
        }
        return this.m;
    }

    public String K() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c6289", new Object[]{this});
        }
        JSONObject jSONObject2 = this.K;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("seller")) == null) {
            return "";
        }
        return jSONObject.getString("sellerId");
    }

    public String L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e930a84b", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(this.c)) {
            return str;
        }
        return this.c;
    }

    public JSONObject M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4a7d3cb9", new Object[]{this});
        }
        JSONObject jSONObject = this.k;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = this.j;
        if (jSONObject2 == null) {
            return new JSONObject();
        }
        return jSONObject2;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c8d80a6", new Object[]{this})).booleanValue();
        }
        if (this.p != null) {
            return true;
        }
        return false;
    }

    public String N0() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c633800e", new Object[]{this});
        }
        JSONObject jSONObject2 = this.K;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("item")) == null) {
            return null;
        }
        return jSONObject.getString("itemId");
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67cd9ad0", new Object[]{this});
        } else {
            b(KEY_ENABLE_LEFT_SCROLL_TO_SECOND_PAGE, Boolean.TRUE);
        }
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0903e26", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd6fe056", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("251bc49b", new Object[]{this})).booleanValue();
        }
        return this.T;
    }

    public void T(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185e233e", new Object[]{this, jSONObject});
        } else {
            this.W = jSONObject;
        }
    }

    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae2892e", new Object[]{this});
        } else {
            this.v = true;
        }
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fb7989", new Object[]{this});
        } else {
            this.u = true;
        }
    }

    public abstract void W(JSONObject jSONObject);

    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9dcbc8", new Object[]{this});
        }
    }

    public void Y(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51851c9", new Object[]{this, cardInnerCommonNode});
        }
    }

    public final int Z(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3e77a6c", new Object[]{this, jSONObject})).intValue();
        }
        AtmosParams o = this.J.o();
        if (o != null && o.showAtmos && !TextUtils.isEmpty(o.atmosColor)) {
            try {
                return Color.parseColor(o.atmosColor);
            } catch (Exception e) {
                String str = "atmosColor解析错误，nid:" + this.J.u() + ", colorStr: " + o.atmosColor;
                txj.f("new_detail异常", str, e);
                q0j.p(q0j.SCENE_ENTRANCE_ATMOS, q0j.ERROR_CODE_ATMOS_COLOR_PARSE_ERROR, str, C().T());
            }
        }
        String string = jSONObject.getString("naviBarColor");
        this.Q = string;
        if (TextUtils.isEmpty(string)) {
            return -16777216;
        }
        try {
            return Color.parseColor(this.Q);
        } catch (Exception e2) {
            txj.f("new_detail异常", "naviBarColor解析错误", e2);
            return -16777216;
        }
    }

    public abstract CardInnerCommonNode a();

    public void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1aeac5", new Object[]{this, str, obj});
        } else {
            this.d0.put(str, obj);
        }
    }

    public final void b0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb56a12", new Object[]{this, jSONObject});
        } else {
            this.p = jSONObject.getJSONObject("detailInfo");
        }
    }

    public final void c(CardInnerCommonNode cardInnerCommonNode) {
        AtmosParams o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9efd898", new Object[]{this, cardInnerCommonNode});
        } else if (cardInnerCommonNode != null && cardInnerCommonNode.containerInfo != null && C() != null && (o = C().o()) != null && o.showAtmos) {
            ((HashMap) cardInnerCommonNode.containerInfo.c).put("showAtmos", "true");
        }
    }

    public final void c0() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2993c", new Object[]{this});
            return;
        }
        JSONObject jSONObject2 = this.d;
        if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject(AtmosParams.KEY_ATMOS_FEED_PARAMS)) == null)) {
            C().V0(jSONObject);
        }
        d();
    }

    public void d() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3203f7cc", new Object[]{this});
        } else if (C().o() != null && (jSONObject = this.p) != null) {
            jSONObject.putAll(C().o().mRootData);
        }
    }

    public final void d0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3532a55b", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.K = jSONObject.getJSONObject("biz");
            JSONObject jSONObject2 = jSONObject.getJSONObject("view");
            this.M = jSONObject2;
            if (jSONObject2 != null) {
                this.L = jSONObject2.getJSONObject("naviBar");
                this.N = this.M.getJSONObject(q0j.SCENE_MAIN_PAGE_FLOAT);
                this.O = this.M.getJSONObject("mainPic");
            }
            JSONObject jSONObject3 = this.O;
            if (jSONObject3 != null) {
                this.P = jSONObject3.getJSONArray("cardInfos");
            }
            JSONObject jSONObject4 = this.N;
            if (jSONObject4 != null) {
                jSONObject4.getJSONArray("cardInfos");
            }
            JSONObject jSONObject5 = this.L;
            if (jSONObject5 != null) {
                a0(jSONObject5);
            }
        }
    }

    public final void e(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef829439", new Object[]{this, cardInnerCommonNode});
        } else if (vv6.a()) {
            ((HashMap) cardInnerCommonNode.containerInfo.c).put("autoTestInfo", C().R().s);
        }
    }

    public void e0(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47156bf0", new Object[]{this, cardInnerCommonNode});
            return;
        }
        i(cardInnerCommonNode);
        c(cardInnerCommonNode);
        g(cardInnerCommonNode);
        f(cardInnerCommonNode);
        e(cardInnerCommonNode);
        h(cardInnerCommonNode);
    }

    public final void f(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2cb41b", new Object[]{this, cardInnerCommonNode});
        } else {
            ((HashMap) cardInnerCommonNode.containerInfo.c).put("preloadDetailData", "true");
        }
    }

    public final void f0(JSONObject jSONObject, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e37103f", new Object[]{this, jSONObject, new Boolean(z), new Boolean(z2)});
            return;
        }
        m0(C().R().g);
        this.d0.put("optimizeConfig", (Object) this.J.M().a(C().R().x));
        this.d0.put("simpleDeliverData", (Object) this.J.Y());
        this.d0.put("navOpenImmediatelyData", (Object) Boolean.valueOf(z2));
        if (C().N().n()) {
            String B = C().B();
            String C = C().N().C();
            if (!TextUtils.isEmpty(C)) {
                B = C;
            }
            txj.e(txj.TAG_INSIDE_DETAIL, "initDetailListener processContextData = sourceToken。" + B);
            this.d0.put("feedToken", (Object) C().B());
        }
        if (z) {
            txj.e(txj.TAG_FAST_ANIM, "processContextData isSlowWeexBg");
            this.d0.put("slowAnimWeexBg", (Object) "true");
            this.d0.put("slowAnimWeexBgTime", (Object) byj.T0());
        }
        if (r19.z0() || r19.F0()) {
            this.d0.put("ndWeexLowerSwitch", (Object) this.J.H());
        }
        this.p.put("context", (Object) this.d0);
        this.d0.put("queryPassExpParam", (Object) C().T());
        JSONObject jSONObject2 = jSONObject.getJSONObject("context");
        if (jSONObject2 != null) {
            this.d0.putAll(jSONObject2);
            this.f0 = jSONObject2.getJSONObject("cardPassExpParam");
            this.g0 = jSONObject2.getJSONObject("preloadPassParams");
        }
    }

    public final void g(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3acb779", new Object[]{this, cardInnerCommonNode});
        } else {
            ((HashMap) cardInnerCommonNode.containerInfo.c).put("enableOpenSKUWithRequest", "true");
        }
    }

    public final void h(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd4d7cf", new Object[]{this, cardInnerCommonNode});
            return;
        }
        if (C().D0()) {
            ((HashMap) cardInnerCommonNode.containerInfo.c).put("isOpenImmediatelyMode", "true");
        }
        if (this.c0 != null) {
            ((HashMap) cardInnerCommonNode.containerInfo.c).put("hasPlaceHolderImageCache", String.valueOf(C().I().a(x()).a()));
        }
    }

    public final void i(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513248d0", new Object[]{this, cardInnerCommonNode});
            return;
        }
        if (C().u0()) {
            ((HashMap) cardInnerCommonNode.containerInfo.c).put("halfGuide", "true");
        }
        if (C().m()) {
            ((HashMap) cardInnerCommonNode.containerInfo.c).put("disableHalfScreenGuide", "true");
        }
    }

    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6e5255", new Object[]{this});
        } else if (this.J.N().u0() && this.J.M().b(C().R().x)) {
            this.r.dataContext = new JSONObject();
            JSONObject jSONObject = new JSONObject();
            this.r.dataContext.put("context", (Object) jSONObject);
            jSONObject.put("optimizeConfig", (Object) this.J.M().a(C().R().x));
            jSONObject.put("simpleDeliverData", (Object) this.J.Y());
        }
    }

    public boolean j(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d74bebf", new Object[]{this, x3wVar})).booleanValue();
        }
        if (x3wVar != null && Objects.equals(this.h, x3wVar.h) && this.f31127a == x3wVar.f31127a) {
            return true;
        }
        return false;
    }

    public boolean k(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8227a77d", new Object[]{this, x3wVar})).booleanValue();
        }
        if (x3wVar != null && this == x3wVar) {
            return true;
        }
        return false;
    }

    public final void l(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d31298", new Object[]{this, cardInnerCommonNode});
            return;
        }
        cardInnerCommonNode.dataContext = this.e;
        cardInnerCommonNode.dataContextNode = this;
        cardInnerCommonNode.nid = this.h;
    }

    public void l0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b075ca2", new Object[]{this, str, str2});
            return;
        }
        HashMap<String, String> hashMap = this.l;
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.l = hashMap;
        }
        hashMap.put(str, str2);
    }

    public void m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99802034", new Object[]{this, jSONObject});
            return;
        }
        this.e0 = jSONObject;
        this.d0.put("pagePassExpParam", (Object) jSONObject);
    }

    public void m0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9dbf83", new Object[]{this, new Long(j)});
            return;
        }
        JSONObject jSONObject = this.d0.getJSONObject("timing");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            this.d0.put("timing", (Object) jSONObject);
        }
        jSONObject.put("click", (Object) Long.valueOf(j));
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a887132", new Object[]{this})).booleanValue();
        }
        boolean z = this.Z;
        this.Z = false;
        return z;
    }

    public void n0(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7f061d", new Object[]{this, cxjVar});
            return;
        }
        b(KEY_CONTEXT_DATA_HALF_HEIGHT, Float.valueOf(rra.c(cxjVar)));
        b("screenHeight", Integer.valueOf(z83.a(cxjVar.j().K().c(), C())));
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1b0a55", new Object[]{this});
        } else {
            this.l = null;
        }
    }

    public void o0(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9baebb6", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        JSONObject jSONObject = this.d0.getJSONObject("timing");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            this.d0.put("timing", (Object) jSONObject);
        }
        if (this.j0 == -1 || z) {
            this.j0 = j;
            jSONObject.put("instanceStart", (Object) Long.valueOf(j));
            jSONObject.put("urlInconsistent", (Object) String.valueOf(z));
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c831c5", new Object[]{this});
        } else {
            this.k = null;
        }
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7c8dd60", new Object[]{this})).booleanValue();
        }
        return "true".equals(B().getString("enableHalfScreenZoom"));
    }

    public void q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd02409", new Object[]{this});
            return;
        }
        this.e = null;
        this.p = null;
        this.r = null;
        X();
    }

    public CardInnerCommonNode r(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardInnerCommonNode) ipChange.ipc$dispatch("ba4522f6", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        CardInnerCommonNode cardInnerCommonNode = new CardInnerCommonNode(jSONObject);
        l(cardInnerCommonNode);
        e0(cardInnerCommonNode);
        return cardInnerCommonNode;
    }

    public void r0(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffcabd5", new Object[]{this, str});
            return;
        }
        txj.e(txj.TAG_RENDER, this + "setCurrentDataMode: " + str);
        CardInnerCommonNode cardInnerCommonNode = this.r;
        if (cardInnerCommonNode != null && (jSONObject = cardInnerCommonNode.dataContext) != null) {
            jSONObject.put(n0, (Object) str);
        }
    }

    public void s0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd613364", new Object[]{this, str});
            return;
        }
        u0(str);
        i0();
    }

    public CardInnerCommonNode t(CardInnerCommonNode cardInnerCommonNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardInnerCommonNode) ipChange.ipc$dispatch("82d59042", new Object[]{this, cardInnerCommonNode, str});
        }
        if (cardInnerCommonNode == null) {
            cardInnerCommonNode = new CardInnerCommonNode(null);
        }
        l(cardInnerCommonNode);
        if (cardInnerCommonNode.containerInfo == null) {
            cardInnerCommonNode.containerInfo = new z4x();
        }
        cardInnerCommonNode.containerInfo.d(str);
        e0(cardInnerCommonNode);
        return cardInnerCommonNode;
    }

    public void t0(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca10025e", new Object[]{this, str, jSONObject});
            return;
        }
        v0(jSONObject, true);
        u0(str);
    }

    public JSONObject u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3ce3aa6e", new Object[]{this});
        }
        JSONObject jSONObject = this.f0;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public final void u0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f2d9ad", new Object[]{this, str});
            return;
        }
        CardInnerCommonNode t = t(this.r, str);
        this.r = t;
        Y(t);
    }

    public CardUTArgs v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardUTArgs) ipChange.ipc$dispatch("2f49e623", new Object[]{this});
        }
        return this.a0;
    }

    public JSONObject w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08129b1", new Object[]{this});
        }
        JSONObject jSONObject = this.b0;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public void w0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("befbbf77", new Object[]{this, str});
            return;
        }
        this.Y = str;
        q0j.b(this, q0j.BIZ_CONTEXT_KEY_RECOMMEND_TRACE_ID, str);
    }

    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2461cb13", new Object[]{this});
        }
        w4m w4mVar = this.c0;
        if (w4mVar == null) {
            return "";
        }
        String a2 = w4mVar.a();
        NewDetailScreenConfig K = C().K();
        if (K == null) {
            return a2;
        }
        NewDetailScreenConfig.ScreenType a3 = K.a();
        if (a3 == null) {
            return a2;
        }
        String uIStrategyTag = a3.getUIStrategyTag();
        if (TextUtils.isEmpty(uIStrategyTag)) {
            return a2;
        }
        return a2 + "-" + uIStrategyTag;
    }

    public void x0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10266dd6", new Object[]{this, jSONObject});
            return;
        }
        this.k = jSONObject;
        if (jSONObject != null) {
            this.n = jSONObject.getString("scm");
            this.k.remove("scm");
        }
    }

    public final JSONArray y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("8f7c3775", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(JSON.parseObject("{\"btnType\":\"normal\",\"fields\":{\"iconFont\":\"\\ua04a\",\"url\":\"https://h5.m.taobao.com/awp/base/cart.htm?cartfrom=detail\",\"urlParams\":{}}}"));
        jSONArray.add(JSON.parseObject("{\"btnType\":\"more\",\"fields\":{\"iconFont\":\"\\ua06d\",\"showShare\":\"false\"}}"));
        return jSONArray;
    }

    public String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33e8f833", new Object[]{this});
        }
        return this.i0;
    }

    public final void g0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca84c97", new Object[]{this, jSONObject});
            return;
        }
        txj.e(txj.TAG_RENDER, this + "processMVPCardData");
        if (jSONObject != null && this.p != null) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("newCard");
            if (jSONObject3 == null) {
                txj.e(txj.TAG_RENDER, this + "processMVPCardData newCardData == null");
                return;
            }
            JSONObject jSONObject4 = (JSONObject) jSONObject3.clone();
            JSONObject jSONObject5 = jSONObject4.getJSONObject("placeHolderComponent");
            if (jSONObject5 != null) {
                this.c0 = new w4m(jSONObject5);
                this.t = true;
            }
            JSONObject jSONObject6 = jSONObject4.getJSONObject("data");
            if (jSONObject6 != null && (jSONObject2 = jSONObject6.getJSONObject("mainPic")) != null) {
                p0(jSONObject2);
                this.p.put(KEY_NEW_CARD_DATA, (Object) jSONObject2);
                this.p.put(KEY_ND_OPEN_TYPE, (Object) OPEN_TYPE_MVP);
            }
        }
    }

    public final void h0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d1bf7e", new Object[]{this, jSONObject});
            return;
        }
        txj.e(txj.TAG_RENDER, this + "processNewCardData");
        JSONObject jSONObject3 = jSONObject.getJSONObject("newCard");
        if (this.p == null || jSONObject3 == null) {
            txj.e(txj.TAG_RENDER, this + "processNewCardData newCardData == null");
            return;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("placeHolderComponent");
        if (jSONObject4 != null) {
            this.c0 = new w4m(jSONObject4);
            this.t = true;
        }
        JSONObject jSONObject5 = jSONObject3.getJSONObject("data");
        if (jSONObject5 != null && (jSONObject2 = jSONObject5.getJSONObject("mainPic")) != null) {
            this.p.put(KEY_NEW_CARD_DATA, (Object) jSONObject2);
        }
    }

    public void j0(JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb006c6", new Object[]{this, jSONObject, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (jSONObject != null) {
            this.w = z3;
            String str = this.b;
            if (str != null && !str.equals(jSONObject.getString("type"))) {
                this.Z = true;
            }
            this.d = jSONObject;
            this.b = jSONObject.getString("type");
            this.c = jSONObject.getString("subType");
            this.h = jSONObject.getString("nid");
            this.y0 = jSONObject.getString("entryNDNid");
            String string = jSONObject.getString("xExposed");
            this.o = string;
            if (string == null) {
                txj.e(txj.TAG_TIP, "无法获取到 xExposed 字段。mNid:" + this.h + " mSubType:" + this.c);
            }
            this.i = jSONObject.getString("complexId");
            this.j = jSONObject.getJSONObject("args");
            jSONObject.getJSONObject("ext");
            "y".equals(jSONObject.getString("cardFixed"));
            this.X = "y".equals(jSONObject.getString("realtimeFixed"));
            JSONObject jSONObject3 = this.j;
            if (jSONObject3 != null) {
                this.m = jSONObject3.getString("scm");
                this.j.remove("scm");
            }
            this.q = jSONObject.getJSONObject("extraData");
            jSONObject.getJSONObject("exportData");
            b0(jSONObject);
            JSONObject jSONObject4 = this.q;
            if (!(jSONObject4 == null || (jSONObject2 = this.p) == null)) {
                jSONObject2.put("rcmdExtraData", (Object) jSONObject4);
            }
            this.b0 = jSONObject.getJSONObject("cardUTArgs");
            this.a0 = new CardUTArgs(this.b0);
            this.h0 = jSONObject.getJSONObject("preloadResources");
            if (z) {
                g0(jSONObject);
            } else {
                h0(jSONObject);
            }
            c0();
            f0(jSONObject, z2, z3);
            JSONObject jSONObject5 = this.p;
            this.e = jSONObject5;
            d0(jSONObject5);
            W(this.p);
            this.r = a();
        }
    }

    public void k0(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5fbea65", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        j0(jSONObject, z, false, false);
        JSONObject jSONObject2 = this.e;
        if (jSONObject2 != null) {
            jSONObject2.put(KEY_GUIDE_TPP_ERROR_OPEN_IMMEDIATELY, (Object) "true");
        }
    }

    public final void v0(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628ab607", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            this.s = jSONObject2;
            jSONObject2.put(KEY_OPEN_IMMEDIATELY_DATA, (Object) jSONObject);
            this.s.put(KEY_GUIDE_TPP_ERROR, (Object) String.valueOf(z));
            this.e = this.s;
        } else if (C().H0()) {
            q0j.f(this, q0j.SCENE_OPEN_IMMEDIATELY, q0j.ERROR_CODE_OPEN_IMMEDIATELY_DATA_EMPTY, "", false);
        }
    }

    public boolean P() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff351749", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.K;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject(DnsPreference.KEY_TRADE)) == null) {
            return false;
        }
        return !TextUtils.isEmpty(jSONObject.getString(Constants.WEIBO_REDIRECTURL_KEY));
    }

    public final void a0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a5772f", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.R = Z(jSONObject);
            JSONArray jSONArray = jSONObject.getJSONArray("rightBtnList");
            this.S = jSONArray;
            if (jSONArray == null) {
                this.S = y();
            }
            ((ArrayList) this.U).clear();
            for (int i = 0; i < this.S.size(); i++) {
                ((ArrayList) this.U).add(new seo(this.S.getJSONObject(i), this.R, this));
            }
            if ("light".equals(jSONObject.getString("statusBarStyle"))) {
                this.T = false;
            } else {
                this.T = true;
            }
        }
    }

    public final void p0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f512ed", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject("page");
        if (!(jSONObject5 == null || (jSONObject2 = jSONObject5.getJSONObject("hierarchy")) == null || (jSONArray = jSONObject2.getJSONArray("root")) == null || jSONArray.isEmpty() || (jSONObject3 = jSONObject5.getJSONObject("container")) == null)) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject6 = jSONArray.getJSONObject(i);
                if (jSONObject6 != null && !jSONObject6.isEmpty() && (jSONObject4 = jSONObject3.getJSONObject(jSONObject6.getString("name"))) != null && "app_weex".equals(jSONObject4.getString("mode"))) {
                    jSONObject2.put("root", (Object) jSONObject6.getJSONArray("children"));
                }
            }
        }
    }

    public CardInnerCommonNode s(JSONObject jSONObject, Class<? extends CardInnerCommonNode> cls) {
        NoSuchMethodException e;
        IllegalAccessException e2;
        InstantiationException e3;
        InvocationTargetException e4;
        CardInnerCommonNode cardInnerCommonNode;
        CardInnerCommonNode cardInnerCommonNode2 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            try {
                cardInnerCommonNode = (CardInnerCommonNode) cls.getConstructor(JSONObject.class).newInstance(jSONObject);
            } catch (IllegalAccessException e5) {
                e2 = e5;
            } catch (InstantiationException e6) {
                e3 = e6;
            } catch (NoSuchMethodException e7) {
                e = e7;
            } catch (InvocationTargetException e8) {
                e4 = e8;
            }
        } catch (IllegalAccessException e9) {
            e2 = e9;
        } catch (InstantiationException e10) {
            e3 = e10;
        } catch (NoSuchMethodException e11) {
            e = e11;
        } catch (InvocationTargetException e12) {
            e4 = e12;
        }
        try {
            l(cardInnerCommonNode);
            e0(cardInnerCommonNode);
            return cardInnerCommonNode;
        } catch (IllegalAccessException e13) {
            e2 = e13;
            cardInnerCommonNode2 = cardInnerCommonNode;
            q0j.f(this, "main", "10013", "生成DetailCardInnerNode失败, IllegalAccessException", false);
            e2.printStackTrace();
            return cardInnerCommonNode2;
        } catch (InstantiationException e14) {
            e3 = e14;
            cardInnerCommonNode2 = cardInnerCommonNode;
            q0j.f(this, "main", "10013", "生成DetailCardInnerNode失败, InstantiationException", false);
            e3.printStackTrace();
            return cardInnerCommonNode2;
        } catch (NoSuchMethodException e15) {
            e = e15;
            cardInnerCommonNode2 = cardInnerCommonNode;
            q0j.f(this, "main", "10013", "生成DetailCardInnerNode失败, NoSuchMethodException", false);
            e.printStackTrace();
            return cardInnerCommonNode2;
        } catch (InvocationTargetException e16) {
            e4 = e16;
            cardInnerCommonNode2 = cardInnerCommonNode;
            q0j.f(this, "main", "10013", "生成DetailCardInnerNode失败, InvocationTargetException", false);
            e4.printStackTrace();
            return cardInnerCommonNode2;
        }
    }

    static {
        t2o.a(352321804);
    }
}
