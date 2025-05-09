package com.taobao.android.detail.alittdetail.implementor;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.megadesign.viewpager.CustomTabLayout;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.taobao.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bw3;
import tb.dhn;
import tb.e28;
import tb.egn;
import tb.ein;
import tb.ew3;
import tb.f28;
import tb.h36;
import tb.h9;
import tb.hjh;
import tb.ihn;
import tb.ir;
import tb.jov;
import tb.llq;
import tb.lnm;
import tb.mlq;
import tb.mpl;
import tb.mr7;
import tb.n4l;
import tb.plq;
import tb.q84;
import tb.t2o;
import tb.tgh;
import tb.vbl;
import tb.xpc;
import tb.zao;
import tb.ze7;
import tb.zfm;
import tb.zre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OpenPopDialogImplementor implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openPopDialog";

    /* renamed from: a  reason: collision with root package name */
    public final FragmentActivity f6561a;
    public final ze7 b;
    public RuntimeAbilityParam[] c;
    public Map<Integer, egn> d;
    public long e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends mlq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -490060912) {
                super.b((JSONObject) objArr[0]);
                return null;
            } else if (hashCode == -370124907) {
                super.a((JSONObject) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/alittdetail/implementor/OpenPopDialogImplementor$1");
            }
        }

        @Override // tb.mlq, tb.uv2
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9f05795", new Object[]{this, jSONObject});
            } else {
                super.a(jSONObject);
            }
        }

        @Override // tb.mlq, tb.uv2
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2ca4390", new Object[]{this, jSONObject});
                return;
            }
            super.b(jSONObject);
            q84.f(OpenPopDialogImplementor.b(OpenPopDialogImplementor.this), ew3.a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements CustomTabLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.megadesign.viewpager.CustomTabLayout.a
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e95a2058", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            tgh.b("OpenPopDialogImplementor", "curIndex=" + i + ", lastIndex=" + i2);
            if (i >= 0) {
                egn egnVar = (egn) OpenPopDialogImplementor.c(OpenPopDialogImplementor.this).get(Integer.valueOf(i));
                if (egnVar != null) {
                    egnVar.d(Integer.valueOf(i), Integer.valueOf(i2));
                }
                egn egnVar2 = (egn) OpenPopDialogImplementor.c(OpenPopDialogImplementor.this).get(Integer.valueOf(i2));
                if (egnVar2 != null) {
                    egnVar2.e(Integer.valueOf(i), Integer.valueOf(i2));
                }
            }
        }

        @Override // com.taobao.android.megadesign.viewpager.CustomTabLayout.a
        public void b(int i, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4df45be8", new Object[]{this, new Integer(i), view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends mlq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -490060912) {
                super.b((JSONObject) objArr[0]);
                return null;
            } else if (hashCode == -370124907) {
                super.a((JSONObject) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/alittdetail/implementor/OpenPopDialogImplementor$4");
            }
        }

        @Override // tb.mlq, tb.uv2
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9f05795", new Object[]{this, jSONObject});
            } else {
                super.a(jSONObject);
            }
        }

        @Override // tb.mlq, tb.uv2
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2ca4390", new Object[]{this, jSONObject});
                return;
            }
            super.b(jSONObject);
            q84.f(OpenPopDialogImplementor.b(OpenPopDialogImplementor.this), bw3.a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends mlq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(OpenPopDialogImplementor openPopDialogImplementor) {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -967711883) {
                super.c((JSONObject) objArr[0]);
                return null;
            } else if (hashCode == -490060912) {
                super.b((JSONObject) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/alittdetail/implementor/OpenPopDialogImplementor$5");
            }
        }

        @Override // tb.mlq, tb.uv2
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2ca4390", new Object[]{this, jSONObject});
            } else {
                super.b(jSONObject);
            }
        }

        @Override // tb.mlq
        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c651e375", new Object[]{this, jSONObject});
            } else {
                super.c(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e extends mlq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(OpenPopDialogImplementor openPopDialogImplementor) {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -490060912) {
                super.b((JSONObject) objArr[0]);
                return null;
            } else if (hashCode == -370124907) {
                super.a((JSONObject) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/alittdetail/implementor/OpenPopDialogImplementor$6");
            }
        }

        @Override // tb.mlq, tb.uv2
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9f05795", new Object[]{this, jSONObject});
            } else {
                super.a(jSONObject);
            }
        }

        @Override // tb.mlq, tb.uv2
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2ca4390", new Object[]{this, jSONObject});
            } else {
                super.b(jSONObject);
            }
        }
    }

    static {
        t2o.a(354418743);
        t2o.a(912261826);
    }

    public OpenPopDialogImplementor(Context context, ze7 ze7Var) {
        if (context instanceof FragmentActivity) {
            this.f6561a = (FragmentActivity) context;
        }
        this.b = ze7Var;
    }

    public static /* synthetic */ FragmentActivity b(OpenPopDialogImplementor openPopDialogImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("579a8444", new Object[]{openPopDialogImplementor});
        }
        return openPopDialogImplementor.f6561a;
    }

    public static /* synthetic */ Map c(OpenPopDialogImplementor openPopDialogImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e796ac11", new Object[]{openPopDialogImplementor});
        }
        return openPopDialogImplementor.d;
    }

    public final String d(String str, String str2) {
        Item item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0e0accc", new Object[]{this, str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("token", this.b.i().b());
        hashMap.put("itemId", this.b.i().c("requestItemId"));
        if (vbl.b() && (item = (Item) this.b.e().f(Item.class)) != null) {
            hashMap.put("subItemId", item.getSubItemId());
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("popId", str2);
        }
        return jov.a(str, hashMap);
    }

    public final mpl e(JSONObject jSONObject, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpl) ipChange.ipc$dispatch("cf2beb62", new Object[]{this, jSONObject, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        String string = jSONObject.getString("title");
        if (TextUtils.isEmpty(string)) {
            tgh.b("OpenPopDialogImplementor", "multiTabNative title is empty");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("detailClientParams");
        if (jSONObject2 == null || jSONObject2.isEmpty() || !"rate".equals(jSONObject2.getString("bizId"))) {
            return null;
        }
        return new mpl.a(string).c(m(jSONObject2, i, i2, i3).a()).a();
    }

    public final mpl f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpl) ipChange.ipc$dispatch("a88bbb7f", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("title");
        if (TextUtils.isEmpty(string)) {
            tgh.b("OpenPopDialogImplementor", "multiTabWeex title is empty");
            return null;
        }
        String string2 = jSONObject.getString("url");
        if (TextUtils.isEmpty(string2)) {
            tgh.b("OpenPopDialogImplementor", "multiTabWeex url is empty");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("exParams");
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2 != null) {
            jSONObject3 = jSONObject2.getJSONObject("content");
        }
        return new mpl.a(string).d(d(string2, null)).b(jSONObject3).a();
    }

    public final plq g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (plq) ipChange.ipc$dispatch("f01d8386", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        plq plqVar = new plq();
        plqVar.q(jSONObject.getFloatValue("maxHeight"));
        plqVar.r(jSONObject.getBooleanValue("panEnable"));
        plqVar.k(jSONObject.getString("backgroundColor"));
        plqVar.o(l(jSONObject.getString("gravity")));
        plqVar.j("tbDetail");
        if (jSONObject.getBooleanValue("showBottomBar")) {
            plqVar.p(new zfm(0.0f, 0.0f, 0.0f, (float) i()));
        }
        return plqVar;
    }

    public final JSONObject h(JSONObject jSONObject) {
        JSONObject p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("62a427a2", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return (!jSONObject.getBooleanValue("useBizData") || (p = DataUtils.p(this.b)) == null) ? jSONObject : p.getJSONObject(jSONObject.getString("bizDataKey"));
        }
        tgh.b("OpenPopDialogImplementor", "bizData is empty");
        return null;
    }

    public final long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8d156f4", new Object[]{this})).longValue();
        }
        View findViewById = this.f6561a.findViewById(R.id.ll_tt_detail_bottom_bar);
        if (findViewById != null) {
            return mr7.j(findViewById.getHeight());
        }
        return 0L;
    }

    public final JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1c20aa4a", new Object[]{this});
        }
        Object[] e2 = e28.e(this.c);
        if (e2 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (e2.length < 1) {
            return jSONObject;
        }
        Object obj = e2[0];
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        try {
            return JSON.parseObject(JSON.toJSONString(obj));
        } catch (Exception e3) {
            tgh.c("OpenPopDialogImplementor", "get dx extraArgs exception", e3);
            return jSONObject;
        }
    }

    public final JSONObject k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4432fd70", new Object[]{this, jSONObject});
        }
        JSONObject j = j();
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
            if (j != null) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject2.putAll(j);
            }
            return jSONObject2;
        } else if (j == null) {
            return null;
        } else {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putAll(j);
            return jSONObject3;
        }
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        tgh.b("OpenPopDialogImplementor", xpc.RECORD_EXECUTE);
        this.e = System.currentTimeMillis();
        if (irVar == null) {
            tgh.b("OpenPopDialogImplementor", "event is null");
            return false;
        }
        JSONObject a2 = irVar.a();
        if (a2 == null) {
            tgh.b("OpenPopDialogImplementor", "fields is null");
            return false;
        } else if (this.f6561a == null) {
            tgh.b("OpenPopDialogImplementor", "mActivity is null");
            return false;
        } else if (!"true".equalsIgnoreCase(a2.getString(ICallService.KEY_NEED_LOGIN)) || hjh.c()) {
            this.c = runtimeAbilityParamArr;
            JSONArray jSONArray = a2.getJSONArray("bizDataList");
            if (jSONArray == null || jSONArray.isEmpty()) {
                tgh.b("OpenPopDialogImplementor", "bizDataList is empty");
                return false;
            }
            JSONObject jSONObject = a2.getJSONObject(h9.KEY_POP_CONFIG);
            this.d = new HashMap();
            if (jSONArray.size() == 1) {
                return q(jSONObject, jSONArray.getJSONObject(0));
            }
            return o(jSONObject, jSONArray);
        } else {
            hjh.d(true);
            tgh.b("OpenPopDialogImplementor", "need login");
            return false;
        }
    }

    public final egn m(JSONObject jSONObject, int i, int i2, int i3) {
        egn egnVar;
        dhn dhnVar;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (egn) ipChange.ipc$dispatch("2b393c12", new Object[]{this, jSONObject, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        ir irVar = new ir(new JSONObject(jSONObject) { // from class: com.taobao.android.detail.alittdetail.implementor.OpenPopDialogImplementor.3
            public final /* synthetic */ JSONObject val$clientParams;

            {
                this.val$clientParams = jSONObject;
                put("fields", (Object) jSONObject);
            }
        });
        boolean z = i2 == i3;
        JSONObject f = ein.f(this.c);
        String str = "pop";
        if (f == null || !f.getBooleanValue("enableDataModelOpt") || !vbl.c0()) {
            if (z) {
                dhnVar = ein.s(irVar, true, this.e, this.c);
            } else {
                dhnVar = ein.s(irVar, true, this.e, new RuntimeAbilityParam[0]);
            }
            if (i > 1) {
                str = dhn.POP_MULTI_TAB;
            }
            dhnVar.u(str);
            dhnVar.s(z);
            egnVar = ein.o(this.b, dhnVar);
        } else {
            dhn dhnVar2 = new dhn();
            dhnVar2.r(this.e);
            if (i > 1) {
                str = dhn.POP_MULTI_TAB;
            }
            dhnVar2.u(str);
            dhnVar2.s(z);
            if (z) {
                jSONObject2 = ein.r(this.b, dhnVar2, irVar, this.c);
            } else {
                jSONObject2 = ein.r(this.b, dhnVar2, irVar, new RuntimeAbilityParam[0]);
            }
            egnVar = ein.n(jSONObject2);
        }
        egnVar.j(Integer.valueOf(i2));
        ((HashMap) this.d).put(Integer.valueOf(i2), egnVar);
        FragmentActivity fragmentActivity = this.f6561a;
        if (fragmentActivity instanceof ihn) {
            ihn ihnVar = (ihn) fragmentActivity;
            if (ihnVar.X1()) {
                List<lnm> i22 = ihnVar.i2();
                egnVar.f(i22.get(0));
                i22.remove(0);
            }
        }
        return egnVar;
    }

    public final boolean n(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bbe7473", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        plq g = g(jSONObject);
        if (g == null) {
            return false;
        }
        g.t(jSONObject2.getString("title"));
        JSONObject jSONObject3 = jSONObject2.getJSONObject("dxConfig");
        if (jSONObject3 == null) {
            tgh.b("OpenPopDialogImplementor", "singleTab dx config is null");
            return false;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("template");
        if (jSONObject4 == null || jSONObject4.isEmpty()) {
            tgh.b("OpenPopDialogImplementor", "singleTab dx template is null");
            return false;
        }
        try {
            str = URLEncoder.encode(jSONObject4.getString("url"), "UTF-8");
        } catch (Exception e2) {
            tgh.c("OpenPopDialogImplementor", "templateUrl encode failed", e2);
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2 = "http://dinamicx.taobao.com/v3?name=" + jSONObject4.getString("name") + "&version=" + jSONObject4.getString("version") + "&url=" + str;
        f28 f28Var = new f28();
        f28Var.g(jSONObject3.getBooleanValue("downloadFirst"));
        f28Var.f(this.b.g().o());
        g.l(f28Var);
        tgh.b("OpenPopDialogImplementor", "singleTab dxUrl=" + str2);
        JSONObject k = k(jSONObject2.getJSONObject("exParams"));
        if (k != null) {
            k.put("popId", (Object) g.f());
        }
        g.x(this.f6561a, str2, new d(this), k);
        return true;
    }

    public final boolean o(JSONObject jSONObject, JSONArray jSONArray) {
        mpl mplVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40cd297b", new Object[]{this, jSONObject, jSONArray})).booleanValue();
        }
        llq llqVar = new llq();
        llqVar.f(jSONObject.getFloatValue("maxHeight"));
        llqVar.g(jSONObject.getBooleanValue("panEnable"));
        llqVar.b(jSONObject.getString("backgroundColor"));
        llqVar.c(l(jSONObject.getString("gravity")));
        String string = jSONObject.getString("defaultIndex");
        int parseInt = TextUtils.isEmpty(string) ? 0 : Integer.parseInt(string);
        llqVar.d(parseInt);
        if (jSONObject.getBooleanValue("showBottomBar")) {
            llqVar.e(new zfm(0.0f, 0.0f, 0.0f, (float) i()));
        }
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject h = h(jSONArray.getJSONObject(i));
            if (h == null || h.isEmpty()) {
                tgh.b("OpenPopDialogImplementor", "multiTab bizDataParams is empty");
            } else {
                String string2 = h.getString("renderType");
                if (TextUtils.isEmpty(string2)) {
                    tgh.b("OpenPopDialogImplementor", "multiTab renderType is empty");
                } else {
                    if (TextUtils.equals(string2, "Native")) {
                        mplVar = e(h, size, i, parseInt);
                    } else {
                        mplVar = (TextUtils.equals(string2, "Weex2.0") || TextUtils.equals(string2, "H5")) ? f(h) : null;
                    }
                    if (mplVar != null) {
                        arrayList.add(mplVar);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            tgh.b("OpenPopDialogImplementor", "multiTab panelPageUrlInfoList is empty");
            return false;
        }
        tgh.b("OpenPopDialogImplementor", "多tab评价fragment解析耗时 time=" + (System.currentTimeMillis() - currentTimeMillis));
        zao h2 = llqVar.h(this.f6561a, arrayList, new a(), new b());
        tgh.b("OpenPopDialogImplementor", "open multiTab popDialog isSuccess=" + h2.f32653a + ", errorCode=" + h2.b + ", errorMsg=" + h2.c);
        return true;
    }

    public final boolean p(egn egnVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4525a853", new Object[]{this, egnVar, jSONObject, jSONObject2})).booleanValue();
        }
        plq g = g(jSONObject);
        if (g == null) {
            return false;
        }
        g.n(n4l.DETAIL_COMMENT_FRAGMENT_TAG);
        g.t(jSONObject2.getString("title"));
        g.m(egnVar.b());
        zao u = g.u(this.f6561a, egnVar.a(), new c());
        tgh.b("OpenPopDialogImplementor", "open singleTab ratePopFragment isSuccess=" + u.f32653a + ", errorCode=" + u.b + ", errorMsg=" + u.c);
        return true;
    }

    public final boolean q(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10ae2b34", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        JSONObject h = h(jSONObject2);
        if (h == null || h.isEmpty()) {
            tgh.b("OpenPopDialogImplementor", "singleTab bizDataParams is empty");
            return false;
        }
        String string = h.getString("renderType");
        if (TextUtils.isEmpty(string)) {
            tgh.b("OpenPopDialogImplementor", "singleTab renderType is empty");
            return false;
        }
        if (TextUtils.equals(string, "Native")) {
            JSONObject jSONObject3 = h.getJSONObject("detailClientParams");
            if (jSONObject3 != null && !jSONObject3.isEmpty() && "rate".equals(jSONObject3.getString("bizId"))) {
                return p(m(jSONObject3, 1, 0, 0), jSONObject, h);
            }
        } else if (TextUtils.equals(string, "Weex2.0") || TextUtils.equals(string, "H5")) {
            return r(jSONObject, h);
        } else {
            if (TextUtils.equals(string, h36.TAG)) {
                return n(jSONObject, h);
            }
        }
        return false;
    }

    public final boolean r(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("862e0886", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        plq g = g(jSONObject);
        if (g == null) {
            return false;
        }
        g.t(jSONObject2.getString("title"));
        String string = jSONObject2.getString("url");
        if (TextUtils.isEmpty(string)) {
            tgh.b("OpenPopDialogImplementor", "singleTab weexUrl is empty");
            return false;
        }
        g.x(this.f6561a, d(string, g.f()), new e(this), k(jSONObject2.getJSONObject("exParams")));
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r7.equals("center") == false) goto L_0x002b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.android.stdpop.api.PopGravity l(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail.alittdetail.implementor.OpenPopDialogImplementor.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "59ab84a1"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            com.taobao.android.stdpop.api.PopGravity r7 = (com.taobao.android.stdpop.api.PopGravity) r7
            return r7
        L_0x0018:
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            r4 = 0
            if (r3 == 0) goto L_0x0020
            return r4
        L_0x0020:
            r7.hashCode()
            r3 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1383228885: goto L_0x005a;
                case -1364013995: goto L_0x0051;
                case 115029: goto L_0x0045;
                case 3317767: goto L_0x0039;
                case 108511772: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r0 = -1
            goto L_0x0064
        L_0x002d:
            java.lang.String r0 = "right"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0037
            goto L_0x002b
        L_0x0037:
            r0 = 4
            goto L_0x0064
        L_0x0039:
            java.lang.String r0 = "left"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0043
            goto L_0x002b
        L_0x0043:
            r0 = 3
            goto L_0x0064
        L_0x0045:
            java.lang.String r0 = "top"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x004f
            goto L_0x002b
        L_0x004f:
            r0 = 2
            goto L_0x0064
        L_0x0051:
            java.lang.String r1 = "center"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0064
            goto L_0x002b
        L_0x005a:
            java.lang.String r0 = "bottom"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0063
            goto L_0x002b
        L_0x0063:
            r0 = 0
        L_0x0064:
            switch(r0) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0071;
                case 2: goto L_0x006e;
                case 3: goto L_0x006b;
                case 4: goto L_0x0068;
                default: goto L_0x0067;
            }
        L_0x0067:
            return r4
        L_0x0068:
            com.taobao.android.stdpop.api.PopGravity r7 = com.taobao.android.stdpop.api.PopGravity.RIGHT
            return r7
        L_0x006b:
            com.taobao.android.stdpop.api.PopGravity r7 = com.taobao.android.stdpop.api.PopGravity.LEFT
            return r7
        L_0x006e:
            com.taobao.android.stdpop.api.PopGravity r7 = com.taobao.android.stdpop.api.PopGravity.TOP
            return r7
        L_0x0071:
            com.taobao.android.stdpop.api.PopGravity r7 = com.taobao.android.stdpop.api.PopGravity.CENTER
            return r7
        L_0x0074:
            com.taobao.android.stdpop.api.PopGravity r7 = com.taobao.android.stdpop.api.PopGravity.BOTTOM
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.alittdetail.implementor.OpenPopDialogImplementor.l(java.lang.String):com.taobao.android.stdpop.api.PopGravity");
    }
}
