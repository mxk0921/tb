package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lh2 implements vxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BootImageInfo d;
    public JSONObject f;

    /* renamed from: a  reason: collision with root package name */
    public final List<JSONObject> f23333a = new ArrayList();
    public final List<JSONObject> b = new ArrayList();
    public final List<JSONObject> c = new ArrayList();
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements kmc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23334a;
        public final /* synthetic */ List b;

        /* compiled from: Taobao */
        /* renamed from: tb.lh2$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C0981a extends TypeReference<ArrayList<JSONObject>> {
            public C0981a(a aVar) {
            }
        }

        public a(lh2 lh2Var, String str, List list) {
            this.f23334a = str;
            this.b = list;
        }

        @Override // tb.kmc
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7839eaea", new Object[]{this, str});
            } else if (!TextUtils.isEmpty(str)) {
                tm1.a("2ARCH_BizDataFlow", "loadFromCache key " + this.f23334a);
                try {
                    ArrayList arrayList = (ArrayList) JSON.parseObject(str, new C0981a(this), new Feature[0]);
                    if (arrayList != null && !arrayList.isEmpty()) {
                        this.b.addAll(arrayList);
                    }
                } catch (Exception e) {
                    tm1.b("2ARCH_BizDataFlow", "loadFromCache error " + this.f23334a, e);
                }
            }
        }
    }

    static {
        t2o.a(736100373);
        t2o.a(736100376);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba69422e", new Object[]{this});
            return;
        }
        ((ArrayList) this.f23333a).clear();
        ((ArrayList) this.b).clear();
        kt2.c().b(nwi.BIZ_CODE);
        kt2.c().b("TopView");
        k9h.c();
    }

    @Override // tb.vxb
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e90d432f", new Object[]{this, jSONObject});
            return;
        }
        JSONObject m = ph2.m(jSONObject);
        if (m == null) {
            e();
            tm1.a("2ARCH_BizDataFlow", "updateSplashData base null");
        } else if (!ph2.a(m)) {
            tm1.a("2ARCH_BizDataFlow", "updateSplashData updateOriginalSplashData");
            s(m);
        } else {
            tm1.a("2ARCH_BizDataFlow", "updateSplashData updateGeneralSplashData");
            r(m);
        }
    }

    @Override // tb.vxb
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d752af", new Object[]{this});
            return;
        }
        this.e.set(false);
        l(nwi.BIZ_CODE, this.f23333a);
        l("TopView", this.b);
        l("Market", this.c);
        k9h.j();
        o();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7540c1b0", new Object[]{this});
            return;
        }
        ((ArrayList) this.c).clear();
        kt2.c().b("Market");
        k9h.d();
    }

    public final void f(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a49cbcf", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("ext");
        if (jSONObject3 != null) {
            String string = jSONObject3.getString("advLimitSeconds");
            String string2 = jSONObject3.getString("advLimitInSingleDay");
            JSONObject jSONObject4 = jSONObject2.getJSONObject("ext");
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
            }
            if (!TextUtils.isEmpty(string)) {
                jSONObject4.put("advLimitSeconds", (Object) string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject4.put("advLimitInSingleDay", (Object) string2);
            }
        }
    }

    public List<JSONObject> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ed2d000b", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f23333a);
        arrayList.addAll(this.b);
        arrayList.addAll(this.c);
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r6.equals(tb.nwi.BIZ_CODE) == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.alibaba.fastjson.JSONObject> i(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.lh2.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "2d236dc5"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.util.List r6 = (java.util.List) r6
            return r6
        L_0x0018:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1997438884: goto L_0x0039;
                case 524744146: goto L_0x0030;
                case 524834170: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0043
        L_0x0025:
            java.lang.String r0 = "TopView"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002e
            goto L_0x0023
        L_0x002e:
            r0 = 2
            goto L_0x0043
        L_0x0030:
            java.lang.String r1 = "TopShow"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0043
            goto L_0x0023
        L_0x0039:
            java.lang.String r0 = "Market"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0042
            goto L_0x0023
        L_0x0042:
            r0 = 0
        L_0x0043:
            switch(r0) {
                case 0: goto L_0x0052;
                case 1: goto L_0x004f;
                case 2: goto L_0x004c;
                default: goto L_0x0046;
            }
        L_0x0046:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            return r6
        L_0x004c:
            java.util.List<com.alibaba.fastjson.JSONObject> r6 = r5.b
            return r6
        L_0x004f:
            java.util.List<com.alibaba.fastjson.JSONObject> r6 = r5.f23333a
            return r6
        L_0x0052:
            java.util.List<com.alibaba.fastjson.JSONObject> r6 = r5.c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lh2.i(java.lang.String):java.util.List");
    }

    public BootImageInfo j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInfo) ipChange.ipc$dispatch("b3d9a773", new Object[]{this});
        }
        return this.d;
    }

    public final String k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6318e7d5", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null) {
            tm1.a("2ARCH_BizDataFlow", "updateAwesomeData sections null");
            return "";
        } else if (jSONObject2.containsKey("searchText") || jSONObject2.containsKey(rr6.TYPE_POPVIEW)) {
            return nwi.BIZ_CODE;
        } else {
            if (jSONObject2.containsKey(rr6.TYPE_BANNER)) {
                return "TopView";
            }
            tm1.a("2ARCH_BizDataFlow", "getBizType ext 为空，且section 不包含 banner/searchText/popView 无法兜底");
            return "";
        }
    }

    public final void l(String str, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cc8fb4", new Object[]{this, str, list});
        } else {
            kt2.c().d(str, new a(this, str, list));
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea470ec9", new Object[]{this});
            return;
        }
        tm1.a("2ARCH_BizDataFlow", "闪屏流程流程：onTerminate:enableUpdateData reUpdateAwesomeData");
        o();
    }

    public final void o() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf12438", new Object[]{this});
            return;
        }
        this.e.set(true);
        StringBuilder sb = new StringBuilder("BootImageBizDataFlow:reUpdateAwesomeData data is null:");
        if (this.f == null) {
            z = true;
        }
        sb.append(z);
        tm1.a("2ARCH_BizDataFlow", sb.toString());
        JSONObject jSONObject = this.f;
        if (jSONObject != null) {
            b(jSONObject);
            usg.d().a().c(1001);
            this.f = null;
        }
    }

    public final void p(String str, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae355709", new Object[]{this, str, list});
        } else if (list != null && !list.isEmpty()) {
            tm1.a("2ARCH_BizDataFlow", "saveData key " + str);
            kt2.c().f(str, list);
            k9h.f(str, list);
        }
    }

    public void q(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621082d5", new Object[]{this, bootImageInfo});
        } else {
            this.d = bootImageInfo;
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        tm1.a("2ARCH_BizDataFlow", "闪屏流程流程：onStart:enableUpdateData wait");
        this.e.set(false);
    }

    @Override // tb.vxb
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55dc7a5", new Object[]{this, jSONObject});
        } else if (!this.e.get()) {
            this.f = jSONObject;
            tm1.a("2ARCH_BizDataFlow", "闪屏流程流程：updateAwesomeData wait load ");
        } else {
            tm1.a("2ARCH_BizDataFlow", "闪屏流程流程：updateAwesomeData clearAwesomeBizData");
            a();
            if (jSONObject == null) {
                tm1.a("2ARCH_BizDataFlow", "updateAwesomeData data null clear data");
                k9h.e(nwi.BIZ_CODE);
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("sections");
            if (jSONArray == null || jSONArray.isEmpty()) {
                k9h.e(nwi.BIZ_CODE);
                tm1.a("2ARCH_BizDataFlow", "updateAwesomeData sections null");
                return;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String h = h(jSONObject2);
                if (TextUtils.equals(h, nwi.BIZ_CODE) && jSONObject2 != null) {
                    f(jSONObject, jSONObject2);
                    jSONObject2.put("sceneType", nwi.BIZ_CODE);
                    ((ArrayList) this.f23333a).add(jSONObject2);
                    qhg.b(true);
                }
                if (TextUtils.equals(h, "TopView") && jSONObject2 != null) {
                    jSONObject2.put("sceneType", "TopView");
                    ((ArrayList) this.b).add(jSONObject2);
                    qhg.a(qhg.TOP_VIEW_CACHE, true);
                }
            }
            p(nwi.BIZ_CODE, this.f23333a);
            p("TopView", this.b);
        }
    }

    public final void s(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b65121e", new Object[]{this, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("sections");
        if (jSONArray == null || jSONArray.isEmpty()) {
            tm1.a("2ARCH_BizDataFlow", "updateSplashData sections null");
            return;
        }
        e();
        usg.d().e().d("Market", "HotStart", wzi.SPLASH_REQUEST_SUCCESS, null, null, "");
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            jSONObject2.put("enableGeneralSplash", (Object) Boolean.FALSE);
            jSONObject2.put("sceneType", "Market");
            ((ArrayList) this.c).add(jSONObject2);
        }
        qhg.a(qhg.MARKET_CACHE, true);
        p("Market", this.c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        if (r5.equals("taobaoSplashMarketing") == false) goto L_0x0063;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h(com.alibaba.fastjson.JSONObject r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.lh2.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "d141107a"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            java.lang.Object r8 = r3.ipc$dispatch(r4, r2)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L_0x0018:
            java.lang.String r3 = ""
            java.lang.String r4 = "2ARCH_BizDataFlow"
            if (r8 != 0) goto L_0x0024
            java.lang.String r8 = "getBizType section null"
            tb.tm1.a(r4, r8)
            return r3
        L_0x0024:
            java.lang.String r5 = "ext"
            com.alibaba.fastjson.JSONObject r5 = r8.getJSONObject(r5)
            if (r5 != 0) goto L_0x0036
            java.lang.String r0 = "getBizType ext null"
            tb.tm1.a(r4, r0)
            java.lang.String r8 = r7.k(r8)
            return r8
        L_0x0036:
            java.lang.String r6 = "businessCode"
            java.lang.String r5 = r5.getString(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x0047
            java.lang.String r8 = r7.k(r8)
            return r8
        L_0x0047:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r6 = "getBizType businessCode "
            r8.<init>(r6)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            tb.tm1.a(r4, r8)
            r5.hashCode()
            r8 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case -2119828674: goto L_0x007b;
                case 571799665: goto L_0x0071;
                case 1759301740: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            r0 = -1
            goto L_0x0086
        L_0x0065:
            java.lang.String r0 = "taobaoTopview"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x006f
            goto L_0x0063
        L_0x006f:
            r0 = 2
            goto L_0x0086
        L_0x0071:
            java.lang.String r1 = "taobaoSplashMarketing"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0086
            goto L_0x0063
        L_0x007b:
            java.lang.String r0 = "taobaoSplashAdv"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0085
            goto L_0x0063
        L_0x0085:
            r0 = 0
        L_0x0086:
            switch(r0) {
                case 0: goto L_0x0090;
                case 1: goto L_0x008d;
                case 2: goto L_0x008a;
                default: goto L_0x0089;
            }
        L_0x0089:
            return r3
        L_0x008a:
            java.lang.String r8 = "TopView"
            return r8
        L_0x008d:
            java.lang.String r8 = "Market"
            return r8
        L_0x0090:
            java.lang.String r8 = "TopShow"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lh2.h(com.alibaba.fastjson.JSONObject):java.lang.String");
    }

    public final void r(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18516159", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 != null) {
            boolean booleanValue = jSONObject2.getBooleanValue("updateTopshowSplash");
            boolean booleanValue2 = jSONObject2.getBooleanValue("updateMarketingSplash");
            JSONObject jSONObject3 = jSONObject.getJSONObject("topViewSplashSection");
            if (jSONObject3 == null) {
                if (booleanValue) {
                    k9h.e(nwi.BIZ_CODE);
                }
                if (booleanValue2) {
                    k9h.e("Market");
                }
                tm1.a("2ARCH_BizDataFlow", "updateGeneralSplashData topViewSplash null");
                return;
            }
            usg.d().e().d("Market", "HotStart", wzi.SPLASH_REQUEST_SUCCESS, null, null, "");
            if (booleanValue) {
                a();
            }
            if (booleanValue2) {
                e();
            }
            JSONArray jSONArray = jSONObject3.getJSONArray("sections");
            if (jSONArray == null || jSONArray.isEmpty()) {
                tm1.a("2ARCH_BizDataFlow", "updateGeneralSplashData sections null");
                return;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                String h = h(jSONObject4);
                if (jSONObject4 != null) {
                    jSONObject4.put("sceneType", (Object) h);
                    jSONObject4.put("enableGeneralSplash", (Object) Boolean.TRUE);
                }
                if (TextUtils.equals(h, nwi.BIZ_CODE) && booleanValue) {
                    ((ArrayList) this.f23333a).add(jSONObject4);
                    qhg.b(true);
                }
                if (TextUtils.equals(h, "Market") && booleanValue2) {
                    ((ArrayList) this.c).add(jSONObject4);
                    qhg.a(qhg.MARKET_CACHE, true);
                }
            }
            if (booleanValue) {
                p(nwi.BIZ_CODE, this.f23333a);
            }
            if (booleanValue2) {
                p("Market", this.c);
            }
        }
    }
}
