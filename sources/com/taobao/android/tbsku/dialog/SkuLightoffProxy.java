package com.taobao.android.tbsku.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffFloatModel;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffItemModel;
import com.taobao.android.detail.core.standard.widget.lightoff.vm.PictureViewModel;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.gkc;
import tb.mog;
import tb.mop;
import tb.n4v;
import tb.o2q;
import tb.oog;
import tb.pb6;
import tb.pr0;
import tb.q2q;
import tb.t2o;
import tb.ybl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SkuLightoffProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FROM_SKU_HEAD = "skuHead";
    public static final String FROM_SKU_PROP = "skuProp";

    /* renamed from: a  reason: collision with root package name */
    public final Context f9586a;
    public final AliXSkuCore b;
    public final pr0 c;
    public final oog d;
    public mog e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public String i;
    public int j;
    public JSONObject k;
    public LightOffFloatModel m;
    public long n;
    public boolean o;
    public int p;
    public boolean q;
    public JSONObject r;
    public JSONObject s;
    public final gkc u;
    public final Map<String, JSONObject> l = new HashMap();
    public final Handler t = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/dialog/SkuLightoffProxy$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 4097) {
                Object obj = message.obj;
                if ((obj instanceof Integer) && ((Integer) obj).intValue() == SkuLightoffProxy.a(SkuLightoffProxy.this) && SkuLightoffProxy.c(SkuLightoffProxy.this).g != null && SkuLightoffProxy.n(SkuLightoffProxy.this) != null) {
                    JSONObject jSONObject = SkuLightoffProxy.n(SkuLightoffProxy.this).data;
                    if (jSONObject.getJSONObject("fields") != null && "true".equals(jSONObject.getJSONObject("fields").getString("loading")) && SkuLightoffProxy.o(SkuLightoffProxy.this) != null) {
                        jSONObject.getJSONObject("fields").put("visible", (Object) "false");
                        SkuLightoffProxy.o(SkuLightoffProxy.this).k(SkuLightoffProxy.n(SkuLightoffProxy.this));
                        AdapterForTLog.loge("[XLightOff]", "loading timeout:" + SkuLightoffProxy.n(SkuLightoffProxy.this).data.toJSONString());
                        HashMap hashMap = new HashMap();
                        hashMap.put(q2q.KEY_SKU_ID, SkuLightoffProxy.p(SkuLightoffProxy.this));
                        SkuLightoffProxy.r(SkuLightoffProxy.this, 2101, "skuBottomTimeout", null, null, hashMap);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements AliXSkuCore.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f54e513e", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (SkuLightoffProxy.o(SkuLightoffProxy.this).h() != null && SkuLightoffProxy.o(SkuLightoffProxy.this).h().isShowing() && ybl.a()) {
                SkuLightoffProxy.o(SkuLightoffProxy.this).g(true);
            }
        }
    }

    static {
        t2o.a(785383504);
    }

    public static boolean G(String str, String str2) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("604ada92", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || "0".equals(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
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
        return str2.contains(str);
    }

    public static /* synthetic */ int a(SkuLightoffProxy skuLightoffProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("899c19ed", new Object[]{skuLightoffProxy})).intValue();
        }
        return skuLightoffProxy.j;
    }

    public static /* synthetic */ int b(SkuLightoffProxy skuLightoffProxy, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac543dfa", new Object[]{skuLightoffProxy, new Integer(i)})).intValue();
        }
        skuLightoffProxy.j = i;
        return i;
    }

    public static /* synthetic */ mog c(SkuLightoffProxy skuLightoffProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mog) ipChange.ipc$dispatch("a3500354", new Object[]{skuLightoffProxy});
        }
        return skuLightoffProxy.e;
    }

    public static /* synthetic */ String d(SkuLightoffProxy skuLightoffProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9eb1657", new Object[]{skuLightoffProxy});
        }
        return skuLightoffProxy.g;
    }

    public static /* synthetic */ pr0 e(SkuLightoffProxy skuLightoffProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pr0) ipChange.ipc$dispatch("207b5d65", new Object[]{skuLightoffProxy});
        }
        return skuLightoffProxy.c;
    }

    public static /* synthetic */ JSONObject f(SkuLightoffProxy skuLightoffProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8e5c8e8b", new Object[]{skuLightoffProxy});
        }
        return skuLightoffProxy.k;
    }

    public static /* synthetic */ JSONObject g(SkuLightoffProxy skuLightoffProxy, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e15651c3", new Object[]{skuLightoffProxy, jSONObject});
        }
        skuLightoffProxy.k = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void h(SkuLightoffProxy skuLightoffProxy, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d43da004", new Object[]{skuLightoffProxy, jSONObject});
        } else {
            skuLightoffProxy.P(jSONObject);
        }
    }

    public static /* synthetic */ boolean i(SkuLightoffProxy skuLightoffProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed166171", new Object[]{skuLightoffProxy})).booleanValue();
        }
        return skuLightoffProxy.q;
    }

    public static /* synthetic */ int j(SkuLightoffProxy skuLightoffProxy, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea9f14ab", new Object[]{skuLightoffProxy, str})).intValue();
        }
        return skuLightoffProxy.Q(str);
    }

    public static /* synthetic */ void k(SkuLightoffProxy skuLightoffProxy, JSONObject jSONObject, int i, pr0 pr0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b811b49", new Object[]{skuLightoffProxy, jSONObject, new Integer(i), pr0Var});
        } else {
            skuLightoffProxy.M(jSONObject, i, pr0Var);
        }
    }

    public static /* synthetic */ void l(SkuLightoffProxy skuLightoffProxy, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51fb6a3a", new Object[]{skuLightoffProxy, str});
        } else {
            skuLightoffProxy.J(str);
        }
    }

    public static /* synthetic */ void m(SkuLightoffProxy skuLightoffProxy, JSONObject jSONObject, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f550e932", new Object[]{skuLightoffProxy, jSONObject, objArr});
        } else {
            skuLightoffProxy.L(jSONObject, objArr);
        }
    }

    public static /* synthetic */ LightOffFloatModel n(SkuLightoffProxy skuLightoffProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LightOffFloatModel) ipChange.ipc$dispatch("acd678e5", new Object[]{skuLightoffProxy});
        }
        return skuLightoffProxy.m;
    }

    public static /* synthetic */ oog o(SkuLightoffProxy skuLightoffProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oog) ipChange.ipc$dispatch("d3590117", new Object[]{skuLightoffProxy});
        }
        return skuLightoffProxy.d;
    }

    public static /* synthetic */ String p(SkuLightoffProxy skuLightoffProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a6db262", new Object[]{skuLightoffProxy});
        }
        return skuLightoffProxy.i;
    }

    public static /* synthetic */ String q(SkuLightoffProxy skuLightoffProxy, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1069f96", new Object[]{skuLightoffProxy, str});
        }
        skuLightoffProxy.i = str;
        return str;
    }

    public static /* synthetic */ void r(SkuLightoffProxy skuLightoffProxy, int i, String str, Object obj, Object obj2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28811c5f", new Object[]{skuLightoffProxy, new Integer(i), str, obj, obj2, map});
        } else {
            skuLightoffProxy.S(i, str, obj, obj2, map);
        }
    }

    public static /* synthetic */ void s(SkuLightoffProxy skuLightoffProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b145000", new Object[]{skuLightoffProxy});
        } else {
            skuLightoffProxy.K();
        }
    }

    public static /* synthetic */ long t(SkuLightoffProxy skuLightoffProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90a858f5", new Object[]{skuLightoffProxy})).longValue();
        }
        return skuLightoffProxy.n;
    }

    public static /* synthetic */ long u(SkuLightoffProxy skuLightoffProxy, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86cfe395", new Object[]{skuLightoffProxy, new Long(j)})).longValue();
        }
        skuLightoffProxy.n = j;
        return j;
    }

    public static /* synthetic */ boolean v(SkuLightoffProxy skuLightoffProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b63c6206", new Object[]{skuLightoffProxy})).booleanValue();
        }
        return skuLightoffProxy.o;
    }

    public static /* synthetic */ boolean w(SkuLightoffProxy skuLightoffProxy, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13bd36d4", new Object[]{skuLightoffProxy, new Boolean(z)})).booleanValue();
        }
        skuLightoffProxy.o = z;
        return z;
    }

    public static /* synthetic */ int x(SkuLightoffProxy skuLightoffProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbd06af6", new Object[]{skuLightoffProxy})).intValue();
        }
        return skuLightoffProxy.p;
    }

    public static /* synthetic */ int y(SkuLightoffProxy skuLightoffProxy, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0aa0e11", new Object[]{skuLightoffProxy, new Integer(i)})).intValue();
        }
        skuLightoffProxy.p = i;
        return i;
    }

    public static /* synthetic */ int z(SkuLightoffProxy skuLightoffProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("267314fe", new Object[]{skuLightoffProxy})).intValue();
        }
        int i = skuLightoffProxy.p;
        skuLightoffProxy.p = 1 + i;
        return i;
    }

    public final JSONObject C(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2d18fde9", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(mop.KEY_HEADER_EXPANDED, (Object) "false");
        jSONObject3.put("visible", (Object) "true");
        jSONObject3.put("loading", (Object) "false");
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("title", (Object) jSONObject.getString("desc"));
        jSONObject3.put("skuText", (Object) jSONObject4);
        if (this.q) {
            jSONObject3.put("skuBar", (Object) this.r);
        }
        jSONObject2.put("fields", (Object) jSONObject3);
        jSONObject2.put("events", this.s);
        return jSONObject2;
    }

    public final JSONObject D(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a63b25b5", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject(jSONObject);
        jSONObject3.put(mop.KEY_HEADER_EXPANDED, (Object) "false");
        jSONObject3.put("visible", (Object) "true");
        jSONObject3.put("loading", (Object) "false");
        if (this.q) {
            jSONObject3.put("skuBar", (Object) this.r);
        }
        jSONObject2.put("fields", (Object) jSONObject3);
        jSONObject2.put("events", (Object) this.s);
        return jSONObject2;
    }

    public final JSONObject H(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3c3b2817", new Object[]{this, jSONObject, jSONObject2});
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (!jSONObject2.containsKey(str)) {
                jSONObject2.put(str, obj);
            } else if (obj instanceof JSONObject) {
                jSONObject2.put(str, (Object) H((JSONObject) obj, jSONObject2.getJSONObject(str)));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i = 0; i < jSONArray.size(); i++) {
                    jSONObject2.getJSONArray(str).set(i, H((JSONObject) jSONArray.get(i), (JSONObject) jSONObject2.getJSONArray(str).get(i)));
                }
            } else {
                jSONObject2.put(str, obj);
            }
        }
        return jSONObject2;
    }

    public final void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850888c9", new Object[]{this, str});
            return;
        }
        AdapterForTLog.logd("[XLightOff]", "postLightOffActionMessage:" + str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("from", (Object) "lightOff");
        jSONObject.put("actionName", (Object) str);
        this.b.Z(new JSONObject(jSONObject) { // from class: com.taobao.android.tbsku.dialog.SkuLightoffProxy.5
            public final /* synthetic */ JSONObject val$params;

            {
                this.val$params = jSONObject;
                put("action", "dark_curtain_sku_action");
                put("params", (Object) jSONObject);
            }
        });
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbbf74f", new Object[]{this});
            return;
        }
        AdapterForTLog.logd("[XLightOff]", "postLightOffCloseMessage");
        this.b.Z(new JSONObject() { // from class: com.taobao.android.tbsku.dialog.SkuLightoffProxy.4
            {
                put("action", "dart_curtain_close");
            }
        });
    }

    public final void M(JSONObject jSONObject, int i, pr0 pr0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd47312", new Object[]{this, jSONObject, new Integer(i), pr0Var});
        } else if (jSONObject != null && !jSONObject.isEmpty() && pr0Var != null) {
            AdapterForTLog.loge("[XLightOff]", "sendChangePropEvent:" + jSONObject.toString());
            String string = jSONObject.getString("viewId");
            if (!TextUtils.isEmpty(string)) {
                pr0Var.b().put(string, Integer.valueOf((int) (((i / 6) * 348.5f) - 1.0f)));
            }
            this.b.Z(new JSONObject(jSONObject) { // from class: com.taobao.android.tbsku.dialog.SkuLightoffProxy.6
                public final /* synthetic */ JSONObject val$selected;

                {
                    this.val$selected = jSONObject;
                    put("action", "pv_sku_update");
                    put("params", (Object) jSONObject);
                }
            });
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            this.d.j(this.e);
        }
    }

    public final void P(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72372687", new Object[]{this, jSONObject});
            return;
        }
        this.t.removeMessages(4097);
        if (((ArrayList) this.e.g).size() == 0) {
            AdapterForTLog.loge("[XLightOff]", "updateSelectedFloatData no float template");
        } else if (this.f || !FROM_SKU_HEAD.equals(this.e.b) || TextUtils.isEmpty(this.i) || "0".equals(this.i)) {
            this.m.data = C(jSONObject);
            AdapterForTLog.loge("[XLightOff]", "updateSelectedFloatData show prop" + this.m.data.toJSONString());
        } else {
            this.m.data = B(jSONObject);
            if (this.t.hasMessages(4097)) {
                AdapterForTLog.loge("[XLightOff]", "updateSelectedFloatData has loading msg");
            }
            Handler handler = this.t;
            handler.sendMessageDelayed(Message.obtain(handler, 4097, Integer.valueOf(this.j)), this.m.loadTimeOut);
            AdapterForTLog.loge("[XLightOff]", "updateSelectedFloatData show loading:" + this.m.data.toJSONString());
        }
    }

    public final void R(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde7f15b", new Object[]{this, jSONObject});
        } else if (((ArrayList) this.e.g).size() == 0 || jSONObject == null) {
            AdapterForTLog.loge("[XLightOff]", "updateSkuDataChange no data");
        } else if (FROM_SKU_HEAD.equals(this.e.b) && FROM_SKU_HEAD.equals(jSONObject.getString("from"))) {
            boolean c2 = o2q.c("enableFixIndexOutCrash");
            if (!c2) {
                jSONObject2 = H(D(jSONObject), (JSONObject) ((HashMap) this.l).get(this.i));
                ((HashMap) this.l).put(this.i, (JSONObject) jSONObject2.clone());
            } else {
                jSONObject2 = null;
            }
            if (!TextUtils.isEmpty(this.i) && this.i.equals(jSONObject.getString(q2q.KEY_SKU_ID)) && !"0".equals(this.i)) {
                if (c2) {
                    jSONObject2 = H(D(jSONObject), (JSONObject) ((HashMap) this.l).get(this.i));
                    ((HashMap) this.l).put(this.i, (JSONObject) jSONObject2.clone());
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("fields");
                if (jSONObject3 == null || jSONObject3.get("buttons") == null || jSONObject3.get("price") == null) {
                    AdapterForTLog.loge("[XLightOff]", "updateSkuDataChange not show sku, data not impletement:" + this.m.data.toJSONString());
                    return;
                }
                this.t.removeMessages(4097);
                this.m.data = jSONObject2;
                AdapterForTLog.loge("[XLightOff]", "updateSkuDataChange show sku:" + this.m.data.toJSONString());
                this.d.k(this.m);
            }
        }
    }

    public final void S(int i, String str, Object obj, Object obj2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f3b66a", new Object[]{this, new Integer(i), str, obj, obj2, map});
        } else if (!TextUtils.isEmpty(this.g)) {
            n4v.a(i, str, obj, obj2, map);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements gkc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.gkc
        public void b(JSONObject jSONObject, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4350dfe3", new Object[]{this, jSONObject, new Integer(i)});
                return;
            }
            AdapterForTLog.loge("[XLightOff]", "onPageSelected:" + i);
            if (jSONObject != null) {
                SkuLightoffProxy.z(SkuLightoffProxy.this);
                SkuLightoffProxy.q(SkuLightoffProxy.this, jSONObject.getString(q2q.KEY_SKU_ID));
                SkuLightoffProxy.b(SkuLightoffProxy.this, i);
                SkuLightoffProxy.g(SkuLightoffProxy.this, jSONObject);
                SkuLightoffProxy skuLightoffProxy = SkuLightoffProxy.this;
                SkuLightoffProxy.h(skuLightoffProxy, SkuLightoffProxy.f(skuLightoffProxy));
                if (SkuLightoffProxy.f(SkuLightoffProxy.this) != null && SkuLightoffProxy.i(SkuLightoffProxy.this)) {
                    SkuLightoffProxy.j(SkuLightoffProxy.this, SkuLightoffProxy.f(SkuLightoffProxy.this).getString("propPath"));
                }
                SkuLightoffProxy.o(SkuLightoffProxy.this).k(SkuLightoffProxy.n(SkuLightoffProxy.this));
            }
        }

        @Override // tb.gkc
        public void d(JSONObject jSONObject, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8442a7ff", new Object[]{this, jSONObject, view});
            } else {
                SkuLightoffProxy.o(SkuLightoffProxy.this).g(false);
            }
        }

        @Override // tb.gkc
        public void e(JSONObject jSONObject, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c310536", new Object[]{this, jSONObject, view});
            } else if (SkuLightoffProxy.e(SkuLightoffProxy.this) == null) {
                AdapterForTLog.loge("[share]SKULightOff", "onLongClick:feedback null");
            } else {
                AdapterForTLog.loge("[share]SKULightOff", "onLongClick:" + jSONObject.toString());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("actionFrom", (Object) "IMG_PREVIEW_LONG_CLK");
                jSONObject2.put("image", (Object) jSONObject);
                jSONObject2.put("dialog", (Object) SkuLightoffProxy.o(SkuLightoffProxy.this).h());
                SkuLightoffProxy.e(SkuLightoffProxy.this).h(jSONObject2);
            }
        }

        @Override // tb.gkc
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                return;
            }
            SkuLightoffProxy.s(SkuLightoffProxy.this);
            HashMap hashMap = new HashMap();
            hashMap.put("stayTime", String.valueOf(System.currentTimeMillis() - SkuLightoffProxy.t(SkuLightoffProxy.this)));
            hashMap.put("closeByBottomBar", String.valueOf(SkuLightoffProxy.v(SkuLightoffProxy.this)));
            hashMap.put("scanPicCount", String.valueOf(SkuLightoffProxy.x(SkuLightoffProxy.this)));
            SkuLightoffProxy.r(SkuLightoffProxy.this, 2101, "leaveSkuLightOff", null, null, hashMap);
        }

        @Override // tb.gkc
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.gkc
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            } else if (f == 0.0f && i == SkuLightoffProxy.a(SkuLightoffProxy.this)) {
                SkuLightoffProxy skuLightoffProxy = SkuLightoffProxy.this;
                SkuLightoffProxy.k(skuLightoffProxy, SkuLightoffProxy.f(skuLightoffProxy), SkuLightoffProxy.a(SkuLightoffProxy.this), SkuLightoffProxy.e(SkuLightoffProxy.this));
            }
        }

        @Override // tb.gkc
        public void c(Object[] objArr) {
            Object obj;
            JSONArray jSONArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1b144db", new Object[]{this, objArr});
            } else if (objArr.length >= 1 && (obj = objArr[0]) != null && !"noAction".equals(obj)) {
                if (objArr.length == 1) {
                    SkuLightoffProxy.w(SkuLightoffProxy.this, true);
                    SkuLightoffProxy.o(SkuLightoffProxy.this).g(true);
                    SkuLightoffProxy.l(SkuLightoffProxy.this, String.valueOf(objArr[0]));
                    return;
                }
                try {
                    jSONArray = JSON.parseArray(String.valueOf(objArr[0]));
                } catch (Exception e) {
                    AdapterForTLog.loge("[XLightOff]", "actionJSONArray parse exception: ", e);
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        SkuLightoffProxy.m(SkuLightoffProxy.this, jSONArray.getJSONObject(i), objArr);
                    }
                    if ("true".equals(String.valueOf(objArr[1]))) {
                        SkuLightoffProxy.w(SkuLightoffProxy.this, true);
                        SkuLightoffProxy.o(SkuLightoffProxy.this).g(true);
                    }
                }
            }
        }

        @Override // tb.gkc
        public void onShow(DialogInterface dialogInterface) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d64de6c3", new Object[]{this, dialogInterface});
                return;
            }
            SkuLightoffProxy.u(SkuLightoffProxy.this, System.currentTimeMillis());
            SkuLightoffProxy.w(SkuLightoffProxy.this, false);
            SkuLightoffProxy.y(SkuLightoffProxy.this, 1);
            HashMap hashMap = new HashMap();
            hashMap.put("bottomMode", SkuLightoffProxy.d(SkuLightoffProxy.this));
            hashMap.put("from", SkuLightoffProxy.c(SkuLightoffProxy.this).b);
            if (TextUtils.isEmpty(SkuLightoffProxy.p(SkuLightoffProxy.this))) {
                str = "false";
            } else {
                str = "true";
            }
            hashMap.put("hasSkuId", str);
            SkuLightoffProxy.r(SkuLightoffProxy.this, 2101, "enterSkuLightOff", null, null, hashMap);
        }
    }

    public SkuLightoffProxy(Context context, String str, JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, String str2, String str3, pr0 pr0Var, boolean z) {
        this.f = false;
        c cVar = new c();
        this.f9586a = context;
        AliXSkuCore c2 = pr0Var.c();
        this.b = c2;
        this.c = pr0Var;
        oog oogVar = new oog();
        this.d = oogVar;
        oogVar.f(cVar);
        this.f = "true".equalsIgnoreCase(str2);
        this.g = str3;
        this.h = z;
        F(str, jSONObject, jSONArray, jSONArray2, jSONArray3);
        c2.u0(new b());
    }

    public void I(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a028b3f0", new Object[]{this, jSONObject});
            return;
        }
        StringBuilder sb = new StringBuilder("onSKUActionCallback:");
        if (jSONObject == null) {
            str = "null";
        } else {
            str = jSONObject.toString();
        }
        sb.append(str);
        AdapterForTLog.loge("[XLightOff]", sb.toString());
        if (jSONObject == null || !FROM_SKU_HEAD.equals(jSONObject.getString("from"))) {
            AdapterForTLog.loge("[XLightOff]", "onSKUActionCallback params not from lightOff:" + jSONObject.getString("from"));
        } else if (TextUtils.isEmpty(jSONObject.getString(q2q.KEY_SKU_ID))) {
            AdapterForTLog.loge("[XLightOff]", "onSKUActionCallback params no skuId");
        } else if (!"bottomInfo".equals(jSONObject.getString("type"))) {
            AdapterForTLog.loge("[XLightOff]", "onSKUActionCallback type not bottomInfo");
        } else {
            try {
                R(jSONObject);
            } catch (Exception e) {
                AdapterForTLog.loge("[XLightOff]", "updateSkuDataChange exception close lightOff,exception:" + e);
                if (this.d.h() != null && this.d.h().isShowing()) {
                    this.d.g(true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(com.alibaba.fastjson.JSONObject r9, com.alibaba.fastjson.JSONArray r10) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbsku.dialog.SkuLightoffProxy.A(com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONArray):void");
    }

    public final JSONObject B(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("efbf3a76", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = (JSONObject) ((HashMap) this.l).get(this.i);
        if (jSONObject3 == null || jSONObject3.get("fields") == null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(mop.KEY_HEADER_EXPANDED, (Object) "false");
            jSONObject4.put("visible", (Object) "true");
            jSONObject4.put("loading", (Object) "true");
            if (this.q) {
                jSONObject4.put("skuBar", (Object) this.r);
            }
            jSONObject2.put("fields", (Object) jSONObject4);
            jSONObject2.put("events", (Object) this.s);
            return jSONObject2;
        }
        JSONObject jSONObject5 = jSONObject3.getJSONObject("fields");
        jSONObject5.put("price", (Object) null);
        jSONObject5.put("subPrice", (Object) null);
        JSONArray jSONArray = jSONObject5.getJSONArray("buttons");
        if (jSONArray != null && jSONArray.size() > 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject6 = jSONArray.getJSONObject(i);
                if (jSONObject6 != null) {
                    jSONObject6.put("enableClick", (Object) "false");
                }
            }
        }
        return jSONObject3;
    }

    public final int E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87e01891", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        ArrayList arrayList = (ArrayList) this.e.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = ((LightOffItemModel) arrayList.get(i)).originData;
            if (jSONObject != null && G(str, jSONObject.getString("propPath"))) {
                return i;
            }
        }
        return 0;
    }

    public final void N(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ea68c6", new Object[]{this, jSONArray, str});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            this.r = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            int i = -1;
            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (jSONObject != null) {
                    String string = jSONObject.getString("propPath");
                    String string2 = jSONObject.getString("url");
                    boolean G = G(string, str);
                    if ("0".equals(string)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("isSelected", (Object) String.valueOf(G));
                        jSONObject2.put("url", (Object) string2);
                        this.r.put("mainImage", (Object) jSONObject2);
                    } else {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("img", (Object) string2);
                        jSONObject3.put("isSelected", (Object) String.valueOf(G));
                        jSONObject3.put("propPath", (Object) string);
                        jSONArray2.add(jSONObject3);
                    }
                    if (G) {
                        i = i2;
                    }
                }
            }
            this.r.put("skuContents", (Object) jSONArray2);
            this.r.put(mop.KEY_SELECTED_INDEX, (Object) String.valueOf(Math.max(i - 1, 0)));
        }
    }

    public final int Q(String str) {
        JSONArray jSONArray;
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5758ad24", new Object[]{this, str})).intValue();
        }
        JSONObject jSONObject = this.r;
        if (jSONObject == null || jSONObject.isEmpty() || (jSONArray = this.r.getJSONArray("skuContents")) == null || jSONArray.isEmpty()) {
            return -1;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArray.size(); i3++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
            if (jSONObject2 != null) {
                if (i2 == -1 && Boolean.parseBoolean(jSONObject2.getString("isSelected"))) {
                    i2 = i3;
                }
                if (G(jSONObject2.getString("propPath"), str)) {
                    jSONObject2.put("isSelected", (Object) Boolean.TRUE.toString());
                    i = i3;
                } else {
                    jSONObject2.put("isSelected", (Object) Boolean.FALSE.toString());
                }
            }
        }
        this.r.put(mop.KEY_SELECTED_INDEX, (Object) String.valueOf(Math.max(i, 0)));
        JSONObject jSONObject3 = this.r.getJSONObject("mainImage");
        if (jSONObject3 != null) {
            if (i != -1) {
                bool = Boolean.FALSE;
            } else {
                bool = Boolean.TRUE;
            }
            jSONObject3.put("isSelected", (Object) bool.toString());
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r3.equals("userTrack") == false) goto L_0x002f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(com.alibaba.fastjson.JSONObject r12, java.lang.Object[] r13) {
        /*
            r11 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.tbsku.dialog.SkuLightoffProxy.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "b66a0fcd"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r11
            r5[r0] = r12
            r5[r1] = r13
            r3.ipc$dispatch(r4, r5)
            return
        L_0x0018:
            if (r12 != 0) goto L_0x001b
            return
        L_0x001b:
            java.lang.String r3 = "type"
            java.lang.String r3 = r12.getString(r3)
            r3.hashCode()
            java.lang.String r4 = "[XLightOff]"
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case -2095663441: goto L_0x0046;
                case 329301056: goto L_0x003c;
                case 651883004: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            r0 = -1
            goto L_0x0051
        L_0x0031:
            java.lang.String r0 = "change_sku_frame"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x003a
            goto L_0x002f
        L_0x003a:
            r0 = 2
            goto L_0x0051
        L_0x003c:
            java.lang.String r6 = "userTrack"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x0051
            goto L_0x002f
        L_0x0046:
            java.lang.String r0 = "switch_main_pic"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0050
            goto L_0x002f
        L_0x0050:
            r0 = 0
        L_0x0051:
            switch(r0) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x0090;
                case 2: goto L_0x0069;
                default: goto L_0x0054;
            }
        L_0x0054:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "onFloatClickEvent no handle action:"
            r12.<init>(r0)
            r13 = r13[r2]
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.taobao.tlog.adapter.AdapterForTLog.loge(r4, r12)
            goto L_0x00d9
        L_0x0069:
            int r12 = r13.length
            if (r12 > r1) goto L_0x0073
            java.lang.String r12 = "onFloatClickEvent change_sku_frame args.length <= 2"
            com.taobao.tlog.adapter.AdapterForTLog.loge(r4, r12)
            return
        L_0x0073:
            r12 = r13[r1]
            java.lang.String r12 = java.lang.String.valueOf(r12)
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 == 0) goto L_0x0086
            java.lang.String r12 = "onFloatClickEvent change_sku_frame targetPropPath empty"
            com.taobao.tlog.adapter.AdapterForTLog.loge(r4, r12)
            return
        L_0x0086:
            tb.oog r13 = r11.d
            int r12 = r11.E(r12)
            r13.i(r12)
            goto L_0x00d9
        L_0x0090:
            java.lang.String r13 = "fields"
            com.alibaba.fastjson.JSONObject r12 = r12.getJSONObject(r13)
            if (r12 != 0) goto L_0x009f
            java.lang.String r12 = "onFloatClickEvent fields empty"
            com.taobao.tlog.adapter.AdapterForTLog.loge(r4, r12)
            return
        L_0x009f:
            java.lang.String r13 = "eventId"
            java.lang.Integer r13 = r12.getInteger(r13)     // Catch: Exception -> 0x00c6
            int r6 = r13.intValue()     // Catch: Exception -> 0x00c6
            java.lang.String r13 = "arg1"
            java.lang.String r7 = r12.getString(r13)     // Catch: Exception -> 0x00c6
            java.lang.String r13 = "arg2"
            java.lang.String r8 = r12.getString(r13)     // Catch: Exception -> 0x00c6
            java.lang.String r13 = "arg3"
            java.lang.String r9 = r12.getString(r13)     // Catch: Exception -> 0x00c6
            java.lang.String r13 = "args"
            com.alibaba.fastjson.JSONObject r10 = r12.getJSONObject(r13)     // Catch: Exception -> 0x00c6
            r5 = r11
            r5.S(r6, r7, r8, r9, r10)     // Catch: Exception -> 0x00c6
            goto L_0x00d9
        L_0x00c6:
            r12 = move-exception
            java.lang.String r13 = "onFloatClickEvent user track parse exception"
            com.taobao.tlog.adapter.AdapterForTLog.loge(r4, r13, r12)
            goto L_0x00d9
        L_0x00ce:
            tb.oog r12 = r11.d
            java.lang.String r13 = "0"
            int r13 = r11.E(r13)
            r12.i(r13)
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbsku.dialog.SkuLightoffProxy.L(com.alibaba.fastjson.JSONObject, java.lang.Object[]):void");
    }

    public final void F(String str, JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cde79b71", new Object[]{this, str, jSONObject, jSONArray, jSONArray2, jSONArray3});
            return;
        }
        StringBuilder sb = new StringBuilder("LightOffPresenter show entryModel:");
        sb.append(str);
        sb.append(", clickImgRect:");
        if (jSONArray3 != null) {
            str2 = jSONArray3.toJSONString();
        } else {
            str2 = "null";
        }
        sb.append(str2);
        sb.append(", mSkuForceDisplayProp:");
        sb.append(this.f);
        AdapterForTLog.logd("[XLightOff]", sb.toString());
        if (!(jSONArray == null || jSONArray.size() == 0)) {
            mog mogVar = new mog();
            this.e = mogVar;
            mogVar.f24181a = this.f9586a;
            mogVar.b = str;
            mogVar.e = new ArrayList();
            if (jSONObject != null) {
                str3 = jSONObject.getString("path");
                this.i = jSONObject.getString(q2q.KEY_SKU_ID);
            } else {
                str3 = null;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("url");
                String string2 = jSONObject2.getString("path");
                if (!TextUtils.isEmpty(string)) {
                    if (string2.equals(str3)) {
                        mog mogVar2 = this.e;
                        mogVar2.f = i;
                        mogVar2.d = string;
                    }
                    LightOffItemModel lightOffItemModel = new LightOffItemModel();
                    lightOffItemModel.type = PictureViewModel.TYPE;
                    lightOffItemModel.url = string;
                    lightOffItemModel.originData = jSONObject2;
                    ((ArrayList) this.e.e).add(lightOffItemModel);
                }
            }
            if (jSONArray3 != null && jSONArray3.size() == 4) {
                this.e.c = new Rect(pb6.f(this.f9586a, jSONArray3.getInteger(0).intValue()), pb6.f(this.f9586a, jSONArray3.getInteger(1).intValue()), pb6.f(this.f9586a, jSONArray3.getInteger(2).intValue()), pb6.f(this.f9586a, jSONArray3.getInteger(3).intValue()));
            }
            A(jSONObject, jSONArray2);
        }
    }
}
