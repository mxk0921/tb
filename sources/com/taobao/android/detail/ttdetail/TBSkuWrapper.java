package com.taobao.android.detail.ttdetail;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.DetailAdjustModel;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.taobao.R;
import com.ut.device.UTDevice;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a58;
import tb.axo;
import tb.b8n;
import tb.bo4;
import tb.bvk;
import tb.bw7;
import tb.ens;
import tb.h0c;
import tb.jmb;
import tb.jns;
import tb.kns;
import tb.o6x;
import tb.on4;
import tb.p2q;
import tb.q2q;
import tb.q84;
import tb.r3q;
import tb.t2o;
import tb.tgh;
import tb.txl;
import tb.uug;
import tb.vbl;
import tb.viq;
import tb.vkb;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TBSkuWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BOTTOM_MODE_ADDCART = "ADDCART";
    public static final String BOTTOM_MODE_ADDCART_AND_BUYNOW = "ADDCART_AND_BUYNOW";
    public static final String BOTTOM_MODE_BUYNOW = "BUYNOW";
    public static final String BOTTOM_MODE_CONFIRM = "CONFIRM";
    public static final List<String> r = new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper.1
        {
            add("BUYNOW");
            add("ADDCART");
            add("CONFIRM");
            add("ADDCART_AND_BUYNOW");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Context f6611a;
    public final ze7 b;
    public TBXSkuCore c;
    public final String d;
    public on4 e;
    public JSONObject f;
    public ens g;
    public volatile boolean h;
    public final String i;
    public final String j;
    public final String k;
    public int l;
    public vkb m;
    public String n;
    public final List<vkb> s = new ArrayList();
    public final b8n o = new b8n();
    public final jmb p = new a();
    public final AliXSkuCore.j q = new b();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.TBSkuWrapper$11  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class AnonymousClass11 extends JSONObject {
        public final /* synthetic */ String val$bottomMode;
        public final /* synthetic */ boolean val$isDonate;
        public final /* synthetic */ String val$skuId;

        public AnonymousClass11(String str, boolean z, String str2) {
            this.val$bottomMode = str;
            this.val$isDonate = z;
            this.val$skuId = str2;
            putAll(TBSkuWrapper.U(TBSkuWrapper.this, str, z));
            if (!TextUtils.isEmpty(str2)) {
                put("id_biz_property", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper.11.1
                    {
                        put(q2q.KEY_SKU_ID, (Object) AnonymousClass11.this.val$skuId);
                    }
                });
            }
            put("storedData", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper.11.2
                {
                    put("transparent_map", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper.11.2.1
                        {
                            put("addCartSource", (Object) TBSkuWrapper.c(TBSkuWrapper.this).b());
                        }
                    });
                }
            });
            String d = TBSkuWrapper.d(TBSkuWrapper.this);
            if (!TextUtils.isEmpty(d)) {
                put("quantity", (Object) d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements jmb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public Rect a() {
            Activity activity;
            View findViewById;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("4e47e46f", new Object[]{this});
            }
            if (!(TBSkuWrapper.a(TBSkuWrapper.this) instanceof Activity) || (findViewById = (activity = (Activity) TBSkuWrapper.a(TBSkuWrapper.this)).findViewById(R.id.tt_detail_cart_item)) == null) {
                return null;
            }
            Boolean bool = (Boolean) q84.g(TBSkuWrapper.a(TBSkuWrapper.this), TBSkuWrapper.b(TBSkuWrapper.this));
            if (bool != null && bool.booleanValue()) {
                return null;
            }
            int[] iArr = new int[2];
            findViewById.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            return new Rect(axo.b(activity, i), axo.b(activity, i2), axo.b(activity, findViewById.getWidth() + i), axo.b(activity, findViewById.getHeight() + i2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements AliXSkuCore.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
        @Override // com.taobao.android.sku.AliXSkuCore.j
        public void a(Map<String, String> map, int i, String str) {
            IpChange ipChange = $ipChange;
            HashMap hashMap = map;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e09bd96c", new Object[]{this, map, new Integer(i), str});
                return;
            }
            if (map == null) {
                hashMap = new HashMap();
            }
            hashMap.put("openFrom", "pagedetail");
            hashMap.put("detailFrom", TBSkuWrapper.g(TBSkuWrapper.this).i().c("detailFrom"));
            hashMap.put("itemId", TBSkuWrapper.g(TBSkuWrapper.this).i().c("requestItemId"));
            hashMap.put("utdid", UTDevice.getUtdid(TBSkuWrapper.g(TBSkuWrapper.this).c()));
            bw7.b(hashMap, i, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements on4.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.on4.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a167bb9d", new Object[]{this, str, str2});
                return;
            }
            List a2 = str2 != null ? uug.a(str2.split(";")) : null;
            TBSkuWrapper tBSkuWrapper = TBSkuWrapper.this;
            Map.Entry k = TBSkuWrapper.k(tBSkuWrapper, a2, TBSkuWrapper.h(tBSkuWrapper), TBSkuWrapper.i(TBSkuWrapper.this));
            if (k != null) {
                TBSkuWrapper.g(TBSkuWrapper.this).i().f("price_model", k.getKey());
                String str3 = (String) k.getValue();
                if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                    str2 = str3;
                }
                TBSkuWrapper.g(TBSkuWrapper.this).i().f("propPath", str2);
                return;
            }
            TBSkuWrapper.g(TBSkuWrapper.this).i().f("propPath", str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements vkb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.vkb
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2df2da85", new Object[]{this, jSONObject});
                return;
            }
            if (TBSkuWrapper.o(TBSkuWrapper.this) != null) {
                TBSkuWrapper.o(TBSkuWrapper.this).a(jSONObject);
            }
            for (vkb vkbVar : TBSkuWrapper.T(TBSkuWrapper.this)) {
                vkbVar.a(jSONObject);
            }
        }
    }

    static {
        t2o.a(912261122);
    }

    public TBSkuWrapper(Context context, ze7 ze7Var, String str, String str2, String str3) {
        this.f6611a = context;
        this.b = ze7Var;
        this.d = ze7Var.i().b();
        this.i = str;
        this.j = str2 == null ? "" : str2;
        this.k = str3 == null ? "" : str3;
        F();
        this.e.d("propPath", new c());
        ze7Var.i().e("propPath", new d());
    }

    public static String A(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25c55fae", new Object[]{str, new Boolean(z), new Boolean(z2)});
        }
        return "";
    }

    public static /* synthetic */ List T(TBSkuWrapper tBSkuWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4f06b97c", new Object[]{tBSkuWrapper});
        }
        return tBSkuWrapper.s;
    }

    public static /* synthetic */ JSONObject U(TBSkuWrapper tBSkuWrapper, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bb36dce0", new Object[]{tBSkuWrapper, str, new Boolean(z)});
        }
        return tBSkuWrapper.x(str, z);
    }

    public static /* synthetic */ Context a(TBSkuWrapper tBSkuWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a38946b", new Object[]{tBSkuWrapper});
        }
        return tBSkuWrapper.f6611a;
    }

    public static /* synthetic */ b8n b(TBSkuWrapper tBSkuWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8n) ipChange.ipc$dispatch("f8a465af", new Object[]{tBSkuWrapper});
        }
        return tBSkuWrapper.o;
    }

    public static /* synthetic */ ens c(TBSkuWrapper tBSkuWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ens) ipChange.ipc$dispatch("7a8fb7e7", new Object[]{tBSkuWrapper});
        }
        return tBSkuWrapper.g;
    }

    public static /* synthetic */ String d(TBSkuWrapper tBSkuWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5f5f6fd", new Object[]{tBSkuWrapper});
        }
        return tBSkuWrapper.y();
    }

    public static /* synthetic */ String e(TBSkuWrapper tBSkuWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d01ddfe", new Object[]{tBSkuWrapper});
        }
        return tBSkuWrapper.i;
    }

    public static /* synthetic */ int f(TBSkuWrapper tBSkuWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c60c430", new Object[]{tBSkuWrapper})).intValue();
        }
        int i = tBSkuWrapper.l + 1;
        tBSkuWrapper.l = i;
        return i;
    }

    public static /* synthetic */ ze7 g(TBSkuWrapper tBSkuWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("cba5e1e9", new Object[]{tBSkuWrapper});
        }
        return tBSkuWrapper.b;
    }

    public static /* synthetic */ JSONArray h(TBSkuWrapper tBSkuWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("c0d9a12e", new Object[]{tBSkuWrapper});
        }
        return tBSkuWrapper.w();
    }

    public static /* synthetic */ boolean i(TBSkuWrapper tBSkuWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6cce9f3", new Object[]{tBSkuWrapper})).booleanValue();
        }
        return tBSkuWrapper.h;
    }

    public static /* synthetic */ boolean j(TBSkuWrapper tBSkuWrapper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4579b14b", new Object[]{tBSkuWrapper, new Boolean(z)})).booleanValue();
        }
        tBSkuWrapper.h = z;
        return z;
    }

    public static /* synthetic */ Map.Entry k(TBSkuWrapper tBSkuWrapper, List list, JSONArray jSONArray, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map.Entry) ipChange.ipc$dispatch("d3b59214", new Object[]{tBSkuWrapper, list, jSONArray, new Boolean(z)});
        }
        return tBSkuWrapper.v(list, jSONArray, z);
    }

    public static /* synthetic */ on4 l(TBSkuWrapper tBSkuWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (on4) ipChange.ipc$dispatch("f8d41b4b", new Object[]{tBSkuWrapper});
        }
        return tBSkuWrapper.e;
    }

    public static /* synthetic */ String m(TBSkuWrapper tBSkuWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b19ac00", new Object[]{tBSkuWrapper});
        }
        return tBSkuWrapper.j;
    }

    public static /* synthetic */ String n(TBSkuWrapper tBSkuWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2259301", new Object[]{tBSkuWrapper});
        }
        return tBSkuWrapper.k;
    }

    public static /* synthetic */ vkb o(TBSkuWrapper tBSkuWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vkb) ipChange.ipc$dispatch("4d711234", new Object[]{tBSkuWrapper});
        }
        return tBSkuWrapper.m;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ec5ff65", new Object[]{this})).booleanValue();
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null || tBXSkuCore.x()) {
            return false;
        }
        return true;
    }

    public final boolean D(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8327207b", new Object[]{this, list, str})).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return TextUtils.isEmpty(str);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            sb.append(";");
            sb.append(str2);
        }
        return TextUtils.equals(str, sb.deleteCharAt(0).toString());
    }

    public final boolean E(List<String> list, List<String> list2) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("923b811a", new Object[]{this, list, list2})).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (list2 == null || list2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return true;
        }
        if (z || z2) {
            return false;
        }
        for (String str : list) {
            if (!bo4.a(str, list2)) {
                return false;
            }
        }
        return true;
    }

    public final on4 F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (on4) ipChange.ipc$dispatch("9632239f", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new on4();
            TBXSkuCore tBXSkuCore = this.c;
            if (tBXSkuCore != null && !tBXSkuCore.x()) {
                this.c.q().y0(this.e);
            }
        }
        return this.e;
    }

    public void G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8c38e", new Object[]{this, str});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null) {
            tBXSkuCore.K(new JSONObject(str) { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper.10
                public final /* synthetic */ String val$bottomMode;

                {
                    this.val$bottomMode = str;
                    putAll(TBSkuWrapper.U(TBSkuWrapper.this, str, false));
                }
            });
            this.c.B();
        }
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2666408", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null) {
            tBXSkuCore.C();
        }
    }

    public void I(vkb vkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b921c82a", new Object[]{this, vkbVar});
        } else {
            this.m = vkbVar;
        }
    }

    public void J(AliXSkuCore.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b076c0e1", new Object[]{this, mVar});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null) {
            tBXSkuCore.q().w0(mVar);
        }
    }

    public void K(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("128d9f3c", new Object[]{this, jSONObject});
        } else {
            this.f = jSONObject;
        }
    }

    public void L(ens ensVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f1fea8", new Object[]{this, ensVar});
        } else {
            this.g = ensVar;
        }
    }

    public void M(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855e236f", new Object[]{this, str, str2, str3, new Boolean(z)});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null && !tBXSkuCore.x()) {
            txl.h().q("beforeWeexInitInShow", "afterMtop");
            this.c.K(new AnonymousClass11(str, z, str2));
            this.c.F("userBehaviorData", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper.12
                {
                    put("UniqueId", (Object) TBSkuWrapper.e(TBSkuWrapper.this));
                    put("SKULayerId", (Object) String.valueOf(TBSkuWrapper.f(TBSkuWrapper.this)));
                    put("ubfKey", (Object) TBSkuWrapper.m(TBSkuWrapper.this));
                    put("ubfPageKey", (Object) TBSkuWrapper.n(TBSkuWrapper.this));
                }
            });
            S(str);
            if (!TextUtils.isEmpty(str3)) {
                this.c.S(str3);
            } else {
                this.c.O();
            }
            if (this.f == null) {
                txl.h().q("showToUpdate", "afterMtop");
            }
        }
    }

    public synchronized void N(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a785b1", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null) {
            tBXSkuCore.W(jSONObject, z);
        }
    }

    public synchronized void O(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8785121d", new Object[]{this, str, new Boolean(z)});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null) {
            tBXSkuCore.Z(str, z);
        }
    }

    public void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f748278d", new Object[]{this, str});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null) {
            tBXSkuCore.a0(str);
        }
    }

    public void Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5307bb", new Object[]{this, str});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null) {
            tBXSkuCore.c0(str);
        }
    }

    public void R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d15190", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void V(vkb vkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853eaa90", new Object[]{this, vkbVar});
        } else if (vkbVar != null) {
            ((ArrayList) this.s).add(vkbVar);
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827b6981", new Object[]{this, str});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null && !tBXSkuCore.x()) {
            this.c.l(str);
        }
    }

    public void r() {
        on4 J;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513f00f5", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null && !tBXSkuCore.x() && (J = this.c.q().J()) != null) {
            J.a();
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        o6x.b(this.b.i().b());
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null) {
            tBXSkuCore.m();
            this.c = null;
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null) {
            tBXSkuCore.o();
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4354413a", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null) {
            tBXSkuCore.q().p();
        }
    }

    public final JSONArray w() {
        DetailAdjustModel detailAdjustModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("3a8f4c0a", new Object[]{this});
        }
        jns jnsVar = (jns) this.b.e().e(kns.PARSER_ID);
        if (jnsVar == null || !r3q.f((Feature) jnsVar.t(Feature.class)) || (detailAdjustModel = (DetailAdjustModel) jnsVar.t(DetailAdjustModel.class)) == null) {
            return null;
        }
        return detailAdjustModel.getAdjustModel();
    }

    public final JSONObject x(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a06eacb", new Object[]{this, str, new Boolean(z)});
        }
        if (!((ArrayList) r).contains(str)) {
            str = "ADDCART_AND_BUYNOW";
        }
        if (z) {
            str = "BUYNOW";
        }
        return new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper.9
            {
                put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper.9.1
                    {
                        put("bottomMode", (Object) str);
                        if ("ADDCART".equals(str)) {
                            put("addCartText", "确认");
                        } else if (!"BUYNOW".equals(str)) {
                        } else {
                            if (z) {
                                put("buyNowText", "我要捐赠");
                            } else {
                                put("buyNowText", "确认");
                            }
                        }
                    }
                });
            }
        };
    }

    public final String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2be78798", new Object[]{this});
        }
        try {
            Long.parseLong(this.n);
        } catch (Exception unused) {
            this.n = "";
        }
        return this.n;
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73468c7f", new Object[]{this})).intValue();
        }
        return this.l;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements bvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.bvk
        public void a(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8705021", new Object[]{this, obj, obj2});
                return;
            }
            String obj3 = obj2 == null ? null : obj2.toString();
            TBSkuWrapper.j(TBSkuWrapper.this, true);
            TBSkuWrapper.l(TBSkuWrapper.this).e("propPath", obj3);
            TBSkuWrapper.j(TBSkuWrapper.this, false);
        }
    }

    public synchronized void C() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86cfa529", new Object[]{this});
            return;
        }
        if (this.c == null) {
            final long currentTimeMillis = System.currentTimeMillis();
            TBXSkuCore tBXSkuCore = new TBXSkuCore(this.f6611a, this.d);
            this.c = tBXSkuCore;
            tBXSkuCore.L(new e());
            this.c.q().o0(this.p);
            this.c.q().v0(this.q);
            this.c.q().y0(this.e);
            this.c.H(this.g.a());
            this.c.J(new h0c() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.h0c
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a97b7546", new Object[]{this, str});
                    } else {
                        Toast.makeText(TBSkuWrapper.a(TBSkuWrapper.this), p2q.SKU_MSG_JS_CRASHED, 1).show();
                    }
                }
            });
            if (vbl.u0()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sDisableCopySkuData))) {
                    jSONObject = DynamicMergeUtils.j(this.f);
                } else {
                    jSONObject = a58.e(this.f);
                }
                txl.h().d("transJsonInInitSku", "beforeMtop", currentTimeMillis2, System.currentTimeMillis(), null);
                this.c.s(jSONObject);
            } else {
                TBXSkuCore tBXSkuCore2 = this.c;
                JSONObject jSONObject2 = this.f;
                tBXSkuCore2.t(jSONObject2 != null ? JSON.toJSONString(jSONObject2, SerializerFeature.DisableCircularReferenceDetect) : null);
            }
            this.c.M(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper.8
                {
                    put("skuTimeStamp", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper.8.1
                        {
                            put(SkuLogUtils.P_SKU_INIT, (Object) (currentTimeMillis + ""));
                        }
                    });
                }
            });
        }
    }

    public final void S(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5e8691", new Object[]{this, str});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null) {
            try {
                JSONObject jSONObject = tBXSkuCore.q().z().e().getJSONObject("skuTimeStamp");
                if (jSONObject != null) {
                    jSONObject.put(SkuLogUtils.P_CART_BTN_CLICK, (Object) "");
                    jSONObject.put(SkuLogUtils.P_BUY_BTN_CLICK, (Object) "");
                    jSONObject.put(SkuLogUtils.P_SKUBAR_BTN_CLICK, (Object) "");
                    viq i = this.b.i();
                    String str2 = (String) i.c("skuClickTimeType");
                    String str3 = (String) i.c("skuClickTime");
                    String str4 = (String) i.c("skuClearPreloadWeexOnUpdate");
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        jSONObject.put(str2, (Object) str3);
                        if (this.f != null) {
                            z = false;
                        }
                        jSONObject.put("isMtopEmpty", (Object) Boolean.valueOf(z));
                        if (z) {
                            if ("BUYNOW".equals(str)) {
                                jSONObject.put("buyNowMtopEmpty", (Object) Boolean.TRUE);
                            } else {
                                jSONObject.put("addCartMtopEmpty", (Object) Boolean.TRUE);
                            }
                        }
                    }
                    jSONObject.put("isClearPreloadWeexOnUpdate", (Object) str4);
                    jSONObject.put("startDetailTimeStamp", i.c("startDetailTimeStamp"));
                    jSONObject.put("isAutoOpenSku", i.c("isAutoOpenSku"));
                    i.f("skuClickTimeType", "");
                    i.f("skuClickTime", "");
                    i.f("skuClearPreloadWeexOnUpdate", "");
                }
            } catch (Throwable th) {
                tgh.c("TBSkuWrapper", "updateTimeData exception:", th);
            }
        }
    }

    public boolean q() {
        JSONObject e2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("795a9fee", new Object[]{this})).booleanValue();
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null || tBXSkuCore.x() || (e2 = this.c.q().z().e()) == null || (jSONObject = e2.getJSONObject("id_biz_property")) == null) {
            return false;
        }
        jSONObject.remove(q2q.KEY_SKU_ID);
        this.c.K(e2);
        return true;
    }

    public final Map.Entry<String, String> v(List<String> list, JSONArray jSONArray, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map.Entry) ipChange.ipc$dispatch("5fa273d7", new Object[]{this, list, jSONArray, new Boolean(z)});
        }
        if (jSONArray != null && !jSONArray.isEmpty()) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string = jSONObject.getString("propPath");
                    if (!TextUtils.isEmpty(string)) {
                        List<String> asList = Arrays.asList(string.split(";"));
                        if (z) {
                            if (E(list, asList)) {
                                return new AbstractMap.SimpleEntry(jSONObject.toJSONString(), string);
                            }
                        } else if (D(list, string)) {
                            return new AbstractMap.SimpleEntry(jSONObject.toJSONString(), string);
                        }
                    } else if (list == null || list.isEmpty()) {
                        return new AbstractMap.SimpleEntry(jSONObject.toJSONString(), string);
                    }
                }
            }
        }
        return null;
    }
}
