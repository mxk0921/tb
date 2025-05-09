package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TBSkuWrapper;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.SkuCore;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.b5m;
import tb.bw7;
import tb.ctd;
import tb.hjh;
import tb.ir;
import tb.jns;
import tb.kns;
import tb.o6x;
import tb.r3q;
import tb.sv1;
import tb.t2o;
import tb.tgh;
import tb.vbl;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OpenSkuImplementor extends sv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openSKU";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_sku";

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f6817a = true;
    public volatile boolean b = false;
    public final Context c;
    public final ze7 d;
    public final TBSkuWrapper e;
    public volatile ctd f;
    public AliXSkuCore.m g;
    public final c h;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class AnonymousClass1 extends JSONObject {
        public final /* synthetic */ String val$from;
        public final /* synthetic */ String val$mode;

        public AnonymousClass1(String str, String str2) {
            this.val$mode = str;
            this.val$from = str2;
            put("type", OpenSkuImplementor.EVENT_TYPE);
            put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor.1.1
                {
                    put("params", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor.1.1.1
                        {
                            put("skuBottomMode", (Object) AnonymousClass1.this.val$mode);
                            put("from", (Object) AnonymousClass1.this.val$from);
                        }
                    });
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor$4  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class AnonymousClass4 implements AliXSkuCore.m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ctd f6818a;

        public AnonymousClass4(ctd ctdVar) {
            this.f6818a = ctdVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de17186a", new Object[]{this});
                return;
            }
            OpenSkuImplementor.c(OpenSkuImplementor.this).e().r(this.f6818a);
            tgh.b("OpenSkuImplementor", "sku面板关闭，移除可能的loading流式listener");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements b5m.a0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(String str, String str2) {
        }

        public void a(String str, String str2, boolean z, Map<String, Object> map) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("659687f7", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            StringBuilder sb = new StringBuilder("msoa 外投SKU调用失败, serviceId: msoa.taobao.detail.showsku version: 2.0 errCode: ");
            sb.append(str);
            sb.append(" errStr: ");
            sb.append(str2);
            sb.append(" args: ");
            if (map == null || map.isEmpty()) {
                str3 = "null";
            } else {
                str3 = JSON.toJSONString(map);
            }
            sb.append(str3);
            tgh.b("OpenSkuImplementor", sb.toString());
        }

        public void b(Map<String, Object> map) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else if (map == null || map.isEmpty()) {
                tgh.b("OpenSkuImplementor", "msoa 外投SKU调用成功，但返回数据为空");
            } else {
                if (map instanceof JSONObject) {
                    jSONObject = (JSONObject) map;
                } else {
                    jSONObject = JSON.parseObject(JSON.toJSONString(map));
                }
                if (!r3q.p(jSONObject, OpenSkuImplementor.c(OpenSkuImplementor.this))) {
                    tgh.b("OpenSkuImplementor", "msoa 外投SKU调用成功，但更新当前商品sku信息失败。skuReturnData= ");
                } else if (OpenSkuImplementor.d(OpenSkuImplementor.this) != null) {
                    OpenSkuImplementor.d(OpenSkuImplementor.this).a();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void a();
    }

    static {
        t2o.a(912261911);
    }

    public OpenSkuImplementor(Context context, ze7 ze7Var, TBSkuWrapper tBSkuWrapper, c cVar) {
        this.c = context;
        this.d = ze7Var;
        this.e = tBSkuWrapper;
        this.h = cVar;
    }

    public static /* synthetic */ ze7 c(OpenSkuImplementor openSkuImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("7ca1662e", new Object[]{openSkuImplementor});
        }
        return openSkuImplementor.d;
    }

    public static /* synthetic */ c d(OpenSkuImplementor openSkuImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f7106081", new Object[]{openSkuImplementor});
        }
        return openSkuImplementor.h;
    }

    public static /* synthetic */ boolean e(OpenSkuImplementor openSkuImplementor, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84d96b90", new Object[]{openSkuImplementor, new Boolean(z)})).booleanValue();
        }
        openSkuImplementor.b = z;
        return z;
    }

    public static /* synthetic */ void f(OpenSkuImplementor openSkuImplementor, ir irVar, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6f57ec", new Object[]{openSkuImplementor, irVar, jSONObject, new Boolean(z)});
        } else {
            openSkuImplementor.l(irVar, jSONObject, z);
        }
    }

    public static /* synthetic */ Context g(OpenSkuImplementor openSkuImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("300ddfc0", new Object[]{openSkuImplementor});
        }
        return openSkuImplementor.c;
    }

    public static ir h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ir) ipChange.ipc$dispatch("5dd56f5d", new Object[]{str, str2});
        }
        return new ir(new AnonymousClass1(str, str2));
    }

    public static String i(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("febdb", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("params")) == null) {
            return "ADDCART_AND_BUYNOW";
        }
        String string = jSONObject2.getString("skuBottomMode");
        String str = "ADDCART";
        if (!str.equals(string)) {
            str = "BUYNOW";
            if (!str.equals(string)) {
                if ("ADDCART_AND_BUYNOW".equals(string)) {
                    return "ADDCART_AND_BUYNOW";
                }
                str = "CONFIRM";
                if (!str.equals(string)) {
                    return "ADDCART_AND_BUYNOW";
                }
            }
        }
        return str;
    }

    public static /* synthetic */ Object ipc$super(OpenSkuImplementor openSkuImplementor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/bizhandlers/OpenSkuImplementor");
    }

    public static /* synthetic */ TBSkuWrapper k(OpenSkuImplementor openSkuImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSkuWrapper) ipChange.ipc$dispatch("c06a5aa1", new Object[]{openSkuImplementor});
        }
        return openSkuImplementor.e;
    }

    public static String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ec50431", new Object[]{str});
        }
        if ("ADDCART".equals(str)) {
            return "5";
        }
        if ("BUYNOW".equals(str)) {
            return "6";
        }
        if (!"ADDCART_AND_BUYNOW".equals(str) && "CONFIRM".equals(str)) {
            return "3";
        }
        return "0";
    }

    public static JSONObject n(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cffc663a", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("params")) == null) {
            return null;
        }
        return jSONObject2.getJSONObject("exParams");
    }

    public static String o(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5f7cffb", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("params")) == null) {
            return null;
        }
        return jSONObject2.getString("itemId");
    }

    @Override // tb.sv1
    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("93fe213d", new Object[]{this});
        }
        return new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor.5
            {
                put("SKULayerId", String.valueOf(OpenSkuImplementor.k(OpenSkuImplementor.this).z()));
            }
        };
    }

    public final String j() {
        SkuCore.c skuItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb1cd8e6", new Object[]{this});
        }
        SkuCore skuCore = (SkuCore) this.d.e().f(SkuCore.class);
        if (skuCore == null || (skuItem = skuCore.getSkuItem()) == null) {
            return null;
        }
        return skuItem.f();
    }

    public final void l(ir irVar, JSONObject jSONObject, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7306ba", new Object[]{this, irVar, jSONObject, new Boolean(z)});
            return;
        }
        jns jnsVar = (jns) this.d.e().e(kns.PARSER_ID);
        if (jnsVar != null) {
            this.e.K(jSONObject);
            this.e.C();
            if (this.f6817a) {
                str = (String) this.d.i().c("lastPageSetSkuId");
            } else {
                str = null;
            }
            JSONObject a2 = irVar.a();
            String i = i(a2);
            if (!z && "BUYNOW".equalsIgnoreCase(i)) {
                String j = j();
                if (!TextUtils.isEmpty(j)) {
                    o6x.i(this.c, "onSKUEntryClick", j, this.d.i().b());
                }
            }
            this.e.M(i, str, p(a2), r3q.g((Feature) jnsVar.t(Feature.class)));
            if (z) {
                this.e.H();
            }
            this.f6817a = false;
        }
    }

    public final String p(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88ccabe8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("params")) == null) {
            return null;
        }
        return jSONObject2.getString("from");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements ctd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ir f6819a;

        public b(ir irVar) {
            this.f6819a = irVar;
        }

        @Override // tb.ctd
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            tgh.b("OpenSkuImplementor", "拉起sku添加流式listener, 回调失败, retCode=" + str + ", retMsg=" + str2);
            OpenSkuImplementor.e(OpenSkuImplementor.this, true);
            Toast.makeText(OpenSkuImplementor.g(OpenSkuImplementor.this), b5m.H().localizedString(R.string.tt_detail_app_busy_system_tired), 0).show();
            OpenSkuImplementor.k(OpenSkuImplementor.this).t();
            OpenSkuImplementor.k(OpenSkuImplementor.this).u();
        }

        @Override // tb.ctd
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            tgh.b("OpenSkuImplementor", "拉起sku添加流式listener, 回调成功");
            OpenSkuImplementor.e(OpenSkuImplementor.this, true);
            OpenSkuImplementor.f(OpenSkuImplementor.this, this.f6819a, jSONObject, false);
        }
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null) {
            return false;
        }
        if (!hjh.c()) {
            hjh.d(true);
            return true;
        }
        JSONObject a2 = irVar.a();
        String i = i(a2);
        String str = (String) this.d.i().c("requestItemId");
        String o = o(a2);
        boolean z = !TextUtils.isEmpty(o) && !TextUtils.equals(o, str);
        boolean z2 = !z && !vbl.H0() && DataUtils.j0((Feature) this.d.e().f(Feature.class));
        if (!z2 || !TextUtils.isEmpty(o)) {
            str = o;
        }
        if (z || z2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizName", (Object) "minidetail");
            JSONObject n = n(a2);
            if (n != null) {
                jSONObject.putAll(n);
            }
            HashMap hashMap = new HashMap(3);
            hashMap.put("itemId", str);
            hashMap.put("sourceType", m(i));
            hashMap.put("exParams", jSONObject);
            b5m.U().a("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "cart", hashMap, new a("msoa.taobao.detail.showsku", "2.0"));
            return true;
        }
        if ("ADDCART_AND_BUYNOW".equalsIgnoreCase(i)) {
            this.d.i().f("skuClickTime", String.valueOf(System.currentTimeMillis()));
            this.d.i().f("skuClickTimeType", SkuLogUtils.P_SKUBAR_BTN_CLICK);
        }
        b bVar = new b(irVar);
        this.f = bVar;
        if (this.d.e().n(this.f)) {
            tgh.b("OpenSkuImplementor", "拉起sku流式listener已经存在监听");
            return false;
        }
        this.b = false;
        if (this.d.e().h() == 3) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("itemId", this.d.i().c("requestItemId"));
            bw7.b(hashMap2, -300013, "拉起sku流式回调失败重发请求");
            this.h.a();
            tgh.b("OpenSkuImplementor", "拉起sku流式二段数据异常，重发请求");
        }
        this.d.e().i(bVar);
        if (!this.b) {
            l(irVar, null, true);
            if (this.g == null) {
                this.g = new AnonymousClass4(bVar);
            }
            this.e.J(this.g);
        } else {
            this.e.J(null);
        }
        tgh.b("OpenSkuImplementor", "拉起sku execute finish, with dataReadyState: " + this.b);
        return true;
    }
}
